package com.safedk.android.analytics.brandsafety.creatives.infos;

import android.os.Bundle;
import android.text.TextUtils;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.annotations.AdNetworkIdentifier;
import com.safedk.android.utils.g;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
@AdNetworkIdentifier(packageName = g.f53142p)
public class FyberCreativeInfo extends CreativeInfo {
    private static final String Y = "FyberCreativeInfo";

    /* JADX INFO: renamed from: aa, reason: collision with root package name */
    private static final String f52522aa = "alternative_click_url";

    /* JADX INFO: renamed from: ac, reason: collision with root package name */
    private static final List<String> f52523ac = Arrays.asList("www.serveroute.com/log_string", "column=", "line=", "ad_exchange=inneractive&mraid_version=");
    private static final long serialVersionUID = -5726627304425536096L;

    /* JADX INFO: renamed from: ad, reason: collision with root package name */
    private String f52524ad;

    /* JADX INFO: renamed from: ag, reason: collision with root package name */
    private String f52525ag;

    public FyberCreativeInfo(String str, String str2, String str3, String str4, String str5, String str6, BrandSafetyUtils.AdType adType, String str7, String str8, String str9, String str10, String str11, String str12) {
        super(adType, g.f53142p, str, str2, str4, str5, "");
        this.K = str7;
        Logger.d(Y, "FyberCreativeInfo ctor started");
        p(str6);
        this.f52524ad = str3;
        this.Q = str8;
        this.f52508ar = str9;
        this.aY = str10;
        this.f52525ag = str11;
        f(str12);
    }

    public String a() {
        return this.f52524ad;
    }

    public String b() {
        return this.f52525ag;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo
    public void b(List<String> list) {
        Logger.d(Y, "classifyPrefetchUrl started, urlList=" + list);
        if (list != null) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                String strD = D(it.next());
                boolean z10 = false;
                if (!TextUtils.isEmpty(strD)) {
                    if (b(strD)) {
                        z(strD);
                        z10 = true;
                    } else if (v(strD) && !strD.equals(M())) {
                        x(strD);
                        z10 = true;
                    }
                    if (!z10) {
                        Logger.d(Y, "classifyPrefetchUrl url is unclassified and will be dropped : " + strD);
                    }
                }
            }
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo
    public boolean c() {
        return false;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo
    public Bundle d() {
        Bundle bundleD = super.d();
        if (!TextUtils.isEmpty(this.f52524ad)) {
            bundleD.putString(CreativeInfo.D, this.f52524ad);
        }
        if (!TextUtils.isEmpty(this.f52525ag)) {
            bundleD.putString(f52522aa, this.f52525ag);
        }
        return bundleD;
    }
}
