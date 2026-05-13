package com.mgs.carparking.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import com.mgs.carparking.model.EXTENSIONSHAREVIEWMODEL;
import com.ruffian.library.widget.RConstraintLayout;
import com.ruffian.library.widget.RTextView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class ActivityExtensionShareBinding extends ViewDataBinding {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ActionbarBackBinding f42615b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final RConstraintLayout f42616c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final ImageView f42617d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final LinearLayout f42618e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f42619f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final RTextView f42620g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Bindable
    public EXTENSIONSHAREVIEWMODEL f42621h;

    public ActivityExtensionShareBinding(Object obj, View view, int i10, ActionbarBackBinding actionbarBackBinding, RConstraintLayout rConstraintLayout, ImageView imageView, LinearLayout linearLayout, TextView textView, RTextView rTextView) {
        super(obj, view, i10);
        this.f42615b = actionbarBackBinding;
        this.f42616c = rConstraintLayout;
        this.f42617d = imageView;
        this.f42618e = linearLayout;
        this.f42619f = textView;
        this.f42620g = rTextView;
    }
}
