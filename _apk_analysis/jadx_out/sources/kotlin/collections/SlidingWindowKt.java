package kotlin.collections;

import ao.l;
import cn.g0;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: SlidingWindow.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class SlidingWindowKt {
    public static final void a(int i10, int i11) {
        String str;
        if (i10 > 0 && i11 > 0) {
            return;
        }
        if (i10 != i11) {
            str = "Both size " + i10 + " and step " + i11 + " must be greater than zero.";
        } else {
            str = "size " + i10 + " must be greater than zero.";
        }
        throw new IllegalArgumentException(str.toString());
    }

    @NotNull
    public static final <T> Iterator<List<T>> b(@NotNull Iterator<? extends T> it, int i10, int i11, boolean z10, boolean z11) {
        p.k(it, "iterator");
        return !it.hasNext() ? g0.f6741b : l.a(new SlidingWindowKt$windowedIterator$1(i10, i11, it, z11, z10, null));
    }
}
