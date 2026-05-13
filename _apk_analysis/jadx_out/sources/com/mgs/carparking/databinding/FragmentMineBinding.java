package com.mgs.carparking.databinding;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Switch;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import com.mgs.carparking.model.MINEVIEWMODEL;
import com.mgs.carparking.widgets.CircularImageView;

/* JADX INFO: loaded from: classes4.dex */
public abstract class FragmentMineBinding extends ViewDataBinding {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final CircularImageView f43042b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final LinearLayout f43043c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final LinearLayout f43044d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final Switch f43045e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final LinearLayout f43046f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextView f43047g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextView f43048h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final TextView f43049i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f43050j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f43051k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Bindable
    public MINEVIEWMODEL f43052l;

    public FragmentMineBinding(Object obj, View view, int i10, CircularImageView circularImageView, LinearLayout linearLayout, LinearLayout linearLayout2, Switch r72, LinearLayout linearLayout3, TextView textView, TextView textView2, TextView textView3, RelativeLayout relativeLayout, ConstraintLayout constraintLayout) {
        super(obj, view, i10);
        this.f43042b = circularImageView;
        this.f43043c = linearLayout;
        this.f43044d = linearLayout2;
        this.f43045e = r72;
        this.f43046f = linearLayout3;
        this.f43047g = textView;
        this.f43048h = textView2;
        this.f43049i = textView3;
        this.f43050j = relativeLayout;
        this.f43051k = constraintLayout;
    }
}
