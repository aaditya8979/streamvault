package yads;

import android.util.SparseArray;
import java.util.List;
import yads.ar;
import yads.fu;
import yads.m73;
import yads.mx0;
import yads.ye2;

/* JADX INFO: loaded from: classes3.dex */
public final class ar implements pq0, fu {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final du f87778k = new du() { // from class: bt.b
        @Override // yads.du
        public final fu a(int i10, mx0 mx0Var, boolean z10, List list, m73 m73Var, ye2 ye2Var) {
            return ar.a(i10, mx0Var, z10, list, m73Var, ye2Var);
        }
    };

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final gg2 f87779l = new gg2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mq0 f87780b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f87781c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final mx0 f87782d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SparseArray f87783e = new SparseArray();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f87784f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public eu f87785g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f87786h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public vw2 f87787i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public mx0[] f87788j;

    public ar(mq0 mq0Var, int i10, mx0 mx0Var) {
        this.f87780b = mq0Var;
        this.f87781c = i10;
        this.f87782d = mx0Var;
    }

    public static fu a(int i10, mx0 mx0Var, boolean z10, List list, m73 m73Var, ye2 ye2Var) {
        mq0 sx0Var;
        String str = mx0Var.f92609l;
        if (ht1.e(str)) {
            return null;
        }
        if (str != null && (str.startsWith("video/webm") || str.startsWith("audio/webm") || str.startsWith("application/webm") || str.startsWith("video/x-matroska") || str.startsWith("audio/x-matroska") || str.startsWith("application/x-matroska"))) {
            sx0Var = new zi1(new jd0(), 1);
        } else {
            sx0Var = new sx0(z10 ? 4 : 0, list, m73Var);
        }
        return new ar(sx0Var, i10, mx0Var);
    }

    @Override // yads.pq0
    public final m73 a(int i10, int i11) {
        m73 al0Var;
        zq zqVar = (zq) this.f87783e.get(i10);
        if (zqVar == null) {
            if (this.f87788j != null) {
                throw new IllegalStateException();
            }
            zqVar = new zq(i10, i11, i11 == this.f87781c ? this.f87782d : null);
            eu euVar = this.f87785g;
            long j10 = this.f87786h;
            if (euVar == null) {
                zqVar.f97747e = zqVar.f97745c;
            } else {
                zqVar.f97748f = j10;
                lo loVar = (lo) euVar;
                int i12 = 0;
                while (true) {
                    int[] iArr = loVar.f92047a;
                    if (i12 >= iArr.length) {
                        ih1.b("BaseMediaChunkOutput", "Unmatched track of type: " + i11);
                        al0Var = new al0();
                        break;
                    }
                    if (i11 == iArr[i12]) {
                        al0Var = loVar.f92048b[i12];
                        break;
                    }
                    i12++;
                }
                zqVar.f97747e = al0Var;
                mx0 mx0Var = zqVar.f97746d;
                if (mx0Var != null) {
                    al0Var.a(mx0Var);
                }
            }
            this.f87783e.put(i10, zqVar);
        }
        return zqVar;
    }

    @Override // yads.pq0
    public final void a() {
        mx0[] mx0VarArr = new mx0[this.f87783e.size()];
        for (int i10 = 0; i10 < this.f87783e.size(); i10++) {
            mx0 mx0Var = ((zq) this.f87783e.valueAt(i10)).f97746d;
            if (mx0Var == null) {
                throw new IllegalStateException();
            }
            mx0VarArr[i10] = mx0Var;
        }
        this.f87788j = mx0VarArr;
    }

    public final void a(eu euVar, long j10, long j11) {
        m73 al0Var;
        this.f87785g = euVar;
        this.f87786h = j11;
        if (!this.f87784f) {
            this.f87780b.a(this);
            if (j10 != -9223372036854775807L) {
                this.f87780b.seek(0L, j10);
            }
            this.f87784f = true;
            return;
        }
        mq0 mq0Var = this.f87780b;
        if (j10 == -9223372036854775807L) {
            j10 = 0;
        }
        mq0Var.seek(0L, j10);
        for (int i10 = 0; i10 < this.f87783e.size(); i10++) {
            zq zqVar = (zq) this.f87783e.valueAt(i10);
            if (euVar == null) {
                zqVar.f97747e = zqVar.f97745c;
            } else {
                zqVar.f97748f = j11;
                int i11 = zqVar.f97743a;
                lo loVar = (lo) euVar;
                int i12 = 0;
                while (true) {
                    int[] iArr = loVar.f92047a;
                    if (i12 >= iArr.length) {
                        ih1.b("BaseMediaChunkOutput", "Unmatched track of type: " + i11);
                        al0Var = new al0();
                        break;
                    }
                    if (i11 == iArr[i12]) {
                        al0Var = loVar.f92048b[i12];
                        break;
                    }
                    i12++;
                }
                zqVar.f97747e = al0Var;
                mx0 mx0Var = zqVar.f97746d;
                if (mx0Var != null) {
                    al0Var.a(mx0Var);
                }
            }
        }
    }

    @Override // yads.pq0
    public final void a(vw2 vw2Var) {
        this.f87787i = vw2Var;
    }

    public final hu b() {
        vw2 vw2Var = this.f87787i;
        if (vw2Var instanceof hu) {
            return (hu) vw2Var;
        }
        return null;
    }

    public final void c() {
        this.f87780b.release();
    }
}
