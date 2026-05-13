package com.yandex.div.core.view2.items;

import android.view.View;
import com.yandex.div.core.DivViewFacade;
import com.yandex.div.core.view2.divs.widgets.DivPagerView;
import com.yandex.div.core.view2.divs.widgets.DivRecyclerView;
import com.yandex.div.core.view2.divs.widgets.DivTabsLayout;
import com.yandex.div.core.view2.items.DivViewWithItems;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.Div;
import com.yandex.div2.DivSizeUnit;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: DivViewWithItemsController.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class DivViewWithItemsController {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private final DivViewWithItems view;

    /* JADX INFO: compiled from: DivViewWithItemsController.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public static /* synthetic */ DivViewWithItemsController create$default(Companion companion, String str, DivViewFacade divViewFacade, ExpressionResolver expressionResolver, Direction direction, int i10, Object obj) {
            if ((i10 & 8) != 0) {
                direction = Direction.NEXT;
            }
            return companion.create(str, divViewFacade, expressionResolver, direction);
        }

        @Nullable
        public final DivViewWithItemsController create(@NotNull String str, @NotNull DivViewFacade divViewFacade, @NotNull ExpressionResolver expressionResolver, @NotNull Direction direction) {
            View viewFindViewWithTag = divViewFacade.getView().findViewWithTag(str);
            i iVar = null;
            if (viewFindViewWithTag == null) {
                return null;
            }
            DivViewWithItems viewForTests$div_release = DivViewWithItems.Companion.getViewForTests$div_release();
            if (viewForTests$div_release == null) {
                if (viewFindViewWithTag instanceof DivRecyclerView) {
                    DivRecyclerView divRecyclerView = (DivRecyclerView) viewFindViewWithTag;
                    Div.d div = divRecyclerView.getDiv();
                    p.h(div);
                    int i10 = DivViewWithItems.Companion.WhenMappings.$EnumSwitchMapping$0[div.c().C.evaluate(expressionResolver).ordinal()];
                    if (i10 == 1) {
                        viewForTests$div_release = new DivViewWithItems.Gallery(divRecyclerView, direction);
                    } else {
                        if (i10 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        viewForTests$div_release = new DivViewWithItems.PagingGallery(divRecyclerView, direction);
                    }
                } else {
                    viewForTests$div_release = viewFindViewWithTag instanceof DivPagerView ? new DivViewWithItems.Pager((DivPagerView) viewFindViewWithTag) : viewFindViewWithTag instanceof DivTabsLayout ? new DivViewWithItems.Tabs((DivTabsLayout) viewFindViewWithTag) : null;
                }
            }
            if (viewForTests$div_release == null) {
                return null;
            }
            return new DivViewWithItemsController(viewForTests$div_release, iVar);
        }
    }

    private DivViewWithItemsController(DivViewWithItems divViewWithItems) {
        this.view = divViewWithItems;
    }

    public /* synthetic */ DivViewWithItemsController(DivViewWithItems divViewWithItems, i iVar) {
        this(divViewWithItems);
    }

    private final OverflowItemStrategy createStrategy(String str) {
        return OverflowItemStrategy.Companion.create$div_release(str, this.view.getCurrentItem(), this.view.getItemCount(), this.view.getScrollRange(), this.view.getScrollOffset(), this.view.getMetrics());
    }

    public final void changeCurrentItemByStep(@Nullable String str, int i10, boolean z10) {
        int iPreviousItem;
        OverflowItemStrategy overflowItemStrategyCreateStrategy = createStrategy(str);
        if (i10 > 0) {
            iPreviousItem = overflowItemStrategyCreateStrategy.nextItem(i10);
        } else if (i10 >= 0) {
            return;
        } else {
            iPreviousItem = overflowItemStrategyCreateStrategy.previousItem(-i10);
        }
        setCurrentItem(iPreviousItem, z10);
    }

    public final void scrollByOffset(@Nullable String str, int i10, boolean z10) {
        if (i10 == 0) {
            return;
        }
        DivViewWithItems.scrollTo$default(this.view, createStrategy(str).positionAfterScrollBy(i10), null, z10, 2, null);
    }

    public final void scrollTo(int i10, boolean z10) {
        this.view.scrollTo(i10, DivSizeUnit.DP, z10);
    }

    public final void scrollToEnd(boolean z10) {
        this.view.scrollToTheEnd(z10);
    }

    public final void scrollToStart(boolean z10) {
        setCurrentItem(0, z10);
    }

    public final void setCurrentItem(int i10, boolean z10) {
        if (z10) {
            this.view.setCurrentItem(i10);
        } else {
            this.view.setCurrentItemNoAnimation(i10);
        }
    }
}
