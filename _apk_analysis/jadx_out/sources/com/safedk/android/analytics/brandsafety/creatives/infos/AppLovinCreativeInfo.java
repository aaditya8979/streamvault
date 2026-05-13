package com.safedk.android.analytics.brandsafety.creatives.infos;

import android.os.Bundle;
import android.text.TextUtils;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.annotations.AdNetworkIdentifier;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes11.dex */
@AdNetworkIdentifier(packageName = g.f53127a)
public class AppLovinCreativeInfo extends CreativeInfo {
    private static final String Y = "is_js_tag_ad";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f52464a = "AppLovinCreativeInfo";
    private static final long serialVersionUID = 909322237728593140L;
    private boolean E;

    public AppLovinCreativeInfo(BrandSafetyUtils.AdType adType, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, boolean z10, boolean z11, boolean z12) {
        super(adType, g.f53127a, str, str2, str3, str4, str8);
        this.E = false;
        this.K = str6;
        p(str5);
        this.Q = str7;
        this.f52508ar = str9;
        this.T = z10;
        this.W = z11;
        if (o() == null && str11 != null) {
            q(str11);
        }
        f(str10);
        this.E = z12;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo
    public boolean c() {
        return TextUtils.isEmpty(N()) || TextUtils.isEmpty(M());
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo
    public Bundle d() {
        Bundle bundleD = super.d();
        if (this.E) {
            bundleD.putBoolean(Y, true);
            Logger.d(f52464a, "is_js_tag_ad field is " + this.E);
        }
        return bundleD;
    }
}
