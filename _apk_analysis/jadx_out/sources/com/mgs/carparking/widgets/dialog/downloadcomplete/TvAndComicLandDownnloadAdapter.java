package com.mgs.carparking.widgets.dialog.downloadcomplete;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.dramarush.shortin.R;
import com.mgs.carparking.dbtable.VideoDownloadEntity;
import java.util.List;
import zp.o;

/* JADX INFO: loaded from: classes2.dex */
public class TvAndComicLandDownnloadAdapter extends RecyclerView.Adapter<b> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Context f45401i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public List<VideoDownloadEntity> f45402j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final LayoutInflater f45403k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public c f45404l;

    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f45405b;

        public a(int i10) {
            this.f45405b = i10;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (TvAndComicLandDownnloadAdapter.this.f45404l != null) {
                TvAndComicLandDownnloadAdapter.this.f45404l.a(this.f45405b);
            }
        }
    }

    public class b extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public RelativeLayout f45407l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public TextView f45408m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public ImageView f45409n;

        public b(@NonNull View view) {
            super(view);
            this.f45407l = (RelativeLayout) view.findViewById(R.id.rl_click);
            this.f45408m = (TextView) view.findViewById(R.id.tv_name);
            this.f45409n = (ImageView) view.findViewById(R.id.iv_is_play);
        }
    }

    public interface c {
        void a(int i10);
    }

    public TvAndComicLandDownnloadAdapter(Context context, List<VideoDownloadEntity> list) {
        this.f45401i = context;
        this.f45402j = list;
        this.f45403k = LayoutInflater.from(context);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(b bVar, int i10) {
        if (this.f45402j.get(i10).isCheck()) {
            bVar.f45408m.setBackground(this.f45401i.getResources().getDrawable(R.drawable.bg_home_search_tv_set_num_selector));
            bVar.f45408m.setTextColor(this.f45401i.getResources().getColor(R.color.color_commen));
            bVar.f45409n.setVisibility(0);
            Glide.with(this.f45401i).load(Integer.valueOf(R.drawable.ic_video_is_play)).into(bVar.f45409n);
        } else {
            bVar.f45408m.setBackground(this.f45401i.getResources().getDrawable(R.drawable.bg_tvcomic_land_num_normal));
            bVar.f45408m.setTextColor(this.f45401i.getResources().getColor(R.color.color_text_commen1));
            bVar.f45409n.setVisibility(8);
        }
        if (!o.b(this.f45402j.get(i10).getCollection() + "")) {
            bVar.f45408m.setText(this.f45402j.get(i10).getCollection() + "");
        }
        bVar.f45407l.setOnClickListener(new a(i10));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public b onCreateViewHolder(ViewGroup viewGroup, int i10) {
        return new b(this.f45403k.inflate(R.layout.item_pop_land_tv_set_num, viewGroup, false));
    }

    public void f(c cVar) {
        this.f45404l = cVar;
    }

    public void g(List<VideoDownloadEntity> list, int i10) {
        this.f45402j = list;
        for (int i11 = 0; i11 < list.size(); i11++) {
            if (i10 == i11) {
                list.get(i11).setCheck(true);
            } else {
                list.get(i11).setCheck(false);
            }
        }
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f45402j.size();
    }
}
