package cp;

import android.view.View;
import com.yk.e.callBack.MainBannerCallBack;
import com.yk.e.object.AdInfo;
import j.l0;
import j.y1;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements MainBannerCallBack {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public y1 f59375a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public l0 f59376b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f59377c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i.a f59378d = new i.a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i f59379e;

    public f(i iVar) {
        this.f59379e = iVar;
    }

    @Override // com.yk.e.callBack.MainAdCallBack
    public final void onAdClick() {
    }

    @Override // com.yk.e.callBack.MainBannerCallBack
    public final void onAdClose() {
    }

    @Override // com.yk.e.callBack.MainAdCallBack
    public final void onAdFail(int i10, String str) {
        i.a aVar = this.f59378d;
        aVar.f63634e = i10;
        aVar.f63635f = str;
        if (this.f59377c) {
            this.f59379e.v(aVar);
        } else {
            this.f59379e.B(aVar);
        }
    }

    @Override // com.yk.e.callBack.MainBannerCallBack
    public final void onAdLoaded(View view) {
        double revenue = this.f59375a.getRevenue();
        i.a aVar = this.f59378d;
        aVar.f63630a = revenue;
        aVar.f63631b = this.f59375a;
        aVar.f63632c = this.f59376b;
        aVar.f63633d = view;
        if (this.f59377c) {
            this.f59379e.c(aVar);
        } else {
            this.f59379e.z(aVar);
        }
    }

    @Override // com.yk.e.callBack.MainBannerCallBack
    public final void onAdShow(AdInfo adInfo) {
    }
}
