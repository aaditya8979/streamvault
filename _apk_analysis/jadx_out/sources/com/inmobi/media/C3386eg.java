package com.inmobi.media;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.lang.ref.WeakReference;
import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.eg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3386eg implements InterfaceC3412fg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC3309bg f27109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3589mi f27110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f27111c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f27112d;

    public C3386eg(InterfaceC3309bg interfaceC3309bg, C3589mi c3589mi) {
        this.f27109a = interfaceC3309bg;
        this.f27110b = c3589mi;
        String string = UUID.randomUUID().toString();
        tn.p.j(string, "toString(...)");
        this.f27111c = string;
        this.f27112d = new AtomicBoolean(false);
        F8 f82 = Uf.f26443b;
        if (f82 != null) {
            tn.p.k(string, "id");
            tn.p.k(this, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            f82.f27355b.put(string, new WeakReference(this));
            Iterator it = f82.f27355b.entrySet().iterator();
            while (it.hasNext()) {
                Object next = it.next();
                tn.p.j(next, "next(...)");
                if (((WeakReference) ((Map.Entry) next).getValue()).get() == null) {
                    it.remove();
                }
            }
        }
        C3651p5 c3651p5 = Uf.f26444c;
        if (c3651p5 != null) {
            tn.p.k(string, "id");
            tn.p.k(this, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            c3651p5.f27355b.put(string, new WeakReference(this));
            Iterator it2 = c3651p5.f27355b.entrySet().iterator();
            while (it2.hasNext()) {
                Object next2 = it2.next();
                tn.p.j(next2, "next(...)");
                if (((WeakReference) ((Map.Entry) next2).getValue()).get() == null) {
                    it2.remove();
                }
            }
        }
    }

    public static Object a(Rf rf2, C3361dg c3361dg) {
        Objects.toString(rf2);
        if (tn.p.f(rf2.f26252e, "high")) {
            F8 f82 = Uf.f26443b;
            if (f82 != null) {
                Object objB = f82.b(rf2, c3361dg);
                if (objB != in.a.g()) {
                    objB = bn.r.f5635a;
                }
                return objB == in.a.g() ? objB : bn.r.f5635a;
            }
        } else {
            C3651p5 c3651p5 = Uf.f26444c;
            if (c3651p5 != null) {
                Object objA = c3651p5.a(rf2, c3361dg);
                if (objA != in.a.g()) {
                    objA = bn.r.f5635a;
                }
                return objA == in.a.g() ? objA : bn.r.f5635a;
            }
        }
        return bn.r.f5635a;
    }

    public static void a(C3386eg c3386eg, short s10) {
        C3589mi c3589mi = c3386eg.f27110b;
        if (c3589mi != null) {
            tn.p.k("unknown", HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY);
            Map mapA = c3589mi.a();
            mapA.put(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(s10));
            mapA.put("trigger", "unknown");
            mapA.put("retryCount", String.valueOf(0));
            AbstractC3512jg.a("PingFailed", mapA);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.inmobi.media.C3361dg
            if (r0 == 0) goto L13
            r0 = r10
            com.inmobi.media.dg r0 = (com.inmobi.media.C3361dg) r0
            int r1 = r0.f27040d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27040d = r1
            goto L18
        L13:
            com.inmobi.media.dg r0 = new com.inmobi.media.dg
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f27038b
            java.lang.Object r1 = in.a.g()
            int r2 = r0.f27040d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.util.Iterator r9 = r0.f27037a
            kotlin.c.b(r10)     // Catch: java.lang.NoClassDefFoundError -> L5a java.lang.Exception -> L6e org.json.JSONException -> L7d
            goto L3e
        L2b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L33:
            kotlin.c.b(r10)
            java.util.List r9 = r8.a(r9)     // Catch: java.lang.NoClassDefFoundError -> L5a java.lang.Exception -> L6e org.json.JSONException -> L7d
            java.util.Iterator r9 = r9.iterator()     // Catch: java.lang.NoClassDefFoundError -> L5a java.lang.Exception -> L6e org.json.JSONException -> L7d
        L3e:
            boolean r10 = r9.hasNext()     // Catch: java.lang.NoClassDefFoundError -> L5a java.lang.Exception -> L6e org.json.JSONException -> L7d
            if (r10 == 0) goto L9d
            java.lang.Object r10 = r9.next()     // Catch: java.lang.NoClassDefFoundError -> L5a java.lang.Exception -> L6e org.json.JSONException -> L7d
            com.inmobi.media.Rf r10 = (com.inmobi.media.Rf) r10     // Catch: java.lang.NoClassDefFoundError -> L5a java.lang.Exception -> L6e org.json.JSONException -> L7d
            java.lang.String r2 = r10.f26252e     // Catch: java.lang.NoClassDefFoundError -> L5a java.lang.Exception -> L6e org.json.JSONException -> L7d
            r8.b(r2)     // Catch: java.lang.NoClassDefFoundError -> L5a java.lang.Exception -> L6e org.json.JSONException -> L7d
            r0.f27037a = r9     // Catch: java.lang.NoClassDefFoundError -> L5a java.lang.Exception -> L6e org.json.JSONException -> L7d
            r0.f27040d = r3     // Catch: java.lang.NoClassDefFoundError -> L5a java.lang.Exception -> L6e org.json.JSONException -> L7d
            java.lang.Object r10 = a(r10, r0)     // Catch: java.lang.NoClassDefFoundError -> L5a java.lang.Exception -> L6e org.json.JSONException -> L7d
            if (r10 != r1) goto L3e
            return r1
        L5a:
            r9 = move-exception
            r10 = 2245(0x8c5, float:3.146E-42)
            a(r8, r10)
            r9.getMessage()
            bn.g r10 = com.inmobi.media.P9.f26117a
            com.inmobi.media.L2 r10 = new com.inmobi.media.L2
            r10.<init>(r9)
            com.inmobi.media.P9.a(r10)
            goto L9d
        L6e:
            r9 = move-exception
            r10 = 2244(0x8c4, float:3.145E-42)
            a(r8, r10)
            r9.getMessage()
            bn.g r10 = com.inmobi.media.P9.f26117a
            com.inmobi.media.AbstractC3481i9.a(r9)
            goto L9d
        L7d:
            r9 = move-exception
            r10 = 2243(0x8c3, float:3.143E-42)
            a(r8, r10)
            com.inmobi.media.bg r10 = r8.f27109a
            if (r10 == 0) goto L9a
            com.inmobi.media.Z5[] r0 = com.inmobi.media.Z5.f26686a
            r3 = -104(0xffffffffffffff98, float:NaN)
            long r5 = java.lang.System.currentTimeMillis()
            r1 = r10
            com.inmobi.media.Yh r1 = (com.inmobi.media.Yh) r1
            r7 = 0
            java.lang.String r2 = ""
            java.lang.String r4 = "Ping JSON is invalid"
            r1.a(r2, r3, r4, r5, r7)
        L9a:
            r9.getMessage()
        L9d:
            bn.r r9 = bn.r.f5635a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3386eg.a(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final List a(String str) {
        JSONArray jSONArray = new JSONArray(str);
        if (jSONArray.length() == 0) {
            a(this, (short) 2253);
            InterfaceC3309bg interfaceC3309bg = this.f27109a;
            if (interfaceC3309bg != null) {
                Z5[] z5Arr = Z5.f26686a;
                ((Yh) interfaceC3309bg).a("", -105, "Ping array is empty", System.currentTimeMillis(), 0);
            }
            return cn.w.m();
        }
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
            if (jSONObjectOptJSONObject == null) {
                a(this, (short) 2254);
            } else {
                String strOptString = jSONObjectOptJSONObject.optString("id");
                if (strOptString == null || bo.d0.u0(strOptString)) {
                    tn.p.h(strOptString);
                    a(this, (short) 2255);
                    InterfaceC3309bg interfaceC3309bg2 = this.f27109a;
                    if (interfaceC3309bg2 != null) {
                        Z5[] z5Arr2 = Z5.f26686a;
                        ((Yh) interfaceC3309bg2).a(strOptString, -101, "Ping ID is missing", System.currentTimeMillis(), 0);
                    }
                } else {
                    String strOptString2 = jSONObjectOptJSONObject.optString("url");
                    if (a(strOptString, strOptString2)) {
                        JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("headers");
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (jSONObjectOptJSONObject2 != null) {
                            Iterator<String> itKeys = jSONObjectOptJSONObject2.keys();
                            while (itKeys.hasNext()) {
                                String next = itKeys.next();
                                linkedHashMap.put(next, jSONObjectOptJSONObject2.optString(next, ""));
                            }
                        }
                        boolean zOptBoolean = jSONObjectOptJSONObject.optBoolean("allowRedirects", true);
                        String strOptString3 = jSONObjectOptJSONObject.optString(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, "normal");
                        boolean zOptBoolean2 = jSONObjectOptJSONObject.optBoolean("ackRequired", false);
                        tn.p.h(strOptString2);
                        String str2 = strOptString3 != null ? strOptString3 : "normal";
                        String str3 = this.f27111c;
                        C3589mi c3589mi = this.f27110b;
                        rf = new Rf(strOptString2, strOptString, linkedHashMap, zOptBoolean, str2, zOptBoolean2, 0, str3, System.currentTimeMillis(), null, c3589mi != null ? c3589mi.f27631a : null);
                    }
                }
            }
            if (rf != null) {
                arrayList.add(rf);
            }
        }
        return arrayList;
    }

    public final void a(Rf rf2, int i10, long j10) {
        InterfaceC3309bg interfaceC3309bg;
        tn.p.k(rf2, "ping");
        if (this.f27112d.get()) {
            return;
        }
        String str = rf2.f26248a;
        if (tn.p.f("high", rf2.f26252e) && rf2.f26253f && (interfaceC3309bg = this.f27109a) != null) {
            ((Yh) interfaceC3309bg).a(rf2.f26249b, i10, null, j10, rf2.f26254g);
        }
        String str2 = rf2.f26252e;
        long jCurrentTimeMillis = System.currentTimeMillis() - rf2.f26256i;
        C3589mi c3589mi = this.f27110b;
        if (c3589mi != null) {
            tn.p.k(str2, HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY);
            Map mapA = c3589mi.a();
            mapA.put("trigger", str2);
            mapA.put("latency", Long.valueOf(jCurrentTimeMillis));
            AbstractC3512jg.a("PingSuccess", mapA);
        }
    }

    public final void a(Rf rf2, int i10, String str, int i11, long j10) {
        InterfaceC3309bg interfaceC3309bg;
        tn.p.k(rf2, "ping");
        if (this.f27112d.get()) {
            return;
        }
        String str2 = rf2.f26248a;
        if (tn.p.f("high", rf2.f26252e) && rf2.f26253f && rf2.f26254g < 1 && (interfaceC3309bg = this.f27109a) != null) {
            ((Yh) interfaceC3309bg).a(rf2.f26249b, i10, str, j10, rf2.f26254g);
        }
        String str3 = rf2.f26252e;
        C3589mi c3589mi = this.f27110b;
        if (c3589mi != null) {
            if (str3 == null) {
                str3 = "unknown";
            }
            tn.p.k(str3, HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY);
            Map mapA = c3589mi.a();
            mapA.put(IronSourceConstants.EVENTS_ERROR_CODE, (short) 2247);
            mapA.put("trigger", str3);
            mapA.put("retryCount", String.valueOf(i11));
            AbstractC3512jg.a("PingFailed", mapA);
        }
    }

    public final boolean a(String str, String str2) {
        String host;
        if (str2 == null || bo.d0.u0(str2)) {
            a(this, (short) 2252);
            InterfaceC3309bg interfaceC3309bg = this.f27109a;
            if (interfaceC3309bg != null) {
                Z5[] z5Arr = Z5.f26686a;
                ((Yh) interfaceC3309bg).a(str, -103, "Ping URL is missing", System.currentTimeMillis(), 0);
            }
            return false;
        }
        try {
            URI uri = new URI(str2);
            if ((tn.p.f(uri.getScheme(), "http") || tn.p.f(uri.getScheme(), "https")) && (host = uri.getHost()) != null) {
                if (!bo.d0.u0(host)) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        a(this, (short) 2256);
        InterfaceC3309bg interfaceC3309bg2 = this.f27109a;
        if (interfaceC3309bg2 != null) {
            Z5[] z5Arr2 = Z5.f26686a;
            ((Yh) interfaceC3309bg2).a(str, -102, "Ping url is invalid", System.currentTimeMillis(), 0);
        }
        return false;
    }

    public final void b(String str) {
        C3589mi c3589mi = this.f27110b;
        if (c3589mi != null) {
            tn.p.k(str, HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY);
            Map mapA = c3589mi.a();
            mapA.put("trigger", str);
            AbstractC3512jg.a("PingStarted", mapA);
        }
    }
}
