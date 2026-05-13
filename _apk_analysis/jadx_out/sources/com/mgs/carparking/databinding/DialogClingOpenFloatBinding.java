package com.mgs.carparking.databinding;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import com.mgs.carparking.model.VIDEOPLAYDETAILVIEWMODEL;

/* JADX INFO: loaded from: classes10.dex */
public abstract class DialogClingOpenFloatBinding extends ViewDataBinding {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final LinearLayout f42830b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f42831c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Bindable
    public VIDEOPLAYDETAILVIEWMODEL f42832d;

    public DialogClingOpenFloatBinding(Object obj, View view, int i10, LinearLayout linearLayout, TextView textView) {
        super(obj, view, i10);
        this.f42830b = linearLayout;
        this.f42831c = textView;
    }

    public abstract void b(@Nullable VIDEOPLAYDETAILVIEWMODEL videoplaydetailviewmodel);
}
