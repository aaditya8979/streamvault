package com.mgs.carparking.databinding;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.mgs.carparking.model.SEARCHCONTENTVIDEOVIEWMODEL;
import com.mgs.carparking.widgets.ClearableEditText;
import com.mgs.carparking.widgets.FlowLayout2;
import com.mgs.carparking.widgets.MaxLayout;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ActivitySearchVideoBinding extends ViewDataBinding {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ClearableEditText f42730b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final FlowLayout2 f42731c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final MaxLayout f42732d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final LinearLayout f42733e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final TabLayout f42734f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final ViewPager f42735g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Bindable
    public SEARCHCONTENTVIDEOVIEWMODEL f42736h;

    public ActivitySearchVideoBinding(Object obj, View view, int i10, ClearableEditText clearableEditText, FlowLayout2 flowLayout2, MaxLayout maxLayout, LinearLayout linearLayout, TabLayout tabLayout, ViewPager viewPager) {
        super(obj, view, i10);
        this.f42730b = clearableEditText;
        this.f42731c = flowLayout2;
        this.f42732d = maxLayout;
        this.f42733e = linearLayout;
        this.f42734f = tabLayout;
        this.f42735g = viewPager;
    }
}
