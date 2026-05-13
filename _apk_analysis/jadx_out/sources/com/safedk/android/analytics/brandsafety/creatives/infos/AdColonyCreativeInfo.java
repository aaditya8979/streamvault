package com.safedk.android.analytics.brandsafety.creatives.infos;

import android.os.Bundle;
import android.text.TextUtils;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.annotations.AdNetworkIdentifier;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes4.dex */
@AdNetworkIdentifier(packageName = g.f53128b)
public class AdColonyCreativeInfo extends CreativeInfo {
    private static final String Y = "AdColonyCreativeInfo";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f52461a = "manifest_url";
    private static final long serialVersionUID = -5937630405018276749L;
    private String Z;

    /* JADX INFO: renamed from: aa, reason: collision with root package name */
    private String f52462aa;

    public AdColonyCreativeInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z10, String str9) {
        super(BrandSafetyUtils.AdType.INTERSTITIAL, g.f53128b, str, str2, str4, str5, str9);
        this.Z = str3;
        p(str6);
        this.K = str7;
        this.Q = str8;
        this.W = z10;
    }

    public String a() {
        return this.Z;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo
    public void a(Object obj) {
        if (this.aW != null) {
            Logger.d(Y, "ci matching object address was not set because it was already set previously to: " + this.aW);
        } else if (obj != null) {
            this.aX = obj.getClass().getCanonicalName();
            this.aW = BrandSafetyUtils.a(obj);
            Logger.d(Y, "set matching object - type: " + this.aX + ", address: " + this.aW + ", ad id: " + L());
        }
    }

    public void a(String str) {
        this.f52462aa = str;
    }

    public String b() {
        return this.f52462aa;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo
    public boolean c() {
        return TextUtils.isEmpty(N()) || TextUtils.isEmpty(M());
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo
    public Bundle d() {
        Bundle bundleD = super.d();
        if (!TextUtils.isEmpty(this.Z)) {
            bundleD.putString(CreativeInfo.D, this.Z);
        }
        if (this.f52462aa != null && !this.f52462aa.isEmpty()) {
            bundleD.putString(f52461a, this.f52462aa);
        }
        return bundleD;
    }
}
