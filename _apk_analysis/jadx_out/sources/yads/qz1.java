package yads;

import android.view.ViewGroup;
import com.monetization.ads.nativeads.ExtendedNativeAdView;

/* JADX INFO: loaded from: classes9.dex */
public final class qz1 implements zf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w02 f94224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kz f94225b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z00 f94226c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final pu f94227d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final io2 f94228e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final iy1 f94229f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final mj f94230g;

    public qz1(w02 w02Var, kz kzVar, z00 z00Var, pu puVar, at1 at1Var, iy1 iy1Var, mj mjVar) {
        this.f94224a = w02Var;
        this.f94225b = kzVar;
        this.f94226c = z00Var;
        this.f94227d = puVar;
        this.f94228e = at1Var;
        this.f94229f = iy1Var;
        this.f94230g = mjVar;
    }

    @Override // yads.zf0
    public final void a(ViewGroup viewGroup) {
        try {
            this.f94224a.a(this.f94230g.a((ExtendedNativeAdView) viewGroup, this.f94229f), this.f94227d);
            this.f94224a.a(this.f94226c);
        } catch (j02 e10) {
            this.f94225b.e();
            this.f94228e.reportError("Failed to bind DivKit Native Ad", e10);
        }
    }

    @Override // yads.zf0
    public final void c() {
        this.f94224a.a((z00) null);
    }
}
