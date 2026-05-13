package androidx.compose.ui.text;

import androidx.compose.ui.text.AnnotatedString;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import bn.h;
import cn.f0;
import cn.v0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;
import kotlin.Metadata;
import kotlin.collections.a;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import sn.q;
import tn.p;

/* JADX INFO: compiled from: JvmAnnotatedString.jvm.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a,\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\u001e\u0010\u0004\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00020\u0001H\u0000\u001a0\u0010\f\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u00052\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\tH\u0002¨\u0006\r"}, d2 = {"Landroidx/compose/ui/text/AnnotatedString;", "Lkotlin/Function3;", "", "", "transform", "T", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "ranges", "Ljava/util/SortedSet;", TypedValues.AttributesType.S_TARGET, "Lbn/r;", "collectRangeTransitions", "ui-text_release"}, k = 2, mv = {1, 6, 0})
public final class JvmAnnotatedString_jvmKt {
    private static final <T> void collectRangeTransitions(List<AnnotatedString.Range<T>> list, SortedSet<Integer> sortedSet) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            AnnotatedString.Range<T> range = list.get(i10);
            sortedSet.add(Integer.valueOf(range.getStart()));
            sortedSet.add(Integer.valueOf(range.getEnd()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final AnnotatedString transform(@NotNull final AnnotatedString annotatedString, @NotNull final q<? super String, ? super Integer, ? super Integer, String> qVar) {
        p.k(annotatedString, "<this>");
        p.k(qVar, "transform");
        TreeSet treeSetE = v0.e(0, Integer.valueOf(annotatedString.getText().length()));
        collectRangeTransitions(annotatedString.getSpanStyles(), treeSetE);
        collectRangeTransitions(annotatedString.getParagraphStyles(), treeSetE);
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = "";
        final Map mapO = a.o(h.a(0, 0));
        f0.o1(treeSetE, 2, 0, false, new l<List<? extends Integer>, Integer>() { // from class: androidx.compose.ui.text.JvmAnnotatedString_jvmKt.transform.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* JADX WARN: Type inference failed for: r0v8, types: [T, java.lang.String] */
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Integer invoke2(@NotNull List<Integer> list) {
                p.k(list, "<name for destructuring parameter 0>");
                int iIntValue = list.get(0).intValue();
                int iIntValue2 = list.get(1).intValue();
                ref$ObjectRef.element = ref$ObjectRef.element + qVar.invoke(annotatedString.getText(), Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2));
                return mapO.put(Integer.valueOf(iIntValue2), Integer.valueOf(ref$ObjectRef.element.length()));
            }

            @Override // sn.l
            public /* bridge */ /* synthetic */ Integer invoke(List<? extends Integer> list) {
                return invoke2((List<Integer>) list);
            }
        }, 6, null);
        List<AnnotatedString.Range<SpanStyle>> spanStyles = annotatedString.getSpanStyles();
        ArrayList arrayList = new ArrayList(spanStyles.size());
        int size = spanStyles.size();
        for (int i10 = 0; i10 < size; i10++) {
            AnnotatedString.Range<SpanStyle> range = spanStyles.get(i10);
            SpanStyle item = range.getItem();
            Object obj = mapO.get(Integer.valueOf(range.getStart()));
            p.h(obj);
            int iIntValue = ((Number) obj).intValue();
            Object obj2 = mapO.get(Integer.valueOf(range.getEnd()));
            p.h(obj2);
            arrayList.add(new AnnotatedString.Range(item, iIntValue, ((Number) obj2).intValue()));
        }
        List<AnnotatedString.Range<ParagraphStyle>> paragraphStyles = annotatedString.getParagraphStyles();
        ArrayList arrayList2 = new ArrayList(paragraphStyles.size());
        int size2 = paragraphStyles.size();
        for (int i11 = 0; i11 < size2; i11++) {
            AnnotatedString.Range<ParagraphStyle> range2 = paragraphStyles.get(i11);
            ParagraphStyle item2 = range2.getItem();
            Object obj3 = mapO.get(Integer.valueOf(range2.getStart()));
            p.h(obj3);
            int iIntValue2 = ((Number) obj3).intValue();
            Object obj4 = mapO.get(Integer.valueOf(range2.getEnd()));
            p.h(obj4);
            arrayList2.add(new AnnotatedString.Range(item2, iIntValue2, ((Number) obj4).intValue()));
        }
        List<AnnotatedString.Range<? extends Object>> annotations$ui_text_release = annotatedString.getAnnotations$ui_text_release();
        ArrayList arrayList3 = new ArrayList(annotations$ui_text_release.size());
        int size3 = annotations$ui_text_release.size();
        for (int i12 = 0; i12 < size3; i12++) {
            AnnotatedString.Range<? extends Object> range3 = annotations$ui_text_release.get(i12);
            Object item3 = range3.getItem();
            Object obj5 = mapO.get(Integer.valueOf(range3.getStart()));
            p.h(obj5);
            int iIntValue3 = ((Number) obj5).intValue();
            Object obj6 = mapO.get(Integer.valueOf(range3.getEnd()));
            p.h(obj6);
            arrayList3.add(new AnnotatedString.Range(item3, iIntValue3, ((Number) obj6).intValue()));
        }
        return new AnnotatedString((String) ref$ObjectRef.element, arrayList, arrayList2, arrayList3);
    }
}
