package com.yandex.div.core.state;

import ah.e2;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewGroupKt;
import bn.r;
import cn.f0;
import cn.v;
import cn.x;
import com.yandex.div.core.expression.ExpressionResolverImpl;
import com.yandex.div.core.expression.local.UtilsKt;
import com.yandex.div.core.view2.divs.widgets.DivStateLayout;
import com.yandex.div.internal.core.DivCollectionExtensionsKt;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.Div;
import com.yandex.div2.DivData;
import com.yandex.div2.DivState;
import com.yandex.div2.DivTabs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.a;
import sn.l;
import tn.p;

/* JADX INFO: compiled from: DivPathUtils.kt */
/* JADX INFO: loaded from: classes.dex */
public final class DivPathUtils {

    @NotNull
    public static final DivPathUtils INSTANCE = new DivPathUtils();

    private DivPathUtils() {
    }

    private final Div findByPath(Div div, String str, ExpressionResolver expressionResolver) {
        if (div instanceof Div.n) {
            Div.n nVar = (Div.n) div;
            if (!p.f(getId$div_release$default(INSTANCE, nVar.c(), null, 1, null), str)) {
                div = null;
            }
            Div.n nVar2 = (Div.n) div;
            return nVar2 != null ? nVar2 : findRecursively(nVar.c().I, str, expressionResolver, new l<DivState.State, Div>() { // from class: com.yandex.div.core.state.DivPathUtils.findByPath.2
                @Override // sn.l
                @Nullable
                public final Div invoke(@NotNull DivState.State state) {
                    return state.f57194c;
                }
            });
        }
        if (div instanceof Div.p) {
            return findRecursively(((Div.p) div).c().f57409q, str, expressionResolver, new l<DivTabs.Item, Div>() { // from class: com.yandex.div.core.state.DivPathUtils.findByPath.3
                @Override // sn.l
                @Nullable
                public final Div invoke(@NotNull DivTabs.Item item) {
                    return item.f57421a;
                }
            });
        }
        if (div instanceof Div.b) {
            return findRecursively(DivCollectionExtensionsKt.buildItems(((Div.b) div).c(), expressionResolver), str);
        }
        if (div instanceof Div.f) {
            return findRecursively$default(this, DivCollectionExtensionsKt.getNonNullItems(((Div.f) div).c()), str, expressionResolver, null, 4, null);
        }
        if (div instanceof Div.d) {
            return findRecursively(DivCollectionExtensionsKt.buildItems(((Div.d) div).c(), expressionResolver), str);
        }
        if (div instanceof Div.j) {
            return findRecursively(DivCollectionExtensionsKt.buildItems(((Div.j) div).c(), expressionResolver), str);
        }
        if (div instanceof Div.c) {
            List<Div> list = ((Div.c) div).c().f55026q;
            if (list != null) {
                return findRecursively$default(this, list, str, expressionResolver, null, 4, null);
            }
            return null;
        }
        if ((div instanceof Div.q) || (div instanceof Div.g) || (div instanceof Div.m) || (div instanceof Div.i) || (div instanceof Div.e) || (div instanceof Div.h) || (div instanceof Div.l) || (div instanceof Div.k) || (div instanceof Div.r) || (div instanceof Div.o)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final Div findRecursively(Iterable<DivItemBuilderResult> iterable, String str) {
        for (DivItemBuilderResult divItemBuilderResult : iterable) {
            Div divFindByPath = INSTANCE.findByPath(divItemBuilderResult.component1(), str, divItemBuilderResult.component2());
            if (divFindByPath != null) {
                return divFindByPath;
            }
        }
        return null;
    }

    private final <T> Div findRecursively(Iterable<? extends T> iterable, String str, ExpressionResolver expressionResolver, l<? super T, ? extends Div> lVar) {
        Div divFindByPath;
        Iterator<? extends T> it = iterable.iterator();
        do {
            divFindByPath = null;
            if (!it.hasNext()) {
                break;
            }
            Div divInvoke = lVar.invoke(it.next());
            if (divInvoke != null) {
                divFindByPath = INSTANCE.findByPath(divInvoke, str, expressionResolver);
            }
        } while (divFindByPath == null);
        return divFindByPath;
    }

    public static /* synthetic */ Div findRecursively$default(DivPathUtils divPathUtils, Iterable iterable, String str, ExpressionResolver expressionResolver, l lVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            lVar = new l() { // from class: com.yandex.div.core.state.DivPathUtils.findRecursively.1
                @Override // sn.l
                @Nullable
                public final Div invoke(Object obj2) {
                    return (Div) obj2;
                }
            };
        }
        return divPathUtils.findRecursively(iterable, str, expressionResolver, lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ String getId$div_release$default(DivPathUtils divPathUtils, DivState divState, a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            aVar = null;
        }
        return divPathUtils.getId$div_release(divState, aVar);
    }

    public static /* synthetic */ List getIds$default(DivPathUtils divPathUtils, List list, l lVar, l lVar2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            lVar2 = new l() { // from class: com.yandex.div.core.state.DivPathUtils.getIds.2
                @Override // sn.l
                @Nullable
                public final Void invoke(Object obj2) {
                    return null;
                }
            };
        }
        return divPathUtils.getIds(list, lVar, lVar2);
    }

    private final boolean lastStateEquals(DivStatePath divStatePath, DivStatePath divStatePath2) {
        DivStatePath divStatePathParentState;
        if (divStatePath2.getContainsOnlyStates$div_release()) {
            return p.f(divStatePath != null ? divStatePath.getPathToLastState() : null, divStatePath2.getPathToLastState());
        }
        if (divStatePath != null && (divStatePathParentState = divStatePath.parentState()) != null) {
            fullPath$div_release = divStatePathParentState.getFullPath$div_release();
        }
        return p.f(fullPath$div_release, divStatePath2.parentState().getFullPath$div_release());
    }

    @NotNull
    public final List<DivStatePath> compactPathList$div_release(@NotNull List<DivStatePath> list) {
        List listE;
        if (list.isEmpty()) {
            return list;
        }
        List<DivStatePath> listX0 = f0.X0(list, DivStatePath.Companion.alphabeticalComparator$div_release());
        Object objT0 = f0.t0(listX0);
        int iX = x.x(listX0, 9);
        if (iX == 0) {
            listE = v.e(objT0);
        } else {
            ArrayList arrayList = new ArrayList(iX + 1);
            arrayList.add(objT0);
            Object obj = objT0;
            for (DivStatePath divStatePath : listX0) {
                DivStatePath divStatePath2 = (DivStatePath) obj;
                if (!divStatePath2.isAncestorOf(divStatePath)) {
                    divStatePath2 = divStatePath;
                }
                arrayList.add(divStatePath2);
                obj = divStatePath2;
            }
            listE = arrayList;
        }
        return f0.k0(listE);
    }

    @Nullable
    public final Div findDivState$div_release(@NotNull Div div, @NotNull DivStatePath divStatePath, @NotNull ExpressionResolver expressionResolver) {
        List<Pair<String, String>> states = divStatePath.getStates();
        if (states.isEmpty()) {
            return null;
        }
        Iterator<T> it = states.iterator();
        while (it.hasNext()) {
            String str = (String) ((Pair) it.next()).component1();
            if (div == null || (div = INSTANCE.findByPath(div, str, expressionResolver)) == null) {
                return null;
            }
        }
        return div;
    }

    @Nullable
    public final DivStateLayout findStateLayout$div_release(@NotNull View view, @NotNull DivStatePath divStatePath) throws StateConflictException {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof DivStateLayout) {
            DivStateLayout divStateLayout = (DivStateLayout) view;
            if (lastStateEquals(divStateLayout.getPath(), divStatePath)) {
                return divStateLayout;
            }
        }
        Iterator<View> it = ViewGroupKt.getChildren((ViewGroup) view).iterator();
        DivStateLayout divStateLayout2 = null;
        while (it.hasNext()) {
            DivStateLayout divStateLayoutFindStateLayout$div_release = findStateLayout$div_release(it.next(), divStatePath);
            if (divStateLayoutFindStateLayout$div_release != null) {
                if (p.f(String.valueOf(divStateLayout2 != null ? divStateLayout2.getPath() : null), String.valueOf(divStateLayoutFindStateLayout$div_release.getPath()))) {
                    throw new StateConflictException("Error resolving state for '" + divStatePath + "'. Found multiple elements that respond to path '" + divStateLayoutFindStateLayout$div_release.getPath() + "'!", null, 2, null);
                }
                divStateLayout2 = divStateLayoutFindStateLayout$div_release;
            }
        }
        return divStateLayout2;
    }

