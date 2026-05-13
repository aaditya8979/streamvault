package cp;

import android.view.View;
import com.yk.e.callBack.MainMaterialCallback;
import com.yk.e.object.AdInfo;
import j.l0;
import j.y1;

/* JADX INFO: loaded from: classes3.dex */
public final class s implements MainMaterialCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public y1 f59407a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public l0 f59408b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i.a f59409c = new i.a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b f59410d;

    public s(b bVar) {
        this.f59410d = bVar;
    }

    @Override // com.yk.e.callBack.MainAdCallBack
    public final void onAdClick() {
    }

    @Override // com.yk.e.callBack.MainMaterialCallback
    public final void onAdClose() {
    }

    @Override // com.yk.e.callBack.MainAdCallBack
    public final void onAdFail(int i10, String str) {
        i.a aVar = this.f59409c;
        aVar.f63634e = i10;
        aVar.f63635f = str;
        this.f59410d.B(aVar);
    }

    @Override // com.yk.e.callBack.MainMaterialCallback
    public final void onAdLoaded(View view) {
        double revenue = this.f59407a.getRevenue();
        i.a aVar = this.f59409c;
        aVar.f63630a = revenue;
        aVar.f63631b = this.f59407a;
        aVar.f63632c = this.f59408b;
        aVar.f63633d = view;
        this.f59410d.z(aVar);
    }

    @Override // com.yk.e.callBack.MainMaterialCallback
    public final void onAdShow(AdInfo adInfo) {
    }

    @Override // com.yk.e.callBack.MainMaterialCallback
    public final void onAdVideoComplete() {
    }

    @Override // com.yk.e.callBack.MainMaterialCallback
    public final void onAdVideoStart() {
    }
}
