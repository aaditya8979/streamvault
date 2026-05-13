package com.safedk.android.analytics.brandsafety.creatives.infos;

import android.os.Bundle;
import android.text.TextUtils;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.annotations.AdNetworkIdentifier;

/* JADX INFO: loaded from: classes8.dex */
@AdNetworkIdentifier(packageName = "com.facebook.ads")
public class FacebookAudienceNetworkCreativeInfo extends CreativeInfo {
    public static final String E = "unknown";
    public static final String Y = "template";
    public static final String Z = "markup";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f52518a = "placementId";

    /* JADX INFO: renamed from: aa, reason: collision with root package name */
    public static final String f52519aa = "end_card_markup";

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    public static final String f52520ab = "template_carousel";

    /* JADX INFO: renamed from: ac, reason: collision with root package name */
    String f52521ac;

    public FacebookAudienceNetworkCreativeInfo(BrandSafetyUtils.AdType adType, String str, String str2, String str3, String str4, String str5) {
        super(adType, "com.facebook.ads", str, null, str2, str3, str5);
        this.H = true;
        this.f52521ac = str4;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo
    public String G() {
        return super.G() + this.f52521ac;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo
    public boolean c() {
        return TextUtils.isEmpty(this.f52521ac) || (TextUtils.isEmpty(M()) && TextUtils.isEmpty(this.J));
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo
    public Bundle d() {
        Bundle bundleD = super.d();
        bundleD.putString("placementId", this.f52521ac);
        return bundleD;
    }
}
