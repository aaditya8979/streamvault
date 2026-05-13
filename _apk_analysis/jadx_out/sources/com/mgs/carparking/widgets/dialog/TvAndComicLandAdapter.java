package com.mgs.carparking.widgets.dialog;

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
import com.mgs.carparking.netbean.VideoBean;
import java.util.List;
import zp.o;

/* JADX INFO: loaded from: classes3.dex */
public class TvAndComicLandAdapter extends RecyclerView.Adapter<b> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Context f45272i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public List<VideoBean> f45273j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final LayoutInflater f45274k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public c f45275l;

    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f45276b;

        public a(int i10) {
            this.f45276b = i10;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (o.b(((VideoBean) TvAndComicLandAdapter.this.f45273j.get(this.f45276b)).getVod_url()) || TvAndComicLandAdapter.this.f45275l == null) {
                return;
            }
            TvAndComicLandAdapter.this.f45275l.a(this.f45276b);
        }
    }

    public class b extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public RelativeLayout f45278l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public TextView f45279m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public ImageView f45280n;

        public b(@NonNull View view) {
            super(view);
            this.f45278l = (RelativeLayout) view.findViewById(R.id.rl_click);
            this.f45279m = (TextView) view.findViewById(R.id.tv_name);
            this.f45280n = (ImageView) view.findViewById(R.id.iv_is_play);
        }
    }

    public interface c {
        void a(int i10);
    }

    public TvAndComicLandAdapter(Context context, List<VideoBean> list) {
        this.f45272i = context;
        this.f45273j = list;
        this.f45274k = LayoutInflater.from(context);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(b bVar, int i10) {
        if (this.f45273j.get(i10).isCheck()) {
            bVar.f45279m.setBackground(this.f45272i.getResources().getDrawable(R.drawable.bg_home_search_tv_set_num_selector));
            bVar.f45279m.setTextColor(this.f45272i.getResources().getColor(R.color.color_commen));
            bVar.f45280n.setVisibility(0);
            Glide.with(this.f45272i).load(Integer.valueOf(R.drawable.ic_video_is_play)).into(bVar.f45280n);
        } else {
            bVar.f45279m.setBackground(this.f45272i.getResources().getDrawable(R.drawable.bg_tvcomic_land_num_normal));
            if (o.b(this.f45273j.get(i10).getVod_url())) {
                bVar.f45279m.setTextColor(this.f45272i.getResources().getColor(R.color.color_666666));
            } else {
                bVar.f45279m.setTextColor(this.f45272i.getResources().getColor(R.color.color_text_commen1));
            }
            bVar.f45280n.setVisibility(8);
        }
        bVar.f45279m.setText(this.f45273j.get(i10).getTitle());
        bVar.f45278l.setOnClickListener(new a(i10));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public b onCreateViewHolder(ViewGroup viewGroup, int i10) {
        return new b(this.f45274k.inflate(R.layout.item_pop_land_tv_set_num, viewGroup, false));
    }

    public void g(c cVar) {
        this.f45275l = cVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f45273j.size();
    }

    public void h(List<VideoBean> list, int i10) {
        this.f45273j = list;
        for (int i11 = 0; i11 < list.size(); i11++) {
            if (i10 == i11) {
                list.get(i11).setCheck(true);
            } else {
                list.get(i11).setCheck(false);
            }
        }
        notifyDataSetChanged();
    }
}
