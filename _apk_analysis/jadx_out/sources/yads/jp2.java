package yads;

import android.view.ViewGroup;

/* JADX INFO: loaded from: classes11.dex */
public final class jp2 implements zf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f2 f91326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f91327b;

    public jp2(f2 f2Var, int i10) {
        this.f91326a = f2Var;
        this.f91327b = i10;
    }

    @Override // yads.zf0
    public final void a(ViewGroup viewGroup) {
        if (this.f91327b == 1) {
            ((q2) this.f91326a).a(7);
        } else {
            ((q2) this.f91326a).a(6);
        }
    }

    @Override // yads.zf0
    public final void c() {
    }
}
