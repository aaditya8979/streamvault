package com.mgs.carparking.widgets.viewpager;

import androidx.viewpager.widget.ViewPager;

/* JADX INFO: loaded from: classes11.dex */
public class MyOnPageChangeListener implements ViewPager.OnPageChangeListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewPager f45672b;

    public MyOnPageChangeListener(ViewPager viewPager) {
        this.f45672b = viewPager;
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i10) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i10, float f10, int i11) {
        ViewPager viewPager = this.f45672b;
        if (viewPager != null) {
            viewPager.invalidate();
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i10) {
    }
}
