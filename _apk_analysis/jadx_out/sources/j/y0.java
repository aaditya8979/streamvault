package j;

/* JADX INFO: loaded from: classes3.dex */
public final class y0 implements bp.s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b2 f72042a;

    public y0(b2 b2Var) {
        this.f72042a = b2Var;
    }

    @Override // bp.s0
    public final void a(Object... objArr) {
        this.f72042a.f71824c.IL1Iii.runOnUiThread(new g0(this, objArr));
    }

    @Override // bp.s0
    public final void b(int i10, String str) {
        this.f72042a.f71824c.IL1Iii.runOnUiThread(new i1(this));
    }
}
