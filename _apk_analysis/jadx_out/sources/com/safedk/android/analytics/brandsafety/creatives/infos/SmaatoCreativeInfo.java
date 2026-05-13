package com.safedk.android.analytics.brandsafety.creatives.infos;

import android.os.Bundle;
import android.text.TextUtils;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import com.safedk.android.utils.annotations.AdNetworkIdentifier;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes11.dex */
@AdNetworkIdentifier(packageName = g.f53148v)
public class SmaatoCreativeInfo extends CreativeInfo {
    private static final String E = "iurl";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f52535a = "SmaatoCreativeInfo";
    private String Y;

    public SmaatoCreativeInfo(String str, String str2, BrandSafetyUtils.AdType adType, BrandSafetyEvent.AdFormatType adFormatType, String str3, String str4, String str5, String str6, String str7, String str8) {
        super(adType, g.f53148v, str, str2, str8, null, str6);
        p(adFormatType.toString());
        this.K = str3;
        this.aY = str4;
        this.Y = str5;
        this.Q = str7;
    }

    public String a() {
        return this.Y;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo
    public Bundle d() {
        Bundle bundleD = super.d();
        if (!TextUtils.isEmpty(this.Y)) {
            bundleD.putString(E, this.Y);
        }
        return bundleD;
    }
}
