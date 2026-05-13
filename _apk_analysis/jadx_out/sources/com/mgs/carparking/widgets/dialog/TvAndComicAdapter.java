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

/* JADX INFO: loaded from: classes9.dex */
public class TvAndComicAdapter extends RecyclerView.Adapter<b> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Context f45251i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public List<VideoBean> f45252j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final LayoutInflater f45253k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public c f45254l;

    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f45255b;

        public a(int i10) {
            this.f45255b = i10;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (TvAndComicAdapter.this.f45254l != null) {
                TvAndComicAdapter.this.f45254l.a(this.f45255b);
            }
        }
    }

    public class b extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public RelativeLayout f45257l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public TextView f45258m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public ImageView f45259n;

        public b(@NonNull View view) {
            super(view);
            this.f45257l = (RelativeLayout) view.findViewById(R.id.rl_click);
            this.f45258m = (TextView) view.findViewById(R.id.tv_name);
            this.f45259n = (ImageView) view.findViewById(R.id.iv_is_play);
        }
    }

    public interface c {
        void a(int i10);
    }

    public TvAndComicAdapter(Context context, List<VideoBean> list) {
        this.f45251i = context;
        this.f45252j = list;
        this.f45253k = LayoutInflater.from(context);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(b bVar, int i10) {
        if (this.f45252j.get(i10).isCheck()) {
            bVar.f45258m.setBackground(this.f45251i.getResources().getDrawable(R.drawable.bg_home_search_tv_set_num_selector));
            bVar.f45258m.setTextColor(this.f45251i.getResources().getColor(R.color.color_commen));
            bVar.f45259n.setVisibility(0);
            Glide.with(this.f45251i).load(Integer.valueOf(R.drawable.ic_video_is_play)).into(bVar.f45259n);
        } else {
            bVar.f45258m.setBackground(this.f45251i.getResources().getDrawable(R.drawable.bg_home_search_tv_set_num));
            if (o.b(this.f45252j.get(i10).getVod_url())) {
                bVar.f45258m.setTextColor(this.f45251i.getResources().getColor(R.color.color_999999));
            } else {
                bVar.f45258m.setTextColor(this.f45251i.getResources().getColor(R.color.color_999999));
            }
            bVar.f45259n.setVisibility(8);
        }
        bVar.f45258m.setText(this.f45252j.get(i10).getTitle());
        bVar.f45257l.setOnClickListener(new a(i10));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public b onCreateViewHolder(ViewGroup viewGroup, int i10) {
        return new b(this.f45253k.inflate(R.layout.item_pop_tv_set_num, viewGroup, false));
    }

    public void f(c cVar) {
        this.f45254l = cVar;
    }

    public void g(List<VideoBean> list, int i10) {
        this.f45252j = list;
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
        return this.f45252j.size();
    }
}
