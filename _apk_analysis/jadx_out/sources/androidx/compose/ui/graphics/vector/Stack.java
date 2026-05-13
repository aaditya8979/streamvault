package androidx.compose.ui.graphics.vector;

import java.util.ArrayList;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: ImageVector.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0083@\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B$\u0012\u0018\b\u0002\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u0005ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000bJ\r\u0010\u0013\u001a\u00028\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00028\u0000¢\u0006\u0004\b\u0017\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00028\u0000¢\u0006\u0004\b\u001a\u0010\u0010J\u0010\u0010\u001b\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u001e\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u0088\u0001\u0003\u0092\u0001\u0012\u0012\u0004\u0012\u0002H\u00010\u0004j\b\u0012\u0004\u0012\u0002H\u0001`\u0005ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001f"}, d2 = {"Landroidx/compose/ui/graphics/vector/Stack;", "T", "", "backing", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "constructor-impl", "(Ljava/util/ArrayList;)Ljava/util/ArrayList;", "size", "", "getSize-impl", "(Ljava/util/ArrayList;)I", "equals", "", "other", "equals-impl", "(Ljava/util/ArrayList;Ljava/lang/Object;)Z", "hashCode", "hashCode-impl", "peek", "peek-impl", "(Ljava/util/ArrayList;)Ljava/lang/Object;", "pop", "pop-impl", "push", "value", "push-impl", "toString", "", "toString-impl", "(Ljava/util/ArrayList;)Ljava/lang/String;", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
final class Stack<T> {

    @NotNull
    private final ArrayList<T> backing;

    private /* synthetic */ Stack(ArrayList arrayList) {
        this.backing = arrayList;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Stack m2204boximpl(ArrayList arrayList) {
        return new Stack(arrayList);
    }

    @NotNull
    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static <T> ArrayList<T> m2205constructorimpl(@NotNull ArrayList<T> arrayList) {
        p.k(arrayList, "backing");
        return arrayList;
    }

    /* JADX INFO: renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ ArrayList m2206constructorimpl$default(ArrayList arrayList, int i10, i iVar) {
        if ((i10 & 1) != 0) {
            arrayList = new ArrayList();
        }
        return m2205constructorimpl(arrayList);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m2207equalsimpl(ArrayList<T> arrayList, Object obj) {
        return (obj instanceof Stack) && p.f(arrayList, ((Stack) obj).getBacking());
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2208equalsimpl0(ArrayList<?> arrayList, ArrayList<?> arrayList2) {
        return p.f(arrayList, arrayList2);
    }

    /* JADX INFO: renamed from: getSize-impl, reason: not valid java name */
    public static final int m2209getSizeimpl(ArrayList<T> arrayList) {
        return arrayList.size();
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m2210hashCodeimpl(ArrayList<T> arrayList) {
        return arrayList.hashCode();
    }

    /* JADX INFO: renamed from: peek-impl, reason: not valid java name */
    public static final T m2211peekimpl(ArrayList<T> arrayList) {
        return arrayList.get(m2209getSizeimpl(arrayList) - 1);
    }

    /* JADX INFO: renamed from: pop-impl, reason: not valid java name */
    public static final T m2212popimpl(ArrayList<T> arrayList) {
        return arrayList.remove(m2209getSizeimpl(arrayList) - 1);
    }

    /* JADX INFO: renamed from: push-impl, reason: not valid java name */
    public static final boolean m2213pushimpl(ArrayList<T> arrayList, T t10) {
        return arrayList.add(t10);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m2214toStringimpl(ArrayList<T> arrayList) {
        return "Stack(backing=" + arrayList + ')';
    }

    public boolean equals(Object obj) {
        return m2207equalsimpl(this.backing, obj);
    }

    public int hashCode() {
        return m2210hashCodeimpl(this.backing);
    }

    public String toString() {
        return m2214toStringimpl(this.backing);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ ArrayList getBacking() {
        return this.backing;
    }
}
