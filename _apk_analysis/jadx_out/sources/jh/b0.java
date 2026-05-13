package jh;

import android.app.Activity;
import com.mbridge.msdk.newinterstitial.out.MBNewInterstitialHandler;
import com.yk.e.inf.IComCallback;

/* JADX INFO: loaded from: classes4.dex */
public final class b0 implements IComCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f72432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f72433b;

    public b0(m mVar, Activity activity) {
        this.f72433b = mVar;
        this.f72432a = activity;
    }

    @Override // com.yk.e.inf.IComCallback
    public final void onFailed(int i10, String str) {
        this.f72433b.v(i10 + ", " + str);
    }

    @Override // com.yk.e.inf.IComCallback
    public final void onSuccess() {
        m mVar = this.f72433b;
        mVar.D = new MBNewInterstitialHandler(this.f72432a, mVar.G, mVar.H);
        m mVar2 = this.f72433b;
        if (mVar2.B) {
            mVar2.D.playVideoMute(2);
        } else {
            mVar2.D.playVideoMute(1);
        }
        m mVar3 = this.f72433b;
        mVar3.D.setInterstitialVideoListener(mVar3.I);
        this.f72433b.D.load();
    }
}
