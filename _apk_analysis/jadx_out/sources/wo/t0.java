package wo;

import java.util.Arrays;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PrimitiveArraysSerializers.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class t0 extends k2<int[]> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public int[] f86616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f86617b;

    public t0(@NotNull int[] iArr) {
        tn.p.k(iArr, "bufferWithData");
        this.f86616a = iArr;
        this.f86617b = iArr.length;
        b(10);
    }

    @Override // wo.k2
    public void b(int i10) {
        int[] iArr = this.f86616a;
        if (iArr.length < i10) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, zn.n.e(i10, iArr.length * 2));
            tn.p.j(iArrCopyOf, "copyOf(...)");
            this.f86616a = iArrCopyOf;
        }
    }

    @Override // wo.k2
    public int d() {
        return this.f86617b;
    }

    public final void e(int i10) {
        k2.c(this, 0, 1, null);
        int[] iArr = this.f86616a;
        int iD = d();
        this.f86617b = iD + 1;
        iArr[iD] = i10;
    }

    @Override // wo.k2
    @NotNull
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public int[] a() {
        int[] iArrCopyOf = Arrays.copyOf(this.f86616a, d());
        tn.p.j(iArrCopyOf, "copyOf(...)");
        return iArrCopyOf;
    }
}
