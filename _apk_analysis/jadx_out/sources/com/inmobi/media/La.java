package com.inmobi.media;

import androidx.compose.material.TextFieldImplKt;
import com.inmobi.media.I2;
import com.inmobi.media.La;
import com.inmobi.media.core.config.models.CrashConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class La implements Jf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CrashConfig f25863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C3552l6 f25864b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final R9 f25865c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final sn.l f25866d;

    public La(CrashConfig crashConfig) {
        tn.p.k(crashConfig, "crashConfig");
        this.f25863a = crashConfig;
        this.f25865c = new R9(crashConfig);
        this.f25866d = new sn.l() { // from class: n9.q2
            @Override // sn.l
            public final Object invoke(Object obj) {
                return La.a(this.f75581b, (I2) obj);
            }
        };
    }

    public static final bn.r a(La la2, I2 i22) {
        tn.p.k(i22, "it");
        int i10 = i22.f25635a;
        if (i10 != 1 && i10 != 2) {
            switch (i10) {
                case TextFieldImplKt.AnimationDuration /* 150 */:
                case 151:
                case 152:
                    Map map = i22.f25637c;
                    if (map != null && map.containsKey("data")) {
                        Object obj = i22.f25637c.get("data");
                        tn.p.i(obj, "null cannot be cast to non-null type com.inmobi.commons.core.incident.IncidentEvent");
                        Q9 q92 = (Q9) obj;
                        la2.getClass();
                        tn.p.k(q92, "incident");
                        AbstractC3492il.a(new Ka(la2, q92, null));
                    }
                    break;
            }
        } else {
            C3552l6 c3552l6 = la2.f25864b;
            if (c3552l6 != null) {
                c3552l6.f27540f.set(false);
                c3552l6.f27541g.set(true);
                c3552l6.f27542h.clear();
                c3552l6.f27544j = null;
            }
            la2.f25864b = null;
            ((C3857xc) Ji.f25751e.getValue()).a(la2.f25866d);
        }
        return bn.r.f5635a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00aa, code lost:
    
        if (r13.a(r15, (kotlin.coroutines.jvm.internal.ContinuationImpl) r0) == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ff, code lost:
    
        if (r13 == r1) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(com.inmobi.media.La r13, com.inmobi.media.Q9 r14, kotlin.coroutines.jvm.internal.ContinuationImpl r15) {
        /*
            Method dump skipped, instruction units count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.La.a(com.inmobi.media.La, com.inmobi.media.Q9, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(com.inmobi.media.La r4, kotlin.coroutines.jvm.internal.ContinuationImpl r5) {
        /*
            r4.getClass()
            boolean r0 = r5 instanceof com.inmobi.media.Ja
            if (r0 == 0) goto L16
            r0 = r5
            com.inmobi.media.Ja r0 = (com.inmobi.media.Ja) r0
            int r1 = r0.f25712c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f25712c = r1
            goto L1b
        L16:
            com.inmobi.media.Ja r0 = new com.inmobi.media.Ja
            r0.<init>(r4, r5)
        L1b:
            java.lang.Object r5 = r0.f25710a
            java.lang.Object r1 = in.a.g()
            int r2 = r0.f25712c
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            kotlin.c.b(r5)
            goto L48
        L2c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L34:
            kotlin.c.b(r5)
            bn.g r5 = com.inmobi.media.P9.f26117a
            java.lang.Object r5 = r5.getValue()
            com.inmobi.media.N9 r5 = (com.inmobi.media.N9) r5
            r0.f25712c = r3
            java.lang.Object r5 = r5.a(r0)
            if (r5 != r1) goto L48
            return r1
        L48:
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            if (r5 <= 0) goto L53
            r4.a()
        L53:
            bn.r r4 = bn.r.f5635a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.La.a(com.inmobi.media.La, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // com.inmobi.media.Jf
    public final Object a(hn.c cVar) {
        String string;
        C3850x5.f28483a.getClass();
        int iL = C3850x5.l();
        int i10 = 1;
        int iA = (iL == 0 || iL != 1) ? this.f25863a.getMobileConfig().a() : this.f25863a.getWifiConfig().a();
        List<Q9> list = (List) p000do.h.b(null, new Fa(iA, null), 1, null);
        if (!list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(jn.a.d(((Q9) it.next()).f27327d));
            }
            try {
                HashMap map = new HashMap(C3850x5.f28483a.a(false));
                map.put("im-accid", Ji.f25749c);
                map.put("version", "2.0.0");
                map.put("component", "crash");
                map.put("mk-version", Ki.a());
                map.putAll(A1.f25133e);
                map.put("tp", Ki.f25816b);
                String str = Ki.f25815a;
                if (str == null) {
                    str = "";
                }
                map.put("tpVer", str);
                JSONObject jSONObject = new JSONObject(map);
                JSONArray jSONArray = new JSONArray();
                for (Q9 q92 : list) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("eventId", q92.f26174e);
                    jSONObject2.put("eventType", q92.f27324a);
                    String str2 = q92.f27325b;
                    if (str2 == null) {
                        str2 = "";
                    }
                    int length = str2.length() - i10;
                    int i11 = 0;
                    boolean z10 = false;
                    while (i11 <= length) {
                        boolean z11 = tn.p.m(str2.charAt(!z10 ? i11 : length), 32) <= 0;
                        if (z10) {
                            if (!z11) {
                                break;
                            }
                            length--;
                        } else if (z11) {
                            i11++;
                        } else {
                            z10 = true;
                        }
                    }
                    if (str2.subSequence(i11, length + 1).toString().length() > 0) {
                        String str3 = q92.f27325b;
                        if (str3 == null) {
                            str3 = "";
                        }
                        jSONObject2.put("crash_report", str3);
                    }
                    jSONObject2.put("ts", q92.f27326c);
                    jSONArray.put(jSONObject2);
                    i10 = 1;
                }
                jSONObject.put("crash", jSONArray);
                string = jSONObject.toString();
            } catch (JSONException unused) {
                string = null;
            }
            if (string != null) {
                return new C3376e6(string, arrayList);
            }
        }
        return null;
    }

    public final void a() {
        C3325c6 eventConfig = this.f25863a.getEventConfig();
        eventConfig.f26920k = this.f25863a.getUrl();
        C3552l6 c3552l6 = this.f25864b;
        if (c3552l6 != null) {
            tn.p.k(eventConfig, "eventConfig");
            c3552l6.f27544j = eventConfig;
        } else {
            this.f25864b = new C3552l6("crash", (N9) P9.f26117a.getValue(), this, this.f25863a.getEventConfig(), null);
        }
        C3552l6 c3552l62 = this.f25864b;
        if (c3552l62 != null) {
            c3552l62.a(false);
        }
    }
}
