package yads;

/* JADX INFO: loaded from: classes9.dex */
public final class qz2 extends jo {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f94231o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final mx0 f94232p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f94233q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f94234r;

    public qz2(p30 p30Var, u30 u30Var, mx0 mx0Var, int i10, Object obj, long j10, long j11, long j12, int i11, mx0 mx0Var2) {
        super(p30Var, u30Var, mx0Var, i10, obj, j10, j11, -9223372036854775807L, -9223372036854775807L, j12);
        this.f94231o = i11;
        this.f94232p = mx0Var2;
    }

    @Override // yads.bg1
    public final void a() {
        m73 al0Var;
        lo loVar = this.f91314m;
        if (loVar == null) {
            throw new IllegalStateException();
        }
        for (ms2 ms2Var : loVar.f92048b) {
            if (ms2Var.E != 0) {
                ms2Var.E = 0L;
                ms2Var.f92556z = true;
            }
        }
        int i10 = this.f94231o;
        int i11 = 0;
        while (true) {
            int[] iArr = loVar.f92047a;
            if (i11 >= iArr.length) {
                ih1.b("BaseMediaChunkOutput", "Unmatched track of type: " + i10);
                al0Var = new al0();
                break;
            }
            if (i10 == iArr[i11]) {
                al0Var = loVar.f92048b[i11];
                break;
            }
            i11++;
        }
        m73 m73Var = al0Var;
        m73Var.a(this.f94232p);
        try {
            u30 u30Var = this.f88606b;
            long j10 = this.f94233q;
            long j11 = u30Var.f95528g;
            long jA = this.f88613i.a(u30Var.a(j10, j11 == -1 ? -1L : j11 - j10));
            if (jA != -1) {
                jA += this.f94233q;
            }
            ld0 ld0Var = new ld0(this.f88613i, this.f94233q, jA);
            for (int iA = 0; iA != -1; iA = m73Var.a(ld0Var, Integer.MAX_VALUE, true)) {
                this.f94233q += (long) iA;
            }
            m73Var.a(this.f88611g, 1, (int) this.f94233q, 0, null);
            s30.a(this.f88613i);
            this.f94234r = true;
        } catch (Throwable th2) {
            s30.a(this.f88613i);
            throw th2;
        }
    }

    @Override // yads.bg1
    public final void b() {
    }

    @Override // yads.jo
    public final boolean d() {
        return this.f94234r;
    }
}
