package com.mgs.carparking.model;

import android.app.Application;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.databinding.ObservableField;
import me.goldze.mvvmhabit.base.BaseViewModel;

/* JADX INFO: loaded from: classes8.dex */
public class DOWNLOADVIDEOPLAYVIEWMODEL extends BaseViewModel<yb.a> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ObservableField<Drawable> f43920f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ObservableField<Boolean> f43921g;

    public DOWNLOADVIDEOPLAYVIEWMODEL(@NonNull Application application, yb.a aVar) {
        super(application, aVar);
        this.f43920f = new ObservableField<>();
        this.f43921g = new ObservableField<>(Boolean.FALSE);
    }
}
