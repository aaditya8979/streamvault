package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class b0 implements com.fyber.inneractive.sdk.player.exoplayer2.extractor.i {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final long f18066l = com.fyber.inneractive.sdk.player.exoplayer2.util.z.a("AC-3");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final long f18067m = com.fyber.inneractive.sdk.player.exoplayer2.util.z.a("EAC3");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final long f18068n = com.fyber.inneractive.sdk.player.exoplayer2.util.z.a("HEVC");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f18070b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f18071c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SparseIntArray f18072d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e f18073e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final SparseArray f18074f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final SparseBooleanArray f18075g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.j f18076h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f18077i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f18078j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public f0 f18079k;

    public b0(int i10, com.fyber.inneractive.sdk.player.exoplayer2.util.v vVar, e eVar) {
        this.f18073e = eVar;
        this.f18069a = i10;
        if (i10 == 1 || i10 == 2) {
            this.f18070b = Collections.singletonList(vVar);
        } else {
            ArrayList arrayList = new ArrayList();
            this.f18070b = arrayList;
            arrayList.add(vVar);
        }
        this.f18071c = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(940);
        this.f18075g = new SparseBooleanArray();
        this.f18074f = new SparseArray();
        this.f18072d = new SparseIntArray();
        a();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final int a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar, com.fyber.inneractive.sdk.player.exoplayer2.extractor.o oVar) throws InterruptedException, EOFException {
        f0 f0Var;
        int iMin;
        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = this.f18071c;
        byte[] bArr = nVar.f18794a;
        int i10 = nVar.f18795b;
        if (940 - i10 < 188) {
            int i11 = nVar.f18796c - i10;
            if (i11 > 0) {
                System.arraycopy(bArr, i10, bArr, 0, i11);
            }
            com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar2 = this.f18071c;
            nVar2.f18794a = bArr;
            nVar2.f18796c = i11;
            nVar2.f18795b = 0;
        }
        while (true) {
            com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar3 = this.f18071c;
            int i12 = nVar3.f18796c;
            int i13 = nVar3.f18795b;
            if (i12 - i13 >= 188) {
                while (i13 < i12 && bArr[i13] != 71) {
                    i13++;
                }
                this.f18071c.e(i13);
                int i14 = i13 + 188;
                if (i14 > i12) {
                    return 0;
                }
                int iB = this.f18071c.b();
                if ((8388608 & iB) != 0) {
                    this.f18071c.e(i14);
                    return 0;
                }
                boolean z10 = true;
                boolean z11 = (4194304 & iB) != 0;
                int i15 = (2096896 & iB) >> 8;
                boolean z12 = (iB & 32) != 0;
                boolean z13 = (iB & 16) != 0;
                if (this.f18069a != 2) {
                    int i16 = iB & 15;
                    int i17 = this.f18072d.get(i15, i16 - 1);
                    this.f18072d.put(i15, i16);
                    if (i17 == i16) {
                        if (z13) {
                            this.f18071c.e(i14);
                            return 0;
                        }
                    } else if (i16 == ((i17 + 1) & 15)) {
                    }
                    z10 = false;
                } else {
                    z10 = false;
                }
                if (z12) {
                    int iJ = this.f18071c.j();
                    com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar4 = this.f18071c;
                    nVar4.e(nVar4.f18795b + iJ);
                }
                if (z13 && (f0Var = (f0) this.f18074f.get(i15)) != null) {
                    if (z10) {
                        f0Var.a();
                    }
                    this.f18071c.d(i14);
                    f0Var.a(this.f18071c, z11);
                    this.f18071c.d(i12);
                }
                this.f18071c.e(i14);
                return 0;
            }
            int i18 = 940 - i12;
            int i19 = bVar.f17404f;
            if (i19 == 0) {
                iMin = 0;
            } else {
                iMin = Math.min(i19, i18);
                System.arraycopy(bVar.f17402d, 0, bArr, i12, iMin);
                bVar.b(iMin);
            }
            if (iMin == 0) {
                iMin = bVar.a(bArr, i12, i18, 0, true);
            }
            if (iMin != -1) {
                bVar.f17401c += (long) iMin;
            }
            if (iMin == -1) {
                return -1;
            }
            this.f18071c.d(i12 + iMin);
        }
    }

    public final void a() {
        this.f18075g.clear();
        this.f18074f.clear();
        this.f18073e.getClass();
        SparseArray sparseArray = new SparseArray();
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f18074f.put(sparseArray.keyAt(i10), (f0) sparseArray.valueAt(i10));
        }
        this.f18074f.put(0, new w(new z(this)));
        this.f18079k = null;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(long j10, long j11) {
        int size = this.f18070b.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((com.fyber.inneractive.sdk.player.exoplayer2.util.v) this.f18070b.get(i10)).f18820c = -9223372036854775807L;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = this.f18071c;
        nVar.f18795b = 0;
        nVar.f18796c = 0;
        this.f18072d.clear();
        a();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar) {
        this.f18076h = jVar;
        jVar.a(new com.fyber.inneractive.sdk.player.exoplayer2.extractor.p(-9223372036854775807L));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0021, code lost:
    
        r2 = r2 + 1;
     */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b r7) throws java.lang.InterruptedException, java.io.EOFException {
        /*
            r6 = this;
            com.fyber.inneractive.sdk.player.exoplayer2.util.n r0 = r6.f18071c
            byte[] r0 = r0.f18794a
            r1 = 0
            r2 = 940(0x3ac, float:1.317E-42)
            r7.a(r0, r1, r2, r1)
            r2 = r1
        Lb:
            r3 = 188(0xbc, float:2.63E-43)
            if (r2 >= r3) goto L27
            r3 = r1
        L10:
            r4 = 5
            if (r3 != r4) goto L18
            r7.a(r2)
            r7 = 1
            return r7
        L18:
            int r4 = r3 * 188
            int r4 = r4 + r2
            r4 = r0[r4]
            r5 = 71
            if (r4 == r5) goto L24
            int r2 = r2 + 1
            goto Lb
        L24:
            int r3 = r3 + 1
            goto L10
        L27:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.b0.a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b):boolean");
    }
}
