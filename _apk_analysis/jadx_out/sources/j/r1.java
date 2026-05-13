package j;

import com.yk.e.callBack.MainMaterialCallback;

/* JADX INFO: loaded from: classes3.dex */
public final class r1 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l1 f72005b;

    public r1(l1 l1Var) {
        this.f72005b = l1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MainMaterialCallback mainMaterialCallback = this.f72005b.f71934b;
        if (mainMaterialCallback != null) {
            mainMaterialCallback.onAdVideoComplete();
        }
        MainMaterialCallback mainMaterialCallback2 = this.f72005b.f71935c.f71841g;
        if (mainMaterialCallback2 != null) {
            mainMaterialCallback2.onAdVideoComplete();
        }
    }
}
