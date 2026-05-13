package cp;

import android.view.View;
import com.yk.e.callBack.MainMRECCallBack;
import com.yk.e.object.AdInfo;
import j.l0;
import j.y1;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements MainMRECCallBack {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public y1 f59369a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public l0 f59370b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f59371c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i.a f59372d = new i.a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w f59373e;

    public e(w wVar) {
        this.f59373e = wVar;
    }

    @Override // com.yk.e.callBack.MainAdCallBack
    public final void onAdClick() {
    }

    @Override // com.yk.e.callBack.MainMRECCallBack
    public final void onAdClose() {
    }

    @Override // com.yk.e.callBack.MainAdCallBack
    public final void onAdFail(int i10, String str) {
        i.a aVar = this.f59372d;
        aVar.f63634e = i10;
        aVar.f63635f = str;
        if (this.f59371c) {
            this.f59373e.v(aVar);
        } else {
            this.f59373e.B(aVar);
        }
    }

    @Override // com.yk.e.callBack.MainMRECCallBack
    public final void onAdLoaded(View view) {
        double revenue = this.f59369a.getRevenue();
        i.a aVar = this.f59372d;
        aVar.f63630a = revenue;
        aVar.f63631b = this.f59369a;
        aVar.f63632c = this.f59370b;
        aVar.f63633d = view;
        if (this.f59371c) {
            this.f59373e.c(aVar);
        } else {
            this.f59373e.z(aVar);
        }
    }

    @Override // com.yk.e.callBack.MainMRECCallBack
    public final void onAdShow(AdInfo adInfo) {
    }
}
