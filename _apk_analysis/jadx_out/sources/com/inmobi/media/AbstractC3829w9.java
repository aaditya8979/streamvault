package com.inmobi.media;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.location.Location;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.reflect.KProperty;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.w9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractC3829w9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28424a;

    public AbstractC3829w9(String str) {
        tn.p.k(str, "url");
        tn.p.k(str, "url");
        this.f28424a = str;
    }

    public static JSONObject a(String str) throws JSONException {
        if (tn.p.f(str, "banner")) {
            return W8.f26526c.a();
        }
        if (!tn.p.f("audio", str)) {
            return new JSONObject();
        }
        T8 t82 = T8.f26349c;
        JSONObject jSONObject = new JSONObject();
        long j10 = t82.f27127a / 1000;
        if (j10 != 0) {
            jSONObject.put("a-lastAudioPlayedTs", String.valueOf(j10));
        }
        int i10 = t82.f27128b;
        if (i10 > 0) {
            jSONObject.put("a-audioFreq", String.valueOf(i10));
        }
        Context context = Ji.f25747a;
        if (context != null) {
            ConcurrentHashMap concurrentHashMap = Ea.f25372b;
            Ea eaA = Da.a(context, "audio_pref_file");
            tn.p.k("user_mute_count", "key");
            int i11 = eaA.f25373a.getInt("user_mute_count", -1);
            if (i11 > 0) {
                jSONObject.put("a-umc", String.valueOf(i11));
            }
        }
        return jSONObject;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(java.util.LinkedHashMap r2) {
        /*
            java.lang.String r0 = "<this>"
            tn.p.k(r2, r0)
            android.content.Context r0 = com.inmobi.media.Ji.f25747a
            java.lang.String r0 = com.inmobi.media.AbstractC3427g5.a(r0)
            if (r0 == 0) goto L26
            com.inmobi.media.i4 r0 = com.inmobi.media.Y3.f26611a
            java.lang.Class<com.inmobi.media.core.config.models.AdConfig> r0 = com.inmobi.media.core.config.models.AdConfig.class
            java.lang.String r1 = "clazz"
            tn.p.k(r0, r1)
            com.inmobi.media.i4 r1 = com.inmobi.media.Y3.f26611a
            com.inmobi.media.core.config.models.Config r0 = r1.a(r0)
            com.inmobi.media.core.config.models.AdConfig r0 = (com.inmobi.media.core.config.models.AdConfig) r0
            boolean r0 = r0.isCCTEnabled()
            if (r0 == 0) goto L26
            r0 = 1
            goto L27
        L26:
            r0 = 0
        L27:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "cct-enabled"
            r2.put(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.AbstractC3829w9.a(java.util.LinkedHashMap):void");
    }

    public static void b(LinkedHashMap linkedHashMap) {
        Pair pair;
        tn.p.k(linkedHashMap, "<this>");
        C3850x5.f28483a.getClass();
        Pair pairH = C3850x5.h();
        tn.p.k(linkedHashMap, "<this>");
        if (pairH != null) {
            linkedHashMap.put(pairH.getFirst(), pairH.getSecond());
        }
        Pair pairJ = C3850x5.j();
        tn.p.k(linkedHashMap, "<this>");
        if (pairJ != null) {
            linkedHashMap.put(pairJ.getFirst(), pairJ.getSecond());
        }
        Pair pair2 = C3850x5.f28491i;
        tn.p.k(linkedHashMap, "<this>");
        if (pair2 != null) {
            linkedHashMap.put(pair2.getFirst(), pair2.getSecond());
        }
        Context context = Ji.f25747a;
        Pair pair3 = null;
        if (context == null) {
            pair = null;
        } else {
            Intent intentA = F3.a(context, (BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            pair = new Pair("d-bat-chrg", (intentA != null ? intentA.getIntExtra("status", -1) : -1) == 2 ? "1" : "0");
        }
        tn.p.k(linkedHashMap, "<this>");
        if (pair != null) {
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        Pair pairO = C3850x5.o();
        tn.p.k(linkedHashMap, "<this>");
        if (pairO != null) {
            linkedHashMap.put(pairO.getFirst(), pairO.getSecond());
        }
        Pair pairE = C3850x5.e();
        tn.p.k(linkedHashMap, "<this>");
        if (pairE != null) {
            linkedHashMap.put(pairE.getFirst(), pairE.getSecond());
        }
        Context context2 = Ji.f25747a;
        if (context2 != null) {
            Intent intentA2 = F3.a(context2, (BroadcastReceiver) null, new IntentFilter("android.intent.action.HEADSET_PLUG"));
            pair3 = (intentA2 == null || intentA2.getIntExtra("state", 0) != 1) ? new Pair("d-w-h", "0") : new Pair("d-w-h", "1");
        }
        tn.p.k(linkedHashMap, "<this>");
        if (pair3 != null) {
            linkedHashMap.put(pair3.getFirst(), pair3.getSecond());
        }
        Pair pairF = C3850x5.f();
        tn.p.k(linkedHashMap, "<this>");
        if (pairF != null) {
            linkedHashMap.put(pairF.getFirst(), pairF.getSecond());
        }
        Pair pairG = C3850x5.g();
        tn.p.k(linkedHashMap, "<this>");
        if (pairG != null) {
            linkedHashMap.put(pairG.getFirst(), pairG.getSecond());
        }
        Pair pairD = C3850x5.d();
        tn.p.k(linkedHashMap, "<this>");
        if (pairD != null) {
            linkedHashMap.put(pairD.getFirst(), pairD.getSecond());
        }
        Pair pairI = C3850x5.i();
        tn.p.k(linkedHashMap, "<this>");
        if (pairI != null) {
            linkedHashMap.put(pairI.getFirst(), pairI.getSecond());
        }
    }

    public static void c(LinkedHashMap linkedHashMap) {
        SharedPreferences sharedPreferencesA;
        tn.p.k(linkedHashMap, "<this>");
        String strValueOf = "";
        if (Ji.f25747a != null && (sharedPreferencesA = Ri.a()) != null && sharedPreferencesA.contains(io.bidmachine.z3.IAB_GPP_HDR_STRING)) {
            strValueOf = String.valueOf(sharedPreferencesA.getString(io.bidmachine.z3.IAB_GPP_HDR_STRING, ""));
        }
        if (F3.a(strValueOf)) {
            linkedHashMap.put("gpp", strValueOf);
        }
    }

    public static void d(LinkedHashMap linkedHashMap) {
        tn.p.k(linkedHashMap, "<this>");
        C3582mb c3582mb = C3582mb.f27616a;
        HashMap map = new HashMap();
        C3688qh c3688qh = Yi.f26652a;
        Location locationA = (Ji.b() == null || Yi.a().isLocationEnabled()) ? C3582mb.a() : null;
        HashMap mapA = locationA != null ? C3582mb.a(locationA, true, Kf.a(Ji.f25747a, "android.permission.ACCESS_FINE_LOCATION") ? C3582mb.a(1, 3) : null) : C3582mb.a(Tg.b(), false, null);
        for (Map.Entry entry : mapA.entrySet()) {
            map.put((String) entry.getKey(), entry.getValue().toString());
        }
        linkedHashMap.putAll(map);
        C3582mb c3582mb2 = C3582mb.f27616a;
        HashMap map2 = new HashMap();
        String str = "DENIED";
        if (C3582mb.d() && C3582mb.e()) {
            str = "AUTHORISED";
        }
        Locale locale = Locale.ENGLISH;
        tn.p.j(locale, "ENGLISH");
        String lowerCase = str.toLowerCase(locale);
        tn.p.j(lowerCase, "toLowerCase(...)");
        map2.put("loc-consent-status", lowerCase);
        linkedHashMap.putAll(map2);
    }

    public static void e(LinkedHashMap linkedHashMap) {
        JSONObject jSONObject;
        tn.p.k(linkedHashMap, "<this>");
        Qi qi2 = Qi.f26188a;
        qi2.getClass();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        if (Qi.a(0)) {
            linkedHashMap2.put("st", Long.valueOf(Qi.f26193f));
        }
        if (Qi.a(5)) {
            I1 i12 = Qi.f26197j;
            KProperty[] kPropertyArr = Qi.f26189b;
            if (((Number) i12.getValue(qi2, kPropertyArr[0])).intValue() != -1) {
                linkedHashMap2.put(ImpressionLog.M, Integer.valueOf(((Number) i12.getValue(qi2, kPropertyArr[0])).intValue()));
            }
        }
        if (Qi.a(6)) {
            I1 i13 = Qi.f26198k;
            KProperty[] kPropertyArr2 = Qi.f26189b;
            if (((Number) i13.getValue(qi2, kPropertyArr2[1])).intValue() != -1) {
                linkedHashMap2.put("u-ret", Integer.valueOf(((Number) i13.getValue(qi2, kPropertyArr2[1])).intValue()));
            }
        }
        List listJ1 = cn.f0.j1(Qi.f26194g);
        if (!Qi.a(1)) {
            listJ1.set(0, -1);
        }
        if (!Qi.a(2)) {
            listJ1.set(1, -1);
        }
        if (!Qi.a(3)) {
            listJ1.set(2, -1);
        }
        if (!Qi.a(4)) {
            listJ1.set(3, -1);
        }
        if (!(listJ1 instanceof Collection) || !listJ1.isEmpty()) {
            Iterator it = listJ1.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((Number) it.next()).intValue() != -1) {
                        linkedHashMap2.put("dep", listJ1);
                        break;
                    }
                }
            }
        }
        try {
            jSONObject = new JSONObject(linkedHashMap2);
        } catch (Exception unused) {
            jSONObject = new JSONObject();
        }
        if (jSONObject.length() > 0) {
            String string = jSONObject.toString();
            tn.p.j(string, "toString(...)");
            linkedHashMap.put("sData", string);
        }
    }
}
