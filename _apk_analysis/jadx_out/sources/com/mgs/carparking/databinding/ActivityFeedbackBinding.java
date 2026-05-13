package com.mgs.carparking.databinding;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import com.mgs.carparking.model.FEEDBACKVIEWMODEL;

/* JADX INFO: loaded from: classes7.dex */
public abstract class ActivityFeedbackBinding extends ViewDataBinding {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ActionbarBackBinding f42627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final EditText f42628c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final ImageView f42629d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final ImageView f42630e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final ImageView f42631f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f42632g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final ScrollView f42633h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Bindable
    public FEEDBACKVIEWMODEL f42634i;

    public ActivityFeedbackBinding(Object obj, View view, int i10, ActionbarBackBinding actionbarBackBinding, EditText editText, ImageView imageView, ImageView imageView2, ImageView imageView3, RelativeLayout relativeLayout, ScrollView scrollView) {
        super(obj, view, i10);
        this.f42627b = actionbarBackBinding;
        this.f42628c = editText;
        this.f42629d = imageView;
        this.f42630e = imageView2;
        this.f42631f = imageView3;
        this.f42632g = relativeLayout;
        this.f42633h = scrollView;
    }
}
