package com.safedk.android.analytics.brandsafety.creatives.infos;

import android.text.TextUtils;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.annotations.AdNetworkIdentifier;
import com.safedk.android.utils.g;
import java.sql.Timestamp;

/* JADX INFO: loaded from: classes9.dex */
@AdNetworkIdentifier(packageName = g.f53130d)
public class VungleCreativeInfo extends CreativeInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f52542a = "vungle_mraid";
    private static final long serialVersionUID = -7630682732175543531L;
    private boolean Y;

    public VungleCreativeInfo(BrandSafetyUtils.AdType adType, String str, String str2, String str3, String str4, String str5, String str6, String str7, long j10, String str8) {
        super(adType, g.f53130d, str, str2, str3, str4, str8);
        this.Y = false;
        p(str5);
        this.K = str6;
        this.Q = str7;
        this.R = new Timestamp(j10);
    }

    public boolean a() {
        return this.Y;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo
    public void b(boolean z10) {
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo
    public boolean c() {
        return TextUtils.isEmpty(N()) || TextUtils.isEmpty(M());
    }

    public void i(boolean z10) {
        this.Y = z10;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo
    public boolean v(String str) {
        return super.v(str);
    }
}
