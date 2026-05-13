package d;

import com.yk.e.adview.PauseInterstitialView;

/* JADX INFO: loaded from: classes2.dex */
public final class m implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f59505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PauseInterstitialView f59506c;

    public m(PauseInterstitialView pauseInterstitialView, int i10) {
        this.f59506c = pauseInterstitialView;
        this.f59505b = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f59506c.f3362iILLL1.setText(String.valueOf(this.f59505b - 1));
        PauseInterstitialView.IL1Iii(this.f59506c, this.f59505b - 1);
    }
}
