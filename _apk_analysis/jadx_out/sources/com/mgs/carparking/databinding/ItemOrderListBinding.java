package com.mgs.carparking.databinding;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import hc.d2;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ItemOrderListBinding extends ViewDataBinding {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f43636b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f43637c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f43638d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f43639e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Bindable
    public d2 f43640f;

    public ItemOrderListBinding(Object obj, View view, int i10, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        super(obj, view, i10);
        this.f43636b = textView;
        this.f43637c = textView2;
        this.f43638d = textView3;
        this.f43639e = textView4;
    }
}
