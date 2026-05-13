package com.mgs.carparking.databinding;

import android.view.View;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import com.mgs.carparking.widgets.cardbanner.view.RoundedImageView;
import hc.f1;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ItemDownloadCompleteSecondBinding extends ViewDataBinding {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f43146b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final RoundedImageView f43147c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Bindable
    public f1 f43148d;

    public ItemDownloadCompleteSecondBinding(Object obj, View view, int i10, RelativeLayout relativeLayout, RoundedImageView roundedImageView) {
        super(obj, view, i10);
        this.f43146b = relativeLayout;
        this.f43147c = roundedImageView;
    }
}
