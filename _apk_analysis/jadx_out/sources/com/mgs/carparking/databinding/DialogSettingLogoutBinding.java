package com.mgs.carparking.databinding;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import com.mgs.carparking.model.SETTINGVIEWMODEL;

/* JADX INFO: loaded from: classes12.dex */
public abstract class DialogSettingLogoutBinding extends ViewDataBinding {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final LinearLayout f42860b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f42861c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Bindable
    public SETTINGVIEWMODEL f42862d;

    public DialogSettingLogoutBinding(Object obj, View view, int i10, LinearLayout linearLayout, TextView textView) {
        super(obj, view, i10);
        this.f42860b = linearLayout;
        this.f42861c = textView;
    }

    public abstract void b(@Nullable SETTINGVIEWMODEL settingviewmodel);
}
