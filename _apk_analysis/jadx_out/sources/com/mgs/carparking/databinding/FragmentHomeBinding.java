package com.mgs.carparking.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.tabs.TabLayout;
import com.mgs.carparking.ui.homecontent.HomePageViewModel;
import com.mgs.carparking.util.ScrollTextView;
import com.mgs.carparking.widgets.viewpager.SuperViewPager;

/* JADX INFO: loaded from: classes4.dex */
public abstract class FragmentHomeBinding extends ViewDataBinding {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ImageView f42958b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final ImageView f42959c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final ImageView f42960d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final ImageView f42961e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f42962f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final ScrollTextView f42963g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f42964h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f42965i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final TabLayout f42966j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public final TextView f42967k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public final TextView f42968l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NonNull
    public final SuperViewPager f42969m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Bindable
    public HomePageViewModel f42970n;

    public FragmentHomeBinding(Object obj, View view, int i10, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, RelativeLayout relativeLayout, ScrollTextView scrollTextView, RelativeLayout relativeLayout2, RelativeLayout relativeLayout3, TabLayout tabLayout, TextView textView, TextView textView2, SuperViewPager superViewPager) {
        super(obj, view, i10);
        this.f42958b = imageView;
        this.f42959c = imageView2;
        this.f42960d = imageView3;
        this.f42961e = imageView4;
        this.f42962f = relativeLayout;
        this.f42963g = scrollTextView;
        this.f42964h = relativeLayout2;
        this.f42965i = relativeLayout3;
        this.f42966j = tabLayout;
        this.f42967k = textView;
        this.f42968l = textView2;
        this.f42969m = superViewPager;
    }
}
