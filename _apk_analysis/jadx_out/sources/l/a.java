package l;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.out.MBMultiStateEnum;
import com.mbridge.msdk.out.MBNativeAdvancedHandler;
import com.yk.e.inf.IComCallback;
import com.yk.e.util.AdLog;
import com.yk.e.util.ScreenUtil;

/* JADX INFO: loaded from: classes11.dex */
public final class a implements IComCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f73579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i0 f73580b;

    public a(i0 i0Var, Activity activity) {
        this.f73580b = i0Var;
        this.f73579a = activity;
    }

    @Override // com.yk.e.inf.IComCallback
    public final void onFailed(int i10, String str) {
        this.f73580b.v(i10 + ", " + str);
    }

    @Override // com.yk.e.inf.IComCallback
    public final void onSuccess() {
        int i10;
        int i11;
        i0 i0Var = this.f73580b;
        i.e eVar = i0Var.f71962k;
        if (eVar == null || (i10 = eVar.f63662d) == 0) {
            i10 = IronSourceError.ERROR_DO_RV_LOAD_DURING_SHOW;
        }
        if (eVar == null || (i11 = eVar.f63663e) == 0) {
            i11 = 465;
        }
        int i12 = i0Var.E;
        if (i12 == 0) {
            i0Var.E = (i0Var.F * i10) / i11;
        } else {
            int i13 = i0Var.F;
            if (i13 == 0) {
                i0Var.F = (i12 * i11) / i10;
            } else {
                i0Var.E = (int) (i10 * (i13 / i11));
            }
        }
        int screenWidth = ScreenUtil.getScreenWidth(i0Var.B);
        if (i0Var.E == 0 && i0Var.F == 0) {
            i0Var.E = screenWidth;
            i0Var.F = (i11 * screenWidth) / i10;
        }
        if (i0Var.E >= screenWidth) {
            i0Var.E = screenWidth;
            i0Var.F = (screenWidth * i11) / i10;
        }
        int screenHeight = ScreenUtil.getScreenHeight(i0Var.B);
        if (i0Var.F >= screenHeight) {
            i0Var.F = screenHeight;
            i0Var.E = (i10 * screenHeight) / i11;
        }
        AdLog.d("expressWidth " + i0Var.E);
        AdLog.d("expressHeight " + i0Var.F);
        i0 i0Var2 = this.f73580b;
        i0Var2.D = new MBNativeAdvancedHandler(this.f73579a, i0Var2.I, i0Var2.J);
        i0 i0Var3 = this.f73580b;
        MBNativeAdvancedHandler mBNativeAdvancedHandler = i0Var3.D;
        int i14 = i0Var3.F;
        mBNativeAdvancedHandler.setNativeViewSize((int) (((double) i14) * 1.28d), i14);
        this.f73580b.D.setCloseButtonState(MBMultiStateEnum.negative);
        this.f73580b.D.setPlayMuteState(1);
        this.f73580b.D.autoLoopPlay(3);
        i0 i0Var4 = this.f73580b;
        i0Var4.D.setAdListener(i0Var4.K);
        this.f73580b.D.load();
    }
}
