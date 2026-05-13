package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.Locale;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.unit.TextUnitType;
import bn.m;
import cn.w;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import sn.p;
import tn.i;

/* JADX INFO: compiled from: Savers.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000Ò\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aL\u0010F\u001a\u0004\u0018\u0001HG\"\u0014\b\u0000\u0010H*\u000e\u0012\u0004\u0012\u0002HI\u0012\u0004\u0012\u0002HJ0\u0001\"\u0004\b\u0001\u0010I\"\u0004\b\u0002\u0010J\"\u0006\b\u0003\u0010G\u0018\u00012\b\u0010K\u001a\u0004\u0018\u0001HJ2\u0006\u0010L\u001a\u0002HHH\u0080\b¢\u0006\u0002\u0010M\u001a\"\u0010F\u001a\u0004\u0018\u0001HG\"\u0006\b\u0000\u0010G\u0018\u00012\b\u0010K\u001a\u0004\u0018\u00010\u0003H\u0080\b¢\u0006\u0002\u0010N\u001aI\u0010O\u001a\u00020\u0003\"\u0014\b\u0000\u0010H*\u000e\u0012\u0004\u0012\u0002HI\u0012\u0004\u0012\u0002HJ0\u0001\"\u0004\b\u0001\u0010I\"\u0004\b\u0002\u0010J2\b\u0010K\u001a\u0004\u0018\u0001HI2\u0006\u0010L\u001a\u0002HH2\u0006\u0010P\u001a\u00020QH\u0000¢\u0006\u0002\u0010R\u001a\u001f\u0010O\u001a\u0004\u0018\u0001HH\"\u0004\b\u0000\u0010H2\b\u0010K\u001a\u0004\u0018\u0001HHH\u0000¢\u0006\u0002\u0010N\" \u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"(\u0010\u0006\u001a\u001c\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00030\b0\u0007\u0012\u0004\u0012\u00020\u00030\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\"\u0010\t\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00030\b\u0012\u0004\u0012\u00020\u00030\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u001d\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00030\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0002\n\u0000\"\u001d\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00030\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0002\n\u0000\"\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00030\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u001a\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00030\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u001a\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00030\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u001d\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00030\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0002\n\u0000\" \u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00030\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0005\"\u001a\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00030\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\" \u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00030\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0005\"\u001a\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00030\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u001a\u0010 \u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00030\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u001a\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00030\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u001d\u0010$\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00030\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0002\n\u0000\"#\u0010&\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u00030\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\b\n\u0000\u0012\u0004\b(\u0010)\"\u001a\u0010*\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u00030\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"'\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00030\u0001*\u00020-8@X\u0080\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b.\u0010/\"'\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00030\u0001*\u0002008@X\u0080\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b.\u00101\"$\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00030\u0001*\u0002028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b.\u00103\"'\u0010,\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00030\u0001*\u0002048@X\u0080\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b.\u00105\"$\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00030\u0001*\u0002068@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b.\u00107\"$\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00030\u0001*\u0002088@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b.\u00109\"$\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00030\u0001*\u00020:8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b.\u0010;\"'\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00030\u0001*\u00020<8@X\u0080\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b.\u0010=\"$\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00030\u0001*\u00020>8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b.\u0010?\"$\u0010,\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00030\u0001*\u00020@8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b.\u0010A\"$\u0010,\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00030\u0001*\u00020B8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b.\u0010C\"'\u0010,\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u00030\u0001*\u00020D8@X\u0080\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b.\u0010E\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006S"}, d2 = {"AnnotatedStringSaver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/text/AnnotatedString;", "", "getAnnotatedStringSaver", "()Landroidx/compose/runtime/saveable/Saver;", "AnnotationRangeListSaver", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "AnnotationRangeSaver", "BaselineShiftSaver", "Landroidx/compose/ui/text/style/BaselineShift;", "ColorSaver", "Landroidx/compose/ui/graphics/Color;", "FontWeightSaver", "Landroidx/compose/ui/text/font/FontWeight;", "LocaleListSaver", "Landroidx/compose/ui/text/intl/LocaleList;", "LocaleSaver", "Landroidx/compose/ui/text/intl/Locale;", "OffsetSaver", "Landroidx/compose/ui/geometry/Offset;", "ParagraphStyleSaver", "Landroidx/compose/ui/text/ParagraphStyle;", "getParagraphStyleSaver", "ShadowSaver", "Landroidx/compose/ui/graphics/Shadow;", "SpanStyleSaver", "Landroidx/compose/ui/text/SpanStyle;", "getSpanStyleSaver", "TextDecorationSaver", "Landroidx/compose/ui/text/style/TextDecoration;", "TextGeometricTransformSaver", "Landroidx/compose/ui/text/style/TextGeometricTransform;", "TextIndentSaver", "Landroidx/compose/ui/text/style/TextIndent;", "TextRangeSaver", "Landroidx/compose/ui/text/TextRange;", "TextUnitSaver", "Landroidx/compose/ui/unit/TextUnit;", "getTextUnitSaver$annotations", "()V", "VerbatimTtsAnnotationSaver", "Landroidx/compose/ui/text/VerbatimTtsAnnotation;", "Saver", "Landroidx/compose/ui/geometry/Offset$Companion;", "getSaver", "(Landroidx/compose/ui/geometry/Offset$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/graphics/Color$Companion;", "(Landroidx/compose/ui/graphics/Color$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/graphics/Shadow$Companion;", "(Landroidx/compose/ui/graphics/Shadow$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/text/TextRange$Companion;", "(Landroidx/compose/ui/text/TextRange$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/text/font/FontWeight$Companion;", "(Landroidx/compose/ui/text/font/FontWeight$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/text/intl/Locale$Companion;", "(Landroidx/compose/ui/text/intl/Locale$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/text/intl/LocaleList$Companion;", "(Landroidx/compose/ui/text/intl/LocaleList$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/text/style/BaselineShift$Companion;", "(Landroidx/compose/ui/text/style/BaselineShift$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/text/style/TextDecoration$Companion;", "(Landroidx/compose/ui/text/style/TextDecoration$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/text/style/TextGeometricTransform$Companion;", "(Landroidx/compose/ui/text/style/TextGeometricTransform$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/text/style/TextIndent$Companion;", "(Landroidx/compose/ui/text/style/TextIndent$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/unit/TextUnit$Companion;", "(Landroidx/compose/ui/unit/TextUnit$Companion;)Landroidx/compose/runtime/saveable/Saver;", "restore", "Result", "T", "Original", "Saveable", "value", "saver", "(Ljava/lang/Object;Landroidx/compose/runtime/saveable/Saver;)Ljava/lang/Object;", "(Ljava/lang/Object;)Ljava/lang/Object;", "save", "scope", "Landroidx/compose/runtime/saveable/SaverScope;", "(Ljava/lang/Object;Landroidx/compose/runtime/saveable/Saver;Landroidx/compose/runtime/saveable/SaverScope;)Ljava/lang/Object;", "ui-text_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class SaversKt {

    @NotNull
    private static final Saver<AnnotatedString, Object> AnnotatedStringSaver = SaverKt.Saver(new p<SaverScope, AnnotatedString, Object>() { // from class: androidx.compose.ui.text.SaversKt$AnnotatedStringSaver$1
        @Override // sn.p
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo2invoke(@NotNull SaverScope saverScope, @NotNull AnnotatedString annotatedString) {
            tn.p.k(saverScope, "$this$Saver");
            tn.p.k(annotatedString, "it");
            return w.g(SaversKt.save(annotatedString.getText()), SaversKt.save(annotatedString.getSpanStyles(), SaversKt.AnnotationRangeListSaver, saverScope), SaversKt.save(annotatedString.getParagraphStyles(), SaversKt.AnnotationRangeListSaver, saverScope), SaversKt.save(annotatedString.getAnnotations$ui_text_release(), SaversKt.AnnotationRangeListSaver, saverScope));
        }
    }, new l<Object, AnnotatedString>() { // from class: androidx.compose.ui.text.SaversKt$AnnotatedStringSaver$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // sn.l
        @Nullable
        public final AnnotatedString invoke(@NotNull Object obj) {
            tn.p.k(obj, "it");
            List list = (List) obj;
            Object obj2 = list.get(0);
            List list2 = null;
            String str = obj2 != null ? (String) obj2 : null;
            tn.p.h(str);
            Object obj3 = list.get(1);
            Saver saver = SaversKt.AnnotationRangeListSaver;
            Boolean bool = Boolean.FALSE;
            List list3 = (tn.p.f(obj3, bool) || obj3 == null) ? null : (List) saver.restore(obj3);
            tn.p.h(list3);
            Object obj4 = list.get(2);
            List list4 = (tn.p.f(obj4, bool) || obj4 == null) ? null : (List) SaversKt.AnnotationRangeListSaver.restore(obj4);
            tn.p.h(list4);
            Object obj5 = list.get(3);
            Saver saver2 = SaversKt.AnnotationRangeListSaver;
            if (!tn.p.f(obj5, bool) && obj5 != null) {
                list2 = (List) saver2.restore(obj5);
            }
            tn.p.h(list2);
            return new AnnotatedString(str, list3, list4, list2);
        }
    });

    @NotNull
    private static final Saver<List<AnnotatedString.Range<? extends Object>>, Object> AnnotationRangeListSaver = SaverKt.Saver(new p<SaverScope, List<? extends AnnotatedString.Range<? extends Object>>, Object>() { // from class: androidx.compose.ui.text.SaversKt$AnnotationRangeListSaver$1
        @Override // sn.p
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo2invoke(@NotNull SaverScope saverScope, @NotNull List<? extends AnnotatedString.Range<? extends Object>> list) {
            tn.p.k(saverScope, "$this$Saver");
            tn.p.k(list, "it");
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.add(SaversKt.save(list.get(i10), SaversKt.AnnotationRangeSaver, saverScope));
            }
            return arrayList;
        }
    }, new l<Object, List<? extends AnnotatedString.Range<? extends Object>>>() { // from class: androidx.compose.ui.text.SaversKt$AnnotationRangeListSaver$2
        @Override // sn.l
        @Nullable
        public final List<? extends AnnotatedString.Range<? extends Object>> invoke(@NotNull Object obj) {
            tn.p.k(obj, "it");
            List list = (List) obj;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                Object obj2 = list.get(i10);
                Saver saver = SaversKt.AnnotationRangeSaver;
                AnnotatedString.Range range = null;
                if (!tn.p.f(obj2, Boolean.FALSE) && obj2 != null) {
                    range = (AnnotatedString.Range) saver.restore(obj2);
                }
                tn.p.h(range);
                arrayList.add(range);
            }
            return arrayList;
        }
    });

    @NotNull
    private static final Saver<AnnotatedString.Range<? extends Object>, Object> AnnotationRangeSaver = SaverKt.Saver(new p<SaverScope, AnnotatedString.Range<? extends Object>, Object>() { // from class: androidx.compose.ui.text.SaversKt$AnnotationRangeSaver$1

        /* JADX INFO: compiled from: Savers.kt */
        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[AnnotationType.values().length];
                iArr[AnnotationType.Paragraph.ordinal()] = 1;
                iArr[AnnotationType.Span.ordinal()] = 2;
                iArr[AnnotationType.VerbatimTts.ordinal()] = 3;
                iArr[AnnotationType.String.ordinal()] = 4;
                $EnumSwitchMapping$0 = iArr;
            }
        }

        @Override // sn.p
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo2invoke(@NotNull SaverScope saverScope, @NotNull AnnotatedString.Range<? extends Object> range) {
            Object objSave;
            tn.p.k(saverScope, "$this$Saver");
            tn.p.k(range, "it");
            Object item = range.getItem();
            AnnotationType annotationType = item instanceof ParagraphStyle ? AnnotationType.Paragraph : item instanceof SpanStyle ? AnnotationType.Span : item instanceof VerbatimTtsAnnotation ? AnnotationType.VerbatimTts : AnnotationType.String;
            int i10 = WhenMappings.$EnumSwitchMapping$0[annotationType.ordinal()];
            if (i10 == 1) {
                objSave = SaversKt.save((ParagraphStyle) range.getItem(), SaversKt.getParagraphStyleSaver(), saverScope);
            } else if (i10 == 2) {
                objSave = SaversKt.save((SpanStyle) range.getItem(), SaversKt.getSpanStyleSaver(), saverScope);
            } else if (i10 == 3) {
                objSave = SaversKt.save((VerbatimTtsAnnotation) range.getItem(), SaversKt.VerbatimTtsAnnotationSaver, saverScope);
            } else {
                if (i10 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                objSave = SaversKt.save(range.getItem());
            }
            return w.g(SaversKt.save(annotationType), objSave, SaversKt.save(Integer.valueOf(range.getStart())), SaversKt.save(Integer.valueOf(range.getEnd())), SaversKt.save(range.getTag()));
        }
    }, new l<Object, AnnotatedString.Range<? extends Object>>() { // from class: androidx.compose.ui.text.SaversKt$AnnotationRangeSaver$2

        /* JADX INFO: compiled from: Savers.kt */
        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[AnnotationType.values().length];
                iArr[AnnotationType.Paragraph.ordinal()] = 1;
                iArr[AnnotationType.Span.ordinal()] = 2;
                iArr[AnnotationType.VerbatimTts.ordinal()] = 3;
                iArr[AnnotationType.String.ordinal()] = 4;
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // sn.l
        @Nullable
        public final AnnotatedString.Range<? extends Object> invoke(@NotNull Object obj) {
            tn.p.k(obj, "it");
            List list = (List) obj;
            Object obj2 = list.get(0);
            AnnotationType annotationType = obj2 != null ? (AnnotationType) obj2 : null;
            tn.p.h(annotationType);
            Object obj3 = list.get(2);
            Integer num = obj3 != null ? (Integer) obj3 : null;
            tn.p.h(num);
            int iIntValue = num.intValue();
            Object obj4 = list.get(3);
            Integer num2 = obj4 != null ? (Integer) obj4 : null;
            tn.p.h(num2);
            int iIntValue2 = num2.intValue();
            Object obj5 = list.get(4);
            String str = obj5 != null ? (String) obj5 : null;
            tn.p.h(str);
            int i10 = WhenMappings.$EnumSwitchMapping$0[annotationType.ordinal()];
            if (i10 == 1) {
                Object obj6 = list.get(1);
                Saver<ParagraphStyle, Object> paragraphStyleSaver = SaversKt.getParagraphStyleSaver();
                if (!tn.p.f(obj6, Boolean.FALSE) && obj6 != null) {
                    paragraphStyleRestore = paragraphStyleSaver.restore(obj6);
                }
                tn.p.h(paragraphStyleRestore);
                return new AnnotatedString.Range<>(paragraphStyleRestore, iIntValue, iIntValue2, str);
            }
            if (i10 == 2) {
                Object obj7 = list.get(1);
                Saver<SpanStyle, Object> spanStyleSaver = SaversKt.getSpanStyleSaver();
                if (!tn.p.f(obj7, Boolean.FALSE) && obj7 != null) {
                    paragraphStyleRestore = spanStyleSaver.restore(obj7);
                }
                tn.p.h(paragraphStyleRestore);
                return new AnnotatedString.Range<>(paragraphStyleRestore, iIntValue, iIntValue2, str);
            }
            if (i10 != 3) {
                if (i10 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                Object obj8 = list.get(1);
                paragraphStyleRestore = obj8 != null ? (String) obj8 : null;
                tn.p.h(paragraphStyleRestore);
                return new AnnotatedString.Range<>(paragraphStyleRestore, iIntValue, iIntValue2, str);
            }
            Object obj9 = list.get(1);
            Saver saver = SaversKt.VerbatimTtsAnnotationSaver;
            if (!tn.p.f(obj9, Boolean.FALSE) && obj9 != null) {
                paragraphStyleRestore = (VerbatimTtsAnnotation) saver.restore(obj9);
            }
            tn.p.h(paragraphStyleRestore);
            return new AnnotatedString.Range<>(paragraphStyleRestore, iIntValue, iIntValue2, str);
        }
    });

    @NotNull
    private static final Saver<VerbatimTtsAnnotation, Object> VerbatimTtsAnnotationSaver = SaverKt.Saver(new p<SaverScope, VerbatimTtsAnnotation, Object>() { // from class: androidx.compose.ui.text.SaversKt$VerbatimTtsAnnotationSaver$1
        @Override // sn.p
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo2invoke(@NotNull SaverScope saverScope, @NotNull VerbatimTtsAnnotation verbatimTtsAnnotation) {
            tn.p.k(saverScope, "$this$Saver");
            tn.p.k(verbatimTtsAnnotation, "it");
            return SaversKt.save(verbatimTtsAnnotation.getVerbatim());
        }
    }, new l<Object, VerbatimTtsAnnotation>() { // from class: androidx.compose.ui.text.SaversKt$VerbatimTtsAnnotationSaver$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // sn.l
        @Nullable
        public final VerbatimTtsAnnotation invoke(@NotNull Object obj) {
            tn.p.k(obj, "it");
            return new VerbatimTtsAnnotation((String) obj);
        }
    });

    @NotNull
    private static final Saver<ParagraphStyle, Object> ParagraphStyleSaver = SaverKt.Saver(new p<SaverScope, ParagraphStyle, Object>() { // from class: androidx.compose.ui.text.SaversKt$ParagraphStyleSaver$1
        @Override // sn.p
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo2invoke(@NotNull SaverScope saverScope, @NotNull ParagraphStyle paragraphStyle) {
            tn.p.k(saverScope, "$this$Saver");
            tn.p.k(paragraphStyle, "it");
            return w.g(SaversKt.save(paragraphStyle.getTextAlign()), SaversKt.save(paragraphStyle.getTextDirection()), SaversKt.save(TextUnit.m3997boximpl(paragraphStyle.getLineHeight()), SaversKt.getSaver(TextUnit.INSTANCE), saverScope), SaversKt.save(paragraphStyle.getTextIndent(), SaversKt.getSaver(TextIndent.INSTANCE), saverScope));
        }
    }, new l<Object, ParagraphStyle>() { // from class: androidx.compose.ui.text.SaversKt$ParagraphStyleSaver$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // sn.l
        @Nullable
        public final ParagraphStyle invoke(@NotNull Object obj) {
            tn.p.k(obj, "it");
            List list = (List) obj;
            Object obj2 = list.get(0);
            TextAlign textAlign = obj2 != null ? (TextAlign) obj2 : null;
            Object obj3 = list.get(1);
            TextDirection textDirection = obj3 != null ? (TextDirection) obj3 : null;
            Object obj4 = list.get(2);
            Saver<TextUnit, Object> saver = SaversKt.getSaver(TextUnit.INSTANCE);
            Boolean bool = Boolean.FALSE;
            TextUnit textUnitRestore = (tn.p.f(obj4, bool) || obj4 == null) ? null : saver.restore(obj4);
            tn.p.h(textUnitRestore);
            long packedValue = textUnitRestore.getPackedValue();
            Object obj5 = list.get(3);
            return new ParagraphStyle(textAlign, textDirection, packedValue, (tn.p.f(obj5, bool) || obj5 == null) ? null : SaversKt.getSaver(TextIndent.INSTANCE).restore(obj5), null);
        }
    });

    @NotNull
    private static final Saver<SpanStyle, Object> SpanStyleSaver = SaverKt.Saver(new p<SaverScope, SpanStyle, Object>() { // from class: androidx.compose.ui.text.SaversKt$SpanStyleSaver$1
        @Override // sn.p
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo2invoke(@NotNull SaverScope saverScope, @NotNull SpanStyle spanStyle) {
            tn.p.k(saverScope, "$this$Saver");
            tn.p.k(spanStyle, "it");
            Color colorM1609boximpl = Color.m1609boximpl(spanStyle.m3447getColor0d7_KjU());
            Color.Companion companion = Color.INSTANCE;
            TextUnit textUnitM3997boximpl = TextUnit.m3997boximpl(spanStyle.getFontSize());
            TextUnit.Companion companion2 = TextUnit.INSTANCE;
            return w.g(SaversKt.save(colorM1609boximpl, SaversKt.getSaver(companion), saverScope), SaversKt.save(textUnitM3997boximpl, SaversKt.getSaver(companion2), saverScope), SaversKt.save(spanStyle.getFontWeight(), SaversKt.getSaver(FontWeight.INSTANCE), saverScope), SaversKt.save(spanStyle.getFontStyle()), SaversKt.save(spanStyle.getFontSynthesis()), SaversKt.save(-1), SaversKt.save(spanStyle.getFontFeatureSettings()), SaversKt.save(TextUnit.m3997boximpl(spanStyle.getLetterSpacing()), SaversKt.getSaver(companion2), saverScope), SaversKt.save(spanStyle.getBaselineShift(), SaversKt.getSaver(BaselineShift.INSTANCE), saverScope), SaversKt.save(spanStyle.getTextGeometricTransform(), SaversKt.getSaver(TextGeometricTransform.INSTANCE), saverScope), SaversKt.save(spanStyle.getLocaleList(), SaversKt.getSaver(LocaleList.INSTANCE), saverScope), SaversKt.save(Color.m1609boximpl(spanStyle.getBackground()), SaversKt.getSaver(companion), saverScope), SaversKt.save(spanStyle.getTextDecoration(), SaversKt.getSaver(TextDecoration.INSTANCE), saverScope), SaversKt.save(spanStyle.getShadow(), SaversKt.getSaver(Shadow.INSTANCE), saverScope));
        }
    }, new l<Object, SpanStyle>() { // from class: androidx.compose.ui.text.SaversKt$SpanStyleSaver$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // sn.l
        @Nullable
        public final SpanStyle invoke(@NotNull Object obj) {
            tn.p.k(obj, "it");
            List list = (List) obj;
            Object obj2 = list.get(0);
            Color.Companion companion = Color.INSTANCE;
            Saver<Color, Object> saver = SaversKt.getSaver(companion);
            Boolean bool = Boolean.FALSE;
            Color colorRestore = (tn.p.f(obj2, bool) || obj2 == null) ? null : saver.restore(obj2);
            tn.p.h(colorRestore);
            long jM1629unboximpl = colorRestore.m1629unboximpl();
            Object obj3 = list.get(1);
            TextUnit.Companion companion2 = TextUnit.INSTANCE;
            TextUnit textUnitRestore = (tn.p.f(obj3, bool) || obj3 == null) ? null : SaversKt.getSaver(companion2).restore(obj3);
            tn.p.h(textUnitRestore);
            long packedValue = textUnitRestore.getPackedValue();
            Object obj4 = list.get(2);
            FontWeight fontWeightRestore = (tn.p.f(obj4, bool) || obj4 == null) ? null : SaversKt.getSaver(FontWeight.INSTANCE).restore(obj4);
            Object obj5 = list.get(3);
            FontStyle fontStyle = obj5 != null ? (FontStyle) obj5 : null;
            Object obj6 = list.get(4);
            FontSynthesis fontSynthesis = obj6 != null ? (FontSynthesis) obj6 : null;
            Object obj7 = list.get(6);
            String str = obj7 != null ? (String) obj7 : null;
            Object obj8 = list.get(7);
            TextUnit textUnitRestore2 = (tn.p.f(obj8, bool) || obj8 == null) ? null : SaversKt.getSaver(companion2).restore(obj8);
            tn.p.h(textUnitRestore2);
            long packedValue2 = textUnitRestore2.getPackedValue();
            Object obj9 = list.get(8);
            BaselineShift baselineShiftRestore = (tn.p.f(obj9, bool) || obj9 == null) ? null : SaversKt.getSaver(BaselineShift.INSTANCE).restore(obj9);
            Object obj10 = list.get(9);
            TextGeometricTransform textGeometricTransformRestore = (tn.p.f(obj10, bool) || obj10 == null) ? null : SaversKt.getSaver(TextGeometricTransform.INSTANCE).restore(obj10);
            Object obj11 = list.get(10);
            LocaleList localeListRestore = (tn.p.f(obj11, bool) || obj11 == null) ? null : SaversKt.getSaver(LocaleList.INSTANCE).restore(obj11);
            Object obj12 = list.get(11);
            Color colorRestore2 = (tn.p.f(obj12, bool) || obj12 == null) ? null : SaversKt.getSaver(companion).restore(obj12);
            tn.p.h(colorRestore2);
            long jM1629unboximpl2 = colorRestore2.m1629unboximpl();
            Object obj13 = list.get(12);
            TextDecoration textDecorationRestore = (tn.p.f(obj13, bool) || obj13 == null) ? null : SaversKt.getSaver(TextDecoration.INSTANCE).restore(obj13);
            Object obj14 = list.get(13);
            return new SpanStyle(jM1629unboximpl, packedValue, fontWeightRestore, fontStyle, fontSynthesis, (FontFamily) null, str, packedValue2, baselineShiftRestore, textGeometricTransformRestore, localeListRestore, jM1629unboximpl2, textDecorationRestore, (tn.p.f(obj14, bool) || obj14 == null) ? null : SaversKt.getSaver(Shadow.INSTANCE).restore(obj14), 32, (i) null);
        }
    });

    @NotNull
    private static final Saver<TextDecoration, Object> TextDecorationSaver = SaverKt.Saver(new p<SaverScope, TextDecoration, Object>() { // from class: androidx.compose.ui.text.SaversKt$TextDecorationSaver$1
        @Override // sn.p
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo2invoke(@NotNull SaverScope saverScope, @NotNull TextDecoration textDecoration) {
            tn.p.k(saverScope, "$this$Saver");
            tn.p.k(textDecoration, "it");
            return Integer.valueOf(textDecoration.getMask());
        }
    }, new l<Object, TextDecoration>() { // from class: androidx.compose.ui.text.SaversKt$TextDecorationSaver$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // sn.l
        @Nullable
        public final TextDecoration invoke(@NotNull Object obj) {
            tn.p.k(obj, "it");
            return new TextDecoration(((Integer) obj).intValue());
        }
    });

    @NotNull
    private static final Saver<TextGeometricTransform, Object> TextGeometricTransformSaver = SaverKt.Saver(new p<SaverScope, TextGeometricTransform, Object>() { // from class: androidx.compose.ui.text.SaversKt$TextGeometricTransformSaver$1
        @Override // sn.p
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo2invoke(@NotNull SaverScope saverScope, @NotNull TextGeometricTransform textGeometricTransform) {
            tn.p.k(saverScope, "$this$Saver");
            tn.p.k(textGeometricTransform, "it");
            return w.g(Float.valueOf(textGeometricTransform.getScaleX()), Float.valueOf(textGeometricTransform.getSkewX()));
        }
    }, new l<Object, TextGeometricTransform>() { // from class: androidx.compose.ui.text.SaversKt$TextGeometricTransformSaver$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // sn.l
        @Nullable
        public final TextGeometricTransform invoke(@NotNull Object obj) {
            tn.p.k(obj, "it");
            List list = (List) obj;
            return new TextGeometricTransform(((Number) list.get(0)).floatValue(), ((Number) list.get(1)).floatValue());
        }
    });

    @NotNull
    private static final Saver<TextIndent, Object> TextIndentSaver = SaverKt.Saver(new p<SaverScope, TextIndent, Object>() { // from class: androidx.compose.ui.text.SaversKt$TextIndentSaver$1
        @Override // sn.p
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo2invoke(@NotNull SaverScope saverScope, @NotNull TextIndent textIndent) {
            tn.p.k(saverScope, "$this$Saver");
            tn.p.k(textIndent, "it");
            TextUnit textUnitM3997boximpl = TextUnit.m3997boximpl(textIndent.getFirstLine());
            TextUnit.Companion companion = TextUnit.INSTANCE;
            return w.g(SaversKt.save(textUnitM3997boximpl, SaversKt.getSaver(companion), saverScope), SaversKt.save(TextUnit.m3997boximpl(textIndent.getRestLine()), SaversKt.getSaver(companion), saverScope));
        }
    }, new l<Object, TextIndent>() { // from class: androidx.compose.ui.text.SaversKt$TextIndentSaver$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // sn.l
        @Nullable
        public final TextIndent invoke(@NotNull Object obj) {
            tn.p.k(obj, "it");
            List list = (List) obj;
            Object obj2 = list.get(0);
            TextUnit.Companion companion = TextUnit.INSTANCE;
            Saver<TextUnit, Object> saver = SaversKt.getSaver(companion);
            Boolean bool = Boolean.FALSE;
            TextUnit textUnitRestore = null;
            TextUnit textUnitRestore2 = (tn.p.f(obj2, bool) || obj2 == null) ? null : saver.restore(obj2);
            tn.p.h(textUnitRestore2);
            long packedValue = textUnitRestore2.getPackedValue();
            Object obj3 = list.get(1);
            Saver<TextUnit, Object> saver2 = SaversKt.getSaver(companion);
            if (!tn.p.f(obj3, bool) && obj3 != null) {
                textUnitRestore = saver2.restore(obj3);
            }
            tn.p.h(textUnitRestore);
            return new TextIndent(packedValue, textUnitRestore.getPackedValue(), null);
        }
    });

    @NotNull
    private static final Saver<FontWeight, Object> FontWeightSaver = SaverKt.Saver(new p<SaverScope, FontWeight, Object>() { // from class: androidx.compose.ui.text.SaversKt$FontWeightSaver$1
        @Override // sn.p
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo2invoke(@NotNull SaverScope saverScope, @NotNull FontWeight fontWeight) {
            tn.p.k(saverScope, "$this$Saver");
            tn.p.k(fontWeight, "it");
            return Integer.valueOf(fontWeight.getWeight());
        }
    }, new l<Object, FontWeight>() { // from class: androidx.compose.ui.text.SaversKt$FontWeightSaver$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // sn.l
        @Nullable
        public final FontWeight invoke(@NotNull Object obj) {
            tn.p.k(obj, "it");
            return new FontWeight(((Integer) obj).intValue());
        }
    });

    @NotNull
    private static final Saver<BaselineShift, Object> BaselineShiftSaver = SaverKt.Saver(new p<SaverScope, BaselineShift, Object>() { // from class: androidx.compose.ui.text.SaversKt$BaselineShiftSaver$1
        @Override // sn.p
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo2invoke(SaverScope saverScope, BaselineShift baselineShift) {
            return m3429invoke8a2Sb4w(saverScope, baselineShift.m3689unboximpl());
        }

        @Nullable
        /* JADX INFO: renamed from: invoke-8a2Sb4w, reason: not valid java name */
        public final Object m3429invoke8a2Sb4w(@NotNull SaverScope saverScope, float f10) {
            tn.p.k(saverScope, "$this$Saver");
            return Float.valueOf(f10);
        }
    }, new l<Object, BaselineShift>() { // from class: androidx.compose.ui.text.SaversKt$BaselineShiftSaver$2
        @Override // sn.l
        @Nullable
        /* JADX INFO: renamed from: invoke-jTk7eUs, reason: not valid java name and merged with bridge method [inline-methods] */
        public final BaselineShift invoke(@NotNull Object obj) {
            tn.p.k(obj, "it");
            return BaselineShift.m3683boximpl(BaselineShift.m3684constructorimpl(((Float) obj).floatValue()));
        }
    });

    @NotNull
    private static final Saver<TextRange, Object> TextRangeSaver = SaverKt.Saver(new p<SaverScope, TextRange, Object>() { // from class: androidx.compose.ui.text.SaversKt$TextRangeSaver$1
        @Override // sn.p
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo2invoke(SaverScope saverScope, TextRange textRange) {
            return m3435invokeFDrldGo(saverScope, textRange.getPackedValue());
        }

        @Nullable
        /* JADX INFO: renamed from: invoke-FDrldGo, reason: not valid java name */
        public final Object m3435invokeFDrldGo(@NotNull SaverScope saverScope, long j10) {
            tn.p.k(saverScope, "$this$Saver");
            return w.g((Integer) SaversKt.save(Integer.valueOf(TextRange.m3474getStartimpl(j10))), (Integer) SaversKt.save(Integer.valueOf(TextRange.m3469getEndimpl(j10))));
        }
    }, new l<Object, TextRange>() { // from class: androidx.compose.ui.text.SaversKt$TextRangeSaver$2
        @Override // sn.l
        @Nullable
        /* JADX INFO: renamed from: invoke-VqIyPBM, reason: not valid java name and merged with bridge method [inline-methods] */
        public final TextRange invoke(@NotNull Object obj) {
            tn.p.k(obj, "it");
            List list = (List) obj;
            Object obj2 = list.get(0);
            Integer num = obj2 != null ? (Integer) obj2 : null;
            tn.p.h(num);
            int iIntValue = num.intValue();
            Object obj3 = list.get(1);
            Integer num2 = obj3 != null ? (Integer) obj3 : null;
            tn.p.h(num2);
            return TextRange.m3462boximpl(TextRangeKt.TextRange(iIntValue, num2.intValue()));
        }
    });

    @NotNull
    private static final Saver<Shadow, Object> ShadowSaver = SaverKt.Saver(new p<SaverScope, Shadow, Object>() { // from class: androidx.compose.ui.text.SaversKt$ShadowSaver$1
        @Override // sn.p
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo2invoke(@NotNull SaverScope saverScope, @NotNull Shadow shadow) {
            tn.p.k(saverScope, "$this$Saver");
            tn.p.k(shadow, "it");
            return w.g(SaversKt.save(Color.m1609boximpl(shadow.getColor()), SaversKt.getSaver(Color.INSTANCE), saverScope), SaversKt.save(Offset.m1372boximpl(shadow.getOffset()), SaversKt.getSaver(Offset.INSTANCE), saverScope), SaversKt.save(Float.valueOf(shadow.getBlurRadius())));
        }
    }, new l<Object, Shadow>() { // from class: androidx.compose.ui.text.SaversKt$ShadowSaver$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // sn.l
        @Nullable
        public final Shadow invoke(@NotNull Object obj) {
            tn.p.k(obj, "it");
            List list = (List) obj;
            Object obj2 = list.get(0);
            Saver<Color, Object> saver = SaversKt.getSaver(Color.INSTANCE);
            Boolean bool = Boolean.FALSE;
            Color colorRestore = (tn.p.f(obj2, bool) || obj2 == null) ? null : saver.restore(obj2);
            tn.p.h(colorRestore);
            long jM1629unboximpl = colorRestore.m1629unboximpl();
            Object obj3 = list.get(1);
            Offset offsetRestore = (tn.p.f(obj3, bool) || obj3 == null) ? null : SaversKt.getSaver(Offset.INSTANCE).restore(obj3);
            tn.p.h(offsetRestore);
            long packedValue = offsetRestore.getPackedValue();
            Object obj4 = list.get(2);
            Float f10 = obj4 != null ? (Float) obj4 : null;
            tn.p.h(f10);
            return new Shadow(jM1629unboximpl, packedValue, f10.floatValue(), null);
        }
    });

    @NotNull
    private static final Saver<Color, Object> ColorSaver = SaverKt.Saver(new p<SaverScope, Color, Object>() { // from class: androidx.compose.ui.text.SaversKt$ColorSaver$1
        @Override // sn.p
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo2invoke(SaverScope saverScope, Color color) {
            return m3431invoke4WTKRHQ(saverScope, color.m1629unboximpl());
        }

        @Nullable
        /* JADX INFO: renamed from: invoke-4WTKRHQ, reason: not valid java name */
        public final Object m3431invoke4WTKRHQ(@NotNull SaverScope saverScope, long j10) {
            tn.p.k(saverScope, "$this$Saver");
            return m.a(j10);
        }
    }, new l<Object, Color>() { // from class: androidx.compose.ui.text.SaversKt$ColorSaver$2
        @Override // sn.l
        @Nullable
        /* JADX INFO: renamed from: invoke-ijrfgN4, reason: not valid java name and merged with bridge method [inline-methods] */
        public final Color invoke(@NotNull Object obj) {
            tn.p.k(obj, "it");
            return Color.m1609boximpl(Color.m1615constructorimpl(((m) obj).f()));
        }
    });

    @NotNull
    private static final Saver<TextUnit, Object> TextUnitSaver = SaverKt.Saver(new p<SaverScope, TextUnit, Object>() { // from class: androidx.compose.ui.text.SaversKt$TextUnitSaver$1
        @Override // sn.p
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo2invoke(SaverScope saverScope, TextUnit textUnit) {
            return m3437invokempE4wyQ(saverScope, textUnit.getPackedValue());
        }

        @Nullable
        /* JADX INFO: renamed from: invoke-mpE4wyQ, reason: not valid java name */
        public final Object m3437invokempE4wyQ(@NotNull SaverScope saverScope, long j10) {
            tn.p.k(saverScope, "$this$Saver");
            return w.g(SaversKt.save(Float.valueOf(TextUnit.m4007getValueimpl(j10))), SaversKt.save(TextUnitType.m4032boximpl(TextUnit.m4006getTypeUIouoOA(j10))));
        }
    }, new l<Object, TextUnit>() { // from class: androidx.compose.ui.text.SaversKt$TextUnitSaver$2
        @Override // sn.l
        @Nullable
        /* JADX INFO: renamed from: invoke-XNhUCwk, reason: not valid java name and merged with bridge method [inline-methods] */
        public final TextUnit invoke(@NotNull Object obj) {
            tn.p.k(obj, "it");
            List list = (List) obj;
            Object obj2 = list.get(0);
            Float f10 = obj2 != null ? (Float) obj2 : null;
            tn.p.h(f10);
            float fFloatValue = f10.floatValue();
            Object obj3 = list.get(1);
            TextUnitType textUnitType = obj3 != null ? (TextUnitType) obj3 : null;
            tn.p.h(textUnitType);
            return TextUnit.m3997boximpl(TextUnitKt.m4019TextUnitanM5pPY(fFloatValue, textUnitType.getType()));
        }
    });

    @NotNull
    private static final Saver<Offset, Object> OffsetSaver = SaverKt.Saver(new p<SaverScope, Offset, Object>() { // from class: androidx.compose.ui.text.SaversKt$OffsetSaver$1
        @Override // sn.p
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo2invoke(SaverScope saverScope, Offset offset) {
            return m3433invokeUv8p0NA(saverScope, offset.getPackedValue());
        }

        @Nullable
        /* JADX INFO: renamed from: invoke-Uv8p0NA, reason: not valid java name */
        public final Object m3433invokeUv8p0NA(@NotNull SaverScope saverScope, long j10) {
            tn.p.k(saverScope, "$this$Saver");
            return Offset.m1380equalsimpl0(j10, Offset.INSTANCE.m1398getUnspecifiedF1C5BW0()) ? Boolean.FALSE : w.g((Float) SaversKt.save(Float.valueOf(Offset.m1383getXimpl(j10))), (Float) SaversKt.save(Float.valueOf(Offset.m1384getYimpl(j10))));
        }
    }, new l<Object, Offset>() { // from class: androidx.compose.ui.text.SaversKt$OffsetSaver$2
        @Override // sn.l
        @Nullable
        /* JADX INFO: renamed from: invoke-x-9fifI, reason: not valid java name and merged with bridge method [inline-methods] */
        public final Offset invoke(@NotNull Object obj) {
            tn.p.k(obj, "it");
            if (tn.p.f(obj, Boolean.FALSE)) {
                return Offset.m1372boximpl(Offset.INSTANCE.m1398getUnspecifiedF1C5BW0());
            }
            List list = (List) obj;
            Object obj2 = list.get(0);
            Float f10 = obj2 != null ? (Float) obj2 : null;
            tn.p.h(f10);
            float fFloatValue = f10.floatValue();
            Object obj3 = list.get(1);
            Float f11 = obj3 != null ? (Float) obj3 : null;
            tn.p.h(f11);
            return Offset.m1372boximpl(OffsetKt.Offset(fFloatValue, f11.floatValue()));
        }
    });

    @NotNull
    private static final Saver<LocaleList, Object> LocaleListSaver = SaverKt.Saver(new p<SaverScope, LocaleList, Object>() { // from class: androidx.compose.ui.text.SaversKt$LocaleListSaver$1
        @Override // sn.p
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo2invoke(@NotNull SaverScope saverScope, @NotNull LocaleList localeList) {
            tn.p.k(saverScope, "$this$Saver");
            tn.p.k(localeList, "it");
            List<Locale> localeList2 = localeList.getLocaleList();
            ArrayList arrayList = new ArrayList(localeList2.size());
            int size = localeList2.size();
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.add(SaversKt.save(localeList2.get(i10), SaversKt.getSaver(Locale.INSTANCE), saverScope));
            }
            return arrayList;
        }
    }, new l<Object, LocaleList>() { // from class: androidx.compose.ui.text.SaversKt$LocaleListSaver$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // sn.l
        @Nullable
        public final LocaleList invoke(@NotNull Object obj) {
            tn.p.k(obj, "it");
            List list = (List) obj;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                Object obj2 = list.get(i10);
                Saver<Locale, Object> saver = SaversKt.getSaver(Locale.INSTANCE);
                Locale localeRestore = null;
                if (!tn.p.f(obj2, Boolean.FALSE) && obj2 != null) {
                    localeRestore = saver.restore(obj2);
                }
                tn.p.h(localeRestore);
                arrayList.add(localeRestore);
            }
            return new LocaleList(arrayList);
        }
    });

    @NotNull
    private static final Saver<Locale, Object> LocaleSaver = SaverKt.Saver(new p<SaverScope, Locale, Object>() { // from class: androidx.compose.ui.text.SaversKt$LocaleSaver$1
        @Override // sn.p
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo2invoke(@NotNull SaverScope saverScope, @NotNull Locale locale) {
            tn.p.k(saverScope, "$this$Saver");
            tn.p.k(locale, "it");
            return locale.toLanguageTag();
        }
    }, new l<Object, Locale>() { // from class: androidx.compose.ui.text.SaversKt$LocaleSaver$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // sn.l
        @Nullable
        public final Locale invoke(@NotNull Object obj) {
            tn.p.k(obj, "it");
            return new Locale((String) obj);
        }
    });

    @NotNull
    public static final Saver<AnnotatedString, Object> getAnnotatedStringSaver() {
        return AnnotatedStringSaver;
    }

    @NotNull
    public static final Saver<ParagraphStyle, Object> getParagraphStyleSaver() {
        return ParagraphStyleSaver;
    }

    @NotNull
    public static final Saver<Offset, Object> getSaver(@NotNull Offset.Companion companion) {
        tn.p.k(companion, "<this>");
        return OffsetSaver;
    }

    @NotNull
    public static final Saver<Color, Object> getSaver(@NotNull Color.Companion companion) {
        tn.p.k(companion, "<this>");
        return ColorSaver;
    }

    @NotNull
    public static final Saver<Shadow, Object> getSaver(@NotNull Shadow.Companion companion) {
        tn.p.k(companion, "<this>");
        return ShadowSaver;
    }

    @NotNull
    public static final Saver<TextRange, Object> getSaver(@NotNull TextRange.Companion companion) {
        tn.p.k(companion, "<this>");
        return TextRangeSaver;
    }

    @NotNull
    public static final Saver<FontWeight, Object> getSaver(@NotNull FontWeight.Companion companion) {
        tn.p.k(companion, "<this>");
        return FontWeightSaver;
    }

    @NotNull
    public static final Saver<Locale, Object> getSaver(@NotNull Locale.Companion companion) {
        tn.p.k(companion, "<this>");
        return LocaleSaver;
    }

    @NotNull
    public static final Saver<LocaleList, Object> getSaver(@NotNull LocaleList.Companion companion) {
        tn.p.k(companion, "<this>");
        return LocaleListSaver;
    }

    @NotNull
    public static final Saver<BaselineShift, Object> getSaver(@NotNull BaselineShift.Companion companion) {
        tn.p.k(companion, "<this>");
        return BaselineShiftSaver;
    }

    @NotNull
    public static final Saver<TextDecoration, Object> getSaver(@NotNull TextDecoration.Companion companion) {
        tn.p.k(companion, "<this>");
        return TextDecorationSaver;
    }

    @NotNull
    public static final Saver<TextGeometricTransform, Object> getSaver(@NotNull TextGeometricTransform.Companion companion) {
        tn.p.k(companion, "<this>");
        return TextGeometricTransformSaver;
    }

    @NotNull
    public static final Saver<TextIndent, Object> getSaver(@NotNull TextIndent.Companion companion) {
        tn.p.k(companion, "<this>");
        return TextIndentSaver;
    }

    @NotNull
    public static final Saver<TextUnit, Object> getSaver(@NotNull TextUnit.Companion companion) {
        tn.p.k(companion, "<this>");
        return TextUnitSaver;
    }

    @NotNull
    public static final Saver<SpanStyle, Object> getSpanStyleSaver() {
        return SpanStyleSaver;
    }

    private static /* synthetic */ void getTextUnitSaver$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ <Result> Result restore(Object obj) {
        if (obj == 0) {
            return null;
        }
        tn.p.q(1, "Result");
        return obj;
    }

    public static final /* synthetic */ <T extends Saver<Original, Saveable>, Original, Saveable, Result> Result restore(Saveable saveable, T t10) {
        tn.p.k(t10, "saver");
        if (tn.p.f(saveable, Boolean.FALSE) || saveable == null) {
            return null;
        }
        Result result = (Result) t10.restore(saveable);
        tn.p.q(1, "Result");
        return result;
    }

    @Nullable
    public static final <T> T save(@Nullable T t10) {
        return t10;
    }

    @NotNull
    public static final <T extends Saver<Original, Saveable>, Original, Saveable> Object save(@Nullable Original original, @NotNull T t10, @NotNull SaverScope saverScope) {
        Object objSave;
        tn.p.k(t10, "saver");
        tn.p.k(saverScope, "scope");
        return (original == null || (objSave = t10.save(saverScope, original)) == null) ? Boolean.FALSE : objSave;
    }
}
