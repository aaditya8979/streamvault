package com.luck.picture.lib.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.luck.picture.lib.R$layout;
import com.luck.picture.lib.adapter.holder.BaseRecyclerMediaHolder;
import com.luck.picture.lib.config.PictureSelectionConfig;
import com.luck.picture.lib.entity.LocalMedia;
import java.util.ArrayList;
import ma.d;

/* JADX INFO: loaded from: classes11.dex */
public class PictureImageGridAdapter extends RecyclerView.Adapter<BaseRecyclerMediaHolder> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f34843i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ArrayList<LocalMedia> f34844j = new ArrayList<>();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final PictureSelectionConfig f34845k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Context f34846l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public b f34847m;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PictureImageGridAdapter.this.f34847m != null) {
                PictureImageGridAdapter.this.f34847m.b();
            }
        }
    }

    public interface b {
        int a(View view, int i10, LocalMedia localMedia);

        void b();

        void c(View view, int i10, LocalMedia localMedia);

        void d(View view, int i10);
    }

    public PictureImageGridAdapter(Context context, PictureSelectionConfig pictureSelectionConfig) {
        this.f34845k = pictureSelectionConfig;
        this.f34846l = context;
    }

    public ArrayList<LocalMedia> d() {
        return this.f34844j;
    }

    public final int e(int i10) {
        if (i10 == 1) {
            return R$layout.ps_item_grid_camera;
        }
        if (i10 == 3) {
            int iA = ma.b.a(this.f34846l, 4);
            return iA != 0 ? iA : R$layout.ps_item_grid_video;
        }
        if (i10 != 4) {
            int iA2 = ma.b.a(this.f34846l, 3);
            return iA2 != 0 ? iA2 : R$layout.ps_item_grid_image;
        }
        int iA3 = ma.b.a(this.f34846l, 5);
        return iA3 != 0 ? iA3 : R$layout.ps_item_grid_audio;
    }

    public boolean f() {
        return this.f34844j.size() == 0;
    }

    public boolean g() {
        return this.f34843i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f34843i ? this.f34844j.size() + 1 : this.f34844j.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i10) {
        boolean z10 = this.f34843i;
        if (z10 && i10 == 0) {
            return 1;
        }
        if (z10) {
            i10--;
        }
        String strS = this.f34844j.get(i10).s();
        if (d.i(strS)) {
            return 3;
        }
        return d.d(strS) ? 4 : 2;
    }

    public void h(int i10) {
        notifyItemChanged(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(BaseRecyclerMediaHolder baseRecyclerMediaHolder, int i10) {
        if (getItemViewType(i10) == 1) {
            baseRecyclerMediaHolder.itemView.setOnClickListener(new a());
            return;
        }
        if (this.f34843i) {
            i10--;
        }
        baseRecyclerMediaHolder.e(this.f34844j.get(i10), i10);
        baseRecyclerMediaHolder.l(this.f34847m);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public BaseRecyclerMediaHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i10) {
        return BaseRecyclerMediaHolder.g(viewGroup, i10, e(i10), this.f34845k);
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public void k(ArrayList<LocalMedia> arrayList) {
        if (arrayList != null) {
            this.f34844j = arrayList;
            notifyDataSetChanged();
        }
    }

    public void l(boolean z10) {
        this.f34843i = z10;
    }

    public void m(b bVar) {
        this.f34847m = bVar;
    }
}
