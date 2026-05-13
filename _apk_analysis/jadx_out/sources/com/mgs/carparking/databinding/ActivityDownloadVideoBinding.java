package com.mgs.carparking.databinding;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.mgs.carparking.model.DOWNLOADVIDEOVIEWMODEL;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ActivityDownloadVideoBinding extends ViewDataBinding {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final RecyclerView f42568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f42569c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f42570d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Bindable
    public DOWNLOADVIDEOVIEWMODEL f42571e;

    public ActivityDownloadVideoBinding(Object obj, View view, int i10, RecyclerView recyclerView, TextView textView, TextView textView2) {
        super(obj, view, i10);
        this.f42568b = recyclerView;
        this.f42569c = textView;
        this.f42570d = textView2;
    }
}
