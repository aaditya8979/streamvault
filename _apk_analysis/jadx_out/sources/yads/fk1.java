package yads;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class fk1 extends mk1 implements zj1 {
    public final Context G0;
    public final cl H0;
    public final jl I0;
    public int J0;
    public boolean K0;
    public mx0 L0;
    public long M0;
    public boolean N0;
    public boolean O0;
    public boolean P0;
    public ln2 Q0;

    public fk1(Context context, ee0 ee0Var, ok1 ok1Var, boolean z10, Handler handler, wn0 wn0Var, zb0 zb0Var) {
        super(1, ee0Var, ok1Var, z10, 44100.0f);
        this.G0 = context.getApplicationContext();
        this.I0 = zb0Var;
        this.H0 = new cl(handler, wn0Var);
        zb0Var.a(new ek1(this));
    }

    public static p51 a(ok1 ok1Var, mx0 mx0Var, boolean z10, jl jlVar) {
        String str = mx0Var.f92610m;
        if (str == null) {
            m51 m51Var = p51.f93439c;
            return sm2.f94878f;
        }
        if (((zb0) jlVar).a(mx0Var) != 0) {
            List listA = wk1.a("audio/raw", false, false);
            ik1 ik1Var = listA.isEmpty() ? null : (ik1) listA.get(0);
            if (ik1Var != null) {
                return p51.a(ik1Var);
            }
        }
        List decoderInfos = ok1Var.getDecoderInfos(str, z10, false);
        String strA = wk1.a(mx0Var);
        if (strA == null) {
            return p51.a((Collection) decoderInfos);
        }
        List decoderInfos2 = ok1Var.getDecoderInfos(strA, z10, false);
        m51 m51Var2 = p51.f93439c;
        return new l51().a(decoderInfos).a(decoderInfos2).a();
    }

    @Override // yads.mk1
    public final float a(float f10, mx0[] mx0VarArr) {
        int iMax = -1;
        for (mx0 mx0Var : mx0VarArr) {
            int i10 = mx0Var.A;
            if (i10 != -1) {
                iMax = Math.max(iMax, i10);
            }
        }
        if (iMax == -1) {
            return -1.0f;
        }
        return f10 * iMax;
    }

    public final int a(mx0 mx0Var, ik1 ik1Var) {
        int i10;
        if (!pk2.f93619a.a().equals(ik1Var.f90861a) || (i10 = ib3.f90737a) >= 24 || (i10 == 23 && ib3.d(this.G0))) {
            return mx0Var.f92611n;
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0054, code lost:
    
        if ((r4.isEmpty() ? null : (yads.ik1) r4.get(0)) != null) goto L30;
     */
    @Override // yads.mk1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(yads.ok1 r13, yads.mx0 r14) {
        /*
            Method dump skipped, instruction units count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.fk1.a(yads.ok1, yads.mx0):int");
    }

    @Override // yads.zj1
    public final long a() {
        if (this.f94540g == 2) {
            long jA = ((zb0) this.I0).a(f());
            if (jA != Long.MIN_VALUE) {
                if (!this.O0) {
                    jA = Math.max(this.M0, jA);
                }
                this.M0 = jA;
                this.O0 = false;
            }
        }
        return this.M0;
    }

    @Override // yads.mk1
    public final ArrayList a(ok1 ok1Var, mx0 mx0Var, boolean z10) {
        return wk1.a(a(ok1Var, mx0Var, z10, this.I0), mx0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0110  */
    @Override // yads.mk1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final yads.ak1 a(yads.ik1 r15, yads.mx0 r16, android.media.MediaCrypto r17, float r18) {
        /*
            Method dump skipped, instruction units count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.fk1.a(yads.ik1, yads.mx0, android.media.MediaCrypto, float):yads.ak1");
    }

    @Override // yads.mk1
    public final va0 a(ik1 ik1Var, mx0 mx0Var, mx0 mx0Var2) {
        va0 va0VarA = ik1Var.a(mx0Var, mx0Var2);
        int i10 = va0VarA.f96044e;
        if (a(mx0Var2, ik1Var) > this.J0) {
            i10 |= 64;
        }
        int i11 = i10;
        return new va0(ik1Var.f90861a, mx0Var, mx0Var2, i11 != 0 ? 0 : va0VarA.f96043d, i11);
    }

    @Override // yads.mk1
    public final va0 a(nx0 nx0Var) {
        va0 va0VarA = super.a(nx0Var);
        this.H0.a(nx0Var.f93035b, va0VarA);
        return va0VarA;
    }

    @Override // yads.mk1, yads.ro
    public final void a(long j10, boolean z10) {
        super.a(j10, z10);
        ((zb0) this.I0).b();
        this.M0 = j10;
        this.N0 = true;
        this.O0 = true;
    }

    @Override // yads.mk1
    public final void a(Exception exc) {
        ih1.b("MediaCodecAudioRenderer", ih1.a("Audio codec error", exc));
        this.H0.a(exc);
    }

    @Override // yads.mk1
    public final void a(String str) {
        this.H0.a(str);
    }

    @Override // yads.mk1
    public final void a(String str, long j10, long j11) {
        this.H0.a(str, j10, j11);
    }

    @Override // yads.zj1
    public final void a(ee2 ee2Var) {
        zb0 zb0Var = (zb0) this.I0;
        zb0Var.getClass();
        float f10 = ee2Var.f89221b;
        int i10 = ib3.f90737a;
        ee2 ee2Var2 = new ee2(Math.max(0.1f, Math.min(f10, 8.0f)), Math.max(0.1f, Math.min(ee2Var.f89222c, 8.0f)));
        if (zb0Var.f97464k && ib3.f90737a >= 23) {
            zb0Var.a(ee2Var2);
            return;
        }
        boolean z10 = zb0Var.c().f95589b;
        ub0 ub0VarC = zb0Var.c();
        if (ee2Var2.equals(ub0VarC.f95588a) && z10 == ub0VarC.f95589b) {
            return;
        }
        ub0 ub0Var = new ub0(ee2Var2, z10, -9223372036854775807L, -9223372036854775807L);
        if (zb0Var.f()) {
            zb0Var.f97476w = ub0Var;
        } else {
            zb0Var.f97477x = ub0Var;
        }
    }

    @Override // yads.mk1
    public final void a(mx0 mx0Var, MediaFormat mediaFormat) throws pn0 {
        int i10;
        mx0 mx0Var2 = this.L0;
        int[] iArr = null;
        if (mx0Var2 != null) {
            mx0Var = mx0Var2;
        } else if (this.K != null) {
            int iB = "audio/raw".equals(mx0Var.f92610m) ? mx0Var.B : (ib3.f90737a < 24 || !mediaFormat.containsKey("pcm-encoding")) ? mediaFormat.containsKey("v-bits-per-sample") ? ib3.b(mediaFormat.getInteger("v-bits-per-sample")) : 2 : mediaFormat.getInteger("pcm-encoding");
            lx0 lx0Var = new lx0();
            lx0Var.f92148k = "audio/raw";
            lx0Var.f92163z = iB;
            lx0Var.A = mx0Var.C;
            lx0Var.B = mx0Var.D;
            lx0Var.f92161x = mediaFormat.getInteger("channel-count");
            lx0Var.f92162y = mediaFormat.getInteger("sample-rate");
            mx0 mx0Var3 = new mx0(lx0Var);
            if (this.K0 && mx0Var3.f92623z == 6 && (i10 = mx0Var.f92623z) < 6) {
                int[] iArr2 = new int[i10];
                for (int i11 = 0; i11 < mx0Var.f92623z; i11++) {
                    iArr2[i11] = i11;
                }
                iArr = iArr2;
            }
            mx0Var = mx0Var3;
        }
        try {
            ((zb0) this.I0).a(mx0Var, iArr);
        } catch (el e10) {
            throw a(5001, e10.f89310b, (Exception) e10, false);
        }
    }

    @Override // yads.ro
    public final void a(boolean z10) {
        pa0 pa0Var = new pa0();
        this.B0 = pa0Var;
        this.H0.b(pa0Var);
        mn2 mn2Var = this.f94537d;
        mn2Var.getClass();
        if (mn2Var.f92468a) {
            zb0 zb0Var = (zb0) this.I0;
            zb0Var.getClass();
            if (ib3.f90737a < 21) {
                throw new IllegalStateException();
            }
            if (!zb0Var.V) {
                throw new IllegalStateException();
            }
            if (!zb0Var.Y) {
                zb0Var.Y = true;
                zb0Var.b();
            }
        } else {
            zb0 zb0Var2 = (zb0) this.I0;
            if (zb0Var2.Y) {
                zb0Var2.Y = false;
                zb0Var2.b();
            }
        }
        jl jlVar = this.I0;
        ye2 ye2Var = this.f94539f;
        ye2Var.getClass();
        ((zb0) jlVar).f97470q = ye2Var;
    }

    @Override // yads.mk1
    public final boolean a(long j10, long j11, dk1 dk1Var, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, mx0 mx0Var) throws pn0 {
        byteBuffer.getClass();
        if (this.L0 != null && (i11 & 2) != 0) {
            dk1Var.getClass();
            dk1Var.a(false, i10);
            return true;
        }
        if (z10) {
            if (dk1Var != null) {
                dk1Var.a(false, i10);
            }
            this.B0.f93505f += i12;
            ((zb0) this.I0).G = true;
            return true;
        }
        try {
            if (!((zb0) this.I0).a(byteBuffer, j12, i12)) {
                return false;
            }
            if (dk1Var != null) {
                dk1Var.a(false, i10);
            }
            this.B0.f93504e += i12;
            return true;
        } catch (fl e10) {
            throw a(5001, e10.f89609d, e10, e10.f89608c);
        } catch (il e11) {
            throw a(5002, mx0Var, e11, e11.f90872c);
        }
    }

    @Override // yads.mk1
    public final void b(sa0 sa0Var) {
        if (!this.N0 || sa0Var.b(Integer.MIN_VALUE)) {
            return;
        }
        if (Math.abs(sa0Var.f94751f - this.M0) > 500000) {
            this.M0 = sa0Var.f94751f;
        }
        this.N0 = false;
    }

    @Override // yads.mk1
    public final boolean b(mx0 mx0Var) {
        return ((zb0) this.I0).a(mx0Var) != 0;
    }

    @Override // yads.ro
    public final zj1 c() {
        return this;
    }

    @Override // yads.ro
    public final String d() {
        return "MediaCodecAudioRenderer";
    }

    @Override // yads.mk1, yads.ro
    public final boolean f() {
        if (this.f92414x0) {
            zb0 zb0Var = (zb0) this.I0;
            if (!zb0Var.f() || (zb0Var.S && (!zb0Var.f() || !zb0Var.f97462i.b(zb0Var.d())))) {
                return true;
            }
        }
        return false;
    }

    @Override // yads.mk1, yads.ro
    public final boolean g() {
        zb0 zb0Var = (zb0) this.I0;
        return (zb0Var.f() && zb0Var.f97462i.b(zb0Var.d())) || super.g();
    }

    @Override // yads.zj1
    public final ee2 getPlaybackParameters() {
        zb0 zb0Var = (zb0) this.I0;
        return zb0Var.f97464k ? zb0Var.f97478y : zb0Var.c().f95588a;
    }

    @Override // yads.ro
    public final void h() {
        this.P0 = true;
        try {
            ((zb0) this.I0).b();
            try {
                this.B = null;
                this.C0 = -9223372036854775807L;
                this.D0 = -9223372036854775807L;
                this.E0 = 0;
                p();
            } finally {
            }
        } catch (Throwable th2) {
            try {
                this.B = null;
                this.C0 = -9223372036854775807L;
                this.D0 = -9223372036854775807L;
                this.E0 = 0;
                p();
                throw th2;
            } finally {
            }
        }
    }

    @Override // yads.ro, yads.af2
    public final void handleMessage(int i10, Object obj) {
        if (i10 == 2) {
            jl jlVar = this.I0;
            float fFloatValue = ((Float) obj).floatValue();
            zb0 zb0Var = (zb0) jlVar;
            if (zb0Var.J != fFloatValue) {
                zb0Var.J = fFloatValue;
                zb0Var.k();
            }
            return;
        }
        if (i10 == 3) {
            pk pkVar = (pk) obj;
            zb0 zb0Var2 = (zb0) this.I0;
            if (zb0Var2.f97475v.equals(pkVar)) {
                return;
            }
            zb0Var2.f97475v = pkVar;
            if (zb0Var2.Y) {
                return;
            }
            zb0Var2.b();
            return;
        }
        if (i10 == 6) {
            ((zb0) this.I0).a((ql) obj);
            return;
        }
        switch (i10) {
            case 9:
                jl jlVar2 = this.I0;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                zb0 zb0Var3 = (zb0) jlVar2;
                ee2 ee2Var = zb0Var3.c().f95588a;
                ub0 ub0VarC = zb0Var3.c();
                if (!ee2Var.equals(ub0VarC.f95588a) || zBooleanValue != ub0VarC.f95589b) {
                    ub0 ub0Var = new ub0(ee2Var, zBooleanValue, -9223372036854775807L, -9223372036854775807L);
                    if (!zb0Var3.f()) {
                        zb0Var3.f97477x = ub0Var;
                    } else {
                        zb0Var3.f97476w = ub0Var;
                    }
                }
                break;
            case 10:
                jl jlVar3 = this.I0;
                int iIntValue = ((Integer) obj).intValue();
                zb0 zb0Var4 = (zb0) jlVar3;
                if (zb0Var4.W != iIntValue) {
                    zb0Var4.W = iIntValue;
                    zb0Var4.V = iIntValue != 0;
                    zb0Var4.b();
                }
                break;
            case 11:
                this.Q0 = (ln2) obj;
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [int] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [int] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // yads.ro
    public final void i() {
        try {
            try {
                this.f92392m0 = false;
                this.f92407u.b();
                this.f92405t.b();
                this.f92391l0 = false;
                this.f92390k0 = false;
                u();
            } finally {
                mk0.a(this.E, null);
                this.E = null;
            }
        } finally {
            if (this.P0) {
                this.P0 = false;
                zb0 zb0Var = (zb0) this.I0;
                zb0Var.b();
                for (bl blVar : zb0Var.f97459f) {
                    blVar.reset();
                }
                for (bl blVar2 : zb0Var.f97460g) {
                    blVar2.reset();
                }
                zb0Var.U = false;
                zb0Var.f97453a0 = false;
            }
        }
    }

    @Override // yads.ro
    public final void j() {
        ((zb0) this.I0).h();
    }

    @Override // yads.ro
    public final void k() {
        long jA = ((zb0) this.I0).a(f());
        if (jA != Long.MIN_VALUE) {
            if (!this.O0) {
                jA = Math.max(this.M0, jA);
            }
            this.M0 = jA;
            this.O0 = false;
        }
        ((zb0) this.I0).g();
    }

    @Override // yads.mk1
    public final void s() {
        ((zb0) this.I0).G = true;
    }

    @Override // yads.mk1
    public final void v() throws pn0 {
        try {
            zb0 zb0Var = (zb0) this.I0;
            if (!zb0Var.S && zb0Var.f() && zb0Var.a()) {
                zb0Var.i();
                zb0Var.S = true;
            }
        } catch (il e10) {
            throw a(5002, e10.f90873d, e10, e10.f90872c);
        }
    }
}
