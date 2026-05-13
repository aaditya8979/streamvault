package com.mgs.carparking.databinding;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.tabs.TabLayout;
import com.mgs.carparking.model.CATEGORYVIEWMODEL;
import com.mgs.carparking.widgets.viewpager.SuperViewPager;

/* JADX INFO: loaded from: classes7.dex */
public abstract class FragmentCategoryBinding extends ViewDataBinding {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final TabLayout f42887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final View f42888c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final SuperViewPager f42889d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Bindable
    public CATEGORYVIEWMODEL f42890e;

    public FragmentCategoryBinding(Object obj, View view, int i10, TabLayout tabLayout, View view2, SuperViewPager superViewPager) {
        super(obj, view, i10);
        this.f42887b = tabLayout;
        this.f42888c = view2;
        this.f42889d = superViewPager;
    }
}
