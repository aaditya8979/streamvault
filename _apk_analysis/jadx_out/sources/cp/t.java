package cp;

import android.view.View;
import com.yk.e.callBack.MainMaterialCallback;
import com.yk.e.object.AdInfo;

/* JADX INFO: loaded from: classes3.dex */
public final class t implements MainMaterialCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f59411a;

    public t(b bVar) {
        this.f59411a = bVar;
    }

    @Override // com.yk.e.callBack.MainAdCallBack
    public final void onAdClick() {
        this.f59411a.q("onAdClick");
        this.f59411a.getClass();
        MainMaterialCallback mainMaterialCallback = this.f59411a.F;
        if (mainMaterialCallback != null) {
            mainMaterialCallback.onAdClick();
        }
    }

    @Override // com.yk.e.callBack.MainMaterialCallback
    public final void onAdClose() {
        this.f59411a.q("onAdClose");
        this.f59411a.getClass();
        MainMaterialCallback mainMaterialCallback = this.f59411a.F;
        if (mainMaterialCallback != null) {
            mainMaterialCallback.onAdClose();
        }
    }

    @Override // com.yk.e.callBack.MainAdCallBack
    public final void onAdFail(int i10, String str) {
        this.f59411a.A(i10, str);
    }

    @Override // com.yk.e.callBack.MainMaterialCallback
    public final void onAdLoaded(View view) {
    }

    @Override // com.yk.e.callBack.MainMaterialCallback
    public final void onAdShow(AdInfo adInfo) {
        this.f59411a.q("onAdShow");
        this.f59411a.getClass();
        MainMaterialCallback mainMaterialCallback = this.f59411a.F;
        if (mainMaterialCallback != null) {
            mainMaterialCallback.onAdShow(adInfo);
        }
    }

    @Override // com.yk.e.callBack.MainMaterialCallback
    public final void onAdVideoComplete() {
        this.f59411a.q("onAdVideoComplete");
        this.f59411a.getClass();
        MainMaterialCallback mainMaterialCallback = this.f59411a.F;
        if (mainMaterialCallback != null) {
            mainMaterialCallback.onAdVideoComplete();
        }
    }

    @Override // com.yk.e.callBack.MainMaterialCallback
    public final void onAdVideoStart() {
        this.f59411a.q("onAdVideoStart");
        this.f59411a.getClass();
        MainMaterialCallback mainMaterialCallback = this.f59411a.F;
        if (mainMaterialCallback != null) {
            mainMaterialCallback.onAdVideoStart();
        }
    }
}
