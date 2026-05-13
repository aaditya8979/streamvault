package com.mgs.carparking.databinding;

import ad.f;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import com.mgs.carparking.widgets.cardbanner.view.RoundedImageView;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ItemRankContentMultipleNextBinding extends ViewDataBinding {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final RoundedImageView f43671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f43672c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Bindable
    public f f43673d;

    public ItemRankContentMultipleNextBinding(Object obj, View view, int i10, RoundedImageView roundedImageView, TextView textView) {
        super(obj, view, i10);
        this.f43671b = roundedImageView;
        this.f43672c = textView;
    }
}
