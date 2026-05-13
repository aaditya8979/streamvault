package com.safedk.android.analytics.brandsafety;

import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.WebView;
import com.ironsource.C3978d4;
import com.ironsource.Z7;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import com.safedk.android.utils.Logger;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes8.dex */
public class c {
    protected static final String S = "network_name";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f51868a = "AdInfo";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f51869b = "image_hash";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f51870c = "sdk_package";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f51871d = "sdk_uid";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f51872e = "type";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f51873f = "ad_format_type";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f51874g = "response_code";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f51875h = "image_url";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f51876i = "image_id";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f51877j = "image_orientation";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f51878k = "text";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f51879l = "safedk_version";
    public Bundle A;
    String B;
    String C;
    String D;
    boolean E;
    boolean F;
    boolean G;
    boolean H;
    public boolean I;
    AdNetworkDiscovery.WebViewResourceMatchingMethod J;
    String K;
    String L;
    String M;
    boolean N;
    boolean O;
    String P;
    String Q;
    final ImpressionLog R;
    protected boolean T;
    public boolean U;
    private final List<l> V;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected List<String> f51880m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected List<String> f51881n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    long f51882o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public BrandSafetyUtils.AdType f51883p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    protected String f51884q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    long f51885r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    String f51886s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    String f51887t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    BrandSafetyUtils.ScreenShotOrientation f51888u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    String f51889v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    boolean f51890w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    String f51891x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    int f51892y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    int f51893z;

    public c(int i10, Bundle bundle, String str, String str2, String str3, BrandSafetyUtils.ScreenShotOrientation screenShotOrientation, BrandSafetyUtils.AdType adType) {
        this(str, str2, str3, screenShotOrientation, null, adType);
        this.A = bundle;
        this.f51893z = i10;
    }

    public c(String str, long j10, BrandSafetyUtils.AdType adType) {
        this.f51880m = null;
        this.f51881n = null;
        this.f51882o = 0L;
        this.f51888u = BrandSafetyUtils.ScreenShotOrientation.NOT_INITIALIZED;
        this.f51890w = false;
        this.f51891x = null;
        this.f51892y = 0;
        this.B = null;
        this.C = null;
        this.V = new ArrayList();
        this.D = null;
        this.E = false;
        this.F = false;
        this.G = false;
        this.H = false;
        this.I = false;
        this.J = AdNetworkDiscovery.WebViewResourceMatchingMethod.DEFAULT;
        this.L = null;
        this.M = null;
        this.N = false;
        this.O = false;
        this.P = null;
        this.Q = null;
        this.R = new ImpressionLog();
        this.U = false;
        Logger.d(f51868a, "AdInfo ctor started, maxSdk = " + str + ", timestamp = " + this.f51885r + ", adType = " + (adType != null ? adType.name() : ""));
        this.f51889v = str;
        this.f51885r = j10;
        this.f51883p = adType;
    }

    public c(String str, String str2, String str3, BrandSafetyUtils.ScreenShotOrientation screenShotOrientation, String str4, BrandSafetyUtils.AdType adType) {
        this.f51880m = null;
        this.f51881n = null;
        this.f51882o = 0L;
        this.f51888u = BrandSafetyUtils.ScreenShotOrientation.NOT_INITIALIZED;
        this.f51890w = false;
        this.f51891x = null;
        this.f51892y = 0;
        this.B = null;
        this.C = null;
        this.V = new ArrayList();
        this.D = null;
        this.E = false;
        this.F = false;
        this.G = false;
        this.H = false;
        this.I = false;
        this.J = AdNetworkDiscovery.WebViewResourceMatchingMethod.DEFAULT;
        this.L = null;
        this.M = null;
        this.N = false;
        this.O = false;
        this.P = null;
        this.Q = null;
        this.R = new ImpressionLog();
        this.U = false;
        Logger.d(f51868a, "AdInfo ctor started, hashValue = " + str + ", fileName = " + str4 + ", maxSdk = " + str2 + ", adType = " + (adType != null ? adType.name() : ""));
        this.f51889v = str2;
        this.f51885r = System.currentTimeMillis();
        this.f51883p = adType;
        j jVar = new j(str, str4, screenShotOrientation);
        synchronized (this) {
            this.V.add(new l(str3, jVar));
        }
        if (str2 != null) {
            this.J = CreativeInfoManager.a(str2);
        }
    }

    public c(String[] strArr, int i10, Bundle bundle, String str, String str2, String str3, BrandSafetyUtils.ScreenShotOrientation screenShotOrientation, BrandSafetyUtils.AdType adType) {
        this(str, str2, str3, screenShotOrientation, null, adType);
        if (strArr != null) {
            this.C = strArr[0];
            this.B = strArr[1];
        }
        this.A = bundle;
        this.f51893z = i10;
    }

