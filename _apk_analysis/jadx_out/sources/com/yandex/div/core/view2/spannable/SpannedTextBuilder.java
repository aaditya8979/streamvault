package com.yandex.div.core.view2.spannable;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.BitmapDrawable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.StrikethroughSpan;
import android.text.style.UnderlineSpan;
import android.util.DisplayMetrics;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.core.view.ViewCompat;
import bn.r;
import cn.a0;
import cn.f0;
import cn.v0;
import cn.w;
import com.yandex.div.core.DivIdLoggingImageDownloadCallback;
import com.yandex.div.core.actions.DivActionTypedUtilsKt;
import com.yandex.div.core.font.DivTypefaceProvider;
import com.yandex.div.core.images.CachedBitmap;
import com.yandex.div.core.images.DivImageLoader;
import com.yandex.div.core.util.DivUtilKt;
import com.yandex.div.core.util.text.DivBackgroundSpan;
import com.yandex.div.core.util.text.DivTextRangesBackgroundHelper;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivTypefaceResolver;
import com.yandex.div.core.view2.DivTypefaceResolverKt;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.core.view2.divs.TextViewExtensionsKt;
import com.yandex.div.core.view2.divs.widgets.DivLineHeightTextView;
import com.yandex.div.core.view2.divs.widgets.DivLineHeightTextViewKt;
import com.yandex.div.core.view2.spannable.MaskData;
import com.yandex.div.core.view2.text.SelectableLinkMovementMethod;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.internal.spannable.LetterSpacingSpan;
import com.yandex.div.internal.spannable.NoStrikethroughSpan;
import com.yandex.div.internal.spannable.NoUnderlineSpan;
import com.yandex.div.internal.spannable.TextColorSpan;
import com.yandex.div.internal.spannable.TypefaceSpan;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivAction;
import com.yandex.div2.DivFontWeight;
import com.yandex.div2.DivLineStyle;
import com.yandex.div2.DivShadow;
import com.yandex.div2.DivSizeUnit;
import com.yandex.div2.DivText;
import com.yandex.div2.DivTextAlignmentVertical;
import com.yandex.div2.DivTextRangeBackground;
import com.yandex.div2.DivTextRangeBorder;
import com.yandex.div2.DivTextRangeMask;
import com.yandex.div2.DivTextRangeMaskParticles;
import com.yandex.div2.DivTextRangeMaskSolid;
import fn.b;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import sn.l;
import tn.i;
import tn.p;
import ym.a;
import zn.n;

