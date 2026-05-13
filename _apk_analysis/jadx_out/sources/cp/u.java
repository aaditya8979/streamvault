package cp;

import com.yk.e.callBack.MainInterstitialAdCallBack;
import com.yk.e.object.AdInfo;
import j.l0;
import j.y1;

/* JADX INFO: loaded from: classes3.dex */
public final class u implements MainInterstitialAdCallBack {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public y1 f59412a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public l0 f59413b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f59414c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i.a f59415d = new i.a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q f59416e;

    public u(q qVar) {
        this.f59416e = qVar;
    }

    @Override // com.yk.e.callBack.MainAdCallBack
    public final void onAdClick() {
    }

    @Override // com.yk.e.callBack.MainInterstitialAdCallBack
    public final void onAdClose() {
    }

    @Override // com.yk.e.callBack.MainAdCallBack
    public final void onAdFail(int i10, String str) {
        i.a aVar = this.f59415d;
        aVar.f63634e = i10;
        aVar.f63635f = str;
        if (this.f59414c) {
            this.f59416e.v(aVar);
        } else {
            this.f59416e.B(aVar);
        }
    }

    @Override // com.yk.e.callBack.MainInterstitialAdCallBack
    public final void onAdLoaded() {
        double revenue = this.f59412a.getRevenue();
        i.a aVar = this.f59415d;
        aVar.f63630a = revenue;
        aVar.f63631b = this.f59412a;
        aVar.f63632c = this.f59413b;
        if (this.f59414c) {
            this.f59416e.c(aVar);
        } else {
            this.f59416e.z(aVar);
        }
    }

    @Override // com.yk.e.callBack.MainInterstitialAdCallBack
    public final void onAdShow(AdInfo adInfo) {
    }

    @Override // com.yk.e.callBack.MainInterstitialAdCallBack
    public final void onAdVideoComplete() {
    }

    @Override // com.yk.e.callBack.MainInterstitialAdCallBack
    public final void onAdVideoStart() {
    }
}
