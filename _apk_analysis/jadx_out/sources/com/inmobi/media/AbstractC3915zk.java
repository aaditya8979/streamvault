package com.inmobi.media;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.inmobi.media.AbstractC3915zk;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.inmobi.media.zk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractC3915zk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static C3746t1 f28663a;

    public static void a() {
        try {
            c();
            b();
        } catch (Exception e10) {
            tn.p.j("zk", "TAG");
            e10.getMessage();
        }
    }

    public static void a(boolean z10) {
        C3746t1 c3746t1 = f28663a;
        if (c3746t1 == null) {
            return;
        }
        if (z10) {
            c3746t1.f28162b = null;
        } else if (c3746t1.f28162b == null) {
            Runnable runnable = new Runnable() { // from class: n9.vc
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC3915zk.d();
                }
            };
            Context context = Ji.f25747a;
            tn.p.k(runnable, "runnable");
            Ji.f25753g.submit(runnable);
        }
    }

    public static void b() {
        String str;
        try {
            C3746t1 c3746t1 = f28663a;
            if (c3746t1 == null || (str = c3746t1.f28162b) == null) {
                return;
            }
            tn.p.j("zk", "TAG");
            Kb.a((byte) 2, "zk", "Publisher device Id is " + str);
        } catch (Exception e10) {
            tn.p.j("zk", "TAG");
            e10.getMessage();
        }
    }

    public static void c() {
        Context context;
        boolean zBooleanValue;
        C3746t1 c3746t1;
        try {
            context = Ji.f25747a;
        } catch (Exception e10) {
            tn.p.j("zk", "TAG");
            e10.getMessage();
        }
        if (context != null) {
            C3746t1 c3746t12 = new C3746t1();
            try {
                tn.t.b(AdvertisingIdClient.class).getSimpleName();
                try {
                    AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
                    tn.p.j(advertisingIdInfo, "getAdvertisingIdInfo(...)");
                    c3746t12.f28162b = advertisingIdInfo.getId();
                    c3746t12.a(advertisingIdInfo.isLimitAdTrackingEnabled());
                    f28663a = c3746t12;
                    Boolean bool = Tg.f26361b;
                    boolean z10 = false;
                    if (bool == null) {
                        Context context2 = Ji.f25747a;
                        if (context2 != null) {
                            ConcurrentHashMap concurrentHashMap = Ea.f25372b;
                            Ea eaA = Da.a(context2, "user_info_store");
                            tn.p.k("user_age_restricted", "key");
                            Tg.f26361b = Boolean.valueOf(eaA.f25373a.getBoolean("user_age_restricted", false));
                        }
                        Boolean bool2 = Tg.f26361b;
                        if (bool2 != null) {
                            zBooleanValue = bool2.booleanValue();
                        }
                        if (z10 || (c3746t1 = f28663a) == null) {
                            return;
                        }
                        c3746t1.f28162b = null;
                        return;
                        tn.p.j("zk", "TAG");
                        e10.getMessage();
                    }
                    zBooleanValue = bool.booleanValue();
                    z10 = zBooleanValue;
                    if (z10) {
                        return;
                    } else {
                        return;
                    }
                } catch (Exception e11) {
                    tn.p.j("zk", "TAG");
                    e11.getMessage();
                    return;
                }
            } catch (NoClassDefFoundError unused) {
                return;
            }
            tn.p.j("zk", "TAG");
            e10.getMessage();
        }
    }

    public static final void d() {
        c();
    }
}
