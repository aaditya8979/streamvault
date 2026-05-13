package com.mgs.carparking.ui.homecontent.more;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.dramarush.shortin.R;
import com.mgs.carparking.netbean.RecommandVideosEntity;
import com.mgs.carparking.widgets.cardbanner.view.RoundedImageView;
import ec.d;
import ed.e;
import oc.a;
import zp.o;
import zp.r;

/* JADX INFO: loaded from: classes4.dex */
public class VideoMoreViewHolder extends RecyclerView.ViewHolder implements d<a, RecommandVideosEntity, Integer>, View.OnClickListener {
    public String A;
    public String B;
    public String C;
    public String D;
    public String E;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public View f44652l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public a f44653m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Integer f44654n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public TextView f44655o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public TextView f44656p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public TextView f44657q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public TextView f44658r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public TextView f44659s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public TextView f44660t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public TextView f44661u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public TextView f44662v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ImageView f44663w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public RoundedImageView f44664x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public RecommandVideosEntity f44665y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Drawable f44666z;

    public VideoMoreViewHolder(View view) {
        super(view);
        this.A = "";
        this.B = "";
        this.C = "";
        this.D = "";
        this.E = "";
        this.f44652l = view;
        this.f44663w = (ImageView) view.findViewById(R.id.iv_cover);
        this.f44664x = (RoundedImageView) view.findViewById(R.id.item_img);
        this.f44655o = (TextView) view.findViewById(R.id.tv_score);
        this.f44656p = (TextView) view.findViewById(R.id.tv_vod_name);
        this.f44658r = (TextView) view.findViewById(R.id.tv_year);
        this.f44659s = (TextView) view.findViewById(R.id.tv_area);
        this.f44661u = (TextView) view.findViewById(R.id.tv_actor);
        this.f44662v = (TextView) view.findViewById(R.id.tv_num);
        this.f44660t = (TextView) view.findViewById(R.id.tv_tag);
        this.f44657q = (TextView) view.findViewById(R.id.tv_director);
        this.f44652l.setOnClickListener(this);
    }

    @Override // ec.d
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(a aVar, RecommandVideosEntity recommandVideosEntity, Integer num) {
        this.f44653m = aVar;
        this.f44654n = num;
        this.f44665y = recommandVideosEntity;
        if (recommandVideosEntity != null) {
            c(aVar, recommandVideosEntity);
        }
    }

    public void c(a aVar, RecommandVideosEntity recommandVideosEntity) {
        if (recommandVideosEntity == null) {
            return;
        }
        if (recommandVideosEntity.getIcon_type() == 1) {
            this.f44666z = ContextCompat.getDrawable(this.itemView.getContext(), R.drawable.ic_video_hot_play);
        } else if (recommandVideosEntity.getIcon_type() == 2) {
            this.f44666z = ContextCompat.getDrawable(this.itemView.getContext(), R.drawable.ic_video_high_score);
        }
        if (recommandVideosEntity.getType_pid() == 1) {
            if (!o.b(recommandVideosEntity.getVod_douban_score())) {
                this.f44655o.setText(e.m(recommandVideosEntity.getVod_douban_score()));
            }
        } else if (recommandVideosEntity.getType_pid() != 2 && recommandVideosEntity.getType_pid() != 4) {
            this.f44662v.setText(recommandVideosEntity.getCollection_new_title() + "");
        } else if (recommandVideosEntity.getVod_isend() == 1) {
            this.f44662v.setText(recommandVideosEntity.getVod_total() + r.b().getResources().getString(R.string.text_colections));
        } else {
            this.f44662v.setText(r.b().getResources().getString(R.string.text_up_colections, recommandVideosEntity.getVod_serial()));
        }
        if (o.b(recommandVideosEntity.getVod_director())) {
            this.A = r.b().getResources().getString(R.string.text_director) + "：" + r.b().getResources().getString(R.string.text_unknow);
        } else {
            this.A = r.b().getResources().getString(R.string.text_director) + "：" + recommandVideosEntity.getVod_director();
        }
        if (o.b(recommandVideosEntity.getVod_actor())) {
            this.B = r.b().getResources().getString(R.string.text_actor) + "：" + r.b().getResources().getString(R.string.text_unknow);
        } else {
            this.B = r.b().getResources().getString(R.string.text_actor) + "：" + recommandVideosEntity.getVod_actor();
        }
        if (o.b(recommandVideosEntity.getVod_year())) {
            this.D = r.b().getResources().getString(R.string.text_unknow);
        } else {
            this.D = recommandVideosEntity.getVod_year();
        }
        if (o.b(recommandVideosEntity.getVod_tag())) {
            this.E = r.b().getResources().getString(R.string.text_unknow);
        } else {
            this.E = recommandVideosEntity.getVod_tag();
        }
        Glide.with(this.itemView.getContext()).load(recommandVideosEntity.getVod_pic()).into(this.f44664x);
        this.f44663w.setVisibility(recommandVideosEntity.getIcon_type() == 0 ? 8 : 0);
        this.f44663w.setBackground(this.f44666z);
        this.f44656p.setText(recommandVideosEntity.getVod_name());
        this.f44660t.setText(this.E);
        this.f44661u.setText(this.B);
        this.f44659s.setText(this.C);
        this.f44658r.setText(this.D);
        this.f44662v.setVisibility(recommandVideosEntity.getType_pid() != 1 ? 0 : 8);
        this.f44655o.setVisibility(recommandVideosEntity.getType_pid() != 1 ? 8 : 0);
        this.f44657q.setText(this.A);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        a aVar = this.f44653m;
        if (aVar != null) {
            aVar.onClick(this.f44665y);
        }
    }
}
