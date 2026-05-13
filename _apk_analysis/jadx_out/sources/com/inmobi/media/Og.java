package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.Og;
import com.inmobi.media.core.config.models.SignalsConfig;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class Og {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static C3911zg f26089d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f26087b = {tn.t.i(new PropertyReference1Impl(Og.class, "cachedJson", "getCachedJson()Lorg/json/JSONObject;", 0)), tn.t.i(new PropertyReference1Impl(Og.class, "impressionDepth", "getImpressionDepth()Lorg/json/JSONObject;", 0))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Og f26086a = new Og();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List f26088c = cn.w.p("ban", ImpressionLog.f51753w, "rew", "nat");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final I1 f26090e = new I1(new JSONObject(), new sn.a() { // from class: n9.r3
        @Override // sn.a
        public final Object invoke() {
            return Og.a();
        }
    }, true, true);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final I1 f26091f = new I1(new JSONObject(), new sn.a() { // from class: n9.s3
        @Override // sn.a
        public final Object invoke() {
            return Og.f();
        }
    }, true, true);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final mo.a f26092g = mo.g.b(false, 1, null);

    public static final Object a(Og og2, Map map, SignalsConfig.PublisherConfig publisherConfig, Mg mg2) throws JSONException {
        og2.getClass();
        if (!publisherConfig.getAuto().getEnabled()) {
            return bn.r.f5635a;
        }
        int count = publisherConfig.getAuto().getCount();
        Triple tripleA = Pg.a(map, publisherConfig);
        String str = (String) tripleA.component1();
        JSONObject jSONObject = (JSONObject) tripleA.component2();
        String str2 = (String) tripleA.component3();
        if (jSONObject == null) {
            return bn.r.f5635a;
        }
        og2.a(str2, "a_i_dep");
        Object objA = og2.a(Pg.a(og2.b(), str, jSONObject, count), mg2);
        return objA == in.a.g() ? objA : bn.r.f5635a;
    }

    public static final JSONObject a() {
        f26086a.getClass();
        Context context = Ji.f25747a;
        JSONObject jSONObject = null;
        if (context != null) {
            if (f26089d == null) {
                f26089d = new C3911zg(context, "pub_signals_store");
            }
            C3911zg c3911zg = f26089d;
            if (c3911zg == null) {
                tn.p.C("prefDao");
                c3911zg = null;
            }
            String strA = c3911zg.a("saved_signals");
            if (strA != null) {
                jSONObject = new JSONObject(strA);
            }
        }
        return jSONObject == null ? new JSONObject() : jSONObject;
    }

    public static final JSONObject a(Og og2) throws JSONException {
        og2.getClass();
        JSONObject jSONObject = new JSONObject();
        Iterator<String> itKeys = f26086a.b().keys();
        tn.p.j(itKeys, "keys(...)");
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            tn.p.h(next);
            if (bo.a0.W(next, "obj_", false, 2, null) || bo.a0.W(next, "auto_", false, 2, null) || bo.a0.W(next, "dir_", false, 2, null)) {
                jSONObject.put(next, f26086a.b().opt(next));
            }
        }
        return jSONObject;
    }

    public static void a(Map map) {
        tn.p.k(map, "signals");
        try {
            SignalsConfig.PublisherConfig publisherConfigC = c();
            Map map2 = Pg.f26135a;
            tn.p.k(publisherConfigC, "<this>");
            if (publisherConfigC.getEnableMCO() || publisherConfigC.getEnableAB()) {
                p000do.i.d(A9.f25149e, null, null, new Mg(map, publisherConfigC, null), 3, null);
            } else {
                Kb.a((byte) 1, "PubSignals", "Publisher signals are disabled from InMobi");
            }
        } catch (Exception e10) {
            bn.g gVar = P9.f26117a;
            P9.a(new L2(e10));
            Kb.a((byte) 1, "PubSignals", "Publisher signals could not be saved due to an Internal Error.");
        }
    }

    public static void a(JSONObject jSONObject, String str, JSONArray jSONArray) throws JSONException {
        tn.p.k(jSONObject, "<this>");
        tn.p.k(str, "key");
        tn.p.k(jSONArray, "value");
        jSONObject.put(str, jSONArray);
        Context context = Ji.f25747a;
        if (context != null) {
            f26086a.getClass();
            if (f26089d == null) {
                f26089d = new C3911zg(context, "pub_signals_store");
            }
            jSONObject.toString();
            C3911zg c3911zg = f26089d;
            if (c3911zg == null) {
                tn.p.C("prefDao");
                c3911zg = null;
            }
            String string = jSONObject.toString();
            tn.p.j(string, "toString(...)");
            c3911zg.getClass();
            tn.p.k("imp_depth", "key");
            tn.p.k(string, "value");
            Ea ea2 = c3911zg.f28644a;
            ConcurrentHashMap concurrentHashMap = Ea.f25372b;
            ea2.a("imp_depth", string, false);
            I1 i12 = f26091f;
            i12.f25632c = i12.f25630a.invoke();
        }
    }

    public static final Object b(Og og2, Map map, SignalsConfig.PublisherConfig publisherConfig, Mg mg2) throws JSONException {
        og2.getClass();
        if (!publisherConfig.getDirect().getEnabled()) {
            Kb.a((byte) 1, "PubSignals", "Direct signals are disabled by InMobi");
            return bn.r.f5635a;
        }
        int count = publisherConfig.getDirect().getCount();
        Triple tripleC = Pg.c(map, publisherConfig);
        String str = (String) tripleC.component1();
        JSONObject jSONObject = (JSONObject) tripleC.component2();
        String str2 = (String) tripleC.component3();
        if (jSONObject == null) {
            return bn.r.f5635a;
        }
        og2.a(str2, "d_i_dep");
        Object objA = og2.a(Pg.a(og2.b(), str, jSONObject, count), mg2);
        return objA == in.a.g() ? objA : bn.r.f5635a;
    }

    public static SignalsConfig.PublisherConfig c() {
        C3476i4 c3476i4 = Y3.f26611a;
        tn.p.k(SignalsConfig.class, "clazz");
        return ((SignalsConfig) Y3.f26611a.a(SignalsConfig.class)).getPublisherConfig();
    }

    public static final Object c(Og og2, Map map, SignalsConfig.PublisherConfig publisherConfig, Mg mg2) throws JSONException {
        og2.getClass();
        if (!publisherConfig.getObj().getEnabled()) {
            Kb.a((byte) 1, "PubSignals", "Object signals are disabled by InMobi");
            return bn.r.f5635a;
        }
        int count = publisherConfig.getObj().getCount();
        Triple tripleB = Pg.b(map, publisherConfig);
        String str = (String) tripleB.component1();
        JSONObject jSONObject = (JSONObject) tripleB.component2();
        String str2 = (String) tripleB.component3();
        if (jSONObject == null) {
            return bn.r.f5635a;
        }
        og2.a(str2, "o_i_dep");
        Object objA = og2.a(Pg.a(og2.b(), str, jSONObject, count), mg2);
        return objA == in.a.g() ? objA : bn.r.f5635a;
    }

    public static final JSONObject f() {
        f26086a.getClass();
        Context context = Ji.f25747a;
        JSONObject jSONObject = null;
        if (context != null) {
            if (f26089d == null) {
                f26089d = new C3911zg(context, "pub_signals_store");
            }
            C3911zg c3911zg = f26089d;
            if (c3911zg == null) {
                tn.p.C("prefDao");
                c3911zg = null;
            }
            String strA = c3911zg.a("imp_depth");
            if (strA != null) {
                jSONObject = new JSONObject(strA);
            }
        }
        return jSONObject == null ? new JSONObject() : jSONObject;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(org.json.JSONObject r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.inmobi.media.Ng
            if (r0 == 0) goto L13
            r0 = r8
            com.inmobi.media.Ng r0 = (com.inmobi.media.Ng) r0
            int r1 = r0.f26045e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26045e = r1
            goto L18
        L13:
            com.inmobi.media.Ng r0 = new com.inmobi.media.Ng
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f26043c
            java.lang.Object r1 = in.a.g()
            int r2 = r0.f26045e
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            mo.a r7 = r0.f26042b
            org.json.JSONObject r0 = r0.f26041a
            kotlin.c.b(r8)
            goto L60
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            kotlin.c.b(r8)
            android.content.Context r8 = com.inmobi.media.Ji.f25747a
            if (r8 == 0) goto La7
            com.inmobi.media.Og r2 = com.inmobi.media.Og.f26086a
            r2.getClass()
            com.inmobi.media.zg r2 = com.inmobi.media.Og.f26089d
            if (r2 != 0) goto L4f
            com.inmobi.media.zg r2 = new com.inmobi.media.zg
            java.lang.String r5 = "pub_signals_store"
            r2.<init>(r8, r5)
            com.inmobi.media.Og.f26089d = r2
        L4f:
            mo.a r8 = com.inmobi.media.Og.f26092g
            r0.f26041a = r7
            r0.f26042b = r8
            r0.f26045e = r3
            java.lang.Object r0 = r8.c(r4, r0)
            if (r0 != r1) goto L5e
            return r1
        L5e:
            r0 = r7
            r7 = r8
        L60:
            com.inmobi.media.zg r8 = com.inmobi.media.Og.f26089d     // Catch: java.lang.Throwable -> La2
            if (r8 != 0) goto L6a
            java.lang.String r8 = "prefDao"
            tn.p.C(r8)     // Catch: java.lang.Throwable -> La2
            r8 = r4
        L6a:
            java.lang.String r1 = "saved_signals"
            java.lang.String r2 = r0.toString()     // Catch: java.lang.Throwable -> La2
            java.lang.String r5 = "toString(...)"
            tn.p.j(r2, r5)     // Catch: java.lang.Throwable -> La2
            r8.getClass()     // Catch: java.lang.Throwable -> La2
            java.lang.String r5 = "key"
            tn.p.k(r1, r5)     // Catch: java.lang.Throwable -> La2
            java.lang.String r5 = "value"
            tn.p.k(r2, r5)     // Catch: java.lang.Throwable -> La2
            com.inmobi.media.Ea r8 = r8.f28644a     // Catch: java.lang.Throwable -> La2
            r8.a(r1, r2, r3)     // Catch: java.lang.Throwable -> La2
            bn.r r8 = bn.r.f5635a     // Catch: java.lang.Throwable -> La2
            r7.d(r4)
            com.inmobi.media.I1 r7 = com.inmobi.media.Og.f26090e
            sn.a r8 = r7.f25630a
            java.lang.Object r8 = r8.invoke()
            r7.f25632c = r8
            r7 = 2
            java.lang.String r8 = "PubSignals"
            java.lang.String r1 = "Publisher Signals saved successfully."
            com.inmobi.media.Kb.a(r7, r8, r1)
            r0.toString()
            goto La7
        La2:
            r8 = move-exception
            r7.d(r4)
            throw r8
        La7:
            bn.r r7 = bn.r.f5635a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Og.a(org.json.JSONObject, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.lang.String r8, java.lang.String r9) throws org.json.JSONException {
        /*
            r7 = this;
            java.lang.String r0 = "adFormat"
            tn.p.k(r8, r0)
            java.lang.String r0 = "key"
            tn.p.k(r9, r0)
            com.inmobi.media.I1 r0 = com.inmobi.media.Og.f26091f
            sn.a r1 = r0.f25630a
            java.lang.Object r1 = r1.invoke()
            r0.f25632c = r1
            kotlin.reflect.KProperty[] r1 = com.inmobi.media.Og.f26087b
            r2 = 1
            r1 = r1[r2]
            java.lang.Object r0 = r0.getValue(r7, r1)
            org.json.JSONObject r0 = (org.json.JSONObject) r0
            org.json.JSONArray r1 = r0.optJSONArray(r9)
            r3 = 0
            if (r1 != 0) goto L39
            java.util.Map r1 = com.inmobi.media.Pg.f26135a
            org.json.JSONArray r1 = new org.json.JSONArray
            r1.<init>()
            r1.put(r3)
            r1.put(r3)
            r1.put(r3)
            r1.put(r3)
        L39:
            int r4 = r8.hashCode()
            r5 = 97295(0x17c0f, float:1.3634E-40)
            r6 = -1
            if (r4 == r5) goto L74
            r5 = 104431(0x197ef, float:1.46339E-40)
            if (r4 == r5) goto L69
            r5 = 108833(0x1a921, float:1.52508E-40)
            if (r4 == r5) goto L5e
            r5 = 112804(0x1b8a4, float:1.58072E-40)
            if (r4 == r5) goto L53
            goto L7c
        L53:
            java.lang.String r4 = "rew"
            boolean r8 = r8.equals(r4)
            if (r8 != 0) goto L5c
            goto L7c
        L5c:
            r8 = 2
            goto L7f
        L5e:
            java.lang.String r4 = "nat"
            boolean r8 = r8.equals(r4)
            if (r8 != 0) goto L67
            goto L7c
        L67:
            r8 = 3
            goto L7f
        L69:
            java.lang.String r4 = "int"
            boolean r8 = r8.equals(r4)
            if (r8 != 0) goto L72
            goto L7c
        L72:
            r8 = r2
            goto L7f
        L74:
            java.lang.String r4 = "ban"
            boolean r8 = r8.equals(r4)
            if (r8 != 0) goto L7e
        L7c:
            r8 = r6
            goto L7f
        L7e:
            r8 = r3
        L7f:
            if (r8 == r6) goto L8c
            int r3 = r1.optInt(r8, r3)
            int r3 = r3 + r2
            r1.put(r8, r3)
            a(r0, r9, r1)
        L8c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Og.a(java.lang.String, java.lang.String):void");
    }

    public final JSONObject b() {
        return (JSONObject) f26090e.getValue(this, f26087b[0]);
    }

    public final LinkedHashMap d() {
        JSONObject jSONObjectB = b();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map<String, SignalsConfig.PublisherConfig.KeyData> allowedKeysAnd = c().getObj().getAllowedKeysAnd();
        Map<String, SignalsConfig.PublisherConfig.KeyData> allowedKeys = c().getAuto().getAllowedKeys();
        List<String> list = f26088c;
        SignalsConfig.PublisherConfig publisherConfigC = c();
        for (String str : list) {
            Pg.a(Pg.a(Pg.a(linkedHashMap, jSONObjectB, "obj_", str, Pg.c(allowedKeysAnd)), jSONObjectB, "auto_", str, Pg.c(allowedKeys)), jSONObjectB, "dir_", str, publisherConfigC.getDirect().getAllowedKeys());
        }
        return linkedHashMap;
    }

    public final JSONObject e() throws JSONException {
        JSONObject jSONObjectB = b();
        JSONObject jSONObject = new JSONObject();
        Iterator<String> itKeys = jSONObjectB.keys();
        tn.p.j(itKeys, "keys(...)");
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            tn.p.h(next);
            if (!bo.a0.W(next, "obj_", false, 2, null) && !bo.a0.W(next, "auto_", false, 2, null) && !bo.a0.W(next, "dir_", false, 2, null)) {
                jSONObject.put(next, jSONObjectB.opt(next));
            }
        }
        for (String str : f26088c) {
            f26086a.getClass();
            if (c().getObj().getEnabled()) {
                Map<String, SignalsConfig.PublisherConfig.KeyData> allowedKeysAnd = c().getObj().getAllowedKeysAnd();
                ArrayList arrayList = new ArrayList(allowedKeysAnd.size());
                Iterator<Map.Entry<String, SignalsConfig.PublisherConfig.KeyData>> it = allowedKeysAnd.entrySet().iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().getValue().getName());
                }
                Pg.a(jSONObject, jSONObjectB, str, "obj_", cn.f0.l1(arrayList));
            }
            f26086a.getClass();
            if (c().getAuto().getEnabled()) {
                Map<String, SignalsConfig.PublisherConfig.KeyData> allowedKeys = c().getAuto().getAllowedKeys();
                ArrayList arrayList2 = new ArrayList(allowedKeys.size());
                Iterator<Map.Entry<String, SignalsConfig.PublisherConfig.KeyData>> it2 = allowedKeys.entrySet().iterator();
                while (it2.hasNext()) {
                    arrayList2.add(it2.next().getValue().getName());
                }
                Pg.a(jSONObject, jSONObjectB, str, "auto_", cn.f0.l1(arrayList2));
            }
            f26086a.getClass();
            if (c().getDirect().getEnabled()) {
                Pg.a(jSONObject, jSONObjectB, str, "dir_", c().getDirect().getAllowedKeys().keySet());
            }
        }
        for (Pair pair : cn.w.p(bn.h.a(c().getObj(), "o_i_dep"), bn.h.a(c().getDirect(), "d_i_dep"), bn.h.a(c().getAuto(), "a_i_dep"))) {
            SignalsConfig.PublisherConfig.BaseInputData baseInputData = (SignalsConfig.PublisherConfig.BaseInputData) pair.component1();
            String str2 = (String) pair.component2();
            if (baseInputData.getDepth().getEnabled()) {
                Og og2 = f26086a;
                og2.getClass();
                JSONArray jSONArrayOptJSONArray = ((JSONObject) f26091f.getValue(og2, f26087b[1])).optJSONArray(str2);
                if (jSONArrayOptJSONArray == null) {
                    Map map = Pg.f26135a;
                    jSONArrayOptJSONArray = new JSONArray();
                    jSONArrayOptJSONArray.put(0);
                    jSONArrayOptJSONArray.put(0);
                    jSONArrayOptJSONArray.put(0);
                    jSONArrayOptJSONArray.put(0);
                }
                jSONObject.put(str2, jSONArrayOptJSONArray);
            }
        }
        jSONObject.toString();
        return jSONObject;
    }
}
