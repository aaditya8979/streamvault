package yads;

/* JADX INFO: loaded from: classes9.dex */
public final class vl3 implements qf3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hf3 f96134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gk3 f96135b;

    public vl3(r52 r52Var, gk3 gk3Var) {
        this.f96134a = r52Var;
        this.f96135b = gk3Var;
    }

    public /* synthetic */ vl3(r52 r52Var, i72 i72Var) {
        this(r52Var, uw1.a(i72Var));
    }

    @Override // yads.qf3
    public final void a(long j10, long j11) {
        if (this.f96135b.a()) {
            if (this.f96134a.isPlayingAd()) {
                return;
            }
            this.f96134a.resumeAd();
        } else if (this.f96134a.isPlayingAd()) {
            this.f96134a.pauseAd();
        }
    }
}
