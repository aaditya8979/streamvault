package k;

import android.os.Handler;
import android.os.Looper;
import com.yk.e.callBack.MainSplashAdCallBack;
import com.yk.e.util.AdPlayer;
import java.util.Timer;

/* JADX INFO: loaded from: classes4.dex */
public final class u0 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f72672b;

    public u0(x xVar) {
        this.f72672b = xVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MainSplashAdCallBack mainSplashAdCallBack = this.f72672b.F;
        if (mainSplashAdCallBack != null) {
            mainSplashAdCallBack.onAdClick();
        }
        x xVar = this.f72672b;
        Timer timer = xVar.E;
        if (timer != null) {
            timer.cancel();
            xVar.E = null;
        }
        AdPlayer adPlayer = xVar.I;
        if (adPlayer != null) {
            adPlayer.release();
        }
        new Handler(Looper.getMainLooper()).postDelayed(new b(this), 1000L);
    }
}
