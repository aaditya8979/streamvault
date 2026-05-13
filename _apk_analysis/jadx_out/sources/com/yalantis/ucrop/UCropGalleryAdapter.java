package com.yalantis.ucrop;

import android.graphics.ColorFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.BlendModeColorFilterCompat;
import androidx.core.graphics.BlendModeCompat;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import rf.c;

/* JADX INFO: loaded from: classes12.dex */
public class UCropGalleryAdapter extends RecyclerView.Adapter<ViewHolder> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List<String> f53783i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f53784j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public b f53785k;

    public static class ViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public ImageView f53786l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public View f53787m;

        public ViewHolder(View view) {
            super(view);
            this.f53786l = (ImageView) view.findViewById(R$id.iv_photo);
            this.f53787m = view.findViewById(R$id.view_current_select);
        }
    }

    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ViewHolder f53788b;

        public a(ViewHolder viewHolder) {
            this.f53788b = viewHolder;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (UCropGalleryAdapter.this.f53785k != null) {
                UCropGalleryAdapter.this.f53785k.a(this.f53788b.getAbsoluteAdapterPosition(), view);
            }
        }
    }

    public interface b {
        void a(int i10, View view);
    }

    public UCropGalleryAdapter(List<String> list) {
        this.f53783i = list;
    }

    public int d() {
        return this.f53784j;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(ViewHolder viewHolder, int i10) {
        ColorFilter colorFilterCreateBlendModeColorFilterCompat;
        String str = this.f53783i.get(i10);
        c cVar = rf.b.f78903a;
        if (cVar != null) {
            cVar.a(viewHolder.itemView.getContext(), str, viewHolder.f53786l);
        }
        if (this.f53784j == i10) {
            viewHolder.f53787m.setVisibility(0);
            colorFilterCreateBlendModeColorFilterCompat = BlendModeColorFilterCompat.createBlendModeColorFilterCompat(ContextCompat.getColor(viewHolder.itemView.getContext(), R$color.ucrop_color_80), BlendModeCompat.SRC_ATOP);
        } else {
            colorFilterCreateBlendModeColorFilterCompat = BlendModeColorFilterCompat.createBlendModeColorFilterCompat(ContextCompat.getColor(viewHolder.itemView.getContext(), R$color.ucrop_color_20), BlendModeCompat.SRC_ATOP);
            viewHolder.f53787m.setVisibility(8);
        }
        viewHolder.f53786l.setColorFilter(colorFilterCreateBlendModeColorFilterCompat);
        viewHolder.itemView.setOnClickListener(new a(viewHolder));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i10) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.ucrop_gallery_adapter_item, viewGroup, false));
    }

    public void g(int i10) {
        this.f53784j = i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<String> list = this.f53783i;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public void h(b bVar) {
        this.f53785k = bVar;
    }
}
