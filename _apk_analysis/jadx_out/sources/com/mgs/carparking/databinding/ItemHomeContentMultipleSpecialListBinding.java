package com.mgs.carparking.databinding;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import nc.g1;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ItemHomeContentMultipleSpecialListBinding extends ViewDataBinding {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final RecyclerView f43342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f43343c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Bindable
    public g1 f43344d;

    public ItemHomeContentMultipleSpecialListBinding(Object obj, View view, int i10, RecyclerView recyclerView, TextView textView) {
        super(obj, view, i10);
        this.f43342b = recyclerView;
        this.f43343c = textView;
    }
}
