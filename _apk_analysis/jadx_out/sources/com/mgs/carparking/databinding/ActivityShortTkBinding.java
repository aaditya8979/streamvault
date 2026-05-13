package com.mgs.carparking.databinding;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import com.mgs.carparking.shorttk.SHORTTKVIEWMODEL;

/* JADX INFO: loaded from: classes11.dex */
public abstract class ActivityShortTkBinding extends ViewDataBinding {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f42771b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Bindable
    public SHORTTKVIEWMODEL f42772c;

    public ActivityShortTkBinding(Object obj, View view, int i10, ConstraintLayout constraintLayout) {
        super(obj, view, i10);
        this.f42771b = constraintLayout;
    }
}
