package com.mgs.carparking.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import nc.j0;

/* JADX INFO: loaded from: classes8.dex */
public abstract class ItemHomeContentMultipleCategoryBinding extends ViewDataBinding {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ImageView f43241b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final RecyclerView f43242c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f43243d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f43244e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Bindable
    public j0 f43245f;

    public ItemHomeContentMultipleCategoryBinding(Object obj, View view, int i10, ImageView imageView, RecyclerView recyclerView, TextView textView, TextView textView2) {
        super(obj, view, i10);
        this.f43241b = imageView;
        this.f43242c = recyclerView;
        this.f43243d = textView;
        this.f43244e = textView2;
    }
}
