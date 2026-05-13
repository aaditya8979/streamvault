package com.mgs.carparking.databinding;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import com.mgs.carparking.widgets.cardbanner.view.RoundedImageView;
import pc.c0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ItemHomeRecommendMultipleListItemNewBinding extends ViewDataBinding {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ImageView f43533b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final RoundedImageView f43534c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Bindable
    public c0 f43535d;

    public ItemHomeRecommendMultipleListItemNewBinding(Object obj, View view, int i10, ImageView imageView, RoundedImageView roundedImageView) {
        super(obj, view, i10);
        this.f43533b = imageView;
        this.f43534c = roundedImageView;
    }
}
