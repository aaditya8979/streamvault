package com.mgs.carparking.databinding;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.mgs.carparking.model.DOWNLOADVIEWMODEL;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ActivityDownloadBinding extends ViewDataBinding {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ActionbarBackBinding f42546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f42547c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f42548d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final TabLayout f42549e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final ViewPager f42550f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Bindable
    public DOWNLOADVIEWMODEL f42551g;

    public ActivityDownloadBinding(Object obj, View view, int i10, ActionbarBackBinding actionbarBackBinding, TextView textView, TextView textView2, TabLayout tabLayout, ViewPager viewPager) {
        super(obj, view, i10);
        this.f42546b = actionbarBackBinding;
        this.f42547c = textView;
        this.f42548d = textView2;
        this.f42549e = tabLayout;
        this.f42550f = viewPager;
    }
}
