package com.mgs.carparking.adapter;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentTransaction;
import java.util.Iterator;
import java.util.List;
import me.goldze.mvvmhabit.base.BaseFragment;

/* JADX INFO: loaded from: classes6.dex */
public class PagerAdapter extends FragmentPagerAdapter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Fragment f42486b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List<BaseFragment> f42487c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List<String> f42488d;

    public PagerAdapter(FragmentManager fragmentManager, Fragment fragment) {
        super(fragmentManager);
        this.f42486b = fragment;
    }

    public void a() {
        FragmentTransaction fragmentTransactionBeginTransaction = this.f42486b.getChildFragmentManager().beginTransaction();
        if (this.f42487c.size() > 0) {
            Iterator<BaseFragment> it = this.f42487c.iterator();
            while (it.hasNext()) {
                fragmentTransactionBeginTransaction.remove(it.next());
            }
            fragmentTransactionBeginTransaction.commitNow();
            this.f42487c.clear();
            this.f42488d.clear();
            notifyDataSetChanged();
        }
    }

    public void b(List<BaseFragment> list) {
        this.f42487c = list;
    }

    public void c(List<String> list) {
        this.f42488d = list;
    }

    @Override // androidx.fragment.app.FragmentPagerAdapter, androidx.viewpager.widget.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i10, Object obj) {
        if (i10 < this.f42487c.size()) {
            this.f42486b.getChildFragmentManager().beginTransaction().hide(this.f42487c.get(i10)).commitAllowingStateLoss();
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return this.f42488d.size();
    }

    @Override // androidx.fragment.app.FragmentPagerAdapter
    public Fragment getItem(int i10) {
        return this.f42487c.get(i10);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public CharSequence getPageTitle(int i10) {
        return this.f42488d.get(i10);
    }

    @Override // androidx.fragment.app.FragmentPagerAdapter, androidx.viewpager.widget.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i10) {
        Fragment fragment = (Fragment) super.instantiateItem(viewGroup, i10);
        this.f42486b.getChildFragmentManager().beginTransaction().show(fragment).commitAllowingStateLoss();
        return fragment;
    }
}
