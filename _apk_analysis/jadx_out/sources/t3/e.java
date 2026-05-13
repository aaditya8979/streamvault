package t3;

import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.ads.mediation.mintegral.MintegralMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.Frame;
import com.mbridge.msdk.out.NativeAdWithCodeListener;
import java.util.List;

/* JADX INFO: compiled from: MintegralNativeAdListener.java */
/* JADX INFO: loaded from: classes9.dex */
public class e extends NativeAdWithCodeListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> f84639b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public d f84640c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f84641d;

    public e(@NonNull d dVar, Context context, MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> mediationAdLoadCallback) {
        this.f84641d = context;
        this.f84640c = dVar;
        this.f84639b = mediationAdLoadCallback;
    }

    @Override // com.mbridge.msdk.out.NativeListener.NativeAdListener
    public void onAdClick(Campaign campaign) {
        MediationNativeAdCallback mediationNativeAdCallback = this.f84640c.f84633d;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.reportAdClicked();
            this.f84640c.f84633d.onAdLeftApplication();
        }
    }

    @Override // com.mbridge.msdk.out.NativeListener.NativeAdListener
    public void onAdFramesLoaded(List<Frame> list) {
    }

    @Override // com.mbridge.msdk.out.NativeAdWithCodeListener
    public void onAdLoadErrorWithCode(int i10, String str) {
        AdError adErrorB = s3.d.b(i10, str);
        Log.w(MintegralMediationAdapter.TAG, adErrorB.toString());
        this.f84639b.onFailure(adErrorB);
    }

    @Override // com.mbridge.msdk.out.NativeListener.NativeAdListener
    public void onAdLoaded(List<Campaign> list, int i10) {
        if (list == null || list.size() == 0) {
            AdError adErrorA = s3.d.a(104, "Mintegral SDK failed to return a native ad.");
            Log.w(MintegralMediationAdapter.TAG, adErrorA.toString());
            this.f84639b.onFailure(adErrorA);
        } else {
            this.f84640c.a(list.get(0), this.f84641d);
            d dVar = this.f84640c;
            dVar.f84633d = this.f84639b.onSuccess(dVar);
        }
    }

    @Override // com.mbridge.msdk.out.NativeListener.NativeAdListener
    public void onLoggingImpression(int i10) {
        MediationNativeAdCallback mediationNativeAdCallback = this.f84640c.f84633d;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.reportAdImpression();
        }
    }
}
