package com.mgs.carparking.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import pc.p;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ItemHomeRecommendMultipleCategoryBinding extends ViewDataBinding {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ImageView f43438b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final RecyclerView f43439c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f43440d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f43441e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Bindable
    public p f43442f;

    public ItemHomeRecommendMultipleCategoryBinding(Object obj, View view, int i10, ImageView imageView, RecyclerView recyclerView, TextView textView, TextView textView2) {
        super(obj, view, i10);
        this.f43438b = imageView;
        this.f43439c = recyclerView;
        this.f43440d = textView;
        this.f43441e = textView2;
    }
}
