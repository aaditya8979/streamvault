package com.mgs.carparking.widgets.dialog.downloadcomplete;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.dramarush.shortin.R;
import com.mgs.carparking.dbtable.VideoDownloadEntity;
import java.util.List;
import zp.o;

/* JADX INFO: loaded from: classes10.dex */
public class VarietyCompleteLandAdapter extends RecyclerView.Adapter<b> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Context f45411i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public List<VideoDownloadEntity> f45412j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final LayoutInflater f45413k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public c f45414l;

    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f45415b;

        public a(int i10) {
            this.f45415b = i10;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (VarietyCompleteLandAdapter.this.f45414l != null) {
                VarietyCompleteLandAdapter.this.f45414l.a(this.f45415b);
            }
        }
    }

    public class b extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public LinearLayout f45417l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public TextView f45418m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public ImageView f45419n;

        public b(@NonNull View view) {
            super(view);
            this.f45417l = (LinearLayout) view.findViewById(R.id.ll_click);
            this.f45418m = (TextView) view.findViewById(R.id.tv_name);
            this.f45419n = (ImageView) view.findViewById(R.id.iv_is_play);
        }
    }

    public interface c {
        void a(int i10);
    }

    public VarietyCompleteLandAdapter(Context context, List<VideoDownloadEntity> list) {
        this.f45411i = context;
        this.f45412j = list;
        this.f45413k = LayoutInflater.from(context);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(b bVar, int i10) {
        if (this.f45412j.get(i10).isCheck()) {
            bVar.f45418m.setBackground(this.f45411i.getResources().getDrawable(R.drawable.bg_home_search_tv_set_num_selector));
            bVar.f45418m.setTextColor(this.f45411i.getResources().getColor(R.color.color_commen));
            bVar.f45419n.setVisibility(0);
            Glide.with(this.f45411i).load(Integer.valueOf(R.drawable.ic_video_is_play)).into(bVar.f45419n);
        } else {
            bVar.f45418m.setBackground(this.f45411i.getResources().getDrawable(R.drawable.bg_tvcomic_land_num_normal));
            bVar.f45418m.setTextColor(this.f45411i.getResources().getColor(R.color.color_text_commen1));
            bVar.f45419n.setVisibility(8);
        }
        if (!o.b(this.f45412j.get(i10).getLastName())) {
            bVar.f45418m.setText(this.f45412j.get(i10).getLastName());
        }
        bVar.f45417l.setOnClickListener(new a(i10));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public b onCreateViewHolder(ViewGroup viewGroup, int i10) {
        return new b(this.f45413k.inflate(R.layout.item_pop_land_variety, viewGroup, false));
    }

    public void f(c cVar) {
        this.f45414l = cVar;
    }

    public void g(List<VideoDownloadEntity> list, int i10) {
        this.f45412j = list;
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
        return this.f45412j.size();
    }
}
