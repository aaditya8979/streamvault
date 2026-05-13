package com.facebook.ads.redexgen.core;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import androidx.exifinterface.media.ExifInterface;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.3e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class RunnableC14963e implements SurfaceTexture.OnFrameAvailableListener, Runnable {
    public static byte[] A06;
    public static String[] A07 = {"LhLlUYOA3naT6ewiIfSatK6wPnwZfiw3", "Yilysgn0AAb9YtLDTNJji2mPRB", "c9oRdUKVrFFtnTa1I", "KQ", "xlNtsgcQCcIfApmgkmgvKWlCiiYZcHMk", "hc66151z6q5iwEh2NbNUTWK4J8", "zFcjHNMQlzxWDemIwLbPjRBcPW9AB4cx", "Z4gs05w13PySoO170q3JfxFVkqHBiozt"};
    public static final int[] A08;
    public SurfaceTexture A00;
    public EGLContext A01;
    public EGLDisplay A02;
    public EGLSurface A03;
    public final Handler A04;
    public final int[] A05 = new int[1];

    static {
        A05();
        A08 = new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};
    }

    public RunnableC14963e(Handler handler) {
        this.A04 = handler;
    }

    public static EGLConfig A00(EGLDisplay eGLDisplay) {
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr = new int[1];
        boolean zEglChooseConfig = EGL14.eglChooseConfig(eGLDisplay, A08, 0, eGLConfigArr, 0, 1, iArr, 0);
        if (!zEglChooseConfig || iArr[0] <= 0 || eGLConfigArr[0] == null) {
            throw new C14943c(AbstractC15184a.A0n(A04(0, 67, 111), Boolean.valueOf(zEglChooseConfig), Integer.valueOf(iArr[0]), eGLConfigArr[0]));
        }
        return eGLConfigArr[0];
    }

    public static EGLContext A01(EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i10) {
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, i10 == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
        if (eGLContextEglCreateContext != null) {
            return eGLContextEglCreateContext;
        }
        throw new C14943c(A04(67, 23, 12));
    }

    public static EGLDisplay A02() {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        if (eGLDisplayEglGetDisplay == null) {
            throw new C14943c(A04(120, 20, 33));
        }
        int[] iArr = new int[2];
        if (EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1)) {
            return eGLDisplayEglGetDisplay;
        }
        throw new C14943c(A04(140, 20, 106));
    }

    public static EGLSurface A03(EGLDisplay eGLDisplay, EGLConfig eGLConfig, EGLContext eGLContext, int i10) {
        EGLSurface eGLSurfaceEglCreatePbufferSurface;
        if (i10 == 1) {
            eGLSurfaceEglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i10 == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
            if (eGLSurfaceEglCreatePbufferSurface == null) {
                throw new C14943c(A04(90, 30, 59));
            }
        }
        if (EGL14.eglMakeCurrent(eGLDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContext)) {
            return eGLSurfaceEglCreatePbufferSurface;
        }
        throw new C14943c(A04(160, 21, 41));
    }

    public static String A04(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 116);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A06 = new byte[]{72, 74, 79, 38, 75, 82, 82, 86, 72, 38, 82, 81, 73, 76, 74, 3, 73, 68, 76, 79, 72, 71, 29, 3, 86, 88, 70, 70, 72, 86, 86, 32, 8, 69, 15, 3, 81, 88, 80, 38, 82, 81, 73, 76, 74, 86, 62, 19, 64, 32, 8, 71, 15, 3, 70, 82, 81, 73, 76, 74, 86, 62, 19, 64, 32, 8, 86, -27, -25, -20, -61, -14, -27, ExifInterface.MARKER_APP1, -12, -27, -61, -17, -18, -12, -27, -8, -12, -96, -26, ExifInterface.MARKER_APP1, -23, -20, -27, -28, 20, 22, 27, -14, 33, 20, 16, 35, 20, -1, 17, 36, 21, 21, 20, 33, 2, 36, 33, 21, 16, 18, 20, -49, 21, 16, 24, 27, 20, 19, -6, -4, 1, -36, -6, 9, ExifInterface.MARKER_EOI, -2, 8, 5, 1, -10, 14, -75, -5, -10, -2, 1, -6, -7, 67, 69, 74, 39, 76, 71, 82, 71, 63, 74, 71, 88, 67, -2, 68, 63, 71, 74, 67, 66, 2, 4, 9, -22, -2, 8, 2, -32, 18, 15, 15, 2, 11, 17, -67, 3, -2, 6, 9, 2, 1, 13, 18, -19, 11, 20, -6, 11, 30, 26, 27, 24, 11, 25, -58, 12, 7, 15, 18, 11, 10, -44, -58, -21, 24, 24, 21, 24, -32, -58};
    }

    public static void A06(int[] iArr) {
        GLES20.glGenTextures(1, iArr, 0);
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError != 0) {
            throw new C14943c(A04(181, 29, 50) + Integer.toHexString(iGlGetError));
        }
    }

    public final SurfaceTexture A07() {
        return (SurfaceTexture) C3M.A01(this.A00);
    }

    /* JADX WARN: Finally extract failed */
    public final void A08() {
        this.A04.removeCallbacks(this);
        try {
            if (this.A00 != null) {
                this.A00.release();
                GLES20.glDeleteTextures(1, this.A05, 0);
            }
            if (this.A03 != null && !this.A03.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.A02, this.A03);
            }
            EGLContext eGLContext = this.A01;
            String[] strArr = A07;
            if (strArr[1].length() == strArr[5].length()) {
                A07[0] = "QNIttSd1jDkmqHhtWtb4AUHxJPK3ppH8";
                if (eGLContext != null) {
                    EGL14.eglDestroyContext(this.A02, this.A01);
                }
                this.A02 = null;
                this.A01 = null;
                this.A03 = null;
                this.A00 = null;
                if (A07[0].charAt(22) != 'k') {
                    A07[0] = "tPWKOfvaIXpYJ8rWJX79LPHjnVzX8xxm";
                    return;
                }
            }
            throw new RuntimeException();
        } catch (Throwable th2) {
            if (this.A03 != null && !this.A03.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.A02, this.A03);
            }
            if (this.A01 != null) {
                EGL14.eglDestroyContext(this.A02, this.A01);
            }
            this.A02 = null;
            this.A01 = null;
            this.A03 = null;
            this.A00 = null;
            throw th2;
        }
    }

    public final void A09(int i10) {
        this.A02 = A02();
        EGLConfig eGLConfigA00 = A00(this.A02);
        this.A01 = A01(this.A02, eGLConfigA00, i10);
        this.A03 = A03(this.A02, eGLConfigA00, this.A01, i10);
        A06(this.A05);
        this.A00 = new SurfaceTexture(this.A05[0]);
        this.A00.setOnFrameAvailableListener(this);
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.A04.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (AbstractC2208Vl.A02(this)) {
            return;
        }
        try {
            if (this.A00 != null) {
                this.A00.updateTexImage();
            }
        } catch (Throwable th2) {
            AbstractC2208Vl.A00(th2, this);
        }
    }
}
