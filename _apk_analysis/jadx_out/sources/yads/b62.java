package yads;

/* JADX INFO: loaded from: classes8.dex */
public final class b62 implements ay0, m62 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d62 f87925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lr2 f87926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f87927c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final lw f87928d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final yv f87929e;

    public b62(d62 d62Var, lr2 lr2Var, Long l10, lw lwVar, yv yvVar) {
        this.f87925a = d62Var;
        this.f87926b = lr2Var;
        this.f87927c = l10;
        this.f87928d = lwVar;
        this.f87929e = yvVar;
    }

    @Override // yads.m62
    public final void a() {
        this.f87926b.a();
        c();
    }

    @Override // yads.m62
    public final void a(long j10, long j11) {
        if (this.f87929e.a()) {
            lw lwVar = this.f87928d;
            lwVar.f92130b = j11;
            long j12 = j11 + lwVar.f92129a;
            Long l10 = this.f87927c;
            if (l10 == null || j12 < l10.longValue()) {
                return;
            }
            this.f87926b.a();
            c();
        }
    }

    @Override // yads.m62
    public final void b() {
        if (this.f87929e.a()) {
            this.f87926b.a();
            c();
        }
    }

    public final void c() {
        this.f87925a.f88769a.remove(this);
    }

    @Override // yads.ay0
    public final void invalidate() {
        c();
    }

    @Override // yads.ay0
    public final void pause() {
    }

    @Override // yads.ay0
    public final void resume() {
    }

    @Override // yads.ay0
    public final void start() {
        Long l10;
        this.f87925a.f88769a.add(this);
        if (!this.f87929e.a() || (l10 = this.f87927c) == null || this.f87928d.f92129a < l10.longValue()) {
            return;
        }
        this.f87926b.a();
        c();
    }
}
