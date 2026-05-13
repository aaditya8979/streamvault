package androidx.compose.ui.text.platform.extensions;

import android.graphics.Typeface;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.MetricAffectingSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.ScaleXSpan;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.ShaderBrush;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.AnnotatedStringKt;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.android.style.BaselineShiftSpan;
import androidx.compose.ui.text.android.style.FontFeatureSpan;
import androidx.compose.ui.text.android.style.LetterSpacingSpanEm;
import androidx.compose.ui.text.android.style.LetterSpacingSpanPx;
import androidx.compose.ui.text.android.style.LineHeightSpan;
import androidx.compose.ui.text.android.style.LineHeightStyleSpan;
import androidx.compose.ui.text.android.style.ShadowSpan;
import androidx.compose.ui.text.android.style.SkewXSpan;
import androidx.compose.ui.text.android.style.TextDecorationSpan;
import androidx.compose.ui.text.android.style.TypefaceSpan;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.platform.style.ShaderBrushSpan;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.unit.TextUnitType;
import bn.r;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.q;
import tn.i;
import tn.p;
import vn.c;

/* JADX INFO: compiled from: SpannableExtensions.android.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {}, d1 = {"\u0000Ò\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a$\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000\u001a&\u0010\u000e\u001a\u00020\u0006*\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0000\u001a9\u0010\u0015\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u001a1\u0010\u0015\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017\u001a-\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019\u001a[\u0010(\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\u0012\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001e0\u001d2\u0006\u0010\r\u001a\u00020\f2&\u0010'\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\"\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&0!H\u0000ø\u0001\u0000\u001a:\u0010.\u001a\u00020\u0006*\u00020\u00002\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\u0006\u0010\r\u001a\u00020\f2\u0016\u0010-\u001a\u0012\u0012\u0004\u0012\u00020+0*j\b\u0012\u0004\u0012\u00020+`,H\u0002\u001aS\u0010/\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\u0012\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001e0\u001d2&\u0010'\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\"\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&0!H\u0002ø\u0001\u0000\u001aF\u00103\u001a\u00020\u00062\b\u00100\u001a\u0004\u0018\u00010\u001f2\u0012\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001e0\u001d2\u001e\u00102\u001a\u001a\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000601H\u0000\u001a'\u00108\u001a\u0004\u0018\u0001052\u0006\u00104\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\fH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b6\u00107\u001a&\u0010;\u001a\u00020\u0006*\u00020\u00002\b\u0010:\u001a\u0004\u0018\u0001092\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002\u001a1\u0010@\u001a\u00020\u0006*\u00020\u00002\u0006\u0010=\u001a\u00020<2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b>\u0010?\u001a&\u0010C\u001a\u00020\u0006*\u00020\u00002\b\u0010B\u001a\u0004\u0018\u00010A2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000\u001a&\u0010F\u001a\u00020\u0006*\u00020\u00002\b\u0010E\u001a\u0004\u0018\u00010D2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002\u001a&\u0010I\u001a\u00020\u0006*\u00020\u00002\b\u0010H\u001a\u0004\u0018\u00010G2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002\u001a9\u0010M\u001a\u00020\u0006*\u00020\u00002\u0006\u0010J\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bK\u0010L\u001a&\u0010P\u001a\u00020\u0006*\u00020\u00002\b\u0010O\u001a\u0004\u0018\u00010N2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000\u001a1\u0010R\u001a\u00020\u0006*\u00020\u00002\u0006\u0010=\u001a\u00020<2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bQ\u0010?\u001a3\u0010W\u001a\u00020\u0006*\u00020\u00002\b\u0010T\u001a\u0004\u0018\u00010S2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bU\u0010V\u001a&\u0010Z\u001a\u00020\u0006*\u00020\u00002\b\u0010Y\u001a\u0004\u0018\u00010X2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002\u001a\f\u0010\\\u001a\u00020[*\u00020\u001bH\u0002\u001a\u0016\u0010^\u001a\u00020\u001f*\u0004\u0018\u00010\u001f2\u0006\u0010]\u001a\u00020\u001fH\u0002\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006_"}, d2 = {"Landroid/text/Spannable;", "", "span", "", "start", "end", "Lbn/r;", "setSpan", "Landroidx/compose/ui/text/style/TextIndent;", "textIndent", "", "contextFontSize", "Landroidx/compose/ui/unit/Density;", "density", "setTextIndent", "Landroidx/compose/ui/unit/TextUnit;", "lineHeight", "Landroidx/compose/ui/text/style/LineHeightStyle;", "lineHeightStyle", "setLineHeight-KmRG4DE", "(Landroid/text/Spannable;JFLandroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/style/LineHeightStyle;)V", "setLineHeight", "setLineHeight-r9BaKPg", "(Landroid/text/Spannable;JFLandroidx/compose/ui/unit/Density;)V", "resolveLineHeightInPx-o2QH7mI", "(JFLandroidx/compose/ui/unit/Density;)F", "resolveLineHeightInPx", "Landroidx/compose/ui/text/TextStyle;", "contextTextStyle", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/SpanStyle;", "spanStyles", "Lkotlin/Function4;", "Landroidx/compose/ui/text/font/FontFamily;", "Landroidx/compose/ui/text/font/FontWeight;", "Landroidx/compose/ui/text/font/FontStyle;", "Landroidx/compose/ui/text/font/FontSynthesis;", "Landroid/graphics/Typeface;", "resolveTypeface", "setSpanStyles", "spanStyleRange", "Ljava/util/ArrayList;", "Landroidx/compose/ui/text/platform/extensions/SpanRange;", "Lkotlin/collections/ArrayList;", "lowPrioritySpans", "setSpanStyle", "setFontAttributes", "contextFontSpanStyle", "Lkotlin/Function3;", "block", "flattenFontStylesAndApply", "letterSpacing", "Landroid/text/style/MetricAffectingSpan;", "createLetterSpacingSpan-eAf_CNQ", "(JLandroidx/compose/ui/unit/Density;)Landroid/text/style/MetricAffectingSpan;", "createLetterSpacingSpan", "Landroidx/compose/ui/graphics/Shadow;", "shadow", "setShadow", "Landroidx/compose/ui/graphics/Color;", "color", "setBackground-RPmYEkk", "(Landroid/text/Spannable;JII)V", "setBackground", "Landroidx/compose/ui/text/intl/LocaleList;", "localeList", "setLocaleList", "Landroidx/compose/ui/text/style/TextGeometricTransform;", "textGeometricTransform", "setGeometricTransform", "", "fontFeatureSettings", "setFontFeatureSettings", "fontSize", "setFontSize-KmRG4DE", "(Landroid/text/Spannable;JLandroidx/compose/ui/unit/Density;II)V", "setFontSize", "Landroidx/compose/ui/text/style/TextDecoration;", "textDecoration", "setTextDecoration", "setColor-RPmYEkk", "setColor", "Landroidx/compose/ui/text/style/BaselineShift;", "baselineShift", "setBaselineShift-0ocSgnM", "(Landroid/text/Spannable;Landroidx/compose/ui/text/style/BaselineShift;II)V", "setBaselineShift", "Landroidx/compose/ui/graphics/Brush;", "brush", "setBrush", "", "hasFontAttributes", "spanStyle", "merge", "ui-text_release"}, k = 2, mv = {1, 6, 0})
public final class SpannableExtensions_androidKt {
    /* JADX INFO: renamed from: createLetterSpacingSpan-eAf_CNQ, reason: not valid java name */
    private static final MetricAffectingSpan m3673createLetterSpacingSpaneAf_CNQ(long j10, Density density) {
        long jM4006getTypeUIouoOA = TextUnit.m4006getTypeUIouoOA(j10);
        TextUnitType.Companion companion = TextUnitType.INSTANCE;
        if (TextUnitType.m4035equalsimpl0(jM4006getTypeUIouoOA, companion.m4040getSpUIouoOA())) {
            return new LetterSpacingSpanPx(density.mo305toPxR2X_6o(j10));
        }
        if (TextUnitType.m4035equalsimpl0(jM4006getTypeUIouoOA, companion.m4039getEmUIouoOA())) {
            return new LetterSpacingSpanEm(TextUnit.m4007getValueimpl(j10));
        }
        return null;
    }

    public static final void flattenFontStylesAndApply(@Nullable SpanStyle spanStyle, @NotNull List<AnnotatedString.Range<SpanStyle>> list, @NotNull q<? super SpanStyle, ? super Integer, ? super Integer, r> qVar) {
        p.k(list, "spanStyles");
        p.k(qVar, "block");
        if (list.size() <= 1) {
            if (!list.isEmpty()) {
                qVar.invoke(merge(spanStyle, list.get(0).getItem()), Integer.valueOf(list.get(0).getStart()), Integer.valueOf(list.get(0).getEnd()));
                return;
            }
            return;
        }
        int size = list.size();
        int i10 = size * 2;
        Integer[] numArr = new Integer[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            numArr[i11] = 0;
        }
        int size2 = list.size();
        for (int i12 = 0; i12 < size2; i12++) {
            AnnotatedString.Range<SpanStyle> range = list.get(i12);
            numArr[i12] = Integer.valueOf(range.getStart());
            numArr[i12 + size] = Integer.valueOf(range.getEnd());
        }
        cn.p.F(numArr);
        int iIntValue = ((Number) cn.r.W(numArr)).intValue();
        for (int i13 = 0; i13 < i10; i13++) {
            int iIntValue2 = numArr[i13].intValue();
            if (iIntValue2 != iIntValue) {
                int size3 = list.size();
                SpanStyle spanStyleMerge = spanStyle;
                for (int i14 = 0; i14 < size3; i14++) {
                    AnnotatedString.Range<SpanStyle> range2 = list.get(i14);
                    if (range2.getStart() != range2.getEnd() && AnnotatedStringKt.intersect(iIntValue, iIntValue2, range2.getStart(), range2.getEnd())) {
                        spanStyleMerge = merge(spanStyleMerge, range2.getItem());
                    }
                }
                if (spanStyleMerge != null) {
                    qVar.invoke(spanStyleMerge, Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2));
                }
                iIntValue = iIntValue2;
            }
        }
    }

    private static final boolean hasFontAttributes(TextStyle textStyle) {
        return TextPaintExtensions_androidKt.hasFontAttributes(textStyle.toSpanStyle()) || textStyle.m3493getFontSynthesisZQGJjVo() != null;
    }

    private static final SpanStyle merge(SpanStyle spanStyle, SpanStyle spanStyle2) {
        return spanStyle == null ? spanStyle2 : spanStyle.merge(spanStyle2);
    }

    /* JADX INFO: renamed from: resolveLineHeightInPx-o2QH7mI, reason: not valid java name */
    private static final float m3674resolveLineHeightInPxo2QH7mI(long j10, float f10, Density density) {
        long jM4006getTypeUIouoOA = TextUnit.m4006getTypeUIouoOA(j10);
        TextUnitType.Companion companion = TextUnitType.INSTANCE;
        if (TextUnitType.m4035equalsimpl0(jM4006getTypeUIouoOA, companion.m4040getSpUIouoOA())) {
            return density.mo305toPxR2X_6o(j10);
        }
        if (TextUnitType.m4035equalsimpl0(jM4006getTypeUIouoOA, companion.m4039getEmUIouoOA())) {
            return TextUnit.m4007getValueimpl(j10) * f10;
        }
        return Float.NaN;
    }

    /* JADX INFO: renamed from: setBackground-RPmYEkk, reason: not valid java name */
    public static final void m3675setBackgroundRPmYEkk(@NotNull Spannable spannable, long j10, int i10, int i11) {
        p.k(spannable, "$this$setBackground");
        if (j10 != Color.INSTANCE.m1655getUnspecified0d7_KjU()) {
            setSpan(spannable, new BackgroundColorSpan(ColorKt.m1674toArgb8_81llA(j10)), i10, i11);
        }
    }

    /* JADX INFO: renamed from: setBaselineShift-0ocSgnM, reason: not valid java name */
    private static final void m3676setBaselineShift0ocSgnM(Spannable spannable, BaselineShift baselineShift, int i10, int i11) {
        if (baselineShift != null) {
            setSpan(spannable, new BaselineShiftSpan(baselineShift.m3689unboximpl()), i10, i11);
        }
    }

    private static final void setBrush(Spannable spannable, Brush brush, int i10, int i11) {
        if (brush != null) {
            if (brush instanceof SolidColor) {
                m3677setColorRPmYEkk(spannable, ((SolidColor) brush).getValue(), i10, i11);
            } else if (brush instanceof ShaderBrush) {
                setSpan(spannable, new ShaderBrushSpan((ShaderBrush) brush), i10, i11);
            }
        }
    }

    /* JADX INFO: renamed from: setColor-RPmYEkk, reason: not valid java name */
    public static final void m3677setColorRPmYEkk(@NotNull Spannable spannable, long j10, int i10, int i11) {
        p.k(spannable, "$this$setColor");
        if (j10 != Color.INSTANCE.m1655getUnspecified0d7_KjU()) {
            setSpan(spannable, new ForegroundColorSpan(ColorKt.m1674toArgb8_81llA(j10)), i10, i11);
        }
    }

    private static final void setFontAttributes(final Spannable spannable, TextStyle textStyle, List<AnnotatedString.Range<SpanStyle>> list, final sn.r<? super FontFamily, ? super FontWeight, ? super FontStyle, ? super FontSynthesis, ? extends Typeface> rVar) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            AnnotatedString.Range<SpanStyle> range = list.get(i10);
            AnnotatedString.Range<SpanStyle> range2 = range;
            if (TextPaintExtensions_androidKt.hasFontAttributes(range2.getItem()) || range2.getItem().getFontSynthesis() != null) {
                arrayList.add(range);
            }
        }
        flattenFontStylesAndApply(hasFontAttributes(textStyle) ? new SpanStyle(0L, 0L, textStyle.getFontWeight(), textStyle.m3492getFontStyle4Lr2A7w(), textStyle.m3493getFontSynthesisZQGJjVo(), textStyle.getFontFamily(), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, 16323, (i) null) : null, arrayList, new q<SpanStyle, Integer, Integer, r>() { // from class: androidx.compose.ui.text.platform.extensions.SpannableExtensions_androidKt.setFontAttributes.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // sn.q
            public /* bridge */ /* synthetic */ r invoke(SpanStyle spanStyle, Integer num, Integer num2) {
                invoke(spanStyle, num.intValue(), num2.intValue());
                return r.f5635a;
            }

            public final void invoke(@NotNull SpanStyle spanStyle, int i11, int i12) {
                p.k(spanStyle, "spanStyle");
                Spannable spannable2 = spannable;
                sn.r<FontFamily, FontWeight, FontStyle, FontSynthesis, Typeface> rVar2 = rVar;
                FontFamily fontFamily = spanStyle.getFontFamily();
                FontWeight fontWeight = spanStyle.getFontWeight();
                if (fontWeight == null) {
                    fontWeight = FontWeight.INSTANCE.getNormal();
                }
                FontStyle fontStyle = spanStyle.getFontStyle();
                FontStyle fontStyleM3549boximpl = FontStyle.m3549boximpl(fontStyle != null ? fontStyle.m3555unboximpl() : FontStyle.INSTANCE.m3557getNormal_LCdwA());
                FontSynthesis fontSynthesis = spanStyle.getFontSynthesis();
                spannable2.setSpan(new TypefaceSpan(rVar2.invoke(fontFamily, fontWeight, fontStyleM3549boximpl, FontSynthesis.m3558boximpl(fontSynthesis != null ? fontSynthesis.getValue() : FontSynthesis.INSTANCE.m3567getAllGVVA2EU()))), i11, i12, 33);
            }
        });
    }

    private static final void setFontFeatureSettings(Spannable spannable, String str, int i10, int i11) {
        if (str != null) {
            setSpan(spannable, new FontFeatureSpan(str), i10, i11);
        }
    }

    /* JADX INFO: renamed from: setFontSize-KmRG4DE, reason: not valid java name */
    public static final void m3678setFontSizeKmRG4DE(@NotNull Spannable spannable, long j10, @NotNull Density density, int i10, int i11) {
        p.k(spannable, "$this$setFontSize");
        p.k(density, "density");
        long jM4006getTypeUIouoOA = TextUnit.m4006getTypeUIouoOA(j10);
        TextUnitType.Companion companion = TextUnitType.INSTANCE;
        if (TextUnitType.m4035equalsimpl0(jM4006getTypeUIouoOA, companion.m4040getSpUIouoOA())) {
            setSpan(spannable, new AbsoluteSizeSpan(c.d(density.mo305toPxR2X_6o(j10)), false), i10, i11);
        } else if (TextUnitType.m4035equalsimpl0(jM4006getTypeUIouoOA, companion.m4039getEmUIouoOA())) {
            setSpan(spannable, new RelativeSizeSpan(TextUnit.m4007getValueimpl(j10)), i10, i11);
        }
    }

    private static final void setGeometricTransform(Spannable spannable, TextGeometricTransform textGeometricTransform, int i10, int i11) {
        if (textGeometricTransform != null) {
            setSpan(spannable, new ScaleXSpan(textGeometricTransform.getScaleX()), i10, i11);
            setSpan(spannable, new SkewXSpan(textGeometricTransform.getSkewX()), i10, i11);
        }
    }

    /* JADX INFO: renamed from: setLineHeight-KmRG4DE, reason: not valid java name */
    public static final void m3679setLineHeightKmRG4DE(@NotNull Spannable spannable, long j10, float f10, @NotNull Density density, @NotNull LineHeightStyle lineHeightStyle) {
        p.k(spannable, "$this$setLineHeight");
        p.k(density, "density");
        p.k(lineHeightStyle, "lineHeightStyle");
        float fM3674resolveLineHeightInPxo2QH7mI = m3674resolveLineHeightInPxo2QH7mI(j10, f10, density);
        if (Float.isNaN(fM3674resolveLineHeightInPxo2QH7mI)) {
            return;
        }
        setSpan(spannable, new LineHeightStyleSpan(fM3674resolveLineHeightInPxo2QH7mI, 0, spannable.length(), LineHeightStyle.Trim.m3719isTrimFirstLineTopimpl$ui_text_release(lineHeightStyle.getTrim()), LineHeightStyle.Trim.m3720isTrimLastLineBottomimpl$ui_text_release(lineHeightStyle.getTrim()), lineHeightStyle.getAlignment()), 0, spannable.length());
    }

    /* JADX INFO: renamed from: setLineHeight-r9BaKPg, reason: not valid java name */
    public static final void m3680setLineHeightr9BaKPg(@NotNull Spannable spannable, long j10, float f10, @NotNull Density density) {
        p.k(spannable, "$this$setLineHeight");
        p.k(density, "density");
        float fM3674resolveLineHeightInPxo2QH7mI = m3674resolveLineHeightInPxo2QH7mI(j10, f10, density);
        if (Float.isNaN(fM3674resolveLineHeightInPxo2QH7mI)) {
            return;
        }
        setSpan(spannable, new LineHeightSpan(fM3674resolveLineHeightInPxo2QH7mI), 0, spannable.length());
    }

    public static final void setLocaleList(@NotNull Spannable spannable, @Nullable LocaleList localeList, int i10, int i11) {
        p.k(spannable, "<this>");
        if (localeList != null) {
            setSpan(spannable, LocaleListHelperMethods.INSTANCE.localeSpan(localeList), i10, i11);
        }
    }

    private static final void setShadow(Spannable spannable, Shadow shadow, int i10, int i11) {
        if (shadow != null) {
            setSpan(spannable, new ShadowSpan(ColorKt.m1674toArgb8_81llA(shadow.getColor()), Offset.m1383getXimpl(shadow.getOffset()), Offset.m1384getYimpl(shadow.getOffset()), shadow.getBlurRadius()), i10, i11);
        }
    }

    public static final void setSpan(@NotNull Spannable spannable, @NotNull Object obj, int i10, int i11) {
        p.k(spannable, "<this>");
        p.k(obj, "span");
        spannable.setSpan(obj, i10, i11, 33);
    }

    private static final void setSpanStyle(Spannable spannable, AnnotatedString.Range<SpanStyle> range, Density density, ArrayList<SpanRange> arrayList) {
        int start = range.getStart();
        int end = range.getEnd();
        SpanStyle item = range.getItem();
        m3676setBaselineShift0ocSgnM(spannable, item.getBaselineShift(), start, end);
        m3677setColorRPmYEkk(spannable, item.m3447getColor0d7_KjU(), start, end);
        setBrush(spannable, item.getBrush(), start, end);
        setTextDecoration(spannable, item.getTextDecoration(), start, end);
        m3678setFontSizeKmRG4DE(spannable, item.getFontSize(), density, start, end);
        setFontFeatureSettings(spannable, item.getFontFeatureSettings(), start, end);
        setGeometricTransform(spannable, item.getTextGeometricTransform(), start, end);
        setLocaleList(spannable, item.getLocaleList(), start, end);
        m3675setBackgroundRPmYEkk(spannable, item.getBackground(), start, end);
        setShadow(spannable, item.getShadow(), start, end);
        MetricAffectingSpan metricAffectingSpanM3673createLetterSpacingSpaneAf_CNQ = m3673createLetterSpacingSpaneAf_CNQ(item.getLetterSpacing(), density);
        if (metricAffectingSpanM3673createLetterSpacingSpaneAf_CNQ != null) {
            arrayList.add(new SpanRange(metricAffectingSpanM3673createLetterSpacingSpaneAf_CNQ, start, end));
        }
    }

    public static final void setSpanStyles(@NotNull Spannable spannable, @NotNull TextStyle textStyle, @NotNull List<AnnotatedString.Range<SpanStyle>> list, @NotNull Density density, @NotNull sn.r<? super FontFamily, ? super FontWeight, ? super FontStyle, ? super FontSynthesis, ? extends Typeface> rVar) {
        p.k(spannable, "<this>");
        p.k(textStyle, "contextTextStyle");
        p.k(list, "spanStyles");
        p.k(density, "density");
        p.k(rVar, "resolveTypeface");
        setFontAttributes(spannable, textStyle, list, rVar);
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            AnnotatedString.Range<SpanStyle> range = list.get(i10);
            int start = range.getStart();
            int end = range.getEnd();
            if (start >= 0 && start < spannable.length() && end > start && end <= spannable.length()) {
                setSpanStyle(spannable, range, density, arrayList);
            }
        }
        int size2 = arrayList.size();
        for (int i11 = 0; i11 < size2; i11++) {
            SpanRange spanRange = (SpanRange) arrayList.get(i11);
            setSpan(spannable, spanRange.getSpan(), spanRange.getStart(), spanRange.getEnd());
        }
    }

    public static final void setTextDecoration(@NotNull Spannable spannable, @Nullable TextDecoration textDecoration, int i10, int i11) {
        p.k(spannable, "<this>");
        if (textDecoration != null) {
            TextDecoration.Companion companion = TextDecoration.INSTANCE;
            setSpan(spannable, new TextDecorationSpan(textDecoration.contains(companion.getUnderline()), textDecoration.contains(companion.getLineThrough())), i10, i11);
        }
    }

    public static final void setTextIndent(@NotNull Spannable spannable, @Nullable TextIndent textIndent, float f10, @NotNull Density density) {
        p.k(spannable, "<this>");
        p.k(density, "density");
        if (textIndent != null) {
            if ((TextUnit.m4004equalsimpl0(textIndent.getFirstLine(), TextUnitKt.getSp(0)) && TextUnit.m4004equalsimpl0(textIndent.getRestLine(), TextUnitKt.getSp(0))) || TextUnitKt.m4025isUnspecifiedR2X_6o(textIndent.getFirstLine()) || TextUnitKt.m4025isUnspecifiedR2X_6o(textIndent.getRestLine())) {
                return;
            }
            long jM4006getTypeUIouoOA = TextUnit.m4006getTypeUIouoOA(textIndent.getFirstLine());
            TextUnitType.Companion companion = TextUnitType.INSTANCE;
            float fM4007getValueimpl = 0.0f;
            float fMo305toPxR2X_6o = TextUnitType.m4035equalsimpl0(jM4006getTypeUIouoOA, companion.m4040getSpUIouoOA()) ? density.mo305toPxR2X_6o(textIndent.getFirstLine()) : TextUnitType.m4035equalsimpl0(jM4006getTypeUIouoOA, companion.m4039getEmUIouoOA()) ? TextUnit.m4007getValueimpl(textIndent.getFirstLine()) * f10 : 0.0f;
            long jM4006getTypeUIouoOA2 = TextUnit.m4006getTypeUIouoOA(textIndent.getRestLine());
            if (TextUnitType.m4035equalsimpl0(jM4006getTypeUIouoOA2, companion.m4040getSpUIouoOA())) {
                fM4007getValueimpl = density.mo305toPxR2X_6o(textIndent.getRestLine());
            } else if (TextUnitType.m4035equalsimpl0(jM4006getTypeUIouoOA2, companion.m4039getEmUIouoOA())) {
                fM4007getValueimpl = TextUnit.m4007getValueimpl(textIndent.getRestLine()) * f10;
            }
            setSpan(spannable, new LeadingMarginSpan.Standard((int) Math.ceil(fMo305toPxR2X_6o), (int) Math.ceil(fM4007getValueimpl)), 0, spannable.length());
        }
    }
}
