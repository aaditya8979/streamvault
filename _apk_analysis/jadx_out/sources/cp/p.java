package cp;

import android.view.View;
import com.yk.e.callBack.MainWdNativeAdCallback;
import com.yk.e.object.AdInfo;
import j.l0;
import j.y1;

/* JADX INFO: loaded from: classes3.dex */
public final class p implements MainWdNativeAdCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public y1 f59398a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public l0 f59399b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i.a f59400c = new i.a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h f59401d;

    public p(h hVar) {
        this.f59401d = hVar;
    }

    @Override // com.yk.e.callBack.MainAdCallBack
    public final void onAdClick() {
    }

    @Override // com.yk.e.callBack.MainWdNativeAdCallback
    public final void onAdClose() {
    }

    @Override // com.yk.e.callBack.MainAdCallBack
    public final void onAdFail(int i10, String str) {
        i.a aVar = this.f59400c;
        aVar.f63634e = i10;
        aVar.f63635f = str;
        this.f59401d.B(aVar);
    }

    @Override // com.yk.e.callBack.MainWdNativeAdCallback
    public final void onAdLoaded(View view) {
        double revenue = this.f59398a.getRevenue();
        i.a aVar = this.f59400c;
        aVar.f63630a = revenue;
        aVar.f63631b = this.f59398a;
        aVar.f63632c = this.f59399b;
        aVar.f63633d = view;
        this.f59401d.z(aVar);
    }

    @Override // com.yk.e.callBack.MainWdNativeAdCallback
    public final void onAdShow(AdInfo adInfo) {
    }
}
