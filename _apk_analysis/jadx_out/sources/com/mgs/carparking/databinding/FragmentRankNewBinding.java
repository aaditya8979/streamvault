package com.mgs.carparking.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.mgs.carparking.ui.ranklist.RankNumberNewViewModel;

/* JADX INFO: loaded from: classes3.dex */
public abstract class FragmentRankNewBinding extends ViewDataBinding {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ImageView f43081b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final RecyclerView f43082c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final TabLayout f43083d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final View f43084e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f43085f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final View f43086g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final ViewPager f43087h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Bindable
    public RankNumberNewViewModel f43088i;

    public FragmentRankNewBinding(Object obj, View view, int i10, ImageView imageView, RecyclerView recyclerView, TabLayout tabLayout, View view2, TextView textView, View view3, ViewPager viewPager) {
        super(obj, view, i10);
        this.f43081b = imageView;
        this.f43082c = recyclerView;
        this.f43083d = tabLayout;
        this.f43084e = view2;
        this.f43085f = textView;
        this.f43086g = view3;
        this.f43087h = viewPager;
    }
}
