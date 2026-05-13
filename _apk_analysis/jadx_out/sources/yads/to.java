package yads;

import android.os.SystemClock;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import yads.mx0;
import yads.to;

/* JADX INFO: loaded from: classes2.dex */
public abstract class to implements op0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h73 f95301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f95302b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f95303c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final mx0[] f95304d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long[] f95305e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f95306f;

    public to(h73 h73Var, int[] iArr) {
        int i10 = 0;
        ni.b(iArr.length > 0);
        this.f95301a = (h73) ni.a(h73Var);
        int length = iArr.length;
        this.f95302b = length;
        this.f95304d = new mx0[length];
        for (int i11 = 0; i11 < iArr.length; i11++) {
            this.f95304d[i11] = h73Var.a(iArr[i11]);
        }
        Arrays.sort(this.f95304d, new Comparator() { // from class: bt.la
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return to.a((mx0) obj, (mx0) obj2);
            }
        });
        this.f95303c = new int[this.f95302b];
        while (true) {
            int i12 = this.f95302b;
            if (i10 >= i12) {
                this.f95305e = new long[i12];
                return;
            } else {
                this.f95303c[i10] = h73Var.a(this.f95304d[i10]);
                i10++;
            }
        }
    }

    public static /* synthetic */ int a(mx0 mx0Var, mx0 mx0Var2) {
        return mx0Var2.f92606i - mx0Var.f92606i;
    }

    @Override // yads.op0
    public int a(long j10, List list) {
        return list.size();
    }

    @Override // yads.op0
    public final int a(mx0 mx0Var) {
        for (int i10 = 0; i10 < this.f95302b; i10++) {
            if (this.f95304d[i10] == mx0Var) {
                return i10;
            }
        }
        return -1;
    }

    @Override // yads.op0
    public final mx0 a(int i10) {
        return this.f95304d[i10];
    }

    @Override // yads.op0
    public void a() {
    }

    @Override // yads.op0
    public void a(float f10) {
    }

    @Override // yads.op0
    public final boolean a(int i10, long j10) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean zB = b(i10, jElapsedRealtime);
        int i11 = 0;
        while (i11 < this.f95302b && !zB) {
            zB = (i11 == i10 || b(i11, jElapsedRealtime)) ? false : true;
            i11++;
        }
        if (!zB) {
            return false;
        }
        long[] jArr = this.f95305e;
        long j11 = jArr[i10];
        int i12 = ib3.f90737a;
        long j12 = jElapsedRealtime + j10;
        jArr[i10] = Math.max(j11, ((j10 ^ j12) & (jElapsedRealtime ^ j12)) >= 0 ? j12 : Long.MAX_VALUE);
        return true;
    }

    @Override // yads.op0
    public final int b(int i10) {
        return this.f95303c[i10];
    }

    @Override // yads.op0
    public final h73 b() {
        return this.f95301a;
    }

    @Override // yads.op0
    public final boolean b(int i10, long j10) {
        return this.f95305e[i10] > j10;
    }

    @Override // yads.op0
    public final int c(int i10) {
        for (int i11 = 0; i11 < this.f95302b; i11++) {
            if (this.f95303c[i11] == i10) {
                return i11;
            }
        }
        return -1;
    }

    @Override // yads.op0
    public final mx0 c() {
        return this.f95304d[e()];
    }

    @Override // yads.op0
    public void disable() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        to toVar = (to) obj;
        return this.f95301a == toVar.f95301a && Arrays.equals(this.f95303c, toVar.f95303c);
    }

    @Override // yads.op0
    public final int f() {
        return this.f95303c.length;
    }

    public final int hashCode() {
        if (this.f95306f == 0) {
            this.f95306f = Arrays.hashCode(this.f95303c) + (System.identityHashCode(this.f95301a) * 31);
        }
        return this.f95306f;
    }
}
