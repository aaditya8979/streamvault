package com.inmobi.media;

import android.content.Context;
import android.os.HandlerThread;
import android.os.Looper;
import com.inmobi.media.C3823w3;
import com.inmobi.media.I2;
import com.inmobi.media.core.config.models.AdConfig;
import com.inmobi.media.core.config.models.RootConfig;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.inmobi.media.w3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3823w3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3823w3 f28406a = new C3823w3();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final bn.g f28407b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static p000do.l0 f28408c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static HandlerC3425g3 f28409d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static HandlerThread f28410e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static List f28411f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final AtomicBoolean f28412g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final AtomicBoolean f28413h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Object f28414i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final LinkedHashMap f28415j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final sn.l f28416k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final C3748t3 f28417l;

    static {
        String simpleName = C3823w3.class.getSimpleName();
        f28407b = kotlin.b.b(new sn.a() { // from class: n9.rb
            @Override // sn.a
            public final Object invoke() {
                return C3823w3.b();
            }
        });
        f28411f = new ArrayList();
        f28412g = new AtomicBoolean(false);
        f28413h = new AtomicBoolean(true);
        f28414i = new Object();
        f28415j = new LinkedHashMap();
        f28416k = new sn.l() { // from class: n9.sb
            @Override // sn.l
            public final Object invoke(Object obj) {
                return C3823w3.a((I2) obj);
            }
        };
        tn.p.j(simpleName, "TAG");
        Runnable runnable = new Runnable() { // from class: n9.tb
            @Override // java.lang.Runnable
            public final void run() {
                C3823w3.a();
            }
        };
        Context context = Ji.f25747a;
        tn.p.k(runnable, "runnable");
        Ji.f25753g.submit(runnable);
        f28417l = new C3748t3();
    }

    public static final bn.r a(I2 i22) {
        tn.p.k(i22, "event");
        int i10 = i22.f25635a;
        if (i10 == 1 || i10 == 2) {
            tn.p.j("w3", "TAG");
            f28413h.set(false);
        } else if (i10 != 10) {
            if (i10 != 11) {
                tn.p.j("w3", "TAG");
            } else if (!Boolean.parseBoolean(i22.f25636b)) {
                f();
            }
        } else if (tn.p.f("available", i22.f25636b)) {
            f();
        }
        return bn.r.f5635a;
    }

    public static final HashMap a(S2 s22) {
        HashMap map = new HashMap();
        try {
            int maxRetries = (c().getMaxRetries() - s22.f26279f) + 1;
            if (maxRetries > 0) {
                map.put("X-im-retry-count", String.valueOf(maxRetries));
                return map;
            }
        } catch (Exception unused) {
            tn.p.j("w3", "TAG");
        }
        return map;
    }

    public static final void a() {
        d();
    }

    public static void a(S2 s22, String str) {
        tn.p.k(s22, "click");
        tn.p.k(str, "error");
        LinkedHashMap linkedHashMap = f28415j;
        C3267a0 c3267a0 = (C3267a0) linkedHashMap.get(Integer.valueOf(s22.f26274a));
        if (c3267a0 != null) {
            tn.p.k(s22, "click");
            tn.p.k(str, "error");
            C3442gk c3442gk = c3267a0.f26729b;
            tn.p.k(str, "reason");
            LinkedHashMap linkedHashMapA = c3442gk.a();
            linkedHashMapA.put("networkType", C3850x5.m());
            linkedHashMapA.put(IronSourceConstants.EVENTS_ERROR_CODE, (short) 2178);
            linkedHashMapA.put("reason", str);
            String str2 = c3442gk.f27250d;
            if (str2 == null) {
                str2 = "";
            }
            linkedHashMapA.put("impressionId", str2);
            Wj wj2 = Wj.f26549a;
            Wj.b("AdImpressionSuccessful", linkedHashMapA, EnumC3287ak.f26805a);
        }
        linkedHashMap.remove(Integer.valueOf(s22.f26274a));
    }

    public static void a(String str, boolean z10, InterfaceC3580m9 interfaceC3580m9) {
        tn.p.k(str, "url");
        tn.p.j("w3", "TAG");
        Dg.a(Ag.f25163b, new C3574m3(str, z10, interfaceC3580m9, null));
    }

    public static final W2 b() {
        return new W2(AbstractC3456h9.b());
    }

    public static final void b(S2 s22) throws InterruptedException {
        int i10 = s22.f26279f;
        if (i10 > 0) {
            s22.f26279f = i10 - 1;
            s22.f26280g = System.currentTimeMillis();
            p000do.h.b(null, new C3798v3(s22, null), 1, null);
        }
    }

    public static AdConfig.ImaiConfig c() {
        C3476i4 c3476i4 = Y3.f26611a;
        tn.p.k(AdConfig.class, "clazz");
        return ((AdConfig) Y3.f26611a.a(AdConfig.class)).getImaiConfig();
    }

    public static void d() {
        try {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
            tn.p.j("w3", "TAG");
            tn.p.k("w3", "name");
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 5, 5L, timeUnit, linkedBlockingQueue, new B9("w3", false));
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            f28408c = kotlinx.coroutines.d.a(p000do.l1.c(threadPoolExecutor).plus(p000do.j2.b(null, 1, null)));
            HandlerThread handlerThread = new HandlerThread("pingHandlerThread");
            f28410e = handlerThread;
            H6.a(handlerThread, "pingHandlerThread");
            HandlerThread handlerThread2 = f28410e;
            tn.p.h(handlerThread2);
            Looper looper = handlerThread2.getLooper();
            tn.p.j(looper, "getLooper(...)");
            f28409d = new HandlerC3425g3(looper);
            ((C3857xc) Ji.f25751e.getValue()).a(new int[]{10, 11, 2, 1}, f28416k);
        } catch (Exception e10) {
            tn.p.j("w3", "TAG");
            e10.getMessage();
        }
    }

    public static boolean e() {
        C3476i4 c3476i4 = Y3.f26611a;
        tn.p.k(RootConfig.class, "clazz");
        return !((RootConfig) Y3.f26611a.a(RootConfig.class)).isMonetizationDisabled();
    }

    public static void f() {
        HandlerThread handlerThread;
        try {
            if (Re.a() != null) {
                return;
            }
            synchronized (f28414i) {
                if (f28412g.compareAndSet(false, true)) {
                    tn.p.j("w3", "TAG");
                    if (f28410e == null) {
                        HandlerThread handlerThread2 = new HandlerThread("pingHandlerThread");
                        f28410e = handlerThread2;
                        H6.a(handlerThread2, "pingHandlerThread");
                    }
                    if (f28409d == null && (handlerThread = f28410e) != null) {
                        Looper looper = handlerThread.getLooper();
                        tn.p.j(looper, "getLooper(...)");
                        f28409d = new HandlerC3425g3(looper);
                    }
                    p000do.h.b(null, new C3773u3(null), 1, null);
                }
                bn.r rVar = bn.r.f5635a;
            }
        } catch (Exception e10) {
            tn.p.j("w3", "TAG");
            e10.getMessage();
        }
    }

    public static void g() {
        try {
            AtomicBoolean atomicBoolean = f28412g;
            atomicBoolean.set(false);
            synchronized (f28414i) {
                if (!atomicBoolean.get()) {
                    HandlerThread handlerThread = f28410e;
                    if (handlerThread != null) {
                        handlerThread.getLooper().quit();
                        handlerThread.interrupt();
                    }
                    f28410e = null;
                    f28409d = null;
                }
                bn.r rVar = bn.r.f5635a;
            }
        } catch (Exception e10) {
            tn.p.j("w3", "TAG");
            e10.getMessage();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.inmobi.media.S2 r18, com.inmobi.media.C3267a0 r19, com.inmobi.media.InterfaceC3580m9 r20, kotlin.coroutines.jvm.internal.ContinuationImpl r21) {
        /*
            Method dump skipped, instruction units count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3823w3.a(com.inmobi.media.S2, com.inmobi.media.a0, com.inmobi.media.m9, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
