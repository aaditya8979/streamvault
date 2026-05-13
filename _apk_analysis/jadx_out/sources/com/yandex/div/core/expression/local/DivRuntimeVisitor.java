package com.yandex.div.core.expression.local;

import bn.r;
import cn.f0;
import cn.w;
import com.yandex.div.core.expression.ExpressionResolverImpl;
import com.yandex.div.core.expression.ExpressionsRuntime;
import com.yandex.div.core.state.DivPathUtils;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.state.TabsStateCache;
import com.yandex.div.core.state.TemporaryDivStateCache;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.data.Variable;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.internal.core.DivCollectionExtensionsKt;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.state.DivStateCache;
import com.yandex.div2.Div;
import com.yandex.div2.DivCollectionItemBuilder;
import com.yandex.div2.DivState;
import com.yandex.div2.DivTabs;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import sn.l;
import tn.p;

/* JADX INFO: compiled from: DivRuntimeVisitor.kt */
/* JADX INFO: loaded from: classes10.dex */
public class DivRuntimeVisitor {

    @NotNull
    private final DivStateCache divStateCache;

    @NotNull
    private final TabsStateCache tabsCache;

    @NotNull
    private final TemporaryDivStateCache temporaryStateCache;

    public DivRuntimeVisitor(@NotNull DivStateCache divStateCache, @NotNull TemporaryDivStateCache temporaryDivStateCache, @NotNull TabsStateCache tabsStateCache) {
        this.divStateCache = divStateCache;
        this.temporaryStateCache = temporaryDivStateCache;
        this.tabsCache = tabsStateCache;
    }

    private ExpressionsRuntime defaultVisit(Div div, Div2View div2View, DivStatePath divStatePath, ExpressionsRuntime expressionsRuntime) {
        ExpressionsRuntime orCreateRuntime = div2View.getRuntimeStore$div_release().getOrCreateRuntime(divStatePath, div, expressionsRuntime.getExpressionResolver());
        orCreateRuntime.onAttachedToWindow(div2View);
        return orCreateRuntime;
    }

    private String getActiveStateId(DivState divState, Div2View div2View, DivStatePath divStatePath, ExpressionResolverImpl expressionResolverImpl) {
        String strValueOf;
        String str = divStatePath.getStatesString$div_release() + '/' + divStatePath.getLastDivId$div_release();
        String id2 = div2View.getDivTag().getId();
        String state = this.temporaryStateCache.getState(id2, str);
        if (state != null) {
            return state;
        }
        String state2 = this.divStateCache.getState(id2, str);
        if (state2 != null) {
            return state2;
        }
        String str2 = divState.H;
        if (str2 != null) {
            Variable mutableVariable = expressionResolverImpl.getVariableController().getMutableVariable(str2);
            strValueOf = String.valueOf(mutableVariable != null ? mutableVariable.getValue() : null);
        } else {
            strValueOf = null;
        }
        if (strValueOf != null) {
            return strValueOf;
        }
        Expression<String> expression = divState.f57177n;
        String strEvaluate = expression != null ? expression.evaluate(expressionResolverImpl) : null;
        if (strEvaluate != null) {
            return strEvaluate;
        }
        DivState.State state3 = (DivState.State) f0.v0(divState.I);
        if (state3 != null) {
            return state3.f57195d;
        }
        return null;
    }

