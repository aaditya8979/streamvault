package androidx.compose.runtime.collection;

import com.ironsource.C3978d4;
import java.util.List;
import kotlin.Metadata;
import sn.l;
import tn.p;

/* JADX INFO: compiled from: MutableVector.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\u001a\u0018\u0010\u0004\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u001a \u0010\u0007\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0001H\u0002\u001a!\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u0006\b\u0000\u0010\b\u0018\u00012\b\b\u0002\u0010\t\u001a\u00020\u0001H\u0086\b\u001aC\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u0006\b\u0000\u0010\b\u0018\u00012\u0006\u0010\f\u001a\u00020\u00012\u0014\b\b\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00028\u00000\rH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002\u001a\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u0006\b\u0000\u0010\b\u0018\u0001H\u0086\b\u001a2\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u0006\b\u0000\u0010\b\u0018\u00012\u0012\u0010\u0011\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0010\"\u00028\u0000H\u0086\b¢\u0006\u0004\b\u000f\u0010\u0012\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0013"}, d2 = {"", "", "index", "Lbn/r;", "checkIndex", "fromIndex", "toIndex", "checkSubIndex", "T", "capacity", "Landroidx/compose/runtime/collection/MutableVector;", "MutableVector", "size", "Lkotlin/Function1;", C3978d4.a.f31210f, "mutableVectorOf", "", "elements", "([Ljava/lang/Object;)Landroidx/compose/runtime/collection/MutableVector;", "runtime_release"}, k = 2, mv = {1, 6, 0})
public final class MutableVectorKt {
    public static final /* synthetic */ <T> MutableVector<T> MutableVector(int i10) {
        p.q(0, "T?");
        return new MutableVector<>(new Object[i10], 0);
    }

    public static final /* synthetic */ <T> MutableVector<T> MutableVector(int i10, l<? super Integer, ? extends T> lVar) {
        p.k(lVar, C3978d4.a.f31210f);
        p.q(0, "T");
        Object[] objArr = new Object[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = lVar.invoke(Integer.valueOf(i11));
        }
        return new MutableVector<>(objArr, i10);
    }

    public static /* synthetic */ MutableVector MutableVector$default(int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 16;
        }
        p.q(0, "T?");
        return new MutableVector(new Object[i10], 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void checkIndex(List<?> list, int i10) {
        int size = list.size();
        if (i10 < 0 || i10 >= size) {
            throw new IndexOutOfBoundsException("Index " + i10 + " is out of bounds. The list has " + size + " elements.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void checkSubIndex(List<?> list, int i10, int i11) {
        int size = list.size();
        if (i10 > i11) {
            throw new IllegalArgumentException("Indices are out of order. fromIndex (" + i10 + ") is greater than toIndex (" + i11 + ").");
        }
        if (i10 < 0) {
            throw new IndexOutOfBoundsException("fromIndex (" + i10 + ") is less than 0.");
        }
        if (i11 <= size) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i11 + ") is more than than the list size (" + size + ')');
    }

    public static final /* synthetic */ <T> MutableVector<T> mutableVectorOf() {
        p.q(0, "T?");
        return new MutableVector<>(new Object[16], 0);
    }

    public static final /* synthetic */ <T> MutableVector<T> mutableVectorOf(T... tArr) {
        p.k(tArr, "elements");
        return new MutableVector<>(tArr, tArr.length);
    }
}
