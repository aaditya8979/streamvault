package k;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.yk.e.callBack.MainSplashAdCallBack;
import com.yk.e.util.AdPlayer;
import java.util.Timer;

/* JADX INFO: loaded from: classes4.dex */
public final class v0 implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f72674b;

    public v0(x xVar) {
        this.f72674b = xVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MainSplashAdCallBack mainSplashAdCallBack = this.f72674b.F;
        if (mainSplashAdCallBack != null) {
            mainSplashAdCallBack.onAdClick();
        }
        x xVar = this.f72674b;
        Timer timer = xVar.E;
        if (timer != null) {
            timer.cancel();
            xVar.E = null;
        }
        AdPlayer adPlayer = xVar.I;
        if (adPlayer != null) {
            adPlayer.release();
        }
        x xVar2 = this.f72674b;
        xVar2.m(xVar2.G, 1);
        new Handler(Looper.getMainLooper()).postDelayed(new n0(this), 1000L);
    }
}
