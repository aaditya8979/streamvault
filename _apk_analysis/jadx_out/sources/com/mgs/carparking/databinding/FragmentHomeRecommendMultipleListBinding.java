package com.mgs.carparking.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import com.mgs.carparking.ui.homecontent.recommend.HomeRecommendMultipleListAdapter;
import com.mgs.carparking.ui.homecontent.recommend.HomeRecommendMultipleListViewModel;
import com.mgs.carparking.widgets.FeedRootRecyclerView;
import com.mgs.carparking.widgets.WaterDropHeader;
import com.scwang.smart.refresh.layout.SmartRefreshLayout;

/* JADX INFO: loaded from: classes2.dex */
public abstract class FragmentHomeRecommendMultipleListBinding extends ViewDataBinding {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final WaterDropHeader f43028b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final ImageView f43029c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final SmartRefreshLayout f43030d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final FeedRootRecyclerView f43031e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f43032f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Bindable
    public HomeRecommendMultipleListViewModel f43033g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Bindable
    public HomeRecommendMultipleListAdapter f43034h;

    public FragmentHomeRecommendMultipleListBinding(Object obj, View view, int i10, WaterDropHeader waterDropHeader, ImageView imageView, SmartRefreshLayout smartRefreshLayout, FeedRootRecyclerView feedRootRecyclerView, TextView textView) {
        super(obj, view, i10);
        this.f43028b = waterDropHeader;
        this.f43029c = imageView;
        this.f43030d = smartRefreshLayout;
        this.f43031e = feedRootRecyclerView;
        this.f43032f = textView;
    }
}
