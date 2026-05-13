package com.safedk.android.analytics.brandsafety.creatives.infos;

import android.text.TextUtils;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.annotations.AdNetworkIdentifier;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes11.dex */
@AdNetworkIdentifier(packageName = g.f53132f)
public class IronSourceCreativeInfo extends CreativeInfo {
    private static final String Y = "playableAd";
    private static final String Z = "creativeURL&quot;:&quot;";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f52528a = "cpvi";
    private static final long serialVersionUID = 583040939198244951L;

    /* JADX INFO: renamed from: aa, reason: collision with root package name */
    private String f52529aa;

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private String f52530ab;

    /* JADX INFO: renamed from: ac, reason: collision with root package name */
    private String f52531ac;

    public IronSourceCreativeInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        super(BrandSafetyUtils.AdType.INTERSTITIAL, g.f53132f, str, str2, str3, str4, str5);
        this.f52529aa = str6;
        z(this.f52529aa);
        p(str7);
        this.K = str8;
        this.Q = str10;
        this.f52530ab = str5;
        this.f52508ar = str11;
        this.T = false;
        this.W = !TextUtils.isEmpty(str6);
        this.f52510at = str9;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo
    public void F(String str) {
        super.F(str);
        if (str == null || str.indexOf(Z) <= -1) {
            return;
        }
        this.f52531ac = str.split(Z)[1].split("&quot;,&quot;")[0];
    }

    public String a() {
        return this.f52531ac;
    }

    public String aj() {
        return this.f52529aa;
    }

    public String b() {
        return this.f52530ab;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo
    public boolean c() {
        boolean z10 = TextUtils.isEmpty(N()) || TextUtils.isEmpty(M());
        if (z10) {
            return z10;
        }
        switch (this.f52530ab) {
        }
        return z10;
    }
}
