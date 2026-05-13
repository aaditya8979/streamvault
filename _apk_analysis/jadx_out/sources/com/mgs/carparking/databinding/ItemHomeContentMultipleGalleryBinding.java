package com.mgs.carparking.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager.widget.ViewPager;
import nc.k0;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ItemHomeContentMultipleGalleryBinding extends ViewDataBinding {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ImageView f43258b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f43259c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final ViewPager f43260d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Bindable
    public k0 f43261e;

    public ItemHomeContentMultipleGalleryBinding(Object obj, View view, int i10, ImageView imageView, TextView textView, ViewPager viewPager) {
        super(obj, view, i10);
        this.f43258b = imageView;
        this.f43259c = textView;
        this.f43260d = viewPager;
    }
}
