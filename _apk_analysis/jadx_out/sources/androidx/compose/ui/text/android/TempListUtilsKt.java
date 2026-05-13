package androidx.compose.ui.text.android;

import a.i;
import bn.r;
import cn.w;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import sn.l;
import tn.p;

/* JADX INFO: compiled from: TempListUtils.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001f\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a;\u0010\u0005\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0002H\u0080\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001ab\u0010\u000b\u001a\u00028\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0006\"\u0010\b\u0002\u0010\b*\n\u0012\u0006\b\u0000\u0012\u00028\u00010\u0007*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\t\u001a\u00028\u00022\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0080\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b\u000b\u0010\f\u001aM\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0006*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\rH\u0080\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000f"}, d2 = {"T", "", "Lkotlin/Function1;", "Lbn/r;", "action", "fastForEach", "R", "", "C", "destination", "transform", "fastMapTo", "(Ljava/util/List;Ljava/util/Collection;Lsn/l;)Ljava/util/Collection;", "Lkotlin/Function2;", "fastZipWithNext", "ui-text_release"}, k = 2, mv = {1, 6, 0})
public final class TempListUtilsKt {
    public static final <T> void fastForEach(@NotNull List<? extends T> list, @NotNull l<? super T, r> lVar) {
        p.k(list, "<this>");
        p.k(lVar, "action");
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            lVar.invoke(list.get(i10));
        }
    }

    @NotNull
    public static final <T, R, C extends Collection<? super R>> C fastMapTo(@NotNull List<? extends T> list, @NotNull C c10, @NotNull l<? super T, ? extends R> lVar) {
        p.k(list, "<this>");
        p.k(c10, "destination");
        p.k(lVar, "transform");
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            c10.add(lVar.invoke(list.get(i10)));
        }
        return c10;
    }

    @NotNull
    public static final <T, R> List<R> fastZipWithNext(@NotNull List<? extends T> list, @NotNull sn.p<? super T, ? super T, ? extends R> pVar) {
        p.k(list, "<this>");
        p.k(pVar, "transform");
        if (list.size() == 0 || list.size() == 1) {
            return w.m();
        }
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        i iVar = list.get(0);
        int iO = w.o(list);
        while (i10 < iO) {
            i10++;
            T t10 = list.get(i10);
            arrayList.add(pVar.mo2invoke(iVar, t10));
            iVar = t10;
        }
        return arrayList;
    }
}
