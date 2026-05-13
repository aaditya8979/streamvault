package com.safedk.android.analytics.brandsafety;

import android.text.TextUtils;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.utils.Logger;

/* JADX INFO: loaded from: classes8.dex */
public class d {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f52543j = "AdInfoKey";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    String f52544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    String f52545b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String f52546c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    String f52547d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    String f52548e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    BrandSafetyUtils.AdType f52549f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    String f52550g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    String f52551h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    boolean f52552i = false;

    public d(String str, String str2, String str3, String str4, String str5, BrandSafetyUtils.AdType adType) {
        this.f52544a = str;
        this.f52545b = str2;
        this.f52546c = str3;
        this.f52547d = str4;
        this.f52548e = str5;
        this.f52549f = adType;
    }

    private boolean a(BrandSafetyUtils.AdType adType) {
        return (adType == BrandSafetyUtils.AdType.BANNER || adType == BrandSafetyUtils.AdType.MREC) ? false : true;
    }

    public String a() {
        return (this.f52544a != null ? this.f52544a : "") + "_" + (this.f52545b != null ? this.f52545b : "") + "_" + (this.f52546c != null ? this.f52546c : "") + "_" + (this.f52547d != null ? this.f52547d : "");
    }

    public boolean a(d dVar, CreativeInfo creativeInfo) {
        if (!dVar.equals(this)) {
            return false;
        }
        if (TextUtils.isEmpty(this.f52545b)) {
            creativeInfo.h(dVar.f52545b);
            this.f52545b = dVar.f52545b;
        }
        return true;
    }

    public boolean equals(Object obj) {
        Logger.d(f52543j, "equals started with this: " + this + " and that: " + obj);
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        boolean zEquals = this.f52544a.equals(dVar.f52544a);
        boolean z10 = this.f52545b != null && this.f52545b.equals(dVar.f52545b);
        boolean zEquals2 = zEquals && this.f52547d.equals(dVar.f52547d) && ((this.f52548e != null && this.f52548e.equals(dVar.f52548e)) || (this.f52548e == null && dVar.f52548e == null));
        if (this.f52546c != null) {
            zEquals2 &= this.f52546c.equals(dVar.f52546c);
            String strA = CreativeInfoManager.a(this.f52547d, AdNetworkConfiguration.DONT_USE_PLACEMENT_ID_IN_BANNER_AD_INFO_KEY, "");
            if (this.f52548e != null && this.f52548e.equals(strA) && !a(this.f52549f)) {
                Logger.d(f52543j, "not using placement id - equals result is: " + zEquals2);
                return zEquals2;
            }
        }
        return zEquals2 && z10;
    }

    public int hashCode() {
        int iHashCode = this.f52544a.hashCode() * this.f52547d.hashCode();
        String strA = CreativeInfoManager.a(this.f52547d, AdNetworkConfiguration.DONT_USE_PLACEMENT_ID_IN_BANNER_AD_INFO_KEY, "");
        if (a(this.f52549f) || this.f52548e == null || !this.f52548e.equals(strA)) {
            iHashCode *= this.f52545b.hashCode();
        }
        return this.f52546c != null ? iHashCode * this.f52546c.hashCode() : iHashCode;
    }

    public String toString() {
        return "AdInfoKey{adUnitId=" + this.f52544a + ", placementId=" + this.f52545b + ", eventId=" + com.safedk.android.utils.k.b((Object) this.f52546c) + ", sdk=" + this.f52547d + ", maxNetwork=" + com.safedk.android.utils.k.b((Object) this.f52548e) + com.safedk.android.analytics.brandsafety.creatives.discoveries.h.f52302e;
    }
}
