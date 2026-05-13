package com.mgs.carparking.databinding;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import com.mgs.carparking.widgets.BannerView;
import pc.m0;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ItemHomeRecommendMultipleSlideBinding extends ViewDataBinding {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final BannerView f43587b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Bindable
    public m0 f43588c;

    public ItemHomeRecommendMultipleSlideBinding(Object obj, View view, int i10, BannerView bannerView) {
        super(obj, view, i10);
        this.f43587b = bannerView;
    }
}
