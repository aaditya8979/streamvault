package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.profileinstaller.ProfileVerifier;
import cn.a0;
import cn.x;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.s;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.w;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.t;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.y;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
public final class l {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public static final a f50639p = new a(null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f50640q = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a f50641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public List<String> f50642b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final List<String> f50643c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final List<String> f50644d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final List<String> f50645e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final List<String> f50646f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public final List<String> f50647g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public final List<String> f50648h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public List<String> f50649i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final s f50650j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final y f50651k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.a> f50652l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f50653m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final List<n> f50654n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f50655o;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final l a(@NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.h hVar, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a aVar) {
            p.k(hVar, "linearTracking");
            p.k(aVar, "customUserEventBuilderService");
            return new l(aVar, hVar.a(), hVar.d(), hVar.m(), hVar.e(), hVar.f(), hVar.n(), hVar.c(), hVar.g(), hVar.o(), hVar.h(), hVar.j(), hVar.k(), hVar.l(), hVar.b(), hVar.i(), null, null, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, null);
        }
    }

    public static final class b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return fn.b.d(Long.valueOf(((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.a) t10).a()), Long.valueOf(((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.a) t11).a()));
        }
    }

    public static final class c<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return fn.b.d(Integer.valueOf(((n) t10).a()), Integer.valueOf(((n) t11).a()));
        }
    }

    public l(@NotNull com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a aVar, @Nullable List<String> list, @Nullable List<String> list2, @Nullable List<String> list3, @Nullable List<String> list4, @Nullable List<String> list5, @Nullable List<String> list6, @Nullable List<String> list7, @Nullable List<String> list8, @Nullable List<String> list9, @Nullable List<String> list10, @Nullable List<String> list11, @Nullable List<String> list12, @Nullable List<String> list13, @Nullable List<String> list14, @Nullable List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.g> list15, @NotNull s sVar, @NotNull y yVar) {
        p.k(aVar, "customUserEventBuilderService");
        p.k(sVar, "buttonTracker");
        p.k(yVar, "vastTracker");
        this.f50641a = aVar;
        this.f50642b = list;
        this.f50643c = list8;
        this.f50644d = list9;
        this.f50645e = list10;
        this.f50646f = list11;
        this.f50647g = list12;
        this.f50648h = list13;
        this.f50649i = list14;
        this.f50650j = sVar;
        this.f50651k = yVar;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (list2 != null) {
            ArrayList arrayList3 = new ArrayList(x.x(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList3.add(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.a((String) it.next(), 0L));
            }
            arrayList.addAll(arrayList3);
        }
        if (list3 != null) {
            ArrayList arrayList4 = new ArrayList(x.x(list3, 10));
            Iterator<T> it2 = list3.iterator();
            while (it2.hasNext()) {
                arrayList4.add(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.a((String) it2.next(), 0L));
            }
            arrayList.addAll(arrayList4);
        }
        if (list4 != null) {
            ArrayList arrayList5 = new ArrayList(x.x(list4, 10));
            Iterator<T> it3 = list4.iterator();
            while (it3.hasNext()) {
                arrayList5.add(new n((String) it3.next(), 25));
            }
            arrayList2.addAll(arrayList5);
        }
        if (list5 != null) {
            ArrayList arrayList6 = new ArrayList(x.x(list5, 10));
            Iterator<T> it4 = list5.iterator();
            while (it4.hasNext()) {
                arrayList6.add(new n((String) it4.next(), 50));
            }
            arrayList2.addAll(arrayList6);
        }
        if (list6 != null) {
            ArrayList arrayList7 = new ArrayList(x.x(list6, 10));
            Iterator<T> it5 = list6.iterator();
            while (it5.hasNext()) {
                arrayList7.add(new n((String) it5.next(), 75));
            }
            arrayList2.addAll(arrayList7);
        }
        if (list7 != null) {
            ArrayList arrayList8 = new ArrayList(x.x(list7, 10));
            Iterator<T> it6 = list7.iterator();
            while (it6.hasNext()) {
                arrayList8.add(new n((String) it6.next(), 100));
            }
            arrayList2.addAll(arrayList8);
        }
        if (list15 != null) {
            for (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.g gVar : list15) {
                t tVarA = gVar.a();
                if (tVarA instanceof t.b) {
                    arrayList.add(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.a(gVar.b(), ((t.b) gVar.a()).a()));
                } else {
                    if (!(tVarA instanceof t.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    arrayList2.add(new n(gVar.b(), ((t.a) gVar.a()).a()));
                }
            }
        }
        if (arrayList.size() > 1) {
            a0.D(arrayList, new b());
        }
        this.f50652l = arrayList;
        if (arrayList2.size() > 1) {
            a0.D(arrayList2, new c());
        }
        this.f50654n = arrayList2;
    }

    public /* synthetic */ l(com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a aVar, List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8, List list9, List list10, List list11, List list12, List list13, List list14, List list15, s sVar, y yVar, int i10, tn.i iVar) {
        this(aVar, list, list2, list3, list4, list5, list6, list7, list8, list9, list10, list11, list12, list13, list14, list15, (i10 & 65536) != 0 ? w.a() : sVar, (i10 & 131072) != 0 ? com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.a0.e() : yVar);
    }

    public final void a(@NotNull a.AbstractC0696a.c.EnumC0698a enumC0698a) {
        p.k(enumC0698a, "buttonType");
        this.f50650j.o(enumC0698a);
    }

    public final void b(@NotNull a.AbstractC0696a.c cVar) {
        p.k(cVar, "button");
        this.f50650j.l(cVar);
    }

    public final void c(@NotNull a.AbstractC0696a.f fVar, @Nullable Integer num, @Nullable String str) {
        p.k(fVar, "lastClickPosition");
        List<String> list = this.f50642b;
        if (list != null) {
            this.f50651k.b(list, null, num, str, this.f50650j.p(), this.f50641a, fVar);
            this.f50642b = null;
        }
    }

    public final void d(@Nullable String str, int i10, int i11) {
        double d10 = (((double) i10) / ((double) i11)) * ((double) 100);
        List<n> list = this.f50654n;
        List<n> listSubList = list.subList(this.f50655o, list.size());
        ArrayList arrayList = new ArrayList();
        for (Object obj : listSubList) {
            if (((n) obj).a() > d10) {
                break;
            } else {
                arrayList.add(obj);
            }
        }
        y yVar = this.f50651k;
        ArrayList arrayList2 = new ArrayList(x.x(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((n) it.next()).b());
        }
        yVar.a(arrayList2, null, Integer.valueOf(i10), str);
        this.f50655o += arrayList.size();
        List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.a> list2 = this.f50652l;
        List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.a> listSubList2 = list2.subList(this.f50653m, list2.size());
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : listSubList2) {
            if (((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.a) obj2).a() > i10) {
                break;
            } else {
                arrayList3.add(obj2);
            }
        }
        y yVar2 = this.f50651k;
        ArrayList arrayList4 = new ArrayList(x.x(arrayList3, 10));
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            arrayList4.add(((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.a) it2.next()).b());
        }
        yVar2.a(arrayList4, null, Integer.valueOf(i10), str);
        this.f50653m += arrayList3.size();
    }

    public final void e(@Nullable Integer num, @Nullable String str) {
        List<String> list = this.f50643c;
        if (list != null) {
            this.f50651k.a(list, null, num, str);
        }
    }

    public final void f(@Nullable Integer num, @Nullable String str) {
        List<String> list = this.f50645e;
        if (list != null) {
            this.f50651k.a(list, null, num, str);
        }
    }

    public final void g(@Nullable Integer num, @Nullable String str) {
        List<String> list = this.f50646f;
        if (list != null) {
            this.f50651k.a(list, null, num, str);
        }
    }

    public final void h(@Nullable Integer num, @Nullable String str) {
        List<String> list = this.f50647g;
        if (list != null) {
            this.f50651k.a(list, null, num, str);
        }
    }

    public final void i(@Nullable Integer num, @Nullable String str) {
        List<String> list = this.f50648h;
        if (list != null) {
            this.f50651k.a(list, null, num, str);
        }
    }

    public final void j(@Nullable Integer num, @Nullable String str) {
        List<String> list = this.f50644d;
        if (list != null) {
            this.f50651k.a(list, null, num, str);
        }
    }
}
