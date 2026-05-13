package yads;

import android.view.View;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class iy implements gf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f91032a;

    public iy(List list) {
        this.f91032a = list;
    }

    @Override // yads.gf
    public final void a(View view) {
        Iterator it = this.f91032a.iterator();
        while (it.hasNext()) {
            ((gf) it.next()).a(view);
        }
    }

    @Override // yads.gf
    public final void cancel() {
        Iterator it = this.f91032a.iterator();
        while (it.hasNext()) {
            ((gf) it.next()).cancel();
        }
    }
}
