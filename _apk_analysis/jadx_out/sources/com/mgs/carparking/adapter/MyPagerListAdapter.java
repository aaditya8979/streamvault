package com.mgs.carparking.adapter;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentTransaction;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;
import me.goldze.mvvmhabit.base.BaseFragment;

/* JADX INFO: loaded from: classes12.dex */
public class MyPagerListAdapter extends FragmentPagerAdapter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List<BaseFragment> f42482b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List<String> f42483c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public FragmentManager f42484d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public FragmentTransaction f42485e;

    public MyPagerListAdapter(FragmentManager fragmentManager) {
        super(fragmentManager);
        this.f42484d = fragmentManager;
    }

    public static String makeFragmentName(int i10, long j10) {
        return "android:switcher:" + i10 + StringUtils.PROCESS_POSTFIX_DELIMITER + j10;
    }

    public void a(ViewGroup viewGroup) {
        if (this.f42485e == null) {
            this.f42485e = this.f42484d.beginTransaction();
        }
        for (int i10 = 0; i10 < this.f42482b.size(); i10++) {
            Fragment fragmentFindFragmentByTag = this.f42484d.findFragmentByTag(makeFragmentName(viewGroup.getId(), getItemId(i10)));
            if (fragmentFindFragmentByTag != null) {
                this.f42485e.remove(fragmentFindFragmentByTag);
            }
        }
        this.f42485e.commitNowAllowingStateLoss();
    }

    public void b(List<BaseFragment> list) {
        this.f42482b = list;
    }

    public void c(List<String> list) {
        this.f42483c = list;
    }

    @Override // androidx.fragment.app.FragmentPagerAdapter, androidx.viewpager.widget.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i10, Object obj) {
        this.f42484d.beginTransaction().hide(this.f42482b.get(i10)).commit();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return this.f42483c.size();
    }

    @Override // androidx.fragment.app.FragmentPagerAdapter
    public Fragment getItem(int i10) {
        return this.f42482b.get(i10);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public CharSequence getPageTitle(int i10) {
        return this.f42483c.get(i10);
    }

    @Override // androidx.fragment.app.FragmentPagerAdapter, androidx.viewpager.widget.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i10) {
        Fragment fragment = (Fragment) super.instantiateItem(viewGroup, i10);
        this.f42484d.beginTransaction().show(fragment).commit();
        return fragment;
    }
}
