package com.mgs.carparking.databinding;

import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import com.mgs.carparking.libutils.statusbar.StatusBarHeightView;
import com.mgs.carparking.model.SPIELVIEWMODEL;

/* JADX INFO: loaded from: classes3.dex */
public abstract class FragmentSpielBinding extends ViewDataBinding {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final StatusBarHeightView f43096b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final ImageView f43097c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final ProgressBar f43098d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final WebView f43099e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Bindable
    public SPIELVIEWMODEL f43100f;

    public FragmentSpielBinding(Object obj, View view, int i10, StatusBarHeightView statusBarHeightView, ImageView imageView, ProgressBar progressBar, WebView webView) {
        super(obj, view, i10);
        this.f43096b = statusBarHeightView;
        this.f43097c = imageView;
        this.f43098d = progressBar;
        this.f43099e = webView;
    }
}
