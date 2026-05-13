package com.yandex.div.internal.core;

import cn.w;
import cn.x;
import com.yandex.div.core.expression.ExpressionsRuntime;
import com.yandex.div.core.state.DivPathUtils;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.Div;
import com.yandex.div2.DivCollectionItemBuilder;
import com.yandex.div2.DivState;
import com.yandex.div2.DivTabs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import tn.i;

/* JADX INFO: compiled from: DivTreeVisitor.kt */
/* JADX INFO: loaded from: classes2.dex */
public abstract class DivTreeVisitor<T> {

    @Nullable
    private final l<T, Boolean> returnCondition;

    /* JADX WARN: Multi-variable type inference failed */
    public DivTreeVisitor(@Nullable l<? super T, Boolean> lVar) {
        this.returnCondition = lVar;
    }

    public /* synthetic */ DivTreeVisitor(l lVar, int i10, i iVar) {
        this((i10 & 1) != 0 ? null : lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object defaultVisitCollection$default(DivTreeVisitor divTreeVisitor, Div div, BindingContext bindingContext, DivStatePath divStatePath, List list, DivCollectionItemBuilder divCollectionItemBuilder, List list2, int i10, Object obj) {
        if (obj == null) {
            return divTreeVisitor.defaultVisitCollection(div, bindingContext, divStatePath, list, (i10 & 16) != 0 ? null : divCollectionItemBuilder, (i10 & 32) != 0 ? null : list2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: defaultVisitCollection");
    }

    private final T visit(DivCollectionItemBuilder divCollectionItemBuilder, BindingContext bindingContext, DivStatePath divStatePath, T t10) {
        ExpressionResolver expressionResolver;
        List<DivItemBuilderResult> listBuild = DivCollectionExtensionsKt.build(divCollectionItemBuilder, bindingContext.getExpressionResolver());
        List<String> itemIds = DivPathUtils.INSTANCE.getItemIds(listBuild);
        int i10 = 0;
        for (T t11 : listBuild) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                w.w();
            }
            DivItemBuilderResult divItemBuilderResult = (DivItemBuilderResult) t11;
            DivStatePath divStatePathAppendDiv = divStatePath.appendDiv(itemIds.get(i10));
            ExpressionsRuntime expressionsRuntimeResolveRuntimeWith = bindingContext.getDivView().getRuntimeStore$div_release().resolveRuntimeWith(bindingContext.getDivView(), divStatePathAppendDiv, divItemBuilderResult.getDiv(), divItemBuilderResult.getExpressionResolver(), bindingContext.getExpressionResolver());
            if (expressionsRuntimeResolveRuntimeWith == null || (expressionResolver = expressionsRuntimeResolveRuntimeWith.getExpressionResolver()) == null) {
                expressionResolver = divItemBuilderResult.getExpressionResolver();
            }
            T tVisitCollectionChild = visitCollectionChild(divItemBuilderResult.getDiv(), new BindingContext(bindingContext.getDivView(), expressionResolver), divStatePathAppendDiv, t10);
            l<T, Boolean> lVar = this.returnCondition;
            if (lVar != null && lVar.invoke(tVisitCollectionChild).booleanValue()) {
                return tVisitCollectionChild;
            }
            i10 = i11;
        }
        return t10;
    }

    public abstract T defaultVisit(@NotNull Div div, @NotNull BindingContext bindingContext, @NotNull DivStatePath divStatePath);

    public T defaultVisitCollection(@NotNull Div div, @NotNull BindingContext bindingContext, @NotNull DivStatePath divStatePath, @Nullable List<? extends Div> list, @Nullable DivCollectionItemBuilder divCollectionItemBuilder, @Nullable List<DivStatePath> list2) {
        List<String> ids;
        DivStatePath divStatePathAppendDiv;
        T tDefaultVisit = defaultVisit(div, bindingContext, divStatePath);
        l<T, Boolean> lVar = this.returnCondition;
        if (lVar != null && lVar.invoke(tDefaultVisit).booleanValue()) {
            return tDefaultVisit;
        }
        if (divCollectionItemBuilder != null) {
            return visit(divCollectionItemBuilder, bindingContext, divStatePath, tDefaultVisit);
        }
        if (list != null && (ids = DivPathUtils.INSTANCE.getIds(list)) != null) {
            int i10 = 0;
            for (T t10 : list) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    w.w();
                }
                Div div2 = (Div) t10;
                if (list2 == null || (divStatePathAppendDiv = list2.get(i10)) == null) {
                    divStatePathAppendDiv = divStatePath.appendDiv(ids.get(i10));
                }
                T tVisitCollectionChild = visitCollectionChild(div2, bindingContext, divStatePathAppendDiv, tDefaultVisit);
                l<T, Boolean> lVar2 = this.returnCondition;
                if (lVar2 != null && lVar2.invoke(tVisitCollectionChild).booleanValue()) {
                    return tVisitCollectionChild;
                }
                i10 = i11;
            }
        }
        return tDefaultVisit;
    }

