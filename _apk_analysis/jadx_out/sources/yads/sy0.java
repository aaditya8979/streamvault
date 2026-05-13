package yads;

import android.view.ViewGroup;
import com.monetization.ads.nativeads.ExtendedNativeAdView;

/* JADX INFO: loaded from: classes10.dex */
public final class sy0 implements zf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w02 f95008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kz f95009b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z00 f95010c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final io2 f95011d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final mj f95012e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final jy1 f95013f;

    public sy0(w02 w02Var, kz kzVar, z00 z00Var, io2 io2Var, mj mjVar, jy1 jy1Var) {
        this.f95008a = w02Var;
        this.f95009b = kzVar;
        this.f95010c = z00Var;
        this.f95011d = io2Var;
        this.f95012e = mjVar;
        this.f95013f = jy1Var;
    }

    @Override // yads.zf0
    public final void a(ViewGroup viewGroup) {
        try {
            this.f95008a.a(this.f95012e.a((ExtendedNativeAdView) viewGroup, this.f95013f));
            this.f95008a.a(this.f95010c);
        } catch (j02 e10) {
            this.f95009b.e();
            this.f95011d.reportError("Failed to bind DivKit Fullscreen Native Ad", e10);
        }
    }

    @Override // yads.zf0
    public final void c() {
        this.f95008a.a((z00) null);
    }
}
