package cp;

import android.view.View;
import com.yk.e.callBack.MainNativeAdCallBack;
import com.yk.e.object.AdInfo;
import j.l0;
import j.y1;

/* JADX INFO: loaded from: classes3.dex */
public final class m implements MainNativeAdCallBack {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public y1 f59391a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public l0 f59392b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f59393c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i.a f59394d = new i.a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b0 f59395e;

    public m(b0 b0Var) {
        this.f59395e = b0Var;
    }

    @Override // com.yk.e.callBack.MainAdCallBack
    public final void onAdClick() {
    }

    @Override // com.yk.e.callBack.MainNativeAdCallBack
    public final void onAdClose() {
    }

    @Override // com.yk.e.callBack.MainAdCallBack
    public final void onAdFail(int i10, String str) {
        i.a aVar = this.f59394d;
        aVar.f63634e = i10;
        aVar.f63635f = str;
        if (this.f59393c) {
            this.f59395e.v(aVar);
        } else {
            this.f59395e.B(aVar);
        }
    }

    @Override // com.yk.e.callBack.MainNativeAdCallBack
    public final void onAdLoaded(View view) {
        double revenue = this.f59391a.getRevenue();
        i.a aVar = this.f59394d;
        aVar.f63630a = revenue;
        aVar.f63631b = this.f59391a;
        aVar.f63632c = this.f59392b;
        aVar.f63633d = view;
        if (this.f59393c) {
            this.f59395e.c(aVar);
        } else {
            this.f59395e.z(aVar);
        }
    }

    @Override // com.yk.e.callBack.MainNativeAdCallBack
    public final void onAdShow(AdInfo adInfo) {
    }

    @Override // com.yk.e.callBack.MainNativeAdCallBack
    public final void onAdVideoComplete() {
    }

    @Override // com.yk.e.callBack.MainNativeAdCallBack
    public final void onAdVideoStart() {
    }
}
