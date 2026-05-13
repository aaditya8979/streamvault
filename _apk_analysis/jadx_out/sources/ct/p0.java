package ct;

import android.app.Activity;
import com.mbridge.msdk.out.MBMultiStateEnum;
import com.mbridge.msdk.out.MBNativeAdvancedHandler;
import com.yk.e.inf.IComCallback;
import com.yk.e.util.AdLog;
import com.yk.e.util.ScreenUtil;

/* JADX INFO: loaded from: classes3.dex */
public final class p0 implements IComCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f59463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f59464b;

    public p0(v vVar, Activity activity) {
        this.f59464b = vVar;
        this.f59463a = activity;
    }

    @Override // com.yk.e.inf.IComCallback
    public final void onFailed(int i10, String str) {
        this.f59464b.v(i10 + ", " + str);
    }

    @Override // com.yk.e.inf.IComCallback
    public final void onSuccess() {
        int i10;
        int i11;
        v vVar = this.f59464b;
        i.e eVar = vVar.f71962k;
        if (eVar == null || (i10 = eVar.f63662d) == 0) {
            i10 = 1000;
        }
        if (eVar == null || (i11 = eVar.f63663e) == 0) {
            i11 = 570;
        }
        int i12 = vVar.B;
        if (i12 == 0) {
            vVar.B = (vVar.C * i10) / i11;
        } else {
            int i13 = vVar.C;
            if (i13 == 0) {
                vVar.C = (i12 * i11) / i10;
            } else {
                vVar.B = (int) (i10 * (i13 / i11));
            }
        }
        int screenWidth = ScreenUtil.getScreenWidth(vVar.F);
        if (vVar.B == 0 && vVar.C == 0) {
            vVar.B = screenWidth;
            vVar.C = (i11 * screenWidth) / i10;
        }
        if (vVar.B >= screenWidth) {
            vVar.B = screenWidth;
            vVar.C = (screenWidth * i11) / i10;
        }
        int screenHeight = ScreenUtil.getScreenHeight(vVar.F);
        if (vVar.C >= screenHeight) {
            vVar.C = screenHeight;
            vVar.B = (i10 * screenHeight) / i11;
        }
        AdLog.d("expressWidth " + vVar.B);
        AdLog.d("expressHeight " + vVar.C);
        v vVar2 = this.f59464b;
        vVar2.H = new MBNativeAdvancedHandler(this.f59463a, vVar2.L, vVar2.M);
        v vVar3 = this.f59464b;
        MBNativeAdvancedHandler mBNativeAdvancedHandler = vVar3.H;
        int i14 = vVar3.C;
        mBNativeAdvancedHandler.setNativeViewSize((int) (((double) i14) * 1.28d), i14);
        this.f59464b.H.setCloseButtonState(MBMultiStateEnum.negative);
        v vVar4 = this.f59464b;
        if (vVar4.E) {
            vVar4.H.setPlayMuteState(2);
        } else {
            vVar4.H.setPlayMuteState(1);
        }
        this.f59464b.H.autoLoopPlay(3);
        v vVar5 = this.f59464b;
        vVar5.H.setAdListener(vVar5.O);
        this.f59464b.H.load();
    }
}
