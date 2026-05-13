package com.fyber.inneractive.sdk.network;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Looper;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class l0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final h0 f16994g = new h0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PriorityBlockingQueue f16995a = new PriorityBlockingQueue(100, new k0());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile boolean f16996b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f16997c = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ThreadPoolExecutor f16998d = new ThreadPoolExecutor(6, 6, 1000, TimeUnit.SECONDS, new LinkedBlockingQueue(100), f16994g);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i0 f16999e = new i0(this);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final j1 f17000f = new j1();

    public static void a() throws b {
        NetworkInfo activeNetworkInfo;
        Boolean boolC = ((com.fyber.inneractive.sdk.config.global.features.k) IAConfigManager.O.M.a(com.fyber.inneractive.sdk.config.global.features.k.class)).c("should_use_is_network_connected");
        boolean z10 = false;
        if (boolC != null ? boolC.booleanValue() : false) {
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) com.fyber.inneractive.sdk.util.o.f19548a.getSystemService("connectivity");
                activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
            } catch (Throwable unused) {
                IAlog.b("Error retrieved when trying to get the network state - Perhaps you forgot to declare android.permission.ACCESS_NETWORK_STATE in your Android manifest file.", new Object[0]);
            }
            if (com.fyber.inneractive.sdk.util.o.a("android.permission.ACCESS_NETWORK_STATE") && activeNetworkInfo != null) {
                if (activeNetworkInfo.isConnectedOrConnecting()) {
                    z10 = true;
                }
            }
            if (!z10) {
                throw new b("No network connection");
            }
        }
    }

    public static void a(t0 t0Var, l lVar, o0 o0Var) {
        try {
            if (t0Var.f17034a || t0Var.h() == null || o0Var == null || lVar == null || lVar.f16988a != 200) {
                return;
            }
            t0Var.a(o0Var, t0Var.h(), lVar.f16992e);
        } catch (Exception e10) {
            IAlog.a("Failed cache network response data for url: %s msg: %s", t0Var.r(), e10.getMessage());
        }
    }

    public static void a(t0 t0Var, o0 o0Var) {
        try {
            if (t0Var.f17034a || o0Var == null) {
                return;
            }
            t0Var.a(o0Var.f17012a, (Exception) null, false);
        } catch (Exception e10) {
            IAlog.a("failed notifying the listener request complete for url: %s msg: %s", t0Var.r(), e10.getMessage());
            if (t0Var.f17034a) {
                return;
            }
            t0Var.a((Object) null, e10, false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.fyber.inneractive.sdk.network.l a(com.fyber.inneractive.sdk.network.t0 r7, com.fyber.inneractive.sdk.network.a r8) throws java.lang.Exception {
        /*
            r6 = this;
            java.lang.String r0 = "failed sending network request for url: %s msg: %s"
            r1 = 1
            r2 = 0
            r3 = 2
            boolean r4 = r7.f17034a     // Catch: java.lang.Exception -> L1a java.net.SocketTimeoutException -> L2d com.fyber.inneractive.sdk.network.b -> L2f java.net.UnknownHostException -> L31 com.fyber.inneractive.sdk.network.t1 -> L55
            if (r4 != 0) goto L18
            if (r8 == 0) goto Le
            java.lang.String r8 = r8.f16941a     // Catch: java.lang.Exception -> L1a java.net.SocketTimeoutException -> L2d com.fyber.inneractive.sdk.network.b -> L2f java.net.UnknownHostException -> L31 com.fyber.inneractive.sdk.network.t1 -> L55
            goto L10
        Le:
            java.lang.String r8 = ""
        L10:
            a()     // Catch: java.lang.Exception -> L1a java.net.SocketTimeoutException -> L2d com.fyber.inneractive.sdk.network.b -> L2f java.net.UnknownHostException -> L31 com.fyber.inneractive.sdk.network.t1 -> L55
            com.fyber.inneractive.sdk.network.l r7 = r7.a(r8)     // Catch: java.lang.Exception -> L1a java.net.SocketTimeoutException -> L2d com.fyber.inneractive.sdk.network.b -> L2f java.net.UnknownHostException -> L31 com.fyber.inneractive.sdk.network.t1 -> L55
            goto L19
        L18:
            r7 = 0
        L19:
            return r7
        L1a:
            r8 = move-exception
            java.lang.String r7 = r7.r()
            java.lang.String r4 = r8.getMessage()
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r2] = r7
            r3[r1] = r4
            com.fyber.inneractive.sdk.util.IAlog.a(r0, r3)
            throw r8
        L2d:
            r8 = move-exception
            goto L32
        L2f:
            r8 = move-exception
            goto L32
        L31:
            r8 = move-exception
        L32:
            java.lang.String r4 = r7.r()
            java.lang.String r5 = r8.getMessage()
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r2] = r4
            r3[r1] = r5
            com.fyber.inneractive.sdk.util.IAlog.a(r0, r3)
            boolean r7 = r6.c(r7)
            if (r7 == 0) goto L4f
            com.fyber.inneractive.sdk.network.t1 r7 = new com.fyber.inneractive.sdk.network.t1
            r7.<init>(r8)
            throw r7
        L4f:
            com.fyber.inneractive.sdk.network.s1 r7 = new com.fyber.inneractive.sdk.network.s1
            r7.<init>(r8)
            throw r7
        L55:
            r8 = move-exception
            java.lang.String r0 = r7.r()
            java.lang.String r4 = r8.getMessage()
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r2] = r0
            r3[r1] = r4
            java.lang.String r0 = "failed sending network request but will retry url: %s msg: %s"
            com.fyber.inneractive.sdk.util.IAlog.a(r0, r3)
            boolean r7 = r6.c(r7)
            if (r7 == 0) goto L70
            throw r8
        L70:
            com.fyber.inneractive.sdk.network.s1 r7 = new com.fyber.inneractive.sdk.network.s1
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.network.l0.a(com.fyber.inneractive.sdk.network.t0, com.fyber.inneractive.sdk.network.a):com.fyber.inneractive.sdk.network.l");
    }

    public final o0 a(t0 t0Var, l lVar) throws Exception {
        o0 o0VarA = null;
        if (lVar != null) {
            try {
                if (!t0Var.f17034a) {
                    int i10 = lVar.f16988a;
                    if (i10 == 200 || (i10 >= 300 && i10 < 304)) {
                        o0VarA = t0Var.a(lVar, lVar.f16991d, i10);
                    } else if (i10 == 304) {
                        t0Var.a((Object) null, (Exception) new g(), false);
                    } else {
                        t0Var.a((Object) null, (Exception) new k1(lVar.f16989b, lVar.f16988a), false);
                    }
                }
            } catch (t1 e10) {
                IAlog.a("failed parsing network request but will retry url: %s msg: %s", t0Var.r(), e10.getMessage());
                if (c(t0Var)) {
                    throw e10;
                }
                throw new s1(e10);
            } catch (Exception e11) {
                IAlog.a("failed parsing network request url: %s msg: %s", t0Var.r(), e11.getMessage());
                throw e11;
            }
        }
        return o0VarA;
    }

    public final void a(t0 t0Var) {
        p0 p0Var;
        if (!this.f16995a.offer(t0Var)) {
            IAlog.a("Request queue is full! current request is dropped! %s", t0Var.r());
            return;
        }
        i1 i1Var = i1.QUEUED;
        t0Var.f17039f = i1Var;
        if (i1Var != i1.QUEUED_FOR_RETRY || (p0Var = t0Var.f17037d) == null) {
            return;
        }
        p0Var.a("sdkRequestEndedButWillBeRetried");
    }

    public final void b(t0 t0Var) {
        j1 j1Var = this.f17000f;
        j1Var.getClass();
        String str = t0Var.f17040g;
        IAlog.a("%s : NetworkRequestWatchdog : finalize request: %s", IAlog.a(j1Var), str);
        n1 n1Var = (n1) j1Var.f16986a.get(str);
        if (n1Var != null) {
            com.fyber.inneractive.sdk.util.r.f19556b.removeCallbacks(n1Var.f17011d);
        }
        j1Var.f16986a.remove(str);
    }

    public final boolean c(t0 t0Var) {
        if (!t0Var.u()) {
            return false;
        }
        t0Var.f17039f = i1.QUEUED_FOR_RETRY;
        p0 p0Var = t0Var.f17037d;
        if (p0Var != null) {
            p0Var.a("sdkRequestEndedButWillBeRetried");
        }
        long jG = t0Var.g();
        IAlog.e("retryNetworkRequest queue up in main thread - %s with delay of %d", t0Var.getClass().getName(), Long.valueOf(jG));
        this.f16997c.postDelayed(new j0(this, t0Var), jG);
        return true;
    }
}
