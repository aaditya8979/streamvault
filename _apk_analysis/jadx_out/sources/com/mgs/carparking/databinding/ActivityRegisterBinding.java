package com.mgs.carparking.databinding;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import com.mgs.carparking.model.REGISTERVIEWMODEL;
import com.mgs.carparking.widgets.ClearableEditText;

/* JADX INFO: loaded from: classes12.dex */
public abstract class ActivityRegisterBinding extends ViewDataBinding {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ActionbarBackBinding f42711b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final Button f42712c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final EditText f42713d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final EditText f42714e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final ClearableEditText f42715f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final ImageView f42716g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final ImageView f42717h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Bindable
    public REGISTERVIEWMODEL f42718i;

    public ActivityRegisterBinding(Object obj, View view, int i10, ActionbarBackBinding actionbarBackBinding, Button button, EditText editText, EditText editText2, ClearableEditText clearableEditText, ImageView imageView, ImageView imageView2) {
        super(obj, view, i10);
        this.f42711b = actionbarBackBinding;
        this.f42712c = button;
        this.f42713d = editText;
        this.f42714e = editText2;
        this.f42715f = clearableEditText;
        this.f42716g = imageView;
        this.f42717h = imageView2;
    }
}
