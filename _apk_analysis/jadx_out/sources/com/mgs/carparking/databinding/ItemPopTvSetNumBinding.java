package com.mgs.carparking.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import hc.c3;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ItemPopTvSetNumBinding extends ViewDataBinding {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ImageView f43654b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f43655c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f43656d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Bindable
    public c3 f43657e;

    public ItemPopTvSetNumBinding(Object obj, View view, int i10, ImageView imageView, RelativeLayout relativeLayout, TextView textView) {
        super(obj, view, i10);
        this.f43654b = imageView;
        this.f43655c = relativeLayout;
        this.f43656d = textView;
    }
}
