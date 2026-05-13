package yads;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ec extends to {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final im f89191g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f89192h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f89193i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f89194j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f89195k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f89196l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final float f89197m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final float f89198n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final p51 f89199o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final xv f89200p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f89201q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f89202r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f89203s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f89204t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public jo f89205u;

    public ec(h73 h73Var, int[] iArr, int i10, im imVar, long j10, long j11, long j12, int i11, int i12, float f10, float f11, p51 p51Var, xv xvVar) {
        im imVar2;
        long j13;
        super(h73Var, iArr);
        if (j12 < j10) {
            ih1.d("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            imVar2 = imVar;
            j13 = j10;
        } else {
            imVar2 = imVar;
            j13 = j12;
        }
        this.f89191g = imVar2;
        this.f89192h = j10 * 1000;
        this.f89193i = j11 * 1000;
        this.f89194j = j13 * 1000;
        this.f89195k = i11;
        this.f89196l = i12;
        this.f89197m = f10;
        this.f89198n = f11;
        this.f89199o = p51.a((Collection) p51Var);
        this.f89200p = xvVar;
        this.f89201q = 1.0f;
        this.f89203s = 0;
        this.f89204t = -9223372036854775807L;
    }

    public static sm2 a(mp0[] mp0VarArr) {
        int i10;
        int[] iArr;
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            i10 = 1;
            if (i12 >= mp0VarArr.length) {
                break;
            }
            mp0 mp0Var = mp0VarArr[i12];
            if (mp0Var == null || mp0Var.f92495b.length <= 1) {
                arrayList.add(null);
            } else {
                l51 l51VarF = p51.f();
                l51VarF.a(new cc(0L, 0L));
                arrayList.add(l51VarF);
            }
            i12++;
        }
        int length = mp0VarArr.length;
        long[][] jArr = new long[length][];
        for (int i13 = 0; i13 < mp0VarArr.length; i13++) {
            mp0 mp0Var2 = mp0VarArr[i13];
            if (mp0Var2 == null) {
                jArr[i13] = new long[0];
            } else {
                jArr[i13] = new long[mp0Var2.f92495b.length];
                int i14 = 0;
                while (true) {
                    if (i14 >= mp0Var2.f92495b.length) {
                        break;
                    }
                    jArr[i13][i14] = mp0Var2.f92494a.f90271e[r11[i14]].f92606i;
                    i14++;
                }
                Arrays.sort(jArr[i13]);
            }
        }
        int[] iArr2 = new int[length];
        long[] jArr2 = new long[length];
        for (int i15 = 0; i15 < length; i15++) {
            long[] jArr3 = jArr[i15];
            jArr2[i15] = jArr3.length == 0 ? 0L : jArr3[0];
        }
        a(arrayList, jArr2);
        y72 y72Var = y72.f97019b;
        y72Var.getClass();
        sx1 sx1VarB = new nx1(y72Var).a().b();
        int i16 = 0;
        while (i16 < length) {
            long[] jArr4 = jArr[i16];
            if (jArr4.length <= i10) {
                iArr = iArr2;
            } else {
                int length2 = jArr4.length;
                double[] dArr = new double[length2];
                int i17 = i11;
                while (true) {
                    long[] jArr5 = jArr[i16];
                    double dLog = 0.0d;
                    if (i17 >= jArr5.length) {
                        break;
                    }
                    int[] iArr3 = iArr2;
                    long j10 = jArr5[i17];
                    if (j10 != -1) {
                        dLog = Math.log(j10);
                    }
                    dArr[i17] = dLog;
                    i17++;
                    iArr2 = iArr3;
                }
                iArr = iArr2;
                int i18 = length2 - 1;
                double d10 = dArr[i18] - dArr[i11];
                int i19 = i11;
                while (i19 < i18) {
                    double d11 = dArr[i19];
                    i19++;
                    sx1VarB.a(Double.valueOf(d10 == 0.0d ? 1.0d : (((d11 + dArr[i19]) * 0.5d) - dArr[i11]) / d10), Integer.valueOf(i16));
                    i11 = 0;
                }
            }
            i16++;
            iArr2 = iArr;
            i11 = 0;
            i10 = 1;
        }
        int[] iArr4 = iArr2;
        d0 d0Var = sx1VarB.f89037d;
        if (d0Var == null) {
            d0Var = new d0(sx1VarB);
            sx1VarB.f89037d = d0Var;
        }
        p51 p51VarA = p51.a((Collection) d0Var);
        for (int i20 = 0; i20 < p51VarA.size(); i20++) {
            int iIntValue = ((Integer) p51VarA.get(i20)).intValue();
            int i21 = iArr4[iIntValue] + 1;
            iArr4[iIntValue] = i21;
            jArr2[iIntValue] = jArr[iIntValue][i21];
            a(arrayList, jArr2);
        }
        for (int i22 = 0; i22 < mp0VarArr.length; i22++) {
            if (arrayList.get(i22) != null) {
                jArr2[i22] = jArr2[i22] * 2;
            }
        }
        a(arrayList, jArr2);
        l51 l51VarF2 = p51.f();
        for (int i23 = 0; i23 < arrayList.size(); i23++) {
            l51 l51Var = (l51) arrayList.get(i23);
            l51VarF2.a((Object) (l51Var == null ? p51.g() : l51Var.a()));
        }
        return l51VarF2.a();
    }

    public static void a(ArrayList arrayList, long[] jArr) {
        long j10 = 0;
        for (long j11 : jArr) {
            j10 += j11;
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            l51 l51Var = (l51) arrayList.get(i10);
            if (l51Var != null) {
                l51Var.a(new cc(j10, jArr[i10]));
            }
        }
    }

    public final int a(long j10) {
        long j11;
        dc0 dc0Var = (dc0) this.f89191g;
        synchronized (dc0Var) {
            j11 = dc0Var.f88810l;
        }
        long j12 = (long) (j11 * this.f89197m);
        this.f89191g.getClass();
        long j13 = (long) (j12 / this.f89201q);
        if (!this.f89199o.isEmpty()) {
            int i10 = 1;
            while (i10 < this.f89199o.size() - 1 && ((cc) this.f89199o.get(i10)).f88407a < j13) {
                i10++;
            }
            cc ccVar = (cc) this.f89199o.get(i10 - 1);
            cc ccVar2 = (cc) this.f89199o.get(i10);
            long j14 = ccVar.f88407a;
            long j15 = ccVar.f88408b;
            j13 = j15 + ((long) (((j13 - j14) / (ccVar2.f88407a - j14)) * (ccVar2.f88408b - j15)));
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f95302b; i12++) {
            if (j10 == Long.MIN_VALUE || !b(i12, j10)) {
                if (a(i12).f92606i <= j13) {
                    return i12;
                }
                i11 = i12;
            }
        }
        return i11;
    }

    @Override // yads.to, yads.op0
    public final int a(long j10, List list) {
        int i10;
        int i11;
        ((f53) this.f89200p).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j11 = this.f89204t;
        if (j11 != -9223372036854775807L && jElapsedRealtime - j11 < 1000 && (list.isEmpty() || ((jo) vd1.a(list)).equals(this.f89205u))) {
            return list.size();
        }
        this.f89204t = jElapsedRealtime;
        this.f89205u = list.isEmpty() ? null : (jo) vd1.a(list);
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long jRound = ((jo) list.get(size - 1)).f88611g - j10;
        float f10 = this.f89201q;
        int i12 = ib3.f90737a;
        if (f10 != 1.0f) {
            jRound = Math.round(jRound / ((double) f10));
        }
        long j12 = this.f89194j;
        if (jRound < j12) {
            return size;
        }
        if (!list.isEmpty()) {
            long j13 = ((jo) vd1.a(list)).f88611g;
        }
        mx0 mx0Var = this.f95304d[a(jElapsedRealtime)];
        for (int i13 = 0; i13 < size; i13++) {
            jo joVar = (jo) list.get(i13);
            mx0 mx0Var2 = joVar.f88608d;
            long jRound2 = joVar.f88611g - j10;
            float f11 = this.f89201q;
            if (f11 != 1.0f) {
                jRound2 = Math.round(jRound2 / ((double) f11));
            }
            if (jRound2 >= j12 && mx0Var2.f92606i < mx0Var.f92606i && (i10 = mx0Var2.f92616s) != -1 && i10 <= this.f89196l && (i11 = mx0Var2.f92615r) != -1 && i11 <= this.f89195k && i10 < mx0Var.f92616s) {
                return i13;
            }
        }
        return size;
    }

    @Override // yads.to, yads.op0
    public final void a() {
        this.f89204t = -9223372036854775807L;
        this.f89205u = null;
    }

    @Override // yads.to, yads.op0
    public final void a(float f10) {
        this.f89201q = f10;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006e  */
    @Override // yads.op0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(long r8, long r10, long r12, java.util.List r14, yads.yj1[] r15) {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.ec.a(long, long, long, java.util.List, yads.yj1[]):void");
    }

    @Override // yads.op0
    public final int d() {
        return this.f89203s;
    }

    @Override // yads.to, yads.op0
    public final void disable() {
        this.f89205u = null;
    }

    @Override // yads.op0
    public final int e() {
        return this.f89202r;
    }

    @Override // yads.op0
    public final Object g() {
        return null;
    }
}
