package com.mgs.carparking.databinding;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import pc.q0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ItemRecommendMultipleSpecialListBinding extends ViewDataBinding {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final RecyclerView f43681b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f43682c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Bindable
    public q0 f43683d;

    public ItemRecommendMultipleSpecialListBinding(Object obj, View view, int i10, RecyclerView recyclerView, TextView textView) {
        super(obj, view, i10);
        this.f43681b = recyclerView;
        this.f43682c = textView;
    }
}
