package cn;

import java.util.List;
import java.util.RandomAccess;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SlidingWindow.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class s0<E> extends d<E> implements RandomAccess {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final List<E> f6759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f6760c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f6761d;

    /* JADX WARN: Multi-variable type inference failed */
    public s0(@NotNull List<? extends E> list) {
        tn.p.k(list, "list");
        this.f6759b = list;
    }

    public final void f(int i10, int i11) {
        d.Companion.d(i10, i11, this.f6759b.size());
        this.f6760c = i10;
        this.f6761d = i11 - i10;
    }

    @Override // cn.d, java.util.List
    public E get(int i10) {
        d.Companion.b(i10, this.f6761d);
        return this.f6759b.get(this.f6760c + i10);
    }

    @Override // cn.d, cn.b
    public int getSize() {
        return this.f6761d;
    }
}
