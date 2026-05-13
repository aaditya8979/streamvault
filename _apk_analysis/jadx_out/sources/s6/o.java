package s6;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.m;
import java.util.Arrays;
import java.util.Collections;
import s6.i0;
import s7.m0;

/* JADX INFO: compiled from: H263Reader.java */
/* JADX INFO: loaded from: classes.dex */
public final class o implements m {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final float[] f79267l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final k0 f79268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final s7.a0 f79269b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final u f79272e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public b f79273f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f79274g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f79275h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public i6.b0 f79276i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f79277j;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean[] f79270c = new boolean[4];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f79271d = new a(128);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f79278k = -9223372036854775807L;

    /* JADX INFO: compiled from: H263Reader.java */
    public static final class a {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final byte[] f79279f = {0, 0, 1};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f79280a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f79281b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f79282c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f79283d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public byte[] f79284e;

        public a(int i10) {
            this.f79284e = new byte[i10];
        }

        public void a(byte[] bArr, int i10, int i11) {
            if (this.f79280a) {
                int i12 = i11 - i10;
                byte[] bArr2 = this.f79284e;
                int length = bArr2.length;
                int i13 = this.f79282c;
                if (length < i13 + i12) {
                    this.f79284e = Arrays.copyOf(bArr2, (i13 + i12) * 2);
                }
                System.arraycopy(bArr, i10, this.f79284e, this.f79282c, i12);
                this.f79282c += i12;
            }
        }

