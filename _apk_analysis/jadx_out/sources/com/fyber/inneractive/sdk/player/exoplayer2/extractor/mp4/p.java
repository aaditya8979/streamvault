package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4;

import android.support.v4.media.session.PlaybackStateCompat;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import java.io.EOFException;
import java.util.Stack;

/* JADX INFO: loaded from: classes2.dex */
public final class p implements com.fyber.inneractive.sdk.player.exoplayer2.extractor.i, com.fyber.inneractive.sdk.player.exoplayer2.extractor.q {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f17902p = z.a("qt  ");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f17907e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f17908f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f17909g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f17910h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.util.n f17911i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f17912j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f17913k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.j f17914l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public o[] f17915m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f17916n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f17917o;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f17905c = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(16);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Stack f17906d = new Stack();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f17903a = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(com.fyber.inneractive.sdk.player.exoplayer2.util.l.f18786a);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f17904b = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(4);

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
    public final int a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar, com.fyber.inneractive.sdk.player.exoplayer2.extractor.o oVar) throws InterruptedException, com.fyber.inneractive.sdk.player.exoplayer2.r, EOFException {
        o[] oVarArr;
        int i10;
        boolean z10;
        boolean z11;
        while (true) {
            int i11 = this.f17907e;
            if (i11 == 0) {
                if (this.f17910h == 0) {
                    if (!bVar.b(this.f17905c.f18794a, 0, 8, true)) {
                        return -1;
                    }
                    this.f17910h = 8;
                    this.f17905c.e(0);
                    this.f17909g = this.f17905c.k();
                    this.f17908f = this.f17905c.b();
                }
                if (this.f17909g == 1) {
                    bVar.b(this.f17905c.f18794a, 8, 8, false);
                    this.f17910h += 8;
                    this.f17909g = this.f17905c.n();
                }
                int i12 = this.f17908f;
                if (i12 == c.C || i12 == c.E || i12 == c.F || i12 == c.G || i12 == c.H || i12 == c.Q) {
                    long j10 = (bVar.f17401c + this.f17909g) - ((long) this.f17910h);
                    this.f17906d.add(new a(this.f17908f, j10));
                    if (this.f17909g == this.f17910h) {
                        c(j10);
                    } else {
                        this.f17907e = 0;
                        this.f17910h = 0;
                    }
                } else if (i12 != c.S && i12 != c.D && i12 != c.T && i12 != c.U && i12 != c.f17776m0 && i12 != c.f17778n0 && i12 != c.f17780o0 && i12 != c.R && i12 != c.f17782p0 && i12 != c.f17784q0 && i12 != c.f17786r0 && i12 != c.f17788s0 && i12 != c.f17790t0 && i12 != c.P && i12 != c.f17753b && i12 != c.A0) {
                    this.f17911i = null;
                    this.f17907e = 1;
                } else {
                    if (this.f17910h != 8) {
                        throw new IllegalStateException();
                    }
                    long j11 = this.f17909g;
                    if (j11 > 2147483647L) {
                        throw new IllegalStateException();
                    }
                    com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = new com.fyber.inneractive.sdk.player.exoplayer2.util.n((int) j11);
                    this.f17911i = nVar;
                    System.arraycopy(this.f17905c.f18794a, 0, nVar.f18794a, 0, 8);
                    this.f17907e = 1;
                }
            } else {
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException();
                    }
                    long j12 = Long.MAX_VALUE;
                    int i13 = -1;
                    int i14 = 0;
                    while (true) {
                        oVarArr = this.f17915m;
                        if (i14 >= oVarArr.length) {
                            break;
                        }
                        o oVar2 = oVarArr[i14];
                        int i15 = oVar2.f17901d;
                        v vVar = oVar2.f17899b;
                        if (i15 != vVar.f17950a) {
                            long j13 = vVar.f17951b[i15];
                            if (j13 < j12) {
                                i13 = i14;
                                j12 = j13;
                            }
                        }
                        i14++;
                    }
                    if (i13 == -1) {
                        return -1;
                    }
                    o oVar3 = oVarArr[i13];
                    com.fyber.inneractive.sdk.player.exoplayer2.extractor.r rVar = oVar3.f17900c;
                    int i16 = oVar3.f17901d;
                    v vVar2 = oVar3.f17899b;
                    long j14 = vVar2.f17951b[i16];
                    int i17 = vVar2.f17952c[i16];
                    if (oVar3.f17898a.f17925g == 1) {
                        j14 += 8;
                        i17 -= 8;
                    }
                    int i18 = i17;
                    long j15 = (j14 - bVar.f17401c) + ((long) this.f17912j);
                    if (j15 < 0 || j15 >= PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
                        oVar.f17970a = j14;
                        return 1;
                    }
                    bVar.a((int) j15);
                    int i19 = oVar3.f17898a.f17929k;
                    if (i19 == 0) {
                        while (true) {
                            int i20 = this.f17912j;
                            i10 = i18;
                            if (i20 >= i10) {
                                break;
                            }
                            int iA = rVar.a(bVar, i10 - i20, false);
                            this.f17912j += iA;
                            this.f17913k -= iA;
                            i18 = i10;
                        }
                    } else {
                        byte[] bArr = this.f17904b.f18794a;
                        boolean z12 = false;
                        bArr[0] = 0;
                        bArr[1] = 0;
                        bArr[2] = 0;
                        int i21 = 4 - i19;
                        i10 = i18;
                        while (this.f17912j < i10) {
                            int i22 = this.f17913k;
                            if (i22 == 0) {
                                bVar.b(this.f17904b.f18794a, i21, i19, z12);
                                this.f17904b.e(z12 ? 1 : 0);
                                this.f17913k = this.f17904b.m();
                                this.f17903a.e(z12 ? 1 : 0);
                                rVar.a(4, this.f17903a);
                                this.f17912j += 4;
                                i10 += i21;
                            } else {
                                int iA2 = rVar.a(bVar, i22, z12);
                                this.f17912j += iA2;
                                this.f17913k -= iA2;
                                z12 = false;
                            }
                        }
                    }
                    v vVar3 = oVar3.f17899b;
                    rVar.a(vVar3.f17954e[i16], vVar3.f17955f[i16], i10, 0, null);
                    oVar3.f17901d++;
                    this.f17912j = 0;
                    this.f17913k = 0;
                    return 0;
                }
                long j16 = this.f17909g;
                int i23 = this.f17910h;
                long j17 = j16 - ((long) i23);
                long j18 = bVar.f17401c + j17;
                com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar2 = this.f17911i;
                if (nVar2 != null) {
                    bVar.b(nVar2.f18794a, i23, (int) j17, false);
                    if (this.f17908f == c.f17753b) {
                        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar3 = this.f17911i;
                        nVar3.e(8);
                        if (nVar3.b() == f17902p) {
                            z11 = true;
                            this.f17917o = z11;
                        } else {
                            nVar3.e(nVar3.f18795b + 4);
                            while (nVar3.f18796c - nVar3.f18795b > 0) {
                                if (nVar3.b() == f17902p) {
                                    z11 = true;
                                    break;
                                }
                            }
                            z11 = false;
                            this.f17917o = z11;
                        }
                    } else if (!this.f17906d.isEmpty()) {
                        ((a) this.f17906d.peek()).Q0.add(new b(this.f17908f, this.f17911i));
                    }
                } else if (j17 < PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
                    bVar.a((int) j17);
                } else {
                    oVar.f17970a = j18;
                    z10 = true;
                    c(j18);
                    if (z10 && this.f17907e != 2) {
                        return 1;
                    }
                }
                z10 = false;
                c(j18);
                if (z10) {
                    continue;
                }
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final long a(long j10) {
        int i10;
        long j11 = Long.MAX_VALUE;
        for (o oVar : this.f17915m) {
            v vVar = oVar.f17899b;
            int iA = z.a(vVar.f17954e, j10, false);
            while (true) {
                i10 = -1;
                if (iA < 0) {
                    iA = -1;
                    break;
                }
                if ((vVar.f17955f[iA] & 1) != 0) {
                    break;
                }
                iA--;
            }
            if (iA != -1) {
                i10 = iA;
                break;
            }
            iA = z.a(vVar.f17954e, j10, true, false);
            while (iA < vVar.f17954e.length) {
                if ((vVar.f17955f[iA] & 1) != 0) {
                    i10 = iA;
                    break;
                }
                iA++;
            }
            long j12 = vVar.f17951b[i10];
            if (j12 < j11) {
                j11 = j12;
            }
        }
        return j11;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(long j10, long j11) {
        int i10;
        this.f17906d.clear();
        this.f17910h = 0;
        this.f17912j = 0;
        this.f17913k = 0;
        if (j10 == 0) {
            this.f17907e = 0;
            this.f17910h = 0;
            return;
        }
        o[] oVarArr = this.f17915m;
        if (oVarArr != null) {
            for (o oVar : oVarArr) {
                v vVar = oVar.f17899b;
                int iA = z.a(vVar.f17954e, j11, false);
                while (true) {
                    i10 = -1;
                    if (iA < 0) {
                        iA = -1;
                        break;
                    } else if ((vVar.f17955f[iA] & 1) != 0) {
                        break;
                    } else {
                        iA--;
                    }
                }
                if (iA != -1) {
                    i10 = iA;
                    break;
                    break;
                }
                iA = z.a(vVar.f17954e, j11, true, false);
                while (iA < vVar.f17954e.length) {
                    if ((vVar.f17955f[iA] & 1) != 0) {
                        i10 = iA;
                        break;
                    }
                    iA++;
                }
                oVar.f17901d = i10;
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar) {
        this.f17914l = jVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final boolean a() {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final boolean a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar) {
        return r.a(bVar, false);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final long c() {
        return this.f17916n;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x04f9  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x058c  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x062c  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x07b1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(long r73) throws com.fyber.inneractive.sdk.player.exoplayer2.r {
        /*
            Method dump skipped, instruction units count: 2500
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.p.c(long):void");
    }
}
