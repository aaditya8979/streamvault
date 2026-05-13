package d;

import com.yk.e.adview.PauseInterstitialView;

/* JADX INFO: loaded from: classes2.dex */
public final class c implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f59488b;

    public c(j jVar) {
        this.f59488b = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f59488b.f59503b.f3359IiL.setVisibility(0);
        this.f59488b.f59503b.f3362iILLL1.setVisibility(0);
        j jVar = this.f59488b;
        jVar.f59503b.f3362iILLL1.setText(String.valueOf(jVar.f59502a.countDownTime));
        j jVar2 = this.f59488b;
        PauseInterstitialView.IL1Iii(jVar2.f59503b, jVar2.f59502a.countDownTime);
    }
}