        public boolean b(int i10, int i11) {
            int i12 = this.f79281b;
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 != 3) {
                            if (i12 != 4) {
                                throw new IllegalStateException();
                            }
                            if (i10 == 179 || i10 == 181) {
                                this.f79282c -= i11;
                                this.f79280a = false;
                                return true;
                            }
                        } else if ((i10 & 240) != 32) {
                            s7.q.i("H263Reader", "Unexpected start code value");
                            c();
                        } else {
                            this.f79283d = this.f79282c;
                            this.f79281b = 4;
                        }
                    } else if (i10 > 31) {
                        s7.q.i("H263Reader", "Unexpected start code value");
                        c();
                    } else {
                        this.f79281b = 3;
                    }
                } else if (i10 != 181) {
                    s7.q.i("H263Reader", "Unexpected start code value");
                    c();
                } else {
                    this.f79281b = 2;
                }
            } else if (i10 == 176) {
                this.f79281b = 1;
                this.f79280a = true;
            }
            byte[] bArr = f79279f;
            a(bArr, 0, bArr.length);
            return false;
        }

        public void c() {
            this.f79280a = false;
            this.f79282c = 0;
            this.f79281b = 0;
        }
    }

    /* JADX INFO: compiled from: H263Reader.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final i6.b0 f79285a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f79286b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f79287c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f79288d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f79289e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f79290f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public long f79291g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public long f79292h;

        public b(i6.b0 b0Var) {
            this.f79285a = b0Var;
        }

        public void a(byte[] bArr, int i10, int i11) {
            if (this.f79287c) {
                int i12 = this.f79290f;
                int i13 = (i10 + 1) - i12;
                if (i13 >= i11) {
                    this.f79290f = i12 + (i11 - i10);
                } else {
                    this.f79288d = ((bArr[i13] & 192) >> 6) == 0;
                    this.f79287c = false;
                }
            }
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public void b(long j10, int i10, boolean z10) {
            if (this.f79289e == 182 && z10 && this.f79286b) {
                long j11 = this.f79292h;
                if (j11 != -9223372036854775807L) {
                    this.f79285a.c(j11, this.f79288d ? 1 : 0, (int) (j10 - this.f79291g), i10, null);
                }
            }
            if (this.f79289e != 179) {
                this.f79291g = j10;
            }
        }

        public void c(int i10, long j10) {
            this.f79289e = i10;
            this.f79288d = false;
            this.f79286b = i10 == 182 || i10 == 179;
            this.f79287c = i10 == 182;
            this.f79290f = 0;
            this.f79292h = j10;
        }

        public void d() {
            this.f79286b = false;
            this.f79287c = false;
            this.f79288d = false;
            this.f79289e = -1;
        }
    }

    public o(@Nullable k0 k0Var) {
        this.f79268a = k0Var;
        if (k0Var != null) {
            this.f79272e = new u(178, 128);
            this.f79269b = new s7.a0();
        } else {
            this.f79272e = null;
            this.f79269b = null;
        }
    }

    public static com.google.android.exoplayer2.m c(a aVar, int i10, String str) {
        byte[] bArrCopyOf = Arrays.copyOf(aVar.f79284e, aVar.f79282c);
        s7.z zVar = new s7.z(bArrCopyOf);
        zVar.s(i10);
        zVar.s(4);
        zVar.q();
        zVar.r(8);
        if (zVar.g()) {
            zVar.r(4);
            zVar.r(3);
        }
        int iH = zVar.h(4);
        float f10 = 1.0f;
        if (iH == 15) {
            int iH2 = zVar.h(8);
            int iH3 = zVar.h(8);
            if (iH3 == 0) {
                s7.q.i("H263Reader", "Invalid aspect ratio");
            } else {
                f10 = iH2 / iH3;
            }
        } else {
            float[] fArr = f79267l;
            if (iH < fArr.length) {
                f10 = fArr[iH];
            } else {
                s7.q.i("H263Reader", "Invalid aspect ratio");
            }
        }
        if (zVar.g()) {
            zVar.r(2);
            zVar.r(1);
            if (zVar.g()) {
                zVar.r(15);
                zVar.q();
                zVar.r(15);
                zVar.q();
                zVar.r(15);
                zVar.q();
                zVar.r(3);
                zVar.r(11);
                zVar.q();
                zVar.r(15);
                zVar.q();
            }
        }
        if (zVar.h(2) != 0) {
            s7.q.i("H263Reader", "Unhandled video object layer shape");
        }
        zVar.q();
        int iH4 = zVar.h(16);
        zVar.q();
        if (zVar.g()) {
            if (iH4 == 0) {
                s7.q.i("H263Reader", "Invalid vop_increment_time_resolution");
            } else {
                int i11 = 0;
                for (int i12 = iH4 - 1; i12 > 0; i12 >>= 1) {
                    i11++;
                }
                zVar.r(i11);
            }
        }
        zVar.q();
        int iH5 = zVar.h(13);
        zVar.q();
        int iH6 = zVar.h(13);
        zVar.q();
        zVar.q();
        return new m.b().S(str).e0("video/mp4v-es").j0(iH5).Q(iH6).a0(f10).T(Collections.singletonList(bArrCopyOf)).E();
    }

    @Override // s6.m
    public void a(s7.a0 a0Var) {
        s7.a.i(this.f79273f);
        s7.a.i(this.f79276i);
        int iE = a0Var.e();
        int iF = a0Var.f();
        byte[] bArrD = a0Var.d();
        this.f79274g += (long) a0Var.a();
        this.f79276i.e(a0Var, a0Var.a());
        while (true) {
            int iC = s7.v.c(bArrD, iE, iF, this.f79270c);
            if (iC == iF) {
                break;
            }
            int i10 = iC + 3;
            int i11 = a0Var.d()[i10] & 255;
            int i12 = iC - iE;
            int i13 = 0;
            if (!this.f79277j) {
                if (i12 > 0) {
                    this.f79271d.a(bArrD, iE, iC);
                }
                if (this.f79271d.b(i11, i12 < 0 ? -i12 : 0)) {
                    i6.b0 b0Var = this.f79276i;
                    a aVar = this.f79271d;
                    b0Var.b(c(aVar, aVar.f79283d, (String) s7.a.e(this.f79275h)));
                    this.f79277j = true;
                }
            }
            this.f79273f.a(bArrD, iE, iC);
            u uVar = this.f79272e;
            if (uVar != null) {
                if (i12 > 0) {
                    uVar.a(bArrD, iE, iC);
                } else {
                    i13 = -i12;
                }
                if (this.f79272e.b(i13)) {
                    u uVar2 = this.f79272e;
                    ((s7.a0) m0.j(this.f79269b)).N(this.f79272e.f79411d, s7.v.q(uVar2.f79411d, uVar2.f79412e));
                    ((k0) m0.j(this.f79268a)).a(this.f79278k, this.f79269b);
                }
                if (i11 == 178 && a0Var.d()[iC + 2] == 1) {
                    this.f79272e.e(i11);
                }
            }
            int i14 = iF - iC;
            this.f79273f.b(this.f79274g - ((long) i14), i14, this.f79277j);
            this.f79273f.c(i11, this.f79278k);
            iE = i10;
        }
        if (!this.f79277j) {
            this.f79271d.a(bArrD, iE, iF);
        }
        this.f79273f.a(bArrD, iE, iF);
        u uVar3 = this.f79272e;
        if (uVar3 != null) {
            uVar3.a(bArrD, iE, iF);
        }
    }

    @Override // s6.m
    public void b(i6.m mVar, i0.d dVar) {
        dVar.a();
        this.f79275h = dVar.b();
        i6.b0 b0VarTrack = mVar.track(dVar.c(), 2);
        this.f79276i = b0VarTrack;
        this.f79273f = new b(b0VarTrack);
        k0 k0Var = this.f79268a;
        if (k0Var != null) {
            k0Var.b(mVar, dVar);
        }
    }

    @Override // s6.m
    public void packetFinished() {
    }

    @Override // s6.m
    public void packetStarted(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.f79278k = j10;
        }
    }

    @Override // s6.m
    public void seek() {
        s7.v.a(this.f79270c);
        this.f79271d.c();
        b bVar = this.f79273f;
        if (bVar != null) {
            bVar.d();
        }
        u uVar = this.f79272e;
        if (uVar != null) {
            uVar.d();
        }
        this.f79274g = 0L;
        this.f79278k = -9223372036854775807L;
    }
}
