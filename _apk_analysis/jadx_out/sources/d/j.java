package d;

import android.os.Handler;
import com.yk.e.adview.PauseInterstitialView;
import com.yk.e.object.MainParams;
import com.yk.e.pl.BaseAdPlayer;

/* JADX INFO: loaded from: classes2.dex */
public final class j implements BaseAdPlayer.IPlayerCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MainParams f59502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PauseInterstitialView f59503b;

    public j(PauseInterstitialView pauseInterstitialView, MainParams mainParams) {
        this.f59503b = pauseInterstitialView;
        this.f59502a = mainParams;
    }

    @Override // com.yk.e.pl.BaseAdPlayer.IPlayerCallback
    public final void onPlayComplete() {
        h hVar = this.f59503b.ILil;
        if (hVar != null) {
            ((ct.q) hVar).f59465a.F.onAdVideoComplete();
        }
    }

    @Override // com.yk.e.pl.BaseAdPlayer.IPlayerCallback
    public final void onPlayFailed(String str) {
        h hVar = this.f59503b.ILil;
        if (hVar != null) {
            ((ct.q) hVar).f59465a.a(str);
        }
    }

    @Override // com.yk.e.pl.BaseAdPlayer.IPlayerCallback
    public final void onStartPlay() {
        new Handler().postDelayed(new c(this), 300L);
        h hVar = this.f59503b.ILil;
        if (hVar != null) {
            ((ct.q) hVar).b();
        }
    }
}
