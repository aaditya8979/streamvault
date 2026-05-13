package com.mgs.carparking.databinding;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import nc.m0;

/* JADX INFO: loaded from: classes10.dex */
public abstract class ItemHomeContentMultipleHotBinding extends ViewDataBinding {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final RecyclerView f43267b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f43268c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Bindable
    public m0 f43269d;

    public ItemHomeContentMultipleHotBinding(Object obj, View view, int i10, RecyclerView recyclerView, TextView textView) {
        super(obj, view, i10);
        this.f43267b = recyclerView;
        this.f43268c = textView;
    }
}
