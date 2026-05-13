package j;

import com.yk.e.callBack.MainMaterialCallback;

/* JADX INFO: loaded from: classes4.dex */
public final class o implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l1 f71982b;

    public o(l1 l1Var) {
        this.f71982b = l1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MainMaterialCallback mainMaterialCallback = this.f71982b.f71934b;
        if (mainMaterialCallback != null) {
            mainMaterialCallback.onAdClick();
        }
        MainMaterialCallback mainMaterialCallback2 = this.f71982b.f71935c.f71841g;
        if (mainMaterialCallback2 != null) {
            mainMaterialCallback2.onAdClick();
        }
    }
}
