package fo;

import bn.r;
import fo.p;
import org.jetbrains.annotations.NotNull;
import p000do.j0;

/* JADX INFO: compiled from: Produce.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class l<E> extends e<E> implements m<E> {
    public l(@NotNull kotlin.coroutines.d dVar, @NotNull d<E> dVar2) {
        super(dVar, dVar2, true, true);
    }

    @Override // kotlinx.coroutines.a
    public void g1(@NotNull Throwable th2, boolean z10) {
        if (k1().M(th2) || z10) {
            return;
        }
        j0.a(getContext(), th2);
    }

    @Override // fo.m
    public /* bridge */ /* synthetic */ p h() {
        return j1();
    }

    @Override // kotlinx.coroutines.a, kotlinx.coroutines.JobSupport, kotlinx.coroutines.g
    public boolean isActive() {
        return super.isActive();
    }

    @Override // kotlinx.coroutines.a
    /* JADX INFO: renamed from: l1, reason: merged with bridge method [inline-methods] */
    public void h1(@NotNull r rVar) {
        p.a.a(k1(), null, 1, null);
    }
}
