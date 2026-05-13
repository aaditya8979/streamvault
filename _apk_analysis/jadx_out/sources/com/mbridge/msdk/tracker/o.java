package com.mbridge.msdk.tracker;

import android.util.Log;
import com.mbridge.msdk.tracker.network.b0;
import com.mbridge.msdk.tracker.network.t;
import com.mbridge.msdk.tracker.network.v;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: Network.java */
/* JADX INFO: loaded from: classes9.dex */
class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private r f41101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f41102b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p f41103c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final w f41104d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f41105e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.mbridge.msdk.tracker.network.u f41106f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Executor f41107g;

    /* JADX INFO: compiled from: Network.java */
    public class a implements ThreadFactory {
        public a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "MBridgeReportResponseThread");
        }
    }

    /* JADX INFO: compiled from: Network.java */
    public static final class b implements v.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final r f41109a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final t f41110b;

        public b(r rVar, t tVar) {
            this.f41109a = rVar;
            this.f41110b = tVar;
        }

        @Override // com.mbridge.msdk.tracker.network.v.a
        public void a(b0 b0Var) {
            int iD;
            int iG;
            String message;
            if (y.a(this.f41109a)) {
                if (b0Var != null) {
                    try {
                        iD = b0Var.d();
                        iG = b0Var.g();
                        message = b0Var.getMessage();
                    } catch (Exception e10) {
                        if (com.mbridge.msdk.tracker.a.f40902a) {
                            Log.e("TrackManager", "onErrorResponse error", e10);
                            return;
                        }
                        return;
                    }
                } else {
                    message = "";
                    iD = 0;
                    iG = 0;
                }
                this.f41109a.a(this.f41110b, 0, String.format("volleyError:%s,responseCode:%s,errorMessage:%s", Integer.valueOf(iD), Integer.valueOf(iG), message));
            }
        }
    }

    /* JADX INFO: compiled from: Network.java */
    public static final class c implements v.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final r f41111a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final t f41112b;

        public c(r rVar, t tVar) {
            this.f41111a = rVar;
            this.f41112b = tVar;
        }

        @Override // com.mbridge.msdk.tracker.network.v.b
        public void a(Object obj) {
            if (y.a(this.f41111a)) {
                try {
                    this.f41111a.a(this.f41112b);
                } catch (Exception e10) {
                    if (com.mbridge.msdk.tracker.a.f40902a) {
                        Log.e("TrackManager", "onResponse error", e10);
                    }
                }
            }
        }
    }

    public o(int i10, p pVar, w wVar, int i11) {
        this.f41102b = i10;
        this.f41103c = pVar;
        this.f41104d = wVar;
        this.f41105e = i11;
        this.f41107g = new ThreadPoolExecutor(i10, i10, 20L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new a(), new ThreadPoolExecutor.DiscardPolicy());
    }

    private v<Object> a(t tVar, Map<String, String> map, boolean z10) {
        v<Object> vVar = this.f41105e == 1 ? new v<>(this.f41103c.c(), 1, this.f41103c.a()) : new v<>(this.f41103c.c(), 1);
        vVar.a(map);
        vVar.a(false);
        vVar.c(true);
        vVar.b(true);
        vVar.a(this.f41104d);
        vVar.a(z10 ? t.a.HIGH : t.a.NORMAL);
        vVar.a((v.b<Object>) new c(this.f41101a, tVar));
        vVar.a((v.a) new b(this.f41101a, tVar));
        return vVar;
    }

    private void a() {
        if (y.a(this.f41106f)) {
            return;
        }
        com.mbridge.msdk.tracker.network.u uVarA = com.mbridge.msdk.tracker.network.toolbox.o.a(new com.mbridge.msdk.tracker.network.toolbox.b(this.f41103c.b()), new com.mbridge.msdk.tracker.network.f(this.f41107g), this.f41102b, null);
        this.f41106f = uVarA;
        uVarA.b();
    }

    public void a(r rVar) {
        this.f41101a = rVar;
    }

    public void b(t tVar, Map<String, String> map, boolean z10) {
        if (y.b(map)) {
            r rVar = this.f41101a;
            if (rVar != null) {
                try {
                    rVar.a(tVar, 0, "params is null");
                    return;
                } catch (Exception e10) {
                    if (com.mbridge.msdk.tracker.a.f40902a) {
                        Log.e("TrackManager", "send error", e10);
                        return;
                    }
                    return;
                }
            }
            return;
        }
        try {
            a();
            this.f41106f.a(a(tVar, map, z10));
        } catch (Exception e11) {
            if (com.mbridge.msdk.tracker.a.f40902a) {
                Log.e("TrackManager", "send error", e11);
            }
            if (y.a(this.f41101a)) {
                this.f41101a.a(tVar, 0, e11.getMessage());
            }
        }
    }
}
