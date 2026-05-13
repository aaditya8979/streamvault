package com.mgs.carparking.databinding;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import com.mgs.carparking.model.SETTINGVIEWMODEL;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ActivitySettingBinding extends ViewDataBinding {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ActionbarBackBinding f42752b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final Button f42753c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final ImageView f42754d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final ImageView f42755e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final ImageView f42756f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final ImageView f42757g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Bindable
    public SETTINGVIEWMODEL f42758h;

    public ActivitySettingBinding(Object obj, View view, int i10, ActionbarBackBinding actionbarBackBinding, Button button, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4) {
        super(obj, view, i10);
        this.f42752b = actionbarBackBinding;
        this.f42753c = button;
        this.f42754d = imageView;
        this.f42755e = imageView2;
        this.f42756f = imageView3;
        this.f42757g = imageView4;
    }
}
