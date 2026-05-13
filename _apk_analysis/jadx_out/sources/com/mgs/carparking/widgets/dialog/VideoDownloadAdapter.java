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
import com.ironsource.Z7;
import com.mgs.carparking.netbean.VideoBean;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class VideoDownloadAdapter extends RecyclerView.Adapter<b> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Context f45316i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public List<VideoBean> f45317j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final LayoutInflater f45318k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public c f45319l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f45320m;

    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f45321b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b f45322c;

        public a(int i10, b bVar) {
            this.f45321b = i10;
            this.f45322c = bVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (VideoDownloadAdapter.this.f45319l != null) {
                VideoDownloadAdapter.this.f45319l.a(this.f45321b, this.f45322c.f45325m);
            }
        }
    }

    public class b extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public RelativeLayout f45324l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public TextView f45325m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public ImageView f45326n;

        public b(@NonNull View view) {
            super(view);
            this.f45324l = (RelativeLayout) view.findViewById(R.id.rl_click);
            this.f45325m = (TextView) view.findViewById(R.id.tv_name);
            this.f45326n = (ImageView) view.findViewById(R.id.iv_download);
        }
    }

    public interface c {
        void a(int i10, TextView textView);
    }

    public VideoDownloadAdapter(Context context, List<VideoBean> list, String str) {
        this.f45316i = context;
        this.f45317j = list;
        this.f45320m = str;
        this.f45318k = LayoutInflater.from(context);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(b bVar, int i10) {
        if (this.f45317j.get(i10).isDownload()) {
            bVar.f45326n.setVisibility(0);
            if (this.f45317j.get(i10).isCompleteDownload()) {
                bVar.f45326n.setImageResource(R.drawable.ic_video_download_complete);
            } else {
                Glide.with(this.f45316i).load(Integer.valueOf(R.drawable.ic_video_is_download)).into(bVar.f45326n);
            }
        } else {
            bVar.f45326n.setVisibility(8);
        }
        bVar.f45325m.setText(this.f45320m + Z7.f30794r + this.f45317j.get(i10).getTitle());
        bVar.f45324l.setOnClickListener(new a(i10, bVar));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public b onCreateViewHolder(ViewGroup viewGroup, int i10) {
        return new b(this.f45318k.inflate(R.layout.item_pop_video_download, viewGroup, false));
    }

    public void f(c cVar) {
        this.f45319l = cVar;
    }

    public void g(List<VideoBean> list, int i10) {
        this.f45317j = list;
        list.get(i10).setDownload(false);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f45317j.size();
    }

    public void h(List<VideoBean> list, int i10) {
        this.f45317j = list;
        list.get(i10).setDownload(true);
        notifyDataSetChanged();
    }
}
