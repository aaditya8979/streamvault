package com.google.android.exoplayer2.util;

import android.opengl.GLES20;
import com.google.android.exoplayer2.util.GlUtil;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: GlProgram.java */
/* JADX INFO: loaded from: classes12.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a[] f22908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0305b[] f22909c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map<String, a> f22910d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map<String, C0305b> f22911e;

    /* JADX INFO: compiled from: GlProgram.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f22912a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f22913b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f22914c;

        public a(String str, int i10, int i11) {
            this.f22912a = str;
            this.f22913b = i10;
            this.f22914c = i11;
        }

        public static a a(int i10, int i11) {
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(i10, 35722, iArr, 0);
            int i12 = iArr[0];
            byte[] bArr = new byte[i12];
            GLES20.glGetActiveAttrib(i10, i11, i12, new int[1], 0, new int[1], 0, new int[1], 0, bArr, 0);
            String str = new String(bArr, 0, b.h(bArr));
            return new a(str, i11, b.f(i10, str));
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.util.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: GlProgram.java */
    public static final class C0305b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f22915a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f22916b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f22917c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float[] f22918d = new float[16];

        public C0305b(String str, int i10, int i11) {
            this.f22915a = str;
            this.f22916b = i10;
            this.f22917c = i11;
        }

        public static C0305b a(int i10, int i11) {
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(i10, 35719, iArr, 0);
            int[] iArr2 = new int[1];
            int i12 = iArr[0];
            byte[] bArr = new byte[i12];
            GLES20.glGetActiveUniform(i10, i11, i12, new int[1], 0, new int[1], 0, iArr2, 0, bArr, 0);
            String str = new String(bArr, 0, b.h(bArr));
            return new C0305b(str, b.i(i10, str), iArr2[0]);
        }
    }

    public b(String str, String str2) throws GlUtil.GlException {
        int iGlCreateProgram = GLES20.glCreateProgram();
        this.f22907a = iGlCreateProgram;
        GlUtil.b();
        d(iGlCreateProgram, 35633, str);
        d(iGlCreateProgram, 35632, str2);
        GLES20.glLinkProgram(iGlCreateProgram);
        int[] iArr = {0};
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        GlUtil.c(iArr[0] == 1, "Unable to link shader program: \n" + GLES20.glGetProgramInfoLog(iGlCreateProgram));
        GLES20.glUseProgram(iGlCreateProgram);
        this.f22910d = new HashMap();
        int[] iArr2 = new int[1];
        GLES20.glGetProgramiv(iGlCreateProgram, 35721, iArr2, 0);
        this.f22908b = new a[iArr2[0]];
        for (int i10 = 0; i10 < iArr2[0]; i10++) {
            a aVarA = a.a(this.f22907a, i10);
            this.f22908b[i10] = aVarA;
            this.f22910d.put(aVarA.f22912a, aVarA);
        }
        this.f22911e = new HashMap();
        int[] iArr3 = new int[1];
        GLES20.glGetProgramiv(this.f22907a, 35718, iArr3, 0);
        this.f22909c = new C0305b[iArr3[0]];
        for (int i11 = 0; i11 < iArr3[0]; i11++) {
            C0305b c0305bA = C0305b.a(this.f22907a, i11);
            this.f22909c[i11] = c0305bA;
            this.f22911e.put(c0305bA.f22915a, c0305bA);
        }
        GlUtil.b();
    }

    public static void d(int i10, int i11, String str) throws GlUtil.GlException {
        int iGlCreateShader = GLES20.glCreateShader(i11);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = {0};
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        GlUtil.c(iArr[0] == 1, GLES20.glGetShaderInfoLog(iGlCreateShader) + ", source: " + str);
        GLES20.glAttachShader(i10, iGlCreateShader);
        GLES20.glDeleteShader(iGlCreateShader);
        GlUtil.b();
    }

    public static int f(int i10, String str) {
        return GLES20.glGetAttribLocation(i10, str);
    }

    public static int h(byte[] bArr) {
        for (int i10 = 0; i10 < bArr.length; i10++) {
            if (bArr[i10] == 0) {
                return i10;
            }
        }
        return bArr.length;
    }

    public static int i(int i10, String str) {
        return GLES20.glGetUniformLocation(i10, str);
    }

    public void delete() throws GlUtil.GlException {
        GLES20.glDeleteProgram(this.f22907a);
        GlUtil.b();
    }

    public int e(String str) throws GlUtil.GlException {
        int iG = g(str);
        GLES20.glEnableVertexAttribArray(iG);
        GlUtil.b();
        return iG;
    }

    public final int g(String str) {
        return f(this.f22907a, str);
    }

    public int j(String str) {
        return i(this.f22907a, str);
    }
}
