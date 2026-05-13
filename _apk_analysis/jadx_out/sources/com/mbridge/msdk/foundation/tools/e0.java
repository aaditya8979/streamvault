package com.mbridge.msdk.foundation.tools;

import com.mbridge.msdk.MBridgeConstans;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: LimitExecutor.java */
/* JADX INFO: loaded from: classes11.dex */
public class e0 implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Runnable f38088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Runnable f38089b;

    /* JADX INFO: compiled from: LimitExecutor.java */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Runnable f38090a;

        public a(Runnable runnable) {
            this.f38090a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f38090a.run();
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("LimitExecutor", e10.getMessage());
                }
            } finally {
                e0.this.a();
            }
        }
    }

    private Runnable a(Runnable runnable) {
        return new a(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a() {
        Runnable runnable = this.f38089b;
        this.f38088a = runnable;
        this.f38089b = null;
        if (runnable != null) {
            c0.a().execute(this.f38088a);
        }
    }

    @Override // java.util.concurrent.Executor
    public synchronized void execute(Runnable runnable) {
        if (this.f38088a == null) {
            this.f38088a = a(runnable);
            c0.a().execute(this.f38088a);
        } else if (this.f38089b == null) {
            this.f38089b = a(runnable);
        }
    }
}
