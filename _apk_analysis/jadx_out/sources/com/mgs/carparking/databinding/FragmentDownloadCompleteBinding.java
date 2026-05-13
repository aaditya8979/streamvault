package com.mgs.carparking.databinding;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import com.mgs.carparking.model.DOWNLOADCOMPLETEVIEWMODEL;

/* JADX INFO: loaded from: classes8.dex */
public abstract class FragmentDownloadCompleteBinding extends ViewDataBinding {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f42946b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f42947c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Bindable
    public DOWNLOADCOMPLETEVIEWMODEL f42948d;

    public FragmentDownloadCompleteBinding(Object obj, View view, int i10, TextView textView, TextView textView2) {
        super(obj, view, i10);
        this.f42946b = textView;
        this.f42947c = textView2;
    }
}
