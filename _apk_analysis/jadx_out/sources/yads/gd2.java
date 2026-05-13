package yads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;

/* JADX INFO: loaded from: classes2.dex */
public final class gd2 extends HandlerThread implements Handler.Callback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public rl0 f89947b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Handler f89948c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Error f89949d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public RuntimeException f89950e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public hd2 f89951f;

    public gd2() {
        super("ExoPlayer:PlaceholderSurface");
    }

    public final hd2 a(int i10) {
        boolean z10;
        start();
        Handler handler = new Handler(getLooper(), this);
        this.f89948c = handler;
        this.f89947b = new rl0(handler);
        synchronized (this) {
            z10 = false;
            this.f89948c.obtainMessage(1, i10, 0).sendToTarget();
            while (this.f89951f == null && this.f89950e == null && this.f89949d == null) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    z10 = true;
                }
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = this.f89950e;
        if (runtimeException != null) {
            throw runtimeException;
        }
        Error error = this.f89949d;
        if (error != null) {
            throw error;
        }
        hd2 hd2Var = this.f89951f;
        hd2Var.getClass();
        return hd2Var;
    }

    public final void b(int i10) {
        this.f89947b.getClass();
        this.f89947b.a(i10);
        this.f89951f = new hd2(this, this.f89947b.a(), i10 != 0);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        try {
            if (i10 != 1) {
                if (i10 != 2) {
                    return true;
                }
                try {
                    this.f89947b.getClass();
                    this.f89947b.b();
                } finally {
                    try {
                    } finally {
                    }
                }
                return true;
            }
            try {
                try {
                    b(message.arg1);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e10) {
                    ih1.b("PlaceholderSurface", ih1.a("Failed to initialize placeholder surface", e10));
                    this.f89949d = e10;
                    synchronized (this) {
                        notify();
                    }
                }
            } catch (RuntimeException e11) {
                ih1.b("PlaceholderSurface", ih1.a("Failed to initialize placeholder surface", e11));
                this.f89950e = e11;
                synchronized (this) {
                    notify();
                }
            }
            return true;
        } catch (Throwable th2) {
            synchronized (this) {
                notify();
                throw th2;
            }
        }
    }
}
