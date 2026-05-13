package wo;

import java.util.Arrays;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PrimitiveArraysSerializers.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class g extends k2<boolean[]> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public boolean[] f86511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f86512b;

    public g(@NotNull boolean[] zArr) {
        tn.p.k(zArr, "bufferWithData");
        this.f86511a = zArr;
        this.f86512b = zArr.length;
        b(10);
    }

    @Override // wo.k2
    public void b(int i10) {
        boolean[] zArr = this.f86511a;
        if (zArr.length < i10) {
            boolean[] zArrCopyOf = Arrays.copyOf(zArr, zn.n.e(i10, zArr.length * 2));
            tn.p.j(zArrCopyOf, "copyOf(...)");
            this.f86511a = zArrCopyOf;
        }
    }

    @Override // wo.k2
    public int d() {
        return this.f86512b;
    }

    public final void e(boolean z10) {
        k2.c(this, 0, 1, null);
        boolean[] zArr = this.f86511a;
        int iD = d();
        this.f86512b = iD + 1;
        zArr[iD] = z10;
    }

    @Override // wo.k2
    @NotNull
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean[] a() {
        boolean[] zArrCopyOf = Arrays.copyOf(this.f86511a, d());
        tn.p.j(zArrCopyOf, "copyOf(...)");
        return zArrCopyOf;
    }
}
