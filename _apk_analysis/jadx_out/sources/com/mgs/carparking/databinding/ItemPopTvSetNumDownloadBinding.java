package com.mgs.carparking.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import hc.c3;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ItemPopTvSetNumDownloadBinding extends ViewDataBinding {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ImageView f43661b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f43662c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f43663d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Bindable
    public c3 f43664e;

    public ItemPopTvSetNumDownloadBinding(Object obj, View view, int i10, ImageView imageView, RelativeLayout relativeLayout, TextView textView) {
        super(obj, view, i10);
        this.f43661b = imageView;
        this.f43662c = relativeLayout;
        this.f43663d = textView;
    }
}
