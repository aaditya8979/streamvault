package com.safedk.android.analytics.brandsafety.creatives.infos;

import android.os.Bundle;
import android.text.TextUtils;
import com.ironsource.C3978d4;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import com.safedk.android.utils.g;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public class InMobiCreativeInfo extends CreativeInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f52526a = "advertised_content";

    /* JADX INFO: renamed from: aa, reason: collision with root package name */
    private static final String f52527aa = "InMobiCreativeInfo";
    private static final long serialVersionUID = 5552604508381236855L;
    private int E;
    private String Y;
    private String Z;

    public InMobiCreativeInfo(String str, String str2, String str3, String str4, BrandSafetyUtils.AdType adType, int i10, BrandSafetyEvent.AdFormatType adFormatType, String str5, String str6) {
        BrandSafetyEvent.AdFormatType adFormatTypeA;
        super(adType, g.f53135i, str, str2, null, null, null);
        this.K = str3;
        this.Y = str;
        this.Q = str4;
        this.E = i10;
        if (adFormatType != null) {
            p(adFormatType == BrandSafetyEvent.AdFormatType.LEADER ? BrandSafetyEvent.AdFormatType.BANNER.name() : adFormatType.name());
        } else if (adType != null && (adFormatTypeA = BrandSafetyUtils.a(adType)) != null) {
            p(adFormatTypeA.name());
        }
        f(str5);
        this.Z = str6;
    }

    public String a() {
        return this.Y;
    }

    public InMobiCreativeInfo aj() {
        return new InMobiCreativeInfo(L(), N(), this.K, this.Q, K(), this.E, BrandSafetyEvent.AdFormatType.valueOf(I()), m(), this.Z);
    }

    public int b() {
        return this.E;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo
    protected boolean b(String str) {
        if (str == null) {
            return false;
        }
        return super.b(str.split(C3978d4.j.f31381c)[0]);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo
    public Bundle d() {
        Bundle bundleD = super.d();
        if (this.aw != null && !this.aw.isEmpty()) {
            synchronized (this.aw) {
                bundleD.putStringArrayList(BrandSafetyEvent.f52766u, new ArrayList<>(this.aw));
            }
        }
        if (!TextUtils.isEmpty(this.Z)) {
            bundleD.putString(f52526a, this.Z);
        }
        return bundleD;
    }
}
