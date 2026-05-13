package com.mgs.carparking.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import hc.c3;

/* JADX INFO: loaded from: classes8.dex */
public abstract class ItemPopLandTvSetNumBinding extends ViewDataBinding {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ImageView f43645b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f43646c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f43647d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Bindable
    public c3 f43648e;

    public ItemPopLandTvSetNumBinding(Object obj, View view, int i10, ImageView imageView, RelativeLayout relativeLayout, TextView textView) {
        super(obj, view, i10);
        this.f43645b = imageView;
        this.f43646c = relativeLayout;
        this.f43647d = textView;
    }
}
