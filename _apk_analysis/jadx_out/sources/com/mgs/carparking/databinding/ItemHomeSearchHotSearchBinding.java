package com.mgs.carparking.databinding;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import com.mgs.carparking.widgets.cardbanner.view.StraightImageView;
import hc.h2;

/* JADX INFO: loaded from: classes12.dex */
public abstract class ItemHomeSearchHotSearchBinding extends ViewDataBinding {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final StraightImageView f43593b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final LinearLayout f43594c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f43595d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f43596e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Bindable
    public h2 f43597f;

    public ItemHomeSearchHotSearchBinding(Object obj, View view, int i10, StraightImageView straightImageView, LinearLayout linearLayout, TextView textView, TextView textView2) {
        super(obj, view, i10);
        this.f43593b = straightImageView;
        this.f43594c = linearLayout;
        this.f43595d = textView;
        this.f43596e = textView2;
    }
}
