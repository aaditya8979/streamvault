package com.mgs.carparking.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import com.mgs.carparking.ui.toolbar.ToolbarViewModel;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ActionbarBackBinding extends ViewDataBinding {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ImageView f42532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final ImageView f42533c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f42534d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final LinearLayout f42535e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f42536f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextView f42537g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextView f42538h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final TextView f42539i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Bindable
    public ToolbarViewModel f42540j;

    public ActionbarBackBinding(Object obj, View view, int i10, ImageView imageView, ImageView imageView2, RelativeLayout relativeLayout, LinearLayout linearLayout, RelativeLayout relativeLayout2, TextView textView, TextView textView2, TextView textView3) {
        super(obj, view, i10);
        this.f42532b = imageView;
        this.f42533c = imageView2;
        this.f42534d = relativeLayout;
        this.f42535e = linearLayout;
        this.f42536f = relativeLayout2;
        this.f42537g = textView;
        this.f42538h = textView2;
        this.f42539i = textView3;
    }

    public abstract void b(@Nullable ToolbarViewModel toolbarViewModel);
}
