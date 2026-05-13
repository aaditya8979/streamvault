package com.mgs.carparking.databinding;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import com.mgs.carparking.widgets.cardbanner.view.RoundedImageView;
import hc.w2;

/* JADX INFO: loaded from: classes12.dex */
public abstract class ItemSpecialDetailNewItemResultBinding extends ViewDataBinding {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final RoundedImageView f43701b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f43702c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f43703d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f43704e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Bindable
    public w2 f43705f;

    public ItemSpecialDetailNewItemResultBinding(Object obj, View view, int i10, RoundedImageView roundedImageView, RelativeLayout relativeLayout, TextView textView, TextView textView2) {
        super(obj, view, i10);
        this.f43701b = roundedImageView;
        this.f43702c = relativeLayout;
        this.f43703d = textView;
        this.f43704e = textView2;
    }
}
