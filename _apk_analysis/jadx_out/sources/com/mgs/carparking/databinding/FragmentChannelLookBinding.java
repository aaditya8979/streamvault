package com.mgs.carparking.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.mgs.carparking.model.LOOKCHANNELVIEWMODEL;
import com.mgs.carparking.widgets.WaterDropHeader;
import com.scwang.smart.refresh.layout.SmartRefreshLayout;

/* JADX INFO: loaded from: classes10.dex */
public abstract class FragmentChannelLookBinding extends ViewDataBinding {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final AppBarLayout f42921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final RecyclerView f42922c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final RecyclerView f42923d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final CollapsingToolbarLayout f42924e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final WaterDropHeader f42925f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final ImageView f42926g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final ImageView f42927h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final LinearLayout f42928i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final SmartRefreshLayout f42929j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f42930k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public final RecyclerView f42931l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NonNull
    public final Toolbar f42932m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NonNull
    public final TextView f42933n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NonNull
    public final TextView f42934o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NonNull
    public final TextView f42935p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Bindable
    public LOOKCHANNELVIEWMODEL f42936q;

    public FragmentChannelLookBinding(Object obj, View view, int i10, AppBarLayout appBarLayout, RecyclerView recyclerView, RecyclerView recyclerView2, CollapsingToolbarLayout collapsingToolbarLayout, WaterDropHeader waterDropHeader, ImageView imageView, ImageView imageView2, LinearLayout linearLayout, SmartRefreshLayout smartRefreshLayout, RelativeLayout relativeLayout, RecyclerView recyclerView3, Toolbar toolbar, TextView textView, TextView textView2, TextView textView3) {
        super(obj, view, i10);
        this.f42921b = appBarLayout;
        this.f42922c = recyclerView;
        this.f42923d = recyclerView2;
        this.f42924e = collapsingToolbarLayout;
        this.f42925f = waterDropHeader;
        this.f42926g = imageView;
        this.f42927h = imageView2;
        this.f42928i = linearLayout;
        this.f42929j = smartRefreshLayout;
        this.f42930k = relativeLayout;
        this.f42931l = recyclerView3;
        this.f42932m = toolbar;
        this.f42933n = textView;
        this.f42934o = textView2;
        this.f42935p = textView3;
    }
}
