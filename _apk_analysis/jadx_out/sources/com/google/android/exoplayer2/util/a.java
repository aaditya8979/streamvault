package com.google.android.exoplayer2.util;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.util.GlUtil;
import s7.m0;

/* JADX INFO: compiled from: EGLSurfaceTexture.java */
/* JADX INFO: loaded from: classes11.dex */
@RequiresApi(17)
public final class a implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int[] f22899i = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f22900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f22901c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final InterfaceC0304a f22902d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public EGLDisplay f22903e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public EGLContext f22904f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public EGLSurface f22905g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public SurfaceTexture f22906h;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.util.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: EGLSurfaceTexture.java */
    public interface InterfaceC0304a {
        void onFrameAvailable();
    }

    public a(Handler handler) {
        this(handler, null);
    }

    public a(Handler handler, @Nullable InterfaceC0304a interfaceC0304a) {
        this.f22900b = handler;
        this.f22902d = interfaceC0304a;
        this.f22901c = new int[1];
    }

    public static EGLConfig a(EGLDisplay eGLDisplay) throws GlUtil.GlException {
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr = new int[1];
        boolean zEglChooseConfig = EGL14.eglChooseConfig(eGLDisplay, f22899i, 0, eGLConfigArr, 0, 1, iArr, 0);
        GlUtil.c(zEglChooseConfig && iArr[0] > 0 && eGLConfigArr[0] != null, m0.z("eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", Boolean.valueOf(zEglChooseConfig), Integer.valueOf(iArr[0]), eGLConfigArr[0]));
        return eGLConfigArr[0];
    }

    public static EGLContext b(EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i10) throws GlUtil.GlException {
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, i10 == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
        GlUtil.c(eGLContextEglCreateContext != null, "eglCreateContext failed");
        return eGLContextEglCreateContext;
    }

    public static EGLSurface c(EGLDisplay eGLDisplay, EGLConfig eGLConfig, EGLContext eGLContext, int i10) throws GlUtil.GlException {
        EGLSurface eGLSurfaceEglCreatePbufferSurface;
        if (i10 == 1) {
            eGLSurfaceEglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i10 == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
            GlUtil.c(eGLSurfaceEglCreatePbufferSurface != null, "eglCreatePbufferSurface failed");
        }
        GlUtil.c(EGL14.eglMakeCurrent(eGLDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContext), "eglMakeCurrent failed");
        return eGLSurfaceEglCreatePbufferSurface;
    }

    public static void f(int[] iArr) throws GlUtil.GlException {
        GLES20.glGenTextures(1, iArr, 0);
        GlUtil.b();
    }

    public static EGLDisplay g() throws GlUtil.GlException {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        GlUtil.c(eGLDisplayEglGetDisplay != null, "eglGetDisplay failed");
        int[] iArr = new int[2];
        GlUtil.c(EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1), "eglInitialize failed");
        return eGLDisplayEglGetDisplay;
    }

    public final void d() {
        InterfaceC0304a interfaceC0304a = this.f22902d;
        if (interfaceC0304a != null) {
            interfaceC0304a.onFrameAvailable();
        }
    }

    public SurfaceTexture h() {
        return (SurfaceTexture) s7.a.e(this.f22906h);
    }

    public void i(int i10) throws GlUtil.GlException {
        EGLDisplay eGLDisplayG = g();
        this.f22903e = eGLDisplayG;
        EGLConfig eGLConfigA = a(eGLDisplayG);
        EGLContext eGLContextB = b(this.f22903e, eGLConfigA, i10);
        this.f22904f = eGLContextB;
        this.f22905g = c(this.f22903e, eGLConfigA, eGLContextB, i10);
        f(this.f22901c);
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f22901c[0]);
        this.f22906h = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void j() {
        this.f22900b.removeCallbacks(this);
        try {
            SurfaceTexture surfaceTexture = this.f22906h;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, this.f22901c, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = this.f22903e;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = this.f22903e;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = this.f22905g;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f22903e, this.f22905g);
            }
            EGLContext eGLContext = this.f22904f;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(this.f22903e, eGLContext);
            }
            if (m0.f79487a >= 19) {
                EGL14.eglReleaseThread();
            }
            EGLDisplay eGLDisplay3 = this.f22903e;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.f22903e);
            }
            this.f22903e = null;
            this.f22904f = null;
            this.f22905g = null;
            this.f22906h = null;
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f22900b.post(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        d();
        SurfaceTexture surfaceTexture = this.f22906h;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }
}
