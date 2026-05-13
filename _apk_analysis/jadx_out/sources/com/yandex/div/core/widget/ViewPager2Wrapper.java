package com.yandex.div.core.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.view.ViewGroupKt;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import bn.r;
import com.yandex.div.core.view2.divs.pager.DivPagerAdapter;
import com.yandex.div.core.view2.divs.pager.DivPagerPageTransformer;
import kotlin.jvm.internal.Ref$IntRef;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import sn.p;
import tn.i;

/* JADX INFO: compiled from: ViewPager2Wrapper.kt */
/* JADX INFO: loaded from: classes8.dex */
public class ViewPager2Wrapper extends FrameLayout {

    @Nullable
    private DivPagerPageTransformer pageTransformer;

    @NotNull
    private final ViewPager2 viewPager;

    public ViewPager2Wrapper(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public ViewPager2Wrapper(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.viewPager = new ViewPager2(context);
        addView(getViewPager());
    }

    public /* synthetic */ ViewPager2Wrapper(Context context, AttributeSet attributeSet, int i10, int i11, i iVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    private final int findMaxChildDimension(final p<? super RecyclerView.LayoutManager, ? super View, Integer> pVar) {
        final Ref$IntRef ref$IntRef = new Ref$IntRef();
        withRecyclerView(new l<RecyclerView, r>() { // from class: com.yandex.div.core.widget.ViewPager2Wrapper.findMaxChildDimension.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // sn.l
            public /* bridge */ /* synthetic */ r invoke(RecyclerView recyclerView) {
                invoke2(recyclerView);
                return r.f5635a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull RecyclerView recyclerView) {
                ao.i<View> children = ViewGroupKt.getChildren(recyclerView);
                Ref$IntRef ref$IntRef2 = ref$IntRef;
                p<RecyclerView.LayoutManager, View, Integer> pVar2 = pVar;
                for (View view : children) {
                    RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                    if (layoutManager != null) {
                        ref$IntRef2.element = Math.max(ref$IntRef2.element, pVar2.mo2invoke(layoutManager, view).intValue());
                    }
                }
            }
        });
        return ref$IntRef.element;
    }

    private final void withRecyclerView(l<? super RecyclerView, r> lVar) {
        RecyclerView recyclerView = getRecyclerView();
        if (recyclerView == null) {
            return;
        }
        lVar.invoke(recyclerView);
    }

    @Override // android.view.ViewGroup
    public final void addView(@Nullable View view) {
        super.addView(view);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    @NotNull
    public String getAccessibilityClassName() {
        return "androidx.viewpager.widget.ViewPager";
    }

    public final int getOrientation() {
        return getViewPager().getOrientation();
    }

    @Nullable
    public final DivPagerPageTransformer getPageTransformer$div_release() {
        return this.pageTransformer;
    }

    @Nullable
    public final RecyclerView getRecyclerView() {
        View childAt = getViewPager().getChildAt(0);
        if (childAt instanceof RecyclerView) {
            return (RecyclerView) childAt;
        }
        return null;
    }

    @NotNull
    public ViewPager2 getViewPager() {
        return this.viewPager;
    }

    public final boolean isWrapContentAlongCrossAxis$div_release() {
        if (getOrientation() == 0 && getLayoutParams().height == -2) {
            return true;
        }
        return getOrientation() == 1 && getLayoutParams().width == -2;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        if (!isWrapContentAlongCrossAxis$div_release()) {
            super.onMeasure(i10, i11);
            return;
        }
        measureChild(getViewPager(), i10, i11);
        int orientation = getOrientation();
        if (orientation == 0) {
            super.onMeasure(i10, ViewsKt.makeExactSpec(findMaxChildDimension(ViewPager2Wrapper$onMeasure$maxHeight$1.INSTANCE)));
        } else {
            if (orientation != 1) {
                return;
            }
            super.onMeasure(ViewsKt.makeExactSpec(findMaxChildDimension(ViewPager2Wrapper$onMeasure$maxWidth$1.INSTANCE)), i11);
        }
    }

    public final void setOrientation(int i10) {
        DivPagerAdapter divPagerAdapter = (DivPagerAdapter) getViewPager().getAdapter();
        if (getViewPager().getOrientation() == i10) {
            boolean z10 = false;
            if (divPagerAdapter != null && divPagerAdapter.getOrientation() == i10) {
                z10 = true;
            }
            if (z10) {
                return;
            }
        }
        getViewPager().setOrientation(i10);
        if (divPagerAdapter != null) {
            divPagerAdapter.setOrientation(i10);
        }
        withRecyclerView(new l<RecyclerView, r>() { // from class: com.yandex.div.core.widget.ViewPager2Wrapper$orientation$1
            @Override // sn.l
            public /* bridge */ /* synthetic */ r invoke(RecyclerView recyclerView) {
                invoke2(recyclerView);
                return r.f5635a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull RecyclerView recyclerView) {
                recyclerView.getRecycledViewPool().clear();
                for (View view : ViewGroupKt.getChildren(recyclerView)) {
                    view.setTranslationX(0.0f);
                    view.setTranslationY(0.0f);
                }
            }
        });
    }

    public final void setPageTransformer$div_release(@Nullable DivPagerPageTransformer divPagerPageTransformer) {
        this.pageTransformer = divPagerPageTransformer;
        getViewPager().setPageTransformer(divPagerPageTransformer);
    }

    public final void setRecycledViewPool(@NotNull final RecyclerView.RecycledViewPool recycledViewPool) {
        withRecyclerView(new l<RecyclerView, r>() { // from class: com.yandex.div.core.widget.ViewPager2Wrapper.setRecycledViewPool.1
            {
                super(1);
            }

            @Override // sn.l
            public /* bridge */ /* synthetic */ r invoke(RecyclerView recyclerView) {
                invoke2(recyclerView);
                return r.f5635a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull RecyclerView recyclerView) {
                recyclerView.setRecycledViewPool(recycledViewPool);
            }
        });
    }
}
