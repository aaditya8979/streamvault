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

/* JADX INFO: loaded from: classes11.dex */
public class TvAndComicDownloadAdapter extends RecyclerView.Adapter<b> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Context f45261i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public List<VideoBean> f45262j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final LayoutInflater f45263k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public c f45264l;

    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f45265b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b f45266c;

        public a(int i10, b bVar) {
            this.f45265b = i10;
            this.f45266c = bVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (TvAndComicDownloadAdapter.this.f45264l != null) {
                TvAndComicDownloadAdapter.this.f45264l.a(this.f45265b, this.f45266c.f45270n);
            }
        }
    }

    public class b extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public RelativeLayout f45268l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public ImageView f45269m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public TextView f45270n;

        public b(@NonNull View view) {
            super(view);
            this.f45268l = (RelativeLayout) view.findViewById(R.id.rl_click);
            this.f45270n = (TextView) view.findViewById(R.id.tv_name);
            this.f45269m = (ImageView) view.findViewById(R.id.iv_download);
        }
    }

    public interface c {
        void a(int i10, TextView textView);
    }

    public TvAndComicDownloadAdapter(Context context, List<VideoBean> list) {
        this.f45261i = context;
        this.f45262j = list;
        this.f45263k = LayoutInflater.from(context);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(b bVar, int i10) {
        if (this.f45262j.get(i10).isCheck()) {
            bVar.f45270n.setBackground(this.f45261i.getResources().getDrawable(R.drawable.bg_home_search_tv_set_num_selector));
            bVar.f45270n.setTextColor(this.f45261i.getResources().getColor(R.color.color_commen));
        } else {
            if (o.b(this.f45262j.get(i10).getVod_url())) {
                bVar.f45270n.setTextColor(this.f45261i.getResources().getColor(R.color.black));
            } else {
                bVar.f45270n.setTextColor(this.f45261i.getResources().getColor(R.color.color_999999));
            }
            bVar.f45270n.setBackground(this.f45261i.getResources().getDrawable(R.drawable.bg_home_search_tv_set_num));
        }
        if (this.f45262j.get(i10).isDownload()) {
            bVar.f45269m.setVisibility(0);
            if (this.f45262j.get(i10).isCompleteDownload()) {
                bVar.f45269m.setImageResource(R.drawable.ic_video_download_complete);
            } else {
                Glide.with(this.f45261i).load(Integer.valueOf(R.drawable.ic_video_is_download)).into(bVar.f45269m);
            }
        } else {
            bVar.f45269m.setVisibility(8);
        }
        bVar.f45270n.setText(this.f45262j.get(i10).getTitle());
        bVar.f45268l.setOnClickListener(new a(i10, bVar));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public b onCreateViewHolder(ViewGroup viewGroup, int i10) {
        return new b(this.f45263k.inflate(R.layout.item_pop_tv_set_num_download, viewGroup, false));
    }

    public void f(c cVar) {
        this.f45264l = cVar;
    }

    public void g(List<VideoBean> list, int i10) {
        this.f45262j = list;
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
        return this.f45262j.size();
    }

    public void h(List<VideoBean> list, int i10) {
        this.f45262j = list;
        list.get(i10).setDownload(false);
        notifyDataSetChanged();
    }

    public void i(List<VideoBean> list, int i10) {
        this.f45262j = list;
        list.get(i10).setDownload(true);
        notifyDataSetChanged();
    }
}
