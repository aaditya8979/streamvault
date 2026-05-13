package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import com.safedk.android.analytics.events.CrashEvent;
import io.appmetrica.analytics.coreutils.internal.parsing.RemoteConfigJsonUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final class Zl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5258ya f66314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final X9 f66315b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Gi f66316c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Ae f66317d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Im f66318e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C4824h3 f66319f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C5026p2 f66320g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C4858ib f66321h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Fm f66322i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C5111sd f66323j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final E9 f66324k;

    public Zl() {
        this(new C4858ib(), new C5258ya(), new X9(), new Gi(), new Ae(), new Im(), new C4824h3(), new C5026p2(), new Fm(), new C5111sd(), new E9());
    }

    public Zl(C4858ib c4858ib, C5258ya c5258ya, X9 x92, Gi gi2, Ae ae2, Im im2, C4824h3 c4824h3, C5026p2 c5026p2, Fm fm2, C5111sd c5111sd, E9 e92) {
        this.f66314a = c5258ya;
        this.f66315b = x92;
        this.f66316c = gi2;
        this.f66317d = ae2;
        this.f66318e = im2;
        this.f66319f = c4824h3;
        this.f66320g = c5026p2;
        this.f66321h = c4858ib;
        this.f66322i = fm2;
        this.f66323j = c5111sd;
        this.f66324k = e92;
    }

    public final void a(C4765em c4765em, C4806gb c4806gb) {
        long jOptLong;
        long jOptLong2;
        String string;
        ArrayList arrayListA;
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        JSONObject jSONObjectOptJSONObject3;
        JSONObject jSONObjectOptJSONObject4 = c4806gb.optJSONObject("queries");
        if (jSONObjectOptJSONObject4 != null && (jSONObjectOptJSONObject2 = jSONObjectOptJSONObject4.optJSONObject("list")) != null && (jSONObjectOptJSONObject3 = jSONObjectOptJSONObject2.optJSONObject("host")) != null) {
            c4765em.f66696g = jSONObjectOptJSONObject3.optString("url", null);
        }
        Object jSONObject = new JSONObject();
        try {
            jSONObject = c4806gb.get("distribution_customization");
        } catch (Throwable unused) {
        }
        JSONObject jSONObjectOptJSONObject5 = ((JSONObject) jSONObject).optJSONObject("clids");
        if (jSONObjectOptJSONObject5 != null) {
            HashMap map = new HashMap();
            Iterator<String> itKeys = jSONObjectOptJSONObject5.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                JSONObject jSONObjectOptJSONObject6 = jSONObjectOptJSONObject5.optJSONObject(next);
                if (jSONObjectOptJSONObject6 != null && jSONObjectOptJSONObject6.has("value")) {
                    map.put(next, jSONObjectOptJSONObject6.getString("value"));
                }
            }
            c4765em.f66699j = Gm.a((Map) map);
        }
        JSONObject jSONObjectOptJSONObject7 = c4806gb.optJSONObject(CommonUrlParts.LOCALE);
        String string2 = "";
        c4765em.f66702m = (jSONObjectOptJSONObject7 == null || (jSONObjectOptJSONObject = jSONObjectOptJSONObject7.optJSONObject("country")) == null || !jSONObjectOptJSONObject.optBoolean("reliable", false)) ? "" : jSONObjectOptJSONObject.optString("value", "");
        JSONObject jSONObjectOptJSONObject8 = c4806gb.optJSONObject("time");
        if (jSONObjectOptJSONObject8 != null) {
            try {
                c4765em.f66701l = Long.valueOf(jSONObjectOptJSONObject8.getLong("max_valid_difference_seconds"));
            } catch (Throwable unused2) {
            }
        }
        C5220wm c5220wm = new C5220wm();
        JSONObject jSONObjectOptJSONObject9 = c4806gb.optJSONObject("stat_sending");
        if (jSONObjectOptJSONObject9 != null) {
            c5220wm.f67913a = RemoteConfigJsonUtils.extractMillisFromSecondsOrDefault(jSONObjectOptJSONObject9, "disabled_reporting_interval_seconds", c5220wm.f67913a);
        }
        this.f66318e.getClass();
        c4765em.f66705p = new Hm(c5220wm.f67913a);
        this.f66315b.getClass();
        C5120sm c5120sm = new C5120sm();
        try {
            Object jSONObject2 = new JSONObject();
            try {
                jSONObject2 = c4806gb.get("features");
            } catch (Throwable unused3) {
            }
            JSONObject jSONObjectOptJSONObject10 = ((JSONObject) jSONObject2).optJSONObject("list");
            if (jSONObjectOptJSONObject10 != null) {
                C4902k4 c4902k4 = new C4902k4();
                c4902k4.f67086a = X9.a(jSONObjectOptJSONObject10, "permissions_collecting", c5120sm.f67703a);
                c4902k4.f67087b = X9.a(jSONObjectOptJSONObject10, "features_collecting", c5120sm.f67704b);
                c4902k4.f67088c = X9.a(jSONObjectOptJSONObject10, "google_aid", c5120sm.f67705c);
                c4902k4.f67089d = X9.a(jSONObjectOptJSONObject10, "sim_info", c5120sm.f67706d);
                c4902k4.f67090e = X9.a(jSONObjectOptJSONObject10, "huawei_oaid", c5120sm.f67707e);
                c4902k4.f67091f = jSONObjectOptJSONObject10.has("ssl_pinning") ? Boolean.valueOf(jSONObjectOptJSONObject10.getJSONObject("ssl_pinning").getBoolean("enabled")) : null;
                c4765em.f66691b = new C4953m4(c4902k4);
            }
        } catch (Throwable unused4) {
        }
        this.f66314a.getClass();
        try {
            Object jSONObject3 = new JSONObject();
            try {
                jSONObject3 = c4806gb.get("query_hosts");
            } catch (Throwable unused5) {
            }
            JSONObject jSONObjectOptJSONObject11 = ((JSONObject) jSONObject3).optJSONObject("list");
            if (jSONObjectOptJSONObject11 != null) {
                try {
                    string = jSONObjectOptJSONObject11.getJSONObject("get_ad").getJSONArray("urls").getString(0);
                } catch (Throwable unused6) {
                    string = "";
                }
                if (!TextUtils.isEmpty(string)) {
                    c4765em.f66693d = string;
                }
                ArrayList arrayListA2 = C5258ya.a(jSONObjectOptJSONObject11, CrashEvent.f52788e);
                if (!mo.a((Collection) arrayListA2)) {
                    c4765em.f66694e = arrayListA2;
                }
                try {
                    string2 = jSONObjectOptJSONObject11.getJSONObject("report_ad").getJSONArray("urls").getString(0);
                } catch (Throwable unused7) {
                }
                if (!TextUtils.isEmpty(string2)) {
                    c4765em.f66695f = string2;
                }
                ArrayList arrayListA3 = C5258ya.a(jSONObjectOptJSONObject11, "startup");
                if (!mo.a((Collection) arrayListA3)) {
                    c4765em.f66692c = arrayListA3;
                }
                ArrayList arrayListA4 = C5258ya.a(jSONObjectOptJSONObject11, "diagnostic");
                if (!mo.a((Collection) arrayListA4)) {
                    c4765em.f66703n = arrayListA4;
                }
                HashMap map2 = new HashMap();
                Iterator<String> itKeys2 = jSONObjectOptJSONObject11.keys();
                while (itKeys2.hasNext()) {
                    String next2 = itKeys2.next();
                    if (!C5258ya.f68034a.contains(next2) && (arrayListA = C5258ya.a(jSONObjectOptJSONObject11, next2)) != null) {
                        map2.put(next2, arrayListA);
                    }
                }
                c4765em.f66704o = map2;
            }
        } catch (Throwable unused8) {
        }
        this.f66316c.getClass();
        C5245xm c5245xm = new C5245xm();
        JSONObject jSONObjectOptJSONObject12 = c4806gb.optJSONObject("retry_policy");
        int iOptInt = c5245xm.f67983w;
        int iOptInt2 = c5245xm.f67984x;
        if (jSONObjectOptJSONObject12 != null) {
            iOptInt = jSONObjectOptJSONObject12.optInt("max_interval_seconds", iOptInt);
            iOptInt2 = jSONObjectOptJSONObject12.optInt("exponential_multiplier", c5245xm.f67984x);
        }
        c4765em.f66706q = new RetryPolicyConfig(iOptInt, iOptInt2);
        this.f66317d.getClass();
        if (c4765em.f66691b.f67256a) {
            JSONObject jSONObjectOptJSONObject13 = c4806gb.optJSONObject("permissions_collecting");
            C5170um c5170um = new C5170um();
            if (jSONObjectOptJSONObject13 != null) {
                jOptLong = jSONObjectOptJSONObject13.optLong("check_interval_seconds", c5170um.f67792a);
                jOptLong2 = jSONObjectOptJSONObject13.optLong("force_send_interval_seconds", c5170um.f67793b);
            } else {
                jOptLong = c5170um.f67792a;
                jOptLong2 = c5170um.f67793b;
            }
            c4765em.f66700k = new C5262ye(jOptLong, jOptLong2);
        }
        C4824h3 c4824h3 = this.f66319f;
        c4824h3.getClass();
        C5046pm c5046pm = new C5046pm();
        JSONObject jSONObjectOptJSONObject14 = c4806gb.optJSONObject("cache_control");
        if (jSONObjectOptJSONObject14 != null) {
            c5046pm.f67541a = RemoteConfigJsonUtils.extractMillisFromSecondsOrDefault(jSONObjectOptJSONObject14, "last_known_location_ttl", c5046pm.f67541a);
        }
        c4824h3.f66890a.getClass();
        c4765em.f66707r = new C4746e3(c5046pm.f67541a);
        this.f66320g.getClass();
        C5026p2.a(c4765em, c4806gb);
        Fm fm2 = this.f66322i;
        fm2.getClass();
        JSONObject jSONObjectOptJSONObject15 = c4806gb.optJSONObject("startup_update");
        C5195vm c5195vm = new C5195vm();
        Integer numA = AbstractC4832hb.a(jSONObjectOptJSONObject15, "interval_seconds", null);
        if (numA != null) {
            c5195vm.f67864a = numA.intValue();
        }
        fm2.f65259a.getClass();
        c4765em.f66709t = new Dm(c5195vm.f67864a);
        Map<String, Zc> mapC = this.f66323j.f67673a.c();
        C5086rd c5086rd = new C5086rd(c4806gb);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, Zc> entry : mapC.entrySet()) {
            Object objInvoke = c5086rd.invoke(entry);
            if (objInvoke != null) {
                linkedHashMap.put(entry.getKey(), objInvoke);
            }
        }
        c4765em.f66710u = linkedHashMap;
        D9 d92 = this.f66324k.f65190a;
        C5095rm c5095rm = new C5095rm();
        JSONObject jSONObjectOptJSONObject16 = c4806gb.optJSONObject("external_attribution");
        if (jSONObjectOptJSONObject16 != null) {
            c5095rm.f67630a = RemoteConfigJsonUtils.extractMillisFromSecondsOrDefault(jSONObjectOptJSONObject16, "collecting_interval_seconds", c5095rm.f67630a);
        }
        d92.getClass();
        c4765em.f66711v = new C9(c5095rm.f67630a);
    }
}
