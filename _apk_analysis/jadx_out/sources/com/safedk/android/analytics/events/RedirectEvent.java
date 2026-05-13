package com.safedk.android.analytics.events;

import android.os.Bundle;
import com.safedk.android.analytics.StatsCollector;
import com.safedk.android.analytics.brandsafety.p;
import com.safedk.android.analytics.events.base.StatsEvent;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.SdksMapping;
import com.safedk.android.utils.k;
import com.unity3d.services.UnityAdsConstants;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public class RedirectEvent extends StatsEvent implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f52808a = 120000;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f52809b = "redirect";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f52810c = "redirect_url";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f52811d = "redirect_type";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f52812e = "foreground_activity";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f52813f = "max_events";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f52814g = "touch_ts";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f52815h = "external";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f52816i = "internal";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f52817j = "customtab";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f52818k = "suspected_store_kit";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f52819l = "RedirectEvent";
    private static final long serialVersionUID = 4907228751695554606L;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f52820m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f52821n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f52822o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f52823p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private MaxEvents f52824q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f52825r;

    public RedirectEvent(String str, String str2, String str3, String str4, long j10, long j11) {
        super(str, StatsCollector.EventType.redirect);
        this.f52824q = null;
        Logger.d(f52819l, "RedirectEvent ctor started, sdk=" + str + ", redirectUrl=" + str2 + ", redirectType=" + str3 + ", foregroundActivity=" + str4 + " ,timestamp=" + j10 + ", touchTs=" + j11);
        Logger.d(f52819l, "RedirectEvent ctor SdksMapping.getSdkNameByPackage()=" + SdksMapping.getSdkNameByPackage(str));
        Logger.d(f52819l, "RedirectEvent ctor SdksMapping.getSdkPackageByClass()=" + SdksMapping.getSdkPackageByClass(str));
        String sdkUUIDByPackage = SdksMapping.getSdkUUIDByPackage(str);
        if (sdkUUIDByPackage == null || SdksMapping.getAllSdkVersionsMap() == null || SdksMapping.getAllSdkVersionsMap().get(sdkUUIDByPackage) == null) {
            Logger.d(f52819l, "RedirectEvent ctor cannot find version for sdk " + str + " , SdkVersionsMap=" + SdksMapping.getAllSdkVersionsMap());
        } else {
            this.f52820m = SdksMapping.getAllSdkVersionsMap().get(sdkUUIDByPackage);
            Logger.d(f52819l, "RedirectEvent ctor sdkVersion=" + this.f52820m);
        }
        this.f52821n = str2;
        this.f52822o = str3;
        this.f52823p = str4;
        this.f52825r = k.b(j11);
        this.I = false;
    }

    public static String a(Bundle bundle) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(StatsCollector.EventType.redirect + "_");
        if (bundle.getString("redirect_url") == null) {
            sb2.append("_");
        } else {
            sb2.append(bundle.getString("redirect_url") + "_");
        }
        sb2.append(bundle.getLong("timestamp"));
        Logger.d(f52819l, "Getting key from bundle : " + sb2.toString());
        return sb2.toString();
    }

    public void a(MaxEvents maxEvents) {
        synchronized (p.a()) {
            this.f52824q = (MaxEvents) maxEvents.clone();
            Logger.d(f52819l, "setMaxEvents , added " + this.f52824q.size() + " items. content : " + this.f52824q);
        }
    }

    @Override // com.safedk.android.analytics.events.base.StatsEvent
    public void a(StatsEvent statsEvent) {
        if (((RedirectEvent) statsEvent).I) {
            this.I = true;
        }
        if (((RedirectEvent) statsEvent).d() == null || d() != null) {
            return;
        }
        a(((RedirectEvent) statsEvent).d());
    }

    public void a(String str) {
        this.f52821n = str;
    }

    @Override // com.safedk.android.analytics.events.base.StatsEvent
    public boolean a_() {
        return System.currentTimeMillis() - this.G > UnityAdsConstants.Timeout.INIT_TIMEOUT_MS || this.f52821n != null || this.I;
    }

    @Override // com.safedk.android.analytics.events.base.StatsEvent
    public StatsCollector.EventType b() {
        return StatsCollector.EventType.redirect;
    }

    @Override // com.safedk.android.analytics.events.base.StatsEvent
    public String c() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(StatsCollector.EventType.redirect + "_");
        sb2.append(this.f52821n == null ? "_" : this.f52821n + "_");
        sb2.append(this.G);
        Logger.d(f52819l, "Getting key from object : " + sb2.toString());
        return sb2.toString();
    }

    public String d() {
        return this.f52821n;
    }

    @Override // com.safedk.android.analytics.events.base.StatsEvent
    public Bundle e() {
        Bundle bundleE = super.e();
        bundleE.putString("sdk_version", this.f52820m);
        bundleE.putString("redirect_url", this.f52821n);
        bundleE.putString("redirect_type", this.f52822o);
        bundleE.putString("foreground_activity", this.f52823p);
        bundleE.putLong(f52814g, this.f52825r);
        if (this.f52824q != null && this.f52824q.size() > 0) {
            synchronized (p.a()) {
                bundleE.putParcelableArrayList(f52813f, this.f52824q.a());
            }
        }
        Logger.d(f52819l, "Redirect Event toBundle : " + bundleE.toString());
        return bundleE;
    }
}
