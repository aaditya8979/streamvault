package com.apm.insight.runtime;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: compiled from: ThreadWithHandler.java */
/* JADX INFO: loaded from: classes10.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HandlerThread f7559a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile Handler f7562d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Queue<c> f7560b = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Queue<Message> f7561c = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f7563e = new Object();

    /* JADX INFO: compiled from: ThreadWithHandler.java */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            while (!p.this.f7561c.isEmpty()) {
                if (p.this.f7562d != null) {
                    try {
                        p.this.f7562d.sendMessageAtFrontOfQueue((Message) p.this.f7561c.poll());
                    } catch (Throwable unused) {
                    }
                }
            }
            while (!p.this.f7560b.isEmpty()) {
                c cVar = (c) p.this.f7560b.poll();
                if (p.this.f7562d != null) {
                    try {
                        p.this.f7562d.sendMessageAtTime(cVar.f7568a, cVar.f7569b);
                    } catch (Throwable unused2) {
                    }
                }
            }
        }
    }

    /* JADX INFO: compiled from: ThreadWithHandler.java */
    public class b extends HandlerThread {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private volatile int f7565a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private volatile boolean f7566b;

        public b(String str) {
            super(str);
            this.f7565a = 0;
            this.f7566b = false;
        }

        @Override // android.os.HandlerThread
        public final void onLooperPrepared() {
            super.onLooperPrepared();
            synchronized (p.this.f7563e) {
                p.this.f7562d = new Handler();
            }
            p.this.f7562d.post(p.this.new a());
            while (true) {
                try {
                    Looper.loop();
                } catch (Throwable th2) {
                    try {
                        com.apm.insight.b.f.a(com.apm.insight.e.g()).a().c();
                        if (this.f7565a < 5) {
                            com.apm.insight.c.a();
                            j.a(th2, "NPTH_CATCH");
                        } else if (!this.f7566b) {
                            this.f7566b = true;
                            com.apm.insight.c.a();
                            j.a(new RuntimeException(), "NPTH_ERR_MAX");
                        }
                        this.f7565a++;
                    } catch (Throwable unused) {
                    }
                }
            }
        }
    }

    /* JADX INFO: compiled from: ThreadWithHandler.java */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Message f7568a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f7569b;

        public c(Message message, long j10) {
            this.f7568a = message;
            this.f7569b = j10;
        }
    }

    static {
        new Object() { // from class: com.apm.insight.runtime.p.1
        };
        new Object() { // from class: com.apm.insight.runtime.p.2
        };
    }

    public p(String str) {
        this.f7559a = new b(str);
    }

    private boolean a(Message message, long j10) {
        if (j10 < 0) {
            j10 = 0;
        }
        return b(message, SystemClock.uptimeMillis() + j10);
    }

    private Message b(Runnable runnable) {
        return Message.obtain(this.f7562d, runnable);
    }

    private boolean b(Message message, long j10) {
        if (this.f7562d == null) {
            synchronized (this.f7563e) {
                if (this.f7562d == null) {
                    this.f7560b.add(new c(message, j10));
                    return true;
                }
            }
        }
        try {
            return this.f7562d.sendMessageAtTime(message, j10);
        } catch (Throwable unused) {
            return true;
        }
    }

    @Nullable
    public final Handler a() {
        return this.f7562d;
    }

    public final boolean a(Runnable runnable) {
        return a(b(runnable), 0L);
    }

    public final boolean a(Runnable runnable, long j10) {
        return a(b(runnable), j10);
    }

    public final void b() {
        this.f7559a.start();
    }

    public final HandlerThread c() {
        return this.f7559a;
    }
}
