package com.mgs.carparking.databinding;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import nc.a1;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ItemHomeContentMultipleNoTitleBinding extends ViewDataBinding {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final RecyclerView f43330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Bindable
    public a1 f43331c;

    public ItemHomeContentMultipleNoTitleBinding(Object obj, View view, int i10, RecyclerView recyclerView) {
        super(obj, view, i10);
        this.f43330b = recyclerView;
    }
}
