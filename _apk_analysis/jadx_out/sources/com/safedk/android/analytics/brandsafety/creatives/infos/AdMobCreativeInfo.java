package com.safedk.android.analytics.brandsafety.creatives.infos;

import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.annotations.AdNetworkIdentifier;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes11.dex */
@AdNetworkIdentifier(packageName = g.f53134h)
public class AdMobCreativeInfo extends CreativeInfo {
    private static String[] Y = {"googleusercontent.com", "/simgad/", "mts0.google.com", "gstatic.com", "pageadimg/imgad"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f52463a = "AdMobCreativeInfo";
    private static final long serialVersionUID = -3498860760603370212L;

    public AdMobCreativeInfo(String str, BrandSafetyUtils.AdType adType, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        super(adType, g.f53134h, str, str2, str3, str5, str7);
        this.K = str4;
        this.Q = str6;
        if (o() != null || str8 == null) {
            return;
        }
        q(str8);
    }

    public static boolean a(String str) {
        for (String str2 : Y) {
            if (str.contains(str2)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo
    protected boolean b(String str) {
        return a(str) || super.b(str);
    }
}
