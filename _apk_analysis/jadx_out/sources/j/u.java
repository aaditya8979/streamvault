package j;

import com.yk.e.callBack.MainMaterialCallback;

/* JADX INFO: loaded from: classes4.dex */
public final class u implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l1 f72023b;

    public u(l1 l1Var) {
        this.f72023b = l1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MainMaterialCallback mainMaterialCallback = this.f72023b.f71934b;
        if (mainMaterialCallback != null) {
            mainMaterialCallback.onAdVideoStart();
        }
        MainMaterialCallback mainMaterialCallback2 = this.f72023b.f71935c.f71841g;
        if (mainMaterialCallback2 != null) {
            mainMaterialCallback2.onAdVideoStart();
        }
    }
}
