package yads;

import android.view.View;

/* JADX INFO: loaded from: classes8.dex */
public final class x42 implements tj2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y42 f96630a;

    public x42(y42 y42Var) {
        this.f96630a = y42Var;
    }

    @Override // yads.tj2
    public final void a() {
        View view = this.f96630a.f96999c;
        if (view == null) {
            return;
        }
        view.setVisibility(8);
    }

    @Override // yads.tj2
    public final void a(long j10, long j11) {
        y42 y42Var = this.f96630a;
        View view = y42Var.f96999c;
        if (view != null) {
            y42Var.f96997a.a(view, j10, j11);
        }
    }
}
