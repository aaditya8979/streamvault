package com.mgs.carparking.databinding;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import com.mgs.carparking.model.EDITMINEVIEWMODEL;
import com.mgs.carparking.widgets.CircularImageView;
import com.mgs.carparking.widgets.ClearableEditText;

/* JADX INFO: loaded from: classes11.dex */
public abstract class ActivityEditMineBinding extends ViewDataBinding {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ActionbarBackBinding f42587b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final ClearableEditText f42588c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final ClearableEditText f42589d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final ClearableEditText f42590e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final CircularImageView f42591f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextView f42592g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextView f42593h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final TextView f42594i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final TextView f42595j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Bindable
    public EDITMINEVIEWMODEL f42596k;

    public ActivityEditMineBinding(Object obj, View view, int i10, ActionbarBackBinding actionbarBackBinding, ClearableEditText clearableEditText, ClearableEditText clearableEditText2, ClearableEditText clearableEditText3, CircularImageView circularImageView, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        super(obj, view, i10);
        this.f42587b = actionbarBackBinding;
        this.f42588c = clearableEditText;
        this.f42589d = clearableEditText2;
        this.f42590e = clearableEditText3;
        this.f42591f = circularImageView;
        this.f42592g = textView;
        this.f42593h = textView2;
        this.f42594i = textView3;
        this.f42595j = textView4;
    }
}
