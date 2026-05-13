package am;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Message;
import java.util.concurrent.TimeUnit;
import xl.s;

/* JADX INFO: compiled from: HandlerScheduler.java */
/* JADX INFO: loaded from: classes12.dex */
public final class b extends s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f4001b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f4002c;

    /* JADX INFO: compiled from: HandlerScheduler.java */
    public static final class a extends s.c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Handler f4003b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f4004c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public volatile boolean f4005d;

        public a(Handler handler, boolean z10) {
            this.f4003b = handler;
            this.f4004c = z10;
        }

        @Override // xl.s.c
        @SuppressLint({"NewApi"})
        public bm.b c(Runnable runnable, long j10, TimeUnit timeUnit) {
            if (runnable == null) {
                throw new NullPointerException("run == null");
            }
            if (timeUnit == null) {
                throw new NullPointerException("unit == null");
            }
            if (this.f4005d) {
                return io.reactivex.disposables.a.a();
            }
            RunnableC0005b runnableC0005b = new RunnableC0005b(this.f4003b, tm.a.u(runnable));
            Message messageObtain = Message.obtain(this.f4003b, runnableC0005b);
            messageObtain.obj = this;
            if (this.f4004c) {
                messageObtain.setAsynchronous(true);
            }
            this.f4003b.sendMessageDelayed(messageObtain, timeUnit.toMillis(j10));
            if (!this.f4005d) {
                return runnableC0005b;
            }
            this.f4003b.removeCallbacks(runnableC0005b);
            return io.reactivex.disposables.a.a();
        }

        @Override // bm.b
        public void dispose() {
            this.f4005d = true;
            this.f4003b.removeCallbacksAndMessages(this);
        }

        @Override // bm.b
        public boolean isDisposed() {
            return this.f4005d;
        }
    }

    /* JADX INFO: renamed from: am.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: HandlerScheduler.java */
    public static final class RunnableC0005b implements Runnable, bm.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Handler f4006b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Runnable f4007c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public volatile boolean f4008d;

        public RunnableC0005b(Handler handler, Runnable runnable) {
            this.f4006b = handler;
            this.f4007c = runnable;
        }

        @Override // bm.b
        public void dispose() {
            this.f4006b.removeCallbacks(this);
            this.f4008d = true;
        }

        @Override // bm.b
        public boolean isDisposed() {
            return this.f4008d;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f4007c.run();
            } catch (Throwable th2) {
                tm.a.s(th2);
            }
        }
    }

    public b(Handler handler, boolean z10) {
        this.f4001b = handler;
        this.f4002c = z10;
    }

    @Override // xl.s
    public s.c a() {
        return new a(this.f4001b, this.f4002c);
    }

    @Override // xl.s
    public bm.b d(Runnable runnable, long j10, TimeUnit timeUnit) {
        if (runnable == null) {
            throw new NullPointerException("run == null");
        }
        if (timeUnit == null) {
            throw new NullPointerException("unit == null");
        }
        RunnableC0005b runnableC0005b = new RunnableC0005b(this.f4001b, tm.a.u(runnable));
        this.f4001b.postDelayed(runnableC0005b, timeUnit.toMillis(j10));
        return runnableC0005b;
    }
}
