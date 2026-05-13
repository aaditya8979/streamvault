package com.mgs.carparking.databinding;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import com.mgs.carparking.shorttk.TKFragmentViewModel;
import com.mgs.carparking.shorttk.VerticalViewPager;

/* JADX INFO: loaded from: classes9.dex */
public abstract class FragmentTKBinding extends ViewDataBinding {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final VerticalViewPager f43105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Bindable
    public TKFragmentViewModel f43106c;

    public FragmentTKBinding(Object obj, View view, int i10, VerticalViewPager verticalViewPager) {
        super(obj, view, i10);
        this.f43105b = verticalViewPager;
    }
}
