package yads;

import android.view.View;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes11.dex */
public final class fc0 implements ac2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cw f89524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z30 f89525b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WeakReference f89526c;

    public fc0(View view, cw cwVar, z30 z30Var) {
        this.f89524a = cwVar;
        this.f89525b = z30Var;
        this.f89526c = new WeakReference(view);
    }

    @Override // yads.ac2
    public final void a() {
        View view = (View) this.f89526c.get();
        if (view != null) {
            this.f89524a.b(view);
            this.f89525b.a(y30.f96982e);
        }
    }
}
