package com.fyber.inneractive.sdk.bidder;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.external.InneractiveUserConfig;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.z0;
import com.unity3d.services.core.properties.MadeWithUnityDetector;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes11.dex */
public final class d {
    public String A;
    public Boolean B;
    public String C;
    public int D;
    public InneractiveUserConfig.Gender E;
    public boolean F;
    public String G;
    public String H;
    public String I;
    public String J;
    public final boolean K;
    public Boolean L;
    public ArrayList M = new ArrayList();
    public ArrayList N = new ArrayList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.serverapi.c f15841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f15842b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f15843c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f15844d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f15845e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f15846f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f15847g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f15848h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f15849i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f15850j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f15851k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Long f15852l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f15853m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f15854n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final q f15855o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f15856p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f15857q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final d0 f15858r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Boolean f15859s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Boolean f15860t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Boolean f15861u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f15862v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Boolean f15863w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Boolean f15864x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Boolean f15865y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f15866z;

    public d(com.fyber.inneractive.sdk.serverapi.c cVar) {
        String str;
        this.f15841a = cVar;
        if (TextUtils.isEmpty(this.f15842b)) {
            com.fyber.inneractive.sdk.util.r.f19555a.execute(new c(this));
        }
        StringBuilder sb2 = new StringBuilder("2.2.0-Android-8.4.1");
        if (!TextUtils.isEmpty(InneractiveAdManager.getDevPlatform())) {
            sb2.append('-');
            sb2.append(InneractiveAdManager.getDevPlatform());
        }
        this.f15843c = sb2.toString();
        this.f15844d = com.fyber.inneractive.sdk.util.o.f19548a.getPackageName();
        this.f15845e = com.fyber.inneractive.sdk.util.k.j();
        this.f15846f = com.fyber.inneractive.sdk.util.k.l();
        this.f15853m = com.fyber.inneractive.sdk.util.o.c(com.fyber.inneractive.sdk.util.o.e());
        this.f15854n = com.fyber.inneractive.sdk.util.o.c(com.fyber.inneractive.sdk.util.o.d());
        com.fyber.inneractive.sdk.serverapi.a aVar = com.fyber.inneractive.sdk.serverapi.b.f19433a;
        try {
            Class.forName(MadeWithUnityDetector.UNITY_PLAYER_CLASS_NAME);
            str = "unity3d";
        } catch (Throwable unused) {
            str = "native";
        }
        this.f15855o = !str.equals("native") ? !str.equals("unity3d") ? q.UNRECOGNIZED : q.UNITY3D : q.NATIVE;
        this.f15858r = ((com.fyber.inneractive.sdk.util.s.a() ^ true) || IAConfigManager.O.f15971q) ? d0.SECURE : d0.UNSECURE;
        IAConfigManager iAConfigManager = IAConfigManager.O;
        if (TextUtils.isEmpty(iAConfigManager.f15968n)) {
            this.H = iAConfigManager.f15966l;
        } else {
            this.H = iAConfigManager.f15966l + "_" + iAConfigManager.f15968n;
        }
        this.K = InneractiveAdManager.isCurrentUserAChild();
        a();
        this.f15860t = com.fyber.inneractive.sdk.serverapi.b.g();
        this.B = com.fyber.inneractive.sdk.serverapi.b.i();
        this.f15863w = com.fyber.inneractive.sdk.serverapi.b.f();
        this.f15864x = com.fyber.inneractive.sdk.serverapi.b.l();
        this.f15865y = com.fyber.inneractive.sdk.serverapi.b.k();
    }

    public final void a() {
        this.f15841a.getClass();
        IAConfigManager iAConfigManager = IAConfigManager.O;
        this.f15847g = iAConfigManager.f15969o;
        if (!InneractiveAdManager.isCurrentUserAChild()) {
            this.f15841a.getClass();
            this.f15848h = com.fyber.inneractive.sdk.util.k.i();
            this.f15849i = this.f15841a.a();
            String str = this.f15841a.f19438b;
            this.f15850j = str == null ? "" : str.substring(0, Math.min(3, str.length()));
            String str2 = this.f15841a.f19438b;
            this.f15851k = str2 != null ? str2.substring(Math.min(3, str2.length())) : "";
            this.f15841a.getClass();
            z0 z0VarA = z0.a();
            IAlog.a("ExchangeRequestParamsProvider: getNetwork : type: %s value: %s", z0VarA, z0VarA.b());
            this.f15857q = z0VarA.b();
            int i10 = com.fyber.inneractive.sdk.config.k.f16070a;
            String property = System.getProperty("ia.testEnvironmentConfiguration.device");
            if (TextUtils.isEmpty(property)) {
                com.fyber.inneractive.sdk.config.v vVar = com.fyber.inneractive.sdk.config.u.f16160a.f16168b;
                property = vVar != null ? vVar.f16164a : null;
            }
            this.A = property;
            this.G = iAConfigManager.f15964j.getZipCode();
        }
        this.E = iAConfigManager.f15964j.getGender();
        this.D = iAConfigManager.f15964j.getAge();
        this.f15852l = com.fyber.inneractive.sdk.serverapi.b.e();
        this.f15841a.getClass();
        ArrayList arrayList = iAConfigManager.f15970p;
        if (arrayList != null && !arrayList.isEmpty()) {
            this.f15856p = com.fyber.inneractive.sdk.util.o.a(arrayList);
        }
        this.C = com.fyber.inneractive.sdk.serverapi.b.b();
        this.f15862v = com.fyber.inneractive.sdk.serverapi.b.h().booleanValue();
        this.f15866z = com.fyber.inneractive.sdk.serverapi.b.c().intValue();
        this.F = iAConfigManager.f15965k;
        this.f15859s = com.fyber.inneractive.sdk.serverapi.b.m();
        if (TextUtils.isEmpty(iAConfigManager.f15968n)) {
            this.H = iAConfigManager.f15966l;
        } else {
            this.H = iAConfigManager.f15966l + "_" + iAConfigManager.f15968n;
        }
        this.f15861u = com.fyber.inneractive.sdk.serverapi.b.n();
        iAConfigManager.E.n();
        com.fyber.inneractive.sdk.ignite.l lVar = iAConfigManager.E.f16744p;
        this.I = lVar != null ? lVar.f59542a.i() : null;
        com.fyber.inneractive.sdk.ignite.l lVar2 = iAConfigManager.E.f16744p;
        this.J = lVar2 != null ? lVar2.f59542a.d() : null;
        this.f15841a.getClass();
        this.f15853m = com.fyber.inneractive.sdk.util.o.c(com.fyber.inneractive.sdk.util.o.e());
        this.f15841a.getClass();
        this.f15854n = com.fyber.inneractive.sdk.util.o.c(com.fyber.inneractive.sdk.util.o.d());
        this.L = com.fyber.inneractive.sdk.serverapi.b.j();
        com.fyber.inneractive.sdk.topics.b bVar = iAConfigManager.F;
        if (bVar != null && IAConfigManager.f()) {
            this.N = bVar.f19445f;
            this.M = bVar.f19444e;
        }
    }
}
