package com.inmobi.media;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import com.android.billingclient.api.BillingClient;
import com.inmobi.media.Vg;
import com.inmobi.media.Wg;
import com.inmobi.media.core.config.models.SignalsConfig;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public abstract class Vg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f26501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static C3513jh f26502b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f26503c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final bn.g f26504d = kotlin.b.b(new sn.a() { // from class: n9.y4
        @Override // sn.a
        public final Object invoke() {
            return Boolean.valueOf(Vg.c());
        }
    });

    public static final bn.r a(Wg wg2) throws JSONException {
        Ea eaA;
        f26503c = 2;
        if (wg2 == null) {
            C3513jh c3513jh = f26502b;
            if (c3513jh != null) {
                c3513jh.f27411a = null;
                BillingClient billingClient = c3513jh.f27412b;
                if (billingClient != null) {
                    billingClient.endConnection();
                }
            }
            f26502b = null;
            return bn.r.f5635a;
        }
        wg2.toString();
        JSONObject jSONObject = new JSONObject();
        int i10 = wg2.f26544a;
        if (i10 > 0) {
            jSONObject.put("p", i10);
        }
        int i11 = wg2.f26545b;
        if (i11 > 0) {
            jSONObject.put("s", i11);
        }
        String string = jSONObject.length() == 0 ? null : jSONObject.toString();
        if (string != null) {
            f26501a = string;
            tn.p.k(string, "nipMapJSON");
            tn.p.k(string, "nipMapJSON");
            Context context = Ji.f25747a;
            if (context != null) {
                ConcurrentHashMap concurrentHashMap = Ea.f25372b;
                eaA = Da.a(context, "purchase_store");
            } else {
                eaA = null;
            }
            if (eaA != null) {
                ConcurrentHashMap concurrentHashMap2 = Ea.f25372b;
                eaA.a("purchase_pref", string, false);
            }
        }
        C3513jh c3513jh2 = f26502b;
        if (c3513jh2 != null) {
            c3513jh2.f27411a = null;
            BillingClient billingClient2 = c3513jh2.f27412b;
            if (billingClient2 != null) {
                billingClient2.endConnection();
            }
        }
        f26502b = null;
        return bn.r.f5635a;
    }

    public static void a() {
        Ea eaA;
        Context context = Ji.f25747a;
        String string = null;
        if (context != null) {
            ConcurrentHashMap concurrentHashMap = Ea.f25372b;
            eaA = Da.a(context, "purchase_store");
        } else {
            eaA = null;
        }
        if (eaA != null) {
            tn.p.k("purchase_pref", "key");
            string = eaA.f25373a.getString("purchase_pref", null);
        }
        if (string != null) {
            f26501a = string;
        }
    }

    public static boolean a(Context context) {
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        C3850x5.f28483a.getClass();
        if (!C3850x5.v()) {
            return false;
        }
        if (!((Boolean) f26504d.getValue()).booleanValue()) {
            AbstractC3310bh.a(new Yg((short) 2230));
            return false;
        }
        if (!b(context)) {
            return false;
        }
        int i10 = f26503c;
        if (i10 != 1 && i10 != 2) {
            return true;
        }
        AbstractC3310bh.a(new Yg(i10 != 1 ? i10 != 2 ? (short) 0 : (short) 2232 : (short) 2231));
        return false;
    }

    public static void b() {
        try {
            Context context = Ji.f25747a;
            if (context == null) {
                return;
            }
            C3476i4 c3476i4 = Y3.f26611a;
            tn.p.k(SignalsConfig.class, "clazz");
            if (((SignalsConfig) Y3.f26611a.a(SignalsConfig.class)).getPurchases().getInapp()) {
                a();
                if (a(context)) {
                    f26503c = 1;
                    C3513jh c3513jh = new C3513jh();
                    f26502b = c3513jh;
                    c3513jh.a(context, new sn.l() { // from class: n9.z4
                        @Override // sn.l
                        public final Object invoke(Object obj) {
                            return Vg.a((Wg) obj);
                        }
                    });
                }
            }
        } catch (Exception e10) {
            bn.g gVar = P9.f26117a;
            P9.a(new L2(e10));
            e10.getMessage();
        }
    }

    public static boolean b(Context context) {
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            tn.p.j(applicationInfo, "getApplicationInfo(...)");
            Bundle bundle = applicationInfo.metaData;
            String string = bundle != null ? bundle.getString("com.google.android.play.billingclient.version") : null;
            C3476i4 c3476i4 = Y3.f26611a;
            tn.p.k(SignalsConfig.class, "clazz");
            boolean zI0 = cn.f0.i0(((SignalsConfig) Y3.f26611a.a(SignalsConfig.class)).getPurchases().getVersionList(), string);
            if (!zI0) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (string == null) {
                    string = "";
                }
                linkedHashMap.put("trigger", string);
                Wj wj2 = Wj.f26549a;
                Wj.b("BillingClientNotCompatible", linkedHashMap, EnumC3287ak.f26805a);
            }
            return zI0;
        } catch (Exception e10) {
            bn.g gVar = P9.f26117a;
            P9.a(new L2(e10));
            e10.getMessage();
            return false;
        }
    }

    public static final boolean c() {
        try {
            Class.forName("com.android.billingclient.api.BillingClient");
            return true;
        } catch (ClassNotFoundException e10) {
            bn.g gVar = P9.f26117a;
            P9.a(new L2(e10));
            return false;
        } catch (Exception e11) {
            bn.g gVar2 = P9.f26117a;
            P9.a(new L2(e11));
            e11.getMessage();
            return false;
        }
    }
}
