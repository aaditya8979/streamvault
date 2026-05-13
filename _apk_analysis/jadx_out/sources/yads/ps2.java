package yads;

import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.opengl.GLES20;
import android.opengl.Matrix;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes12.dex */
public final class ps2 implements nh3, at {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f93758j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public SurfaceTexture f93759k;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public byte[] f93762n;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f93750b = new AtomicBoolean();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f93751c = new AtomicBoolean(true);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final nk2 f93752d = new nk2();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final tx0 f93753e = new tx0();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n63 f93754f = new n63();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final n63 f93755g = new n63();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float[] f93756h = new float[16];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float[] f93757i = new float[16];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public volatile int f93760l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f93761m = -1;

    public final SurfaceTexture a() {
        GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
        sz0.a();
        nk2 nk2Var = this.f93752d;
        nk2Var.getClass();
        rz0 rz0Var = new rz0();
        nk2Var.f92867c = rz0Var;
        nk2Var.f92868d = GLES20.glGetUniformLocation(rz0Var.f94652a, "uMvpMatrix");
        nk2Var.f92869e = GLES20.glGetUniformLocation(nk2Var.f92867c.f94652a, "uTexMatrix");
        nk2Var.f92870f = nk2Var.f92867c.a("aPosition");
        nk2Var.f92871g = nk2Var.f92867c.a("aTexCoords");
        nk2Var.f92872h = GLES20.glGetUniformLocation(nk2Var.f92867c.f94652a, "uTexture");
        sz0.a();
        this.f93758j = sz0.b();
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f93758j);
        this.f93759k = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: bt.n8
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                this.f6182b.a(surfaceTexture2);
            }
        });
        return this.f93759k;
    }

    @Override // yads.nh3
    public final void a(long j10, long j11, mx0 mx0Var, MediaFormat mediaFormat) {
        int i10;
        float[] fArr;
        int i11;
        ArrayList arrayListA;
        int iB;
        this.f93754f.a(Long.valueOf(j10), j11);
        byte[] bArr = mx0Var.f92620w;
        int i12 = mx0Var.f92621x;
        byte[] bArr2 = this.f93762n;
        int i13 = this.f93761m;
        this.f93762n = bArr;
        if (i12 == -1) {
            i12 = this.f93760l;
        }
        this.f93761m = i12;
        if (i13 == i12 && Arrays.equals(bArr2, this.f93762n)) {
            return;
        }
        byte[] bArr3 = this.f93762n;
        kk2 kk2Var = null;
        if (bArr3 != null) {
            int i14 = this.f93761m;
            jb2 jb2Var = new jb2(bArr3);
            try {
                jb2Var.e(jb2Var.f91148b + 4);
                iB = jb2Var.b();
                jb2Var.e(0);
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
            if (iB == 1886547818) {
                jb2Var.e(jb2Var.f91148b + 8);
                int i15 = jb2Var.f91148b;
                int i16 = jb2Var.f91149c;
                while (i15 < i16) {
                    int iB2 = jb2Var.b() + i15;
                    if (iB2 > i15 && iB2 <= i16) {
                        int iB3 = jb2Var.b();
                        if (iB3 != 2037673328 && iB3 != 1836279920) {
                            jb2Var.e(iB2);
                            i15 = iB2;
                        }
                        jb2Var.d(iB2);
                        arrayListA = lk2.a(jb2Var);
                        break;
                    }
                    break;
                }
                arrayListA = null;
            } else {
                arrayListA = lk2.a(jb2Var);
            }
            if (arrayListA != null) {
                int size = arrayListA.size();
                if (size == 1) {
                    ik2 ik2Var = (ik2) arrayListA.get(0);
                    kk2Var = new kk2(ik2Var, ik2Var, i14);
                } else if (size == 2) {
                    kk2Var = new kk2((ik2) arrayListA.get(0), (ik2) arrayListA.get(1), i14);
                }
            }
        }
        if (kk2Var == null || !nk2.a(kk2Var)) {
            int i17 = this.f93761m;
            float radians = (float) Math.toRadians(180.0f);
            float radians2 = (float) Math.toRadians(360.0f);
            float f10 = radians / 36;
            float f11 = radians2 / 72;
            int i18 = 73;
            float[] fArr2 = new float[15984];
            float[] fArr3 = new float[10656];
            int i19 = 0;
            int i20 = 0;
            int i21 = 0;
            for (int i22 = 36; i19 < i22; i22 = 36) {
                float f12 = radians / 2.0f;
                float f13 = (i19 * f10) - f12;
                int i23 = i19 + 1;
                float f14 = (i23 * f10) - f12;
                int i24 = 0;
                while (i24 < i18) {
                    float f15 = f14;
                    float f16 = f13;
                    int i25 = i23;
                    int i26 = i20;
                    int i27 = i21;
                    int i28 = 0;
                    int i29 = 2;
                    while (i28 < i29) {
                        float f17 = i24 * f11;
                        int i30 = i24;
                        int i31 = i19;
                        float f18 = f11;
                        double d10 = 50.0f;
                        int i32 = i26;
                        double d11 = (3.1415927f + f17) - (radians2 / 2.0f);
                        int i33 = i17;
                        double d12 = i28 == 0 ? f16 : f15;
                        float f19 = radians;
                        fArr2[i32] = -((float) (Math.cos(d12) * Math.sin(d11) * d10));
                        float[] fArr4 = fArr3;
                        int i34 = i28;
                        fArr2[i26 + 1] = (float) (Math.sin(d12) * d10);
                        int i35 = i32 + 3;
                        fArr2[i32 + 2] = (float) (Math.cos(d12) * Math.cos(d11) * d10);
                        fArr4[i27] = f17 / radians2;
                        int i36 = i27 + 2;
                        fArr4[i27 + 1] = ((i31 + i34) * f10) / f19;
                        if (i30 == 0 && i34 == 0) {
                            i10 = i30;
                            i11 = i34;
                        } else {
                            i10 = i30;
                            if (i10 == 72) {
                                i11 = i34;
                                if (i11 != 1) {
                                    fArr = fArr4;
                                }
                            } else {
                                fArr = fArr4;
                                i11 = i34;
                            }
                            i29 = 2;
                            i27 = i36;
                            i26 = i35;
                            i28 = i11 + 1;
                            i24 = i10;
                            fArr3 = fArr;
                            i19 = i31;
                            f11 = f18;
                            i17 = i33;
                            radians = f19;
                        }
                        System.arraycopy(fArr2, i32, fArr2, i35, 3);
                        i26 = i32 + 6;
                        fArr = fArr4;
                        i29 = 2;
                        System.arraycopy(fArr, i27, fArr, i36, 2);
                        i27 += 4;
                        i28 = i11 + 1;
                        i24 = i10;
                        fArr3 = fArr;
                        i19 = i31;
                        f11 = f18;
                        i17 = i33;
                        radians = f19;
                    }
                    i24++;
                    i21 = i27;
                    i20 = i26;
                    i19 = i19;
                    f14 = f15;
                    f13 = f16;
                    i23 = i25;
                    i17 = i17;
                    i18 = 73;
                }
                i19 = i23;
            }
            ik2 ik2Var2 = new ik2(new jk2(0, fArr2, fArr3, 1));
            kk2Var = new kk2(ik2Var2, ik2Var2, i17);
        }
        this.f93755g.a(kk2Var, j11);
    }

    public final /* synthetic */ void a(SurfaceTexture surfaceTexture) {
        this.f93750b.set(true);
    }

    public final void a(float[] fArr) {
        Object objA;
        GLES20.glClear(16384);
        sz0.a();
        if (this.f93750b.compareAndSet(true, false)) {
            SurfaceTexture surfaceTexture = this.f93759k;
            surfaceTexture.getClass();
            surfaceTexture.updateTexImage();
            sz0.a();
            if (this.f93751c.compareAndSet(true, false)) {
                Matrix.setIdentityM(this.f93756h, 0);
            }
            long timestamp = this.f93759k.getTimestamp();
            n63 n63Var = this.f93754f;
            synchronized (n63Var) {
                objA = n63Var.a(timestamp, false);
            }
            Long l10 = (Long) objA;
            if (l10 != null) {
                this.f93753e.a(l10.longValue(), this.f93756h);
            }
            kk2 kk2Var = (kk2) this.f93755g.a(timestamp);
            if (kk2Var != null) {
                nk2 nk2Var = this.f93752d;
                nk2Var.getClass();
                if (nk2.a(kk2Var)) {
                    nk2Var.f92865a = kk2Var.f91622c;
                    nk2Var.f92866b = new mk2(kk2Var.f91620a.f90869a[0]);
                    if (!kk2Var.f91623d) {
                        new mk2(kk2Var.f91621b.f90869a[0]);
                    }
                }
            }
        }
        Matrix.multiplyMM(this.f93757i, 0, fArr, 0, this.f93756h, 0);
        nk2 nk2Var2 = this.f93752d;
        int i10 = this.f93758j;
        float[] fArr2 = this.f93757i;
        mk2 mk2Var = nk2Var2.f92866b;
        if (mk2Var == null) {
            return;
        }
        int i11 = nk2Var2.f92865a;
        GLES20.glUniformMatrix3fv(nk2Var2.f92869e, 1, false, i11 == 1 ? nk2.f92863j : i11 == 2 ? nk2.f92864k : nk2.f92862i, 0);
        GLES20.glUniformMatrix4fv(nk2Var2.f92868d, 1, false, fArr2, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i10);
        GLES20.glUniform1i(nk2Var2.f92872h, 0);
        sz0.a();
        GLES20.glVertexAttribPointer(nk2Var2.f92870f, 3, 5126, false, 12, (Buffer) mk2Var.f92420b);
        sz0.a();
        GLES20.glVertexAttribPointer(nk2Var2.f92871g, 2, 5126, false, 8, (Buffer) mk2Var.f92421c);
        sz0.a();
        GLES20.glDrawArrays(mk2Var.f92422d, 0, mk2Var.f92419a);
        sz0.a();
    }

    @Override // yads.at
    public final void onCameraMotion(long j10, float[] fArr) {
        this.f93753e.f95415c.a(fArr, j10);
    }

    @Override // yads.at
    public final void onCameraMotionReset() {
        this.f93754f.a();
        tx0 tx0Var = this.f93753e;
        tx0Var.f95415c.a();
        tx0Var.f95416d = false;
        this.f93751c.set(true);
    }
}
