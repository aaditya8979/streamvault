package com.mgs.carparking.databinding;

import android.view.View;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import com.mgs.carparking.widgets.cardbanner.view.RoundedImageView;
import hc.v1;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ItemMineHistoryBinding extends ViewDataBinding {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final RoundedImageView f43624b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f43625c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Bindable
    public v1 f43626d;

    public ItemMineHistoryBinding(Object obj, View view, int i10, RoundedImageView roundedImageView, RelativeLayout relativeLayout) {
        super(obj, view, i10);
        this.f43624b = roundedImageView;
        this.f43625c = relativeLayout;
    }
}
