package com.mgs.carparking.databinding;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import com.mgs.carparking.widgets.cardbanner.view.RoundedImageView;
import hc.y1;

/* JADX INFO: loaded from: classes12.dex */
public abstract class ItemLookChannnelSearchResultBinding extends ViewDataBinding {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final RoundedImageView f43614b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f43615c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Bindable
    public y1 f43616d;

    public ItemLookChannnelSearchResultBinding(Object obj, View view, int i10, RoundedImageView roundedImageView, TextView textView) {
        super(obj, view, i10);
        this.f43614b = roundedImageView;
        this.f43615c = textView;
    }
}
