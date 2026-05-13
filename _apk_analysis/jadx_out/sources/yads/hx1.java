package yads;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class hx1 extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f90586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ex1 f90587b;

    public hx1(mi2 mi2Var, List list, v9 v9Var) {
        this.f90586a = list;
        this.f90587b = new ex1(mi2Var, v9Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f90586a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i10) {
        ((cx1) viewHolder).f88636a.b((u41) this.f90586a.get(i10));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i10) {
        ex1 ex1Var = this.f90587b;
        ex1Var.getClass();
        ImageView imageView = new ImageView(viewGroup.getContext());
        imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        imageView.setAdjustViewBounds(true);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setOnClickListener(new dx1());
        return new cx1(imageView, new c51(imageView, ex1Var.f89398a, ex1Var.f89399b));
    }
}
