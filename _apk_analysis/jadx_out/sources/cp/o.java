package cp;

import android.view.View;
import com.yk.e.callBack.MainMRECCallBack;
import com.yk.e.object.AdInfo;

/* JADX INFO: loaded from: classes3.dex */
public final class o implements MainMRECCallBack {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w f59397a;

    public o(w wVar) {
        this.f59397a = wVar;
    }

    @Override // com.yk.e.callBack.MainAdCallBack
    public final void onAdClick() {
        this.f59397a.q("onAdClick");
        this.f59397a.getClass();
        MainMRECCallBack mainMRECCallBack = this.f59397a.F;
        if (mainMRECCallBack != null) {
            mainMRECCallBack.onAdClick();
        }
    }

    @Override // com.yk.e.callBack.MainMRECCallBack
    public final void onAdClose() {
        this.f59397a.q("onAdClose");
        this.f59397a.getClass();
        MainMRECCallBack mainMRECCallBack = this.f59397a.F;
        if (mainMRECCallBack != null) {
            mainMRECCallBack.onAdClose();
        }
    }

    @Override // com.yk.e.callBack.MainAdCallBack
    public final void onAdFail(int i10, String str) {
        this.f59397a.A(i10, str);
    }

    @Override // com.yk.e.callBack.MainMRECCallBack
    public final void onAdLoaded(View view) {
    }

    @Override // com.yk.e.callBack.MainMRECCallBack
    public final void onAdShow(AdInfo adInfo) {
        this.f59397a.q("onAdShow");
        this.f59397a.getClass();
        MainMRECCallBack mainMRECCallBack = this.f59397a.F;
        if (mainMRECCallBack != null) {
            mainMRECCallBack.onAdShow(adInfo);
        }
    }
}
