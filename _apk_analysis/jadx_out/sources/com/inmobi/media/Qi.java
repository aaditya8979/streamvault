package com.inmobi.media;

import android.content.Context;
import android.os.Process;
import com.inmobi.media.Qi;
import com.inmobi.media.core.config.models.SignalsConfig;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import com.vungle.ads.internal.signals.SignalManager;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes9.dex */
public final class Qi {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static String f26191d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static boolean f26192e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static long f26193f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Ea f26196i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final I1 f26197j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final I1 f26198k;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f26189b = {tn.t.i(new PropertyReference1Impl(Qi.class, "sessionCnt", "getSessionCnt()I", 0)), tn.t.i(new PropertyReference1Impl(Qi.class, "userRetention", "getUserRetention()I", 0))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Qi f26188a = new Qi();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f26190c = Qi.class.getSimpleName();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final List f26194g = cn.w.s(0, 0, 0, 0);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final AtomicBoolean f26195h = new AtomicBoolean(false);

    static {
        Ea eaA;
        Context context = Ji.f25747a;
        if (context != null) {
            ConcurrentHashMap concurrentHashMap = Ea.f25372b;
            eaA = Da.a(context, "session_pref_file");
        } else {
            eaA = null;
        }
        f26196i = eaA;
        int i10 = 12;
        f26197j = new I1(-1, new sn.a() { // from class: n9.c4
            @Override // sn.a
            public final Object invoke() {
                return Integer.valueOf(Qi.a());
            }
        }, i10);
        f26198k = new I1(-1, new sn.a() { // from class: n9.d4
            @Override // sn.a
            public final Object invoke() {
                return Integer.valueOf(Qi.b());
            }
        }, i10);
    }

    public static final int a() {
        f26188a.getClass();
        Ea ea2 = f26196i;
        if (ea2 == null) {
            return 0;
        }
        tn.p.k(ImpressionLog.M, "key");
        return ea2.f25373a.getInt(ImpressionLog.M, 0);
    }

    public static void a(String str, Boolean bool) {
        tn.p.k(str, "adtype");
        if (tn.p.f(str, "banner") && a(1)) {
            List list = f26194g;
            list.set(0, Integer.valueOf(Integer.min(((Number) list.get(0)).intValue() + 1, Integer.MAX_VALUE)));
        }
        if (tn.p.f(str, ImpressionLog.f51753w) && !tn.p.f(bool, Boolean.TRUE) && a(2)) {
            List list2 = f26194g;
            list2.set(1, Integer.valueOf(Integer.min(((Number) list2.get(1)).intValue() + 1, Integer.MAX_VALUE)));
        }
        if (tn.p.f(str, "native") && a(4)) {
            List list3 = f26194g;
            list3.set(3, Integer.valueOf(Integer.min(((Number) list3.get(3)).intValue() + 1, Integer.MAX_VALUE)));
        }
        if (tn.p.f(bool, Boolean.TRUE) && a(3)) {
            List list4 = f26194g;
            list4.set(2, Integer.valueOf(Integer.min(((Number) list4.get(2)).intValue() + 1, Integer.MAX_VALUE)));
        }
    }

    public static boolean a(int i10) {
        C3476i4 c3476i4 = Y3.f26611a;
        tn.p.k(SignalsConfig.class, "clazz");
        return ((SignalsConfig) Y3.f26611a.a(SignalsConfig.class)).getSessionConfig().getSigControlList().contains(Integer.valueOf(i10));
    }

    public static final int b() {
        f26188a.getClass();
        Ea ea2 = f26196i;
        if (ea2 == null) {
            return 0;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        tn.p.k("u-ret", "key");
        return Integer.min((int) ((jCurrentTimeMillis - ea2.f25373a.getLong("u-ret", jCurrentTimeMillis)) / SignalManager.TWENTY_FOUR_HOURS_MILLIS), Integer.MAX_VALUE);
    }

    public static void c() {
        if (f26195h.getAndSet(true)) {
            return;
        }
        if (Yi.a().isSessionEnabled()) {
            String string = UUID.randomUUID().toString();
            tn.p.j(string, "toString(...)");
            f26191d = string;
            tn.p.j(f26190c, "TAG");
        }
        f26193f = System.currentTimeMillis() - Process.getElapsedCpuTime();
        if (a(5)) {
            Ea ea2 = f26196i;
            if (ea2 != null) {
                tn.p.k(ImpressionLog.M, "key");
                ea2.a(ImpressionLog.M, Integer.min(ea2.f25373a.getInt(ImpressionLog.M, 0) + 1, Integer.MAX_VALUE), false);
            }
            f26197j.a();
        }
        if (a(6)) {
            Ea ea3 = f26196i;
            if (ea3 != null) {
                tn.p.k("u-ret", "key");
                if (!ea3.f25373a.contains("u-ret")) {
                    ea3.a("u-ret", System.currentTimeMillis(), false);
                }
            }
            f26198k.a();
        }
    }
}