    public T visit(@NotNull Div.b bVar, @NotNull BindingContext bindingContext, @NotNull DivStatePath divStatePath) {
        return (T) defaultVisitCollection$default(this, bVar, bindingContext, divStatePath, bVar.c().B, bVar.c().f54881z, null, 32, null);
    }

    public T visit(@NotNull Div.c cVar, @NotNull BindingContext bindingContext, @NotNull DivStatePath divStatePath) {
        return (T) defaultVisitCollection$default(this, cVar, bindingContext, divStatePath, cVar.c().f55026q, null, null, 48, null);
    }

    public T visit(@NotNull Div.d dVar, @NotNull BindingContext bindingContext, @NotNull DivStatePath divStatePath) {
        return (T) defaultVisitCollection$default(this, dVar, bindingContext, divStatePath, dVar.c().f55426u, dVar.c().f55424s, null, 32, null);
    }

    public T visit(@NotNull Div.e eVar, @NotNull BindingContext bindingContext, @NotNull DivStatePath divStatePath) {
        return defaultVisit(eVar, bindingContext, divStatePath);
    }

    public T visit(@NotNull Div.f fVar, @NotNull BindingContext bindingContext, @NotNull DivStatePath divStatePath) {
        return (T) defaultVisitCollection$default(this, fVar, bindingContext, divStatePath, fVar.c().f55625y, null, null, 48, null);
    }

    public T visit(@NotNull Div.g gVar, @NotNull BindingContext bindingContext, @NotNull DivStatePath divStatePath) {
        return defaultVisit(gVar, bindingContext, divStatePath);
    }

    public T visit(@NotNull Div.h hVar, @NotNull BindingContext bindingContext, @NotNull DivStatePath divStatePath) {
        return defaultVisit(hVar, bindingContext, divStatePath);
    }

    public T visit(@NotNull Div.i iVar, @NotNull BindingContext bindingContext, @NotNull DivStatePath divStatePath) {
        return defaultVisit(iVar, bindingContext, divStatePath);
    }

    public T visit(@NotNull Div.j jVar, @NotNull BindingContext bindingContext, @NotNull DivStatePath divStatePath) {
        return (T) defaultVisitCollection$default(this, jVar, bindingContext, divStatePath, jVar.c().f56405t, jVar.c().f56403r, null, 32, null);
    }

    public T visit(@NotNull Div.k kVar, @NotNull BindingContext bindingContext, @NotNull DivStatePath divStatePath) {
        return defaultVisit(kVar, bindingContext, divStatePath);
    }

    public T visit(@NotNull Div.l lVar, @NotNull BindingContext bindingContext, @NotNull DivStatePath divStatePath) {
        return defaultVisit(lVar, bindingContext, divStatePath);
    }

    public T visit(@NotNull Div.m mVar, @NotNull BindingContext bindingContext, @NotNull DivStatePath divStatePath) {
        return defaultVisit(mVar, bindingContext, divStatePath);
    }

