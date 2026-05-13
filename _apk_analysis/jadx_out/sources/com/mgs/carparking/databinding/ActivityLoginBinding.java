package com.mgs.carparking.databinding;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import com.mgs.carparking.model.LOGINVIEWMODEL;
import com.mgs.carparking.widgets.ClearableEditText;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ActivityLoginBinding extends ViewDataBinding {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final Button f42669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final EditText f42670c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final ClearableEditText f42671d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final ImageView f42672e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final ImageView f42673f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextView f42674g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Bindable
    public LOGINVIEWMODEL f42675h;

    public ActivityLoginBinding(Object obj, View view, int i10, Button button, EditText editText, ClearableEditText clearableEditText, ImageView imageView, ImageView imageView2, TextView textView) {
        super(obj, view, i10);
        this.f42669b = button;
        this.f42670c = editText;
        this.f42671d = clearableEditText;
        this.f42672e = imageView;
        this.f42673f = imageView2;
        this.f42674g = textView;
    }
}
