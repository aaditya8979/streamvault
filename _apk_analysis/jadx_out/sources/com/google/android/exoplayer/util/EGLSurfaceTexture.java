package com.google.android.exoplayer.util;

import a6.k;
import a6.k0;
import android.annotation.TargetApi;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@TargetApi(17)
public final class EGLSurfaceTexture implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int[] f21155i = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f21156b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f21157c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final b f21158d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public EGLDisplay f21159e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public EGLContext f21160f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public EGLSurface f21161g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public SurfaceTexture f21162h;

    public static final class GlException extends RuntimeException {
        public GlException(String str) {
            super(str);
        }
    }

    public interface b {
        void onFrameAvailable();
    }

    public EGLSurfaceTexture(Handler handler) {
        this(handler, null);
    }

    public EGLSurfaceTexture(Handler handler, @Nullable b bVar) {
        this.f21156b = handler;
        this.f21158d = bVar;
        this.f21157c = new int[1];
    }

    public static EGLConfig a(EGLDisplay eGLDisplay) {
        EGLConfig eGLConfig;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr = new int[1];
        boolean zEglChooseConfig = EGL14.eglChooseConfig(eGLDisplay, f21155i, 0, eGLConfigArr, 0, 1, iArr, 0);
        if (!zEglChooseConfig || iArr[0] <= 0 || (eGLConfig = eGLConfigArr[0]) == null) {
            throw new GlException(k0.y("eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", Boolean.valueOf(zEglChooseConfig), Integer.valueOf(iArr[0]), eGLConfigArr[0]));
        }
        return eGLConfig;
    }

    public static EGLContext b(EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i10) {
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, i10 == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
        if (eGLContextEglCreateContext != null) {
            return eGLContextEglCreateContext;
        }
        throw new GlException("eglCreateContext failed");
    }

    public static EGLSurface c(EGLDisplay eGLDisplay, EGLConfig eGLConfig, EGLContext eGLContext, int i10) {
        EGLSurface eGLSurfaceEglCreatePbufferSurface;
        if (i10 == 1) {
            eGLSurfaceEglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i10 == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
            if (eGLSurfaceEglCreatePbufferSurface == null) {
                throw new GlException("eglCreatePbufferSurface failed");
            }
        }
        if (EGL14.eglMakeCurrent(eGLDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContext)) {
            return eGLSurfaceEglCreatePbufferSurface;
        }
        throw new GlException("eglMakeCurrent failed");
    }

    public static void f(int[] iArr) {
        GLES20.glGenTextures(1, iArr, 0);
        k.b();
    }

    public static EGLDisplay g() {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        if (eGLDisplayEglGetDisplay == null) {
            throw new GlException("eglGetDisplay failed");
        }
        int[] iArr = new int[2];
        if (EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1)) {
            return eGLDisplayEglGetDisplay;
        }
        throw new GlException("eglInitialize failed");
    }

    public final void d() {
        b bVar = this.f21158d;
        if (bVar != null) {
            bVar.onFrameAvailable();
        }
    }

    public SurfaceTexture h() {
        return (SurfaceTexture) a6.a.e(this.f21162h);
    }

    public void i(int i10) {
        EGLDisplay eGLDisplayG = g();
        this.f21159e = eGLDisplayG;
        EGLConfig eGLConfigA = a(eGLDisplayG);
        EGLContext eGLContextB = b(this.f21159e, eGLConfigA, i10);
        this.f21160f = eGLContextB;
        this.f21161g = c(this.f21159e, eGLConfigA, eGLContextB, i10);
        f(this.f21157c);
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f21157c[0]);
        this.f21162h = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void j() {
        this.f21156b.removeCallbacks(this);
        try {
            SurfaceTexture surfaceTexture = this.f21162h;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, this.f21157c, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = this.f21159e;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = this.f21159e;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = this.f21161g;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f21159e, this.f21161g);
            }
            EGLContext eGLContext = this.f21160f;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(this.f21159e, eGLContext);
            }
            if (k0.f3574a >= 19) {
                EGL14.eglReleaseThread();
            }
            EGLDisplay eGLDisplay3 = this.f21159e;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.f21159e);
            }
            this.f21159e = null;
            this.f21160f = null;
            this.f21161g = null;
            this.f21162h = null;
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f21156b.post(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        d();
        SurfaceTexture surfaceTexture = this.f21162h;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }
}
