package wo;

import java.util.Arrays;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PrimitiveArraysSerializers.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class h3 extends k2<bn.l> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public int[] f86538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f86539b;

    public h3(int[] iArr) {
        tn.p.k(iArr, "bufferWithData");
        this.f86538a = iArr;
        this.f86539b = bn.l.p(iArr);
        b(10);
    }

    public /* synthetic */ h3(int[] iArr, tn.i iVar) {
        this(iArr);
    }

    @Override // wo.k2
    public /* bridge */ /* synthetic */ bn.l a() {
        return bn.l.a(f());
    }

    @Override // wo.k2
    public void b(int i10) {
        if (bn.l.p(this.f86538a) < i10) {
            int[] iArr = this.f86538a;
            int[] iArrCopyOf = Arrays.copyOf(iArr, zn.n.e(i10, bn.l.p(iArr) * 2));
            tn.p.j(iArrCopyOf, "copyOf(...)");
            this.f86538a = bn.l.g(iArrCopyOf);
        }
    }

    @Override // wo.k2
    public int d() {
        return this.f86539b;
    }

    public final void e(int i10) {
        k2.c(this, 0, 1, null);
        int[] iArr = this.f86538a;
        int iD = d();
        this.f86539b = iD + 1;
        bn.l.t(iArr, iD, i10);
    }

    @NotNull
    public int[] f() {
        int[] iArrCopyOf = Arrays.copyOf(this.f86538a, d());
        tn.p.j(iArrCopyOf, "copyOf(...)");
        return bn.l.g(iArrCopyOf);
    }
}
