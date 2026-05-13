package com.mbridge.msdk.splash.common;

import android.content.Context;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.ironsource.C3978d4;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.same.DomainNameUtils;
import com.mbridge.msdk.foundation.tools.g;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: BaseDeviceInfo.java */
/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f39755e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f39756f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f39757g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f39758h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f39759i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f39760j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f39761k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f39762l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f39763m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f39764n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f39765o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f39766p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f39767q;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f39753c = "android";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f39751a = m0.t();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f39752b = m0.q();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f39754d = g.d();

    public a(Context context) {
        int iS = m0.s(context);
        this.f39755e = String.valueOf(iS);
        this.f39756f = m0.a(context, iS);
        this.f39757g = m0.l(context);
        this.f39758h = com.mbridge.msdk.foundation.controller.c.n().c();
        this.f39759i = com.mbridge.msdk.foundation.controller.c.n().b();
        this.f39760j = String.valueOf(v0.g(context));
        this.f39761k = String.valueOf(v0.f(context));
        this.f39763m = String.valueOf(v0.d(context));
        if (context.getResources().getConfiguration().orientation == 2) {
            this.f39762l = C3978d4.i.C;
        } else {
            this.f39762l = C3978d4.i.D;
        }
        this.f39764n = m0.u();
        this.f39765o = g.e();
        this.f39766p = g.a();
        this.f39767q = com.mbridge.msdk.foundation.controller.authoritycontroller.b.j() ? 1 : 0;
    }

    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                jSONObject.put(C3978d4.i.G, this.f39751a);
                jSONObject.put("system_version", this.f39752b);
                jSONObject.put("network_type", this.f39755e);
                jSONObject.put("network_type_str", this.f39756f);
                jSONObject.put("device_ua", this.f39757g);
                jSONObject.put("has_wx", m0.D(com.mbridge.msdk.foundation.controller.c.n().d()));
                jSONObject.put("integrated_wx", m0.E());
                jSONObject.put("mnc", m0.r(com.mbridge.msdk.foundation.controller.c.n().d()));
                jSONObject.put("mcc", m0.q(com.mbridge.msdk.foundation.controller.c.n().d()));
                jSONObject.put("adid_limit", this.f39766p);
                jSONObject.put("adid_limit_dev", this.f39767q);
            }
            jSONObject.put("plantform", this.f39753c);
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
                jSONObject.put("google_ad_id", this.f39754d);
                jSONObject.put("az_aid_info", this.f39765o);
            }
            jSONObject.put("appkey", this.f39758h);
            jSONObject.put("appId", this.f39759i);
            jSONObject.put(CommonUrlParts.SCREEN_WIDTH, this.f39760j);
            jSONObject.put(CommonUrlParts.SCREEN_HEIGHT, this.f39761k);
            jSONObject.put("orientation", this.f39762l);
            jSONObject.put("scale", this.f39763m);
            if (m0.y() != 0) {
                jSONObject.put("tun", m0.y());
            }
            jSONObject.put(InneractiveMediationDefs.GENDER_FEMALE, this.f39764n);
            if (DomainNameUtils.getInstance().isExcludeCNDomain()) {
                jSONObject.put("re_domain", "1");
            }
        } catch (JSONException e10) {
            q0.b("BaseDeviceInfo", e10.getMessage());
        }
        return jSONObject;
    }
}
