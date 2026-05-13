package yads;

/* JADX INFO: loaded from: classes12.dex */
public final class ao2 implements ye3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p52 f87765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final je3 f87766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vf3 f87767c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final zn2 f87768d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ef3 f87769e;

    public /* synthetic */ ao2(p52 p52Var, je3 je3Var, rf3 rf3Var) {
        this(p52Var, je3Var, new vf3(new r52(p52Var), rf3Var));
    }

    public ao2(p52 p52Var, je3 je3Var, vf3 vf3Var) {
        this.f87765a = p52Var;
        this.f87766b = je3Var;
        this.f87767c = vf3Var;
        this.f87768d = new zn2(this);
    }

    @Override // yads.ye3
    public final void a(zd2 zd2Var) {
        this.f87769e = zd2Var;
    }

    @Override // yads.ye3
    public final void play() {
        this.f87765a.a(this.f87768d);
        p52 p52Var = this.f87765a;
        je3 je3Var = this.f87766b;
        p52Var.a((n62) je3Var.f91197d, (n62) je3Var.f91198e);
    }

    @Override // yads.ye3
    public final void stop() {
        this.f87767c.a();
        this.f87765a.pauseAd();
        this.f87765a.a();
    }
}
