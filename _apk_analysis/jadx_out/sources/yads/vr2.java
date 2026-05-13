package yads;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes8.dex */
public final class vr2 implements zf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b2 f96176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x63 f96177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y42 f96178c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c2 f96179d;

    public vr2(b2 b2Var, x63 x63Var, y42 y42Var, c2 c2Var) {
        this.f96176a = b2Var;
        this.f96177b = x63Var;
        this.f96178c = y42Var;
        this.f96179d = c2Var;
    }

    @Override // yads.zf0
    public final void a(ViewGroup viewGroup) {
        b2 b2Var = this.f96176a;
        b2Var.f87878b.add(this.f96179d);
        this.f96177b.getClass();
        View viewFindViewWithTag = viewGroup.findViewWithTag("timer_container");
        if (!(viewFindViewWithTag instanceof View)) {
            viewFindViewWithTag = null;
        }
        y42 y42Var = this.f96178c;
        y42Var.f96999c = viewFindViewWithTag;
        ay0 ay0Var = y42Var.f96998b;
        if (ay0Var != null) {
            ay0Var.start();
        }
    }

    @Override // yads.zf0
    public final void c() {
        b2 b2Var = this.f96176a;
        b2Var.f87878b.remove(this.f96179d);
        y42 y42Var = this.f96178c;
        y42Var.f96999c = null;
        ay0 ay0Var = y42Var.f96998b;
        if (ay0Var != null) {
            ay0Var.invalidate();
        }
    }
}
