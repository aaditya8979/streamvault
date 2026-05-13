package j;

import com.yk.e.callBack.MainMaterialCallback;

/* JADX INFO: loaded from: classes9.dex */
public final class f2 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l1 f71867b;

    public f2(l1 l1Var) {
        this.f71867b = l1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MainMaterialCallback mainMaterialCallback = this.f71867b.f71934b;
        if (mainMaterialCallback != null) {
            mainMaterialCallback.onAdClose();
        }
        MainMaterialCallback mainMaterialCallback2 = this.f71867b.f71935c.f71841g;
        if (mainMaterialCallback2 != null) {
            mainMaterialCallback2.onAdClose();
        }
    }
}
