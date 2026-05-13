package yads;

import android.view.TextureView;
import java.util.HashSet;
import kotlin.Pair;

/* JADX INFO: loaded from: classes10.dex */
public final class sp0 implements p52 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sn0 f94897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ln1 f94898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qi3 f94899c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o52 f94900d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final fj3 f94901e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final qp0 f94902f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final po0 f94903g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public n62 f94904h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public n62 f94905i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public cf3 f94906j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public kf3 f94907k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final HashSet f94908l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f94909m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f94910n;

    public sp0(zn0 zn0Var, ln1 ln1Var, qi3 qi3Var, o52 o52Var, fj3 fj3Var) {
        this.f94897a = zn0Var;
        this.f94898b = ln1Var;
        this.f94899c = qi3Var;
        this.f94900d = o52Var;
        this.f94901e = fj3Var;
        qp0 qp0Var = new qp0(this);
        this.f94902f = qp0Var;
        this.f94903g = new po0(qp0Var);
        this.f94908l = new HashSet();
        zn0Var.a(qp0Var);
        zn0Var.a(fj3Var);
        a7.a(this);
    }

    @Override // yads.p52
    public final void a() {
        if (this.f94909m) {
            return;
        }
        kf3 kf3Var = this.f94907k;
        cf3 cf3Var = this.f94906j;
        if (kf3Var != null && cf3Var != null) {
            kf3Var.e();
        }
        this.f94909m = true;
        this.f94910n = false;
        ((zb2) this.f94903g.f93665b).a();
        ((zn0) this.f94897a).a((TextureView) null);
        fj3 fj3Var = this.f94901e;
        fj3Var.f89598c = null;
        fj3Var.b();
        ((zn0) this.f94897a).d(this.f94902f);
        ((zn0) this.f94897a).d(this.f94901e);
        ((zn0) this.f94897a).n();
    }

    @Override // yads.p52
    public final void a(TextureView textureView) {
        if (this.f94909m) {
            return;
        }
        fj3 fj3Var = this.f94901e;
        fj3Var.f89598c = textureView;
        fj3Var.b();
        ((zn0) this.f94897a).a(textureView);
    }

    public final void a(cf3 cf3Var) {
        if (this.f94909m) {
            return;
        }
        this.f94906j = cf3Var;
        ln1 ln1Var = this.f94898b;
        ln1Var.getClass();
        oc0 oc0Var = new oc0(ln1Var.f92039b, new nu2(((l53) ne.a().f89523a).a(), cs2.a().a(ln1Var.f92039b)));
        Object obj = dp0.f88946c;
        nr nrVarA = bp0.a().a(ln1Var.f92039b);
        qr qrVar = new qr();
        qrVar.f94123a = nrVarA;
        qrVar.f94126d = oc0Var;
        ge0 ge0Var = new ge0(qrVar, new od0());
        ln1Var.f92038a.getClass();
        mo moVarA = ge0Var.a(fm1.a(cf3Var.getUrl()));
        ((zn0) this.f94897a).a(false);
        ((zn0) this.f94897a).a(moVarA);
        ((zn0) this.f94897a).m();
        po0 po0Var = this.f94903g;
        po0Var.getClass();
        no0 no0Var = new no0(po0Var);
        ((zb2) po0Var.f93665b).a(po0.f93663c, no0Var);
    }

    @Override // yads.p52
    public final void a(kf3 kf3Var) {
        this.f94907k = kf3Var;
    }

    @Override // yads.p52
    public final void a(kj3 kj3Var) {
        if (this.f94909m) {
            return;
        }
        fj3 fj3Var = this.f94901e;
        fj3Var.f89599d = kj3Var;
        fj3Var.b();
    }

    @Override // yads.p52
    public final void a(n62 n62Var, n62 n62Var2) {
        this.f94904h = n62Var;
        this.f94905i = n62Var2;
        Pair pairA = n62Var2 != null ? bn.h.a(n62Var, n62Var2) : null;
        if (pairA == null || !this.f94908l.contains(pairA)) {
            a(n62Var);
        } else {
            a(n62Var2);
        }
    }

    @Override // yads.p52
    public final long b() {
        return ((zn0) this.f94897a).j();
    }

    @Override // yads.p52
    public final void c() {
        if (!this.f94909m) {
            ((zn0) this.f94897a).a(true);
        }
        if (this.f94910n) {
            pauseAd();
        }
    }

    @Override // yads.p52
    public final void e() {
        if (this.f94909m) {
            return;
        }
        this.f94909m = true;
        this.f94910n = false;
        ((zb2) this.f94903g.f93665b).a();
        ((zn0) this.f94897a).a((TextureView) null);
        fj3 fj3Var = this.f94901e;
        fj3Var.f89598c = null;
        fj3Var.b();
        ((zn0) this.f94897a).d(this.f94902f);
        ((zn0) this.f94897a).d(this.f94901e);
        ((zn0) this.f94897a).n();
    }

    @Override // yads.p52
    public final boolean f() {
        return this.f94909m;
    }

    @Override // yads.kx0
    public final void g() {
        this.f94910n = true;
        pauseAd();
    }

    @Override // yads.p52
    public final long getAdPosition() {
        zn0 zn0Var = (zn0) this.f94897a;
        zn0Var.r();
        return ib3.b(zn0Var.a(zn0Var.Z));
    }

    @Override // yads.p52
    public final float getVolume() {
        zn0 zn0Var = (zn0) this.f94897a;
        zn0Var.r();
        return zn0Var.T;
    }

    @Override // yads.p52
    public final boolean isPlayingAd() {
        qo qoVar = (qo) this.f94897a;
        qoVar.getClass();
        zn0 zn0Var = (zn0) qoVar;
        zn0Var.r();
        if (zn0Var.Z.f88434e == 3) {
            zn0Var.r();
            if (zn0Var.Z.f88441l) {
                zn0Var.r();
                if (zn0Var.Z.f88442m == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // yads.p52
    public final void pauseAd() {
        if (this.f94909m) {
            return;
        }
        ((zn0) this.f94897a).a(false);
    }

    @Override // yads.p52
    public final void resumeAd() {
        if (this.f94909m || this.f94910n) {
            return;
        }
        ((zn0) this.f94897a).a(true);
    }

    @Override // yads.p52
    public final void setVolume(float f10) {
        if (this.f94909m) {
            return;
        }
        ((zn0) this.f94897a).a(f10);
        kf3 kf3Var = this.f94907k;
        cf3 cf3Var = this.f94906j;
        if (kf3Var == null || cf3Var == null) {
            return;
        }
        kf3Var.onVolumeChanged(f10);
    }
}