    @Nullable
    public final String getId(@NotNull Div div) {
        e2 e2VarB = div.b();
        return e2VarB instanceof DivState ? getId$div_release$default(INSTANCE, (DivState) e2VarB, null, 1, null) : e2VarB.getId();
    }

    @NotNull
    public final String getId$div_release(@NotNull DivState divState, @Nullable a<r> aVar) {
        String str = divState.f57179p;
        if (str != null) {
            return str;
        }
        String id2 = divState.getId();
        if (id2 != null) {
            return id2;
        }
        if (aVar != null) {
            aVar.invoke();
        }
        return "";
    }

    @NotNull
    public final List<String> getIds(@NotNull List<? extends Div> list) {
        return getIds$default(this, list, new l<Div, Div>() { // from class: com.yandex.div.core.state.DivPathUtils.getIds.1
            @Override // sn.l
            @NotNull
            public final Div invoke(@NotNull Div div) {
                return div;
            }
        }, null, 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x008e  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T> java.util.List<java.lang.String> getIds(@org.jetbrains.annotations.NotNull java.util.List<? extends T> r10, @org.jetbrains.annotations.NotNull sn.l<? super T, ? extends com.yandex.div2.Div> r11, @org.jetbrains.annotations.NotNull sn.l<? super T, com.yandex.div.core.expression.ExpressionResolverImpl> r12) {
        /*
            r9 = this;
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Iterator r1 = r10.iterator()
        L9:
            boolean r2 = r1.hasNext()
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L39
            java.lang.Object r2 = r1.next()
            com.yandex.div.core.state.DivPathUtils r5 = com.yandex.div.core.state.DivPathUtils.INSTANCE
            java.lang.Object r2 = r11.invoke(r2)
            com.yandex.div2.Div r2 = (com.yandex.div2.Div) r2
            java.lang.String r2 = r5.getId(r2)
            if (r2 != 0) goto L24
            goto L9
        L24:
            java.lang.Object r5 = r0.get(r2)
            java.lang.Integer r5 = (java.lang.Integer) r5
            if (r5 == 0) goto L30
            int r4 = r5.intValue()
        L30:
            int r4 = r4 + r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            r0.put(r2, r3)
            goto L9
        L39:
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = cn.x.x(r10, r2)
            r1.<init>(r2)
            java.util.Iterator r10 = r10.iterator()
            r2 = r4
        L49:
            boolean r5 = r10.hasNext()
            if (r5 == 0) goto Laa
            java.lang.Object r5 = r10.next()
            int r6 = r2 + 1
            if (r2 >= 0) goto L5a
            cn.w.w()
        L5a:
            com.yandex.div.core.state.DivPathUtils r7 = com.yandex.div.core.state.DivPathUtils.INSTANCE
            java.lang.Object r8 = r11.invoke(r5)
            com.yandex.div2.Div r8 = (com.yandex.div2.Div) r8
            java.lang.String r7 = r7.getId(r8)
            if (r7 == 0) goto L8e
            java.lang.Object r8 = r0.get(r7)
            java.lang.Integer r8 = (java.lang.Integer) r8
            if (r8 == 0) goto L75
            int r8 = r8.intValue()
            goto L76
        L75:
            r8 = r4
        L76:
            if (r8 <= r3) goto L8c
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r7)
            r7 = 35
            r8.append(r7)
            r8.append(r2)
            java.lang.String r7 = r8.toString()
        L8c:
            if (r7 != 0) goto La5
        L8e:
            java.lang.Object r5 = r12.invoke(r5)
            com.yandex.div.core.expression.ExpressionResolverImpl r5 = (com.yandex.div.core.expression.ExpressionResolverImpl) r5
            if (r5 == 0) goto L9b
            java.lang.String r5 = r5.getItemBuilderData()
            goto L9c
        L9b:
            r5 = 0
        L9c:
            r7 = r5
            if (r7 != 0) goto La5
            com.yandex.div.core.expression.local.ChildPathUnitCache r5 = com.yandex.div.core.expression.local.ChildPathUnitCache.INSTANCE
            java.lang.String r7 = r5.getValue$div_release(r2)
        La5:
            r1.add(r7)
            r2 = r6
            goto L49
        Laa:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.core.state.DivPathUtils.getIds(java.util.List, sn.l, sn.l):java.util.List");
    }

    @NotNull
    public final List<String> getItemIds(@NotNull List<DivItemBuilderResult> list) {
        return getIds(list, new l<DivItemBuilderResult, Div>() { // from class: com.yandex.div.core.state.DivPathUtils.getItemIds.1
            @Override // sn.l
            @NotNull
            public final Div invoke(@NotNull DivItemBuilderResult divItemBuilderResult) {
                return divItemBuilderResult.getDiv();
            }
        }, new l<DivItemBuilderResult, ExpressionResolverImpl>() { // from class: com.yandex.div.core.state.DivPathUtils.getItemIds.2
            @Override // sn.l
            @Nullable
            public final ExpressionResolverImpl invoke(@NotNull DivItemBuilderResult divItemBuilderResult) {
                return UtilsKt.getAsImpl(divItemBuilderResult.getExpressionResolver());
            }
        });
    }

    @Nullable
    public final Pair<DivStateLayout, Div.n> tryFindStateDivAndLayout$div_release(@NotNull View view, @NotNull DivData.State state, @NotNull DivStatePath divStatePath, @NotNull ExpressionResolver expressionResolver) throws StateConflictException {
        Div.n div;
        DivStateLayout divStateLayoutFindStateLayout$div_release = findStateLayout$div_release(view, divStatePath);
        if (divStateLayoutFindStateLayout$div_release == null) {
            DivStatePath divStatePathParentState = divStatePath.parentState();
            if ((divStatePathParentState.isRootPath() && state.f55092b == divStatePath.getTopLevelStateId()) || findStateLayout$div_release(view, divStatePathParentState) == null) {
                return null;
            }
        }
        if (divStateLayoutFindStateLayout$div_release == null || (div = divStateLayoutFindStateLayout$div_release.getDiv()) == null) {
            Div divFindDivState$div_release = findDivState$div_release(state.f55091a, divStatePath, expressionResolver);
            div = divFindDivState$div_release instanceof Div.n ? (Div.n) divFindDivState$div_release : null;
            if (div == null) {
                return null;
            }
        }
        return new Pair<>(divStateLayoutFindStateLayout$div_release, div);
    }
}
