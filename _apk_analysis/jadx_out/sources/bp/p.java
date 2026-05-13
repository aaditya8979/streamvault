package bp;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.preload.PreloadCallbackV2;
import com.ironsource.Z7;
import com.yk.e.util.AdLog;

/* JADX INFO: loaded from: classes9.dex */
public final class p extends PreloadCallbackV2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5852b;

    public p(String str, String str2) {
        this.f5851a = str;
        this.f5852b = str2;
    }

    @Override // com.google.android.gms.ads.preload.PreloadCallbackV2
    public final void onAdFailedToPreload(String str, AdError adError) {
        AdLog.i("admob preload ad failed, msg = " + adError.getMessage() + Z7.f30794r + this.f5851a + Z7.f30794r + this.f5852b);
    }

    @Override // com.google.android.gms.ads.preload.PreloadCallbackV2
    public final void onAdPreloaded(String str, ResponseInfo responseInfo) {
        AdLog.i("admob preload ad success, " + this.f5851a + Z7.f30794r + this.f5852b);
    }

    @Override // com.google.android.gms.ads.preload.PreloadCallbackV2
    public final void onAdsExhausted(String str) {
    }
}
