package com.mbridge.msdk.foundation.same.report.crashreport;

import android.annotation.TargetApi;
import android.os.Debug;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;

/* JADX INFO: compiled from: AnrMonitor.java */
/* JADX INFO: loaded from: classes6.dex */
public class c extends Thread {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static volatile c f37887e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f37888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile b f37889b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.mbridge.msdk.foundation.same.report.crashreport.a f37890c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f37891d;

    /* JADX INFO: compiled from: AnrMonitor.java */
    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f37892a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f37893b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f37894c;

        private b() {
            this.f37892a = SystemClock.uptimeMillis();
        }

        public boolean a() {
            return !this.f37893b || this.f37892a - this.f37894c >= ((long) c.this.f37891d);
        }

        public void b() {
            this.f37893b = false;
            this.f37894c = SystemClock.uptimeMillis();
            c.this.f37888a.postAtFrontOfQueue(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (c.this) {
                this.f37893b = true;
                this.f37892a = SystemClock.uptimeMillis();
            }
        }
    }

    private c() {
        super("AnrMonitor-Thread");
        this.f37888a = new Handler(Looper.getMainLooper());
        this.f37891d = 5000;
    }

    public static c a() {
        if (f37887e == null) {
            synchronized (c.class) {
                if (f37887e == null) {
                    f37887e = new c();
                }
            }
        }
        return f37887e;
    }

    public c a(int i10, com.mbridge.msdk.foundation.same.report.crashreport.a aVar) {
        this.f37891d = i10;
        this.f37890c = aVar;
        return this;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    @TargetApi(16)
    public void run() {
        Process.setThreadPriority(10);
        while (true) {
            if (isInterrupted() || !(this.f37889b == null || this.f37889b.f37893b)) {
                try {
                    Thread.sleep(this.f37891d);
                } catch (Exception unused) {
                }
            } else {
                synchronized (this) {
                    if (this.f37889b == null) {
                        this.f37889b = new b();
                    }
                    this.f37889b.b();
                    long jUptimeMillis = this.f37891d;
                    long jUptimeMillis2 = SystemClock.uptimeMillis();
                    while (jUptimeMillis > 0) {
                        try {
                            wait(jUptimeMillis);
                        } catch (InterruptedException e10) {
                            Log.w("AnrMonitor", e10.toString());
                        }
                        jUptimeMillis = ((long) this.f37891d) - (SystemClock.uptimeMillis() - jUptimeMillis2);
                    }
                    if (!this.f37889b.a()) {
                        com.mbridge.msdk.foundation.same.report.crashreport.a aVar = this.f37890c;
                        if (aVar != null) {
                            aVar.a();
                        }
                    } else if (!Debug.isDebuggerConnected() && !Debug.waitingForDebugger() && this.f37890c != null) {
                        StackTraceElement[] stackTrace = Looper.getMainLooper().getThread().getStackTrace();
                        this.f37890c.a(d.b(stackTrace), stackTrace);
                    }
                }
            }
        }
    }
}
