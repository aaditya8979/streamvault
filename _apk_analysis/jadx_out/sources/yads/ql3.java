package yads;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes3.dex */
public final class ql3 implements qf3, sf3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final je3 f94062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jg3 f94063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yj3 f94064c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final af3 f94065d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final gk3 f94066e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Long f94067f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f94068g;

    public /* synthetic */ ql3(je3 je3Var, ek3 ek3Var, jg3 jg3Var, zj3 zj3Var, af3 af3Var) {
        this(je3Var, jg3Var, zj3Var, af3Var, new gk3(ek3Var));
    }

    public ql3(je3 je3Var, jg3 jg3Var, zj3 zj3Var, af3 af3Var, gk3 gk3Var) {
        this.f94062a = je3Var;
        this.f94063b = jg3Var;
        this.f94064c = zj3Var;
        this.f94065d = af3Var;
        this.f94066e = gk3Var;
    }

    @Override // yads.sf3
    public final void a() {
        this.f94067f = null;
    }

    @Override // yads.qf3
    public final void a(long j10, long j11) {
        if (this.f94068g) {
            return;
        }
        bn.r rVar = null;
        if (!this.f94066e.a() || this.f94063b.a() != hg3.f90404e) {
            this.f94067f = null;
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Long l10 = this.f94067f;
        if (l10 != null) {
            if (jElapsedRealtime - l10.longValue() >= 2000) {
                this.f94068g = true;
                this.f94065d.i(this.f94062a);
                this.f94064c.n();
            }
            rVar = bn.r.f5635a;
        }
        if (rVar == null) {
            this.f94067f = Long.valueOf(jElapsedRealtime);
            this.f94065d.a(this.f94062a);
        }
    }

    @Override // yads.sf3
    public final void b() {
        this.f94067f = null;
    }
}
