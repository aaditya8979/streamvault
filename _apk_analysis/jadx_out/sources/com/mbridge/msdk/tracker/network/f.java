package com.mbridge.msdk.tracker.network;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: ExecutorDelivery.java */
/* JADX INFO: loaded from: classes8.dex */
public class f implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f40976a;

    /* JADX INFO: compiled from: ExecutorDelivery.java */
    public class a implements Executor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Handler f40977a;

        public a(Handler handler) {
            this.f40977a = handler;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f40977a.post(runnable);
        }
    }

    /* JADX INFO: compiled from: ExecutorDelivery.java */
    public static class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final t f40979a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final v f40980b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Runnable f40981c;

        public b(t tVar, v vVar, Runnable runnable) {
            this.f40979a = tVar;
            this.f40980b = vVar;
            this.f40981c = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f40979a.v()) {
                this.f40979a.c("canceled-at-delivery");
                return;
            }
            if (this.f40980b.a()) {
                this.f40979a.a(this.f40980b.f41097a);
            } else {
                this.f40979a.b(this.f40980b.f41099c);
            }
            if (this.f40980b.f41100d) {
                this.f40979a.a("intermediate-response");
            } else {
                this.f40979a.c("done");
            }
            Runnable runnable = this.f40981c;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public f(Handler handler) {
        this.f40976a = new a(handler);
    }

    public f(Executor executor) {
        this.f40976a = executor;
    }

    @Override // com.mbridge.msdk.tracker.network.w
    public void a(t<?> tVar, b0 b0Var) {
        tVar.a("post-error");
        this.f40976a.execute(new b(tVar, v.a(b0Var), null));
    }

    @Override // com.mbridge.msdk.tracker.network.w
    public void a(t<?> tVar, v<?> vVar) {
        a(tVar, vVar, null);
    }

    public void a(t<?> tVar, v<?> vVar, Runnable runnable) {
        tVar.w();
        tVar.a("post-response");
        this.f40976a.execute(new b(tVar, vVar, runnable));
    }
}
