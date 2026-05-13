package com.mgs.carparking.databinding;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import com.mgs.carparking.widgets.cardbanner.view.RoundedImageView;
import nc.q0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ItemHomeContentMultipleListItemHotBinding extends ViewDataBinding {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final RoundedImageView f43290b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Bindable
    public q0 f43291c;

    public ItemHomeContentMultipleListItemHotBinding(Object obj, View view, int i10, RoundedImageView roundedImageView) {
        super(obj, view, i10);
        this.f43290b = roundedImageView;
    }
}
