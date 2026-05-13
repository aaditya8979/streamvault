package yads;

/* JADX INFO: loaded from: classes12.dex */
public final class qr implements o30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public nr f94123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final av0 f94124b = new av0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yr f94125c = yr.f97274a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public o30 f94126d;

    public final rr a() {
        o30 o30Var = this.f94126d;
        return a(o30Var != null ? o30Var.createDataSource() : null, 1, -1000);
    }

    public final rr a(p30 p30Var, int i10, int i11) {
        nr nrVar = this.f94123a;
        nrVar.getClass();
        pr prVar = p30Var == null ? null : new pr(nrVar);
        this.f94124b.getClass();
        return new rr(nrVar, p30Var, new cv0(), prVar, this.f94125c, i10);
    }

    public final nr b() {
        return this.f94123a;
    }

    public final yr c() {
        return this.f94125c;
    }

    @Override // yads.o30
    public final p30 createDataSource() {
        o30 o30Var = this.f94126d;
        return a(o30Var != null ? o30Var.createDataSource() : null, 0, 0);
    }
}
