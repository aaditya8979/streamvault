package com.mgs.carparking.adapter;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import java.util.List;
import me.goldze.mvvmhabit.base.BaseFragment;

/* JADX INFO: loaded from: classes3.dex */
public class PagerAdapter1 extends FragmentPagerAdapter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List<BaseFragment> f42489b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List<String> f42490c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public FragmentManager f42491d;

    public PagerAdapter1(FragmentManager fragmentManager) {
        super(fragmentManager);
        this.f42491d = fragmentManager;
    }

    public void a(List<BaseFragment> list) {
        this.f42489b = list;
    }

    public void b(List<String> list) {
        this.f42490c = list;
    }

    @Override // androidx.fragment.app.FragmentPagerAdapter, androidx.viewpager.widget.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i10, Object obj) {
        this.f42491d.beginTransaction().hide(this.f42489b.get(i10)).commit();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return this.f42490c.size();
    }

    @Override // androidx.fragment.app.FragmentPagerAdapter
    public Fragment getItem(int i10) {
        return this.f42489b.get(i10);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public CharSequence getPageTitle(int i10) {
        return this.f42490c.get(i10);
    }

    @Override // androidx.fragment.app.FragmentPagerAdapter, androidx.viewpager.widget.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i10) {
        Fragment fragment = (Fragment) super.instantiateItem(viewGroup, i10);
        this.f42491d.beginTransaction().show(fragment).commit();
        return fragment;
    }
}
