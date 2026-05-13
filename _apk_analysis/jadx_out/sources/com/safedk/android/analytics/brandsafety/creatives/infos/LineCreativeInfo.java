package com.safedk.android.analytics.brandsafety.creatives.infos;

import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.annotations.AdNetworkIdentifier;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes2.dex */
@AdNetworkIdentifier(packageName = g.f53152z)
public class LineCreativeInfo extends CreativeInfo {
    private static final long serialVersionUID = -7630682732175543532L;
    private String Y;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f52532a;

    public LineCreativeInfo(BrandSafetyUtils.AdType adType, String str, String str2, String str3, String str4, String str5, String str6) {
        super(adType == null ? BrandSafetyUtils.AdType.INTERSTITIAL : adType, g.f53152z, str, str2, str3, null, null);
        this.f52532a = 0;
        this.Y = null;
        h(str5);
        this.Y = str4;
        this.Q = str6;
    }

    public int a() {
        return this.f52532a;
    }

    public String b() {
        return this.Y;
    }
}
