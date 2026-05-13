package yads;

/* JADX INFO: loaded from: classes2.dex */
public final class ju implements ns2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lu f91362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ms2 f91363c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f91364d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f91365e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ lu f91366f;

    public ju(lu luVar, lu luVar2, ms2 ms2Var, int i10) {
        this.f91366f = luVar;
        this.f91362b = luVar2;
        this.f91363c = ms2Var;
        this.f91364d = i10;
    }

    @Override // yads.ns2
    public final int a(long j10) {
        if (this.f91366f.c()) {
            return 0;
        }
        int iA = this.f91363c.a(j10, this.f91366f.f92114x);
        jo joVar = this.f91366f.f92113w;
        if (joVar != null) {
            int iA2 = joVar.a(this.f91364d + 1);
            ms2 ms2Var = this.f91363c;
            iA = Math.min(iA, iA2 - (ms2Var.f92547q + ms2Var.f92549s));
        }
        ms2 ms2Var2 = this.f91363c;
        synchronized (ms2Var2) {
            if (iA >= 0) {
                int i10 = ms2Var2.f92549s + iA;
                if (i10 <= ms2Var2.f92546p) {
                    ms2Var2.f92549s = i10;
                }
            }
            throw new IllegalArgumentException();
        }
        if (iA > 0 && !this.f91365e) {
            lu luVar = this.f91366f;
            bn1 bn1Var = luVar.f92098h;
            int[] iArr = luVar.f92093c;
            int i11 = this.f91364d;
            bn1Var.a(new hm1(1, iArr[i11], luVar.f92094d[i11], 0, null, bn1Var.a(luVar.f92111u), -9223372036854775807L));
            this.f91365e = true;
        }
        return iA;
    }

    @Override // yads.ns2
    public final int a(nx0 nx0Var, sa0 sa0Var, int i10) {
        if (this.f91366f.c()) {
            return -3;
        }
        jo joVar = this.f91366f.f92113w;
        if (joVar != null) {
            int iA = joVar.a(this.f91364d + 1);
            ms2 ms2Var = this.f91363c;
            if (iA <= ms2Var.f92547q + ms2Var.f92549s) {
                return -3;
            }
        }
        if (!this.f91365e) {
            lu luVar = this.f91366f;
            bn1 bn1Var = luVar.f92098h;
            int[] iArr = luVar.f92093c;
            int i11 = this.f91364d;
            bn1Var.a(new hm1(1, iArr[i11], luVar.f92094d[i11], 0, null, bn1Var.a(luVar.f92111u), -9223372036854775807L));
            this.f91365e = true;
        }
        return this.f91363c.a(nx0Var, sa0Var, i10, this.f91366f.f92114x);
    }

    @Override // yads.ns2
    public final void a() {
    }

    @Override // yads.ns2
    public final boolean isReady() {
        return !this.f91366f.c() && this.f91363c.a(this.f91366f.f92114x);
    }
}
