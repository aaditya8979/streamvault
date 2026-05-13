package wo;

import java.util.Arrays;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PrimitiveArraysSerializers.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class z extends k2<double[]> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public double[] f86652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f86653b;

    public z(@NotNull double[] dArr) {
        tn.p.k(dArr, "bufferWithData");
        this.f86652a = dArr;
        this.f86653b = dArr.length;
        b(10);
    }

    @Override // wo.k2
    public void b(int i10) {
        double[] dArr = this.f86652a;
        if (dArr.length < i10) {
            double[] dArrCopyOf = Arrays.copyOf(dArr, zn.n.e(i10, dArr.length * 2));
            tn.p.j(dArrCopyOf, "copyOf(...)");
            this.f86652a = dArrCopyOf;
        }
    }

    @Override // wo.k2
    public int d() {
        return this.f86653b;
    }

    public final void e(double d10) {
        k2.c(this, 0, 1, null);
        double[] dArr = this.f86652a;
        int iD = d();
        this.f86653b = iD + 1;
        dArr[iD] = d10;
    }

    @Override // wo.k2
    @NotNull
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public double[] a() {
        double[] dArrCopyOf = Arrays.copyOf(this.f86652a, d());
        tn.p.j(dArrCopyOf, "copyOf(...)");
        return dArrCopyOf;
    }
}
