package wo;

import java.util.Arrays;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PrimitiveArraysSerializers.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class n3 extends k2<bn.q> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public short[] f86576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f86577b;

    public n3(short[] sArr) {
        tn.p.k(sArr, "bufferWithData");
        this.f86576a = sArr;
        this.f86577b = bn.q.p(sArr);
        b(10);
    }

    public /* synthetic */ n3(short[] sArr, tn.i iVar) {
        this(sArr);
    }

    @Override // wo.k2
    public /* bridge */ /* synthetic */ bn.q a() {
        return bn.q.a(f());
    }

    @Override // wo.k2
    public void b(int i10) {
        if (bn.q.p(this.f86576a) < i10) {
            short[] sArr = this.f86576a;
            short[] sArrCopyOf = Arrays.copyOf(sArr, zn.n.e(i10, bn.q.p(sArr) * 2));
            tn.p.j(sArrCopyOf, "copyOf(...)");
            this.f86576a = bn.q.g(sArrCopyOf);
        }
    }

    @Override // wo.k2
    public int d() {
        return this.f86577b;
    }

    public final void e(short s10) {
        k2.c(this, 0, 1, null);
        short[] sArr = this.f86576a;
        int iD = d();
        this.f86577b = iD + 1;
        bn.q.t(sArr, iD, s10);
    }

    @NotNull
    public short[] f() {
        short[] sArrCopyOf = Arrays.copyOf(this.f86576a, d());
        tn.p.j(sArrCopyOf, "copyOf(...)");
        return bn.q.g(sArrCopyOf);
    }
}
