package j;

import com.yk.e.callBack.MainMaterialCallback;
import com.yk.e.object.AdInfo;

/* JADX INFO: loaded from: classes9.dex */
public final class a1 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AdInfo f71811b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l1 f71812c;

    public a1(l1 l1Var, AdInfo adInfo) {
        this.f71812c = l1Var;
        this.f71811b = adInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MainMaterialCallback mainMaterialCallback = this.f71812c.f71934b;
        if (mainMaterialCallback != null) {
            mainMaterialCallback.onAdShow(this.f71811b);
        }
        MainMaterialCallback mainMaterialCallback2 = this.f71812c.f71935c.f71841g;
        if (mainMaterialCallback2 != null) {
            mainMaterialCallback2.onAdShow(this.f71811b);
        }
    }
}
