package com.google.android.exoplayer.video;

import a6.k;
import a6.k0;
import a6.m;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import androidx.annotation.Nullable;
import com.google.android.exoplayer.util.EGLSurfaceTexture;

/* JADX INFO: loaded from: classes7.dex */
@TargetApi(17)
public final class DummySurface extends Surface {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f21168e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f21169f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f21170b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f21171c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f21172d;

    public static class b extends HandlerThread implements Handler.Callback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public EGLSurfaceTexture f21173b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Handler f21174c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public Error f21175d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public RuntimeException f21176e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        public DummySurface f21177f;

        public b() {
            super("dummySurface");
        }

        public DummySurface a(int i10) {
            boolean z10;
            start();
            this.f21174c = new Handler(getLooper(), this);
            this.f21173b = new EGLSurfaceTexture(this.f21174c);
            synchronized (this) {
                z10 = false;
                this.f21174c.obtainMessage(1, i10, 0).sendToTarget();
                while (this.f21177f == null && this.f21176e == null && this.f21175d == null) {
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
            RuntimeException runtimeException = this.f21176e;
            if (runtimeException != null) {
                throw runtimeException;
            }
            Error error = this.f21175d;
            if (error == null) {
                return (DummySurface) a6.a.e(this.f21177f);
            }
            throw error;
        }

        public final void b(int i10) {
            a6.a.e(this.f21173b);
            this.f21173b.i(i10);
            this.f21177f = new DummySurface(this, this.f21173b.h(), i10 != 0);
        }

        public void c() {
            a6.a.e(this.f21174c);
            this.f21174c.sendEmptyMessage(2);
        }

        public final void d() {
            a6.a.e(this.f21173b);
            this.f21173b.j();
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
                } catch (Error e10) {
                    m.d("DummySurface", "Failed to initialize dummy surface", e10);
                    this.f21175d = e10;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e11) {
                    m.d("DummySurface", "Failed to initialize dummy surface", e11);
                    this.f21176e = e11;
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

    public DummySurface(b bVar, SurfaceTexture surfaceTexture, boolean z10) {
        super(surfaceTexture);
        this.f21171c = bVar;
        this.f21170b = z10;
    }

    public static void c() {
        if (k0.f3574a < 17) {
            throw new UnsupportedOperationException("Unsupported prior to API level 17");
        }
    }

    public static int d(Context context) {
        if (k.f(context)) {
            return k.g() ? 1 : 2;
        }
        return 0;
    }

    public static synchronized boolean e(Context context) {
        if (!f21169f) {
            f21168e = d(context);
            f21169f = true;
        }
        return f21168e != 0;
    }

    public static DummySurface f(Context context, boolean z10) {
        c();
        a6.a.f(!z10 || e(context));
        return new b().a(z10 ? f21168e : 0);
    }

    @Override // android.view.Surface
    public void release() {
        super.release();
        synchronized (this.f21171c) {
            if (!this.f21172d) {
                this.f21171c.c();
                this.f21172d = true;
            }
        }
    }
}
