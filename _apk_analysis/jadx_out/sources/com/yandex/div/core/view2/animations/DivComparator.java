package com.yandex.div.core.view2.animations;

import ah.e2;
import cn.f0;
import cn.w;
import com.yandex.div.core.util.DivUtilKt;
import com.yandex.div.internal.core.DivCollectionExtensionsKt;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.Div;
import com.yandex.div2.DivContainer;
import com.yandex.div2.DivCustom;
import com.yandex.div2.DivData;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: DivComparator.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class DivComparator {

    @NotNull
    public static final DivComparator INSTANCE = new DivComparator();

    private DivComparator() {
    }

    public static /* synthetic */ boolean areChildrenReplaceable$default(DivComparator divComparator, List list, List list2, DivComparatorReporter divComparatorReporter, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            divComparatorReporter = null;
        }
        return divComparator.areChildrenReplaceable(list, list2, divComparatorReporter);
    }

    public static /* synthetic */ boolean areDivsReplaceable$default(DivComparator divComparator, Div div, Div div2, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2, DivComparatorReporter divComparatorReporter, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            divComparatorReporter = null;
        }
        return divComparator.areDivsReplaceable(div, div2, expressionResolver, expressionResolver2, divComparatorReporter);
    }

    public static /* synthetic */ boolean areValuesReplaceable$default(DivComparator divComparator, e2 e2Var, e2 e2Var2, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2, DivComparatorReporter divComparatorReporter, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            divComparatorReporter = null;
        }
        return divComparator.areValuesReplaceable(e2Var, e2Var2, expressionResolver, expressionResolver2, divComparatorReporter);
    }

    private final List<DivItemBuilderResult> extractChildren(Div div, ExpressionResolver expressionResolver) {
        if (div instanceof Div.b) {
            return DivCollectionExtensionsKt.buildItems(((Div.b) div).c(), expressionResolver);
        }
        if (div instanceof Div.f) {
            return DivCollectionExtensionsKt.itemsToDivItemBuilderResult(((Div.f) div).c(), expressionResolver);
        }
        if (!(div instanceof Div.g) && !(div instanceof Div.e) && !(div instanceof Div.q) && !(div instanceof Div.l) && !(div instanceof Div.d) && !(div instanceof Div.j) && !(div instanceof Div.p) && !(div instanceof Div.n) && !(div instanceof Div.c) && !(div instanceof Div.i) && !(div instanceof Div.k) && !(div instanceof Div.h) && !(div instanceof Div.m) && !(div instanceof Div.r) && !(div instanceof Div.o)) {
            throw new NoWhenBranchMatchedException();
        }
        return w.m();
    }

    private final boolean hasTransitions(e2 e2Var) {
        return (e2Var.v() == null && e2Var.i() == null && e2Var.j() == null) ? false : true;
    }

    private final boolean isOverlap(DivContainer divContainer, ExpressionResolver expressionResolver) {
        return divContainer.I.evaluate(expressionResolver) == DivContainer.Orientation.OVERLAP;
    }

    public final boolean areChildrenReplaceable(@NotNull List<DivItemBuilderResult> list, @NotNull List<DivItemBuilderResult> list2, @Nullable DivComparatorReporter divComparatorReporter) {
        if (list.size() != list2.size()) {
            if (divComparatorReporter != null) {
                divComparatorReporter.onComparisonDifferentChildCount();
            }
            return false;
        }
        List<Pair> listP1 = f0.p1(list, list2);
        if (!(listP1 instanceof Collection) || !listP1.isEmpty()) {
            for (Pair pair : listP1) {
                if (!INSTANCE.areDivsReplaceable(((DivItemBuilderResult) pair.getFirst()).getDiv(), ((DivItemBuilderResult) pair.getSecond()).getDiv(), ((DivItemBuilderResult) pair.getFirst()).getExpressionResolver(), ((DivItemBuilderResult) pair.getSecond()).getExpressionResolver(), divComparatorReporter)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean areDivsReplaceable(@Nullable Div div, @Nullable Div div2, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2, @Nullable DivComparatorReporter divComparatorReporter) {
        if (!p.f(div != null ? div.getClass() : null, div2 != null ? div2.getClass() : null)) {
            if (divComparatorReporter != null) {
                divComparatorReporter.onComparisonDifferentClasses();
            }
            return false;
        }
        if (div == null || div2 == null || div == div2) {
            return true;
        }
        return areValuesReplaceable(div.b(), div2.b(), expressionResolver, expressionResolver2, divComparatorReporter) && areChildrenReplaceable(extractChildren(div, expressionResolver), extractChildren(div2, expressionResolver2), divComparatorReporter);
    }

    public final boolean areValuesReplaceable(@NotNull e2 e2Var, @NotNull e2 e2Var2, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2, @Nullable DivComparatorReporter divComparatorReporter) {
        if (e2Var.getId() != null && e2Var2.getId() != null && !p.f(e2Var.getId(), e2Var2.getId()) && (hasTransitions(e2Var) || hasTransitions(e2Var2))) {
            if (divComparatorReporter != null) {
                divComparatorReporter.onComparisonDifferentIdsWithTransition();
            }
            return false;
        }
        if ((e2Var instanceof DivCustom) && (e2Var2 instanceof DivCustom) && !p.f(((DivCustom) e2Var).f55019j, ((DivCustom) e2Var2).f55019j)) {
            if (divComparatorReporter != null) {
                divComparatorReporter.onComparisonDifferentCustomTypes();
            }
            return false;
        }
        if (!(e2Var instanceof DivContainer) || !(e2Var2 instanceof DivContainer)) {
            return true;
        }
        DivContainer divContainer = (DivContainer) e2Var;
        DivContainer divContainer2 = (DivContainer) e2Var2;
        if (isOverlap(divContainer, expressionResolver) != isOverlap(divContainer2, expressionResolver2)) {
            if (divComparatorReporter != null) {
                divComparatorReporter.onComparisonDifferentOverlap();
            }
            return false;
        }
        if (DivUtilKt.isWrapContainer(divContainer, expressionResolver) == DivUtilKt.isWrapContainer(divContainer2, expressionResolver2)) {
            return true;
        }
        if (divComparatorReporter != null) {
            divComparatorReporter.onComparisonDifferentWrap();
        }
        return false;
    }

    public final boolean isDivDataReplaceable(@Nullable DivData divData, @NotNull DivData divData2, long j10, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2, @Nullable DivComparatorReporter divComparatorReporter) {
        Object obj;
        Object next;
        if (divData == null) {
            if (divComparatorReporter != null) {
                divComparatorReporter.onComparisonNoOldData();
            }
            return false;
        }
        Iterator<T> it = divData.f55082c.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((DivData.State) next).f55092b == j10) {
                break;
            }
        }
        DivData.State state = (DivData.State) next;
        Iterator<T> it2 = divData2.f55082c.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next2 = it2.next();
            if (((DivData.State) next2).f55092b == j10) {
                obj = next2;
                break;
            }
        }
        DivData.State state2 = (DivData.State) obj;
        if (state == null || state2 == null) {
            if (divComparatorReporter != null) {
                divComparatorReporter.onComparisonNoState();
            }
            return false;
        }
        boolean zAreDivsReplaceable = areDivsReplaceable(state.f55091a, state2.f55091a, expressionResolver, expressionResolver2, divComparatorReporter);
        if (zAreDivsReplaceable && divComparatorReporter != null) {
            divComparatorReporter.onComparisonSuccess();
        }
        return zAreDivsReplaceable;
    }
}
