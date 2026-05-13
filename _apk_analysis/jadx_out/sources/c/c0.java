package c;

import android.app.Activity;
import com.mbridge.msdk.out.MBRewardVideoHandler;
import com.yk.e.inf.IComCallback;

/* JADX INFO: loaded from: classes11.dex */
public final class c0 implements IComCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f6459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f6460b;

    public c0(m mVar, Activity activity) {
        this.f6460b = mVar;
        this.f6459a = activity;
    }

    @Override // com.yk.e.inf.IComCallback
    public final void onFailed(int i10, String str) {
        this.f6460b.v(i10 + ", " + str);
    }

    @Override // com.yk.e.inf.IComCallback
    public final void onSuccess() {
        m mVar = this.f6460b;
        mVar.C = new MBRewardVideoHandler(this.f6459a, mVar.F, mVar.G);
        m mVar2 = this.f6460b;
        mVar2.C.setRewardVideoListener(mVar2.H);
        this.f6460b.C.playVideoMute(2);
        this.f6460b.C.load();
    }
}