    private synchronized List<String> E() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator<l> it = this.V.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().f52673a);
        }
        return arrayList;
    }

    public String A() {
        if (this.A == null || !this.A.containsKey("network_name") || TextUtils.isEmpty(this.A.getString("network_name"))) {
            return null;
        }
        return this.A.getString("network_name");
    }

    public String B() {
        return this.Q;
    }

    public void C() {
        this.L = null;
        this.K = null;
        this.A = null;
        this.f51893z = 0;
        this.B = null;
        this.C = null;
    }

    public void D() {
        e(true);
        C();
    }

    public long a() {
        return this.f51885r;
    }

    public void a(ImpressionLog impressionLog) {
        this.R.a(impressionLog);
    }

    public void a(CreativeInfo creativeInfo) {
        if (creativeInfo != null) {
            if (CreativeInfoManager.a(this.f51889v, AdNetworkConfiguration.DETECT_MULTIPLE_ADS_BY_WEB_VIEW_CHANGE, false)) {
                if (this.D != null && !creativeInfo.ah()) {
                    creativeInfo.ai();
                    String strH = creativeInfo.h();
                    if (strH != null) {
                        creativeInfo.c(strH + CreativeInfo.aJ);
                    }
                }
            } else if (creativeInfo.ah()) {
                if (this.D == null) {
                    this.D = UUID.randomUUID().toString();
                    Logger.d(f51868a, "set CI, generate multi ad UUID: " + this.D);
                } else {
                    synchronized (this) {
                        this.V.add(new l(UUID.randomUUID().toString()));
                        Logger.d(f51868a, "set CI, create new impression for multi ad, impression list: " + this.V);
                    }
                }
            }
            l lVarH = h();
            Logger.d(f51868a, "set CI, impression: " + lVarH);
            if (lVarH != null) {
                if (!creativeInfo.ah() && lVarH.c() != null && lVarH.c().L() != null && !lVarH.c().L().equals(creativeInfo.L())) {
                    Logger.d(f51868a, "set CI, failed to set CI due to unmatched IDs: old: " + creativeInfo.L() + ", new: " + lVarH.c().L());
                    return;
                } else {
                    if (lVarH.b()) {
                        creativeInfo.e();
                    }
                    lVarH.a(creativeInfo);
                }
            }
            Logger.d(f51868a, "set CI, number of CIs: " + j().size() + ", impression IDs: " + E() + ", multi ad UUID: " + this.D);
        }
    }

    public void a(d dVar, Bundle bundle, int i10) {
        this.L = dVar.f52546c;
        this.K = dVar.f52550g;
        this.A = bundle;
        this.f51893z = i10;
    }

    public void a(Long l10, Long l11, String str, ImpressionLog.a... aVarArr) {
        this.R.a(l10, l11, str, aVarArr);
    }

    public void a(String str) {
        this.f51887t = str;
    }

    public void a(String str, ImpressionLog.a... aVarArr) {
        this.R.a(str, aVarArr);
    }

    public void a(List<String> list) {
        Logger.d(f51868a, "setting view hierarchy : " + list);
        this.f51880m = list;
    }

    public void a(boolean z10) {
        this.f51890w = z10;
    }

    public void a(String[] strArr) {
        this.C = strArr[0];
        this.B = strArr[1];
    }

    public String b() {
        return this.f51887t;
    }

    public synchronized void b(String str) {
        this.f51889v = str;
    }

    public void b(String str, ImpressionLog.a... aVarArr) {
        this.R.b(str, aVarArr);
    }

    public void b(List<WeakReference<WebView>> list) {
        StringBuilder sb2 = new StringBuilder("setViewsAddresses added [");
        this.f51881n = new ArrayList();
        synchronized (list) {
            for (WeakReference<WebView> weakReference : list) {
                if (weakReference != null && weakReference.get() != null) {
                    String strA = BrandSafetyUtils.a(weakReference.get());
                    this.f51881n.add(strA);
                    sb2.append(strA + Z7.f30794r);
                }
            }
            sb2.append(C3978d4.j.f31385e);
            Logger.d(f51868a, sb2.toString());
        }
    }

    public void b(boolean z10) {
        this.E = z10;
    }

    public String c() {
        return this.f51889v;
    }

    public void c(boolean z10) {
        this.F = z10;
    }

    public boolean c(String str) {
        l lVarH = h();
        if (this.f51891x != null || lVarH == null || (lVarH.c() != null && (!TextUtils.isEmpty(lVarH.c().M()) || lVarH.c().ah()))) {
            return false;
        }
        this.f51891x = str;
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
    
        r0 = r0.f52674b;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized com.safedk.android.analytics.brandsafety.j d(java.lang.String r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.List<com.safedk.android.analytics.brandsafety.l> r0 = r3.V     // Catch: java.lang.Throwable -> L25
            java.util.Iterator r1 = r0.iterator()     // Catch: java.lang.Throwable -> L25
        L7:
            boolean r0 = r1.hasNext()     // Catch: java.lang.Throwable -> L25
            if (r0 == 0) goto L23
            java.lang.Object r0 = r1.next()     // Catch: java.lang.Throwable -> L25
            com.safedk.android.analytics.brandsafety.l r0 = (com.safedk.android.analytics.brandsafety.l) r0     // Catch: java.lang.Throwable -> L25
            java.lang.String r2 = r0.f52673a     // Catch: java.lang.Throwable -> L25
            if (r2 == 0) goto L7
            java.lang.String r2 = r0.f52673a     // Catch: java.lang.Throwable -> L25
            boolean r2 = r2.equals(r4)     // Catch: java.lang.Throwable -> L25
            if (r2 == 0) goto L7
            com.safedk.android.analytics.brandsafety.j r0 = r0.f52674b     // Catch: java.lang.Throwable -> L25
        L21:
            monitor-exit(r3)
            return r0
        L23:
            r0 = 0
            goto L21
        L25:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.safedk.android.analytics.brandsafety.c.d(java.lang.String):com.safedk.android.analytics.brandsafety.j");
    }

    public void d(boolean z10) {
        this.G = z10;
    }

    public boolean d() {
        return this.f51890w;
    }

    public String e() {
        return this.f51891x;
    }

    public void e(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (this.Q == null) {
            this.Q = str;
        } else {
            if (this.Q.contains(str)) {
                return;
            }
            this.Q += ImpressionLog.P + str;
        }
    }

    public synchronized void e(boolean z10) {
        this.V.clear();
        this.f51880m = null;
        this.f51882o = 0L;
        this.f51884q = null;
        this.f51885r = System.currentTimeMillis();
        this.f51886s = null;
        this.f51887t = null;
        this.f51888u = BrandSafetyUtils.ScreenShotOrientation.NOT_INITIALIZED;
        this.f51889v = null;
        this.f51890w = false;
        this.f51891x = null;
        this.f51892y = 0;
        this.B = null;
        this.C = null;
        this.D = null;
        this.E = false;
        this.F = false;
        this.G = false;
        this.H = false;
        this.I = false;
        this.J = AdNetworkDiscovery.WebViewResourceMatchingMethod.DEFAULT;
        this.N = false;
        this.O = false;
        if (z10) {
            this.P = null;
        }
        this.Q = null;
    }

    public boolean f() {
        return this.D != null;
    }

    public List<l> g() {
        return this.V;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003b A[Catch: all -> 0x0076, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:7:0x0009, B:8:0x000f, B:10:0x0015, B:12:0x0021, B:16:0x0033, B:18:0x003b, B:19:0x004c), top: B:24:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004c A[Catch: all -> 0x0076, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:7:0x0009, B:8:0x000f, B:10:0x0015, B:12:0x0021, B:16:0x0033, B:18:0x003b, B:19:0x004c), top: B:24:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized com.safedk.android.analytics.brandsafety.l h() {
        /*
            r4 = this;
            monitor-enter(r4)
            java.util.List<java.lang.String> r0 = r4.f51880m     // Catch: java.lang.Throwable -> L76
            if (r0 == 0) goto L33
            java.lang.String r0 = r4.D     // Catch: java.lang.Throwable -> L76
            if (r0 != 0) goto L33
            java.util.List<com.safedk.android.analytics.brandsafety.l> r0 = r4.V     // Catch: java.lang.Throwable -> L76
            java.util.Iterator r1 = r0.iterator()     // Catch: java.lang.Throwable -> L76
        Lf:
            boolean r0 = r1.hasNext()     // Catch: java.lang.Throwable -> L76
            if (r0 == 0) goto L33
            java.lang.Object r0 = r1.next()     // Catch: java.lang.Throwable -> L76
            com.safedk.android.analytics.brandsafety.l r0 = (com.safedk.android.analytics.brandsafety.l) r0     // Catch: java.lang.Throwable -> L76
            com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo r2 = r0.c()     // Catch: java.lang.Throwable -> L76
            if (r2 == 0) goto Lf
            java.util.List<java.lang.String> r2 = r4.f51880m     // Catch: java.lang.Throwable -> L76
            com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo r3 = r0.c()     // Catch: java.lang.Throwable -> L76
            java.lang.String r3 = r3.af()     // Catch: java.lang.Throwable -> L76
            boolean r2 = r2.contains(r3)     // Catch: java.lang.Throwable -> L76
            if (r2 == 0) goto Lf
        L31:
            monitor-exit(r4)
            return r0
        L33:
            java.util.List<com.safedk.android.analytics.brandsafety.l> r0 = r4.V     // Catch: java.lang.Throwable -> L76
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L76
            if (r0 != 0) goto L4c
            java.util.List<com.safedk.android.analytics.brandsafety.l> r0 = r4.V     // Catch: java.lang.Throwable -> L76
            java.util.List<com.safedk.android.analytics.brandsafety.l> r1 = r4.V     // Catch: java.lang.Throwable -> L76
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L76
            int r1 = r1 + (-1)
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L76
            com.safedk.android.analytics.brandsafety.l r0 = (com.safedk.android.analytics.brandsafety.l) r0     // Catch: java.lang.Throwable -> L76
            goto L31
        L4c:
            java.lang.String r0 = "AdInfo"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L76
            r1.<init>()     // Catch: java.lang.Throwable -> L76
            java.lang.String r2 = "Failed to get active impression, view hierarchy: "
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L76
            java.util.List<java.lang.String> r2 = r4.f51880m     // Catch: java.lang.Throwable -> L76
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L76
            java.lang.String r2 = ", impression IDs: "
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L76
            java.util.List r2 = r4.E()     // Catch: java.lang.Throwable -> L76
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L76
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L76
            com.safedk.android.utils.Logger.d(r0, r1)     // Catch: java.lang.Throwable -> L76
            r0 = 0
            goto L31
        L76:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.safedk.android.analytics.brandsafety.c.h():com.safedk.android.analytics.brandsafety.l");
    }

    public CreativeInfo i() {
        l lVarH = h();
        if (lVarH != null) {
            return lVarH.c();
        }
        return null;
    }

    public synchronized List<CreativeInfo> j() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (l lVar : this.V) {
            if (lVar.c() != null) {
                arrayList.add(lVar.c());
            }
        }
        return arrayList;
    }

    public synchronized List<CreativeInfo> k() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (l lVar : this.V) {
            if (lVar.c() != null && this.f51880m != null && this.f51880m.contains(lVar.c().af())) {
                arrayList.add(lVar.c());
            }
        }
        return arrayList;
    }

    public j l() {
        l lVarH = h();
        if (lVarH != null) {
            return lVarH.f52674b;
        }
        return null;
    }

    public synchronized List<j> m() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (l lVar : this.V) {
            if (lVar.f52674b != null) {
                arrayList.add(lVar.f52674b);
            }
        }
        return arrayList;
    }

    public String n() {
        l lVarH = h();
        return lVarH != null ? lVarH.f52673a : "";
    }

    public String o() {
        return this.B;
    }

    public String p() {
        return this.C;
    }

    public int q() {
        return this.f51893z;
    }

    public Bundle r() {
        return this.A;
    }

    public int s() {
        return this.f51892y;
    }

    public String t() {
        return this.f51884q;
    }

    public String toString() {
        return " maxAdSdk: " + (this.f51889v != null ? this.f51889v : "") + " impression IDs: " + E() + " clickUrl: " + (this.f51891x != null ? this.f51891x : "") + " viewAddress: " + (this.K != null ? this.K : "");
    }

    public void u() {
        l lVarH = h();
        if (lVarH == null || lVarH.c() == null) {
            Logger.d(f51868a, "Cannot extract text as Creative info object is null");
            return;
        }
        List<String> listW = lVarH.c().W();
        if (listW == null || listW.isEmpty()) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        Iterator<String> it = listW.iterator();
        while (it.hasNext()) {
            sb2.append(it.next()).append("\n");
        }
        this.f51884q = sb2.toString();
    }

    public long v() {
        return this.f51882o;
    }

    public String w() {
        return this.L;
    }

    public List<String> x() {
        return this.f51880m;
    }

    public String y() {
        if (this.A == null || !this.A.containsKey(BrandSafetyEvent.f52756k) || TextUtils.isEmpty(this.A.getString(BrandSafetyEvent.f52756k))) {
            return null;
        }
        return this.A.getString(BrandSafetyEvent.f52756k);
    }

    public String z() {
        if (this.A == null || !this.A.containsKey("creative_id") || TextUtils.isEmpty(this.A.getString("creative_id"))) {
            return null;
        }
        return this.A.getString("creative_id");
    }
}
