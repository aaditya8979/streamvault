package com.yandex.div.core.view2.divs;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.text.Spanned;
import android.text.method.MovementMethod;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewParent;
import android.widget.TextView;
import bn.r;
import bo.d0;
import cn.f0;
import cn.w;
import com.yandex.div.core.Disposable;
import com.yandex.div.core.util.ViewsKt;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivTypefaceResolver;
import com.yandex.div.core.view2.DivViewBinder;
import com.yandex.div.core.view2.divs.widgets.DivLineHeightTextView;
import com.yandex.div.core.view2.spannable.ShadowData;
import com.yandex.div.core.view2.spannable.SpannedTextBuilder;
import com.yandex.div.core.view2.text.SelectableLinkMovementMethod;
import com.yandex.div.core.widget.AdaptiveMaxLines;
import com.yandex.div.core.widget.DivViewWrapper;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.internal.drawable.LinearGradientDrawable;
import com.yandex.div.internal.drawable.RadialGradientDrawable;
import com.yandex.div.internal.graphics.Colormap;
import com.yandex.div.internal.widget.EllipsizedTextView;
import com.yandex.div.internal.widget.TextViewsKt;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionList;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.json.expressions.ExpressionsKt;
import com.yandex.div2.Div;
import com.yandex.div2.DivAlignmentHorizontal;
import com.yandex.div2.DivDimension;
import com.yandex.div2.DivExtension;
import com.yandex.div2.DivFontWeight;
import com.yandex.div2.DivLineStyle;
import com.yandex.div2.DivPoint;
import com.yandex.div2.DivRadialGradient;
import com.yandex.div2.DivRadialGradientCenter;
import com.yandex.div2.DivRadialGradientRadius;
import com.yandex.div2.DivRadialGradientRelativeRadius;
import com.yandex.div2.DivShadow;
import com.yandex.div2.DivSizeUnit;
import com.yandex.div2.DivSolidBackground;
import com.yandex.div2.DivStroke;
import com.yandex.div2.DivText;
import com.yandex.div2.DivTextAlignmentVertical;
import com.yandex.div2.DivTextGradient;
import com.yandex.div2.DivTextRangeBackground;
import com.yandex.div2.DivTextRangeBorder;
import com.yandex.div2.DivTextRangeMask;
import com.yandex.div2.DivTextRangeMaskParticles;
import com.yandex.div2.DivTextRangeMaskSolid;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import sn.l;
import tn.p;

/* JADX INFO: compiled from: DivTextBinder.kt */
/* JADX INFO: loaded from: classes.dex */
public final class DivTextBinder extends DivViewBinder<Div.q, DivText, DivLineHeightTextView> {
    private final boolean isHyphenationEnabled;

    @NotNull
    private final SpannedTextBuilder spannedTextBuilder;

    @NotNull
    private final DivTypefaceResolver typefaceResolver;

