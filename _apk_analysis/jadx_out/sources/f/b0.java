package f;

import android.view.View;
import bp.r0;

/* JADX INFO: loaded from: classes12.dex */
public final class b0 implements d.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s f61366a;

    public b0(s sVar) {
        this.f61366a = sVar;
    }

    @Override // d.k
    public final void a() {
        s sVar = this.f61366a;
        sVar.D.onAdShow(r0.b(null, sVar.f71957f));
    }

    @Override // d.k
    public final void onAdClick() {
        this.f61366a.D.onAdClick();
    }

    @Override // d.k
    public final void onAdClose() {
        this.f61366a.D.onAdClose();
    }

    @Override // d.k
    public final void onAdLoaded(View view) {
        this.f61366a.D.onAdLoaded(view);
    }

    @Override // d.k
    public final void onVideoAdComplete() {
    }

    @Override // d.k
    public final void onVideoAdPlay() {
    }

    @Override // d.k
    public final void onVideoError() {
        this.f61366a.x("");
    }
}
