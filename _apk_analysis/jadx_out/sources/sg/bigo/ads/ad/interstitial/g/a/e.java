package sg.bigo.ads.ad.interstitial.g.a;

import android.app.Activity;
import android.view.View;
import androidx.annotation.NonNull;
import sg.bigo.ads.api.VideoController;
import sg.bigo.ads.common.view.RoundedFrameLayout;

/* JADX INFO: loaded from: classes12.dex */
public final class e extends d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private VideoController.VideoLifeCallback f81002g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f81003h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f81004i;

    public e(@NonNull Activity activity, sg.bigo.ads.ad.interstitial.g.a aVar, RoundedFrameLayout roundedFrameLayout, sg.bigo.ads.ad.b.b bVar, int i10, View view, boolean z10) {
        super(activity, aVar, roundedFrameLayout, bVar, i10, view, z10);
        this.f81004i = true;
    }

    public static /* synthetic */ boolean b(e eVar) {
        eVar.f81003h = true;
        return true;
    }

    @Override // sg.bigo.ads.ad.interstitial.g.a.d, sg.bigo.ads.ad.interstitial.q, sg.bigo.ads.ad.interstitial.i, sg.bigo.ads.api.core.BaseAdActivityImpl
    public final void F() {
        super.F();
        this.f81002g = null;
    }

    @Override // sg.bigo.ads.ad.interstitial.g.a.d
    public final void b() {
        super.b();
        if (((d) this).f80985b instanceof sg.bigo.ads.ad.b.c) {
            if (this.f81002g == null) {
                this.f81002g = new VideoController.VideoLifeCallback() { // from class: sg.bigo.ads.ad.interstitial.g.a.e.1
                    @Override // sg.bigo.ads.api.VideoController.VideoLifeCallback
                    public final void onMuteChange(boolean z10) {
                    }

                    @Override // sg.bigo.ads.api.VideoController.VideoLifeCallback
                    public final void onVideoEnd() {
                        if (e.this.f81003h) {
                            return;
                        }
                        e.b(e.this);
                        e.this.a();
                    }

                    @Override // sg.bigo.ads.api.VideoController.VideoLifeCallback
                    public final void onVideoPause() {
                    }

                    @Override // sg.bigo.ads.api.VideoController.VideoLifeCallback
                    public final void onVideoPlay() {
                    }

                    @Override // sg.bigo.ads.api.VideoController.VideoLifeCallback
                    public final void onVideoStart() {
                    }
                };
            }
            VideoController videoController = ((d) this).f80985b.getVideoController();
            if (videoController != null) {
                videoController.setNeedPauseWhenVisiblePercentEqual(false);
                videoController.setVideoLifeCallback(this.f81002g);
            }
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.g.a.d, sg.bigo.ads.ad.interstitial.q, sg.bigo.ads.ad.interstitial.i
    public final void g() {
        super.g();
        VideoController videoController = ((d) this).f80985b.getVideoController();
        if (videoController != null && videoController.isPaused() && this.f81004i) {
            videoController.play();
            this.f81004i = false;
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.g.a.d, sg.bigo.ads.ad.interstitial.i
    public final void h(int i10) {
        super.h(i10);
    }

    @Override // sg.bigo.ads.ad.interstitial.g.a.d, sg.bigo.ads.ad.interstitial.q, sg.bigo.ads.ad.interstitial.i
    public final void i() {
        super.i();
        VideoController videoController = ((d) this).f80985b.getVideoController();
        boolean z10 = videoController != null && videoController.isPlaying();
        this.f81004i = z10;
        if (z10) {
            videoController.pause();
        }
    }
}
