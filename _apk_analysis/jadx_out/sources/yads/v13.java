package yads;

import java.io.IOException;
import java.util.ConcurrentModificationException;

/* JADX INFO: loaded from: classes2.dex */
public final class v13 implements yf1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u13 f95906b;

    public v13(com.monetization.ads.exo.source.dash.a aVar) {
        this.f95906b = aVar;
    }

    @Override // yads.yf1
    public final zf1 a(bg1 bg1Var, long j10, long j11, IOException iOException, int i10) {
        u13 u13Var = this.f95906b;
        if (u13Var != null) {
            ((com.monetization.ads.exo.source.dash.a) u13Var).f51020a.a(iOException);
        }
        return fg1.f89569d;
    }

    @Override // yads.yf1
    public final void a(bg1 bg1Var, long j10, long j11) {
        boolean z10;
        if (this.f95906b != null) {
            synchronized (x13.f96602b) {
                z10 = x13.f96603c;
            }
            if (z10) {
                ((com.monetization.ads.exo.source.dash.a) this.f95906b).a();
                return;
            }
            u13 u13Var = this.f95906b;
            ((com.monetization.ads.exo.source.dash.a) u13Var).f51020a.a(new IOException(new ConcurrentModificationException()));
        }
    }

    @Override // yads.yf1
    public final void a(bg1 bg1Var, long j10, long j11, boolean z10) {
    }
}
