package com.safedk.android.analytics.brandsafety.creatives.infos;

import android.os.Bundle;
import android.text.TextUtils;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.l;
import com.safedk.android.analytics.brandsafety.creatives.e;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.annotations.AdNetworkIdentifier;
import com.safedk.android.utils.g;
import com.safedk.android.utils.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
@AdNetworkIdentifier(packageName = "com.unity3d.ads")
public class UnityAdsCreativeInfo extends CreativeInfo {
    private static final String E = "UnityAdsCreativeInfo";
    private static final String Z = "playableUrl";

    /* JADX INFO: renamed from: ah, reason: collision with root package name */
    private static final String[] f52536ah = {g.f53134h, "com.unity3d.ads"};
    private static final long serialVersionUID = 7447619620074487878L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f52537a;

    /* JADX INFO: renamed from: ac, reason: collision with root package name */
    private String f52538ac;

    /* JADX INFO: renamed from: ae, reason: collision with root package name */
    private String f52539ae;

    /* JADX INFO: renamed from: af, reason: collision with root package name */
    private String f52540af;

    /* JADX INFO: renamed from: ag, reason: collision with root package name */
    private String f52541ag;

    public UnityAdsCreativeInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13) {
        super(BrandSafetyEvent.AdFormatType.BANNER.name().equals(str8) ? BrandSafetyUtils.AdType.BANNER : BrandSafetyUtils.AdType.INTERSTITIAL, "com.unity3d.ads", str, str2, str3, str4, str6);
        this.f52537a = null;
        this.f52538ac = str5;
        this.aY = str7;
        p(str8);
        this.K = str9;
        this.Q = str10;
        if (TextUtils.isEmpty(this.M)) {
            this.M = str11;
        }
        this.f52508ar = str12;
        this.f52510at = str13;
        this.W = !TextUtils.isEmpty(this.f52538ac);
    }

    public void H(String str) {
        this.f52537a = str;
    }

    public String a() {
        return this.f52537a;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo
    public void a(CreativeInfo creativeInfo) {
        Logger.d(E, "mergeScarAdmobCi started");
        l(creativeInfo.Q());
        c(new ArrayList(creativeInfo.s()));
        Iterator<String> it = creativeInfo.p().iterator();
        while (it.hasNext()) {
            x(it.next());
        }
        Iterator<String> it2 = creativeInfo.u().iterator();
        while (it2.hasNext()) {
            C(it2.next());
        }
        Logger.d(E, "mergeScarAdmobCi admob's click url is: " + creativeInfo.M());
        if (creativeInfo.M() != null) {
            Logger.d(E, "mergeScarAdmobCi: setting this object with current ci");
            t(creativeInfo.M());
        }
        if (creativeInfo.v()) {
            d(true);
        }
        if (creativeInfo.H() != null) {
            o(creativeInfo.H());
        }
        if (creativeInfo.g()) {
            Z();
            F(creativeInfo.A());
        }
        if (creativeInfo.N() != null) {
            i(creativeInfo.N());
        }
        if (creativeInfo.U() != null) {
            u(creativeInfo.U());
        }
    }

    public void a(String str) {
        this.f52541ag = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.T = true;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo
    public String aa() {
        return N() + (this.f52539ae != null ? ", " + this.f52539ae : "");
    }

    public String aj() {
        return this.f52540af;
    }

    public String ak() {
        return this.f52510at;
    }

    public String al() {
        return this.f52538ac;
    }

    public String b() {
        return this.f52539ae;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo
    protected boolean b(String str) {
        return (this.F.contains(l.f52370b) || this.F.contains(l.f52371c)) ? AdMobCreativeInfo.a(str) || k.a(str, (Map<String, String>) null) || k.p(str) : super.b(str);
    }

    public void c(String str, String str2) {
        this.f52539ae = str;
        this.f52540af = str2;
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        this.T = true;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo
    public boolean c() {
        return TextUtils.isEmpty(N()) || TextUtils.isEmpty(M());
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo
    public Bundle d() {
        Bundle bundleD = super.d();
        if (!TextUtils.isEmpty(this.f52538ac)) {
            bundleD.putString(Z, this.f52538ac);
        }
        if (N() == null || (this.I && this.f52539ae != null)) {
            bundleD.putString("creative_id", this.f52539ae);
        }
        if (this.J == null || (this.I && this.f52540af != null)) {
            bundleD.putString("video_url", this.f52540af);
        }
        return bundleD;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo
    public String n() {
        return this.aY;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo
    protected boolean v(String str) {
        return (this.F.contains(l.f52370b) || this.F.contains(l.f52371c)) ? e.a(f52536ah, str) : super.v(str);
    }
}
