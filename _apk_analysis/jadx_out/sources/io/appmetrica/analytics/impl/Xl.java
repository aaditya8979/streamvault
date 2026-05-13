package io.appmetrica.analytics.impl;

import android.content.Context;
import android.text.TextUtils;
import io.appmetrica.analytics.StartupParamsCallback;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.internal.IdentifiersResult;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes9.dex */
public final class Xl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashSet f66189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f66190b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Ul f66191c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f66192d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public HashMap f66193e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f66194f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f66195g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f66196h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final We f66197i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final P f66198j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final D3 f66199k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C5254y6 f66200l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final U9 f66201m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final T9 f66202n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final qo f66203o;

    public Xl(Context context, We we2) {
        this(we2, new P(), new D3(), C4696c4.l().a(context), new C5254y6(), new U9(), new T9(), new qo());
    }

    public Xl(We we2, P p10, D3 d32, C5211wd c5211wd, C5254y6 c5254y6, U9 u92, T9 t92, qo qoVar) {
        HashSet hashSet = new HashSet();
        this.f66189a = hashSet;
        this.f66190b = new HashMap();
        this.f66191c = new Ul();
        hashSet.add("appmetrica_google_adv_id");
        hashSet.add("appmetrica_huawei_oaid");
        hashSet.add("appmetrica_yandex_adv_id");
        this.f66197i = we2;
        this.f66198j = p10;
        this.f66199k = d32;
        this.f66200l = c5254y6;
        this.f66201m = u92;
        this.f66202n = t92;
        this.f66203o = qoVar;
        c(c5211wd.a());
        a(StartupParamsCallback.APPMETRICA_DEVICE_ID, we2.j());
        a(StartupParamsCallback.APPMETRICA_DEVICE_ID_HASH, we2.i());
        a("appmetrica_get_ad_url", we2.d());
        a("appmetrica_report_ad_url", we2.e());
        b(we2.o());
        a("appmetrica_google_adv_id", we2.l());
        a("appmetrica_huawei_oaid", we2.m());
        a("appmetrica_yandex_adv_id", we2.r());
        c5254y6.a(we2.h());
        u92.a(we2.k());
        this.f66192d = we2.g();
        String strI = we2.i((String) null);
        this.f66193e = strI != null ? Gm.a(strI) : null;
        this.f66195g = we2.a(true);
        this.f66194f = we2.b(0L);
        this.f66196h = we2.n();
        c();
    }

    public static boolean a(IdentifiersResult identifiersResult) {
        return identifiersResult == null || identifiersResult.f68099id == null;
    }

    public final void a(String str, IdentifiersResult identifiersResult) {
        if (identifiersResult == null || TextUtils.isEmpty(identifiersResult.f68099id)) {
            return;
        }
        this.f66190b.put(str, identifiersResult);
    }

    public final boolean a() {
        IdentifiersResult identifiersResult = (IdentifiersResult) this.f66190b.get("appmetrica_clids");
        if (!a(identifiersResult) && identifiersResult.f68099id.isEmpty()) {
            return mo.a((Map) this.f66193e);
        }
        return true;
    }

    public final synchronized boolean a(Collection collection) {
        Boolean bool;
        String str;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            IdentifiersResult identifiersResult = (IdentifiersResult) this.f66190b.get(str2);
            if (identifiersResult == null) {
                identifiersResult = (IdentifiersResult) this.f66200l.f68028c.get(str2);
            }
            if (identifiersResult == null) {
                W9 w92 = this.f66201m.f65990b;
                if (!tn.p.f(str2, "appmetrica_lib_ssl_enabled") || (bool = w92.f66095a) == null) {
                    identifiersResult = null;
                } else {
                    boolean zBooleanValue = bool.booleanValue();
                    IdentifierStatus identifierStatus = w92.f66096b;
                    String str3 = w92.f66097c;
                    if (zBooleanValue) {
                        str = "true";
                    } else {
                        if (zBooleanValue) {
                            throw new NoWhenBranchMatchedException();
                        }
                        str = com.ironsource.mediationsdk.metadata.a.f32683h;
                    }
                    identifiersResult = new IdentifiersResult(str, identifierStatus, str3);
                }
            }
            if ("appmetrica_clids".equals(str2)) {
                if (this.f66195g || a(identifiersResult) || (identifiersResult.f68099id.isEmpty() && !mo.a((Map) this.f66193e))) {
                    return false;
                }
            } else if ("appmetrica_lib_ssl_enabled".equals(str2)) {
                if (identifiersResult == null) {
                    return false;
                }
            } else if (identifiersResult == null || TextUtils.isEmpty(identifiersResult.f68099id)) {
                return false;
            }
        }
        return true;
    }

    public final synchronized boolean a(List list) {
        boolean z10;
        boolean z11;
        z10 = true;
        boolean z12 = !a(cn.f0.z0(list, AbstractC4740dm.f66628a));
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                z11 = false;
                break;
            }
            if (this.f66189a.contains((String) it.next())) {
                z11 = true;
                break;
            }
        }
        boolean z13 = AbstractC4740dm.f66629b.currentTimeSeconds() > this.f66196h;
        if (!z12 && !z11 && !z13) {
            if (!this.f66195g) {
                z10 = false;
            }
        }
        return z10;
    }

    public final void b(IdentifiersResult identifiersResult) {
        if (a(identifiersResult)) {
            return;
        }
        this.f66190b.put("appmetrica_clids", identifiersResult);
    }

    public final synchronized boolean b() {
        return a(Arrays.asList("appmetrica_clids", StartupParamsCallback.APPMETRICA_DEVICE_ID_HASH, StartupParamsCallback.APPMETRICA_DEVICE_ID, "appmetrica_get_ad_url", "appmetrica_report_ad_url", StartupParamsCallback.APPMETRICA_UUID));
    }

    public final void c() {
        W9 w92;
        We weD = this.f66197i.i((IdentifiersResult) this.f66190b.get(StartupParamsCallback.APPMETRICA_UUID)).e((IdentifiersResult) this.f66190b.get(StartupParamsCallback.APPMETRICA_DEVICE_ID)).d((IdentifiersResult) this.f66190b.get(StartupParamsCallback.APPMETRICA_DEVICE_ID_HASH)).a((IdentifiersResult) this.f66190b.get("appmetrica_get_ad_url")).b((IdentifiersResult) this.f66190b.get("appmetrica_report_ad_url")).e(this.f66194f).h((IdentifiersResult) this.f66190b.get("appmetrica_clids")).j(Gm.a((Map) this.f66193e)).f((IdentifiersResult) this.f66190b.get("appmetrica_google_adv_id")).g((IdentifiersResult) this.f66190b.get("appmetrica_huawei_oaid")).j((IdentifiersResult) this.f66190b.get("appmetrica_yandex_adv_id")).b(this.f66195g).c(this.f66200l.f68029d).d(this.f66196h);
        U9 u92 = this.f66201m;
        synchronized (u92) {
            w92 = u92.f65990b;
        }
        weD.a(w92).b();
    }

    public final void c(IdentifiersResult identifiersResult) {
        if (identifiersResult != null) {
            qo qoVar = this.f66203o;
            String str = identifiersResult.f68099id;
            qoVar.getClass();
            if (qo.a(str)) {
                this.f66190b.put(StartupParamsCallback.APPMETRICA_UUID, identifiersResult);
            }
        }
    }
}
