package yo;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Composers.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class b0 extends s {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final xo.a f97901c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f97902d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(@NotNull g0 g0Var, @NotNull xo.a aVar) {
        super(g0Var);
        tn.p.k(g0Var, "writer");
        tn.p.k(aVar, "json");
        this.f97901c = aVar;
    }

    @Override // yo.s
    public void b() {
        o(true);
        this.f97902d++;
    }

    @Override // yo.s
    public void c() {
        o(false);
        k("\n");
        int i10 = this.f97902d;
        for (int i11 = 0; i11 < i10; i11++) {
            k(this.f97901c.e().n());
        }
    }

    @Override // yo.s
    public void d() {
        if (a()) {
            o(false);
        } else {
            c();
        }
    }

    @Override // yo.s
    public void p() {
        f(' ');
    }

    @Override // yo.s
    public void q() {
        this.f97902d--;
    }
}
