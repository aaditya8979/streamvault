package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv;

import android.util.SparseArray;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.i;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.j;
import com.fyber.inneractive.sdk.player.exoplayer2.r;
import com.fyber.inneractive.sdk.player.exoplayer2.util.l;
import com.fyber.inneractive.sdk.player.exoplayer2.util.n;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Locale;
import java.util.UUID;

/* JADX INFO: loaded from: classes10.dex */
public final class e implements i {
    public static final byte[] Z = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final byte[] f17691a0 = {32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32};

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final UUID f17692b0 = new UUID(72057594037932032L, -9223371306706625679L);
    public long A;
    public com.fyber.inneractive.sdk.player.exoplayer2.util.g B;
    public com.fyber.inneractive.sdk.player.exoplayer2.util.g C;
    public boolean D;
    public int E;
    public long F;
    public long G;
    public int H;
    public int I;
    public int[] J;
    public int K;
    public int L;
    public int M;
    public int N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public byte S;
    public int T;
    public int U;
    public int V;
    public boolean W;
    public boolean X;
    public j Y;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f17693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f17694b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SparseArray f17695c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f17696d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final n f17697e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n f17698f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final n f17699g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final n f17700h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final n f17701i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final n f17702j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final n f17703k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final n f17704l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final n f17705m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ByteBuffer f17706n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f17707o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f17708p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f17709q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f17710r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f17711s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public d f17712t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f17713u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f17714v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f17715w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f17716x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f17717y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f17718z;

    public e() {
        b bVar = new b();
        this.f17708p = -1L;
        this.f17709q = -9223372036854775807L;
        this.f17710r = -9223372036854775807L;
        this.f17711s = -9223372036854775807L;
        this.f17717y = -1L;
        this.f17718z = -1L;
        this.A = -9223372036854775807L;
        this.f17693a = bVar;
        bVar.f17660d = new c(this);
        this.f17696d = true;
        this.f17694b = new g();
        this.f17695c = new SparseArray();
        this.f17699g = new n(4);
        this.f17700h = new n(ByteBuffer.allocate(4).putInt(-1).array());
        this.f17701i = new n(4);
        this.f17697e = new n(l.f18786a);
        this.f17698f = new n(4);
        this.f17702j = new n();
        this.f17703k = new n();
        this.f17704l = new n(8);
        this.f17705m = new n();
    }

