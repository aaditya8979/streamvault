package com.mgs.carparking.databinding;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import chuangyuan.ycj.videolibrary.widget.VideoPlayerView;
import com.mgs.carparking.model.VIDEOPLAYDETAILVIEWMODEL;
import com.mgs.carparking.widgets.CircularImageView;
import com.mgs.carparking.widgets.ObservableScrollView;
import com.mgs.carparking.widgets.WaterDropHeader;
import com.ruffian.library.widget.RTextView;
import com.scwang.smart.refresh.layout.SmartRefreshLayout;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ActivityVideoPlayDetailBinding extends ViewDataBinding {

    @NonNull
    public final RTextView A;

    @NonNull
    public final TextView B;

    @NonNull
    public final TextView C;

    @NonNull
    public final TextView D;

    @NonNull
    public final TextView E;

    @NonNull
    public final TextView F;

    @NonNull
    public final TextView G;

    @NonNull
    public final ConstraintLayout H;

    @Bindable
    public VIDEOPLAYDETAILVIEWMODEL I;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final VideoPlayerView f42796b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final FrameLayout f42797c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final WaterDropHeader f42798d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final ImageView f42799e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final ImageView f42800f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextView f42801g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final CircularImageView f42802h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final TextView f42803i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f42804j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public final TextView f42805k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f42806l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NonNull
    public final TextView f42807m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f42808n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NonNull
    public final ImageView f42809o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NonNull
    public final ImageView f42810p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NonNull
    public final ImageView f42811q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NonNull
    public final TextView f42812r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NonNull
    public final FrameLayout f42813s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NonNull
    public final SmartRefreshLayout f42814t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f42815u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f42816v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NonNull
    public final RecyclerView f42817w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NonNull
    public final RecyclerView f42818x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NonNull
    public final RecyclerView f42819y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NonNull
    public final ObservableScrollView f42820z;

    public ActivityVideoPlayDetailBinding(Object obj, View view, int i10, VideoPlayerView videoPlayerView, FrameLayout frameLayout, WaterDropHeader waterDropHeader, ImageView imageView, ImageView imageView2, TextView textView, CircularImageView circularImageView, TextView textView2, ConstraintLayout constraintLayout, TextView textView3, ConstraintLayout constraintLayout2, TextView textView4, ConstraintLayout constraintLayout3, ImageView imageView3, ImageView imageView4, ImageView imageView5, TextView textView5, FrameLayout frameLayout2, SmartRefreshLayout smartRefreshLayout, RelativeLayout relativeLayout, RelativeLayout relativeLayout2, RecyclerView recyclerView, RecyclerView recyclerView2, RecyclerView recyclerView3, ObservableScrollView observableScrollView, RTextView rTextView, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, ConstraintLayout constraintLayout4) {
        super(obj, view, i10);
        this.f42796b = videoPlayerView;
        this.f42797c = frameLayout;
        this.f42798d = waterDropHeader;
        this.f42799e = imageView;
        this.f42800f = imageView2;
        this.f42801g = textView;
        this.f42802h = circularImageView;
        this.f42803i = textView2;
        this.f42804j = constraintLayout;
        this.f42805k = textView3;
        this.f42806l = constraintLayout2;
        this.f42807m = textView4;
        this.f42808n = constraintLayout3;
        this.f42809o = imageView3;
        this.f42810p = imageView4;
        this.f42811q = imageView5;
        this.f42812r = textView5;
        this.f42813s = frameLayout2;
        this.f42814t = smartRefreshLayout;
        this.f42815u = relativeLayout;
        this.f42816v = relativeLayout2;
        this.f42817w = recyclerView;
        this.f42818x = recyclerView2;
        this.f42819y = recyclerView3;
        this.f42820z = observableScrollView;
        this.A = rTextView;
        this.B = textView6;
        this.C = textView7;
        this.D = textView8;
        this.E = textView9;
        this.F = textView10;
        this.G = textView11;
        this.H = constraintLayout4;
    }
}
