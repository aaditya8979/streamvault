package yads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes5.dex */
public final class ag1 extends Handler implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f87684b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final bg1 f87685c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f87686d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public yf1 f87687e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public IOException f87688f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f87689g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Thread f87690h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f87691i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile boolean f87692j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ fg1 f87693k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ag1(fg1 fg1Var, Looper looper, bg1 bg1Var, yf1 yf1Var, int i10, long j10) {
        super(looper);
        this.f87693k = fg1Var;
        this.f87685c = bg1Var;
        this.f87687e = yf1Var;
        this.f87684b = i10;
        this.f87686d = j10;
    }

    public final void a(boolean z10) {
        this.f87692j = z10;
        this.f87688f = null;
        if (hasMessages(0)) {
            this.f87691i = true;
            removeMessages(0);
            if (!z10) {
                sendEmptyMessage(1);
            }
        } else {
            synchronized (this) {
                this.f87691i = true;
                this.f87685c.b();
                Thread thread = this.f87690h;
                if (thread != null) {
                    thread.interrupt();
                }
            }
        }
        if (z10) {
            this.f87693k.f89572b = null;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            yf1 yf1Var = this.f87687e;
            yf1Var.getClass();
            yf1Var.a(this.f87685c, jElapsedRealtime, jElapsedRealtime - this.f87686d, true);
            this.f87687e = null;
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.f87692j) {
            return;
        }
        int i10 = message.what;
        if (i10 == 0) {
            this.f87688f = null;
            fg1 fg1Var = this.f87693k;
            ExecutorService executorService = fg1Var.f89571a;
            ag1 ag1Var = fg1Var.f89572b;
            ag1Var.getClass();
            executorService.execute(ag1Var);
            return;
        }
        if (i10 == 3) {
            throw ((Error) message.obj);
        }
        this.f87693k.f89572b = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = jElapsedRealtime - this.f87686d;
        yf1 yf1Var = this.f87687e;
        yf1Var.getClass();
        if (this.f87691i) {
            yf1Var.a(this.f87685c, jElapsedRealtime, j10, false);
            return;
        }
        int i11 = message.what;
        if (i11 == 1) {
            try {
                yf1Var.a(this.f87685c, jElapsedRealtime, j10);
                return;
            } catch (RuntimeException e10) {
                ih1.b("LoadTask", ih1.a("Unexpected exception handling load completed", e10));
                this.f87693k.f89573c = new eg1(e10);
                return;
            }
        }
        if (i11 != 2) {
            return;
        }
        IOException iOException = (IOException) message.obj;
        this.f87688f = iOException;
        int i12 = this.f87689g + 1;
        this.f87689g = i12;
        zf1 zf1VarA = yf1Var.a(this.f87685c, jElapsedRealtime, j10, iOException, i12);
        int i13 = zf1VarA.f97559a;
        if (i13 == 3) {
            this.f87693k.f89573c = this.f87688f;
            return;
        }
        if (i13 != 2) {
            if (i13 == 1) {
                this.f87689g = 1;
            }
            long jMin = zf1VarA.f97560b;
            if (jMin == -9223372036854775807L) {
                jMin = Math.min((this.f87689g - 1) * 1000, 5000);
            }
            fg1 fg1Var2 = this.f87693k;
            if (fg1Var2.f89572b != null) {
                throw new IllegalStateException();
            }
            fg1Var2.f89572b = this;
            if (jMin > 0) {
                sendEmptyMessageDelayed(0, jMin);
            } else {
                this.f87688f = null;
                fg1Var2.f89571a.execute(this);
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        try {
            synchronized (this) {
                z10 = !this.f87691i;
                this.f87690h = Thread.currentThread();
            }
            if (z10) {
                d73.a("load:".concat(this.f87685c.getClass().getSimpleName()));
                try {
                    this.f87685c.a();
                    d73.a();
                } catch (Throwable th2) {
                    d73.a();
                    throw th2;
                }
            }
            synchronized (this) {
                this.f87690h = null;
                Thread.interrupted();
            }
            if (this.f87692j) {
                return;
            }
            sendEmptyMessage(1);
        } catch (IOException e10) {
            if (this.f87692j) {
                return;
            }
            obtainMessage(2, e10).sendToTarget();
        } catch (OutOfMemoryError e11) {
            if (this.f87692j) {
                return;
            }
            ih1.b("LoadTask", ih1.a("OutOfMemory error loading stream", e11));
            obtainMessage(2, new eg1(e11)).sendToTarget();
        } catch (Error e12) {
            if (!this.f87692j) {
                ih1.b("LoadTask", ih1.a("Unexpected error loading stream", e12));
                obtainMessage(3, e12).sendToTarget();
            }
            throw e12;
        } catch (Exception e13) {
            if (this.f87692j) {
                return;
            }
            ih1.b("LoadTask", ih1.a("Unexpected exception loading stream", e13));
            obtainMessage(2, new eg1(e13)).sendToTarget();
        }
    }
}
