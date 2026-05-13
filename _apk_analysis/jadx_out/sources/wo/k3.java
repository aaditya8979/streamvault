package wo;

import java.util.Arrays;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PrimitiveArraysSerializers.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class k3 extends k2<bn.n> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public long[] f86561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f86562b;

    public k3(long[] jArr) {
        tn.p.k(jArr, "bufferWithData");
        this.f86561a = jArr;
        this.f86562b = bn.n.p(jArr);
        b(10);
    }

    public /* synthetic */ k3(long[] jArr, tn.i iVar) {
        this(jArr);
    }

    @Override // wo.k2
    public /* bridge */ /* synthetic */ bn.n a() {
        return bn.n.a(f());
    }

    @Override // wo.k2
    public void b(int i10) {
        if (bn.n.p(this.f86561a) < i10) {
            long[] jArr = this.f86561a;
            long[] jArrCopyOf = Arrays.copyOf(jArr, zn.n.e(i10, bn.n.p(jArr) * 2));
            tn.p.j(jArrCopyOf, "copyOf(...)");
            this.f86561a = bn.n.g(jArrCopyOf);
        }
    }

    @Override // wo.k2
    public int d() {
        return this.f86562b;
    }

    public final void e(long j10) {
        k2.c(this, 0, 1, null);
        long[] jArr = this.f86561a;
        int iD = d();
        this.f86562b = iD + 1;
        bn.n.t(jArr, iD, j10);
    }

    @NotNull
    public long[] f() {
        long[] jArrCopyOf = Arrays.copyOf(this.f86561a, d());
        tn.p.j(jArrCopyOf, "copyOf(...)");
        return bn.n.g(jArrCopyOf);
    }
}
