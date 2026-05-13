package com.safedk.android.analytics.brandsafety.creatives.infos;

import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.g;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class MintegralCreativeInfo extends CreativeInfo {

    /* JADX INFO: renamed from: aa, reason: collision with root package name */
    private static final String f52533aa = "MintegralCreativeInfo";
    private static final long serialVersionUID = 5780851683333587923L;
    private String Y;
    private String Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f52534a;

    public MintegralCreativeInfo(String str, BrandSafetyUtils.AdType adType, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z10, String str10) {
        super(adType, g.f53141o, str, str2, str3, str4, str9);
        this.f52534a = null;
        this.Y = null;
        this.Z = null;
        p(str6);
        this.K = str7;
        this.Q = str8;
        this.M = str10;
        this.W = z10;
        z(str5);
    }

    public void H(String str) {
        this.Y = str;
    }

    public void I(String str) {
        this.Z = str;
    }

    public String a() {
        return this.f52534a;
    }

    public void a(String str) {
        this.f52534a = str;
    }

    public String aj() {
        return this.Z;
    }

    public String b() {
        return this.Y;
    }

    public void b(String str, Set<String> set) {
        a(str, set);
        this.ay = true;
    }
}
