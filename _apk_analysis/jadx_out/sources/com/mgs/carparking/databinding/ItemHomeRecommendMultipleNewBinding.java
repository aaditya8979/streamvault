package com.mgs.carparking.databinding;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import pc.k0;

/* JADX INFO: loaded from: classes11.dex */
public abstract class ItemHomeRecommendMultipleNewBinding extends ViewDataBinding {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final RecyclerView f43578b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f43579c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Bindable
    public k0 f43580d;

    public ItemHomeRecommendMultipleNewBinding(Object obj, View view, int i10, RecyclerView recyclerView, TextView textView) {
        super(obj, view, i10);
        this.f43578b = recyclerView;
        this.f43579c = textView;
    }
}