/* JADX INFO: compiled from: SpannedTextBuilder.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class SpannedTextBuilder {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private final boolean debugFontMetrics;

    @NotNull
    private final DivImageLoader imageLoader;

    @NotNull
    private final Paint tempPaint = new Paint();

    @NotNull
    private final DivTypefaceResolver typefaceResolver;

    /* JADX INFO: compiled from: SpannedTextBuilder.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: SpannedTextBuilder.kt */
    public static final class ImageDownloadCallbackImpl extends DivIdLoggingImageDownloadCallback {

        @NotNull
        private final BindingContext bindingContext;

        @NotNull
        private final DivText.Image image;

        @NotNull
        private final ImageSpan imageSpan;

        @NotNull
        private final Spanned spannedText;

        @Nullable
        private final l<Spanned, r> textConsumer;

        /* JADX WARN: Multi-variable type inference failed */
        public ImageDownloadCallbackImpl(@NotNull BindingContext bindingContext, @NotNull DivText.Image image, @NotNull ImageSpan imageSpan, @NotNull Spanned spanned, @Nullable l<? super Spanned, r> lVar) {
            super(bindingContext.getDivView());
            this.bindingContext = bindingContext;
            this.image = image;
            this.imageSpan = imageSpan;
            this.spannedText = spanned;
            this.textConsumer = lVar;
        }

        @Override // com.yandex.div.core.images.DivImageDownloadCallback
        public void onSuccess(@NotNull CachedBitmap cachedBitmap) {
            super.onSuccess(cachedBitmap);
            Resources resources = this.bindingContext.getDivView().getResources();
            ExpressionResolver expressionResolver = this.bindingContext.getExpressionResolver();
            Expression<Integer> expression = this.image.f57671g;
            Integer numEvaluate = expression != null ? expression.evaluate(expressionResolver) : null;
            PorterDuff.Mode porterDuffMode = DivUtilKt.toPorterDuffMode(this.image.f57672h.evaluate(expressionResolver));
            BitmapDrawable bitmapDrawable = new BitmapDrawable(resources, cachedBitmap.getBitmap());
            if (numEvaluate != null) {
                bitmapDrawable.setColorFilter(new PorterDuffColorFilter(numEvaluate.intValue(), porterDuffMode));
            }
            this.imageSpan.setImage(bitmapDrawable);
            l<Spanned, r> lVar = this.textConsumer;
            if (lVar != null) {
                lVar.invoke(this.spannedText);
            }
        }
    }

    /* JADX INFO: compiled from: SpannedTextBuilder.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        static {
            int[] iArr = new int[DivText.Image.IndexingDirection.values().length];
            try {
                iArr[DivText.Image.IndexingDirection.NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DivText.Image.IndexingDirection.REVERSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[DivLineStyle.values().length];
            try {
                iArr2[DivLineStyle.SINGLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[DivLineStyle.NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[DivText.Image.Accessibility.Type.values().length];
            try {
                iArr3[DivText.Image.Accessibility.Type.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[DivText.Image.Accessibility.Type.BUTTON.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[DivText.Image.Accessibility.Type.IMAGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[DivText.Image.Accessibility.Type.TEXT.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[DivText.Image.Accessibility.Type.AUTO.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[DivTextAlignmentVertical.values().length];
            try {
                iArr4[DivTextAlignmentVertical.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr4[DivTextAlignmentVertical.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr4[DivTextAlignmentVertical.BASELINE.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr4[DivTextAlignmentVertical.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$3 = iArr4;
        }
    }

    public SpannedTextBuilder(@NotNull DivTypefaceResolver divTypefaceResolver, @NotNull DivImageLoader divImageLoader) {
        this.typefaceResolver = divTypefaceResolver;
        this.imageLoader = divImageLoader;
    }

    private final void addActionSpan(BindingContext bindingContext, TextView textView, Spannable spannable, int i10, int i11, List<DivAction> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        textView.setMovementMethod(SelectableLinkMovementMethod.INSTANCE);
        spannable.setSpan(new PerformActionSpan(bindingContext, list), i10, i11, 33);
        ViewCompat.enableAccessibleClickableSpanSupport(textView);
    }

    private final void addDecorationSpan(BindingContext bindingContext, TextView textView, Spannable spannable, int i10, int i11, DivTextRangeBorder divTextRangeBorder, DivTextRangeBackground divTextRangeBackground) {
        if (divTextRangeBorder == null && divTextRangeBackground == null) {
            return;
        }
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        DivBackgroundSpan divBackgroundSpan = new DivBackgroundSpan(divTextRangeBorder, divTextRangeBackground);
        if (textView instanceof DivLineHeightTextView) {
            DivLineHeightTextView divLineHeightTextView = (DivLineHeightTextView) textView;
            if (DivLineHeightTextViewKt.hasBackgroundSpan(divLineHeightTextView, spannable, divBackgroundSpan, i10, i11, expressionResolver)) {
                return;
            }
            spannable.setSpan(divBackgroundSpan, i10, i11, 33);
            DivTextRangesBackgroundHelper textRoundedBgHelper$div_release = divLineHeightTextView.getTextRoundedBgHelper$div_release();
            if (textRoundedBgHelper$div_release != null) {
                textRoundedBgHelper$div_release.addBackgroundSpan$div_release(divBackgroundSpan);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.yandex.div.core.view2.spannable.ImageSpan addImageSpan(final com.yandex.div.core.view2.BindingContext r18, final android.widget.TextView r19, android.text.Spannable r20, com.yandex.div.core.view2.spannable.TextData r21, com.yandex.div2.DivText.Image r22) {
        /*
            Method dump skipped, instruction units count: 209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.core.view2.spannable.SpannedTextBuilder.addImageSpan(com.yandex.div.core.view2.BindingContext, android.widget.TextView, android.text.Spannable, com.yandex.div.core.view2.spannable.TextData, com.yandex.div2.DivText$Image):com.yandex.div.core.view2.spannable.ImageSpan");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addImageSpan$lambda$22$lambda$21$lambda$20(Div2View div2View, BindingContext bindingContext, TextView textView, List list) {
        div2View.getDiv2Component$div_release().getActionBinder().handleTapClick$div_release(bindingContext, textView, list);
    }

    private final void addSpan(final TextView textView, Spannable spannable, TextData textData, SpanData spanData) {
        int start = spanData.getStart();
        int end = spanData.getEnd();
        if (start > end) {
            return;
        }
        DivTextAlignmentVertical alignmentVertical = spanData.getAlignmentVertical();
        if (alignmentVertical == null) {
            alignmentVertical = DivTextAlignmentVertical.BASELINE;
        }
        int baselineOffset = spanData.getBaselineOffset();
        if (baselineOffset != 0) {
            Integer lineHeight = spanData.getLineHeight();
            spannable.setSpan(new BaselineShiftSpan(baselineOffset, (lineHeight == null && (lineHeight = textData.getLineHeight()) == null) ? 0 : lineHeight.intValue()), start, end, 33);
        } else if (alignmentVertical != DivTextAlignmentVertical.BASELINE) {
            Integer fontSize = spanData.getFontSize();
            spannable.setSpan(new VerticalAlignmentSpan(fontSize != null ? fontSize.intValue() : 0, toTextVerticalAlignment(alignmentVertical), new a() { // from class: ng.b
                @Override // ym.a
                public final Object get() {
                    return textView.getLayout();
                }
            }), start, end, 33);
        }
        Integer fontSize2 = spanData.getFontSize();
        if (fontSize2 != null) {
            int iIntValue = fontSize2.intValue();
            Integer lineHeight2 = spanData.getLineHeight();
            spannable.setSpan(new FontSizeSpan(iIntValue, (lineHeight2 == null && (lineHeight2 = textData.getLineHeight()) == null) ? 0 : lineHeight2.intValue()), start, end, 33);
        }
        String fontFeatureSettings = spanData.getFontFeatureSettings();
        if (fontFeatureSettings != null) {
            spannable.setSpan(new FontFeatureSpan(fontFeatureSettings), start, end, 33);
        }
        Integer textColor = spanData.getTextColor();
        if (textColor != null) {
            spannable.setSpan(new TextColorSpan(textColor.intValue()), start, end, 33);
        }
        Double letterSpacing = spanData.getLetterSpacing();
        if (letterSpacing != null) {
            spannable.setSpan(new LetterSpacingSpan((float) letterSpacing.doubleValue()), start, end, 33);
        }
        DivLineStyle strike = spanData.getStrike();
        if (strike != null) {
            int i10 = WhenMappings.$EnumSwitchMapping$1[strike.ordinal()];
            if (i10 == 1) {
                spannable.setSpan(new StrikethroughSpan(), start, end, 33);
            } else if (i10 == 2) {
                spannable.setSpan(new NoStrikethroughSpan(), start, end, 33);
            }
        }
        DivLineStyle underline = spanData.getUnderline();
        if (underline != null) {
            int i11 = WhenMappings.$EnumSwitchMapping$1[underline.ordinal()];
            if (i11 == 1) {
                spannable.setSpan(new UnderlineSpan(), start, end, 33);
            } else if (i11 == 2) {
                spannable.setSpan(new NoUnderlineSpan(), start, end, 33);
            }
        }
        DivTypefaceResolver divTypefaceResolver = this.typefaceResolver;
        String fontFamily = spanData.getFontFamily();
        if (fontFamily == null) {
            fontFamily = textData.getFontFamily();
        }
        DivTypefaceProvider typefaceProvider = divTypefaceResolver.getTypefaceProvider(fontFamily);
        if (spanData.getFontFamily() != null || spanData.getFontWeight() != null || spanData.getFontWeightValue() != null) {
            spannable.setSpan(new TypefaceSpan(DivTypefaceResolverKt.getTypeface((spanData.getFontWeight() == null && spanData.getFontWeightValue() == null) ? DivTypefaceResolverKt.getTypefaceValue(textData.getFontWeight(), textData.getFontWeightValue()) : DivTypefaceResolverKt.getTypefaceValue(spanData.getFontWeight(), spanData.getFontWeightValue()), typefaceProvider)), start, end, 33);
        }
        if (TextViewExtensionsKt.getSupportFontVariations() && typefaceProvider.isVariable() && (spanData.getFontWeight() != null || spanData.getFontWeightValue() != null || spanData.getFontVariationSettings() != null)) {
            spannable.setSpan(new FontVariationSpan(TextViewExtensionsKt.getFontVariations(spanData.getFontWeight(), spanData.getFontWeightValue(), spanData.getFontVariationSettings())), start, end, 33);
        }
        if (spanData.getLineHeight() != null || spanData.getTopOffset() != null) {
            int i12 = p.f(spanData.getLineHeight(), textData.getLineHeight()) ? 18 : 33;
            Integer topOffset = spanData.getTopOffset();
            int iIntValue2 = topOffset != null ? topOffset.intValue() : 0;
            Integer lineHeight3 = spanData.getLineHeight();
            int iIntValue3 = lineHeight3 != null ? lineHeight3.intValue() : 0;
            Integer topOffsetStart = spanData.getTopOffsetStart();
            int iIntValue4 = topOffsetStart != null ? topOffsetStart.intValue() : start;
            Integer topOffsetEnd = spanData.getTopOffsetEnd();
            spannable.setSpan(new LineHeightWithTopOffsetSpan(iIntValue2, iIntValue3, iIntValue4, topOffsetEnd != null ? topOffsetEnd.intValue() : end), start, end, i12);
        }
        ShadowData textShadow = spanData.getTextShadow();
        if (textShadow != null) {
            spannable.setSpan(new ShadowSpan(textShadow), start, end, 33);
        }
        MaskData mask = spanData.getMask();
        if (mask != null) {
            if (mask instanceof MaskData.Particles) {
                if (((MaskData.Particles) mask).isEnabled()) {
                    spannable.setSpan(new MaskSpan(mask, textView instanceof DivLineHeightTextView ? (DivLineHeightTextView) textView : null), start, end, 33);
                }
            } else if ((mask instanceof MaskData.Solid) && ((MaskData.Solid) mask).isEnabled()) {
                spannable.setSpan(new MaskSpan(mask, textView instanceof DivLineHeightTextView ? (DivLineHeightTextView) textView : null), start, end, 33);
            }
        }
    }

    private final Spanned buildText(BindingContext bindingContext, TextView textView, DivText divText, String str, List<DivText.Range> list, List<DivText.Image> list2, List<DivAction> list3, l<? super Spanned, r> lVar) {
        boolean z10;
        int i10;
        int iJ;
        int i11;
        Context context = textView.getContext();
        Div2View divView = bindingContext.getDivView();
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str.length() == 0 ? "\u200b" : str);
        TextData textDataCreateTextData = createTextData(context, bindingContext, divText, str);
        int textLength = textDataCreateTextData.getTextLength();
        List<SpanData> listPreprocessSpans = preprocessSpans(context, bindingContext, textDataCreateTextData, list);
        List<DivText.Image> listPreprocessImages = preprocessImages(textDataCreateTextData, list2, expressionResolver);
        if (this.debugFontMetrics) {
            spannableStringBuilder.setSpan(new LineMetricsSpan(), 0, spannableStringBuilder.length(), 33);
        }
        DivLineHeightTextView divLineHeightTextView = textView instanceof DivLineHeightTextView ? (DivLineHeightTextView) textView : null;
        if (divLineHeightTextView != null) {
            divLineHeightTextView.clearImageSpans$div_release();
            DivTextRangesBackgroundHelper textRoundedBgHelper$div_release = divLineHeightTextView.getTextRoundedBgHelper$div_release();
            if (textRoundedBgHelper$div_release != null) {
                textRoundedBgHelper$div_release.invalidateSpansCache$div_release();
            }
        }
        Iterator<T> it = listPreprocessSpans.iterator();
        while (it.hasNext()) {
            addSpan(textView, spannableStringBuilder, textDataCreateTextData, (SpanData) it.next());
        }
        if (list == null || list.isEmpty()) {
            z10 = false;
        } else {
            for (DivText.Range range : list) {
                if ((range.f57687a == null && range.f57689c == null && range.f57691e == null) ? false : true) {
                    z10 = true;
                    break;
                }
            }
            z10 = false;
        }
        if (z10 && list != null) {
            for (DivText.Range range2 : list) {
                long jLongValue = range2.f57703q.evaluate(expressionResolver).longValue();
                long j10 = jLongValue >> 31;
                if (j10 == 0 || j10 == -1) {
                    i10 = (int) jLongValue;
                } else {
                    KAssert kAssert = KAssert.INSTANCE;
                    if (Assert.isEnabled()) {
                        Assert.fail("Unable convert '" + jLongValue + "' to Int");
                    }
                    i10 = jLongValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }
                int iJ2 = n.j(i10, textLength);
                Expression<Long> expression = range2.f57692f;
                if (expression != null) {
                    long jLongValue2 = expression.evaluate(expressionResolver).longValue();
                    long j11 = jLongValue2 >> 31;
                    if (j11 == 0 || j11 == -1) {
                        i11 = (int) jLongValue2;
                    } else {
                        KAssert kAssert2 = KAssert.INSTANCE;
                        if (Assert.isEnabled()) {
                            Assert.fail("Unable convert '" + jLongValue2 + "' to Int");
                        }
                        i11 = jLongValue2 <= 0 ? Integer.MIN_VALUE : Integer.MAX_VALUE;
                    }
                    iJ = n.j(i11, textLength);
                } else {
                    iJ = textLength;
                }
                List<DivAction> list4 = range2.f57687a;
                Spannable spannable = spannableStringBuilder;
                int i12 = textLength;
                int i13 = iJ;
                addActionSpan(bindingContext, textView, spannable, iJ2, i13, list4);
                addDecorationSpan(bindingContext, textView, spannable, iJ2, i13, range2.f57691e, range2.f57689c);
                listPreprocessImages = listPreprocessImages;
                spannableStringBuilder = spannableStringBuilder;
                textLength = i12;
                textDataCreateTextData = textDataCreateTextData;
            }
        }
        List<DivText.Image> list5 = listPreprocessImages;
        TextData textData = textDataCreateTextData;
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        addActionSpan(bindingContext, textView, spannableStringBuilder2, 0, spannableStringBuilder2.length(), list3);
        int size = list5.size() - 1;
        if (size >= 0) {
            while (true) {
                int i14 = size - 1;
                List<DivText.Image> list6 = list5;
                DivText.Image image = list6.get(size);
                int iImagePosition = imagePosition(textData.getTextLength(), image, expressionResolver);
                int iImagePosition2 = size > 0 ? imagePosition(textData.getTextLength(), list6.get(size - 1), expressionResolver) : Integer.MIN_VALUE;
                spannableStringBuilder2.insert(iImagePosition, (CharSequence) "#");
                ImageSpan imageSpanAddImageSpan = addImageSpan(bindingContext, textView, spannableStringBuilder2, textData, image);
                boolean z11 = iImagePosition2 + 1 == iImagePosition;
                boolean z12 = iImagePosition > 0 && !bo.a.c(spannableStringBuilder2.charAt(iImagePosition + (-1)));
                if (!z11 && z12) {
                    spannableStringBuilder2.insert(iImagePosition, (CharSequence) "\u2060");
                }
                list5 = list6;
                divView.addLoadReference(this.imageLoader.loadImage(image.f57673i.evaluate(expressionResolver).toString(), new ImageDownloadCallbackImpl(bindingContext, image, imageSpanAddImageSpan, spannableStringBuilder2, lVar)), textView);
                if (i14 < 0) {
                    break;
                }
                size = i14;
            }
        }
        if (lVar != null) {
            lVar.invoke(spannableStringBuilder2);
        }
        return spannableStringBuilder2;
    }

    private final MaskData createMaskData(Context context, BindingContext bindingContext, DivTextRangeMask divTextRangeMask) {
        if (divTextRangeMask == null) {
            return null;
        }
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        if (divTextRangeMask instanceof DivTextRangeMask.b) {
            DivTextRangeMaskParticles divTextRangeMaskParticlesC = ((DivTextRangeMask.b) divTextRangeMask).c();
            long jLongValue = divTextRangeMaskParticlesC.f57824e.f55333b.evaluate(expressionResolver).longValue();
            return new MaskData.Particles(divTextRangeMaskParticlesC.f57820a.evaluate(expressionResolver).intValue(), (float) divTextRangeMaskParticlesC.f57821b.evaluate(expressionResolver).doubleValue(), divTextRangeMaskParticlesC.f57822c.evaluate(expressionResolver).booleanValue(), divTextRangeMaskParticlesC.f57823d.evaluate(expressionResolver).booleanValue(), BaseDivViewExtensionsKt.unitToPxF(Long.valueOf(jLongValue), displayMetrics, divTextRangeMaskParticlesC.f57824e.f55332a.evaluate(expressionResolver)));
        }
        if (!(divTextRangeMask instanceof DivTextRangeMask.c)) {
            throw new NoWhenBranchMatchedException();
        }
        DivTextRangeMaskSolid divTextRangeMaskSolidC = ((DivTextRangeMask.c) divTextRangeMask).c();
        return new MaskData.Solid(divTextRangeMaskSolidC.f57840a.evaluate(expressionResolver).intValue(), divTextRangeMaskSolidC.f57841b.evaluate(expressionResolver).booleanValue());
    }

    private final ShadowData createShadowData(Context context, BindingContext bindingContext, DivShadow divShadow, @ColorInt int i10) {
        if (divShadow == null) {
            return null;
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        float fDpToPxF = BaseDivViewExtensionsKt.dpToPxF(divShadow.f56913b.evaluate(expressionResolver), displayMetrics);
        float px = BaseDivViewExtensionsKt.toPx(divShadow.f56915d.f56563a, displayMetrics, expressionResolver);
        float px2 = BaseDivViewExtensionsKt.toPx(divShadow.f56915d.f56564b, displayMetrics, expressionResolver);
        Paint paint = this.tempPaint;
        paint.setColor(divShadow.f56914c.evaluate(expressionResolver).intValue());
        paint.setAlpha((int) (divShadow.f56912a.evaluate(expressionResolver).doubleValue() * ((double) (i10 >>> 24))));
        return new ShadowData(px, px2, fDpToPxF, paint.getColor());
    }

    private final SpanData createSpanData(Context context, BindingContext bindingContext, TextData textData, DivText.Range range, int i10, int i11) {
        Integer numValueOf;
        Integer numValueOf2;
        Double dValueOf;
        Integer numValueOf3;
        int i12;
        int i13;
        int i14;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        int fontSizeValue = textData.getFontSizeValue();
        Expression<Long> expression = range.f57695i;
        if (expression != null) {
            long jLongValue = expression.evaluate(expressionResolver).longValue();
            long j10 = jLongValue >> 31;
            if (j10 == 0 || j10 == -1) {
                i14 = (int) jLongValue;
            } else {
                KAssert kAssert = KAssert.INSTANCE;
                if (Assert.isEnabled()) {
                    Assert.fail("Unable convert '" + jLongValue + "' to Int");
                }
                i14 = jLongValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            numValueOf = Integer.valueOf(i14);
        } else {
            numValueOf = null;
        }
        DivSizeUnit divSizeUnitEvaluate = range.f57696j.evaluate(expressionResolver);
        Expression<DivTextAlignmentVertical> expression2 = range.f57688b;
        DivTextAlignmentVertical divTextAlignmentVerticalEvaluate = expression2 != null ? expression2.evaluate(expressionResolver) : null;
        int iUnitToPx = BaseDivViewExtensionsKt.unitToPx(range.f57690d.evaluate(expressionResolver), displayMetrics, divSizeUnitEvaluate);
        Expression<String> expression3 = range.f57693g;
        String strEvaluate = expression3 != null ? expression3.evaluate(expressionResolver) : null;
        Expression<String> expression4 = range.f57694h;
        String strEvaluate2 = expression4 != null ? expression4.evaluate(expressionResolver) : null;
        Integer numValueOf4 = numValueOf != null ? Integer.valueOf(BaseDivViewExtensionsKt.unitToPx(numValueOf, displayMetrics, divSizeUnitEvaluate)) : null;
        Expression<DivFontWeight> expression5 = range.f57698l;
        DivFontWeight divFontWeightEvaluate = expression5 != null ? expression5.evaluate(expressionResolver) : null;
        Expression<Long> expression6 = range.f57699m;
        if (expression6 != null) {
            long jLongValue2 = expression6.evaluate(expressionResolver).longValue();
            long j11 = jLongValue2 >> 31;
            if (j11 == 0 || j11 == -1) {
                i13 = (int) jLongValue2;
            } else {
                KAssert kAssert2 = KAssert.INSTANCE;
                if (Assert.isEnabled()) {
                    Assert.fail("Unable convert '" + jLongValue2 + "' to Int");
                }
                i13 = jLongValue2 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            numValueOf2 = Integer.valueOf(i13);
        } else {
            numValueOf2 = null;
        }
        Expression<JSONObject> expression7 = range.f57697k;
        JSONObject jSONObjectEvaluate = expression7 != null ? expression7.evaluate(expressionResolver) : null;
        Expression<Double> expression8 = range.f57700n;
        if (expression8 != null) {
            double dDoubleValue = expression8.evaluate(expressionResolver).doubleValue();
            if (numValueOf != null) {
                fontSizeValue = numValueOf.intValue();
            }
            dValueOf = Double.valueOf(dDoubleValue / ((double) fontSizeValue));
        } else {
            dValueOf = null;
        }
        Expression<Long> expression9 = range.f57701o;
        Integer numValueOf5 = expression9 != null ? Integer.valueOf(BaseDivViewExtensionsKt.unitToPx(Long.valueOf(expression9.evaluate(expressionResolver).longValue()), displayMetrics, divSizeUnitEvaluate)) : null;
        MaskData maskDataCreateMaskData = createMaskData(context, bindingContext, range.f57702p);
        Expression<DivLineStyle> expression10 = range.f57704r;
        DivLineStyle divLineStyleEvaluate = expression10 != null ? expression10.evaluate(expressionResolver) : null;
        Expression<Integer> expression11 = range.f57705s;
        Integer numEvaluate = expression11 != null ? expression11.evaluate(expressionResolver) : null;
        ShadowData shadowDataCreateShadowData = createShadowData(context, bindingContext, range.f57706t, textData.getTextColor());
        Expression<Long> expression12 = range.f57707u;
        if (expression12 != null) {
            long jLongValue3 = expression12.evaluate(expressionResolver).longValue();
            long j12 = jLongValue3 >> 31;
            if (j12 == 0 || j12 == -1) {
                i12 = (int) jLongValue3;
            } else {
                KAssert kAssert3 = KAssert.INSTANCE;
                if (Assert.isEnabled()) {
                    Assert.fail("Unable convert '" + jLongValue3 + "' to Int");
                }
                i12 = jLongValue3 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            numValueOf3 = Integer.valueOf(BaseDivViewExtensionsKt.unitToPx(Integer.valueOf(i12), displayMetrics, divSizeUnitEvaluate));
        } else {
            numValueOf3 = null;
        }
        Integer numValueOf6 = range.f57707u != null ? Integer.valueOf(i10) : null;
        Integer numValueOf7 = range.f57707u != null ? Integer.valueOf(i11) : null;
        Expression<DivLineStyle> expression13 = range.f57708v;
        return new SpanData(i10, i11, divTextAlignmentVerticalEvaluate, iUnitToPx, strEvaluate, strEvaluate2, numValueOf4, divSizeUnitEvaluate, divFontWeightEvaluate, numValueOf2, jSONObjectEvaluate, dValueOf, numValueOf5, maskDataCreateMaskData, divLineStyleEvaluate, numEvaluate, shadowDataCreateShadowData, numValueOf3, numValueOf6, numValueOf7, expression13 != null ? expression13.evaluate(expressionResolver) : null);
    }

    private final TextData createTextData(Context context, BindingContext bindingContext, DivText divText, String str) {
        int i10;
        Integer numValueOf;
        Integer numValueOf2;
        int i11;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        long jLongValue = divText.f57645v.evaluate(expressionResolver).longValue();
        long j10 = jLongValue >> 31;
        int i12 = Integer.MAX_VALUE;
        if (j10 == 0 || j10 == -1) {
            i10 = (int) jLongValue;
        } else {
            KAssert kAssert = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail("Unable convert '" + jLongValue + "' to Int");
            }
            i10 = jLongValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
        int i13 = i10;
        DivSizeUnit divSizeUnitEvaluate = divText.f57646w.evaluate(expressionResolver);
        int iUnitToPx = BaseDivViewExtensionsKt.unitToPx(Integer.valueOf(i13), displayMetrics, divSizeUnitEvaluate);
        Expression<DivFontWeight> expression = divText.f57648y;
        DivFontWeight divFontWeightEvaluate = expression != null ? expression.evaluate(expressionResolver) : null;
        Expression<Long> expression2 = divText.f57649z;
        if (expression2 != null) {
            long jLongValue2 = expression2.evaluate(expressionResolver).longValue();
            long j11 = jLongValue2 >> 31;
            if (j11 == 0 || j11 == -1) {
                i11 = (int) jLongValue2;
            } else {
                KAssert kAssert2 = KAssert.INSTANCE;
                if (Assert.isEnabled()) {
                    Assert.fail("Unable convert '" + jLongValue2 + "' to Int");
                }
                i11 = jLongValue2 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            numValueOf = Integer.valueOf(i11);
        } else {
            numValueOf = null;
        }
        Expression<String> expression3 = divText.f57643t;
        String strEvaluate = expression3 != null ? expression3.evaluate(expressionResolver) : null;
        Expression<Long> expression4 = divText.I;
        if (expression4 != null) {
            long jLongValue3 = expression4.evaluate(expressionResolver).longValue();
            long j12 = jLongValue3 >> 31;
            if (j12 == 0 || j12 == -1) {
                i12 = (int) jLongValue3;
            } else {
                KAssert kAssert3 = KAssert.INSTANCE;
                if (Assert.isEnabled()) {
                    Assert.fail("Unable convert '" + jLongValue3 + "' to Int");
                }
                if (jLongValue3 <= 0) {
                    i12 = Integer.MIN_VALUE;
                }
            }
            numValueOf2 = Integer.valueOf(BaseDivViewExtensionsKt.unitToPx(Integer.valueOf(i12), displayMetrics, divSizeUnitEvaluate));
        } else {
            numValueOf2 = null;
        }
        return new TextData(str, iUnitToPx, i13, divSizeUnitEvaluate, strEvaluate, divFontWeightEvaluate, numValueOf, numValueOf2, divText.Z.evaluate(expressionResolver).intValue());
    }

    private final List<DivAction> getActionsForPosition(BindingContext bindingContext, Spannable spannable, int i10) {
        PerformActionSpan[] performActionSpanArr = (PerformActionSpan[]) spannable.getSpans(i10, i10 + 1, PerformActionSpan.class);
        if (performActionSpanArr.length > 1) {
            DivActionTypedUtilsKt.logWarning(bindingContext.getDivView(), new Throwable("Two or more clickable ranges intersect."));
        }
        PerformActionSpan performActionSpan = (PerformActionSpan) cn.r.X(performActionSpanArr);
        if (performActionSpan != null) {
            return performActionSpan.getActions();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int imagePosition(int i10, DivText.Image image, ExpressionResolver expressionResolver) {
        long jLongValue = image.f57670f.evaluate(expressionResolver).longValue();
        int i11 = WhenMappings.$EnumSwitchMapping$0[image.f57668d.evaluate(expressionResolver).ordinal()];
        if (i11 == 1) {
            long j10 = jLongValue >> 31;
            if (j10 == 0 || j10 == -1) {
                return (int) jLongValue;
            }
            KAssert kAssert = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail("Unable convert '" + jLongValue + "' to Int");
            }
            if (jLongValue > 0) {
                return Integer.MAX_VALUE;
            }
        } else {
            if (i11 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            long j11 = ((long) i10) - jLongValue;
            long j12 = j11 >> 31;
            if (j12 == 0 || j12 == -1) {
                return (int) j11;
            }
            KAssert kAssert2 = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail("Unable convert '" + j11 + "' to Int");
            }
            if (j11 > 0) {
                return Integer.MAX_VALUE;
            }
        }
        return Integer.MIN_VALUE;
    }

    private final List<DivText.Image> preprocessImages(final TextData textData, List<DivText.Image> list, final ExpressionResolver expressionResolver) {
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((DivText.Image) obj).f57670f.evaluate(expressionResolver).longValue() <= ((long) textData.getTextLength())) {
                    arrayList.add(obj);
                }
            }
            List<DivText.Image> listX0 = f0.X0(arrayList, new Comparator() { // from class: com.yandex.div.core.view2.spannable.SpannedTextBuilder$preprocessImages$$inlined$sortedBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t10, T t11) {
                    return b.d(Integer.valueOf(this.this$0.imagePosition(textData.getTextLength(), (DivText.Image) t10, expressionResolver)), Integer.valueOf(this.this$0.imagePosition(textData.getTextLength(), (DivText.Image) t11, expressionResolver)));
                }
            });
            if (listX0 != null) {
                return listX0;
            }
        }
        return w.m();
    }

    private final List<SpanData> preprocessSpans(Context context, BindingContext bindingContext, TextData textData, List<DivText.Range> list) {
        int i10;
        int i11;
        int iJ;
        int i12;
        if (textData.getLineHeight() == null) {
            if (list == null || list.isEmpty()) {
                return w.m();
            }
        }
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        int textLength = textData.getTextLength();
        int size = list != null ? list.size() : 0;
        TreeSet treeSetE = v0.e(new Integer[0]);
        ArrayList arrayList = new ArrayList(size + 1);
        if (list != null) {
            for (DivText.Range range : list) {
                long jLongValue = range.f57703q.evaluate(expressionResolver).longValue();
                long j10 = jLongValue >> 31;
                if (j10 == 0 || j10 == -1) {
                    i11 = (int) jLongValue;
                } else {
                    KAssert kAssert = KAssert.INSTANCE;
                    if (Assert.isEnabled()) {
                        Assert.fail("Unable convert '" + jLongValue + "' to Int");
                    }
                    i11 = jLongValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }
                int iJ2 = n.j(i11, textLength);
                Expression<Long> expression = range.f57692f;
                if (expression != null) {
                    long jLongValue2 = expression.evaluate(expressionResolver).longValue();
                    long j11 = jLongValue2 >> 31;
                    if (j11 == 0 || j11 == -1) {
                        i12 = (int) jLongValue2;
                    } else {
                        KAssert kAssert2 = KAssert.INSTANCE;
                        if (Assert.isEnabled()) {
                            Assert.fail("Unable convert '" + jLongValue2 + "' to Int");
                        }
                        i12 = jLongValue2 <= 0 ? Integer.MIN_VALUE : Integer.MAX_VALUE;
                    }
                    iJ = n.j(i12, textLength);
                } else {
                    iJ = textLength;
                }
                if (iJ2 < iJ) {
                    SpanData spanDataCreateSpanData = createSpanData(context, bindingContext, textData, range, iJ2, iJ);
                    if (!spanDataCreateSpanData.isEmpty()) {
                        treeSetE.add(Integer.valueOf(iJ2));
                        treeSetE.add(Integer.valueOf(iJ));
                        arrayList.add(spanDataCreateSpanData);
                    }
                }
            }
        }
        a0.C(arrayList);
        Integer lineHeight = textData.getLineHeight();
        if (lineHeight != null) {
            int iIntValue = lineHeight.intValue();
            i10 = 0;
            treeSetE.add(0);
            treeSetE.add(Integer.valueOf(textLength));
            arrayList.add(0, SpanData.Companion.lineHeight$div_release(0, textLength, iIntValue));
        } else {
            i10 = 0;
        }
        if (arrayList.isEmpty()) {
            return w.m();
        }
        List listG1 = f0.g1(treeSetE);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int iIntValue2 = ((Number) f0.t0(listG1)).intValue();
        if (listG1.size() == 1) {
            SpanData spanDataEmpty$div_release = SpanData.Companion.empty$div_release(iIntValue2, iIntValue2);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                spanDataEmpty$div_release = spanDataEmpty$div_release.mergeWith((SpanData) it.next(), iIntValue2, iIntValue2);
            }
            arrayList2.add(spanDataEmpty$div_release);
            return arrayList2;
        }
        int size2 = listG1.size();
        int i13 = 1;
        while (i13 < size2) {
            int iIntValue3 = ((Number) listG1.get(i13)).intValue();
            int size3 = arrayList.size();
            for (int i14 = i10; i14 < size3; i14++) {
                SpanData spanData = (SpanData) arrayList.get(i14);
                if (iIntValue3 < spanData.getStart()) {
                    break;
                }
                if (iIntValue3 > spanData.getStart() && iIntValue3 <= spanData.getEnd()) {
                    arrayList3.add(spanData);
                }
            }
            if (!arrayList3.isEmpty()) {
                SpanData spanDataEmpty$div_release2 = SpanData.Companion.empty$div_release(iIntValue2, iIntValue3);
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    spanDataEmpty$div_release2 = spanDataEmpty$div_release2.mergeWith((SpanData) it2.next(), iIntValue2, iIntValue3);
                }
                arrayList2.add(spanDataEmpty$div_release2);
            }
            arrayList3.clear();
            i13++;
            iIntValue2 = iIntValue3;
        }
        return arrayList2;
    }

    private final TextVerticalAlignment toTextVerticalAlignment(DivTextAlignmentVertical divTextAlignmentVertical) {
        int i10 = WhenMappings.$EnumSwitchMapping$3[divTextAlignmentVertical.ordinal()];
        if (i10 == 1) {
            return TextVerticalAlignment.TOP;
        }
        if (i10 == 2) {
            return TextVerticalAlignment.CENTER;
        }
        if (i10 != 3 && i10 == 4) {
            return TextVerticalAlignment.BOTTOM;
        }
        return TextVerticalAlignment.BASELINE;
    }

    @NotNull
    public final Spanned buildEllipsis(@NotNull BindingContext bindingContext, @NotNull TextView textView, @NotNull DivText divText, @NotNull DivText.Ellipsis ellipsis, @Nullable l<? super Spanned, r> lVar) {
        return buildText(bindingContext, textView, divText, ellipsis.f57655d.evaluate(bindingContext.getExpressionResolver()), ellipsis.f57654c, ellipsis.f57653b, ellipsis.f57652a, lVar);
    }

    @NotNull
    public final Spanned buildPlainText(@NotNull BindingContext bindingContext, @NotNull TextView textView, @NotNull DivText divText) {
        return buildText(bindingContext, textView, divText, divText.W.evaluate(bindingContext.getExpressionResolver()), null, null, null, null);
    }

    @NotNull
    public final Spanned buildText(@NotNull BindingContext bindingContext, @NotNull TextView textView, @NotNull DivText divText, @Nullable l<? super Spanned, r> lVar) {
        return buildText(bindingContext, textView, divText, divText.W.evaluate(bindingContext.getExpressionResolver()), divText.Q, divText.F, null, lVar);
    }
}
