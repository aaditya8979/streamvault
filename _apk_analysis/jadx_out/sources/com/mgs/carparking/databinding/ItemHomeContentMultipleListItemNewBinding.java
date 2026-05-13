package com.mgs.carparking.databinding;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import com.mgs.carparking.widgets.cardbanner.view.RoundedImageView;
import nc.s0;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ItemHomeContentMultipleListItemNewBinding extends ViewDataBinding {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ImageView f43302b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final RoundedImageView f43303c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Bindable
    public s0 f43304d;

    public ItemHomeContentMultipleListItemNewBinding(Object obj, View view, int i10, ImageView imageView, RoundedImageView roundedImageView) {
        super(obj, view, i10);
        this.f43302b = imageView;
        this.f43303c = roundedImageView;
    }
}
