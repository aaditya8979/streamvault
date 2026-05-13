package com.mgs.carparking.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.mgs.carparking.ui.homecontent.HomeContentListViewModel;
import com.mgs.carparking.util.DotView;
import com.mgs.carparking.widgets.WaterDropHeader;
import com.mgs.carparking.widgets.cardbanner.CardBanner;
import com.scwang.smart.refresh.layout.SmartRefreshLayout;

/* JADX INFO: loaded from: classes12.dex */
public abstract class FragmentHomeContentListBinding extends ViewDataBinding {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final DotView f42979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final WaterDropHeader f42980c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final CardBanner f42981d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final ImageView f42982e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final SmartRefreshLayout f42983f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final RecyclerView f42984g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextView f42985h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Bindable
    public HomeContentListViewModel f42986i;

    public FragmentHomeContentListBinding(Object obj, View view, int i10, DotView dotView, WaterDropHeader waterDropHeader, CardBanner cardBanner, ImageView imageView, SmartRefreshLayout smartRefreshLayout, RecyclerView recyclerView, TextView textView) {
        super(obj, view, i10);
        this.f42979b = dotView;
        this.f42980c = waterDropHeader;
        this.f42981d = cardBanner;
        this.f42982e = imageView;
        this.f42983f = smartRefreshLayout;
        this.f42984g = recyclerView;
        this.f42985h = textView;
    }
}
