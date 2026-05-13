package k;

import android.app.Activity;
import com.mbridge.msdk.out.MBSplashHandler;
import com.mbridge.msdk.out.ZoomOutTypeEnum;
import com.yk.e.inf.IComCallback;

/* JADX INFO: loaded from: classes3.dex */
public final class s0 implements IComCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f72667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z0 f72668b;

    public s0(z0 z0Var, Activity activity) {
        this.f72668b = z0Var;
        this.f72667a = activity;
    }

    @Override // com.yk.e.inf.IComCallback
    public final void onFailed(int i10, String str) {
        this.f72668b.v(i10 + ", " + str);
    }

    @Override // com.yk.e.inf.IComCallback
    public final void onSuccess() {
        z0 z0Var = this.f72668b;
        z0 z0Var2 = this.f72668b;
        z0Var.K = new MBSplashHandler(z0Var2.I, z0Var2.J);
        this.f72668b.K.setSupportZoomOut(true);
        this.f72668b.K.createZoomOutByType(ZoomOutTypeEnum.BigView);
        this.f72668b.K.setLoadTimeOut(r0.E);
        z0 z0Var3 = this.f72668b;
        z0Var3.K.setSplashLoadListener(z0Var3.L);
        z0 z0Var4 = this.f72668b;
        z0Var4.K.setSplashShowListener(z0Var4.M);
        this.f72668b.K.setOrientation(bp.r0.h(this.f72667a) ? 2 : 1);
        this.f72668b.K.preLoad();
    }
}
