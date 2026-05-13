package com.yandex.div.internal.widget.indicator;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.yandex.div.core.view2.divs.pager.DivPagerAdapter;
import com.yandex.div.core.view2.divs.widgets.DivPagerView;
import com.yandex.div.internal.widget.indicator.PagerIndicatorView;
import com.yandex.div.internal.widget.indicator.animations.IndicatorAnimatorKt;
import com.yandex.div.internal.widget.indicator.forms.SingleIndicatorDrawerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;

/* JADX INFO: compiled from: PagerIndicatorView.kt */
/* JADX INFO: loaded from: classes11.dex */
public class PagerIndicatorView extends View {

    @Nullable
    private DivPagerView divPager;

    @NotNull
    private final ViewPager2.OnPageChangeCallback onPageChangeListener;

    @Nullable
    private IndicatorsStripDrawer stripDrawer;

    @Nullable
    private IndicatorParams$Style style;

    public PagerIndicatorView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public PagerIndicatorView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.onPageChangeListener = new ViewPager2.OnPageChangeCallback() { // from class: com.yandex.div.internal.widget.indicator.PagerIndicatorView$onPageChangeListener$1
            private final int toRealPosition(int i11) {
                DivPagerAdapter currentAdapter = this.this$0.getCurrentAdapter();
                return currentAdapter == null ? i11 : currentAdapter.realItemPosition(i11);
            }

            @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
            public void onPageScrolled(int i11, float f10, int i12) {
                IndicatorsStripDrawer indicatorsStripDrawer = this.this$0.stripDrawer;
                if (indicatorsStripDrawer != null) {
                    PagerIndicatorView pagerIndicatorView = this.this$0;
                    if (f10 < 0.0f) {
                        f10 = 0.0f;
                    } else if (f10 > 1.0f) {
                        f10 = 1.0f;
                    }
                    indicatorsStripDrawer.onPageScrolled(toRealPosition(i11), f10);
                    pagerIndicatorView.invalidate();
                }
            }

            @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
            public void onPageSelected(int i11) {
                IndicatorsStripDrawer indicatorsStripDrawer = this.this$0.stripDrawer;
                if (indicatorsStripDrawer != null) {
                    PagerIndicatorView pagerIndicatorView = this.this$0;
                    indicatorsStripDrawer.onPageSelected(toRealPosition(i11));
                    pagerIndicatorView.invalidate();
                }
            }
        };
    }

    public /* synthetic */ PagerIndicatorView(Context context, AttributeSet attributeSet, int i10, int i11, i iVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void attachPager$lambda$3(PagerIndicatorView pagerIndicatorView) {
        IndicatorsStripDrawer indicatorsStripDrawer = pagerIndicatorView.stripDrawer;
        if (indicatorsStripDrawer != null) {
            pagerIndicatorView.update(indicatorsStripDrawer);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DivPagerAdapter getCurrentAdapter() {
        ViewPager2 viewPager;
        DivPagerView divPagerView = this.divPager;
        RecyclerView.Adapter adapter = (divPagerView == null || (viewPager = divPagerView.getViewPager()) == null) ? null : viewPager.getAdapter();
        if (adapter instanceof DivPagerAdapter) {
            return (DivPagerAdapter) adapter;
        }
        return null;
    }

    private final void update(IndicatorsStripDrawer indicatorsStripDrawer) {
        DivPagerAdapter currentAdapter = getCurrentAdapter();
        if (currentAdapter != null) {
            indicatorsStripDrawer.setItemsCount(currentAdapter.getVisibleItems().size());
            indicatorsStripDrawer.onPageSelected(currentAdapter.realItemPosition(currentAdapter.getCurrentItem()));
            invalidate();
        }
    }

    public final void attachPager(@NotNull DivPagerView divPagerView) {
        DivPagerView divPagerView2 = this.divPager;
        if (divPagerView2 != null) {
            divPagerView2.removeChangePageCallbackForIndicators(this.onPageChangeListener);
        }
        divPagerView.addChangePageCallbackForIndicators(this.onPageChangeListener);
        if (divPagerView == this.divPager) {
            return;
        }
        this.divPager = divPagerView;
        if (divPagerView.getViewPager().getAdapter() == null) {
            throw new IllegalArgumentException("Attached pager adapter is null!".toString());
        }
        IndicatorsStripDrawer indicatorsStripDrawer = this.stripDrawer;
        if (indicatorsStripDrawer != null) {
            update(indicatorsStripDrawer);
        }
        divPagerView.setPagerOnItemsCountChange$div_release(new DivPagerView.OnItemsUpdatedCallback() { // from class: ug.a
            @Override // com.yandex.div.core.view2.divs.widgets.DivPagerView.OnItemsUpdatedCallback
            public final void onItemsUpdated() {
                PagerIndicatorView.attachPager$lambda$3(this.f85658a);
            }
        });
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        super.onDraw(canvas);
        canvas.translate(getPaddingLeft(), getPaddingTop());
        IndicatorsStripDrawer indicatorsStripDrawer = this.stripDrawer;
        if (indicatorsStripDrawer != null) {
            indicatorsStripDrawer.onDraw(canvas);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r7, int r8) {
        /*
            Method dump skipped, instruction units count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.internal.widget.indicator.PagerIndicatorView.onMeasure(int, int):void");
    }

    public final void setStyle(@NotNull IndicatorParams$Style indicatorParams$Style) {
        this.style = indicatorParams$Style;
        IndicatorsStripDrawer indicatorsStripDrawer = new IndicatorsStripDrawer(indicatorParams$Style, SingleIndicatorDrawerKt.getIndicatorDrawer(indicatorParams$Style), IndicatorAnimatorKt.getIndicatorAnimator(indicatorParams$Style), this);
        indicatorsStripDrawer.calculateMaximumVisibleItems((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        update(indicatorsStripDrawer);
        this.stripDrawer = indicatorsStripDrawer;
        requestLayout();
    }
}
