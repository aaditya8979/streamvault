package com.mgs.carparking.ui.homecontent.more;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.dramarush.shortin.R;
import com.mgs.carparking.app.AppApplication;
import ec.d;
import ed.b;
import oc.a;

/* JADX INFO: loaded from: classes11.dex */
public class VideoMoreAdsViewHolder extends RecyclerView.ViewHolder implements d<a, Object, Integer>, View.OnClickListener {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public View f44638l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public a f44639m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Integer f44640n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public FrameLayout f44641o;

    public VideoMoreAdsViewHolder(View view) {
        super(view);
        this.f44638l = view;
        this.f44641o = (FrameLayout) view.findViewById(R.id.layout_adView);
        this.f44638l.setOnClickListener(this);
    }

    @Override // ec.d
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(a aVar, Object obj, Integer num) {
        this.f44639m = aVar;
        this.f44640n = num;
        c(aVar, obj);
    }

    public void c(a aVar, Object obj) {
        if (AppApplication.adInfoEntry.getAd_position_17() == null || AppApplication.adInfoEntry.getAd_position_17().size() <= 0 || AppApplication.adInfoEntry.getAd_position_17() == null || AppApplication.adInfoEntry.getAd_position_17().size() <= 0) {
            return;
        }
        b.p((Activity) this.f44638l.getContext(), this.f44641o, AppApplication.adInfoEntry.getAd_position_17());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
    }
}
