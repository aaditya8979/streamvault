package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.K4;
import com.inmobi.media.core.config.models.AdConfig;
import com.inmobi.media.core.config.models.SignalsConfig;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes8.dex */
public final class K4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final K4 f25792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final bn.g f25793b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static LinkedList f25794c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static LinkedList f25795d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static byte[] f25796e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static String f25797f;

    static {
        K4 k42 = new K4();
        f25792a = k42;
        f25793b = kotlin.b.b(new sn.a() { // from class: n9.h2
            @Override // sn.a
            public final Object invoke() {
                return K4.b();
            }
        });
        LinkedList linkedList = new LinkedList();
        f25794c = linkedList;
        Object objClone = linkedList.clone();
        tn.p.i(objClone, "null cannot be cast to non-null type java.util.LinkedList<com.inmobi.signals.contextualdata.EncryptedContextualData>");
        f25795d = (LinkedList) objClone;
        H4 h42 = new H4();
        E4 e42 = new E4();
        C3476i4 c3476i4 = Y3.f26611a;
        tn.p.k(SignalsConfig.class, "clazz");
        C3476i4 c3476i42 = Y3.f26611a;
        f25796e = X5.a(((SignalsConfig) c3476i42.a(SignalsConfig.class)).getAK());
        List<String> skipFields = c().getContextualData().getSkipFields();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(L4.f25845j);
        arrayList.removeAll(skipFields);
        f25797f = cn.f0.D0(arrayList, StringUtils.COMMA, null, null, 0, null, null, 62, null);
        Context context = Ji.f25747a;
        if (context != null) {
            tn.p.j("K4", "TAG");
            ConcurrentHashMap concurrentHashMap = Ea.f25372b;
            Ea eaA = Da.a(context, "c_data_store");
            Context context2 = Ji.f25747a;
            int i10 = 1;
            if (context2 != null) {
                Ea eaA2 = Da.a(context2, "c_data_store");
                tn.p.k("akv", "key");
                i10 = eaA2.f25373a.getInt("akv", 1);
            }
            tn.p.k(SignalsConfig.class, "clazz");
            if (((SignalsConfig) c3476i42.a(SignalsConfig.class)).getAKV() != i10) {
                tn.p.j("K4", "TAG");
                tn.p.k(SignalsConfig.class, "clazz");
                eaA.a("akv", ((SignalsConfig) c3476i42.a(SignalsConfig.class)).getAKV(), false);
                k42.f();
            }
        }
        Y3.a(com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, e42);
        Y3.a("signals", h42);
    }

    public static final void a() throws InterruptedException {
        tn.p.j("K4", "TAG");
        long jCurrentTimeMillis = System.currentTimeMillis() - (((long) c().getContextualData().getExpiryTime()) * 1000);
        a(jCurrentTimeMillis, c().getContextualData().getMaxAdRecords());
        Object objClone = f25794c.clone();
        tn.p.i(objClone, "null cannot be cast to non-null type java.util.LinkedList<com.inmobi.signals.contextualdata.EncryptedContextualData>");
        f25795d = (LinkedList) objClone;
        p000do.h.b(null, new J4(jCurrentTimeMillis, null), 1, null);
    }

    public static void a(long j10, int i10) {
        tn.p.j("K4", "TAG");
        for (int size = f25794c.size(); size > i10; size--) {
            f25794c.remove();
        }
        tn.p.j("K4", "TAG");
        Iterator it = f25794c.iterator();
        tn.p.j(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            tn.p.j(next, "next(...)");
            if (((W5) next).f26522b >= j10) {
                return;
            } else {
                it.remove();
            }
        }
    }

    public static final C4 b() {
        return new C4(AbstractC3456h9.b());
    }

    public static AdConfig c() {
        C3476i4 c3476i4 = Y3.f26611a;
        tn.p.k(AdConfig.class, "clazz");
        return (AdConfig) Y3.f26611a.a(AdConfig.class);
    }

    public static String d() {
        tn.p.j("K4", "TAG");
        if (f25797f.length() == 0) {
            return "";
        }
        JSONArray jSONArray = new JSONArray();
        long jCurrentTimeMillis = System.currentTimeMillis() - (((long) c().getContextualData().getExpiryTime()) * 1000);
        LinkedList linkedList = f25795d;
        ArrayList arrayList = new ArrayList();
        for (Object obj : linkedList) {
            if (((W5) obj).f26522b >= jCurrentTimeMillis) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            jSONArray.put(bo.d0.s1(((W5) it.next()).f26521a).toString());
        }
        String string = jSONArray.toString();
        tn.p.j(string, "toString(...)");
        return string;
    }

    public static boolean e() {
        boolean z10;
        AdConfig.ContextualDataConfig contextualData;
        Context context = Ji.f25747a;
        if (context != null) {
            ConcurrentHashMap concurrentHashMap = Ea.f25372b;
            Ea eaA = Da.a(context, "c_data_store");
            tn.p.k("isEnabled", "key");
            z10 = eaA.f25373a.getBoolean("isEnabled", true);
        } else {
            z10 = true;
        }
        if (!z10) {
            tn.p.j("K4", "TAG");
            return false;
        }
        AdConfig adConfigC = c();
        boolean z11 = ((adConfigC == null || (contextualData = adConfigC.getContextualData()) == null) ? 1 : contextualData.getMaxAdRecords()) > 0;
        tn.p.j("K4", "TAG");
        return z11;
    }

    public final void a(boolean z10) {
        Context context = Ji.f25747a;
        if (context != null) {
            tn.p.j("K4", "TAG");
            if (z10 != e()) {
                tn.p.j("K4", "TAG");
                ConcurrentHashMap concurrentHashMap = Ea.f25372b;
                Ea.a(Da.a(context, "c_data_store"), "isEnabled", z10);
                if (z10) {
                    return;
                }
                f();
            }
        }
    }

    public final void f() {
        synchronized (this) {
            tn.p.j("K4", "TAG");
            p000do.h.b(null, new G4(null), 1, null);
            LinkedList linkedList = new LinkedList();
            f25794c = linkedList;
            Object objClone = linkedList.clone();
            tn.p.i(objClone, "null cannot be cast to non-null type java.util.LinkedList<com.inmobi.signals.contextualdata.EncryptedContextualData>");
            f25795d = (LinkedList) objClone;
            bn.r rVar = bn.r.f5635a;
        }
    }
}
