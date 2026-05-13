package d;

import android.view.View;
import com.yk.e.adview.PauseInterstitialView;
import com.yk.e.util.AdPlayer;

/* JADX INFO: loaded from: classes2.dex */
public final class e implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PauseInterstitialView f59493b;

    public e(PauseInterstitialView pauseInterstitialView) {
        this.f59493b = pauseInterstitialView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        AdPlayer adPlayer = this.f59493b.ILL;
        if (adPlayer != null) {
            adPlayer.release();
        }
        h hVar = this.f59493b.ILil;
        if (hVar != null) {
            ((ct.q) hVar).f59465a.F.onAdClose();
        }
    }
}
