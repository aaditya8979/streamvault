package com.mbridge.msdk.advanced.common;

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
    public String f35342e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f35343f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f35344g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f35345h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f35346i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f35347j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f35348k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f35349l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f35350m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f35351n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f35352o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f35353p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f35354q;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f35340c = "android";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f35338a = m0.t();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f35339b = m0.q();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f35341d = g.d();

    public a(Context context) {
        int iS = m0.s(context);
        this.f35342e = String.valueOf(iS);
        this.f35343f = m0.a(context, iS);
        this.f35344g = m0.l(context);
        this.f35345h = com.mbridge.msdk.foundation.controller.c.n().c();
        this.f35346i = com.mbridge.msdk.foundation.controller.c.n().b();
        this.f35347j = String.valueOf(v0.g(context));
        this.f35348k = String.valueOf(v0.f(context));
        this.f35350m = String.valueOf(v0.d(context));
        if (context.getResources().getConfiguration().orientation == 2) {
            this.f35349l = C3978d4.i.C;
        } else {
            this.f35349l = C3978d4.i.D;
        }
        this.f35351n = m0.u();
        this.f35352o = g.e();
        this.f35353p = g.a();
        this.f35354q = com.mbridge.msdk.foundation.controller.authoritycontroller.b.j() ? 1 : 0;
    }

    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                jSONObject.put(C3978d4.i.G, this.f35338a);
                jSONObject.put("system_version", this.f35339b);
                jSONObject.put("network_type", this.f35342e);
                jSONObject.put("network_type_str", this.f35343f);
                jSONObject.put("device_ua", this.f35344g);
                jSONObject.put("has_wx", m0.D(com.mbridge.msdk.foundation.controller.c.n().d()));
                jSONObject.put("integrated_wx", m0.E());
                jSONObject.put("opensdk_ver", m0.B() + "");
                jSONObject.put("wx_api_ver", m0.e(com.mbridge.msdk.foundation.controller.c.n().j()) + "");
                jSONObject.put("mnc", m0.r(com.mbridge.msdk.foundation.controller.c.n().d()));
                jSONObject.put("mcc", m0.q(com.mbridge.msdk.foundation.controller.c.n().d()));
                jSONObject.put("adid_limit", this.f35353p);
                jSONObject.put("adid_limit_dev", this.f35354q);
            }
            jSONObject.put("plantform", this.f35340c);
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
                jSONObject.put("google_ad_id", this.f35341d);
                jSONObject.put("az_aid_info", this.f35352o);
            }
            jSONObject.put("appkey", this.f35345h);
            jSONObject.put("appId", this.f35346i);
            jSONObject.put(CommonUrlParts.SCREEN_WIDTH, this.f35347j);
            jSONObject.put(CommonUrlParts.SCREEN_HEIGHT, this.f35348k);
            jSONObject.put("orientation", this.f35349l);
            jSONObject.put("scale", this.f35350m);
            if (m0.y() != 0) {
                jSONObject.put("tun", m0.y());
            }
            jSONObject.put(InneractiveMediationDefs.GENDER_FEMALE, this.f35351n);
            if (DomainNameUtils.getInstance().isExcludeCNDomain()) {
                jSONObject.put("re_domain", "1");
            }
        } catch (JSONException e10) {
            q0.b("BaseDeviceInfo", e10.getMessage());
        }
        return jSONObject;
    }
}
