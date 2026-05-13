package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast;

import bo.d0;
import cn.f0;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.services.g0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.h;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.b0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.k;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.y;
import io.bidmachine.protobuf.EventTypeExtended;
import io.ktor.client.HttpClient;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.l0;

/* JADX INFO: loaded from: classes8.dex */
public final class e implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.h {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final c f49357i = new c(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final w f49358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.o f49359b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.n f49360c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final y f49361d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final g0 f49362e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final HttpClient f49363f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.w f49364g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final String f49365h;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.p> f49366a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final List<String> f49367b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final List<List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.j>> f49368c;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@NotNull List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.p> list, @NotNull List<String> list2, @NotNull List<? extends List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.j>> list3) {
            tn.p.k(list, "impressions");
            tn.p.k(list2, "errorUrls");
            tn.p.k(list3, "creativesPerWrapper");
            this.f49366a = list;
            this.f49367b = list2;
            this.f49368c = list3;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ a a(a aVar, List list, List list2, List list3, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                list = aVar.f49366a;
            }
            if ((i10 & 2) != 0) {
                list2 = aVar.f49367b;
            }
            if ((i10 & 4) != 0) {
                list3 = aVar.f49368c;
            }
            return aVar.b(list, list2, list3);
        }

        @NotNull
        public final a b(@NotNull List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.p> list, @NotNull List<String> list2, @NotNull List<? extends List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.j>> list3) {
            tn.p.k(list, "impressions");
            tn.p.k(list2, "errorUrls");
            tn.p.k(list3, "creativesPerWrapper");
            return new a(list, list2, list3);
        }

        @NotNull
        public final List<List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.j>> c() {
            return this.f49368c;
        }

        @NotNull
        public final List<String> d() {
            return this.f49367b;
        }

        @NotNull
        public final List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.p> e() {
            return this.f49366a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return tn.p.f(this.f49366a, aVar.f49366a) && tn.p.f(this.f49367b, aVar.f49367b) && tn.p.f(this.f49368c, aVar.f49368c);
        }

        public int hashCode() {
            return (((this.f49366a.hashCode() * 31) + this.f49367b.hashCode()) * 31) + this.f49368c.hashCode();
        }

        @NotNull
        public String toString() {
            return "AggregatedWrapperChainAdData(impressions=" + this.f49366a + ", errorUrls=" + this.f49367b + ", creativesPerWrapper=" + this.f49368c + ')';
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.y> f49369a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.a f49370b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final List<List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.n>> f49371c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final List<List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.g>> f49372d;

        /* JADX WARN: Multi-variable type inference failed */
        public b(@NotNull List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.y> list, @Nullable com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.a aVar, @NotNull List<? extends List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.n>> list2, @NotNull List<? extends List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.g>> list3) {
            tn.p.k(list, "linearTrackingList");
            tn.p.k(list2, "iconsPerWrapper");
            tn.p.k(list3, "companionsPerWrapper");
            this.f49369a = list;
            this.f49370b = aVar;
            this.f49371c = list2;
            this.f49372d = list3;
        }

        @NotNull
        public final List<List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.g>> a() {
            return this.f49372d;
        }

        @NotNull
        public final List<List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.n>> b() {
            return this.f49371c;
        }

        @NotNull
        public final List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.y> c() {
            return this.f49369a;
        }

        @Nullable
        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.a d() {
            return this.f49370b;
        }
    }

    public static final class c {
        public c() {
        }

