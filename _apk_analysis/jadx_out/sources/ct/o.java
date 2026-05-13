package ct;

import android.view.View;

/* JADX INFO: loaded from: classes8.dex */
public final class o implements d.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b0 f59460a;

    public o(b0 b0Var) {
        this.f59460a = b0Var;
    }

    @Override // d.k
    public final void a() {
        b0 b0Var = this.f59460a;
        b0Var.F.onAdShow(bp.r0.b(null, b0Var.f71957f));
    }

    @Override // d.k
    public final void onAdClick() {
        this.f59460a.F.onAdClick();
        b0 b0Var = this.f59460a;
        if (b0Var.D) {
            b0Var.C();
            this.f59460a.F.onAdClose();
        }
    }

    @Override // d.k
    public final void onAdClose() {
        this.f59460a.F.onAdClose();
    }

    @Override // d.k
    public final void onAdLoaded(View view) {
        this.f59460a.F.onAdLoaded(view);
    }

    @Override // d.k
    public final void onVideoAdComplete() {
        this.f59460a.F.onAdVideoComplete();
    }

    @Override // d.k
    public final void onVideoAdPlay() {
        this.f59460a.F.onAdVideoStart();
    }

    @Override // d.k
    public final void onVideoError() {
        this.f59460a.x("");
    }
}
