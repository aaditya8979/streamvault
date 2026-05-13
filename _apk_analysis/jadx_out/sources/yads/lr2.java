package yads;

import android.view.View;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes4.dex */
public final class lr2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f92073a;

    public lr2(WeakReference weakReference) {
        this.f92073a = weakReference;
    }

    public final void a() {
        View view = (View) this.f92073a.get();
        if (view != null) {
            view.setVisibility(0);
        }
    }
}
