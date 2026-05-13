package n3;

import android.view.ViewGroup;
import android.widget.FrameLayout;

/* JADX INFO: compiled from: InMobiAdViewHolder.java */
/* JADX INFO: loaded from: classes11.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameLayout f75080a;

    public c(FrameLayout frameLayout) {
        this.f75080a = frameLayout;
    }

    public void a(e eVar) {
        this.f75080a.addView(eVar.a());
    }

    public FrameLayout b() {
        return this.f75080a;
    }

    public void c(ViewGroup.LayoutParams layoutParams) {
        this.f75080a.setLayoutParams(layoutParams);
    }
}