    private void visit(Div div, Div2View div2View, DivStatePath divStatePath, ExpressionsRuntime expressionsRuntime) {
        if (div instanceof Div.b) {
            Div.b bVar = (Div.b) div;
            visitContainer(div, div2View, bVar.c().B, bVar.c().f54881z, divStatePath, expressionsRuntime);
            return;
        }
        if (div instanceof Div.f) {
            visitContainer(div, div2View, ((Div.f) div).c().f55625y, null, divStatePath, expressionsRuntime);
            return;
        }
        if (div instanceof Div.d) {
            Div.d dVar = (Div.d) div;
            visitContainer(div, div2View, dVar.c().f55426u, dVar.c().f55424s, divStatePath, expressionsRuntime);
            return;
        }
        if (div instanceof Div.j) {
            Div.j jVar = (Div.j) div;
            visitContainer(div, div2View, jVar.c().f56405t, jVar.c().f56403r, divStatePath, expressionsRuntime);
            return;
        }
        if (div instanceof Div.n) {
            visitState((Div.n) div, div2View, divStatePath, expressionsRuntime);
            return;
        }
        if (div instanceof Div.p) {
            visitTabs((Div.p) div, div2View, divStatePath, expressionsRuntime);
            return;
        }
        if (div instanceof Div.c) {
            defaultVisit(div, div2View, divStatePath, expressionsRuntime);
            return;
        }
        if (div instanceof Div.e) {
            defaultVisit(div, div2View, divStatePath, expressionsRuntime);
            return;
        }
        if (div instanceof Div.g) {
            defaultVisit(div, div2View, divStatePath, expressionsRuntime);
            return;
        }
        if (div instanceof Div.h) {
            defaultVisit(div, div2View, divStatePath, expressionsRuntime);
            return;
        }
        if (div instanceof Div.i) {
            defaultVisit(div, div2View, divStatePath, expressionsRuntime);
            return;
        }
        if (div instanceof Div.k) {
            defaultVisit(div, div2View, divStatePath, expressionsRuntime);
            return;
        }
        if (div instanceof Div.l) {
            defaultVisit(div, div2View, divStatePath, expressionsRuntime);
            return;
        }
        if (div instanceof Div.m) {
            defaultVisit(div, div2View, divStatePath, expressionsRuntime);
            return;
        }
        if (div instanceof Div.q) {
            defaultVisit(div, div2View, divStatePath, expressionsRuntime);
        } else if (div instanceof Div.r) {
            defaultVisit(div, div2View, divStatePath, expressionsRuntime);
        } else if (div instanceof Div.o) {
            defaultVisit(div, div2View, divStatePath, expressionsRuntime);
        }
    }

