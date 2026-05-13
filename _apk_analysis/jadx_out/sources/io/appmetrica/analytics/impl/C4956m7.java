package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.services.FrameworkDetector;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.m7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C4956m7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f67266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f67267b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f67268c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f67269d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f67270e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f67271f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f67272g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f67273h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f67274i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f67275j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f67276k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f67277l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f67278m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f67279n;

    public C4956m7() {
        this.f67266a = null;
        this.f67267b = null;
        this.f67268c = null;
        this.f67269d = null;
        this.f67270e = null;
        this.f67271f = null;
        this.f67272g = null;
        this.f67273h = null;
        this.f67274i = null;
        this.f67275j = null;
        this.f67276k = null;
        this.f67277l = null;
        this.f67278m = null;
        this.f67279n = null;
    }

    public C4956m7(C4806gb c4806gb) {
        this.f67266a = c4806gb.b("dId");
        this.f67267b = c4806gb.b("uId");
        this.f67268c = c4806gb.b("analyticsSdkVersionName");
        this.f67269d = c4806gb.b("kitBuildNumber");
        this.f67270e = c4806gb.b("kitBuildType");
        this.f67271f = c4806gb.b("appVer");
        this.f67272g = c4806gb.optString("app_debuggable", "0");
        this.f67273h = c4806gb.b("appBuild");
        this.f67274i = c4806gb.b("osVer");
        this.f67276k = c4806gb.b(com.ironsource.Q6.f30256q);
        this.f67277l = c4806gb.b("root");
        this.f67278m = c4806gb.optString(CommonUrlParts.APP_FRAMEWORK, FrameworkDetector.framework());
        int iOptInt = c4806gb.optInt("osApiLev", -1);
        this.f67275j = iOptInt == -1 ? null : String.valueOf(iOptInt);
        int iOptInt2 = c4806gb.optInt("attribution_id", 0);
        this.f67279n = iOptInt2 > 0 ? String.valueOf(iOptInt2) : null;
    }

    public final String toString() {
        return "DbNetworkTaskConfig{deviceId='" + this.f67266a + "', uuid='" + this.f67267b + "', analyticsSdkVersionName='" + this.f67268c + "', kitBuildNumber='" + this.f67269d + "', kitBuildType='" + this.f67270e + "', appVersion='" + this.f67271f + "', appDebuggable='" + this.f67272g + "', appBuildNumber='" + this.f67273h + "', osVersion='" + this.f67274i + "', osApiLevel='" + this.f67275j + "', locale='" + this.f67276k + "', deviceRootStatus='" + this.f67277l + "', appFramework='" + this.f67278m + "', attributionId='" + this.f67279n + "'}";
    }
}
