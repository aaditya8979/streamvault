package qd;

import android.view.View;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: ScaleYTransformer.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f78257a = 0.001f;

    @Override // qd.a
    public void a(@NotNull View view, @NotNull RecyclerView recyclerView) {
        p.k(view, "v");
        p.k(recyclerView, "parent");
        ViewCompat.setScaleY(view, 1.0f - (Math.abs((((int) view.getX()) - (((recyclerView.getWidth() * 0.9f) - (view.getWidth() * 0.9f)) / 2)) / 10) * this.f78257a));
    }
}
