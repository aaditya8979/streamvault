package com.yandex.div.internal.widget.tabs;

import android.content.Context;
import android.util.AttributeSet;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.yandex.div.core.util.ViewsKt;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: RtlViewPager.kt */
/* JADX INFO: loaded from: classes7.dex */
public class RtlViewPager extends ViewPager {

    @NotNull
    private final HashMap<ViewPager.OnPageChangeListener, ReversingOnPageChangeListener> pageChangeListeners;

    /* JADX INFO: compiled from: RtlViewPager.kt */
    public final class ReversingOnPageChangeListener implements ViewPager.OnPageChangeListener {

        @NotNull
        private final ViewPager.OnPageChangeListener listener;

        public ReversingOnPageChangeListener(@NotNull ViewPager.OnPageChangeListener onPageChangeListener) {
            this.listener = onPageChangeListener;
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i10) {
            this.listener.onPageScrollStateChanged(i10);
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i10, float f10, int i11) {
            PagerAdapter adapter = RtlViewPager.super.getAdapter();
            if (ViewsKt.isLayoutRtl(RtlViewPager.this) && adapter != null) {
                int count = adapter.getCount();
                int width = ((int) (RtlViewPager.this.getWidth() * (1 - adapter.getPageWidth(i10)))) + i11;
                while (i10 < count && width > 0) {
                    i10++;
                    width -= (int) (RtlViewPager.this.getWidth() * adapter.getPageWidth(i10));
                }
                i10 = (count - i10) - 1;
                i11 = -width;
                f10 = i11 / (RtlViewPager.this.getWidth() * adapter.getPageWidth(i10));
            }
            this.listener.onPageScrolled(i10, f10, i11);
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i10) {
            PagerAdapter adapter = RtlViewPager.super.getAdapter();
            if (ViewsKt.isLayoutRtl(RtlViewPager.this) && adapter != null) {
                i10 = (adapter.getCount() - i10) - 1;
            }
            this.listener.onPageSelected(i10);
        }
    }

    public RtlViewPager(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.pageChangeListeners = new HashMap<>();
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void addOnPageChangeListener(@NotNull ViewPager.OnPageChangeListener onPageChangeListener) {
        ReversingOnPageChangeListener reversingOnPageChangeListener = new ReversingOnPageChangeListener(onPageChangeListener);
        this.pageChangeListeners.put(onPageChangeListener, reversingOnPageChangeListener);
        super.addOnPageChangeListener(reversingOnPageChangeListener);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void clearOnPageChangeListeners() {
        super.clearOnPageChangeListeners();
        this.pageChangeListeners.clear();
    }

    @Override // androidx.viewpager.widget.ViewPager
    public int getCurrentItem() {
        int currentItem = super.getCurrentItem();
        return (super.getAdapter() == null || !ViewsKt.isLayoutRtl(this)) ? currentItem : (r1.getCount() - currentItem) - 1;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void removeOnPageChangeListener(@NotNull ViewPager.OnPageChangeListener onPageChangeListener) {
        ReversingOnPageChangeListener reversingOnPageChangeListenerRemove = this.pageChangeListeners.remove(onPageChangeListener);
        if (reversingOnPageChangeListenerRemove != null) {
            super.removeOnPageChangeListener(reversingOnPageChangeListenerRemove);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setCurrentItem(int i10) {
        PagerAdapter adapter = super.getAdapter();
        if (adapter != null && ViewsKt.isLayoutRtl(this)) {
            i10 = (adapter.getCount() - i10) - 1;
        }
        super.setCurrentItem(i10);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setCurrentItem(int i10, boolean z10) {
        PagerAdapter adapter = super.getAdapter();
        if (adapter != null && ViewsKt.isLayoutRtl(this)) {
            i10 = (adapter.getCount() - i10) - 1;
        }
        super.setCurrentItem(i10, z10);
    }
}
