package com.mbridge.msdk.foundation.tools;

import android.content.Context;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.ironsource.C3978d4;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.same.DomainNameUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: BaseDomainDeviceInfo.java */
/* JADX INFO: loaded from: classes3.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f38066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f38067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f38068c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f38069d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f38070e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f38071f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f38072g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f38073h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f38075j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f38076k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f38078m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f38079n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f38080o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f38081p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f38083r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f38084s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f38085t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f38087v;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f38082q = "android";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f38074i = m0.t();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f38086u = m0.q();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f38077l = g.d();

    public e(Context context) {
        int iS = m0.s(context);
        this.f38079n = String.valueOf(iS);
        this.f38080o = m0.a(context, iS);
        this.f38075j = m0.l(context);
        this.f38070e = com.mbridge.msdk.foundation.controller.c.n().c();
        this.f38069d = com.mbridge.msdk.foundation.controller.c.n().b();
        this.f38085t = String.valueOf(v0.g(context));
        this.f38084s = String.valueOf(v0.f(context));
        this.f38083r = String.valueOf(v0.d(context));
        this.f38087v = com.mbridge.msdk.foundation.controller.c.n().k().toString();
        this.f38072g = m0.s();
        this.f38078m = v0.a();
        if (context.getResources().getConfiguration().orientation == 2) {
            this.f38081p = C3978d4.i.C;
        } else {
            this.f38081p = C3978d4.i.D;
        }
        this.f38071f = com.mbridge.msdk.foundation.same.a.V;
        this.f38073h = com.mbridge.msdk.foundation.same.a.f37698g;
        this.f38076k = m0.u();
        this.f38068c = g.e();
        this.f38066a = g.a();
        this.f38067b = com.mbridge.msdk.foundation.controller.authoritycontroller.b.j() ? 1 : 0;
    }

    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                jSONObject.put(C3978d4.i.G, this.f38074i);
                jSONObject.put("system_version", this.f38086u);
                jSONObject.put("network_type", this.f38079n);
                jSONObject.put("network_type_str", this.f38080o);
                jSONObject.put("device_ua", this.f38075j);
                jSONObject.put("has_wx", m0.D(com.mbridge.msdk.foundation.controller.c.n().d()));
                jSONObject.put("integrated_wx", m0.E());
                jSONObject.put("opensdk_ver", m0.B() + "");
                jSONObject.put("wx_api_ver", m0.e(com.mbridge.msdk.foundation.controller.c.n().j()) + "");
                jSONObject.put("brand", this.f38072g);
                jSONObject.put("mnc", m0.r(com.mbridge.msdk.foundation.controller.c.n().d()));
                jSONObject.put("mcc", m0.q(com.mbridge.msdk.foundation.controller.c.n().d()));
                jSONObject.put("adid_limit", this.f38066a);
                jSONObject.put("adid_limit_dev", this.f38067b);
            }
            jSONObject.put("plantform", this.f38082q);
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
                jSONObject.put("google_ad_id", this.f38077l);
                jSONObject.put("az_aid_info", this.f38068c);
            }
            jSONObject.put("appkey", this.f38070e);
            jSONObject.put("appId", this.f38069d);
            jSONObject.put(CommonUrlParts.SCREEN_WIDTH, this.f38085t);
            jSONObject.put(CommonUrlParts.SCREEN_HEIGHT, this.f38084s);
            jSONObject.put("orientation", this.f38081p);
            jSONObject.put("scale", this.f38083r);
            jSONObject.put("b", this.f38071f);
            jSONObject.put("c", this.f38073h);
            jSONObject.put("web_env", this.f38087v);
            jSONObject.put(InneractiveMediationDefs.GENDER_FEMALE, this.f38076k);
            jSONObject.put("misk_spt", this.f38078m);
            if (m0.y() != 0) {
                jSONObject.put("tun", m0.y());
            }
            jSONObject.put(com.mbridge.msdk.foundation.same.net.wrapper.e.f37862f, com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c() + "");
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("adid_limit", this.f38066a);
                jSONObject2.put("adid_limit_dev", this.f38067b);
                jSONObject.put("dvi", k0.b(jSONObject2.toString()));
            }
            if (!com.mbridge.msdk.foundation.controller.authoritycontroller.b.i()) {
                jSONObject.put("dev_source", "2");
            }
            if (DomainNameUtils.getInstance().isExcludeCNDomain()) {
                jSONObject.put("re_domain", "1");
            }
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        return jSONObject;
    }
}
