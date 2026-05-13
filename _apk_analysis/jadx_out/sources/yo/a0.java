package yo;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Composers.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class a0 extends s {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f97900c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(@NotNull g0 g0Var, boolean z10) {
        super(g0Var);
        tn.p.k(g0Var, "writer");
        this.f97900c = z10;
    }

    @Override // yo.s
    public void e(byte b10) {
        boolean z10 = this.f97900c;
        String strE = bn.i.e(bn.i.b(b10));
        if (z10) {
            n(strE);
        } else {
            k(strE);
        }
    }

    @Override // yo.s
    public void i(int i10) {
        boolean z10 = this.f97900c;
        int iB = bn.k.b(i10);
        if (z10) {
            n(Long.toString(((long) iB) & 4294967295L, 10));
        } else {
            k(Long.toString(((long) iB) & 4294967295L, 10));
        }
    }

    @Override // yo.s
    public void j(long j10) {
        boolean z10 = this.f97900c;
        long jB = bn.m.b(j10);
        if (z10) {
            n(z.a(jB, 10));
        } else {
            k(y.a(jB, 10));
        }
    }

    @Override // yo.s
    public void l(short s10) {
        boolean z10 = this.f97900c;
        String strE = bn.p.e(bn.p.b(s10));
        if (z10) {
            n(strE);
        } else {
            k(strE);
        }
    }
}
