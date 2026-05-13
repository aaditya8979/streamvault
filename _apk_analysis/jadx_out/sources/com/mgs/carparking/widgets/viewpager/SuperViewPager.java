package com.mgs.carparking.widgets.viewpager;

import android.content.Context;
import android.util.AttributeSet;
import androidx.viewpager.widget.ViewPager;
import wd.a;
import wd.b;

/* JADX INFO: loaded from: classes4.dex */
public class SuperViewPager extends ViewPager {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f45673b;

    public SuperViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f45673b = new b(this);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setCurrentItem(int i10) {
        setCurrentItem(i10, true);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setCurrentItem(int i10, boolean z10) {
        a aVarA = this.f45673b.a();
        if (Math.abs(getCurrentItem() - i10) <= 1) {
            aVarA.a(false);
            super.setCurrentItem(i10, z10);
        } else {
            aVarA.a(true);
            super.setCurrentItem(i10, z10);
            aVarA.a(false);
        }
    }
}
