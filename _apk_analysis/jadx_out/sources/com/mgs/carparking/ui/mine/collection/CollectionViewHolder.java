package com.mgs.carparking.ui.mine.collection;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.dramarush.shortin.R;
import com.mgs.carparking.netbean.VideoCollectionBeanEntry;
import com.mgs.carparking.widgets.cardbanner.view.RoundedImageView;
import ec.d;
import wc.a;
import zp.r;

/* JADX INFO: loaded from: classes10.dex */
public class CollectionViewHolder extends RecyclerView.ViewHolder implements d<a, VideoCollectionBeanEntry, Integer>, View.OnClickListener {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public View f44860l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public a f44861m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Integer f44862n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public RoundedImageView f44863o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ImageView f44864p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public TextView f44865q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public VideoCollectionBeanEntry f44866r;

    public CollectionViewHolder(View view) {
        super(view);
        this.f44860l = view;
        this.f44863o = (RoundedImageView) view.findViewById(R.id.item_img);
        this.f44864p = (ImageView) view.findViewById(R.id.box_count);
        this.f44865q = (TextView) view.findViewById(R.id.tv_name);
    }

    @Override // ec.d
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(a aVar, VideoCollectionBeanEntry videoCollectionBeanEntry, Integer num) {
        this.f44861m = aVar;
        this.f44862n = num;
        if (videoCollectionBeanEntry != null) {
            this.f44866r = videoCollectionBeanEntry;
            c(aVar, videoCollectionBeanEntry);
        }
    }

    public void c(a aVar, VideoCollectionBeanEntry videoCollectionBeanEntry) {
        if (videoCollectionBeanEntry == null) {
            return;
        }
        a aVar2 = this.f44861m;
        if (aVar2 != null) {
            this.f44864p.setVisibility(aVar2.b() ? 0 : 8);
        }
        this.f44864p.setImageDrawable(this.f44861m.g(String.valueOf(videoCollectionBeanEntry.getId())) ? ContextCompat.getDrawable(r.b(), R.drawable.ic_mine_history_selector) : ContextCompat.getDrawable(r.b(), R.drawable.ic_feedback_item_unselector));
        this.f44864p.setOnClickListener(this);
        Glide.with(this.f44860l.getContext()).load(videoCollectionBeanEntry.getVod_pic()).into(this.f44863o);
        this.f44863o.setOnClickListener(this);
        this.f44865q.setText(videoCollectionBeanEntry.getVod_name());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        a aVar;
        a aVar2;
        if (view == this.f44863o && (aVar2 = this.f44861m) != null) {
            aVar2.e(String.valueOf(this.f44866r.getId()), this.f44866r.getType_pid(), this.f44862n.intValue());
        }
        if (view != this.f44864p || (aVar = this.f44861m) == null) {
            return;
        }
        aVar.f(String.valueOf(this.f44866r.getId()), this.f44862n.intValue());
    }
}
