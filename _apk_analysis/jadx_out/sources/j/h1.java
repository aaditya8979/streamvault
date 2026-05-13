package j;

import android.view.View;
import com.yk.e.callBack.MainMRECCallBack;

/* JADX INFO: loaded from: classes9.dex */
public final class h1 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f71877b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z1 f71878c;

    public h1(z1 z1Var, View view) {
        this.f71878c = z1Var;
        this.f71877b = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MainMRECCallBack mainMRECCallBack = this.f71878c.f72049b;
        if (mainMRECCallBack != null) {
            mainMRECCallBack.onAdLoaded(this.f71877b);
        }
        MainMRECCallBack mainMRECCallBack2 = this.f71878c.f72050c.f71830e;
        if (mainMRECCallBack2 != null) {
            mainMRECCallBack2.onAdLoaded(this.f71877b);
        }
    }
}
