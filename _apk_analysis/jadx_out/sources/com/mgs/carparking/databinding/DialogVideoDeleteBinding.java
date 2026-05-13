package com.mgs.carparking.databinding;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import com.mgs.carparking.model.DOWNLOADVIDEOVIEWMODEL;

/* JADX INFO: loaded from: classes10.dex */
public abstract class DialogVideoDeleteBinding extends ViewDataBinding {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final LinearLayout f42873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f42874c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Bindable
    public DOWNLOADVIDEOVIEWMODEL f42875d;

    public DialogVideoDeleteBinding(Object obj, View view, int i10, LinearLayout linearLayout, TextView textView) {
        super(obj, view, i10);
        this.f42873b = linearLayout;
        this.f42874c = textView;
    }

    public abstract void b(@Nullable DOWNLOADVIDEOVIEWMODEL downloadvideoviewmodel);
}
