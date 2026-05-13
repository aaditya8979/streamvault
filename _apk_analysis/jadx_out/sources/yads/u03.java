package yads;

import android.view.ViewGroup;
import com.monetization.ads.nativeads.ExtendedNativeAdView;
import java.util.Iterator;

/* JADX INFO: loaded from: classes12.dex */
public final class u03 implements zf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v22 f95468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kz f95469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z00 f95470c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final pu f95471d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final io2 f95472e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final iy1 f95473f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final mj f95474g;

    public u03(v22 v22Var, kz kzVar, z00 z00Var, pu puVar, at1 at1Var, iy1 iy1Var, mj mjVar) {
        this.f95468a = v22Var;
        this.f95469b = kzVar;
        this.f95470c = z00Var;
        this.f95471d = puVar;
        this.f95472e = at1Var;
        this.f95473f = iy1Var;
        this.f95474g = mjVar;
    }

    @Override // yads.zf0
    public final void a(ViewGroup viewGroup) {
        try {
            r12 r12VarA = this.f95474g.a((ExtendedNativeAdView) viewGroup, this.f95473f);
            v22 v22Var = this.f95468a;
            pu puVar = this.f95471d;
            v22Var.getClass();
            v22Var.a(r12VarA.f94253c, v22Var.Q, new z12(r12VarA), puVar);
            o43 o43Var = new o43(this.f95470c);
            Iterator it = this.f95468a.i().iterator();
            while (it.hasNext()) {
                ((w02) it.next()).a(o43Var);
            }
            this.f95468a.b(this.f95470c);
        } catch (j02 e10) {
            this.f95469b.e();
            this.f95472e.reportError("Failed to bind DivKit Slider Ad", e10);
        }
    }

    @Override // yads.zf0
    public final void c() {
        this.f95468a.b((z00) null);
        Iterator it = this.f95468a.i().iterator();
        while (it.hasNext()) {
            ((w02) it.next()).a((z00) null);
        }
    }
}
