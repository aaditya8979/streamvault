package k;

import android.app.Activity;
import com.applovin.mediation.ads.MaxAppOpenAd;
import com.yk.e.inf.IComCallback;

/* JADX INFO: loaded from: classes3.dex */
public final class p0 implements IComCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f72659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y f72660b;

    public p0(y yVar, Activity activity) {
        this.f72660b = yVar;
        this.f72659a = activity;
    }

    @Override // com.yk.e.inf.IComCallback
    public final void onFailed(int i10, String str) {
        this.f72660b.v(str);
    }

    @Override // com.yk.e.inf.IComCallback
    public final void onSuccess() {
        y yVar = this.f72660b;
        yVar.E = new MaxAppOpenAd(yVar.H, this.f72659a.getApplicationContext());
        y yVar2 = this.f72660b;
        yVar2.E.setListener(yVar2.I);
        this.f72660b.E.loadAd();
    }
}