    /* JADX WARN: Code restructure failed: missing block: B:343:0x0661, code lost:
    
        throw new com.fyber.inneractive.sdk.player.exoplayer2.r("EBML lacing sample size out of range.");
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0576  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0584  */
    /* JADX WARN: Removed duplicated region for block: B:441:0x0815  */
    /* JADX WARN: Type inference failed for: r4v132 */
    /* JADX WARN: Type inference failed for: r4v89, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v93 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b r27, com.fyber.inneractive.sdk.player.exoplayer2.extractor.o r28) throws java.lang.InterruptedException, com.fyber.inneractive.sdk.player.exoplayer2.r, java.io.EOFException {
        /*
            Method dump skipped, instruction units count: 3256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.e.a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b, com.fyber.inneractive.sdk.player.exoplayer2.extractor.o):int");
    }

    public final long a(long j10) throws r {
        long j11 = this.f17709q;
        if (j11 != -9223372036854775807L) {
            return z.a(j10, j11, 1000L);
        }
        throw new r("Can't scale timecode prior to timecodeScale being set.");
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(long j10, long j11) {
        this.A = -9223372036854775807L;
        this.E = 0;
        b bVar = this.f17693a;
        bVar.f17661e = 0;
        bVar.f17658b.clear();
        g gVar = bVar.f17659c;
        gVar.f17723b = 0;
        gVar.f17724c = 0;
        g gVar2 = this.f17694b;
        gVar2.f17723b = 0;
        gVar2.f17724c = 0;
        this.N = 0;
        this.V = 0;
        this.U = 0;
        this.O = false;
        this.P = false;
        this.R = false;
        this.T = 0;
        this.S = (byte) 0;
        this.Q = false;
        n nVar = this.f17702j;
        nVar.f18795b = 0;
        nVar.f18796c = 0;
    }

    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar, int i10) throws InterruptedException, EOFException {
        n nVar = this.f17699g;
        if (nVar.f18796c >= i10) {
            return;
        }
        if (nVar.a() < i10) {
            n nVar2 = this.f17699g;
            byte[] bArr = nVar2.f18794a;
            byte[] bArrCopyOf = Arrays.copyOf(bArr, Math.max(bArr.length * 2, i10));
            int i11 = this.f17699g.f18796c;
            nVar2.f18794a = bArrCopyOf;
            nVar2.f18796c = i11;
            nVar2.f18795b = 0;
        }
        n nVar3 = this.f17699g;
        byte[] bArr2 = nVar3.f18794a;
        int i12 = nVar3.f18796c;
        bVar.b(bArr2, i12, i10 - i12, false);
        this.f17699g.d(i10);
    }

    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar, d dVar, int i10) throws InterruptedException, r, EOFException {
        int iA;
        int iA2;
        int i11;
        if ("S_TEXT/UTF8".equals(dVar.f17665a)) {
            byte[] bArr = Z;
            int i12 = i10 + 32;
            if (this.f17703k.a() < i12) {
                this.f17703k.f18794a = Arrays.copyOf(bArr, i12 + i10);
            }
            bVar.b(this.f17703k.f18794a, 32, i10, false);
            this.f17703k.e(0);
            this.f17703k.d(i12);
            return;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.r rVar = dVar.O;
        if (!this.O) {
            if (dVar.f17669e) {
                this.M &= -1073741825;
                if (!this.P) {
                    bVar.b(this.f17699g.f18794a, 0, 1, false);
                    this.N++;
                    byte b10 = this.f17699g.f18794a[0];
                    if ((b10 & 128) == 128) {
                        throw new r("Extension bit is set in signal byte");
                    }
                    this.S = b10;
                    this.P = true;
                }
                byte b11 = this.S;
                if ((b11 & 1) == 1) {
                    boolean z10 = (b11 & 2) == 2;
                    this.M |= 1073741824;
                    if (!this.Q) {
                        bVar.b(this.f17704l.f18794a, 0, 8, false);
                        this.N += 8;
                        this.Q = true;
                        n nVar = this.f17699g;
                        nVar.f18794a[0] = (byte) ((z10 ? 128 : 0) | 8);
                        nVar.e(0);
                        rVar.a(1, this.f17699g);
                        this.V++;
                        this.f17704l.e(0);
                        rVar.a(8, this.f17704l);
                        this.V += 8;
                    }
                    if (z10) {
                        if (!this.R) {
                            bVar.b(this.f17699g.f18794a, 0, 1, false);
                            this.N++;
                            this.f17699g.e(0);
                            this.T = this.f17699g.j();
                            this.R = true;
                        }
                        int i13 = this.T * 4;
                        this.f17699g.c(i13);
                        bVar.b(this.f17699g.f18794a, 0, i13, false);
                        this.N += i13;
                        short s10 = (short) ((this.T / 2) + 1);
                        int i14 = (s10 * 6) + 2;
                        ByteBuffer byteBuffer = this.f17706n;
                        if (byteBuffer == null || byteBuffer.capacity() < i14) {
                            this.f17706n = ByteBuffer.allocate(i14);
                        }
                        this.f17706n.position(0);
                        this.f17706n.putShort(s10);
                        int i15 = 0;
                        int i16 = 0;
                        while (true) {
                            i11 = this.T;
                            if (i15 >= i11) {
                                break;
                            }
                            int iM = this.f17699g.m();
                            if (i15 % 2 == 0) {
                                this.f17706n.putShort((short) (iM - i16));
                            } else {
                                this.f17706n.putInt(iM - i16);
                            }
                            i15++;
                            i16 = iM;
                        }
                        int i17 = (i10 - this.N) - i16;
                        if (i11 % 2 == 1) {
                            this.f17706n.putInt(i17);
                        } else {
                            this.f17706n.putShort((short) i17);
                            this.f17706n.putInt(0);
                        }
                        n nVar2 = this.f17705m;
                        nVar2.f18794a = this.f17706n.array();
                        nVar2.f18796c = i14;
                        nVar2.f18795b = 0;
                        rVar.a(i14, this.f17705m);
                        this.V += i14;
                    }
                }
            } else {
                byte[] bArr2 = dVar.f17670f;
                if (bArr2 != null) {
                    n nVar3 = this.f17702j;
                    int length = bArr2.length;
                    nVar3.f18794a = bArr2;
                    nVar3.f18796c = length;
                    nVar3.f18795b = 0;
                }
            }
            this.O = true;
        }
        int i18 = i10 + this.f17702j.f18796c;
        if (!"V_MPEG4/ISO/AVC".equals(dVar.f17665a) && !"V_MPEGH/ISO/HEVC".equals(dVar.f17665a)) {
            while (true) {
                int i19 = this.N;
                if (i19 >= i18) {
                    break;
                }
                int i20 = i18 - i19;
                n nVar4 = this.f17702j;
                int i21 = nVar4.f18796c - nVar4.f18795b;
                if (i21 > 0) {
                    iA2 = Math.min(i20, i21);
                    rVar.a(iA2, this.f17702j);
                } else {
                    iA2 = rVar.a(bVar, i20, false);
                }
                this.N += iA2;
                this.V += iA2;
            }
        } else {
            byte[] bArr3 = this.f17698f.f18794a;
            bArr3[0] = 0;
            bArr3[1] = 0;
            bArr3[2] = 0;
            int i22 = dVar.P;
            int i23 = 4 - i22;
            while (this.N < i18) {
                int i24 = this.U;
                if (i24 == 0) {
                    n nVar5 = this.f17702j;
                    int iMin = Math.min(i22, nVar5.f18796c - nVar5.f18795b);
                    bVar.b(bArr3, i23 + iMin, i22 - iMin, false);
                    if (iMin > 0) {
                        this.f17702j.a(bArr3, i23, iMin);
                    }
                    this.N += i22;
                    this.f17698f.e(0);
                    this.U = this.f17698f.m();
                    this.f17697e.e(0);
                    rVar.a(4, this.f17697e);
                    this.V += 4;
                } else {
                    n nVar6 = this.f17702j;
                    int i25 = nVar6.f18796c - nVar6.f18795b;
                    if (i25 > 0) {
                        iA = Math.min(i24, i25);
                        rVar.a(iA, this.f17702j);
                    } else {
                        iA = rVar.a(bVar, i24, false);
                    }
                    this.N += iA;
                    this.V += iA;
                    this.U = i24 - iA;
                }
            }
        }
        if ("A_VORBIS".equals(dVar.f17665a)) {
            this.f17700h.e(0);
            rVar.a(4, this.f17700h);
            this.V += 4;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(j jVar) {
        this.Y = jVar;
    }

    public final void a(d dVar, long j10) {
        byte[] bArrB;
        if ("S_TEXT/UTF8".equals(dVar.f17665a)) {
            byte[] bArr = this.f17703k.f18794a;
            long j11 = this.G;
            if (j11 == -9223372036854775807L) {
                bArrB = f17691a0;
            } else {
                int i10 = (int) (j11 / 3600000000L);
                long j12 = j11 - (((long) i10) * 3600000000L);
                int i11 = (int) (j12 / 60000000);
                long j13 = j12 - ((long) (60000000 * i11));
                int i12 = (int) (j13 / 1000000);
                bArrB = z.b(String.format(Locale.US, "%02d:%02d:%02d,%03d", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf((int) ((j13 - ((long) (1000000 * i12))) / 1000))));
            }
            System.arraycopy(bArrB, 0, bArr, 19, 12);
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.r rVar = dVar.O;
            n nVar = this.f17703k;
            rVar.a(nVar.f18796c, nVar);
            this.V += this.f17703k.f18796c;
        }
        dVar.O.a(j10, this.M, this.V, 0, dVar.f17671g);
        this.W = true;
        this.N = 0;
        this.V = 0;
        this.U = 0;
        this.O = false;
        this.P = false;
        this.R = false;
        this.T = 0;
        this.S = (byte) 0;
        this.Q = false;
        n nVar2 = this.f17702j;
        nVar2.f18795b = 0;
        nVar2.f18796c = 0;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final boolean a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar) throws InterruptedException, EOFException {
        f fVar = new f();
        long j10 = bVar.f17400b;
        long j11 = 1024;
        if (j10 != -1 && j10 <= 1024) {
            j11 = j10;
        }
        int i10 = (int) j11;
        bVar.a(fVar.f17719a.f18794a, 0, 4, false);
        fVar.f17720b = 4;
        for (long jK = fVar.f17719a.k(); jK != 440786851; jK = ((jK << 8) & (-256)) | ((long) (fVar.f17719a.f18794a[0] & 255))) {
            int i11 = fVar.f17720b + 1;
            fVar.f17720b = i11;
            if (i11 == i10) {
                return false;
            }
            bVar.a(fVar.f17719a.f18794a, 0, 1, false);
        }
        long jA = fVar.a(bVar);
        long j12 = fVar.f17720b;
        if (jA == Long.MIN_VALUE) {
            return false;
        }
        if (j10 != -1 && j12 + jA >= j10) {
            return false;
        }
        while (true) {
            long j13 = fVar.f17720b;
            long j14 = j12 + jA;
            if (j13 >= j14) {
                return j13 == j14;
            }
            if (fVar.a(bVar) == Long.MIN_VALUE) {
                return false;
            }
            long jA2 = fVar.a(bVar);
            if (jA2 < 0 || jA2 > 2147483647L) {
                return false;
            }
            if (jA2 != 0) {
                bVar.a((int) jA2, false);
                fVar.f17720b = (int) (((long) fVar.f17720b) + jA2);
            }
        }
    }
}
