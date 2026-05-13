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
import com.mgs.carparking.model.CHANNELVIEWMODEL;
import com.mgs.carparking.widgets.WaterDropHeader;
import com.scwang.smart.refresh.layout.SmartRefreshLayout;

/* JADX INFO: loaded from: classes12.dex */
public abstract class FragmentChannelBinding extends ViewDataBinding {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final AppBarLayout f42896b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final RecyclerView f42897c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final RecyclerView f42898d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final CollapsingToolbarLayout f42899e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final WaterDropHeader f42900f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final ImageView f42901g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final ImageView f42902h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final LinearLayout f42903i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final SmartRefreshLayout f42904j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f42905k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public final RecyclerView f42906l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NonNull
    public final Toolbar f42907m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NonNull
    public final TextView f42908n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NonNull
    public final TextView f42909o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NonNull
    public final TextView f42910p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Bindable
    public CHANNELVIEWMODEL f42911q;

    public FragmentChannelBinding(Object obj, View view, int i10, AppBarLayout appBarLayout, RecyclerView recyclerView, RecyclerView recyclerView2, CollapsingToolbarLayout collapsingToolbarLayout, WaterDropHeader waterDropHeader, ImageView imageView, ImageView imageView2, LinearLayout linearLayout, SmartRefreshLayout smartRefreshLayout, RelativeLayout relativeLayout, RecyclerView recyclerView3, Toolbar toolbar, TextView textView, TextView textView2, TextView textView3) {
        super(obj, view, i10);
        this.f42896b = appBarLayout;
        this.f42897c = recyclerView;
        this.f42898d = recyclerView2;
        this.f42899e = collapsingToolbarLayout;
        this.f42900f = waterDropHeader;
        this.f42901g = imageView;
        this.f42902h = imageView2;
        this.f42903i = linearLayout;
        this.f42904j = smartRefreshLayout;
        this.f42905k = relativeLayout;
        this.f42906l = recyclerView3;
        this.f42907m = toolbar;
        this.f42908n = textView;
        this.f42909o = textView2;
        this.f42910p = textView3;
    }
}
