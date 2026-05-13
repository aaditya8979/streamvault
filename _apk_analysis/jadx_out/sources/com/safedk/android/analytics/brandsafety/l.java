package com.safedk.android.analytics.brandsafety;

import com.safedk.android.analytics.brandsafety.ImpressionLog;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.utils.Logger;
import java.util.HashSet;
import java.util.UUID;

/* JADX INFO: loaded from: classes8.dex */
public class l {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f52672i = "ImpressionInfo";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    String f52673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    j f52674b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String f52675c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    RedirectData f52676d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f52677e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public HashSet<String> f52678f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public HashSet<String> f52679g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final ImpressionLog f52680h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private CreativeInfo f52681j;

    public l(RedirectData redirectData) {
        this(null, null);
        this.f52676d = redirectData;
    }

    public l(String str) {
        this(str, null);
    }

    public l(String str, j jVar) {
        this.f52675c = null;
        this.f52677e = 0;
        this.f52678f = new HashSet<>();
        this.f52679g = new HashSet<>();
        this.f52680h = new ImpressionLog();
        this.f52673a = str == null ? UUID.randomUUID().toString() : str;
        this.f52674b = jVar;
        this.f52681j = null;
    }

    public void a(RedirectData redirectData) {
        this.f52676d = redirectData;
        this.f52677e++;
        if (!redirectData.f51820b || this.f52681j == null) {
            return;
        }
        this.f52681j.e();
    }

    public void a(CreativeInfo creativeInfo) {
        if (this.f52681j == null && creativeInfo != null) {
            a(ImpressionLog.f51743m, new ImpressionLog.a[0]);
        }
        this.f52681j = creativeInfo;
        if (creativeInfo != null) {
            synchronized (this.f52678f) {
                Logger.d(f52672i, "set creative info, removing webview resource urls ci = " + creativeInfo.L() + ", webview_resource_urls resourceUrlList = " + this.f52678f);
            }
            creativeInfo.q().addAll(this.f52678f);
            this.f52678f = new HashSet<>();
            creativeInfo.p().addAll(this.f52679g);
            this.f52679g = new HashSet<>();
            boolean zA = CreativeInfoManager.a(creativeInfo.Q(), AdNetworkConfiguration.DETECT_MULTIPLE_ADS_BY_WEB_VIEW_CHANGE, false);
            if (!creativeInfo.ah() || this.f52674b == null || zA) {
                return;
            }
            Logger.d(f52672i, "set creative info, removing image taken for multi-ad " + this.f52674b.f52620b);
            BrandSafetyUtils.d(this.f52674b.f52620b);
            this.f52674b = null;
        }
    }

    public void a(String str, ImpressionLog.a... aVarArr) {
        this.f52680h.a(str, aVarArr);
    }

    public boolean a() {
        return this.f52676d != null && this.f52676d.f51819a;
    }

    public void b(String str, ImpressionLog.a... aVarArr) {
        this.f52680h.b(str, aVarArr);
    }

    public boolean b() {
        return this.f52676d != null && this.f52676d.f51820b;
    }

    public CreativeInfo c() {
        return this.f52681j;
    }

    public void d() {
        this.f52674b = null;
    }

    public String toString() {
        return "Impression: id=" + this.f52673a + ", image is: " + this.f52674b + ", CI is: " + this.f52681j;
    }
}
