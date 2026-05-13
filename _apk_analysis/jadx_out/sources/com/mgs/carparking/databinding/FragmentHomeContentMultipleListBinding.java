package com.mgs.carparking.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import com.mgs.carparking.ui.homecontent.HomeContentMultipleListAdapter;
import com.mgs.carparking.ui.homecontent.HomeContentMultipleListViewModel;
import com.mgs.carparking.widgets.FeedRootRecyclerView;
import com.mgs.carparking.widgets.WaterDropHeader;
import com.scwang.smart.refresh.layout.SmartRefreshLayout;

/* JADX INFO: loaded from: classes2.dex */
public abstract class FragmentHomeContentMultipleListBinding extends ViewDataBinding {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final WaterDropHeader f42994b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final ImageView f42995c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final SmartRefreshLayout f42996d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final FeedRootRecyclerView f42997e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f42998f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Bindable
    public HomeContentMultipleListViewModel f42999g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Bindable
    public HomeContentMultipleListAdapter f43000h;

    public FragmentHomeContentMultipleListBinding(Object obj, View view, int i10, WaterDropHeader waterDropHeader, ImageView imageView, SmartRefreshLayout smartRefreshLayout, FeedRootRecyclerView feedRootRecyclerView, TextView textView) {
        super(obj, view, i10);
        this.f42994b = waterDropHeader;
        this.f42995c = imageView;
        this.f42996d = smartRefreshLayout;
        this.f42997e = feedRootRecyclerView;
        this.f42998f = textView;
    }
}
