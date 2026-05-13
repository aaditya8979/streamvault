package yads;

import android.view.View;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public final class te0 implements ac2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f03 f95180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakReference f95181b;

    public te0(View view, f03 f03Var) {
        this.f95180a = f03Var;
        this.f95181b = new WeakReference(view);
    }

    @Override // yads.ac2
    public final void a() {
        View view = (View) this.f95181b.get();
        if (view != null) {
            this.f95180a.b(view);
        }
    }
}
