package yads;

/* JADX INFO: loaded from: classes2.dex */
public final class zq implements m73 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f97743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mx0 f97744b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final al0 f97745c = new al0();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public mx0 f97746d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public m73 f97747e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f97748f;

    public zq(int i10, int i11, mx0 mx0Var) {
        this.f97743a = i11;
        this.f97744b = mx0Var;
    }

    @Override // yads.m73
    public final int a(l30 l30Var, int i10, boolean z10) {
        m73 m73Var = this.f97747e;
        int i11 = ib3.f90737a;
        return m73Var.b(l30Var, i10, z10);
    }

    @Override // yads.m73
    public final void a(int i10, jb2 jb2Var) {
        m73 m73Var = this.f97747e;
        int i11 = ib3.f90737a;
        m73Var.a(i10, jb2Var);
    }

    @Override // yads.m73
    public final void a(long j10, int i10, int i11, int i12, l73 l73Var) {
        long j11 = this.f97748f;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            this.f97747e = this.f97745c;
        }
        m73 m73Var = this.f97747e;
        int i13 = ib3.f90737a;
        m73Var.a(j10, i10, i11, i12, l73Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a4  */
    @Override // yads.m73
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(yads.mx0 r23) {
        /*
            Method dump skipped, instruction units count: 423
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.zq.a(yads.mx0):void");
    }
}
