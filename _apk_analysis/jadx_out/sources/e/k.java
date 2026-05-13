package e;

import android.view.View;
import bp.r0;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements d.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h0 f60008a;

    public k(h0 h0Var) {
        this.f60008a = h0Var;
    }

    @Override // d.k
    public final void a() {
        h0 h0Var = this.f60008a;
        h0Var.M.onAdShow(r0.b(null, h0Var.f71957f));
    }

    @Override // d.k
    public final void onAdClick() {
        this.f60008a.M.onAdClick();
    }

    @Override // d.k
    public final void onAdClose() {
        this.f60008a.M.onAdClose();
    }

    @Override // d.k
    public final void onAdLoaded(View view) {
        this.f60008a.M.onAdLoaded(view);
    }

    @Override // d.k
    public final void onVideoAdComplete() {
    }

    @Override // d.k
    public final void onVideoAdPlay() {
    }

    @Override // d.k
    public final void onVideoError() {
        this.f60008a.x("");
    }
}
