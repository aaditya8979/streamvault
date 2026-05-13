package com.mgs.carparking.databinding;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import nc.y0;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ItemHomeContentMultipleNewBinding extends ViewDataBinding {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final RecyclerView f43321b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f43322c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Bindable
    public y0 f43323d;

    public ItemHomeContentMultipleNewBinding(Object obj, View view, int i10, RecyclerView recyclerView, TextView textView) {
        super(obj, view, i10);
        this.f43321b = recyclerView;
        this.f43322c = textView;
    }
}
