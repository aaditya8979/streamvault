package com.yandex.div.core.downloader;

import ah.e2;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewGroupKt;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.recyclerview.widget.RecyclerView;
import cn.b0;
import cn.f0;
import cn.v;
import cn.w;
import cn.x;
import com.yandex.div.core.view2.divs.gallery.DivGalleryAdapter;
import com.yandex.div.core.view2.divs.widgets.DivPagerView;
import com.yandex.div.core.view2.divs.widgets.DivRecyclerView;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.internal.KLog;
import com.yandex.div.internal.core.DivCollectionExtensionsKt;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.logging.Severity;
import com.yandex.div2.Div;
import com.yandex.div2.DivContainer;
import com.yandex.div2.DivCustom;
import com.yandex.div2.DivGallery;
import com.yandex.div2.DivGrid;
import com.yandex.div2.DivPager;
import com.yandex.div2.DivState;
import com.yandex.div2.DivTabs;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.a;
import sn.l;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: DivPatchApply.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class DivPatchApply {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private final Set<String> appliedPatches = new LinkedHashSet();

    @NotNull
    private final DivPatchMap patch;

    /* JADX INFO: compiled from: DivPatchApply.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    public DivPatchApply(@NotNull DivPatchMap divPatchMap) {
        this.patch = divPatchMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Div.b applyPatch(DivContainer divContainer, ExpressionResolver expressionResolver) {
        return new Div.b(DivContainer.z(divContainer, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, applyPatchForListOfDivs(divContainer.B, expressionResolver), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -134217729, 4194303, null));
    }

    private final Div.c applyPatch(DivCustom divCustom, ExpressionResolver expressionResolver) {
        return new Div.c(divCustom.y(((-32769) & 1) != 0 ? divCustom.o() : null, ((-32769) & 2) != 0 ? divCustom.g() : null, ((-32769) & 4) != 0 ? divCustom.m() : null, ((-32769) & 8) != 0 ? divCustom.getAlpha() : null, ((-32769) & 16) != 0 ? divCustom.w() : null, ((-32769) & 32) != 0 ? divCustom.getBackground() : null, ((-32769) & 64) != 0 ? divCustom.x() : null, ((-32769) & 128) != 0 ? divCustom.b() : null, ((-32769) & 256) != 0 ? divCustom.f55018i : null, ((-32769) & 512) != 0 ? divCustom.f55019j : null, ((-32769) & 1024) != 0 ? divCustom.k() : null, ((-32769) & 2048) != 0 ? divCustom.getExtensions() : null, ((-32769) & 4096) != 0 ? divCustom.n() : null, ((-32769) & 8192) != 0 ? divCustom.u() : null, ((-32769) & 16384) != 0 ? divCustom.getHeight() : null, ((-32769) & 32768) != 0 ? divCustom.getId() : null, ((-32769) & 65536) != 0 ? divCustom.f55026q : applyPatchForListOfDivs(divCustom.f55026q, expressionResolver), ((-32769) & 131072) != 0 ? divCustom.r() : null, ((-32769) & 262144) != 0 ? divCustom.d() : null, ((-32769) & 524288) != 0 ? divCustom.p() : null, ((-32769) & 1048576) != 0 ? divCustom.f() : null, ((-32769) & 2097152) != 0 ? divCustom.e() : null, ((-32769) & 4194304) != 0 ? divCustom.q() : null, ((-32769) & 8388608) != 0 ? divCustom.h() : null, ((-32769) & 16777216) != 0 ? divCustom.getTransform() : null, ((-32769) & 33554432) != 0 ? divCustom.j() : null, ((-32769) & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? divCustom.v() : null, ((-32769) & 134217728) != 0 ? divCustom.i() : null, ((-32769) & 268435456) != 0 ? divCustom.l() : null, ((-32769) & 536870912) != 0 ? divCustom.s() : null, ((-32769) & 1073741824) != 0 ? divCustom.c() : null, ((-32769) & Integer.MIN_VALUE) != 0 ? divCustom.getVisibility() : null, (7 & 1) != 0 ? divCustom.t() : null, (7 & 2) != 0 ? divCustom.a() : null, (7 & 4) != 0 ? divCustom.getWidth() : null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Div.d applyPatch(DivGallery divGallery, ExpressionResolver expressionResolver) {
        return new Div.d(DivGallery.z(divGallery, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, applyPatchForListOfDivs(divGallery.f55426u, expressionResolver), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1048577, 2047, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Div.f applyPatch(DivGrid divGrid, ExpressionResolver expressionResolver) {
        return new Div.f(DivGrid.z(divGrid, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, applyPatchForListOfDivs(divGrid.f55625y, expressionResolver), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -16777217, 16383, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Div.j applyPatch(DivPager divPager, ExpressionResolver expressionResolver) {
        return new Div.j(DivPager.z(divPager, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, applyPatchForListOfDivs(divPager.f56405t, expressionResolver), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -524289, 2047, null));
    }

    private final Div.n applyPatch(DivState divState, ExpressionResolver expressionResolver) {
        return new Div.n(DivState.z(divState, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, applyPatchForListStates(divState.I, expressionResolver), null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 65531, null));
    }

    private final Div.p applyPatch(DivTabs divTabs, ExpressionResolver expressionResolver) {
        ArrayList arrayList = new ArrayList();
        for (DivTabs.Item item : divTabs.f57409q) {
            List<Div> listApplyPatch = applyPatch(item.f57421a, expressionResolver);
            if (listApplyPatch.size() == 1) {
                arrayList.add(new DivTabs.Item(listApplyPatch.get(0), item.f57422b, item.f57423c));
            } else {
                KLog kLog = KLog.INSTANCE;
                if (kLog.isAtLeast(Severity.ERROR)) {
                    kLog.print(6, "DivPatchApply", "Unable to patch tab because there is more than 1 div in the patch");
                }
                arrayList.add(item);
            }
        }
        return new Div.p(DivTabs.z(divTabs, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, arrayList, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -65537, 2047, null));
    }

    private final List<Div> applyPatch(Div div, ExpressionResolver expressionResolver) {
        String id2 = div.b().getId();
        if (id2 != null && this.patch.getPatches().containsKey(id2)) {
            return applyPatchForSingleDiv(div);
        }
        if (div instanceof Div.b) {
            div = applyPatch(((Div.b) div).c(), expressionResolver);
        } else if (div instanceof Div.f) {
            div = applyPatch(((Div.f) div).c(), expressionResolver);
        } else if (div instanceof Div.d) {
            div = applyPatch(((Div.d) div).c(), expressionResolver);
        } else if (div instanceof Div.j) {
            div = applyPatch(((Div.j) div).c(), expressionResolver);
        } else if (div instanceof Div.n) {
            div = applyPatch(((Div.n) div).c(), expressionResolver);
        } else if (div instanceof Div.p) {
            div = applyPatch(((Div.p) div).c(), expressionResolver);
        } else if (div instanceof Div.c) {
            div = applyPatch(((Div.c) div).c(), expressionResolver);
        }
        return v.e(div);
    }

    private final List<Div> applyPatchForListOfDivs(List<? extends Div> list, ExpressionResolver expressionResolver) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            b0.F(arrayList, applyPatch((Div) it.next(), expressionResolver));
        }
        return arrayList;
    }

    private final List<DivState.State> applyPatchForListStates(List<DivState.State> list, ExpressionResolver expressionResolver) {
        e2 e2VarB;
        ArrayList arrayList = new ArrayList();
        for (DivState.State state : list) {
            Div div = state.f57194c;
            String id2 = (div == null || (e2VarB = div.b()) == null) ? null : e2VarB.getId();
            if (id2 != null) {
                List<Div> list2 = this.patch.getPatches().get(id2);
                if (list2 != null && list2.size() == 1) {
                    arrayList.add(new DivState.State(state.f57192a, state.f57193b, list2.get(0), state.f57195d, state.f57196e));
                    this.appliedPatches.add(id2);
                } else if (list2 == null || !list2.isEmpty()) {
                    arrayList.add(tryApplyPatchToDiv(state, expressionResolver));
                } else {
                    this.appliedPatches.add(id2);
                }
            } else {
                arrayList.add(tryApplyPatchToDiv(state, expressionResolver));
            }
        }
        return arrayList;
    }

    private final List<Div> applyPatchForSingleDiv(Div div) {
        List<Div> list;
        String id2 = div.b().getId();
        if (id2 != null && (list = this.patch.getPatches().get(id2)) != null) {
            this.appliedPatches.add(id2);
            return list;
        }
        return v.e(div);
    }

    private final View findPatchedRecyclerViewAndNotifyChange(View view, Div div, String str) {
        RecyclerView.Adapter adapter;
        Div.j div2;
        DivPager divPagerC;
        List<Div> list;
        Div.d div3;
        DivGallery divGalleryC;
        List<Div> list2;
        int i10 = 0;
        if (view instanceof DivRecyclerView) {
            DivRecyclerView divRecyclerView = (DivRecyclerView) view;
            if (divRecyclerView.getDiv() == div) {
                RecyclerView.Adapter adapter2 = divRecyclerView.getAdapter();
                DivGalleryAdapter divGalleryAdapter = adapter2 instanceof DivGalleryAdapter ? (DivGalleryAdapter) adapter2 : null;
                if (divGalleryAdapter != null && (div3 = divRecyclerView.getDiv()) != null && (divGalleryC = div3.c()) != null && (list2 = divGalleryC.f55426u) != null) {
                    for (Object obj : list2) {
                        int i11 = i10 + 1;
                        if (i10 < 0) {
                            w.w();
                        }
                        if (p.f(((Div) obj).b().getId(), str)) {
                            divGalleryAdapter.notifyItemChanged(i10);
                            return view;
                        }
                        i10 = i11;
                    }
                }
                return view;
            }
        } else if (view instanceof DivPagerView) {
            DivPagerView divPagerView = (DivPagerView) view;
            if (divPagerView.getDiv() == div) {
                View childAt = divPagerView.getViewPager().getChildAt(0);
                RecyclerView recyclerView = childAt instanceof RecyclerView ? (RecyclerView) childAt : null;
                if (recyclerView != null && (adapter = recyclerView.getAdapter()) != null && (div2 = divPagerView.getDiv()) != null && (divPagerC = div2.c()) != null && (list = divPagerC.f56405t) != null) {
                    for (Object obj2 : list) {
                        int i12 = i10 + 1;
                        if (i10 < 0) {
                            w.w();
                        }
                        if (p.f(((Div) obj2).b().getId(), str)) {
                            adapter.notifyItemChanged(i10);
                            return view;
                        }
                        i10 = i12;
                    }
                }
                return view;
            }
        }
        if (view instanceof ViewGroup) {
            Iterator<View> it = ViewGroupKt.getChildren((ViewGroup) view).iterator();
            while (it.hasNext()) {
                View viewFindPatchedRecyclerViewAndNotifyChange = findPatchedRecyclerViewAndNotifyChange(it.next(), div, str);
                if (viewFindPatchedRecyclerViewAndNotifyChange != null) {
                    return viewFindPatchedRecyclerViewAndNotifyChange;
                }
            }
        }
        return null;
    }

    private final Div getPatchedDivCollection(Div div, List<? extends Div> list, Iterator<? extends Div> it, ExpressionResolver expressionResolver, l<? super List<? extends Div>, ? extends Div> lVar, a<? extends Div> aVar) {
        if (!it.hasNext()) {
            return aVar.invoke();
        }
        int iIndexOf = list.indexOf(it.next());
        if (iIndexOf != -1) {
            List listJ1 = f0.j1(list);
            listJ1.set(iIndexOf, getPatchedTreeByPath((Div) listJ1.get(iIndexOf), it, expressionResolver));
            return lVar.invoke(listJ1);
        }
        KAssert kAssert = KAssert.INSTANCE;
        if (Assert.isEnabled()) {
            Assert.fail("Unable to find the next child to patch by following a precalculated path");
        }
        return div;
    }

    private final Div getPatchedTreeByPath(Div div, Iterator<? extends Div> it, final ExpressionResolver expressionResolver) {
        Div nVar;
        final e2 e2VarB = div.b();
        if (e2VarB instanceof DivContainer) {
            return getPatchedDivCollection(div, DivCollectionExtensionsKt.getNonNullItems((DivContainer) e2VarB), it, expressionResolver, new l<List<? extends Div>, Div>() { // from class: com.yandex.div.core.downloader.DivPatchApply.getPatchedTreeByPath.1
                {
                    super(1);
                }

                @Override // sn.l
                @NotNull
                public final Div invoke(@NotNull List<? extends Div> list) {
                    return new Div.b(DivContainer.z((DivContainer) e2VarB, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, list, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -134217729, 4194303, null));
                }
            }, new a<Div>() { // from class: com.yandex.div.core.downloader.DivPatchApply.getPatchedTreeByPath.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // sn.a
                @NotNull
                public final Div invoke() {
                    return new DivPatchApply(DivPatchApply.this.patch).applyPatch((DivContainer) e2VarB, expressionResolver);
                }
            });
        }
        if (e2VarB instanceof DivGrid) {
            return getPatchedDivCollection(div, DivCollectionExtensionsKt.getNonNullItems((DivGrid) e2VarB), it, expressionResolver, new l<List<? extends Div>, Div>() { // from class: com.yandex.div.core.downloader.DivPatchApply.getPatchedTreeByPath.3
                {
                    super(1);
                }

                @Override // sn.l
                @NotNull
                public final Div invoke(@NotNull List<? extends Div> list) {
                    return new Div.f(DivGrid.z((DivGrid) e2VarB, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, list, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -16777217, 16383, null));
                }
            }, new a<Div>() { // from class: com.yandex.div.core.downloader.DivPatchApply.getPatchedTreeByPath.4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // sn.a
                @NotNull
                public final Div invoke() {
                    return new DivPatchApply(DivPatchApply.this.patch).applyPatch((DivGrid) e2VarB, expressionResolver);
                }
            });
        }
        if (e2VarB instanceof DivGallery) {
            return getPatchedDivCollection(div, DivCollectionExtensionsKt.getNonNullItems((DivGallery) e2VarB), it, expressionResolver, new l<List<? extends Div>, Div>() { // from class: com.yandex.div.core.downloader.DivPatchApply.getPatchedTreeByPath.5
                {
                    super(1);
                }

                @Override // sn.l
                @NotNull
                public final Div invoke(@NotNull List<? extends Div> list) {
                    return new Div.d(DivGallery.z((DivGallery) e2VarB, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, list, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1048577, 2047, null));
                }
            }, new a<Div>() { // from class: com.yandex.div.core.downloader.DivPatchApply.getPatchedTreeByPath.6
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // sn.a
                @NotNull
                public final Div invoke() {
                    return new DivPatchApply(DivPatchApply.this.patch).applyPatch((DivGallery) e2VarB, expressionResolver);
                }
            });
        }
        if (e2VarB instanceof DivPager) {
            return getPatchedDivCollection(div, DivCollectionExtensionsKt.getNonNullItems((DivPager) e2VarB), it, expressionResolver, new l<List<? extends Div>, Div>() { // from class: com.yandex.div.core.downloader.DivPatchApply.getPatchedTreeByPath.7
                {
                    super(1);
                }

                @Override // sn.l
                @NotNull
                public final Div invoke(@NotNull List<? extends Div> list) {
                    return new Div.j(DivPager.z((DivPager) e2VarB, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, list, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -524289, 2047, null));
                }
            }, new a<Div>() { // from class: com.yandex.div.core.downloader.DivPatchApply.getPatchedTreeByPath.8
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // sn.a
                @NotNull
                public final Div invoke() {
                    return new DivPatchApply(DivPatchApply.this.patch).applyPatch((DivPager) e2VarB, expressionResolver);
                }
            });
        }
        if (e2VarB instanceof DivTabs) {
            if (!it.hasNext()) {
                return new DivPatchApply(this.patch).applyPatch((DivTabs) e2VarB, expressionResolver);
            }
            DivTabs divTabs = (DivTabs) e2VarB;
            List listJ1 = f0.j1(divTabs.f57409q);
            ArrayList arrayList = new ArrayList(x.x(listJ1, 10));
            Iterator it2 = listJ1.iterator();
            while (it2.hasNext()) {
                arrayList.add(((DivTabs.Item) it2.next()).f57421a);
            }
            int iIndexOf = arrayList.indexOf(it.next());
            if (iIndexOf == -1) {
                KAssert kAssert = KAssert.INSTANCE;
                if (Assert.isEnabled()) {
                    Assert.fail("Unable to find the next child to patch by following a precalculated path");
                }
                return div;
            }
            DivTabs.Item item = (DivTabs.Item) listJ1.get(iIndexOf);
            listJ1.set(iIndexOf, new DivTabs.Item(getPatchedTreeByPath(item.f57421a, it, expressionResolver), item.f57422b, item.f57423c));
            nVar = new Div.p(DivTabs.z(divTabs, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, listJ1, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -65537, 2047, null));
        } else {
            if (!(e2VarB instanceof DivState)) {
                return div;
            }
            if (!it.hasNext()) {
                return new DivPatchApply(this.patch).applyPatch((DivState) e2VarB, expressionResolver);
            }
            DivState divState = (DivState) e2VarB;
            List listJ12 = f0.j1(divState.I);
            ArrayList arrayList2 = new ArrayList(x.x(listJ12, 10));
            Iterator it3 = listJ12.iterator();
            while (it3.hasNext()) {
                arrayList2.add(((DivState.State) it3.next()).f57194c);
            }
            int iIndexOf2 = arrayList2.indexOf(it.next());
            if (iIndexOf2 == -1) {
                KAssert kAssert2 = KAssert.INSTANCE;
                if (Assert.isEnabled()) {
                    Assert.fail("Unable to find the next child to patch by following a precalculated path");
                }
                return div;
            }
            DivState.State state = (DivState.State) listJ12.get(iIndexOf2);
            Div div2 = state.f57194c;
            if (div2 == null) {
                return div;
            }
            listJ12.set(iIndexOf2, new DivState.State(state.f57192a, state.f57193b, getPatchedTreeByPath(div2, it, expressionResolver), state.f57195d, state.f57196e));
            nVar = new Div.n(DivState.z(divState, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, listJ12, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 65531, null));
        }
        return nVar;
    }

    private final List<Div> pathToChildWithId(Div div, String str, ExpressionResolver expressionResolver, List<Div> list) {
        e2 e2VarB;
        list.add(div);
        e2 e2VarB2 = div.b();
        if (e2VarB2 instanceof DivContainer) {
            return pathToChildWithId(DivCollectionExtensionsKt.getNonNullItems((DivContainer) e2VarB2), str, expressionResolver, list);
        }
        if (e2VarB2 instanceof DivGrid) {
            return pathToChildWithId(DivCollectionExtensionsKt.getNonNullItems((DivGrid) e2VarB2), str, expressionResolver, list);
        }
        if (e2VarB2 instanceof DivGallery) {
            return pathToChildWithId(DivCollectionExtensionsKt.getNonNullItems((DivGallery) e2VarB2), str, expressionResolver, list);
        }
        if (e2VarB2 instanceof DivPager) {
            return pathToChildWithId(DivCollectionExtensionsKt.getNonNullItems((DivPager) e2VarB2), str, expressionResolver, list);
        }
        boolean z10 = false;
        if (e2VarB2 instanceof DivTabs) {
            DivTabs divTabs = (DivTabs) e2VarB2;
            List<DivTabs.Item> list2 = divTabs.f57409q;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator<T> it = list2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (p.f(((DivTabs.Item) it.next()).f57421a.b().getId(), str)) {
                        z10 = true;
                        break;
                    }
                }
            }
            if (z10) {
                return list;
            }
            Iterator<T> it2 = divTabs.f57409q.iterator();
            while (it2.hasNext()) {
                List<Div> listPathToChildWithId = pathToChildWithId(((DivTabs.Item) it2.next()).f57421a, str, expressionResolver, list);
                if (!listPathToChildWithId.isEmpty()) {
                    return listPathToChildWithId;
                }
                list.remove(w.o(list));
            }
            return w.m();
        }
        if (!(e2VarB2 instanceof DivState)) {
            return w.m();
        }
        DivState divState = (DivState) e2VarB2;
        List<DivState.State> list3 = divState.I;
        if (!(list3 instanceof Collection) || !list3.isEmpty()) {
            Iterator<T> it3 = list3.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                Div div2 = ((DivState.State) it3.next()).f57194c;
                if (p.f((div2 == null || (e2VarB = div2.b()) == null) ? null : e2VarB.getId(), str)) {
                    z10 = true;
                    break;
                }
            }
        }
        if (z10) {
            return list;
        }
        List<DivState.State> list4 = divState.I;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it4 = list4.iterator();
        while (it4.hasNext()) {
            Div div3 = ((DivState.State) it4.next()).f57194c;
            if (div3 != null) {
                arrayList.add(div3);
            }
        }
        Iterator it5 = arrayList.iterator();
        while (it5.hasNext()) {
            List<Div> listPathToChildWithId2 = pathToChildWithId((Div) it5.next(), str, expressionResolver, list);
            if (!listPathToChildWithId2.isEmpty()) {
                return listPathToChildWithId2;
            }
            list.remove(w.o(list));
        }
        return w.m();
    }

    private final List<Div> pathToChildWithId(List<? extends Div> list, String str, ExpressionResolver expressionResolver, List<Div> list2) {
        boolean z10 = false;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (p.f(((Div) it.next()).b().getId(), str)) {
                    z10 = true;
                    break;
                }
            }
        }
        if (z10) {
            return list2;
        }
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            List<Div> listPathToChildWithId = pathToChildWithId((Div) it2.next(), str, expressionResolver, list2);
            if (!listPathToChildWithId.isEmpty()) {
                return listPathToChildWithId;
            }
            list2.remove(w.o(list2));
        }
        return w.m();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ List pathToChildWithId$default(DivPatchApply divPatchApply, Div div, String str, ExpressionResolver expressionResolver, List list, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            list = new ArrayList();
        }
        return divPatchApply.pathToChildWithId(div, str, expressionResolver, (List<Div>) list);
    }

    private final DivState.State tryApplyPatchToDiv(DivState.State state, ExpressionResolver expressionResolver) {
        Div div = state.f57194c;
        List<Div> listApplyPatch = div != null ? applyPatch(div, expressionResolver) : null;
        return listApplyPatch != null && listApplyPatch.size() == 1 ? new DivState.State(state.f57192a, state.f57193b, listApplyPatch.get(0), state.f57195d, state.f57196e) : state;
    }

    @NotNull
    public final List<Div> applyPatchForDiv(@NotNull Div div, @NotNull ExpressionResolver expressionResolver) {
        return applyPatch(div, expressionResolver);
    }

    @Nullable
    public final Div patchDivChild(@NotNull View view, @NotNull Div div, @NotNull String str, @NotNull ExpressionResolver expressionResolver) {
        List listPathToChildWithId$default = pathToChildWithId$default(this, div, str, expressionResolver, null, 8, null);
        Iterator<? extends Div> it = listPathToChildWithId$default.iterator();
        Object obj = null;
        if (listPathToChildWithId$default.isEmpty()) {
            return null;
        }
        it.next();
        ListIterator listIterator = listPathToChildWithId$default.listIterator(listPathToChildWithId$default.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                break;
            }
            Object objPrevious = listIterator.previous();
            Div div2 = (Div) objPrevious;
            if ((div2 instanceof Div.d) || (div2 instanceof Div.j)) {
                obj = objPrevious;
                break;
            }
        }
        Div div3 = (Div) obj;
        if (div3 != null) {
            findPatchedRecyclerViewAndNotifyChange(view, div3, str);
        }
        return getPatchedTreeByPath(div, it, expressionResolver);
    }
}