    private void visit(DivCollectionItemBuilder divCollectionItemBuilder, Div2View div2View, DivStatePath divStatePath, ExpressionsRuntime expressionsRuntime) {
        List<DivItemBuilderResult> listBuild = DivCollectionExtensionsKt.build(divCollectionItemBuilder, expressionsRuntime.getExpressionResolver());
        List<String> itemIds = DivPathUtils.INSTANCE.getItemIds(listBuild);
        int i10 = 0;
        for (Object obj : listBuild) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                w.w();
            }
            DivItemBuilderResult divItemBuilderResult = (DivItemBuilderResult) obj;
            DivStatePath divStatePathAppendDiv = divStatePath.appendDiv(itemIds.get(i10));
            ExpressionsRuntime expressionsRuntimeResolveRuntimeWith = div2View.getRuntimeStore$div_release().resolveRuntimeWith(div2View, divStatePathAppendDiv, divItemBuilderResult.getDiv(), divItemBuilderResult.getExpressionResolver(), expressionsRuntime.getExpressionResolver());
            Div div = divItemBuilderResult.getDiv();
            if (expressionsRuntimeResolveRuntimeWith == null) {
                expressionsRuntimeResolveRuntimeWith = expressionsRuntime;
            }
            visit(div, div2View, divStatePathAppendDiv, expressionsRuntimeResolveRuntimeWith);
            i10 = i11;
        }
    }

    private void visitChild(Div div, final Div2View div2View, DivStatePath divStatePath, ExpressionsRuntime expressionsRuntime, boolean z10) {
        if (z10) {
            visit(div, div2View, divStatePath, expressionsRuntime);
        } else {
            div2View.getRuntimeStore$div_release().traverseFrom(div2View.getRuntimeStore$div_release().getOrCreateRuntime(divStatePath, div, expressionsRuntime.getExpressionResolver()), divStatePath, new l<ExpressionsRuntime, r>() { // from class: com.yandex.div.core.expression.local.DivRuntimeVisitor.visitChild.1
                {
                    super(1);
                }

                @Override // sn.l
                public /* bridge */ /* synthetic */ r invoke(ExpressionsRuntime expressionsRuntime2) {
                    invoke2(expressionsRuntime2);
                    return r.f5635a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull ExpressionsRuntime expressionsRuntime2) {
                    expressionsRuntime2.clearBinding(div2View);
                }
            });
        }
    }

    private void visitContainer(Div div, Div2View div2View, List<? extends Div> list, DivCollectionItemBuilder divCollectionItemBuilder, DivStatePath divStatePath, ExpressionsRuntime expressionsRuntime) {
        List<String> ids;
        ExpressionsRuntime expressionsRuntimeDefaultVisit = defaultVisit(div, div2View, divStatePath, expressionsRuntime);
        if (divCollectionItemBuilder != null) {
            visit(divCollectionItemBuilder, div2View, divStatePath, expressionsRuntimeDefaultVisit);
            return;
        }
        if (list == null || (ids = DivPathUtils.INSTANCE.getIds(list)) == null) {
            return;
        }
        int i10 = 0;
        for (Object obj : list) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                w.w();
            }
            visit((Div) obj, div2View, divStatePath.appendDiv(ids.get(i10)), expressionsRuntimeDefaultVisit);
            i10 = i11;
        }
    }

    private void visitState(Div.n nVar, Div2View div2View, DivStatePath divStatePath, ExpressionsRuntime expressionsRuntime) {
        visitStates(nVar.c(), div2View, divStatePath, defaultVisit(nVar, div2View, divStatePath, expressionsRuntime));
    }

    private void visitStates(DivState divState, Div2View div2View, DivStatePath divStatePath, ExpressionsRuntime expressionsRuntime) {
        String activeStateId = getActiveStateId(divState, div2View, divStatePath, expressionsRuntime.getExpressionResolver());
        for (DivState.State state : divState.I) {
            Div div = state.f57194c;
            if (div != null) {
                visitChild(div, div2View, divStatePath.append$div_release(divStatePath.getLastDivId$div_release(), state, state.f57195d), expressionsRuntime, p.f(state.f57195d, activeStateId));
            }
        }
    }

    private void visitTabs(Div.p pVar, Div2View div2View, DivStatePath divStatePath, ExpressionsRuntime expressionsRuntime) {
        visitTabs(pVar.c(), div2View, divStatePath, defaultVisit(pVar, div2View, divStatePath, expressionsRuntime));
    }

    private void visitTabs(DivTabs divTabs, Div2View div2View, DivStatePath divStatePath, ExpressionsRuntime expressionsRuntime) {
        int iIntValue;
        Integer selectedTab = this.tabsCache.getSelectedTab(div2View.getDataTag().getId(), divStatePath.getFullPath$div_release());
        if (selectedTab != null) {
            iIntValue = selectedTab.intValue();
        } else {
            long jLongValue = divTabs.f57417y.evaluate(expressionsRuntime.getExpressionResolver()).longValue();
            long j10 = jLongValue >> 31;
            if (j10 == 0 || j10 == -1) {
                iIntValue = (int) jLongValue;
            } else {
                KAssert kAssert = KAssert.INSTANCE;
                if (Assert.isEnabled()) {
                    Assert.fail("Unable convert '" + jLongValue + "' to Int");
                }
                iIntValue = jLongValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
        }
        int i10 = iIntValue;
        List ids$default = DivPathUtils.getIds$default(DivPathUtils.INSTANCE, divTabs.f57409q, new l<DivTabs.Item, Div>() { // from class: com.yandex.div.core.expression.local.DivRuntimeVisitor$visitTabs$ids$1
            @Override // sn.l
            @NotNull
            public final Div invoke(@NotNull DivTabs.Item item) {
                return item.f57421a;
            }
        }, null, 2, null);
        int i11 = 0;
        for (Object obj : divTabs.f57409q) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                w.w();
            }
            visitChild(((DivTabs.Item) obj).f57421a, div2View, divStatePath.appendDiv((String) ids$default.get(i11)), expressionsRuntime, i10 == i11);
            i11 = i12;
        }
    }

    public void createAndAttachRuntimes(@NotNull Div div, @NotNull DivStatePath divStatePath, @NotNull Div2View div2View) {
        ExpressionsRuntime rootRuntime = div2View.getRuntimeStore$div_release().getRootRuntime();
        rootRuntime.onAttachedToWindow(div2View);
        visit(div, div2View, divStatePath, rootRuntime);
    }

    public void createAndAttachRuntimesToState(@NotNull Div2View div2View, @NotNull DivState divState, @NotNull DivStatePath divStatePath, @NotNull ExpressionResolver expressionResolver) {
        ExpressionsRuntime runtimeWithOrNull = div2View.getRuntimeStore$div_release().getRuntimeWithOrNull(expressionResolver);
        if (runtimeWithOrNull == null) {
            return;
        }
        visitStates(divState, div2View, divStatePath, runtimeWithOrNull);
    }

    public void createAndAttachRuntimesToTabs(@NotNull Div2View div2View, @NotNull DivTabs divTabs, @NotNull DivStatePath divStatePath, @NotNull ExpressionResolver expressionResolver) {
        ExpressionsRuntime runtimeWithOrNull = div2View.getRuntimeStore$div_release().getRuntimeWithOrNull(expressionResolver);
        if (runtimeWithOrNull == null) {
            return;
        }
        visitTabs(divTabs, div2View, divStatePath, runtimeWithOrNull);
    }
}
