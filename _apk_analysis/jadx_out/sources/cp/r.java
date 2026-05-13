package cp;

import com.yk.e.callBack.MainSplashAdCallBack;
import com.yk.e.object.AdInfo;
import j.l0;
import j.y1;

/* JADX INFO: loaded from: classes3.dex */
public final class r implements MainSplashAdCallBack {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public y1 f59402a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public l0 f59403b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f59404c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i.a f59405d = new i.a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l f59406e;

    public r(l lVar) {
        this.f59406e = lVar;
    }

    @Override // com.yk.e.callBack.MainAdCallBack
    public final void onAdClick() {
    }

    @Override // com.yk.e.callBack.MainSplashAdCallBack
    public final void onAdClose() {
    }

    @Override // com.yk.e.callBack.MainSplashAdCallBack
    public final void onAdComplete() {
    }

    @Override // com.yk.e.callBack.MainAdCallBack
    public final void onAdFail(int i10, String str) {
        i.a aVar = this.f59405d;
        aVar.f63634e = i10;
        aVar.f63635f = str;
        if (this.f59404c) {
            this.f59406e.v(aVar);
        } else {
            this.f59406e.B(aVar);
        }
    }

    @Override // com.yk.e.callBack.MainSplashAdCallBack
    public final void onAdLoaded() {
        double revenue = this.f59402a.getRevenue();
        i.a aVar = this.f59405d;
        aVar.f63630a = revenue;
        aVar.f63631b = this.f59402a;
        aVar.f63632c = this.f59403b;
        if (this.f59404c) {
            this.f59406e.c(aVar);
        } else {
            this.f59406e.z(aVar);
        }
    }

    @Override // com.yk.e.callBack.MainSplashAdCallBack
    public final void onAdShow(AdInfo adInfo) {
    }

    @Override // com.yk.e.callBack.MainSplashAdCallBack
    public final void onAdSkipped() {
    }
}
