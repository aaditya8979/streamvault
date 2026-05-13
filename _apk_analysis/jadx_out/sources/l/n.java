package l;

import android.view.View;
import bp.r0;

/* JADX INFO: loaded from: classes11.dex */
public final class n implements d.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m f73609a;

    public n(m mVar) {
        this.f73609a = mVar;
    }

    @Override // d.k
    public final void a() {
        m mVar = this.f73609a;
        mVar.B.onAdShow(r0.b(null, mVar.f71957f));
    }

    @Override // d.k
    public final void onAdClick() {
        this.f73609a.B.onAdClick();
    }

    @Override // d.k
    public final void onAdClose() {
        this.f73609a.B.onAdClose();
    }

    @Override // d.k
    public final void onAdLoaded(View view) {
        this.f73609a.B.onAdLoaded(view);
    }

    @Override // d.k
    public final void onVideoAdComplete() {
        this.f73609a.B.onAdVideoComplete();
    }

    @Override // d.k
    public final void onVideoAdPlay() {
        this.f73609a.B.onAdVideoStart();
    }

    @Override // d.k
    public final void onVideoError() {
        this.f73609a.x("");
    }
}