    public T visit(@NotNull Div.n nVar, @NotNull BindingContext bindingContext, @NotNull DivStatePath divStatePath) {
        String id$div_release$default = DivPathUtils.getId$div_release$default(DivPathUtils.INSTANCE, nVar.c(), null, 1, null);
        List<DivState.State> list = nVar.c().I;
        ArrayList arrayList = new ArrayList();
        for (DivState.State state : list) {
            DivStatePath divStatePathAppend$div_release = state.f57194c == null ? null : divStatePath.append$div_release(id$div_release$default, state, state.f57195d);
            if (divStatePathAppend$div_release != null) {
                arrayList.add(divStatePathAppend$div_release);
            }
        }
        List<DivState.State> list2 = nVar.c().I;
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            Div div = ((DivState.State) it.next()).f57194c;
            if (div != null) {
                arrayList2.add(div);
            }
        }
        return defaultVisitCollection(nVar, bindingContext, divStatePath, arrayList2, null, arrayList);
    }

    public T visit(@NotNull Div.o oVar, @NotNull BindingContext bindingContext, @NotNull DivStatePath divStatePath) {
        return defaultVisit(oVar, bindingContext, divStatePath);
    }

    public T visit(@NotNull Div.p pVar, @NotNull BindingContext bindingContext, @NotNull DivStatePath divStatePath) {
        List<DivTabs.Item> list = pVar.c().f57409q;
        ArrayList arrayList = new ArrayList(x.x(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((DivTabs.Item) it.next()).f57421a);
        }
        return (T) defaultVisitCollection$default(this, pVar, bindingContext, divStatePath, arrayList, null, null, 48, null);
    }

    public T visit(@NotNull Div.q qVar, @NotNull BindingContext bindingContext, @NotNull DivStatePath divStatePath) {
        return defaultVisit(qVar, bindingContext, divStatePath);
    }

    public T visit(@NotNull Div.r rVar, @NotNull BindingContext bindingContext, @NotNull DivStatePath divStatePath) {
        return defaultVisit(rVar, bindingContext, divStatePath);
    }

    public final T visit(@NotNull Div div, @NotNull BindingContext bindingContext, @NotNull DivStatePath divStatePath) {
        BindingContext childContext = DivTreeVisitorKt.getChildContext(bindingContext, div, divStatePath);
        if (div instanceof Div.q) {
            return visit((Div.q) div, childContext, divStatePath);
        }
        if (div instanceof Div.g) {
            return visit((Div.g) div, childContext, divStatePath);
        }
        if (div instanceof Div.e) {
            return visit((Div.e) div, childContext, divStatePath);
        }
        if (div instanceof Div.l) {
            return visit((Div.l) div, childContext, divStatePath);
        }
        if (div instanceof Div.b) {
            return visit((Div.b) div, childContext, divStatePath);
        }
        if (div instanceof Div.f) {
            return visit((Div.f) div, childContext, divStatePath);
        }
        if (div instanceof Div.d) {
            return visit((Div.d) div, childContext, divStatePath);
        }
        if (div instanceof Div.j) {
            return visit((Div.j) div, childContext, divStatePath);
        }
        if (div instanceof Div.p) {
            return visit((Div.p) div, childContext, divStatePath);
        }
        if (div instanceof Div.n) {
            return visit((Div.n) div, childContext, divStatePath);
        }
        if (div instanceof Div.c) {
            return visit((Div.c) div, childContext, divStatePath);
        }
        if (div instanceof Div.h) {
            return visit((Div.h) div, childContext, divStatePath);
        }
        if (div instanceof Div.m) {
            return visit((Div.m) div, childContext, divStatePath);
        }
        if (div instanceof Div.i) {
            return visit((Div.i) div, childContext, divStatePath);
        }
        if (div instanceof Div.k) {
            return visit((Div.k) div, childContext, divStatePath);
        }
        if (div instanceof Div.r) {
            return visit((Div.r) div, childContext, divStatePath);
        }
        if (div instanceof Div.o) {
            return visit((Div.o) div, childContext, divStatePath);
        }
        throw new NoWhenBranchMatchedException();
    }

    public T visitCollectionChild(@NotNull Div div, @NotNull BindingContext bindingContext, @NotNull DivStatePath divStatePath, T t10) {
        return visit(div, bindingContext, divStatePath);
    }
}
