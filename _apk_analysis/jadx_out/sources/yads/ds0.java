package yads;

import android.view.View;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class ds0 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gs0 f88971a;

    public ds0(gs0 gs0Var) {
        this.f88971a = gs0Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        Map map = this.f88971a.f90097e;
        gs0 gs0Var = this.f88971a;
        for (Map.Entry entry : map.entrySet()) {
            gs0Var.a((yt0) entry.getKey(), ((Number) entry.getValue()).intValue());
        }
        this.f88971a.c();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        gs0.access$unregisterTrackers(this.f88971a);
        Set setKeySet = this.f88971a.f90097e.keySet();
        gs0 gs0Var = this.f88971a;
        Iterator it = setKeySet.iterator();
        while (it.hasNext()) {
            gs0.access$unbindHolder(gs0Var, (yt0) it.next());
        }
    }
}
