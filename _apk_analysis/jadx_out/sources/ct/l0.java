package ct;

import android.view.View;
import com.yk.e.callBack.MainMaterialCallback;
import com.yk.e.object.AdInfo;

/* JADX INFO: loaded from: classes10.dex */
public final class l0 implements bp.u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f59457a;

    public l0(g gVar) {
        this.f59457a = gVar;
    }

    @Override // bp.u
    public final void onAdClick() {
        MainMaterialCallback mainMaterialCallback = this.f59457a.G;
        if (mainMaterialCallback != null) {
            mainMaterialCallback.onAdClick();
        }
    }

    @Override // bp.u
    public final void onAdLoaded(View view) {
        MainMaterialCallback mainMaterialCallback = this.f59457a.G;
        if (mainMaterialCallback != null) {
            mainMaterialCallback.onAdLoaded(view);
        }
    }

    @Override // bp.u
    public final void onAdShow(AdInfo adInfo) {
        MainMaterialCallback mainMaterialCallback = this.f59457a.G;
        if (mainMaterialCallback != null) {
            mainMaterialCallback.onAdShow(adInfo);
        }
    }
}
