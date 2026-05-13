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

/* JADX INFO: loaded from: classes8.dex */
public class VarietyDownnloadAdapter extends RecyclerView.Adapter<b> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Context f45293i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public List<VideoBean> f45294j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final LayoutInflater f45295k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f45296l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public c f45297m;

    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f45298b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b f45299c;

        public a(int i10, b bVar) {
            this.f45298b = i10;
            this.f45299c = bVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (VarietyDownnloadAdapter.this.f45297m != null) {
                VarietyDownnloadAdapter.this.f45297m.a(this.f45298b, this.f45299c.f45302m);
            }
        }
    }

    public class b extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public RelativeLayout f45301l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public TextView f45302m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public ImageView f45303n;

        public b(@NonNull View view) {
            super(view);
            this.f45301l = (RelativeLayout) view.findViewById(R.id.rl_click);
            this.f45302m = (TextView) view.findViewById(R.id.tv_name);
            this.f45303n = (ImageView) view.findViewById(R.id.iv_download);
        }
    }

    public interface c {
        void a(int i10, TextView textView);
    }

    public VarietyDownnloadAdapter(Context context, List<VideoBean> list, String str) {
        this.f45293i = context;
        this.f45294j = list;
        this.f45296l = str;
        this.f45295k = LayoutInflater.from(context);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(b bVar, int i10) {
        if (this.f45294j.get(i10).isCheck()) {
            bVar.f45302m.setBackground(this.f45293i.getResources().getDrawable(R.drawable.bg_home_search_tv_set_num_selector));
            bVar.f45302m.setTextColor(this.f45293i.getResources().getColor(R.color.color_commen));
        } else {
            bVar.f45302m.setBackground(this.f45293i.getResources().getDrawable(R.drawable.bg_home_search_tv_set_num));
            bVar.f45302m.setTextColor(this.f45293i.getResources().getColor(R.color.color_999999));
        }
        if (this.f45294j.get(i10).isDownload()) {
            bVar.f45303n.setVisibility(0);
            if (this.f45294j.get(i10).isCompleteDownload()) {
                bVar.f45303n.setImageResource(R.drawable.ic_video_download_complete);
            } else {
                Glide.with(this.f45293i).load(Integer.valueOf(R.drawable.ic_video_is_download)).into(bVar.f45303n);
            }
        } else {
            bVar.f45303n.setVisibility(8);
        }
        bVar.f45302m.setText(this.f45294j.get(i10).getTitle());
        bVar.f45301l.setOnClickListener(new a(i10, bVar));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public b onCreateViewHolder(ViewGroup viewGroup, int i10) {
        return new b(this.f45295k.inflate(R.layout.item_pop_variety_download, viewGroup, false));
    }

    public void f(c cVar) {
        this.f45297m = cVar;
    }

    public void g(List<VideoBean> list, int i10) {
        this.f45294j = list;
        list.get(i10).setDownload(false);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f45294j.size();
    }

    public void h(List<VideoBean> list, int i10) {
        this.f45294j = list;
        list.get(i10).setDownload(true);
        notifyDataSetChanged();
    }
}
