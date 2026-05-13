package com.luck.picture.lib.adapter.holder;

import ab.q;
import android.graphics.ColorFilter;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.luck.picture.lib.R$color;
import com.luck.picture.lib.R$id;
import com.luck.picture.lib.R$layout;
import com.luck.picture.lib.config.PictureSelectionConfig;
import com.luck.picture.lib.entity.LocalMedia;
import com.luck.picture.lib.style.SelectMainStyle;
import java.util.ArrayList;
import java.util.List;
import oa.f;

/* JADX INFO: loaded from: classes3.dex */
public class PreviewGalleryAdapter extends RecyclerView.Adapter<e> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List<LocalMedia> f34906i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f34907j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public c f34908k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public d f34909l;

    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e f34910b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ LocalMedia f34911c;

        public a(e eVar, LocalMedia localMedia) {
            this.f34910b = eVar;
            this.f34911c = localMedia;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PreviewGalleryAdapter.this.f34908k != null) {
                PreviewGalleryAdapter.this.f34908k.a(this.f34910b.getAbsoluteAdapterPosition(), this.f34911c, view);
            }
        }
    }

    public class b implements View.OnLongClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e f34913b;

        public b(e eVar) {
            this.f34913b = eVar;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            if (PreviewGalleryAdapter.this.f34909l == null) {
                return true;
            }
            PreviewGalleryAdapter.this.f34909l.a(this.f34913b, this.f34913b.getAbsoluteAdapterPosition(), view);
            return true;
        }
    }

    public interface c {
        void a(int i10, LocalMedia localMedia, View view);
    }

    public interface d {
        void a(RecyclerView.ViewHolder viewHolder, int i10, View view);
    }

    public static class e extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public ImageView f34915l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public ImageView f34916m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public ImageView f34917n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public View f34918o;

        public e(View view) {
            super(view);
            this.f34915l = (ImageView) view.findViewById(R$id.ivImage);
            this.f34916m = (ImageView) view.findViewById(R$id.ivPlay);
            this.f34917n = (ImageView) view.findViewById(R$id.ivEditor);
            this.f34918o = view.findViewById(R$id.viewBorder);
            SelectMainStyle selectMainStyleC = PictureSelectionConfig.T0.c();
            if (q.c(selectMainStyleC.n())) {
                this.f34917n.setImageResource(selectMainStyleC.n());
            }
            if (q.c(selectMainStyleC.q())) {
                this.f34918o.setBackgroundResource(selectMainStyleC.q());
            }
            int iR = selectMainStyleC.r();
            if (q.b(iR)) {
                view.setLayoutParams(new RelativeLayout.LayoutParams(iR, iR));
            }
        }
    }

    public PreviewGalleryAdapter(boolean z10, List<LocalMedia> list) {
        this.f34907j = z10;
        this.f34906i = new ArrayList(list);
        for (int i10 = 0; i10 < this.f34906i.size(); i10++) {
            LocalMedia localMedia = this.f34906i.get(i10);
            localMedia.g0(false);
            localMedia.Q(false);
        }
    }

    public void clear() {
        this.f34906i.clear();
    }

    public void e(LocalMedia localMedia) {
        int iH = h();
        if (iH != -1) {
            this.f34906i.get(iH).Q(false);
            notifyItemChanged(iH);
        }
        if (!this.f34907j || !this.f34906i.contains(localMedia)) {
            localMedia.Q(true);
            this.f34906i.add(localMedia);
            notifyItemChanged(this.f34906i.size() - 1);
        } else {
            int iF = f(localMedia);
            LocalMedia localMedia2 = this.f34906i.get(iF);
            localMedia2.g0(false);
            localMedia2.Q(true);
            notifyItemChanged(iF);
        }
    }

    public final int f(LocalMedia localMedia) {
        for (int i10 = 0; i10 < this.f34906i.size(); i10++) {
            LocalMedia localMedia2 = this.f34906i.get(i10);
            if (TextUtils.equals(localMedia2.w(), localMedia.w()) || localMedia2.r() == localMedia.r()) {
                return i10;
            }
        }
        return -1;
    }

    public List<LocalMedia> g() {
        return this.f34906i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f34906i.size();
    }

    public int h() {
        for (int i10 = 0; i10 < this.f34906i.size(); i10++) {
            if (this.f34906i.get(i10).E()) {
                return i10;
            }
        }
        return -1;
    }

    public void i(LocalMedia localMedia) {
        int iH = h();
        if (iH != -1) {
            this.f34906i.get(iH).Q(false);
            notifyItemChanged(iH);
        }
        int iF = f(localMedia);
        if (iF != -1) {
            this.f34906i.get(iF).Q(true);
            notifyItemChanged(iF);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NonNull e eVar, int i10) {
        LocalMedia localMedia = this.f34906i.get(i10);
        ColorFilter colorFilterG = q.g(eVar.itemView.getContext(), localMedia.I() ? R$color.ps_color_half_white : R$color.ps_color_transparent);
        if (localMedia.E() && localMedia.I()) {
            eVar.f34918o.setVisibility(0);
        } else {
            eVar.f34918o.setVisibility(localMedia.E() ? 0 : 8);
        }
        String strW = localMedia.w();
        if (!localMedia.H() || TextUtils.isEmpty(localMedia.m())) {
            eVar.f34917n.setVisibility(8);
        } else {
            strW = localMedia.m();
            eVar.f34917n.setVisibility(0);
        }
        eVar.f34915l.setColorFilter(colorFilterG);
        f fVar = PictureSelectionConfig.K0;
        if (fVar != null) {
            fVar.f(eVar.itemView.getContext(), strW, eVar.f34915l);
        }
        eVar.f34916m.setVisibility(ma.d.i(localMedia.s()) ? 0 : 8);
        eVar.itemView.setOnClickListener(new a(eVar, localMedia));
        eVar.itemView.setOnLongClickListener(new b(eVar));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public e onCreateViewHolder(@NonNull ViewGroup viewGroup, int i10) {
        int iA = ma.b.a(viewGroup.getContext(), 9);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        if (iA == 0) {
            iA = R$layout.ps_preview_gallery_item;
        }
        return new e(layoutInflaterFrom.inflate(iA, viewGroup, false));
    }

    public void l(LocalMedia localMedia) {
        int iF = f(localMedia);
        if (iF != -1) {
            if (this.f34907j) {
                this.f34906i.get(iF).g0(true);
                notifyItemChanged(iF);
            } else {
                this.f34906i.remove(iF);
                notifyItemRemoved(iF);
            }
        }
    }

    public void m(c cVar) {
        this.f34908k = cVar;
    }

    public void n(d dVar) {
        this.f34909l = dVar;
    }
}
