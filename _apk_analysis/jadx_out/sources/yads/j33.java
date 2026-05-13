package yads;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes3.dex */
public final class j33 implements zj1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xv f91084b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f91085c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f91086d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f91087e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ee2 f91088f = ee2.f89220e;

    public j33(f53 f53Var) {
        this.f91084b = f53Var;
    }

    @Override // yads.zj1
    public final long a() {
        long j10 = this.f91086d;
        if (!this.f91085c) {
            return j10;
        }
        ((f53) this.f91084b).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f91087e;
        ee2 ee2Var = this.f91088f;
        return j10 + (ee2Var.f89221b == 1.0f ? ib3.a(jElapsedRealtime) : jElapsedRealtime * ((long) ee2Var.f89223d));
    }

    public final void a(long j10) {
        this.f91086d = j10;
        if (this.f91085c) {
            ((f53) this.f91084b).getClass();
            this.f91087e = SystemClock.elapsedRealtime();
        }
    }

    @Override // yads.zj1
    public final void a(ee2 ee2Var) {
        if (this.f91085c) {
            a(a());
        }
        this.f91088f = ee2Var;
    }

    @Override // yads.zj1
    public final ee2 getPlaybackParameters() {
        return this.f91088f;
    }
}
