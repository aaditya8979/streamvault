package com.mgs.carparking.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import com.mgs.carparking.widgets.CircularImageView;
import hc.y0;

/* JADX INFO: loaded from: classes12.dex */
public abstract class ItemVideoCommitListBinding extends ViewDataBinding {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ImageView f43729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final CircularImageView f43730c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final LinearLayout f43731d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f43732e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f43733f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextView f43734g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Bindable
    public y0 f43735h;

    public ItemVideoCommitListBinding(Object obj, View view, int i10, ImageView imageView, CircularImageView circularImageView, LinearLayout linearLayout, RelativeLayout relativeLayout, TextView textView, TextView textView2) {
        super(obj, view, i10);
        this.f43729b = imageView;
        this.f43730c = circularImageView;
        this.f43731d = linearLayout;
        this.f43732e = relativeLayout;
        this.f43733f = textView;
        this.f43734g = textView2;
    }
}
