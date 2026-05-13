package cp;

import android.view.View;
import com.yk.e.callBack.MainThirdBannerCallBack;
import com.yk.e.object.AdInfo;
import j.l0;
import j.y1;

/* JADX INFO: loaded from: classes12.dex */
public final class i0 implements MainThirdBannerCallBack {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public y1 f59383a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public l0 f59384b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f59385c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i.a f59386d = new i.a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z f59387e;

    public i0(z zVar) {
        this.f59387e = zVar;
    }

    @Override // com.yk.e.callBack.MainAdCallBack
    public final void onAdClick() {
    }

    @Override // com.yk.e.callBack.MainThirdBannerCallBack
    public final void onAdClose() {
    }

    @Override // com.yk.e.callBack.MainAdCallBack
    public final void onAdFail(int i10, String str) {
        i.a aVar = this.f59386d;
        aVar.f63634e = i10;
        aVar.f63635f = str;
        if (this.f59385c) {
            this.f59387e.v(aVar);
        } else {
            this.f59387e.B(aVar);
        }
    }

    @Override // com.yk.e.callBack.MainThirdBannerCallBack
    public final void onAdLoaded(View view) {
        double revenue = this.f59383a.getRevenue();
        i.a aVar = this.f59386d;
        aVar.f63630a = revenue;
        aVar.f63631b = this.f59383a;
        aVar.f63632c = this.f59384b;
        aVar.f63633d = view;
        if (this.f59385c) {
            this.f59387e.c(aVar);
        } else {
            this.f59387e.z(aVar);
        }
    }

    @Override // com.yk.e.callBack.MainThirdBannerCallBack
    public final void onAdShow(AdInfo adInfo) {
    }
}
