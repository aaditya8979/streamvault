package com.google.android.exoplayer2.video;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.util.GlUtil;
import s7.q;

/* JADX INFO: loaded from: classes12.dex */
@RequiresApi(17)
public final class PlaceholderSurface extends Surface {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f22936e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f22937f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f22938b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f22939c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f22940d;

    public static class b extends HandlerThread implements Handler.Callback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public com.google.android.exoplayer2.util.a f22941b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Handler f22942c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public Error f22943d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public RuntimeException f22944e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        public PlaceholderSurface f22945f;

        public b() {
            super("ExoPlayer:PlaceholderSurface");
        }

        public PlaceholderSurface a(int i10) {
            boolean z10;
            start();
            this.f22942c = new Handler(getLooper(), this);
            this.f22941b = new com.google.android.exoplayer2.util.a(this.f22942c);
            synchronized (this) {
                z10 = false;
                this.f22942c.obtainMessage(1, i10, 0).sendToTarget();
                while (this.f22945f == null && this.f22944e == null && this.f22943d == null) {
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
            RuntimeException runtimeException = this.f22944e;
            if (runtimeException != null) {
                throw runtimeException;
            }
            Error error = this.f22943d;
            if (error == null) {
                return (PlaceholderSurface) s7.a.e(this.f22945f);
            }
            throw error;
        }

        public final void b(int i10) throws GlUtil.GlException {
            s7.a.e(this.f22941b);
            this.f22941b.i(i10);
            this.f22945f = new PlaceholderSurface(this, this.f22941b.h(), i10 != 0);
        }

        public void c() {
            s7.a.e(this.f22942c);
            this.f22942c.sendEmptyMessage(2);
        }

        public final void d() {
            s7.a.e(this.f22941b);
            this.f22941b.j();
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            try {
                if (i10 != 1) {
                    if (i10 != 2) {
                        return true;
                    }
                    try {
                        d();
                    } finally {
                        try {
                        } finally {
                        }
                    }
                    return true;
                }
                try {
                    b(message.arg1);
                    synchronized (this) {
                        notify();
                    }
                } catch (GlUtil.GlException e10) {
                    q.d("PlaceholderSurface", "Failed to initialize placeholder surface", e10);
                    this.f22944e = new IllegalStateException(e10);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e11) {
                    q.d("PlaceholderSurface", "Failed to initialize placeholder surface", e11);
                    this.f22943d = e11;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e12) {
                    q.d("PlaceholderSurface", "Failed to initialize placeholder surface", e12);
                    this.f22944e = e12;
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

    public PlaceholderSurface(b bVar, SurfaceTexture surfaceTexture, boolean z10) {
        super(surfaceTexture);
        this.f22939c = bVar;
        this.f22938b = z10;
    }

    public static int b(Context context) {
        if (GlUtil.h(context)) {
            return GlUtil.i() ? 1 : 2;
        }
        return 0;
    }

    public static synchronized boolean c(Context context) {
        if (!f22937f) {
            f22936e = b(context);
            f22937f = true;
        }
        return f22936e != 0;
    }

    public static PlaceholderSurface d(Context context, boolean z10) {
        s7.a.g(!z10 || c(context));
        return new b().a(z10 ? f22936e : 0);
    }

    @Override // android.view.Surface
    public void release() {
        super.release();
        synchronized (this.f22939c) {
            if (!this.f22940d) {
                this.f22939c.c();
                this.f22940d = true;
            }
        }
    }
}
