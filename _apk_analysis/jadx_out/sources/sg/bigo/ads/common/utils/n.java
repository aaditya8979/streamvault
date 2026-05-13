package sg.bigo.ads.common.utils;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes11.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f82496a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f82498d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f82499e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f82500f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f82501g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f82502h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f82503i = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SuppressLint({"HandlerLeak"})
    private final Handler f82497b = new Handler() { // from class: sg.bigo.ads.common.utils.n.1
        /* JADX WARN: Removed duplicated region for block: B:17:0x0039 A[Catch: all -> 0x005d, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0009, B:9:0x000e, B:11:0x001c, B:22:0x0059, B:12:0x0024, B:14:0x002c, B:16:0x0032, B:20:0x003f, B:21:0x0045, B:17:0x0039, B:24:0x005b), top: B:29:0x0003 }] */
        @Override // android.os.Handler
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void handleMessage(android.os.Message r13) {
            /*
                r12 = this;
                sg.bigo.ads.common.utils.n r13 = sg.bigo.ads.common.utils.n.this
                monitor-enter(r13)
                sg.bigo.ads.common.utils.n r0 = sg.bigo.ads.common.utils.n.this     // Catch: java.lang.Throwable -> L5d
                boolean r1 = r0.f82502h     // Catch: java.lang.Throwable -> L5d
                if (r1 != 0) goto L5b
                boolean r1 = r0.f82503i     // Catch: java.lang.Throwable -> L5d
                if (r1 == 0) goto Le
                goto L5b
            Le:
                long r0 = r0.f82499e     // Catch: java.lang.Throwable -> L5d
                long r2 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L5d
                long r0 = r0 - r2
                r2 = 0
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                r5 = 1
                if (r4 > 0) goto L24
                sg.bigo.ads.common.utils.n r0 = sg.bigo.ads.common.utils.n.this     // Catch: java.lang.Throwable -> L5d
                r0.f82503i = r5     // Catch: java.lang.Throwable -> L5d
                r0.a()     // Catch: java.lang.Throwable -> L5d
                goto L59
            L24:
                sg.bigo.ads.common.utils.n r4 = sg.bigo.ads.common.utils.n.this     // Catch: java.lang.Throwable -> L5d
                long r6 = r4.f82500f     // Catch: java.lang.Throwable -> L5d
                int r8 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
                if (r8 <= 0) goto L39
                long r8 = r4.f82501g     // Catch: java.lang.Throwable -> L5d
                int r10 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
                if (r10 <= 0) goto L39
                long r10 = r4.f82498d     // Catch: java.lang.Throwable -> L5d
                long r8 = r8 - r6
                long r10 = r10 - r8
                r4.f82501g = r2     // Catch: java.lang.Throwable -> L5d
                goto L3b
            L39:
                long r10 = r4.f82498d     // Catch: java.lang.Throwable -> L5d
            L3b:
                int r4 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
                if (r4 >= 0) goto L45
                sg.bigo.ads.common.utils.n r4 = sg.bigo.ads.common.utils.n.this     // Catch: java.lang.Throwable -> L5d
                long r6 = r4.f82498d     // Catch: java.lang.Throwable -> L5d
                long r10 = r10 + r6
                goto L3b
            L45:
                sg.bigo.ads.common.utils.n r2 = sg.bigo.ads.common.utils.n.this     // Catch: java.lang.Throwable -> L5d
                r2.a(r0)     // Catch: java.lang.Throwable -> L5d
                sg.bigo.ads.common.utils.n r0 = sg.bigo.ads.common.utils.n.this     // Catch: java.lang.Throwable -> L5d
                long r1 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L5d
                r0.f82500f = r1     // Catch: java.lang.Throwable -> L5d
                android.os.Message r0 = r12.obtainMessage(r5)     // Catch: java.lang.Throwable -> L5d
                r12.sendMessageDelayed(r0, r10)     // Catch: java.lang.Throwable -> L5d
            L59:
                monitor-exit(r13)     // Catch: java.lang.Throwable -> L5d
                return
            L5b:
                monitor-exit(r13)     // Catch: java.lang.Throwable -> L5d
                return
            L5d:
                r0 = move-exception
                monitor-exit(r13)     // Catch: java.lang.Throwable -> L5d
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.common.utils.n.AnonymousClass1.handleMessage(android.os.Message):void");
        }
    };

    public n(long j10, long j11) {
        this.f82498d = j11;
        this.f82496a = j10;
    }

    public abstract void a();

    public abstract void a(long j10);

    public final synchronized void b() {
        this.f82502h = true;
        this.f82497b.removeMessages(1);
    }

    public final synchronized n c() {
        this.f82502h = false;
        if (this.f82496a <= 0) {
            if (!this.f82503i) {
                this.f82503i = true;
                a();
            }
            return this;
        }
        this.f82499e = SystemClock.elapsedRealtime() + this.f82496a;
        Handler handler = this.f82497b;
        handler.sendMessage(handler.obtainMessage(1));
        return this;
    }

    public final void d() {
        if (this.f82503i || this.f82502h) {
            return;
        }
        b();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.f82501g = jElapsedRealtime;
        this.f82496a = this.f82499e - jElapsedRealtime;
    }

    public final boolean e() {
        return !this.f82503i && this.f82502h;
    }
}
