package yads;

import android.view.View;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public final class kj2 implements ac2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cw f91610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z30 f91611b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WeakReference f91612c;

    public kj2(View view, am0 am0Var, z30 z30Var) {
        this.f91610a = am0Var;
        this.f91611b = z30Var;
        this.f91612c = new WeakReference(view);
    }

    @Override // yads.ac2
    public final void a() {
        View view = (View) this.f91612c.get();
        if (view != null) {
            this.f91610a.b(view);
            this.f91611b.a(y30.f96982e);
        }
    }
}
