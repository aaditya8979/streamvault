package yads;

import kotlin.Result;
import kotlin.coroutines.d;
import p000do.i0;

/* JADX INFO: loaded from: classes12.dex */
public final class y10 implements p000do.i0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rm0 f96965b;

    public y10(rm0 rm0Var) {
        this.f96965b = rm0Var;
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
        return p000do.i0.D8;
    }

    @Override // p000do.i0
    public final void handleException(kotlin.coroutines.d dVar, Throwable th2) {
        try {
            Result.a aVar = Result.Companion;
            String message = th2.getMessage();
            if (message == null) {
                message = "Unknown";
            }
            boolean z10 = ad1.f87661a;
            this.f96965b.reportError(message, th2);
            Result.m7534constructorimpl(bn.r.f5635a);
        } catch (Throwable th3) {
            Result.a aVar2 = Result.Companion;
            Result.m7534constructorimpl(kotlin.c.a(th3));
        }
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
