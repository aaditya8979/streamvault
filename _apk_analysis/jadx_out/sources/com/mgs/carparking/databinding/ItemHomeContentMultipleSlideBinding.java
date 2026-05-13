package com.mgs.carparking.databinding;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import com.mgs.carparking.widgets.BannerView;
import nc.c1;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ItemHomeContentMultipleSlideBinding extends ViewDataBinding {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final BannerView f43336b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Bindable
    public c1 f43337c;

    public ItemHomeContentMultipleSlideBinding(Object obj, View view, int i10, BannerView bannerView) {
        super(obj, view, i10);
        this.f43336b = bannerView;
    }
}
