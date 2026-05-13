package com.mgs.carparking.databinding;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import com.mgs.carparking.model.SETTINGVIEWMODEL;

/* JADX INFO: loaded from: classes3.dex */
public abstract class DialogSearchCacheClearBinding extends ViewDataBinding {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final LinearLayout f42842b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f42843c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Bindable
    public SETTINGVIEWMODEL f42844d;

    public DialogSearchCacheClearBinding(Object obj, View view, int i10, LinearLayout linearLayout, TextView textView) {
        super(obj, view, i10);
        this.f42842b = linearLayout;
        this.f42843c = textView;
    }

    public abstract void b(@Nullable SETTINGVIEWMODEL settingviewmodel);
}
