package c;

import bp.r0;
import com.unity3d.ads.IUnityAdsShowListener;
import com.unity3d.ads.UnityAds;

/* JADX INFO: loaded from: classes11.dex */
public final class n implements IUnityAdsShowListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f6477b;

    public n(z zVar) {
        this.f6477b = zVar;
    }

    @Override // com.unity3d.ads.IUnityAdsShowListener
    public final void onUnityAdsShowClick(String str) {
        this.f6477b.C.onAdClick();
    }

    @Override // com.unity3d.ads.IUnityAdsShowListener
    public final void onUnityAdsShowComplete(String str, UnityAds.UnityAdsShowCompletionState unityAdsShowCompletionState) {
        unityAdsShowCompletionState.equals(UnityAds.UnityAdsShowCompletionState.COMPLETED);
        this.f6477b.C.onReward("");
        this.f6477b.C.onAdVideoComplete();
        this.f6477b.C.onAdClose();
    }

    @Override // com.unity3d.ads.IUnityAdsShowListener
    public final void onUnityAdsShowFailure(String str, UnityAds.UnityAdsShowError unityAdsShowError, String str2) {
        this.f6477b.v(" with error: [" + unityAdsShowError + "] " + str2);
    }

    @Override // com.unity3d.ads.IUnityAdsShowListener
    public final void onUnityAdsShowStart(String str) {
        z zVar = this.f6477b;
        zVar.C.onAdShow(r0.b(null, zVar.f71957f));
    }
}
