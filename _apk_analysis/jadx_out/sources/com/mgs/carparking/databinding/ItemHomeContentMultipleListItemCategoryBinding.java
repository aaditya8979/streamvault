package com.mgs.carparking.databinding;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import com.mgs.carparking.widgets.cardbanner.view.RoundedImageView;
import nc.o0;

/* JADX INFO: loaded from: classes8.dex */
public abstract class ItemHomeContentMultipleListItemCategoryBinding extends ViewDataBinding {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final RoundedImageView f43274b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Bindable
    public o0 f43275c;

    public ItemHomeContentMultipleListItemCategoryBinding(Object obj, View view, int i10, RoundedImageView roundedImageView) {
        super(obj, view, i10);
        this.f43274b = roundedImageView;
    }
}