    /* JADX INFO: compiled from: DivTextBinder.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        static {
            int[] iArr = new int[DivAlignmentHorizontal.values().length];
            try {
                iArr[DivAlignmentHorizontal.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DivAlignmentHorizontal.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DivAlignmentHorizontal.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DivAlignmentHorizontal.START.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DivAlignmentHorizontal.END.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[DivLineStyle.values().length];
            try {
                iArr2[DivLineStyle.SINGLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[DivLineStyle.NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[DivRadialGradientRelativeRadius.Value.values().length];
            try {
                iArr3[DivRadialGradientRelativeRadius.Value.FARTHEST_CORNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[DivRadialGradientRelativeRadius.Value.NEAREST_CORNER.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[DivRadialGradientRelativeRadius.Value.FARTHEST_SIDE.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[DivRadialGradientRelativeRadius.Value.NEAREST_SIDE.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[DivText.Truncate.values().length];
            try {
                iArr4[DivText.Truncate.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr4[DivText.Truncate.START.ordinal()] = 2;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr4[DivText.Truncate.MIDDLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr4[DivText.Truncate.END.ordinal()] = 4;
            } catch (NoSuchFieldError unused15) {
            }
            $EnumSwitchMapping$3 = iArr4;
        }
    }

    public DivTextBinder(@NotNull DivBaseBinder divBaseBinder, @NotNull DivTypefaceResolver divTypefaceResolver, @NotNull SpannedTextBuilder spannedTextBuilder, boolean z10) {
        super(divBaseBinder);
        this.typefaceResolver = divTypefaceResolver;
        this.spannedTextBuilder = spannedTextBuilder;
        this.isHyphenationEnabled = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void applyEllipsize(com.yandex.div.core.view2.divs.widgets.DivLineHeightTextView r5, com.yandex.div2.DivText r6, com.yandex.div.json.expressions.ExpressionResolver r7) {
        /*
            r4 = this;
            com.yandex.div.json.expressions.Expression<com.yandex.div2.DivText$Truncate> r0 = r6.f57625j0
            java.lang.Object r0 = r0.evaluate(r7)
            com.yandex.div2.DivText$Truncate r0 = (com.yandex.div2.DivText.Truncate) r0
            int[] r1 = com.yandex.div.core.view2.divs.DivTextBinder.WhenMappings.$EnumSwitchMapping$3
            int r2 = r0.ordinal()
            r1 = r1[r2]
            r2 = 1
            if (r1 == r2) goto L2b
            r3 = 2
            if (r1 == r3) goto L28
            r3 = 3
            if (r1 == r3) goto L25
            r3 = 4
            if (r1 != r3) goto L1f
            android.text.TextUtils$TruncateAt r1 = android.text.TextUtils.TruncateAt.END
            goto L2c
        L1f:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        L25:
            android.text.TextUtils$TruncateAt r1 = android.text.TextUtils.TruncateAt.MIDDLE
            goto L2c
        L28:
            android.text.TextUtils$TruncateAt r1 = android.text.TextUtils.TruncateAt.START
            goto L2c
        L2b:
            r1 = 0
        L2c:
            r5.setEllipsisLocation(r1)
            com.yandex.div2.DivText$Truncate r1 = com.yandex.div2.DivText.Truncate.NONE
            r3 = 0
            if (r0 == r1) goto L47
            com.yandex.div.json.expressions.Expression<java.lang.Boolean> r6 = r6.f57622i
            if (r6 == 0) goto L43
            java.lang.Object r6 = r6.evaluate(r7)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            goto L44
        L43:
            r6 = r3
        L44:
            if (r6 == 0) goto L47
            goto L48
        L47:
            r2 = r3
        L48:
            r5.setAutoEllipsize(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.core.view2.divs.DivTextBinder.applyEllipsize(com.yandex.div.core.view2.divs.widgets.DivLineHeightTextView, com.yandex.div2.DivText, com.yandex.div.json.expressions.ExpressionResolver):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyFontFeatureSettings(TextView textView, String str) {
        boolean z10 = false;
        if (str != null && (!d0.u0(str))) {
            z10 = true;
        }
        if (!z10) {
            str = null;
        }
        textView.setFontFeatureSettings(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyHyphenation(TextView textView, String str) {
        if (TextViewsKt.checkHyphenationSupported()) {
            int hyphenationFrequency = textView.getHyphenationFrequency();
            int i10 = 0;
            if (this.isHyphenationEnabled && d0.b0(str, (char) 173, false, 2, null)) {
                i10 = 1;
            }
            if (hyphenationFrequency != i10) {
                textView.setHyphenationFrequency(i10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyLinearTextGradientColor(final TextView textView, final long j10, final Colormap colormap) {
        if (!ViewsKt.isActuallyLaidOut(textView) || textView.isLayoutRequested()) {
            textView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.div.core.view2.divs.DivTextBinder$applyLinearTextGradientColor$$inlined$doOnActualLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(@NotNull View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                    view.removeOnLayoutChangeListener(this);
                    textView.getPaint().setShader(LinearGradientDrawable.Companion.createLinearGradient(j10, colormap.getColors(), colormap.getPositions(), this.getRealTextWidth(textView), (textView.getHeight() - textView.getPaddingBottom()) - textView.getPaddingTop()));
                    textView.invalidate();
                }
            });
        } else {
            textView.getPaint().setShader(LinearGradientDrawable.Companion.createLinearGradient(j10, colormap.getColors(), colormap.getPositions(), getRealTextWidth(textView), (textView.getHeight() - textView.getPaddingBottom()) - textView.getPaddingTop()));
            textView.invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyMaxLines(DivLineHeightTextView divLineHeightTextView, Div2View div2View, Long l10, Long l11) {
        int i10;
        AdaptiveMaxLines adaptiveMaxLines$div_release = divLineHeightTextView.getAdaptiveMaxLines$div_release();
        if (adaptiveMaxLines$div_release != null) {
            adaptiveMaxLines$div_release.reset();
        }
        int i11 = Integer.MIN_VALUE;
        int i12 = Integer.MAX_VALUE;
        if (l10 == null || l11 == null) {
            if (l10 != null) {
                long jLongValue = l10.longValue();
                long j10 = jLongValue >> 31;
                if (j10 == 0 || j10 == -1) {
                    i11 = (int) jLongValue;
                } else {
                    KAssert kAssert = KAssert.INSTANCE;
                    if (Assert.isEnabled()) {
                        Assert.fail("Unable convert '" + jLongValue + "' to Int");
                    }
                    if (jLongValue > 0) {
                        i11 = Integer.MAX_VALUE;
                    }
                }
                i12 = i11;
            }
            divLineHeightTextView.setMaxLines(i12);
            return;
        }
        AdaptiveMaxLines adaptiveMaxLines = new AdaptiveMaxLines(divLineHeightTextView, div2View.getViewComponent$div_release().getDrawingPassOverrideStrategy());
        long jLongValue2 = l10.longValue();
        long j11 = jLongValue2 >> 31;
        if (j11 == 0 || j11 == -1) {
            i10 = (int) jLongValue2;
        } else {
            KAssert kAssert2 = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail("Unable convert '" + jLongValue2 + "' to Int");
            }
            i10 = jLongValue2 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
        long jLongValue3 = l11.longValue();
        long j12 = jLongValue3 >> 31;
        if (j12 == 0 || j12 == -1) {
            i11 = (int) jLongValue3;
        } else {
            KAssert kAssert3 = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail("Unable convert '" + jLongValue3 + "' to Int");
            }
            if (jLongValue3 > 0) {
                i11 = Integer.MAX_VALUE;
            }
        }
        adaptiveMaxLines.apply(new AdaptiveMaxLines.Params(i10, i11));
        divLineHeightTextView.setAdaptiveMaxLines$div_release(adaptiveMaxLines);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyPlainEllipsis(DivLineHeightTextView divLineHeightTextView, String str) {
        if (str == null) {
            str = "…";
        }
        divLineHeightTextView.setEllipsis(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyPlainText(TextView textView, BindingContext bindingContext, DivText divText) {
        textView.setText(this.spannedTextBuilder.buildPlainText(bindingContext, textView, divText));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyRadialTextGradientColor(final TextView textView, final RadialGradientDrawable.Radius radius, final RadialGradientDrawable.Center center, final RadialGradientDrawable.Center center2, final List<Integer> list) {
        if (!ViewsKt.isActuallyLaidOut(textView) || textView.isLayoutRequested()) {
            textView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.div.core.view2.divs.DivTextBinder$applyRadialTextGradientColor$$inlined$doOnActualLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(@NotNull View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                    view.removeOnLayoutChangeListener(this);
                    textView.getPaint().setShader(RadialGradientDrawable.Companion.createRadialGradient(radius, center, center2, f0.f1(list), this.getRealTextWidth(textView), (textView.getHeight() - textView.getPaddingBottom()) - textView.getPaddingTop()));
                    textView.invalidate();
                }
            });
        } else {
            textView.getPaint().setShader(RadialGradientDrawable.Companion.createRadialGradient(radius, center, center2, f0.f1(list), getRealTextWidth(textView), (textView.getHeight() - textView.getPaddingBottom()) - textView.getPaddingTop()));
            textView.invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyRichEllipsis(final EllipsizedTextView ellipsizedTextView, BindingContext bindingContext, DivText divText) {
        DivText.Ellipsis ellipsis = divText.f57636p;
        if (ellipsis == null) {
            ellipsizedTextView.setEllipsis("…");
        } else {
            this.spannedTextBuilder.buildEllipsis(bindingContext, ellipsizedTextView, divText, ellipsis, new l<Spanned, r>() { // from class: com.yandex.div.core.view2.divs.DivTextBinder.applyRichEllipsis.1
                {
                    super(1);
                }

                @Override // sn.l
                public /* bridge */ /* synthetic */ r invoke(Spanned spanned) {
                    invoke2(spanned);
                    return r.f5635a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Spanned spanned) {
                    ellipsizedTextView.setEllipsis(spanned);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyRichText(final TextView textView, BindingContext bindingContext, DivText divText) {
        this.spannedTextBuilder.buildText(bindingContext, textView, divText, new l<Spanned, r>() { // from class: com.yandex.div.core.view2.divs.DivTextBinder.applyRichText.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // sn.l
            public /* bridge */ /* synthetic */ r invoke(Spanned spanned) {
                invoke2(spanned);
                return r.f5635a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Spanned spanned) {
                textView.setText(spanned, TextView.BufferType.NORMAL);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applySelectable(TextView textView, boolean z10) {
        MovementMethod movementMethod = textView.getMovementMethod();
        textView.setTextIsSelectable(z10);
        if (movementMethod instanceof SelectableLinkMovementMethod) {
            textView.setMovementMethod(movementMethod);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyStrikethrough(TextView textView, DivLineStyle divLineStyle) {
        int i10 = WhenMappings.$EnumSwitchMapping$1[divLineStyle.ordinal()];
        if (i10 == 1) {
            textView.setPaintFlags(textView.getPaintFlags() | 16);
        } else {
            if (i10 != 2) {
                return;
            }
            textView.setPaintFlags(textView.getPaintFlags() & (-17));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void applyTextAlignment(android.widget.TextView r4, com.yandex.div2.DivAlignmentHorizontal r5, com.yandex.div2.DivAlignmentVertical r6) {
        /*
            r3 = this;
            int r6 = com.yandex.div.core.util.DivUtilKt.evaluateGravity(r5, r6)
            r4.setGravity(r6)
            int[] r6 = com.yandex.div.core.view2.divs.DivTextBinder.WhenMappings.$EnumSwitchMapping$0
            int r5 = r5.ordinal()
            r5 = r6[r5]
            r6 = 1
            r0 = 6
            r1 = 4
            r2 = 5
            if (r5 == r6) goto L22
            r6 = 2
            if (r5 == r6) goto L20
            r6 = 3
            if (r5 == r6) goto L23
            if (r5 == r1) goto L22
            if (r5 == r2) goto L23
            goto L22
        L20:
            r0 = r1
            goto L23
        L22:
            r0 = r2
        L23:
            r4.setTextAlignment(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.core.view2.divs.DivTextBinder.applyTextAlignment(android.widget.TextView, com.yandex.div2.DivAlignmentHorizontal, com.yandex.div2.DivAlignmentVertical):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyTextColor(TextView textView, int i10, Integer num) {
        int[][] iArr = {new int[]{R.attr.state_focused}, new int[0]};
        int[] iArr2 = new int[2];
        iArr2[0] = num != null ? num.intValue() : i10;
        iArr2[1] = i10;
        textView.setTextColor(new ColorStateList(iArr, iArr2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyTextShadow(TextView textView, ShadowData shadowData) {
        DivViewWrapper divViewWrapper;
        if (shadowData == null) {
            ViewParent parent = textView.getParent();
            divViewWrapper = parent instanceof DivViewWrapper ? (DivViewWrapper) parent : null;
            if (divViewWrapper != null) {
                divViewWrapper.setClipChildren(true);
                divViewWrapper.setClipToPadding(true);
            }
            textView.setClipToOutline(true);
            textView.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            return;
        }
        ViewParent parent2 = textView.getParent();
        divViewWrapper = parent2 instanceof DivViewWrapper ? (DivViewWrapper) parent2 : null;
        if (divViewWrapper != null) {
            divViewWrapper.setClipChildren(false);
            divViewWrapper.setClipToPadding(false);
        }
        textView.setClipToOutline(false);
        textView.setShadowLayer(shadowData.getRadius(), shadowData.getOffsetX(), shadowData.getOffsetY(), shadowData.getColor());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyTightenWidth(DivLineHeightTextView divLineHeightTextView, boolean z10) {
        divLineHeightTextView.setTightenWidth(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyUnderline(TextView textView, DivLineStyle divLineStyle) {
        int i10 = WhenMappings.$EnumSwitchMapping$1[divLineStyle.ordinal()];
        if (i10 == 1) {
            textView.setPaintFlags(textView.getPaintFlags() | 8);
        } else {
            if (i10 != 2) {
                return;
            }
            textView.setPaintFlags(textView.getPaintFlags() & (-9));
        }
    }

    private final void bindEllipsis(DivLineHeightTextView divLineHeightTextView, BindingContext bindingContext, DivText divText, DivText divText2) {
        DivText.Ellipsis ellipsis = divText.f57636p;
        if ((ellipsis != null ? ellipsis.f57654c : null) == null) {
            if ((ellipsis != null ? ellipsis.f57653b : null) == null) {
                if ((ellipsis != null ? ellipsis.f57652a : null) == null) {
                    bindPlainEllipsis(divLineHeightTextView, ellipsis, divText2 != null ? divText2.f57636p : null, bindingContext.getExpressionResolver());
                    return;
                }
            }
        }
        bindRichEllipsis(divLineHeightTextView, bindingContext, divText);
    }

    private final void bindEllipsize(final DivLineHeightTextView divLineHeightTextView, final DivText divText, DivText divText2, final ExpressionResolver expressionResolver) {
        if (ExpressionsKt.equalsToConstant(divText.f57622i, divText2 != null ? divText2.f57622i : null)) {
            if (ExpressionsKt.equalsToConstant(divText.f57625j0, divText2 != null ? divText2.f57625j0 : null)) {
                return;
            }
        }
        applyEllipsize(divLineHeightTextView, divText, expressionResolver);
        if (ExpressionsKt.isConstantOrNull(divText.f57622i) && ExpressionsKt.isConstant(divText.f57625j0)) {
            return;
        }
        l<? super Boolean, r> lVar = new l<Object, r>() { // from class: com.yandex.div.core.view2.divs.DivTextBinder$bindEllipsize$callback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // sn.l
            public /* bridge */ /* synthetic */ r invoke(Object obj) {
                invoke2(obj);
                return r.f5635a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Object obj) {
                this.this$0.applyEllipsize(divLineHeightTextView, divText, expressionResolver);
            }
        };
        Expression<Boolean> expression = divText.f57622i;
        if (expression != null) {
            divLineHeightTextView.addSubscription(expression.observe(expressionResolver, lVar));
        }
        divLineHeightTextView.addSubscription(divText.f57625j0.observe(expressionResolver, lVar));
    }

    private final void bindFontFeatureSettings(final DivLineHeightTextView divLineHeightTextView, final DivText divText, DivText divText2, final ExpressionResolver expressionResolver) {
        if (ExpressionsKt.equalsToConstant(divText.f57644u, divText2 != null ? divText2.f57644u : null)) {
            return;
        }
        Expression<String> expression = divText.f57644u;
        applyFontFeatureSettings(divLineHeightTextView, expression != null ? expression.evaluate(expressionResolver) : null);
        if (ExpressionsKt.isConstantOrNull(divText.f57644u)) {
            return;
        }
        l<? super String, r> lVar = new l<Object, r>() { // from class: com.yandex.div.core.view2.divs.DivTextBinder$bindFontFeatureSettings$callback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // sn.l
            public /* bridge */ /* synthetic */ r invoke(Object obj) {
                invoke2(obj);
                return r.f5635a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Object obj) {
                DivTextBinder divTextBinder = this.this$0;
                DivLineHeightTextView divLineHeightTextView2 = divLineHeightTextView;
                Expression<String> expression2 = divText.f57644u;
                divTextBinder.applyFontFeatureSettings(divLineHeightTextView2, expression2 != null ? expression2.evaluate(expressionResolver) : null);
            }
        };
        Expression<String> expression2 = divText.f57644u;
        divLineHeightTextView.addSubscription(expression2 != null ? expression2.observe(expressionResolver, lVar) : null);
    }

    private final void bindFontSize(DivLineHeightTextView divLineHeightTextView, DivText divText, DivText divText2, ExpressionResolver expressionResolver) {
        TextViewExtensionsKt.observeFontSize(divLineHeightTextView, divText.f57645v, divText.f57646w, divText2 != null ? divText2.f57645v : null, divText2 != null ? divText2.f57646w : null, expressionResolver, divLineHeightTextView);
    }

    private final void bindLetterSpacing(DivLineHeightTextView divLineHeightTextView, DivText divText, DivText divText2, ExpressionResolver expressionResolver) {
        TextViewExtensionsKt.observeLetterSpacing(divLineHeightTextView, divText.H, divText.f57645v, divText2 != null ? divText2.H : null, divText2 != null ? divText2.f57645v : null, expressionResolver, divLineHeightTextView);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x006c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00bd A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void bindLinearTextGradient(final com.yandex.div.core.view2.divs.widgets.DivLineHeightTextView r9, final com.yandex.div.core.view2.Div2View r10, final com.yandex.div2.DivLinearGradient r11, com.yandex.div2.DivTextGradient r12, final com.yandex.div.json.expressions.ExpressionResolver r13) {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.core.view2.divs.DivTextBinder.bindLinearTextGradient(com.yandex.div.core.view2.divs.widgets.DivLineHeightTextView, com.yandex.div.core.view2.Div2View, com.yandex.div2.DivLinearGradient, com.yandex.div2.DivTextGradient, com.yandex.div.json.expressions.ExpressionResolver):void");
    }

    private final void bindMaxLines(final DivLineHeightTextView divLineHeightTextView, final BindingContext bindingContext, final DivText divText, DivText divText2, final ExpressionResolver expressionResolver) {
        if (ExpressionsKt.equalsToConstant(divText.L, divText2 != null ? divText2.L : null)) {
            if (ExpressionsKt.equalsToConstant(divText.M, divText2 != null ? divText2.M : null)) {
                return;
            }
        }
        Div2View divView = bindingContext.getDivView();
        Expression<Long> expression = divText.L;
        Long lEvaluate = expression != null ? expression.evaluate(expressionResolver) : null;
        Expression<Long> expression2 = divText.M;
        applyMaxLines(divLineHeightTextView, divView, lEvaluate, expression2 != null ? expression2.evaluate(expressionResolver) : null);
        if (ExpressionsKt.isConstantOrNull(divText.L) && ExpressionsKt.isConstantOrNull(divText.M)) {
            return;
        }
        l<? super Long, r> lVar = new l<Object, r>() { // from class: com.yandex.div.core.view2.divs.DivTextBinder$bindMaxLines$callback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // sn.l
            public /* bridge */ /* synthetic */ r invoke(Object obj) {
                invoke2(obj);
                return r.f5635a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Object obj) {
                DivTextBinder divTextBinder = this.this$0;
                DivLineHeightTextView divLineHeightTextView2 = divLineHeightTextView;
                Div2View divView2 = bindingContext.getDivView();
                Expression<Long> expression3 = divText.L;
                Long lEvaluate2 = expression3 != null ? expression3.evaluate(expressionResolver) : null;
                Expression<Long> expression4 = divText.M;
                divTextBinder.applyMaxLines(divLineHeightTextView2, divView2, lEvaluate2, expression4 != null ? expression4.evaluate(expressionResolver) : null);
            }
        };
        Expression<Long> expression3 = divText.L;
        divLineHeightTextView.addSubscription(expression3 != null ? expression3.observe(expressionResolver, lVar) : null);
        Expression<Long> expression4 = divText.M;
        divLineHeightTextView.addSubscription(expression4 != null ? expression4.observe(expressionResolver, lVar) : null);
    }

    private final void bindPlainEllipsis(final DivLineHeightTextView divLineHeightTextView, DivText.Ellipsis ellipsis, DivText.Ellipsis ellipsis2, ExpressionResolver expressionResolver) {
        Expression<String> expression;
        Expression<String> expression2;
        Disposable disposableObserve = null;
        if (ExpressionsKt.equalsToConstant(ellipsis != null ? ellipsis.f57655d : null, ellipsis2 != null ? ellipsis2.f57655d : null)) {
            return;
        }
        applyPlainEllipsis(divLineHeightTextView, (ellipsis == null || (expression2 = ellipsis.f57655d) == null) ? null : expression2.evaluate(expressionResolver));
        if (ExpressionsKt.isConstantOrNull(ellipsis != null ? ellipsis.f57655d : null)) {
            if (ExpressionsKt.isConstantOrNull(ellipsis != null ? ellipsis.f57655d : null)) {
                return;
            }
        }
        if (ellipsis != null && (expression = ellipsis.f57655d) != null) {
            disposableObserve = expression.observe(expressionResolver, new l<String, r>() { // from class: com.yandex.div.core.view2.divs.DivTextBinder.bindPlainEllipsis.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // sn.l
                public /* bridge */ /* synthetic */ r invoke(String str) {
                    invoke2(str);
                    return r.f5635a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull String str) {
                    DivTextBinder.this.applyPlainEllipsis(divLineHeightTextView, str);
                }
            });
        }
        divLineHeightTextView.addSubscription(disposableObserve);
    }

    private final void bindPlainText(final DivLineHeightTextView divLineHeightTextView, final BindingContext bindingContext, final DivText divText, DivText divText2) {
        if (ExpressionsKt.equalsToConstant(divText.W, divText2 != null ? divText2.W : null)) {
            if (ExpressionsKt.equalsToConstant(divText.I, divText2 != null ? divText2.I : null)) {
                if (ExpressionsKt.equalsToConstant(divText.f57646w, divText2 != null ? divText2.f57646w : null)) {
                    List<DivExtension> extensions = divText.getExtensions();
                    List<DivExtension> extensions2 = divText2 != null ? divText2.getExtensions() : null;
                    boolean z10 = true;
                    if (extensions != null || extensions2 != null) {
                        if (extensions == null || extensions2 == null || extensions.size() != extensions2.size()) {
                            z10 = false;
                            break;
                        }
                        int i10 = 0;
                        for (Object obj : extensions) {
                            int i11 = i10 + 1;
                            if (i10 < 0) {
                                w.w();
                            }
                            if (!p.f(((DivExtension) obj).f55240a, extensions2.get(i10).f55240a)) {
                                z10 = false;
                                break;
                            }
                            i10 = i11;
                        }
                    }
                    if (z10) {
                        return;
                    }
                }
            }
        }
        final ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        String strEvaluate = divText.W.evaluate(expressionResolver);
        applyPlainText(divLineHeightTextView, bindingContext, divText);
        applyHyphenation(divLineHeightTextView, strEvaluate);
        if (ExpressionsKt.isConstant(divText.W) && ExpressionsKt.isConstantOrNull(divText.I) && ExpressionsKt.isConstantOrNull(divText.f57646w)) {
            return;
        }
        l<? super String, r> lVar = new l<Object, r>() { // from class: com.yandex.div.core.view2.divs.DivTextBinder$bindPlainText$callback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // sn.l
            public /* bridge */ /* synthetic */ r invoke(Object obj2) {
                invoke2(obj2);
                return r.f5635a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Object obj2) {
                String strEvaluate2 = divText.W.evaluate(expressionResolver);
                this.applyPlainText(divLineHeightTextView, bindingContext, divText);
                this.applyHyphenation(divLineHeightTextView, strEvaluate2);
            }
        };
        divLineHeightTextView.addSubscription(divText.W.observe(expressionResolver, lVar));
        Expression<Long> expression = divText.I;
        divLineHeightTextView.addSubscription(expression != null ? expression.observe(expressionResolver, lVar) : null);
        divLineHeightTextView.addSubscription(divText.f57646w.observe(expressionResolver, lVar));
    }

    private final void bindRadialTextGradient(final DivLineHeightTextView divLineHeightTextView, final DivRadialGradient divRadialGradient, DivTextGradient divTextGradient, final ExpressionResolver expressionResolver) {
        List<Integer> listM;
        if (divTextGradient instanceof DivTextGradient.c) {
            DivTextGradient.c cVar = (DivTextGradient.c) divTextGradient;
            if (p.f(divRadialGradient.f56579e, cVar.c().f56579e) && p.f(divRadialGradient.f56575a, cVar.c().f56575a) && p.f(divRadialGradient.f56576b, cVar.c().f56576b) && ExpressionsKt.equalsToConstant(divRadialGradient.f56578d, cVar.c().f56578d)) {
                return;
            }
        }
        final DisplayMetrics displayMetrics = divLineHeightTextView.getResources().getDisplayMetrics();
        RadialGradientDrawable.Radius radialGradientDrawableRadius = toRadialGradientDrawableRadius(divRadialGradient.f56579e, displayMetrics, expressionResolver);
        RadialGradientDrawable.Center radialGradientDrawableCenter = toRadialGradientDrawableCenter(divRadialGradient.f56575a, displayMetrics, expressionResolver);
        RadialGradientDrawable.Center radialGradientDrawableCenter2 = toRadialGradientDrawableCenter(divRadialGradient.f56576b, displayMetrics, expressionResolver);
        ExpressionList<Integer> expressionList = divRadialGradient.f56578d;
        if (expressionList == null || (listM = expressionList.evaluate(expressionResolver)) == null) {
            listM = w.m();
        }
        applyRadialTextGradientColor(divLineHeightTextView, radialGradientDrawableRadius, radialGradientDrawableCenter, radialGradientDrawableCenter2, listM);
        if (ExpressionsKt.isConstantOrNull(divRadialGradient.f56578d)) {
            return;
        }
        ExpressionList<Integer> expressionList2 = divRadialGradient.f56578d;
        divLineHeightTextView.addSubscription(expressionList2 != null ? expressionList2.observe(expressionResolver, new l<List<? extends Integer>, r>() { // from class: com.yandex.div.core.view2.divs.DivTextBinder.bindRadialTextGradient.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // sn.l
            public /* bridge */ /* synthetic */ r invoke(List<? extends Integer> list) {
                invoke2((List<Integer>) list);
                return r.f5635a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull List<Integer> list) {
                DivTextBinder divTextBinder = DivTextBinder.this;
                divTextBinder.applyRadialTextGradientColor(divLineHeightTextView, divTextBinder.toRadialGradientDrawableRadius(divRadialGradient.f56579e, displayMetrics, expressionResolver), DivTextBinder.this.toRadialGradientDrawableCenter(divRadialGradient.f56575a, displayMetrics, expressionResolver), DivTextBinder.this.toRadialGradientDrawableCenter(divRadialGradient.f56576b, displayMetrics, expressionResolver), list);
            }
        }) : null);
    }

    private final void bindRichEllipsis(final DivLineHeightTextView divLineHeightTextView, final BindingContext bindingContext, final DivText divText) {
        DivStroke divStroke;
        Expression<Double> expression;
        DivStroke divStroke2;
        Expression<Integer> expression2;
        applyRichEllipsis(divLineHeightTextView, bindingContext, divText);
        DivText.Ellipsis ellipsis = divText.f57636p;
        if (ellipsis == null) {
            return;
        }
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        l<? super String, r> lVar = new l<Object, r>() { // from class: com.yandex.div.core.view2.divs.DivTextBinder$bindRichEllipsis$callback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // sn.l
            public /* bridge */ /* synthetic */ r invoke(Object obj) {
                invoke2(obj);
                return r.f5635a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Object obj) {
                this.this$0.applyRichEllipsis(divLineHeightTextView, bindingContext, divText);
            }
        };
        divLineHeightTextView.addSubscription(ellipsis.f57655d.observe(expressionResolver, lVar));
        List<DivText.Range> list = ellipsis.f57654c;
        if (list != null) {
            for (DivText.Range range : list) {
                divLineHeightTextView.addSubscription(range.f57703q.observe(expressionResolver, lVar));
                Expression<Long> expression3 = range.f57692f;
                divLineHeightTextView.addSubscription(expression3 != null ? expression3.observe(expressionResolver, lVar) : null);
                Expression<DivTextAlignmentVertical> expression4 = range.f57688b;
                divLineHeightTextView.addSubscription(expression4 != null ? expression4.observe(expressionResolver, lVar) : null);
                divLineHeightTextView.addSubscription(range.f57690d.observe(expressionResolver, lVar));
                Expression<Long> expression5 = range.f57695i;
                divLineHeightTextView.addSubscription(expression5 != null ? expression5.observe(expressionResolver, lVar) : null);
                divLineHeightTextView.addSubscription(range.f57696j.observe(expressionResolver, lVar));
                Expression<String> expression6 = range.f57693g;
                divLineHeightTextView.addSubscription(expression6 != null ? expression6.observe(expressionResolver, lVar) : null);
                Expression<DivFontWeight> expression7 = range.f57698l;
                divLineHeightTextView.addSubscription(expression7 != null ? expression7.observe(expressionResolver, lVar) : null);
                Expression<Long> expression8 = range.f57699m;
                divLineHeightTextView.addSubscription(expression8 != null ? expression8.observe(expressionResolver, lVar) : null);
                Expression<String> expression9 = range.f57694h;
                divLineHeightTextView.addSubscription(expression9 != null ? expression9.observe(expressionResolver, lVar) : null);
                Expression<Double> expression10 = range.f57700n;
                divLineHeightTextView.addSubscription(expression10 != null ? expression10.observe(expressionResolver, lVar) : null);
                Expression<Long> expression11 = range.f57701o;
                divLineHeightTextView.addSubscription(expression11 != null ? expression11.observe(expressionResolver, lVar) : null);
                Expression<DivLineStyle> expression12 = range.f57704r;
                divLineHeightTextView.addSubscription(expression12 != null ? expression12.observe(expressionResolver, lVar) : null);
                Expression<Integer> expression13 = range.f57705s;
                divLineHeightTextView.addSubscription(expression13 != null ? expression13.observe(expressionResolver, lVar) : null);
                Expression<Long> expression14 = range.f57707u;
                divLineHeightTextView.addSubscription(expression14 != null ? expression14.observe(expressionResolver, lVar) : null);
                Expression<DivLineStyle> expression15 = range.f57708v;
                divLineHeightTextView.addSubscription(expression15 != null ? expression15.observe(expressionResolver, lVar) : null);
                DivTextRangeBackground divTextRangeBackground = range.f57689c;
                Object objB = divTextRangeBackground != null ? divTextRangeBackground.b() : null;
                if (objB instanceof DivSolidBackground) {
                    divLineHeightTextView.addSubscription(((DivSolidBackground) objB).f57151a.observe(expressionResolver, lVar));
                }
                DivTextRangeMask divTextRangeMask = range.f57702p;
                Object objB2 = divTextRangeMask != null ? divTextRangeMask.b() : null;
                if (objB2 instanceof DivTextRangeMaskSolid) {
                    DivTextRangeMaskSolid divTextRangeMaskSolid = (DivTextRangeMaskSolid) objB2;
                    divLineHeightTextView.addSubscription(divTextRangeMaskSolid.f57841b.observe(expressionResolver, lVar));
                    divLineHeightTextView.addSubscription(divTextRangeMaskSolid.f57840a.observe(expressionResolver, lVar));
                } else if (objB2 instanceof DivTextRangeMaskParticles) {
                    DivTextRangeMaskParticles divTextRangeMaskParticles = (DivTextRangeMaskParticles) objB2;
                    divLineHeightTextView.addSubscription(divTextRangeMaskParticles.f57823d.observe(expressionResolver, lVar));
                    divLineHeightTextView.addSubscription(divTextRangeMaskParticles.f57820a.observe(expressionResolver, lVar));
                    divLineHeightTextView.addSubscription(divTextRangeMaskParticles.f57821b.observe(expressionResolver, lVar));
                    divLineHeightTextView.addSubscription(divTextRangeMaskParticles.f57822c.observe(expressionResolver, lVar));
                    divLineHeightTextView.addSubscription(divTextRangeMaskParticles.f57824e.f55333b.observe(expressionResolver, lVar));
                    divLineHeightTextView.addSubscription(divTextRangeMaskParticles.f57824e.f55332a.observe(expressionResolver, lVar));
                }
                DivTextRangeBorder divTextRangeBorder = range.f57691e;
                divLineHeightTextView.addSubscription((divTextRangeBorder == null || (divStroke2 = divTextRangeBorder.f57776b) == null || (expression2 = divStroke2.f57276a) == null) ? null : expression2.observe(expressionResolver, lVar));
                DivTextRangeBorder divTextRangeBorder2 = range.f57691e;
                divLineHeightTextView.addSubscription((divTextRangeBorder2 == null || (divStroke = divTextRangeBorder2.f57776b) == null || (expression = divStroke.f57279d) == null) ? null : expression.observe(expressionResolver, lVar));
                if (TextViewExtensionsKt.getSupportFontVariations()) {
                    Expression<JSONObject> expression16 = range.f57697k;
                    divLineHeightTextView.addSubscription(expression16 != null ? expression16.observe(expressionResolver, lVar) : null);
                }
            }
        }
        List<DivText.Image> list2 = ellipsis.f57653b;
        if (list2 != null) {
            for (DivText.Image image : list2) {
                divLineHeightTextView.addSubscription(image.f57670f.observe(expressionResolver, lVar));
                divLineHeightTextView.addSubscription(image.f57673i.observe(expressionResolver, lVar));
                Expression<Integer> expression17 = image.f57671g;
                divLineHeightTextView.addSubscription(expression17 != null ? expression17.observe(expressionResolver, lVar) : null);
                divLineHeightTextView.addSubscription(image.f57674j.f55333b.observe(expressionResolver, lVar));
                divLineHeightTextView.addSubscription(image.f57674j.f55332a.observe(expressionResolver, lVar));
            }
        }
    }

    private final void bindRichText(final DivLineHeightTextView divLineHeightTextView, final BindingContext bindingContext, final DivText divText) {
        DivStroke divStroke;
        Expression<Double> expression;
        DivStroke divStroke2;
        Expression<Integer> expression2;
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        applyRichText(divLineHeightTextView, bindingContext, divText);
        applyHyphenation(divLineHeightTextView, divText.W.evaluate(expressionResolver));
        divLineHeightTextView.addSubscription(divText.W.observe(expressionResolver, new l<String, r>() { // from class: com.yandex.div.core.view2.divs.DivTextBinder.bindRichText.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // sn.l
            public /* bridge */ /* synthetic */ r invoke(String str) {
                invoke2(str);
                return r.f5635a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull String str) {
                DivTextBinder.this.applyRichText(divLineHeightTextView, bindingContext, divText);
                DivTextBinder.this.applyHyphenation(divLineHeightTextView, str);
            }
        }));
        l<? super Long, r> lVar = new l<Object, r>() { // from class: com.yandex.div.core.view2.divs.DivTextBinder$bindRichText$callback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // sn.l
            public /* bridge */ /* synthetic */ r invoke(Object obj) {
                invoke2(obj);
                return r.f5635a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Object obj) {
                this.this$0.applyRichText(divLineHeightTextView, bindingContext, divText);
            }
        };
        divLineHeightTextView.addSubscription(divText.f57645v.observe(expressionResolver, lVar));
        divLineHeightTextView.addSubscription(divText.f57646w.observe(expressionResolver, lVar));
        Expression<String> expression3 = divText.f57643t;
        divLineHeightTextView.addSubscription(expression3 != null ? expression3.observe(expressionResolver, lVar) : null);
        Expression<Long> expression4 = divText.I;
        divLineHeightTextView.addSubscription(expression4 != null ? expression4.observe(expressionResolver, lVar) : null);
        List<DivText.Range> list = divText.Q;
        if (list != null) {
            for (DivText.Range range : list) {
                divLineHeightTextView.addSubscription(range.f57703q.observe(expressionResolver, lVar));
                Expression<Long> expression5 = range.f57692f;
                divLineHeightTextView.addSubscription(expression5 != null ? expression5.observe(expressionResolver, lVar) : null);
                Expression<DivTextAlignmentVertical> expression6 = range.f57688b;
                divLineHeightTextView.addSubscription(expression6 != null ? expression6.observe(expressionResolver, lVar) : null);
                divLineHeightTextView.addSubscription(range.f57690d.observe(expressionResolver, lVar));
                Expression<Long> expression7 = range.f57695i;
                divLineHeightTextView.addSubscription(expression7 != null ? expression7.observe(expressionResolver, lVar) : null);
                divLineHeightTextView.addSubscription(range.f57696j.observe(expressionResolver, lVar));
                Expression<String> expression8 = range.f57693g;
                divLineHeightTextView.addSubscription(expression8 != null ? expression8.observe(expressionResolver, lVar) : null);
                Expression<DivFontWeight> expression9 = range.f57698l;
                divLineHeightTextView.addSubscription(expression9 != null ? expression9.observe(expressionResolver, lVar) : null);
                Expression<Long> expression10 = range.f57699m;
                divLineHeightTextView.addSubscription(expression10 != null ? expression10.observe(expressionResolver, lVar) : null);
                Expression<String> expression11 = range.f57694h;
                divLineHeightTextView.addSubscription(expression11 != null ? expression11.observe(expressionResolver, lVar) : null);
                Expression<Double> expression12 = range.f57700n;
                divLineHeightTextView.addSubscription(expression12 != null ? expression12.observe(expressionResolver, lVar) : null);
                Expression<Long> expression13 = range.f57701o;
                divLineHeightTextView.addSubscription(expression13 != null ? expression13.observe(expressionResolver, lVar) : null);
                Expression<DivLineStyle> expression14 = range.f57704r;
                divLineHeightTextView.addSubscription(expression14 != null ? expression14.observe(expressionResolver, lVar) : null);
                Expression<Integer> expression15 = range.f57705s;
                divLineHeightTextView.addSubscription(expression15 != null ? expression15.observe(expressionResolver, lVar) : null);
                Expression<Long> expression16 = range.f57707u;
                divLineHeightTextView.addSubscription(expression16 != null ? expression16.observe(expressionResolver, lVar) : null);
                Expression<DivLineStyle> expression17 = range.f57708v;
                divLineHeightTextView.addSubscription(expression17 != null ? expression17.observe(expressionResolver, lVar) : null);
                DivTextRangeBackground divTextRangeBackground = range.f57689c;
                Object objB = divTextRangeBackground != null ? divTextRangeBackground.b() : null;
                if (objB instanceof DivSolidBackground) {
                    divLineHeightTextView.addSubscription(((DivSolidBackground) objB).f57151a.observe(expressionResolver, lVar));
                }
                DivTextRangeMask divTextRangeMask = range.f57702p;
                Object objB2 = divTextRangeMask != null ? divTextRangeMask.b() : null;
                if (objB2 instanceof DivTextRangeMaskSolid) {
                    DivTextRangeMaskSolid divTextRangeMaskSolid = (DivTextRangeMaskSolid) objB2;
                    divLineHeightTextView.addSubscription(divTextRangeMaskSolid.f57841b.observe(expressionResolver, lVar));
                    divLineHeightTextView.addSubscription(divTextRangeMaskSolid.f57840a.observe(expressionResolver, lVar));
                } else if (objB2 instanceof DivTextRangeMaskParticles) {
                    DivTextRangeMaskParticles divTextRangeMaskParticles = (DivTextRangeMaskParticles) objB2;
                    divLineHeightTextView.addSubscription(divTextRangeMaskParticles.f57823d.observe(expressionResolver, lVar));
                    divLineHeightTextView.addSubscription(divTextRangeMaskParticles.f57820a.observe(expressionResolver, lVar));
                    divLineHeightTextView.addSubscription(divTextRangeMaskParticles.f57821b.observe(expressionResolver, lVar));
                    divLineHeightTextView.addSubscription(divTextRangeMaskParticles.f57822c.observe(expressionResolver, lVar));
                    divLineHeightTextView.addSubscription(divTextRangeMaskParticles.f57824e.f55333b.observe(expressionResolver, lVar));
                    divLineHeightTextView.addSubscription(divTextRangeMaskParticles.f57824e.f55332a.observe(expressionResolver, lVar));
                }
                DivTextRangeBorder divTextRangeBorder = range.f57691e;
                divLineHeightTextView.addSubscription((divTextRangeBorder == null || (divStroke2 = divTextRangeBorder.f57776b) == null || (expression2 = divStroke2.f57276a) == null) ? null : expression2.observe(expressionResolver, lVar));
                DivTextRangeBorder divTextRangeBorder2 = range.f57691e;
                divLineHeightTextView.addSubscription((divTextRangeBorder2 == null || (divStroke = divTextRangeBorder2.f57776b) == null || (expression = divStroke.f57279d) == null) ? null : expression.observe(expressionResolver, lVar));
                if (TextViewExtensionsKt.getSupportFontVariations()) {
                    Expression<JSONObject> expression18 = range.f57697k;
                    divLineHeightTextView.addSubscription(expression18 != null ? expression18.observe(expressionResolver, lVar) : null);
                }
            }
        }
        List<DivText.Image> list2 = divText.F;
        if (list2 != null) {
            for (DivText.Image image : list2) {
                divLineHeightTextView.addSubscription(image.f57670f.observe(expressionResolver, lVar));
                divLineHeightTextView.addSubscription(image.f57668d.observe(expressionResolver, lVar));
                divLineHeightTextView.addSubscription(image.f57673i.observe(expressionResolver, lVar));
                divLineHeightTextView.addSubscription(image.f57666b.observe(expressionResolver, lVar));
                Expression<Integer> expression19 = image.f57671g;
                divLineHeightTextView.addSubscription(expression19 != null ? expression19.observe(expressionResolver, lVar) : null);
                divLineHeightTextView.addSubscription(image.f57674j.f55333b.observe(expressionResolver, lVar));
                divLineHeightTextView.addSubscription(image.f57674j.f55332a.observe(expressionResolver, lVar));
            }
        }
    }

    private final void bindSelectable(final DivLineHeightTextView divLineHeightTextView, DivText divText, DivText divText2, ExpressionResolver expressionResolver) {
        if (ExpressionsKt.equalsToConstant(divText.T, divText2 != null ? divText2.T : null)) {
            return;
        }
        applySelectable(divLineHeightTextView, divText.T.evaluate(expressionResolver).booleanValue());
        if (ExpressionsKt.isConstant(divText.T)) {
            return;
        }
        divLineHeightTextView.addSubscription(divText.T.observe(expressionResolver, new l<Boolean, r>() { // from class: com.yandex.div.core.view2.divs.DivTextBinder.bindSelectable.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // sn.l
            public /* bridge */ /* synthetic */ r invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return r.f5635a;
            }

            public final void invoke(boolean z10) {
                DivTextBinder.this.applySelectable(divLineHeightTextView, z10);
            }
        }));
    }

    private final void bindStrikethrough(final DivLineHeightTextView divLineHeightTextView, DivText divText, DivText divText2, ExpressionResolver expressionResolver) {
        if (ExpressionsKt.equalsToConstant(divText.V, divText2 != null ? divText2.V : null)) {
            return;
        }
        applyStrikethrough(divLineHeightTextView, divText.V.evaluate(expressionResolver));
        if (ExpressionsKt.isConstant(divText.V)) {
            return;
        }
        divLineHeightTextView.addSubscription(divText.V.observe(expressionResolver, new l<DivLineStyle, r>() { // from class: com.yandex.div.core.view2.divs.DivTextBinder.bindStrikethrough.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // sn.l
            public /* bridge */ /* synthetic */ r invoke(DivLineStyle divLineStyle) {
                invoke2(divLineStyle);
                return r.f5635a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull DivLineStyle divLineStyle) {
                DivTextBinder.this.applyStrikethrough(divLineHeightTextView, divLineStyle);
            }
        }));
    }

    private final void bindText(DivLineHeightTextView divLineHeightTextView, BindingContext bindingContext, DivText divText, DivText divText2) {
        if (divText.Q == null && divText.F == null) {
            bindPlainText(divLineHeightTextView, bindingContext, divText, divText2);
        } else {
            bindRichText(divLineHeightTextView, bindingContext, divText);
        }
    }

    private final void bindTextAlignment(final DivLineHeightTextView divLineHeightTextView, final DivText divText, DivText divText2, final ExpressionResolver expressionResolver) {
        if (ExpressionsKt.equalsToConstant(divText.X, divText2 != null ? divText2.X : null)) {
            if (ExpressionsKt.equalsToConstant(divText.Y, divText2 != null ? divText2.Y : null)) {
                return;
            }
        }
        applyTextAlignment(divLineHeightTextView, divText.X.evaluate(expressionResolver), divText.Y.evaluate(expressionResolver));
        if (ExpressionsKt.isConstant(divText.X) && ExpressionsKt.isConstant(divText.Y)) {
            return;
        }
        l<? super DivAlignmentHorizontal, r> lVar = new l<Object, r>() { // from class: com.yandex.div.core.view2.divs.DivTextBinder$bindTextAlignment$callback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // sn.l
            public /* bridge */ /* synthetic */ r invoke(Object obj) {
                invoke2(obj);
                return r.f5635a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Object obj) {
                this.this$0.applyTextAlignment(divLineHeightTextView, divText.X.evaluate(expressionResolver), divText.Y.evaluate(expressionResolver));
            }
        };
        divLineHeightTextView.addSubscription(divText.X.observe(expressionResolver, lVar));
        divLineHeightTextView.addSubscription(divText.Y.observe(expressionResolver, lVar));
    }

    private final void bindTextColor(final DivLineHeightTextView divLineHeightTextView, final DivText divText, DivText divText2, final ExpressionResolver expressionResolver) {
        if (ExpressionsKt.equalsToConstant(divText.Z, divText2 != null ? divText2.Z : null)) {
            if (ExpressionsKt.equalsToConstant(divText.f57642s, divText2 != null ? divText2.f57642s : null)) {
                return;
            }
        }
        int iIntValue = divText.Z.evaluate(expressionResolver).intValue();
        Expression<Integer> expression = divText.f57642s;
        applyTextColor(divLineHeightTextView, iIntValue, expression != null ? expression.evaluate(expressionResolver) : null);
        if (ExpressionsKt.isConstant(divText.Z) && ExpressionsKt.isConstantOrNull(divText.f57642s)) {
            return;
        }
        l<? super Integer, r> lVar = new l<Object, r>() { // from class: com.yandex.div.core.view2.divs.DivTextBinder$bindTextColor$callback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // sn.l
            public /* bridge */ /* synthetic */ r invoke(Object obj) {
                invoke2(obj);
                return r.f5635a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Object obj) {
                DivTextBinder divTextBinder = this.this$0;
                DivLineHeightTextView divLineHeightTextView2 = divLineHeightTextView;
                int iIntValue2 = divText.Z.evaluate(expressionResolver).intValue();
                Expression<Integer> expression2 = divText.f57642s;
                divTextBinder.applyTextColor(divLineHeightTextView2, iIntValue2, expression2 != null ? expression2.evaluate(expressionResolver) : null);
            }
        };
        divLineHeightTextView.addSubscription(divText.Z.observe(expressionResolver, lVar));
        Expression<Integer> expression2 = divText.f57642s;
        divLineHeightTextView.addSubscription(expression2 != null ? expression2.observe(expressionResolver, lVar) : null);
    }

    private final void bindTextGradient(DivLineHeightTextView divLineHeightTextView, Div2View div2View, DivText divText, DivText divText2, ExpressionResolver expressionResolver) {
        DivTextGradient divTextGradient = divText.f57607a0;
        if (divTextGradient == null) {
            divLineHeightTextView.getPaint().setShader(null);
        } else if (divTextGradient instanceof DivTextGradient.b) {
            bindLinearTextGradient(divLineHeightTextView, div2View, ((DivTextGradient.b) divTextGradient).c(), divText2 != null ? divText2.f57607a0 : null, expressionResolver);
        } else if (divTextGradient instanceof DivTextGradient.c) {
            bindRadialTextGradient(divLineHeightTextView, ((DivTextGradient.c) divTextGradient).c(), divText2 != null ? divText2.f57607a0 : null, expressionResolver);
        }
    }

    private final void bindTextShadow(final DivLineHeightTextView divLineHeightTextView, final DivText divText, DivText divText2, final ExpressionResolver expressionResolver) {
        DivPoint divPoint;
        DivDimension divDimension;
        Expression<DivSizeUnit> expression;
        DivPoint divPoint2;
        DivDimension divDimension2;
        Expression<Double> expression2;
        DivPoint divPoint3;
        DivDimension divDimension3;
        Expression<DivSizeUnit> expression3;
        DivPoint divPoint4;
        DivDimension divDimension4;
        Expression<Double> expression4;
        Expression<Long> expression5;
        Expression<Integer> expression6;
        Expression<Double> expression7;
        DivPoint divPoint5;
        DivDimension divDimension5;
        DivPoint divPoint6;
        DivDimension divDimension6;
        DivPoint divPoint7;
        DivDimension divDimension7;
        DivPoint divPoint8;
        DivDimension divDimension8;
        DivShadow divShadow;
        DivPoint divPoint9;
        DivDimension divDimension9;
        DivPoint divPoint10;
        DivDimension divDimension10;
        DivShadow divShadow2;
        DivPoint divPoint11;
        DivDimension divDimension11;
        DivPoint divPoint12;
        DivDimension divDimension12;
        DivShadow divShadow3;
        DivPoint divPoint13;
        DivDimension divDimension13;
        DivPoint divPoint14;
        DivDimension divDimension14;
        DivShadow divShadow4;
        DivPoint divPoint15;
        DivDimension divDimension15;
        DivPoint divPoint16;
        DivDimension divDimension16;
        DivShadow divShadow5;
        DivShadow divShadow6;
        DivShadow divShadow7;
        DivShadow divShadow8 = divText.f57609b0;
        Disposable disposableObserve = null;
        if (ExpressionsKt.equalsToConstant(divShadow8 != null ? divShadow8.f56912a : null, (divText2 == null || (divShadow7 = divText2.f57609b0) == null) ? null : divShadow7.f56912a)) {
            DivShadow divShadow9 = divText.f57609b0;
            if (ExpressionsKt.equalsToConstant(divShadow9 != null ? divShadow9.f56913b : null, (divText2 == null || (divShadow6 = divText2.f57609b0) == null) ? null : divShadow6.f56913b)) {
                DivShadow divShadow10 = divText.f57609b0;
                if (ExpressionsKt.equalsToConstant(divShadow10 != null ? divShadow10.f56914c : null, (divText2 == null || (divShadow5 = divText2.f57609b0) == null) ? null : divShadow5.f56914c)) {
                    DivShadow divShadow11 = divText.f57609b0;
                    if (ExpressionsKt.equalsToConstant((divShadow11 == null || (divPoint16 = divShadow11.f56915d) == null || (divDimension16 = divPoint16.f56563a) == null) ? null : divDimension16.f55128b, (divText2 == null || (divShadow4 = divText2.f57609b0) == null || (divPoint15 = divShadow4.f56915d) == null || (divDimension15 = divPoint15.f56563a) == null) ? null : divDimension15.f55128b)) {
                        DivShadow divShadow12 = divText.f57609b0;
                        if (ExpressionsKt.equalsToConstant((divShadow12 == null || (divPoint14 = divShadow12.f56915d) == null || (divDimension14 = divPoint14.f56563a) == null) ? null : divDimension14.f55127a, (divText2 == null || (divShadow3 = divText2.f57609b0) == null || (divPoint13 = divShadow3.f56915d) == null || (divDimension13 = divPoint13.f56563a) == null) ? null : divDimension13.f55127a)) {
                            DivShadow divShadow13 = divText.f57609b0;
                            if (ExpressionsKt.equalsToConstant((divShadow13 == null || (divPoint12 = divShadow13.f56915d) == null || (divDimension12 = divPoint12.f56564b) == null) ? null : divDimension12.f55128b, (divText2 == null || (divShadow2 = divText2.f57609b0) == null || (divPoint11 = divShadow2.f56915d) == null || (divDimension11 = divPoint11.f56564b) == null) ? null : divDimension11.f55128b)) {
                                DivShadow divShadow14 = divText.f57609b0;
                                if (ExpressionsKt.equalsToConstant((divShadow14 == null || (divPoint10 = divShadow14.f56915d) == null || (divDimension10 = divPoint10.f56564b) == null) ? null : divDimension10.f55127a, (divText2 == null || (divShadow = divText2.f57609b0) == null || (divPoint9 = divShadow.f56915d) == null || (divDimension9 = divPoint9.f56564b) == null) ? null : divDimension9.f55127a)) {
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
        final DivShadow divShadow15 = divText.f57609b0;
        final DisplayMetrics displayMetrics = divLineHeightTextView.getResources().getDisplayMetrics();
        applyTextShadow(divLineHeightTextView, divShadow15 != null ? getShadowData(divShadow15, expressionResolver, displayMetrics, divText.Z.evaluate(expressionResolver).intValue()) : null);
        DivShadow divShadow16 = divText.f57609b0;
        if (ExpressionsKt.isConstantOrNull(divShadow16 != null ? divShadow16.f56912a : null)) {
            DivShadow divShadow17 = divText.f57609b0;
            if (ExpressionsKt.isConstantOrNull(divShadow17 != null ? divShadow17.f56913b : null)) {
                DivShadow divShadow18 = divText.f57609b0;
                if (ExpressionsKt.isConstantOrNull(divShadow18 != null ? divShadow18.f56914c : null)) {
                    DivShadow divShadow19 = divText.f57609b0;
                    if (ExpressionsKt.isConstantOrNull((divShadow19 == null || (divPoint8 = divShadow19.f56915d) == null || (divDimension8 = divPoint8.f56563a) == null) ? null : divDimension8.f55128b)) {
                        DivShadow divShadow20 = divText.f57609b0;
                        if (ExpressionsKt.isConstantOrNull((divShadow20 == null || (divPoint7 = divShadow20.f56915d) == null || (divDimension7 = divPoint7.f56563a) == null) ? null : divDimension7.f55127a)) {
                            DivShadow divShadow21 = divText.f57609b0;
                            if (ExpressionsKt.isConstantOrNull((divShadow21 == null || (divPoint6 = divShadow21.f56915d) == null || (divDimension6 = divPoint6.f56564b) == null) ? null : divDimension6.f55128b)) {
                                DivShadow divShadow22 = divText.f57609b0;
                                if (ExpressionsKt.isConstantOrNull((divShadow22 == null || (divPoint5 = divShadow22.f56915d) == null || (divDimension5 = divPoint5.f56564b) == null) ? null : divDimension5.f55127a)) {
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
        l<? super DivSizeUnit, r> lVar = new l<Object, r>() { // from class: com.yandex.div.core.view2.divs.DivTextBinder$bindTextShadow$callback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // sn.l
            public /* bridge */ /* synthetic */ r invoke(Object obj) {
                invoke2(obj);
                return r.f5635a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Object obj) {
                ShadowData shadowData;
                DivTextBinder divTextBinder = this.this$0;
                DivLineHeightTextView divLineHeightTextView2 = divLineHeightTextView;
                DivShadow divShadow23 = divShadow15;
                if (divShadow23 != null) {
                    ExpressionResolver expressionResolver2 = expressionResolver;
                    shadowData = divTextBinder.getShadowData(divShadow23, expressionResolver2, displayMetrics, divText.Z.evaluate(expressionResolver2).intValue());
                } else {
                    shadowData = null;
                }
                divTextBinder.applyTextShadow(divLineHeightTextView2, shadowData);
            }
        };
        divLineHeightTextView.addSubscription((divShadow15 == null || (expression7 = divShadow15.f56912a) == null) ? null : expression7.observe(expressionResolver, lVar));
        divLineHeightTextView.addSubscription((divShadow15 == null || (expression6 = divShadow15.f56914c) == null) ? null : expression6.observe(expressionResolver, lVar));
        divLineHeightTextView.addSubscription((divShadow15 == null || (expression5 = divShadow15.f56913b) == null) ? null : expression5.observe(expressionResolver, lVar));
        divLineHeightTextView.addSubscription((divShadow15 == null || (divPoint4 = divShadow15.f56915d) == null || (divDimension4 = divPoint4.f56563a) == null || (expression4 = divDimension4.f55128b) == null) ? null : expression4.observe(expressionResolver, lVar));
        divLineHeightTextView.addSubscription((divShadow15 == null || (divPoint3 = divShadow15.f56915d) == null || (divDimension3 = divPoint3.f56563a) == null || (expression3 = divDimension3.f55127a) == null) ? null : expression3.observe(expressionResolver, lVar));
        divLineHeightTextView.addSubscription((divShadow15 == null || (divPoint2 = divShadow15.f56915d) == null || (divDimension2 = divPoint2.f56564b) == null || (expression2 = divDimension2.f55128b) == null) ? null : expression2.observe(expressionResolver, lVar));
        if (divShadow15 != null && (divPoint = divShadow15.f56915d) != null && (divDimension = divPoint.f56564b) != null && (expression = divDimension.f55127a) != null) {
            disposableObserve = expression.observe(expressionResolver, lVar);
        }
        divLineHeightTextView.addSubscription(disposableObserve);
    }

    private final void bindTightenWidth(final DivLineHeightTextView divLineHeightTextView, DivText divText, DivText divText2, ExpressionResolver expressionResolver) {
        if (ExpressionsKt.equalsToConstant(divText.f57611c0, divText2 != null ? divText2.f57611c0 : null)) {
            return;
        }
        applyTightenWidth(divLineHeightTextView, divText.f57611c0.evaluate(expressionResolver).booleanValue());
        if (ExpressionsKt.isConstant(divText.f57611c0)) {
            return;
        }
        divLineHeightTextView.addSubscription(divText.f57611c0.observe(expressionResolver, new l<Boolean, r>() { // from class: com.yandex.div.core.view2.divs.DivTextBinder.bindTightenWidth.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // sn.l
            public /* bridge */ /* synthetic */ r invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return r.f5635a;
            }

            public final void invoke(boolean z10) {
                DivTextBinder.this.applyTightenWidth(divLineHeightTextView, z10);
            }
        }));
    }

    private final void bindTypeface(DivLineHeightTextView divLineHeightTextView, DivText divText, DivText divText2, ExpressionResolver expressionResolver) {
        TextViewExtensionsKt.observeTypeface(divLineHeightTextView, divText.f57643t, divText.f57648y, divText.f57649z, divText.f57647x, divText2 != null ? divText2.f57643t : null, divText2 != null ? divText2.f57648y : null, divText2 != null ? divText2.f57649z : null, divText2 != null ? divText2.f57647x : null, divText2, this.typefaceResolver, expressionResolver);
    }

    private final void bindUnderline(final DivLineHeightTextView divLineHeightTextView, DivText divText, DivText divText2, ExpressionResolver expressionResolver) {
        if (ExpressionsKt.equalsToConstant(divText.f57627k0, divText2 != null ? divText2.f57627k0 : null)) {
            return;
        }
        applyUnderline(divLineHeightTextView, divText.f57627k0.evaluate(expressionResolver));
        if (ExpressionsKt.isConstant(divText.f57627k0)) {
            return;
        }
        divLineHeightTextView.addSubscription(divText.f57627k0.observe(expressionResolver, new l<DivLineStyle, r>() { // from class: com.yandex.div.core.view2.divs.DivTextBinder.bindUnderline.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // sn.l
            public /* bridge */ /* synthetic */ r invoke(DivLineStyle divLineStyle) {
                invoke2(divLineStyle);
                return r.f5635a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull DivLineStyle divLineStyle) {
                DivTextBinder.this.applyUnderline(divLineHeightTextView, divLineStyle);
            }
        }));
    }

    private final void configureView(BindingContext bindingContext, DivLineHeightTextView divLineHeightTextView) {
        divLineHeightTextView.setDrawingPassOverrideStrategy$div_release(bindingContext.getDivView().getViewComponent$div_release().getDrawingPassOverrideStrategy());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getRealTextWidth(TextView textView) {
        return Math.min((textView.getWidth() - textView.getPaddingRight()) - textView.getPaddingLeft(), (int) textView.getPaint().measureText(textView.getText().toString()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ShadowData getShadowData(DivShadow divShadow, ExpressionResolver expressionResolver, DisplayMetrics displayMetrics, int i10) {
        float fDpToPxF = BaseDivViewExtensionsKt.dpToPxF(divShadow.f56913b.evaluate(expressionResolver), displayMetrics);
        float px = BaseDivViewExtensionsKt.toPx(divShadow.f56915d.f56563a, displayMetrics, expressionResolver);
        float px2 = BaseDivViewExtensionsKt.toPx(divShadow.f56915d.f56564b, displayMetrics, expressionResolver);
        Paint paint = new Paint();
        paint.setColor(divShadow.f56914c.evaluate(expressionResolver).intValue());
        paint.setAlpha((int) (divShadow.f56912a.evaluate(expressionResolver).doubleValue() * ((double) (i10 >>> 24))));
        return new ShadowData(px, px2, fDpToPxF, paint.getColor());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RadialGradientDrawable.Center toRadialGradientDrawableCenter(DivRadialGradientCenter divRadialGradientCenter, DisplayMetrics displayMetrics, ExpressionResolver expressionResolver) {
        if (divRadialGradientCenter instanceof DivRadialGradientCenter.b) {
            return new RadialGradientDrawable.Center.Fixed(BaseDivViewExtensionsKt.dpToPxF(((DivRadialGradientCenter.b) divRadialGradientCenter).c().f56599b.evaluate(expressionResolver), displayMetrics));
        }
        if (divRadialGradientCenter instanceof DivRadialGradientCenter.c) {
            return new RadialGradientDrawable.Center.Relative((float) ((DivRadialGradientCenter.c) divRadialGradientCenter).c().f56623a.evaluate(expressionResolver).doubleValue());
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RadialGradientDrawable.Radius toRadialGradientDrawableRadius(DivRadialGradientRadius divRadialGradientRadius, DisplayMetrics displayMetrics, ExpressionResolver expressionResolver) {
        RadialGradientDrawable.Radius.Relative.Type type;
        if (divRadialGradientRadius instanceof DivRadialGradientRadius.b) {
            return new RadialGradientDrawable.Radius.Fixed(BaseDivViewExtensionsKt.dpToPxF(((DivRadialGradientRadius.b) divRadialGradientRadius).c().f55333b.evaluate(expressionResolver), displayMetrics));
        }
        if (!(divRadialGradientRadius instanceof DivRadialGradientRadius.c)) {
            throw new NoWhenBranchMatchedException();
        }
        int i10 = WhenMappings.$EnumSwitchMapping$2[((DivRadialGradientRadius.c) divRadialGradientRadius).c().f56630a.evaluate(expressionResolver).ordinal()];
        if (i10 == 1) {
            type = RadialGradientDrawable.Radius.Relative.Type.FARTHEST_CORNER;
        } else if (i10 == 2) {
            type = RadialGradientDrawable.Radius.Relative.Type.NEAREST_CORNER;
        } else if (i10 == 3) {
            type = RadialGradientDrawable.Radius.Relative.Type.FARTHEST_SIDE;
        } else {
            if (i10 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            type = RadialGradientDrawable.Radius.Relative.Type.NEAREST_SIDE;
        }
        return new RadialGradientDrawable.Radius.Relative(type);
    }

    private final void updateFocusableState(View view, DivText divText) {
        view.setFocusable(view.isFocusable() || divText.f57642s != null);
    }

    @Override // com.yandex.div.core.view2.DivViewBinder
    public void bind(@NotNull DivLineHeightTextView divLineHeightTextView, @NotNull BindingContext bindingContext, @NotNull DivText divText, @Nullable DivText divText2) {
        configureView(bindingContext, divLineHeightTextView);
        BaseDivViewExtensionsKt.applyDivActions(divLineHeightTextView, bindingContext, divText.f57608b, divText.f57612d, divText.J, divText.f57634o, divText.D, divText.C, divText.P, divText.O, divText.f57610c, divText.f57628l);
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        bindTypeface(divLineHeightTextView, divText, divText2, expressionResolver);
        bindTextAlignment(divLineHeightTextView, divText, divText2, expressionResolver);
        bindFontSize(divLineHeightTextView, divText, divText2, expressionResolver);
        bindLetterSpacing(divLineHeightTextView, divText, divText2, expressionResolver);
        bindFontFeatureSettings(divLineHeightTextView, divText, divText2, expressionResolver);
        bindTextColor(divLineHeightTextView, divText, divText2, expressionResolver);
        bindUnderline(divLineHeightTextView, divText, divText2, expressionResolver);
        bindStrikethrough(divLineHeightTextView, divText, divText2, expressionResolver);
        bindMaxLines(divLineHeightTextView, bindingContext, divText, divText2, expressionResolver);
        bindText(divLineHeightTextView, bindingContext, divText, divText2);
        bindEllipsis(divLineHeightTextView, bindingContext, divText, divText2);
        bindEllipsize(divLineHeightTextView, divText, divText2, expressionResolver);
        bindTextGradient(divLineHeightTextView, bindingContext.getDivView(), divText, divText2, expressionResolver);
        bindTextShadow(divLineHeightTextView, divText, divText2, expressionResolver);
        bindSelectable(divLineHeightTextView, divText, divText2, expressionResolver);
        bindTightenWidth(divLineHeightTextView, divText, divText2, expressionResolver);
        updateFocusableState(divLineHeightTextView, divText);
    }
}
