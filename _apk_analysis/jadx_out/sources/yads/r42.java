package yads;

import kotlin.coroutines.d;
import p000do.i0;

/* JADX INFO: loaded from: classes12.dex */
public final class r42 implements p000do.i0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hz1 f94281b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i0.b f94282c = p000do.i0.D8;

    public r42(hz1 hz1Var) {
        this.f94281b = hz1Var;
    }

    @Override // kotlin.coroutines.d
    public final Object fold(Object obj, sn.p pVar) {
        return i0.a.a(this, obj, pVar);
    }

    @Override // kotlin.coroutines.d.b, kotlin.coroutines.d
    public final d.b get(d.c cVar) {
        return i0.a.b(this, cVar);
    }

    @Override // kotlin.coroutines.d.b
    public final d.c getKey() {
        return this.f94282c;
    }

    @Override // p000do.i0
    public final void handleException(kotlin.coroutines.d dVar, Throwable th2) {
        th2.toString();
        boolean z10 = ad1.f87661a;
        this.f94281b.a(h9.f90304w);
    }

    @Override // kotlin.coroutines.d
    public final kotlin.coroutines.d minusKey(d.c cVar) {
        return i0.a.c(this, cVar);
    }

    @Override // kotlin.coroutines.d
    public final kotlin.coroutines.d plus(kotlin.coroutines.d dVar) {
        return i0.a.d(this, dVar);
    }
}
