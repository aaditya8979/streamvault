package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls;

import android.os.Handler;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.player.exoplayer2.source.r;
import com.fyber.inneractive.sdk.player.exoplayer2.source.s;
import com.fyber.inneractive.sdk.player.exoplayer2.source.v;
import com.fyber.inneractive.sdk.player.exoplayer2.source.y;
import com.fyber.inneractive.sdk.player.exoplayer2.source.z;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class i implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.k f17514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f17515b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.source.f f17517d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.b f17518e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f17522i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public r f17523j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f17524k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f17525l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public z f17526m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public n[] f17527n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public n[] f17528o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.source.h f17529p;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f17516c = 3;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final IdentityHashMap f17519f = new IdentityHashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final o f17520g = new o();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Handler f17521h = new Handler();

    public i(com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.k kVar, b bVar, com.fyber.inneractive.sdk.player.exoplayer2.source.f fVar, com.fyber.inneractive.sdk.player.exoplayer2.upstream.b bVar2, long j10) {
        this.f17514a = kVar;
        this.f17515b = bVar;
        this.f17517d = fVar;
        this.f17518e = bVar2;
        this.f17522i = j10;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.s
    public final long a(long j10) {
        this.f17520g.f17563a.clear();
        for (n nVar : this.f17528o) {
            nVar.c(j10);
        }
        return j10;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.s
    public final long a(com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b[] bVarArr, boolean[] zArr, v[] vVarArr, boolean[] zArr2, long j10) {
        long j11;
        ArrayList arrayList;
        int i10;
        int i11;
        com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b[] bVarArr2;
        ArrayList arrayList2;
        v[] vVarArr2 = vVarArr;
        int[] iArr = new int[bVarArr.length];
        int[] iArr2 = new int[bVarArr.length];
        for (int i12 = 0; i12 < bVarArr.length; i12++) {
            v vVar = vVarArr2[i12];
            iArr[i12] = vVar == null ? -1 : ((Integer) this.f17519f.get(vVar)).intValue();
            iArr2[i12] = -1;
            com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b bVar = bVarArr[i12];
            if (bVar != null) {
                y yVar = bVar.f18585a;
                int i13 = 0;
                while (true) {
                    n[] nVarArr = this.f17527n;
                    if (i13 < nVarArr.length) {
                        z zVar = nVarArr[i13].f17557t;
                        int i14 = 0;
                        while (true) {
                            if (i14 >= zVar.f18577a) {
                                i14 = -1;
                                break;
                            }
                            if (zVar.f18578b[i14] == yVar) {
                                break;
                            }
                            i14++;
                        }
                        if (i14 != -1) {
                            iArr2[i12] = i13;
                            break;
                        }
                        i13++;
                    }
                }
            }
        }
        this.f17519f.clear();
        int length = bVarArr.length;
        v[] vVarArr3 = new v[length];
        v[] vVarArr4 = new v[bVarArr.length];
        int length2 = bVarArr.length;
        com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b[] bVarArr3 = new com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b[length2];
        ArrayList arrayList3 = new ArrayList(this.f17527n.length);
        int i15 = 0;
        boolean z10 = false;
        while (i15 < this.f17527n.length) {
            for (int i16 = 0; i16 < bVarArr.length; i16++) {
                vVarArr4[i16] = iArr[i16] == i15 ? vVarArr2[i16] : null;
                bVarArr3[i16] = iArr2[i16] == i15 ? bVarArr[i16] : null;
            }
            n nVar = this.f17527n[i15];
            boolean z11 = !this.f17525l;
            if (!nVar.f17552o) {
                throw new IllegalStateException();
            }
            for (int i17 = 0; i17 < length2; i17++) {
                v vVar2 = vVarArr4[i17];
                if (vVar2 != null && (bVarArr3[i17] == null || !zArr[i17])) {
                    int i18 = ((k) vVar2).f17535a;
                    boolean[] zArr3 = nVar.f17559v;
                    if (!zArr3[i18]) {
                        throw new IllegalStateException();
                    }
                    zArr3[i18] = false;
                    nVar.f17553p--;
                    ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) nVar.f17547j.valueAt(i18)).b();
                    vVarArr4[i17] = null;
                }
            }
            com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b bVar2 = null;
            int i19 = 0;
            boolean z12 = false;
            while (i19 < length2) {
                if (vVarArr4[i19] == null) {
                    i11 = length2;
                    com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b bVar3 = bVarArr3[i19];
                    if (bVar3 != null) {
                        z zVar2 = nVar.f17557t;
                        bVarArr2 = bVarArr3;
                        y yVar2 = bVar3.f18585a;
                        i10 = length;
                        arrayList2 = arrayList3;
                        int i20 = 0;
                        while (true) {
                            if (i20 >= zVar2.f18577a) {
                                i20 = -1;
                                break;
                            }
                            if (zVar2.f18578b[i20] == yVar2) {
                                break;
                            }
                            i20++;
                        }
                        boolean[] zArr4 = nVar.f17559v;
                        if (zArr4[i20]) {
                            throw new IllegalStateException();
                        }
                        zArr4[i20] = true;
                        nVar.f17553p++;
                        if (i20 == nVar.f17558u) {
                            nVar.f17540c.f17496p = bVar3;
                            bVar2 = bVar3;
                        }
                        vVarArr4[i19] = new k(nVar, i20);
                        zArr2[i19] = true;
                        z12 = true;
                        i19++;
                        length2 = i11;
                        bVarArr3 = bVarArr2;
                        length = i10;
                        arrayList3 = arrayList2;
                    } else {
                        i10 = length;
                    }
                } else {
                    i10 = length;
                    i11 = length2;
                }
                bVarArr2 = bVarArr3;
                arrayList2 = arrayList3;
                i19++;
                length2 = i11;
                bVarArr3 = bVarArr2;
                length = i10;
                arrayList3 = arrayList2;
            }
            int i21 = length;
            int i22 = length2;
            com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b[] bVarArr4 = bVarArr3;
            ArrayList arrayList4 = arrayList3;
            if (z11) {
                int size = nVar.f17547j.size();
                for (int i23 = 0; i23 < size; i23++) {
                    if (!nVar.f17559v[i23]) {
                        ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) nVar.f17547j.valueAt(i23)).b();
                    }
                }
                if (bVar2 != null && !nVar.f17548k.isEmpty()) {
                    bVar2.d();
                    if (bVar2.f18587c[bVar2.a()] != nVar.f17540c.f17486f.a(((h) nVar.f17548k.getLast()).f18493c)) {
                        nVar.c(nVar.f17560w);
                    }
                }
            }
            if (nVar.f17553p == 0) {
                nVar.f17540c.f17490j = null;
                nVar.f17554q = null;
                nVar.f17548k.clear();
                if (nVar.f17544g.a()) {
                    nVar.f17544g.f18604b.a(false);
                }
            }
            z10 |= z12;
            boolean z13 = false;
            for (int i24 = 0; i24 < bVarArr.length; i24++) {
                if (iArr2[i24] == i15) {
                    v vVar3 = vVarArr4[i24];
                    if (vVar3 == null) {
                        throw new IllegalStateException();
                    }
                    vVarArr3[i24] = vVar3;
                    this.f17519f.put(vVarArr4[i24], Integer.valueOf(i15));
                    z13 = true;
                } else if (iArr[i24] == i15 && vVarArr4[i24] != null) {
                    throw new IllegalStateException();
                }
            }
            if (z13) {
                arrayList = arrayList4;
                arrayList.add(this.f17527n[i15]);
            } else {
                arrayList = arrayList4;
            }
            i15++;
            vVarArr2 = vVarArr;
            arrayList3 = arrayList;
            length2 = i22;
            bVarArr3 = bVarArr4;
            length = i21;
        }
        ArrayList arrayList5 = arrayList3;
        System.arraycopy(vVarArr3, 0, vVarArr2, 0, length);
        n[] nVarArr2 = new n[arrayList5.size()];
        this.f17528o = nVarArr2;
        arrayList5.toArray(nVarArr2);
        n[] nVarArr3 = this.f17528o;
        if (nVarArr3.length > 0) {
            nVarArr3[0].f17540c.f17488h = true;
            int i25 = 1;
            while (true) {
                n[] nVarArr4 = this.f17528o;
                if (i25 >= nVarArr4.length) {
                    break;
                }
                nVarArr4[i25].f17540c.f17488h = false;
                i25++;
            }
        }
        this.f17529p = new com.fyber.inneractive.sdk.player.exoplayer2.source.h(this.f17528o);
        if (this.f17525l && z10) {
            j11 = j10;
            a(j11);
            for (int i26 = 0; i26 < bVarArr.length; i26++) {
                if (vVarArr2[i26] != null) {
                    zArr2[i26] = true;
                }
            }
        } else {
            j11 = j10;
        }
        this.f17525l = true;
        return j11;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.s
    public final z a() {
        return this.f17526m;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.s
    public final void a(r rVar) {
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVar;
        this.f17514a.f17645g.add(this);
        this.f17523j = rVar;
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b bVar = this.f17514a.f17648j;
        ArrayList arrayList = new ArrayList(bVar.f17574b);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        char c10 = 0;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a aVar = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a) arrayList.get(i10);
            com.fyber.inneractive.sdk.player.exoplayer2.o oVar = aVar.f17573b;
            if (oVar.f18458k > 0) {
                arrayList2.add(aVar);
                break;
                break;
            }
            String str = oVar.f18450c;
            if (!TextUtils.isEmpty(str)) {
                for (String str2 : str.split("(\\s*,\\s*)|(\\s*$)")) {
                    if (str2.startsWith("avc")) {
                        arrayList2.add(aVar);
                        break;
                    }
                }
            }
            String str3 = aVar.f17573b.f18450c;
            if (!TextUtils.isEmpty(str3)) {
                String[] strArrSplit = str3.split("(\\s*,\\s*)|(\\s*$)");
                int length = strArrSplit.length;
                int i11 = 0;
                while (true) {
                    if (i11 >= length) {
                        break;
                    }
                    if (strArrSplit[i11].startsWith("mp4a")) {
                        arrayList3.add(aVar);
                        break;
                    }
                    i11++;
                }
            }
        }
        if (!arrayList2.isEmpty()) {
            arrayList = arrayList2;
        } else if (arrayList3.size() < arrayList.size()) {
            arrayList.removeAll(arrayList3);
        }
        List list = bVar.f17575c;
        List list2 = bVar.f17576d;
        int size = list2.size() + list.size() + 1;
        this.f17527n = new n[size];
        this.f17524k = size;
        if (!(!arrayList.isEmpty())) {
            throw new IllegalArgumentException();
        }
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a[] aVarArr = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a[arrayList.size()];
        arrayList.toArray(aVarArr);
        com.fyber.inneractive.sdk.player.exoplayer2.o oVar2 = bVar.f17577e;
        f fVar = new f(this.f17514a, aVarArr, this.f17515b, this.f17520g, bVar.f17578f);
        n nVar = new n(0, this, fVar, this.f17518e, this.f17522i, oVar2, this.f17516c, this.f17517d);
        this.f17527n[0] = nVar;
        fVar.f17488h = true;
        if (!nVar.f17552o) {
            nVar.b(nVar.f17560w);
        }
        int i12 = 0;
        int i13 = 1;
        while (i12 < list.size()) {
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a[] aVarArr2 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a[1];
            aVarArr2[c10] = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a) list.get(i12);
            n nVar2 = new n(1, this, new f(this.f17514a, aVarArr2, this.f17515b, this.f17520g, Collections.emptyList()), this.f17518e, this.f17522i, null, this.f17516c, this.f17517d);
            int i14 = i13 + 1;
            this.f17527n[i13] = nVar2;
            if (!nVar2.f17552o) {
                nVar2.b(nVar2.f17560w);
            }
            i12++;
            i13 = i14;
            c10 = 0;
        }
        int i15 = 0;
        while (i15 < list2.size()) {
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a aVar2 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a) list2.get(i15);
            f fVar2 = new f(this.f17514a, new com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a[]{aVar2}, this.f17515b, this.f17520g, Collections.emptyList());
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.b bVar2 = this.f17518e;
            n nVar3 = new n(3, this, fVar2, bVar2, this.f17522i, null, this.f17516c, this.f17517d);
            com.fyber.inneractive.sdk.player.exoplayer2.o oVar3 = aVar2.f17573b;
            if (nVar3.f17547j.indexOfKey(0) >= 0) {
                gVar = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) nVar3.f17547j.get(0);
            } else {
                gVar = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.g(bVar2);
                gVar.f17466n = nVar3;
                gVar.f17455c.f17427r = nVar3.f17555r;
                nVar3.f17547j.put(0, gVar);
            }
            gVar.a(oVar3);
            nVar3.f17551n = true;
            nVar3.h();
            this.f17527n[i13] = nVar3;
            i15++;
            i13++;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.w
    public final boolean b(long j10) {
        return this.f17529p.b(j10);
    }

    /*  JADX ERROR: NullPointerException in pass: LoopRegionVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.use(jadx.core.dex.instructions.args.RegisterArg)" because "ssaVar" is null
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:506)
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:509)
        */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.s
    public final long c() {
        /*
            r16 = this;
            r0 = r16
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.n[] r1 = r0.f17528o
            int r2 = r1.length
            r6 = 0
            r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        Lb:
            r9 = -9223372036854775808
            if (r6 >= r2) goto L7a
            r11 = r1[r6]
            boolean r12 = r11.f17562y
            if (r12 == 0) goto L17
            r12 = r9
            goto L6f
        L17:
            long r12 = r11.f17561x
            r14 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r14 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r14 == 0) goto L23
            goto L6f
        L23:
            long r12 = r11.f17560w
            java.util.LinkedList r14 = r11.f17548k
            java.lang.Object r14 = r14.getLast()
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.h r14 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.h) r14
            boolean r15 = r14.F
            if (r15 == 0) goto L32
            goto L4b
        L32:
            java.util.LinkedList r14 = r11.f17548k
            int r14 = r14.size()
            r15 = 1
            if (r14 <= r15) goto L4a
            java.util.LinkedList r14 = r11.f17548k
            int r15 = r14.size()
            int r15 = r15 + (-2)
            java.lang.Object r14 = r14.get(r15)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.h r14 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.h) r14
            goto L4b
        L4a:
            r14 = 0
        L4b:
            if (r14 == 0) goto L53
            long r14 = r14.f18497g
            long r12 = java.lang.Math.max(r12, r14)
        L53:
            android.util.SparseArray r14 = r11.f17547j
            int r14 = r14.size()
            r15 = 0
        L5a:
            if (r15 >= r14) goto L6f
            android.util.SparseArray r3 = r11.f17547j
            java.lang.Object r3 = r3.valueAt(r15)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.g r3 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) r3
            long r4 = r3.d()
            long r12 = java.lang.Math.max(r12, r4)
            int r15 = r15 + 1
            goto L5a
        L6f:
            int r3 = (r12 > r9 ? 1 : (r12 == r9 ? 0 : -1))
            if (r3 == 0) goto L77
            long r7 = java.lang.Math.min(r7, r12)
        L77:
            int r6 = r6 + 1
            goto Lb
        L7a:
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r1 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r1 != 0) goto L84
            r7 = r9
        L84:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.i.c():long");
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.s
    public final void d() throws IOException {
        n[] nVarArr = this.f17527n;
        if (nVarArr != null) {
            for (n nVar : nVarArr) {
                nVar.f17544g.b();
                f fVar = nVar.f17540c;
                com.fyber.inneractive.sdk.player.exoplayer2.source.g gVar = fVar.f17490j;
                if (gVar != null) {
                    throw gVar;
                }
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a aVar = fVar.f17491k;
                if (aVar != null) {
                    com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.h hVar = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.h) fVar.f17485e.f17642d.get(aVar);
                    hVar.f17629b.b();
                    IOException iOException = hVar.f17637j;
                    if (iOException != null) {
                        throw iOException;
                    }
                }
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.w
    public final long f() {
        return this.f17529p.f();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.s
    public final long g() {
        return -9223372036854775807L;
    }
}
