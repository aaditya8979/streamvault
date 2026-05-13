package com.mgs.carparking.databinding;

import android.view.View;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import com.mgs.carparking.model.VIDEOPLAYDETAILVIEWMODEL;

/* JADX INFO: loaded from: classes2.dex */
public abstract class PopLayoutVideoSeasonItemBinding extends ViewDataBinding {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Bindable
    public VIDEOPLAYDETAILVIEWMODEL f43830b;

    public PopLayoutVideoSeasonItemBinding(Object obj, View view, int i10) {
        super(obj, view, i10);
    }

    public abstract void b(@Nullable VIDEOPLAYDETAILVIEWMODEL videoplaydetailviewmodel);
}