        public /* synthetic */ c(tn.i iVar) {
            this();
        }

        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.h b(List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.y> list, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.a aVar) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : list) {
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.v vVarA = ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.y) obj).a();
                Object arrayList = linkedHashMap.get(vVarA);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(vVarA, arrayList);
                }
                ((List) arrayList).add(obj);
            }
            return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.h(e(aVar), i(linkedHashMap, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.v.f49944a), i(linkedHashMap, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.v.f49945b), i(linkedHashMap, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.v.f49946c), i(linkedHashMap, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.v.f49947d), i(linkedHashMap, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.v.f49948e), i(linkedHashMap, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.v.f49949f), i(linkedHashMap, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.v.f49950g), i(linkedHashMap, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.v.f49951h), i(linkedHashMap, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.v.f49952i), i(linkedHashMap, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.v.f49954k), i(linkedHashMap, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.v.f49953j), i(linkedHashMap, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.v.f49956m), i(linkedHashMap, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.v.f49955l), h(linkedHashMap));
        }

        public final List<String> e(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.a aVar) {
            List<b0> listB;
            if (aVar == null || (listB = aVar.b()) == null) {
                return cn.w.m();
            }
            ArrayList arrayList = new ArrayList(cn.x.x(listB, 10));
            Iterator<T> it = listB.iterator();
            while (it.hasNext()) {
                arrayList.add(((b0) it.next()).a());
            }
            return arrayList;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final <T> List<T> f(List<? extends T> list, T t10) {
            List<T> listG;
            return (t10 == null || (listG = e.f49357i.g(list, cn.v.e(t10))) == null) ? list == 0 ? cn.w.m() : list : listG;
        }

        public final <T> List<T> g(List<? extends T> list, List<? extends T> list2) {
            ArrayList arrayList = new ArrayList();
            if (list != null) {
                cn.b0.F(arrayList, list);
            }
            if (list2 != null) {
                cn.b0.F(arrayList, list2);
            }
            return arrayList;
        }

        public final List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.g> h(Map<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.v, ? extends List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.y>> map) {
            List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.y> list = map.get(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.v.f49957n);
            if (list == null) {
                return cn.w.m();
            }
            ArrayList arrayList = new ArrayList();
            for (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.y yVar : list) {
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.g gVar = yVar.b() == null ? null : new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.g(yVar.c(), yVar.b());
                if (gVar != null) {
                    arrayList.add(gVar);
                }
            }
            return arrayList;
        }

        public final List<String> i(Map<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.v, ? extends List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.y>> map, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.v vVar) {
            List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.y> list = map.get(vVar);
            if (list == null) {
                return cn.w.m();
            }
            ArrayList arrayList = new ArrayList(cn.x.x(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.y) it.next()).c());
            }
            return arrayList;
        }

        public final <T> Set<T> k(Set<? extends T> set, T t10) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            if (set != null) {
                cn.b0.F(linkedHashSet, set);
            }
            if (t10 != null) {
                linkedHashSet.add(t10);
            }
            return linkedHashSet;
        }

        public final boolean q(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.g gVar) {
            String strA = gVar.a();
            return !(strA == null || d0.u0(strA));
        }

        public final boolean r(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.j jVar) {
            String strA = jVar.a();
            return !(strA == null || d0.u0(strA));
        }

        public final boolean s(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.n nVar) {
            String strA = nVar.a();
            return !(strA == null || d0.u0(strA));
        }

        public final boolean t(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.s sVar) {
            String strA = sVar.a();
            return !(strA == null || d0.u0(strA));
        }

        public final boolean u(String str) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            tn.p.j(lowerCase, "toLowerCase(...)");
            return tn.p.f(lowerCase, "video/mp4") || tn.p.f(lowerCase, "video/3gpp") || tn.p.f(lowerCase, "video/webm");
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f49373a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final Set<String> f49374b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f49375c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final a f49376d;

        public d(int i10, @NotNull Set<String> set, boolean z10, @NotNull a aVar) {
            tn.p.k(set, "usedVastAdTagUrls");
            tn.p.k(aVar, "aggregatedWrapperChainData");
            this.f49373a = i10;
            this.f49374b = set;
            this.f49375c = z10;
            this.f49376d = aVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ d b(d dVar, int i10, Set set, boolean z10, a aVar, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = dVar.f49373a;
            }
            if ((i11 & 2) != 0) {
                set = dVar.f49374b;
            }
            if ((i11 & 4) != 0) {
                z10 = dVar.f49375c;
            }
            if ((i11 & 8) != 0) {
                aVar = dVar.f49376d;
            }
            return dVar.a(i10, set, z10, aVar);
        }

        @NotNull
        public final d a(int i10, @NotNull Set<String> set, boolean z10, @NotNull a aVar) {
            tn.p.k(set, "usedVastAdTagUrls");
            tn.p.k(aVar, "aggregatedWrapperChainData");
            return new d(i10, set, z10, aVar);
        }

        @NotNull
        public final a c() {
            return this.f49376d;
        }

        public final boolean d() {
            return this.f49375c;
        }

        @NotNull
        public final Set<String> e() {
            return this.f49374b;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f49373a == dVar.f49373a && tn.p.f(this.f49374b, dVar.f49374b) && this.f49375c == dVar.f49375c && tn.p.f(this.f49376d, dVar.f49376d);
        }

        public final int f() {
            return this.f49373a;
        }

        public int hashCode() {
            return (((((Integer.hashCode(this.f49373a) * 31) + this.f49374b.hashCode()) * 31) + Boolean.hashCode(this.f49375c)) * 31) + this.f49376d.hashCode();
        }

        @NotNull
        public String toString() {
            return "WrapperChainParams(wrapperDepth=" + this.f49373a + ", usedVastAdTagUrls=" + this.f49374b + ", followAdditionalWrappers=" + this.f49375c + ", aggregatedWrapperChainData=" + this.f49376d + ')';
        }
    }

    /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e$e, reason: collision with other inner class name */
    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastAdLoaderImpl", f = "VastAdLoader.kt", l = {152, 163}, m = "invoke")
    public static final class C0654e extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f49377a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f49378b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f49379c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f49380d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f49382f;

        public C0654e(hn.c<? super C0654e> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f49380d = obj;
            this.f49382f |= Integer.MIN_VALUE;
            return e.this.b(null, null, false, this);
        }
    }

    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastAdLoaderImpl$invoke$renderAdResult$1", f = "VastAdLoader.kt", l = {164}, m = "invokeSuspend")
    public static final class f extends SuspendLambda implements sn.p<l0, hn.c<? super com.moloco.sdk.internal.g0<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f49383a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.z f49385c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f49386d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f49387e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.z zVar, boolean z10, String str, hn.c<? super f> cVar) {
            super(2, cVar);
            this.f49385c = zVar;
            this.f49386d = z10;
            this.f49387e = str;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c<? super com.moloco.sdk.internal.g0<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k>> cVar) {
            return ((f) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
            return e.this.new f(this.f49385c, this.f49386d, this.f49387e, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objG = in.a.g();
            int i10 = this.f49383a;
            if (i10 == 0) {
                kotlin.c.b(obj);
                e eVar = e.this;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.z zVar = this.f49385c;
                double dX = eVar.x();
                com.moloco.sdk.common_adapter_internal.b bVarInvoke = e.this.f49364g.invoke();
                boolean z10 = this.f49386d;
                String str = this.f49387e;
                this.f49383a = 1;
                obj = eVar.v(zVar, null, dX, bVarInvoke, z10, str, this);
                if (obj == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
            }
            return obj;
        }
    }

    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastAdLoaderImpl", f = "VastAdLoader.kt", l = {EventTypeExtended.EVENT_TYPE_EXTENDED_CUSTOM_LOSS_VALUE, 356, 367}, m = "loadAndParseWrapperVastDocument")
    public static final class g extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f49388a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f49389b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f49390c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f49392e;

        public g(hn.c<? super g> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f49390c = obj;
            this.f49392e |= Integer.MIN_VALUE;
            return e.this.s(null, null, this);
        }
    }

    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastAdLoaderImpl", f = "VastAdLoader.kt", l = {418}, m = "tryLoadInLineRenderAd")
    public static final class h extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f49393a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f49394b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f49395c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f49396d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Object f49397e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Object f49398f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Object f49399g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Object f49400h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public Object f49401i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f49402j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Object f49403k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Object f49404l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public double f49405m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public boolean f49406n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public /* synthetic */ Object f49407o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f49409q;

        public h(hn.c<? super h> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f49407o = obj;
            this.f49409q |= Integer.MIN_VALUE;
            return e.this.t(null, null, 0.0d, null, false, null, this);
        }
    }

    public static final class i implements go.d<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ go.d f49410b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e f49411c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ d f49412d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ double f49413e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.common_adapter_internal.b f49414f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ boolean f49415g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ String f49416h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef f49417i;

        public static final class a<T> implements go.e {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ go.e f49418b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ e f49419c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ d f49420d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ double f49421e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ com.moloco.sdk.common_adapter_internal.b f49422f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final /* synthetic */ boolean f49423g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public final /* synthetic */ String f49424h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public final /* synthetic */ Ref$ObjectRef f49425i;

            /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e$i$a$a, reason: collision with other inner class name */
            @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastAdLoaderImpl$tryLoadVastRenderAd$$inlined$mapNotNull$1$2", f = "VastAdLoader.kt", l = {54, 65, 86}, m = "emit")
            public static final class C0655a extends ContinuationImpl {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f49426a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f49427b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public Object f49428c;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public Object f49430e;

                public C0655a(hn.c cVar) {
                    super(cVar);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f49426a = obj;
                    this.f49427b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(go.e eVar, e eVar2, d dVar, double d10, com.moloco.sdk.common_adapter_internal.b bVar, boolean z10, String str, Ref$ObjectRef ref$ObjectRef) {
                this.f49418b = eVar;
                this.f49419c = eVar2;
                this.f49420d = dVar;
                this.f49421e = d10;
                this.f49422f = bVar;
                this.f49423g = z10;
                this.f49424h = str;
                this.f49425i = ref$ObjectRef;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
            @Override // go.e
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r24, hn.c r25) {
                /*
                    Method dump skipped, instruction units count: 351
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.i.a.emit(java.lang.Object, hn.c):java.lang.Object");
            }
        }

        public i(go.d dVar, e eVar, d dVar2, double d10, com.moloco.sdk.common_adapter_internal.b bVar, boolean z10, String str, Ref$ObjectRef ref$ObjectRef) {
            this.f49410b = dVar;
            this.f49411c = eVar;
            this.f49412d = dVar2;
            this.f49413e = d10;
            this.f49414f = bVar;
            this.f49415g = z10;
            this.f49416h = str;
            this.f49417i = ref$ObjectRef;
        }

        @Override // go.d
        public Object collect(go.e<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a> eVar, hn.c cVar) {
            Object objCollect = this.f49410b.collect(new a(eVar, this.f49411c, this.f49412d, this.f49413e, this.f49414f, this.f49415g, this.f49416h, this.f49417i), cVar);
            return objCollect == in.a.g() ? objCollect : bn.r.f5635a;
        }
    }

    public static final class j<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return fn.b.d(((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.c) t10).b(), ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.c) t11).b());
        }
    }

    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastAdLoaderImpl", f = "VastAdLoader.kt", l = {280}, m = "tryLoadVastRenderAd")
    public static final class k extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f49431a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f49432b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f49433c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f49435e;

        public k(hn.c<? super k> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f49433c = obj;
            this.f49435e |= Integer.MIN_VALUE;
            return e.this.v(null, null, 0.0d, null, false, null, this);
        }
    }

    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastAdLoaderImpl", f = "VastAdLoader.kt", l = {311, 328}, m = "tryLoadWrapperRenderAd")
    public static final class l extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f49436a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f49437b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f49438c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f49439d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Object f49440e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Object f49441f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public double f49442g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f49443h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f49444i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public /* synthetic */ Object f49445j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f49447l;

        public l(hn.c<? super l> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f49445j = obj;
            this.f49447l |= Integer.MIN_VALUE;
            return e.this.r(null, null, 0.0d, null, false, null, this);
        }
    }

    public static final class m implements go.d<Pair<? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.s, ? extends File>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ go.d f49448b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f49449c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e f49450d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f49451e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef f49452f;

        public static final class a<T> implements go.e {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ go.e f49453b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ boolean f49454c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ e f49455d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ String f49456e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ Ref$ObjectRef f49457f;

            /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e$m$a$a, reason: collision with other inner class name */
            @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastAdLoaderImpl$tryPrepareInLineRenderLinear$$inlined$mapNotNull$1$2", f = "VastAdLoader.kt", l = {53, 71, 82}, m = "emit")
            public static final class C0656a extends ContinuationImpl {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f49458a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f49459b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public Object f49460c;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public Object f49462e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public Object f49463f;

                public C0656a(hn.c cVar) {
                    super(cVar);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f49458a = obj;
                    this.f49459b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(go.e eVar, boolean z10, e eVar2, String str, Ref$ObjectRef ref$ObjectRef) {
                this.f49453b = eVar;
                this.f49454c = z10;
                this.f49455d = eVar2;
                this.f49456e = str;
                this.f49457f = ref$ObjectRef;
            }

            /* JADX WARN: Removed duplicated region for block: B:26:0x0087  */
            /* JADX WARN: Removed duplicated region for block: B:27:0x0092  */
            /* JADX WARN: Removed duplicated region for block: B:41:0x00da  */
            /* JADX WARN: Removed duplicated region for block: B:42:0x00e5  */
            /* JADX WARN: Removed duplicated region for block: B:47:0x00f6  */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // go.e
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r9, hn.c r10) {
                /*
                    Method dump skipped, instruction units count: 270
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.m.a.emit(java.lang.Object, hn.c):java.lang.Object");
            }
        }

        public m(go.d dVar, boolean z10, e eVar, String str, Ref$ObjectRef ref$ObjectRef) {
            this.f49448b = dVar;
            this.f49449c = z10;
            this.f49450d = eVar;
            this.f49451e = str;
            this.f49452f = ref$ObjectRef;
        }

        @Override // go.d
        public Object collect(go.e<? super Pair<? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.s, ? extends File>> eVar, hn.c cVar) {
            Object objCollect = this.f49448b.collect(new a(eVar, this.f49449c, this.f49450d, this.f49451e, this.f49452f), cVar);
            return objCollect == in.a.g() ? objCollect : bn.r.f5635a;
        }
    }

    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastAdLoaderImpl", f = "VastAdLoader.kt", l = {565}, m = "tryPrepareInLineRenderLinear")
    public static final class n extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f49464a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f49465b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f49466c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f49467d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Object f49468e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public /* synthetic */ Object f49469f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f49471h;

        public n(hn.c<? super n> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f49469f = obj;
            this.f49471h |= Integer.MIN_VALUE;
            return e.this.u(null, null, null, null, 0.0d, null, null, false, null, this);
        }
    }

    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastAdLoaderImpl", f = "VastAdLoader.kt", l = {95}, m = "waitForAdLoadToStart-8Mi8wO0")
    public static final class o extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f49472a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f49473b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f49474c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f49476e;

        public o(hn.c<? super o> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f49474c = obj;
            this.f49476e |= Integer.MIN_VALUE;
            return e.this.a(null, 0L, this);
        }
    }

    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastAdLoaderImpl$waitForAdLoadToStart$streamStatus$1", f = "VastAdLoader.kt", l = {97}, m = "invokeSuspend")
    public static final class p extends SuspendLambda implements sn.p<l0, hn.c<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.h>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f49477a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a f49479c;

        @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastAdLoaderImpl$waitForAdLoadToStart$streamStatus$1$1", f = "VastAdLoader.kt", l = {}, m = "invokeSuspend")
        public static final class a extends SuspendLambda implements sn.p<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.h, hn.c<? super Boolean>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f49480a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f49481b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ e f49482c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(e eVar, hn.c<? super a> cVar) {
                super(2, cVar);
                this.f49482c = eVar;
            }

            @Override // sn.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo2invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.h hVar, hn.c<? super Boolean> cVar) {
                return ((a) create(hVar, cVar)).invokeSuspend(bn.r.f5635a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
                a aVar = new a(this.f49482c, cVar);
                aVar.f49481b = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                in.a.g();
                if (this.f49480a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.h hVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.h) this.f49481b;
                if (hVar instanceof h.c) {
                    MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
                    String str = this.f49482c.f49365h;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Stream status: ");
                    h.c cVar = (h.c) hVar;
                    sb2.append(cVar.b().a());
                    sb2.append('/');
                    sb2.append(cVar.b().b());
                    sb2.append(" bytes downloaded");
                    MolocoLogger.info$default(molocoLogger, str, sb2.toString(), null, false, 12, null);
                }
                return jn.a.a((hVar instanceof h.a) || (hVar instanceof h.b));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a aVar, hn.c<? super p> cVar) {
            super(2, cVar);
            this.f49479c = aVar;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.h> cVar) {
            return ((p) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
            return e.this.new p(this.f49479c, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objG = in.a.g();
            int i10 = this.f49477a;
            if (i10 == 0) {
                kotlin.c.b(obj);
                go.d<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.h> dVarB = e.this.f49360c.b(this.f49479c.g().g());
                a aVar = new a(e.this, null);
                this.f49477a = 1;
                obj = go.f.y(dVarB, aVar, this);
                if (obj == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
            }
            return obj;
        }
    }

    public e(@NotNull w wVar, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.o oVar, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.n nVar, @NotNull y yVar, @NotNull g0 g0Var, @NotNull HttpClient httpClient, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.w wVar2) {
        tn.p.k(wVar, "parseVast");
        tn.p.k(oVar, "mediaConfig");
        tn.p.k(nVar, "mediaCacheRepository");
        tn.p.k(yVar, "vastTracker");
        tn.p.k(g0Var, "connectivityService");
        tn.p.k(httpClient, "httpClient");
        tn.p.k(wVar2, "screenService");
        this.f49358a = wVar;
        this.f49359b = oVar;
        this.f49360c = nVar;
        this.f49361d = yVar;
        this.f49362e = g0Var;
        this.f49363f = httpClient;
        this.f49364g = wVar2;
        this.f49365h = "VastAdLoaderImpl";
    }

    public static final b e(bn.g<b> gVar) {
        return gVar.getValue();
    }

    public static final b g(e eVar, a aVar) {
        return eVar.f(aVar);
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.c i(e eVar, com.moloco.sdk.common_adapter_internal.b bVar, List list) {
        tn.p.k(list, "it");
        return eVar.j(list, bVar);
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.e k(e eVar, List list) {
        tn.p.k(list, "it");
        return eVar.l(list);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.h
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(@org.jetbrains.annotations.NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a r12, long r13, @org.jetbrains.annotations.NotNull hn.c<? super com.moloco.sdk.internal.g0<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k>> r15) {
        /*
            Method dump skipped, instruction units count: 477
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a, long, hn.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.h
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(@org.jetbrains.annotations.NotNull java.lang.String r19, @org.jetbrains.annotations.NotNull java.lang.String r20, boolean r21, @org.jetbrains.annotations.NotNull hn.c<? super com.moloco.sdk.internal.g0<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k>> r22) {
        /*
            Method dump skipped, instruction units count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.b(java.lang.String, java.lang.String, boolean, hn.c):java.lang.Object");
    }

    public final double c(long j10, int i10) {
        return (j10 * ((long) 8)) / ((double) (i10 * 1000));
    }

    public final b f(a aVar) {
        List<List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.j>> listC;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        if (aVar != null && (listC = aVar.c()) != null) {
            Iterator<T> it = listC.iterator();
            while (it.hasNext()) {
                List list = (List) it.next();
                ArrayList arrayList6 = new ArrayList();
                ArrayList arrayList7 = new ArrayList();
                ArrayList<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.j> arrayList8 = new ArrayList();
                for (Object obj : list) {
                    if (!f49357i.r((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.j) obj)) {
                        arrayList8.add(obj);
                    }
                }
                for (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.j jVar : arrayList8) {
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.k kVarB = jVar.b();
                    if (kVarB instanceof k.b) {
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.r rVarA = ((k.b) jVar.b()).a();
                        cn.b0.F(arrayList, rVarA.e());
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.a aVarF = rVarA.f();
                        if (aVarF != null) {
                            cn.b0.F(arrayList2, aVarF.b());
                            cn.b0.F(arrayList3, aVarF.c());
                        }
                        cn.b0.F(arrayList6, rVarA.b());
                    } else {
                        if (!(kVarB instanceof k.a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        cn.b0.F(arrayList7, ((k.a) jVar.b()).a());
                    }
                }
                arrayList4.add(arrayList6);
                arrayList5.add(arrayList7);
            }
        }
        return new b(arrayList, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.a(null, arrayList2, arrayList3), arrayList4, arrayList5);
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.c j(List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.g> list, com.moloco.sdk.common_adapter_internal.b bVar) {
        List<String> listM;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!f49357i.q((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.g) obj) && (!r2.e().isEmpty())) {
                arrayList.add(obj);
            }
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.g gVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.g) f0.v0(f0.X0(arrayList, u.i(Integer.valueOf(bVar.f()), Integer.valueOf(bVar.c()))));
        if (gVar == null) {
            return null;
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.a0 a0Var = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.a0) f0.t0(f0.X0(gVar.e(), u.t()));
        Integer numF = gVar.f();
        int iIntValue = numF != null ? numF.intValue() : 0;
        Integer numD = gVar.d();
        int iIntValue2 = numD != null ? numD.intValue() : 0;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.h hVarB = gVar.b();
        String strA = hVarB != null ? hVarB.a() : null;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.h hVarB2 = gVar.b();
        if (hVarB2 == null || (listM = hVarB2.b()) == null) {
            listM = cn.w.m();
        }
        List<String> list2 = listM;
        List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.y> listC = gVar.c();
        ArrayList arrayList2 = new ArrayList(cn.x.x(listC, 10));
        Iterator<T> it = listC.iterator();
        while (it.hasNext()) {
            arrayList2.add(((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.y) it.next()).c());
        }
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.c(a0Var, iIntValue, iIntValue2, strA, list2, arrayList2);
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.e l(List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.n> list) {
        List<String> listM;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!f49357i.s((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.n) obj)) {
                arrayList.add(obj);
            }
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.n nVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.n) f0.v0(f0.X0(arrayList, u.g()));
        if (nVar == null) {
            return null;
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.a0 a0VarF = nVar.f();
        Integer numH = nVar.h();
        int iIntValue = numH != null ? numH.intValue() : 0;
        Integer numD = nVar.d();
        int iIntValue2 = numD != null ? numD.intValue() : 0;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.o oVarB = nVar.b();
        String strA = oVarB != null ? oVarB.a() : null;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.o oVarB2 = nVar.b();
        if (oVarB2 == null || (listM = oVarB2.b()) == null) {
            listM = cn.w.m();
        }
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.e(a0VarF, iIntValue, iIntValue2, strA, listM, nVar.g(), nVar.c(), nVar.e());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.b r25, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.d r26, double r27, com.moloco.sdk.common_adapter_internal.b r29, boolean r30, java.lang.String r31, hn.c<? super com.moloco.sdk.internal.g0<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k>> r32) {
        /*
            Method dump skipped, instruction units count: 514
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.r(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.b, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e$d, double, com.moloco.sdk.common_adapter_internal.b, boolean, java.lang.String, hn.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00e3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.b r18, java.util.List<java.lang.String> r19, hn.c<? super com.moloco.sdk.internal.g0<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.z, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k>> r20) {
        /*
            Method dump skipped, instruction units count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.s(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.b, java.util.List, hn.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x0262, code lost:
    
        r24 = r14;
        r15 = r10;
        r13 = r13;
        r10 = r32;
        r6 = r6;
        r3 = r3;
        r12 = r17;
        r7 = r7;
        r9 = r9;
        r11 = r11;
        r4 = r4;
        r8 = r8;
        r5 = r5;
        r2 = r2;
        r1 = r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x01a2 -> B:39:0x01ba). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.q r32, final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.a r33, double r34, com.moloco.sdk.common_adapter_internal.b r36, boolean r37, java.lang.String r38, hn.c<? super com.moloco.sdk.internal.g0<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k>> r39) {
        /*
            Method dump skipped, instruction units count: 936
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.t(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.q, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e$a, double, com.moloco.sdk.common_adapter_internal.b, boolean, java.lang.String, hn.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.r r19, java.util.List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.y> r20, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.a r21, java.util.List<java.lang.String> r22, double r23, java.lang.Long r25, com.moloco.sdk.common_adapter_internal.b r26, boolean r27, java.lang.String r28, hn.c<? super com.moloco.sdk.internal.g0<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.f, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k>> r29) {
        /*
            Method dump skipped, instruction units count: 608
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.u(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.r, java.util.List, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.a, java.util.List, double, java.lang.Long, com.moloco.sdk.common_adapter_internal.b, boolean, java.lang.String, hn.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r0v1, types: [T, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.z r21, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.d r22, double r23, com.moloco.sdk.common_adapter_internal.b r25, boolean r26, java.lang.String r27, hn.c<? super com.moloco.sdk.internal.g0<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k>> r28) {
        /*
            Method dump skipped, instruction units count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e.v(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.z, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.e$d, double, com.moloco.sdk.common_adapter_internal.b, boolean, java.lang.String, hn.c):java.lang.Object");
    }

    public final void w(List<String> list, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.x xVar) {
        y.a.a(this.f49361d, list, xVar, null, null, 12, null);
    }

    public final double x() {
        return !this.f49362e.b() ? 10.0d : 2.0d;
    }
}
