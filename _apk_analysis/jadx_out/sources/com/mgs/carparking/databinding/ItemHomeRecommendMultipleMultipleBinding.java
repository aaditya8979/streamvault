package com.mgs.carparking.databinding;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import pc.g0;

/* JADX INFO: loaded from: classes11.dex */
public abstract class ItemHomeRecommendMultipleMultipleBinding extends ViewDataBinding {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final RecyclerView f43564b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f43565c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Bindable
    public g0 f43566d;

    public ItemHomeRecommendMultipleMultipleBinding(Object obj, View view, int i10, RecyclerView recyclerView, TextView textView) {
        super(obj, view, i10);
        this.f43564b = recyclerView;
        this.f43565c = textView;
    }
}
