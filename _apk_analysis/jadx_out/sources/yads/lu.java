package yads;

import android.net.Uri;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public final class lu implements ns2, rx2, yf1, cg1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f92092b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f92093c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final mx0[] f92094d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean[] f92095e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b30 f92096f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final qx2 f92097g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final bn1 f92098h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ae0 f92099i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final fg1 f92100j = new fg1("ChunkSampleStream");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final gu f92101k = new gu();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f92102l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List f92103m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ms2 f92104n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ms2[] f92105o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final lo f92106p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public cu f92107q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public mx0 f92108r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ku f92109s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f92110t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f92111u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f92112v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public jo f92113w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f92114x;

    public lu(int i10, int[] iArr, mx0[] mx0VarArr, nc0 nc0Var, qx2 qx2Var, qe qeVar, long j10, sk0 sk0Var, ok0 ok0Var, ae0 ae0Var, bn1 bn1Var) {
        this.f92092b = i10;
        this.f92093c = iArr;
        this.f92094d = mx0VarArr;
        this.f92096f = nc0Var;
        this.f92097g = qx2Var;
        this.f92098h = bn1Var;
        this.f92099i = ae0Var;
        ArrayList arrayList = new ArrayList();
        this.f92102l = arrayList;
        this.f92103m = Collections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.f92105o = new ms2[length];
        this.f92095e = new boolean[length];
        int i11 = length + 1;
        int[] iArr2 = new int[i11];
        ms2[] ms2VarArr = new ms2[i11];
        ms2 ms2VarA = ms2.a(qeVar, sk0Var, ok0Var);
        this.f92104n = ms2VarA;
        int i12 = 0;
        iArr2[0] = i10;
        ms2VarArr[0] = ms2VarA;
        while (i12 < length) {
            ms2 ms2VarA2 = ms2.a(qeVar);
            this.f92105o[i12] = ms2VarA2;
            int i13 = i12 + 1;
            ms2VarArr[i13] = ms2VarA2;
            iArr2[i13] = this.f92093c[i12];
            i12 = i13;
        }
        this.f92106p = new lo(iArr2, ms2VarArr);
        this.f92110t = j10;
        this.f92111u = j10;
    }

    public final int a(int i10, int i11) {
        do {
            i11++;
            if (i11 >= this.f92102l.size()) {
                return this.f92102l.size() - 1;
            }
        } while (((jo) this.f92102l.get(i11)).a(0) <= i10);
        return i11 - 1;
    }

    @Override // yads.ns2
    public final int a(long j10) {
        if (c()) {
            return 0;
        }
        int iA = this.f92104n.a(j10, this.f92114x);
        jo joVar = this.f92113w;
        if (joVar != null) {
            int iA2 = joVar.a(0);
            ms2 ms2Var = this.f92104n;
            iA = Math.min(iA, iA2 - (ms2Var.f92547q + ms2Var.f92549s));
        }
        ms2 ms2Var2 = this.f92104n;
        synchronized (ms2Var2) {
            if (iA >= 0) {
                int i10 = ms2Var2.f92549s + iA;
                if (i10 <= ms2Var2.f92546p) {
                    ms2Var2.f92549s = i10;
                }
            }
            throw new IllegalArgumentException();
        }
        d();
        return iA;
    }

    @Override // yads.ns2
    public final int a(nx0 nx0Var, sa0 sa0Var, int i10) {
        if (c()) {
            return -3;
        }
        jo joVar = this.f92113w;
        if (joVar != null) {
            int iA = joVar.a(0);
            ms2 ms2Var = this.f92104n;
            if (iA <= ms2Var.f92547q + ms2Var.f92549s) {
                return -3;
            }
        }
        d();
        return this.f92104n.a(nx0Var, sa0Var, i10, this.f92114x);
    }

    public final jo a(int i10) {
        jo joVar = (jo) this.f92102l.get(i10);
        ArrayList arrayList = this.f92102l;
        int size = arrayList.size();
        int i11 = ib3.f90737a;
        if (i10 < 0 || size > arrayList.size() || i10 > size) {
            throw new IllegalArgumentException();
        }
        if (i10 != size) {
            arrayList.subList(i10, size).clear();
        }
        this.f92112v = Math.max(this.f92112v, this.f92102l.size());
        int i12 = 0;
        this.f92104n.c(joVar.a(0));
        while (true) {
            ms2[] ms2VarArr = this.f92105o;
            if (i12 >= ms2VarArr.length) {
                return joVar;
            }
            ms2 ms2Var = ms2VarArr[i12];
            i12++;
            ms2Var.c(joVar.a(i12));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01c8  */
    @Override // yads.yf1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final yads.zf1 a(yads.bg1 r20, long r21, long r23, java.io.IOException r25, int r26) {
        /*
            Method dump skipped, instruction units count: 772
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.lu.a(yads.bg1, long, long, java.io.IOException, int):yads.zf1");
    }

    @Override // yads.ns2
    public final void a() throws IOException {
        this.f92100j.a(Integer.MIN_VALUE);
        ms2 ms2Var = this.f92104n;
        mk0 mk0Var = ms2Var.f92538h;
        if (mk0Var != null && mk0Var.getState() == 1) {
            lk0 lk0VarC = ms2Var.f92538h.c();
            lk0VarC.getClass();
            throw lk0VarC;
        }
        if (this.f92100j.b()) {
            return;
        }
        nc0 nc0Var = (nc0) this.f92096f;
        zo zoVar = nc0Var.f92814l;
        if (zoVar != null) {
            throw zoVar;
        }
        nc0Var.f92803a.a();
    }

    @Override // yads.yf1
    public final void a(bg1 bg1Var, long j10, long j11) {
        hu huVarB;
        cu cuVar = (cu) bg1Var;
        this.f92107q = null;
        nc0 nc0Var = (nc0) this.f92096f;
        nc0Var.getClass();
        if (cuVar instanceof r61) {
            int iA = nc0Var.f92811i.a(((r61) cuVar).f88608d);
            lc0 lc0Var = nc0Var.f92810h[iA];
            if (lc0Var.f91927d == null && (huVarB = ((ar) lc0Var.f91924a).b()) != null) {
                lc0[] lc0VarArr = nc0Var.f92810h;
                lo2 lo2Var = lc0Var.f91925b;
                lc0VarArr[iA] = new lc0(lc0Var.f91928e, lo2Var, lc0Var.f91926c, lc0Var.f91924a, lc0Var.f91929f, new k30(huVarB, lo2Var.f92051c));
            }
        }
        te2 te2Var = nc0Var.f92809g;
        if (te2Var != null) {
            long j12 = te2Var.f95186d;
            if (j12 == -9223372036854775807L || cuVar.f88612h > j12) {
                te2Var.f95186d = cuVar.f88612h;
            }
            te2Var.f95187e.f95631h = true;
        }
        long j13 = cuVar.f88605a;
        Uri uri = cuVar.f88613i.f94279c;
        vf1 vf1Var = new vf1();
        this.f92099i.getClass();
        bn1 bn1Var = this.f92098h;
        bn1Var.b(vf1Var, new hm1(cuVar.f88607c, this.f92092b, cuVar.f88608d, cuVar.f88609e, cuVar.f88610f, bn1Var.a(cuVar.f88611g), bn1Var.a(cuVar.f88612h)));
        this.f92097g.a(this);
    }

    @Override // yads.yf1
    public final void a(bg1 bg1Var, long j10, long j11, boolean z10) {
        cu cuVar = (cu) bg1Var;
        this.f92107q = null;
        this.f92113w = null;
        long j12 = cuVar.f88605a;
        Uri uri = cuVar.f88613i.f94279c;
        vf1 vf1Var = new vf1();
        this.f92099i.getClass();
        bn1 bn1Var = this.f92098h;
        bn1Var.a(vf1Var, new hm1(cuVar.f88607c, this.f92092b, cuVar.f88608d, cuVar.f88609e, cuVar.f88610f, bn1Var.a(cuVar.f88611g), bn1Var.a(cuVar.f88612h)));
        if (z10) {
            return;
        }
        if (c()) {
            this.f92104n.b(false);
            for (ms2 ms2Var : this.f92105o) {
                ms2Var.b(false);
            }
        } else if (cuVar instanceof jo) {
            a(this.f92102l.size() - 1);
            if (this.f92102l.isEmpty()) {
                this.f92110t = this.f92111u;
            }
        }
        this.f92097g.a(this);
    }

    @Override // yads.cg1
    public final void b() {
        ms2 ms2Var = this.f92104n;
        ms2Var.b(true);
        ms2Var.d();
        for (ms2 ms2Var2 : this.f92105o) {
            ms2Var2.b(true);
            ms2Var2.d();
        }
        for (lc0 lc0Var : ((nc0) this.f92096f).f92810h) {
            fu fuVar = lc0Var.f91924a;
            if (fuVar != null) {
                ((ar) fuVar).f87780b.release();
            }
        }
        ku kuVar = this.f92109s;
        if (kuVar != null) {
            h30 h30Var = (h30) kuVar;
            synchronized (h30Var) {
                te2 te2Var = (te2) h30Var.f90220o.remove(this);
                if (te2Var != null) {
                    ms2 ms2Var3 = te2Var.f95183a;
                    ms2Var3.b(true);
                    ms2Var3.d();
                }
            }
        }
    }

    public final boolean b(int i10) {
        ms2 ms2Var;
        jo joVar = (jo) this.f92102l.get(i10);
        ms2 ms2Var2 = this.f92104n;
        if (ms2Var2.f92547q + ms2Var2.f92549s > joVar.a(0)) {
            return true;
        }
        int i11 = 0;
        do {
            ms2[] ms2VarArr = this.f92105o;
            if (i11 >= ms2VarArr.length) {
                return false;
            }
            ms2Var = ms2VarArr[i11];
            i11++;
        } while (ms2Var.f92547q + ms2Var.f92549s <= joVar.a(i11));
        return true;
    }

    public final boolean c() {
        return this.f92110t != -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02bb  */
    @Override // yads.rx2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean continueLoading(long r65) {
        /*
            Method dump skipped, instruction units count: 1308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.lu.continueLoading(long):boolean");
    }

    public final void d() {
        ms2 ms2Var = this.f92104n;
        int iA = a(ms2Var.f92547q + ms2Var.f92549s, this.f92112v - 1);
        while (true) {
            int i10 = this.f92112v;
            if (i10 > iA) {
                return;
            }
            this.f92112v = i10 + 1;
            jo joVar = (jo) this.f92102l.get(i10);
            mx0 mx0Var = joVar.f88608d;
            if (!mx0Var.equals(this.f92108r)) {
                bn1 bn1Var = this.f92098h;
                bn1Var.a(new hm1(1, this.f92092b, mx0Var, joVar.f88609e, joVar.f88610f, bn1Var.a(joVar.f88611g), -9223372036854775807L));
            }
            this.f92108r = mx0Var;
        }
    }

    @Override // yads.rx2
    public final long getBufferedPositionUs() {
        long j10;
        if (this.f92114x) {
            return Long.MIN_VALUE;
        }
        if (c()) {
            return this.f92110t;
        }
        long jMax = this.f92111u;
        ArrayList arrayList = this.f92102l;
        jo joVar = (jo) arrayList.get(arrayList.size() - 1);
        if (!joVar.d()) {
            if (this.f92102l.size() > 1) {
                joVar = (jo) this.f92102l.get(r2.size() - 2);
            } else {
                joVar = null;
            }
        }
        if (joVar != null) {
            jMax = Math.max(jMax, joVar.f88612h);
        }
        ms2 ms2Var = this.f92104n;
        synchronized (ms2Var) {
            j10 = ms2Var.f92552v;
        }
        return Math.max(jMax, j10);
    }

    @Override // yads.rx2
    public final long getNextLoadPositionUs() {
        if (c()) {
            return this.f92110t;
        }
        if (this.f92114x) {
            return Long.MIN_VALUE;
        }
        return ((jo) this.f92102l.get(r0.size() - 1)).f88612h;
    }

    @Override // yads.rx2
    public final boolean isLoading() {
        return this.f92100j.b();
    }

    @Override // yads.ns2
    public final boolean isReady() {
        return !c() && this.f92104n.a(this.f92114x);
    }

    @Override // yads.rx2
    public final void reevaluateBuffer(long j10) {
        if (this.f92100j.f89573c == null && !c()) {
            if (this.f92100j.b()) {
                cu cuVar = this.f92107q;
                cuVar.getClass();
                boolean z10 = cuVar instanceof jo;
                if (z10 && b(this.f92102l.size() - 1)) {
                    return;
                }
                b30 b30Var = this.f92096f;
                List list = this.f92103m;
                nc0 nc0Var = (nc0) b30Var;
                if (nc0Var.f92814l == null && nc0Var.f92811i.a(j10, cuVar, list)) {
                    ag1 ag1Var = this.f92100j.f89572b;
                    if (ag1Var == null) {
                        throw new IllegalStateException();
                    }
                    ag1Var.a(false);
                    if (z10) {
                        this.f92113w = (jo) cuVar;
                        return;
                    }
                    return;
                }
                return;
            }
            b30 b30Var2 = this.f92096f;
            List list2 = this.f92103m;
            nc0 nc0Var2 = (nc0) b30Var2;
            int size = (nc0Var2.f92814l != null || nc0Var2.f92811i.f() < 2) ? list2.size() : nc0Var2.f92811i.a(j10, list2);
            if (size < this.f92102l.size()) {
                if (!(!this.f92100j.b())) {
                    throw new IllegalStateException();
                }
                int size2 = this.f92102l.size();
                while (true) {
                    if (size >= size2) {
                        size = -1;
                        break;
                    } else if (!b(size)) {
                        break;
                    } else {
                        size++;
                    }
                }
                if (size == -1) {
                    return;
                }
                long j11 = ((jo) this.f92102l.get(r2.size() - 1)).f88612h;
                jo joVarA = a(size);
                if (this.f92102l.isEmpty()) {
                    this.f92110t = this.f92111u;
                }
                this.f92114x = false;
                bn1 bn1Var = this.f92098h;
                bn1Var.b(new hm1(1, this.f92092b, null, 3, null, bn1Var.a(joVarA.f88611g), bn1Var.a(j11)));
            }
        }
    }
}
