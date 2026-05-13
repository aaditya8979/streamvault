package com.mgs.carparking.databinding;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import com.mgs.carparking.model.VIDEOPLAYDETAILVIEWMODEL;

/* JADX INFO: loaded from: classes10.dex */
public abstract class PopLayoutVideoCommentItemBinding extends ViewDataBinding {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f43811b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Bindable
    public VIDEOPLAYDETAILVIEWMODEL f43812c;

    public PopLayoutVideoCommentItemBinding(Object obj, View view, int i10, TextView textView) {
        super(obj, view, i10);
        this.f43811b = textView;
    }

    public abstract void b(@Nullable VIDEOPLAYDETAILVIEWMODEL videoplaydetailviewmodel);
}
