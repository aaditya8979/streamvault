package yads;

import android.os.Handler;
import android.os.SystemClock;
import yads.zb2;

/* JADX INFO: loaded from: classes4.dex */
public final class zb2 implements wb2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f97482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f97483b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public yb2 f97484c = yb2.f97058b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ac2 f97485d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public w63 f97486e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f97487f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f97488g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f97489h;

    public zb2(boolean z10, Handler handler) {
        this.f97482a = z10;
        this.f97483b = handler;
    }

    public static final void a(zb2 zb2Var) {
        zb2Var.c();
    }

    public final void a() {
        yb2 yb2Var = yb2.f97058b;
        if (yb2Var == this.f97484c) {
            return;
        }
        this.f97484c = yb2Var;
        this.f97485d = null;
        this.f97483b.removeCallbacksAndMessages(null);
    }

    public final void a(long j10, ac2 ac2Var) {
        a();
        this.f97485d = ac2Var;
        this.f97487f = j10;
        this.f97488g = j10;
        if (this.f97482a) {
            this.f97483b.post(new Runnable() { // from class: bt.xc
                @Override // java.lang.Runnable
                public final void run() {
                    zb2.a(this.f6406b);
                }
            });
        } else {
            c();
        }
    }

    public final void b() {
        if (yb2.f97059c == this.f97484c) {
            this.f97484c = yb2.f97060d;
            this.f97483b.removeCallbacksAndMessages(null);
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j10 = jElapsedRealtime - this.f97489h;
            this.f97489h = jElapsedRealtime;
            long j11 = this.f97487f - j10;
            this.f97487f = j11;
            long jMax = (long) Math.max(0.0d, j11);
            w63 w63Var = this.f97486e;
            if (w63Var != null) {
                w63Var.a(jMax, this.f97488g - jMax);
            }
        }
    }

    public final void c() {
        this.f97484c = yb2.f97059c;
        this.f97489h = SystemClock.elapsedRealtime();
        long jMin = (long) Math.min(200.0d, this.f97487f);
        if (jMin > 0) {
            this.f97483b.postDelayed(new xb2(this), jMin);
            return;
        }
        ac2 ac2Var = this.f97485d;
        if (ac2Var != null) {
            ac2Var.a();
        }
        a();
    }

    public final void d() {
        if (yb2.f97060d == this.f97484c) {
            c();
        }
    }
}
