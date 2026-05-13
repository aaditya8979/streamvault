package yads;

/* JADX INFO: loaded from: classes6.dex */
public final class jc3 implements qf3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final je3 f91168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yj3 f91169b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final af3 f91170c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final fk3 f91171d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f91172e;

    public /* synthetic */ jc3(je3 je3Var, ek3 ek3Var, zj3 zj3Var, af3 af3Var) {
        this(je3Var, zj3Var, af3Var, new fk3(ek3Var));
    }

    public jc3(je3 je3Var, zj3 zj3Var, af3 af3Var, fk3 fk3Var) {
        this.f91168a = je3Var;
        this.f91169b = zj3Var;
        this.f91170c = af3Var;
        this.f91171d = fk3Var;
    }

    @Override // yads.qf3
    public final void a(long j10, long j11) {
        if (this.f91172e || j11 <= 0 || !this.f91171d.a()) {
            return;
        }
        this.f91172e = true;
        this.f91169b.h();
        this.f91170c.f(this.f91168a);
    }
}
