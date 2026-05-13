package com.yandex.div.internal.core;

import androidx.core.view.accessibility.AccessibilityEventCompat;
import bn.h;
import cn.w;
import cn.x;
import com.yandex.div.core.expression.ExpressionResolverImpl;
import com.yandex.div.core.expression.local.UtilsKt;
import com.yandex.div.core.expression.variables.ConstantsProvider;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.Div;
import com.yandex.div2.DivCollectionItemBuilder;
import com.yandex.div2.DivContainer;
import com.yandex.div2.DivCustom;
import com.yandex.div2.DivGallery;
import com.yandex.div2.DivGifImage;
import com.yandex.div2.DivGrid;
import com.yandex.div2.DivImage;
import com.yandex.div2.DivIndicator;
import com.yandex.div2.DivInput;
import com.yandex.div2.DivPager;
import com.yandex.div2.DivSelect;
import com.yandex.div2.DivSeparator;
import com.yandex.div2.DivSlider;
import com.yandex.div2.DivState;
import com.yandex.div2.DivSwitch;
import com.yandex.div2.DivTabs;
import com.yandex.div2.DivText;
import com.yandex.div2.DivVideo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import sn.a;

/* JADX INFO: compiled from: DivCollectionExtensions.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class DivCollectionExtensionsKt {
    @NotNull
    public static final List<DivItemBuilderResult> build(@NotNull DivCollectionItemBuilder divCollectionItemBuilder, @NotNull ExpressionResolver expressionResolver) {
        JSONArray jSONArrayEvaluate = divCollectionItemBuilder.f54767a.evaluate(expressionResolver);
        int length = jSONArrayEvaluate.length();
        ArrayList arrayList = new ArrayList(length);
        for (int i10 = 0; i10 < length; i10++) {
            DivItemBuilderResult divItemBuilderResultBuildItem = buildItem(divCollectionItemBuilder, jSONArrayEvaluate.get(i10), i10, expressionResolver);
            if (divItemBuilderResultBuildItem != null) {
                arrayList.add(divItemBuilderResultBuildItem);
            }
        }
        return arrayList;
    }

    private static final DivItemBuilderResult buildItem(DivCollectionItemBuilder divCollectionItemBuilder, Object obj, int i10, ExpressionResolver expressionResolver) {
        Object next;
        ExpressionResolver itemResolver = getItemResolver(divCollectionItemBuilder, obj, i10, expressionResolver);
        if (itemResolver == null) {
            return null;
        }
        Iterator<T> it = divCollectionItemBuilder.f54769c.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((DivCollectionItemBuilder.Prototype) next).f54776c.evaluate(itemResolver).booleanValue()) {
                break;
            }
        }
        DivCollectionItemBuilder.Prototype prototype = (DivCollectionItemBuilder.Prototype) next;
        if (prototype == null) {
            return null;
        }
        Div div = prototype.f54774a;
        Expression<String> expression = prototype.f54775b;
        return toItemBuilderResult(copy(div, expression != null ? expression.evaluate(itemResolver) : null), itemResolver);
    }

    @NotNull
    public static final List<DivItemBuilderResult> buildItems(@NotNull DivContainer divContainer, @NotNull ExpressionResolver expressionResolver) {
        return buildItems(divContainer.B, divContainer.f54881z, expressionResolver);
    }

    @NotNull
    public static final List<DivItemBuilderResult> buildItems(@NotNull DivGallery divGallery, @NotNull ExpressionResolver expressionResolver) {
        return buildItems(divGallery.f55426u, divGallery.f55424s, expressionResolver);
    }

    @NotNull
    public static final List<DivItemBuilderResult> buildItems(@NotNull DivPager divPager, @NotNull ExpressionResolver expressionResolver) {
        return buildItems(divPager.f56405t, divPager.f56403r, expressionResolver);
    }

    private static final List<DivItemBuilderResult> buildItems(List<? extends Div> list, DivCollectionItemBuilder divCollectionItemBuilder, ExpressionResolver expressionResolver) {
        List<DivItemBuilderResult> listBuild;
        return (divCollectionItemBuilder == null || (listBuild = build(divCollectionItemBuilder, expressionResolver)) == null) ? list != null ? toDivItemBuilderResult(list, expressionResolver) : w.m() : listBuild;
    }

    private static final Div copy(Div div, String str) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        if (div instanceof Div.g) {
            return new Div.g(DivImage.z(((Div.g) div).c(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -67108865, 8388607, null));
        }
        if (div instanceof Div.e) {
            return new Div.e(DivGifImage.z(((Div.e) div).c(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -16777217, 262143, null));
        }
        if (div instanceof Div.q) {
            return new Div.q(DivText.z(((Div.q) div).c(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1073741825, -1, 31, null));
        }
        if (div instanceof Div.l) {
            return new Div.l(DivSeparator.z(((Div.l) div).c(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2097153, 2047, null));
        }
        if (div instanceof Div.b) {
            Div.b bVar = (Div.b) div;
            DivContainer divContainerC = bVar.c();
            List<Div> list = bVar.c().B;
            if (list != null) {
                ArrayList arrayList5 = new ArrayList(x.x(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList5.add(copy$default((Div) it.next(), null, 1, null));
                }
                arrayList4 = arrayList5;
            } else {
                arrayList4 = null;
            }
            return new Div.b(DivContainer.z(divContainerC, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, str, null, null, arrayList4, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -150994945, 4194303, null));
        }
        if (div instanceof Div.f) {
            Div.f fVar = (Div.f) div;
            DivGrid divGridC = fVar.c();
            List<Div> list2 = fVar.c().f55625y;
            if (list2 != null) {
                ArrayList arrayList6 = new ArrayList(x.x(list2, 10));
                Iterator<T> it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList6.add(copy$default((Div) it2.next(), null, 1, null));
                }
                arrayList3 = arrayList6;
            } else {
                arrayList3 = null;
            }
            return new Div.f(DivGrid.z(divGridC, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, str, arrayList3, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -25165825, 16383, null));
        }
        if (div instanceof Div.d) {
            Div.d dVar = (Div.d) div;
            DivGallery divGalleryC = dVar.c();
            List<Div> list3 = dVar.c().f55426u;
            if (list3 != null) {
                ArrayList arrayList7 = new ArrayList(x.x(list3, 10));
                Iterator<T> it3 = list3.iterator();
                while (it3.hasNext()) {
                    arrayList7.add(copy$default((Div) it3.next(), null, 1, null));
                }
                arrayList2 = arrayList7;
            } else {
                arrayList2 = null;
            }
            return new Div.d(DivGallery.z(divGalleryC, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, str, null, null, arrayList2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1179649, 2047, null));
        }
        if (div instanceof Div.j) {
            Div.j jVar = (Div.j) div;
            DivPager divPagerC = jVar.c();
            List<Div> list4 = jVar.c().f56405t;
            if (list4 != null) {
                ArrayList arrayList8 = new ArrayList(x.x(list4, 10));
                Iterator<T> it4 = list4.iterator();
                while (it4.hasNext()) {
                    arrayList8.add(copy$default((Div) it4.next(), null, 1, null));
                }
                arrayList = arrayList8;
            } else {
                arrayList = null;
            }
            return new Div.j(DivPager.z(divPagerC, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, str, null, null, null, arrayList, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -557057, 2047, null));
        }
        if (div instanceof Div.p) {
            Div.p pVar = (Div.p) div;
            DivTabs divTabsC = pVar.c();
            List<DivTabs.Item> list5 = pVar.c().f57409q;
            ArrayList arrayList9 = new ArrayList(x.x(list5, 10));
            for (DivTabs.Item item : list5) {
                arrayList9.add(DivTabs.Item.b(item, copy$default(item.f57421a, null, 1, null), null, null, 6, null));
            }
            return new Div.p(DivTabs.z(divTabsC, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, str, arrayList9, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -98305, 2047, null));
        }
        if (div instanceof Div.n) {
            Div.n nVar = (Div.n) div;
            DivState divStateC = nVar.c();
            List<DivState.State> list6 = nVar.c().I;
            ArrayList arrayList10 = new ArrayList(x.x(list6, 10));
            for (DivState.State state : list6) {
                Div div2 = state.f57194c;
                arrayList10.add(DivState.State.b(state, null, null, div2 != null ? copy$default(div2, null, 1, null) : null, null, null, 27, null));
            }
            return new Div.n(DivState.z(divStateC, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, str, null, null, null, null, null, null, null, str, null, null, null, null, null, null, null, null, null, null, arrayList10, null, null, null, null, null, null, null, null, null, null, null, null, null, -8421377, 65531, null));
        }
        if (div instanceof Div.c) {
            DivCustom divCustomC = ((Div.c) div).c();
            return new Div.c(divCustomC.y(((-32769) & 1) != 0 ? divCustomC.o() : null, ((-32769) & 2) != 0 ? divCustomC.g() : null, ((-32769) & 4) != 0 ? divCustomC.m() : null, ((-32769) & 8) != 0 ? divCustomC.getAlpha() : null, ((-32769) & 16) != 0 ? divCustomC.w() : null, ((-32769) & 32) != 0 ? divCustomC.getBackground() : null, ((-32769) & 64) != 0 ? divCustomC.x() : null, ((-32769) & 128) != 0 ? divCustomC.b() : null, ((-32769) & 256) != 0 ? divCustomC.f55018i : null, ((-32769) & 512) != 0 ? divCustomC.f55019j : null, ((-32769) & 1024) != 0 ? divCustomC.k() : null, ((-32769) & 2048) != 0 ? divCustomC.getExtensions() : null, ((-32769) & 4096) != 0 ? divCustomC.n() : null, ((-32769) & 8192) != 0 ? divCustomC.u() : null, ((-32769) & 16384) != 0 ? divCustomC.getHeight() : null, ((-32769) & 32768) != 0 ? divCustomC.getId() : str, ((-32769) & 65536) != 0 ? divCustomC.f55026q : null, ((-32769) & 131072) != 0 ? divCustomC.r() : null, ((-32769) & 262144) != 0 ? divCustomC.d() : null, ((-32769) & 524288) != 0 ? divCustomC.p() : null, ((-32769) & 1048576) != 0 ? divCustomC.f() : null, ((-32769) & 2097152) != 0 ? divCustomC.e() : null, ((-32769) & 4194304) != 0 ? divCustomC.q() : null, ((-32769) & 8388608) != 0 ? divCustomC.h() : null, ((-32769) & 16777216) != 0 ? divCustomC.getTransform() : null, ((-32769) & 33554432) != 0 ? divCustomC.j() : null, ((-32769) & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? divCustomC.v() : null, ((-32769) & 134217728) != 0 ? divCustomC.i() : null, ((-32769) & 268435456) != 0 ? divCustomC.l() : null, ((-32769) & 536870912) != 0 ? divCustomC.s() : null, ((-32769) & 1073741824) != 0 ? divCustomC.c() : null, ((-32769) & Integer.MIN_VALUE) != 0 ? divCustomC.getVisibility() : null, (7 & 1) != 0 ? divCustomC.t() : null, (7 & 2) != 0 ? divCustomC.a() : null, (7 & 4) != 0 ? divCustomC.getWidth() : null));
        }
        if (div instanceof Div.h) {
            return new Div.h(DivIndicator.z(((Div.h) div).c(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -131073, 4095, null));
        }
        if (div instanceof Div.m) {
            return new Div.m(DivSlider.z(((Div.m) div).c(), null, null, null, null, null, null, null, null, null, null, null, null, null, str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8193, 32767, null));
        }
        if (div instanceof Div.i) {
            return new Div.i(DivInput.z(((Div.i) div).c(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -67108865, 134217727, null));
        }
        if (div instanceof Div.k) {
            return new Div.k(DivSelect.z(((Div.k) div).c(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2097153, 8191, null));
        }
        if (div instanceof Div.r) {
            return new Div.r(DivVideo.z(((Div.r) div).c(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -524289, 32767, null));
        }
        if (!(div instanceof Div.o)) {
            throw new NoWhenBranchMatchedException();
        }
        DivSwitch divSwitchC = ((Div.o) div).c();
        return new Div.o(divSwitchC.y(((-8193) & 1) != 0 ? divSwitchC.o() : null, ((-8193) & 2) != 0 ? divSwitchC.g() : null, ((-8193) & 4) != 0 ? divSwitchC.m() : null, ((-8193) & 8) != 0 ? divSwitchC.getAlpha() : null, ((-8193) & 16) != 0 ? divSwitchC.w() : null, ((-8193) & 32) != 0 ? divSwitchC.getBackground() : null, ((-8193) & 64) != 0 ? divSwitchC.x() : null, ((-8193) & 128) != 0 ? divSwitchC.b() : null, ((-8193) & 256) != 0 ? divSwitchC.k() : null, ((-8193) & 512) != 0 ? divSwitchC.getExtensions() : null, ((-8193) & 1024) != 0 ? divSwitchC.n() : null, ((-8193) & 2048) != 0 ? divSwitchC.u() : null, ((-8193) & 4096) != 0 ? divSwitchC.getHeight() : null, ((-8193) & 8192) != 0 ? divSwitchC.getId() : str, ((-8193) & 16384) != 0 ? divSwitchC.f57332o : null, ((-8193) & 32768) != 0 ? divSwitchC.f57333p : null, ((-8193) & 65536) != 0 ? divSwitchC.r() : null, ((-8193) & 131072) != 0 ? divSwitchC.d() : null, ((-8193) & 262144) != 0 ? divSwitchC.f57336s : null, ((-8193) & 524288) != 0 ? divSwitchC.p() : null, ((-8193) & 1048576) != 0 ? divSwitchC.f() : null, ((-8193) & 2097152) != 0 ? divSwitchC.e() : null, ((-8193) & 4194304) != 0 ? divSwitchC.q() : null, ((-8193) & 8388608) != 0 ? divSwitchC.h() : null, ((-8193) & 16777216) != 0 ? divSwitchC.getTransform() : null, ((-8193) & 33554432) != 0 ? divSwitchC.j() : null, ((-8193) & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? divSwitchC.v() : null, ((-8193) & 134217728) != 0 ? divSwitchC.i() : null, ((-8193) & 268435456) != 0 ? divSwitchC.l() : null, ((-8193) & 536870912) != 0 ? divSwitchC.s() : null, ((-8193) & 1073741824) != 0 ? divSwitchC.c() : null, ((-8193) & Integer.MIN_VALUE) != 0 ? divSwitchC.getVisibility() : null, (7 & 1) != 0 ? divSwitchC.t() : null, (7 & 2) != 0 ? divSwitchC.a() : null, (7 & 4) != 0 ? divSwitchC.getWidth() : null));
    }

    public static /* synthetic */ Div copy$default(Div div, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = div.b().getId();
        }
        return copy(div, str);
    }

    @NotNull
    public static final ExpressionResolver getItemResolver(@NotNull DivCollectionItemBuilder divCollectionItemBuilder, @NotNull ExpressionResolver expressionResolver) throws JSONException {
        ExpressionResolver itemResolver;
        JSONArray jSONArrayEvaluate = divCollectionItemBuilder.f54767a.evaluate(expressionResolver);
        int length = jSONArrayEvaluate.length();
        for (int i10 = 0; i10 < length; i10++) {
            Object obj = jSONArrayEvaluate.get(i10);
            if ((obj instanceof Object) && (itemResolver = getItemResolver(divCollectionItemBuilder, obj, i10, expressionResolver)) != null) {
                return itemResolver;
            }
        }
        return expressionResolver;
    }

    private static final ExpressionResolver getItemResolver(final DivCollectionItemBuilder divCollectionItemBuilder, Object obj, final int i10, ExpressionResolver expressionResolver) {
        final ExpressionResolverImpl asImpl = UtilsKt.getAsImpl(expressionResolver);
        if (asImpl == null) {
            return expressionResolver;
        }
        final JSONObject jSONObjectValidateItemBuilderDataElement = asImpl.validateItemBuilderDataElement(obj, i10);
        if (jSONObjectValidateItemBuilderDataElement == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(obj);
        sb2.append(':');
        sb2.append(i10);
        final String string = sb2.toString();
        return asImpl.getRuntimeStore().getOrPutItemBuilderResolver(asImpl.getPath() + '/' + string, expressionResolver, new a<ExpressionResolver>() { // from class: com.yandex.div.internal.core.DivCollectionExtensionsKt.getItemResolver.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.a
            @NotNull
            public final ExpressionResolver invoke() {
                return asImpl.withConstants$div_release(string, new ConstantsProvider(kotlin.collections.a.m(h.a(divCollectionItemBuilder.f54768b, jSONObjectValidateItemBuilderDataElement), h.a("index", Long.valueOf(i10)))));
            }
        });
    }

    @NotNull
    public static final List<Div> getNonNullItems(@NotNull DivContainer divContainer) {
        List<Div> list = divContainer.B;
        return list == null ? w.m() : list;
    }

    @NotNull
    public static final List<Div> getNonNullItems(@NotNull DivCustom divCustom) {
        List<Div> list = divCustom.f55026q;
        return list == null ? w.m() : list;
    }

    @NotNull
    public static final List<Div> getNonNullItems(@NotNull DivGallery divGallery) {
        List<Div> list = divGallery.f55426u;
        return list == null ? w.m() : list;
    }

    @NotNull
    public static final List<Div> getNonNullItems(@NotNull DivGrid divGrid) {
        List<Div> list = divGrid.f55625y;
        return list == null ? w.m() : list;
    }

    @NotNull
    public static final List<Div> getNonNullItems(@NotNull DivPager divPager) {
        List<Div> list = divPager.f56405t;
        return list == null ? w.m() : list;
    }

    @NotNull
    public static final List<DivItemBuilderResult> itemsToDivItemBuilderResult(@NotNull DivGrid divGrid, @NotNull ExpressionResolver expressionResolver) {
        return toDivItemBuilderResult(getNonNullItems(divGrid), expressionResolver);
    }

    @NotNull
    public static final List<DivItemBuilderResult> itemsToDivItemBuilderResult(@NotNull DivTabs divTabs, @NotNull ExpressionResolver expressionResolver) {
        List<DivTabs.Item> list = divTabs.f57409q;
        ArrayList arrayList = new ArrayList(x.x(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(toItemBuilderResult(((DivTabs.Item) it.next()).f57421a, expressionResolver));
        }
        return arrayList;
    }

    @NotNull
    public static final List<DivItemBuilderResult> statesToDivItemBuilderResult(@NotNull DivState divState, @NotNull ExpressionResolver expressionResolver) {
        List<DivState.State> list = divState.I;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Div div = ((DivState.State) it.next()).f57194c;
            DivItemBuilderResult itemBuilderResult = div != null ? toItemBuilderResult(div, expressionResolver) : null;
            if (itemBuilderResult != null) {
                arrayList.add(itemBuilderResult);
            }
        }
        return arrayList;
    }

    @NotNull
    public static final List<DivItemBuilderResult> toDivItemBuilderResult(@NotNull List<? extends Div> list, @NotNull ExpressionResolver expressionResolver) {
        ArrayList arrayList = new ArrayList(x.x(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(toItemBuilderResult((Div) it.next(), expressionResolver));
        }
        return arrayList;
    }

    @NotNull
    public static final DivItemBuilderResult toItemBuilderResult(@NotNull Div div, @NotNull ExpressionResolver expressionResolver) {
        return new DivItemBuilderResult(div, expressionResolver);
    }
}
