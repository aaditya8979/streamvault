package com.ironsource;

import com.ironsource.C3978d4;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;

/* JADX INFO: renamed from: com.ironsource.h1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C4047h1 implements Cif<JSONArray> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<C4029g1> f31833a = new ArrayList();

    /* JADX INFO: renamed from: com.ironsource.h1$a */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f31834a;

        static {
            int[] iArr = new int[EnumC4061hf.values().length];
            try {
                iArr[EnumC4061hf.FullHistory.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC4061hf.CurrentlyLoadedAds.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f31834a = iArr;
        }
    }

    private final List<C4029g1> a() {
        List<C4029g1> list = this.f31833a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            C4029g1 c4029g1 = (C4029g1) obj;
            if (c4029g1.e() != EnumC4025ff.LoadSuccess && c4029g1.e() != EnumC4025ff.LoadRequest) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(cn.x.x(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((C4029g1) it.next()).a());
        }
        Set setL1 = cn.f0.l1(arrayList2);
        List<C4029g1> list2 = this.f31833a;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : list2) {
            C4029g1 c4029g12 = (C4029g1) obj2;
            if (c4029g12.e() == EnumC4025ff.LoadSuccess && !setL1.contains(c4029g12.a())) {
                arrayList3.add(obj2);
            }
        }
        return arrayList3;
    }

    private final List<C4029g1> b() {
        List<C4029g1> list = this.f31833a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((C4029g1) obj).e() != EnumC4025ff.LoadRequest) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final void a(@NotNull C4029g1 c4029g1) {
        tn.p.k(c4029g1, "event");
        this.f31833a.add(c4029g1);
    }

    @Override // com.ironsource.InterfaceC4053h7
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONArray a(@NotNull EnumC4061hf enumC4061hf) {
        tn.p.k(enumC4061hf, C3978d4.a.f31224t);
        int i10 = a.f31834a[enumC4061hf.ordinal()];
        if (i10 == 1) {
            List<C4029g1> listB = b();
            ArrayList arrayList = new ArrayList(cn.x.x(listB, 10));
            Iterator<T> it = listB.iterator();
            while (it.hasNext()) {
                arrayList.add(((C4029g1) it.next()).d());
            }
            return new JSONArray((Collection) arrayList);
        }
        if (i10 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        List<C4029g1> listA = a();
        ArrayList arrayList2 = new ArrayList(cn.x.x(listA, 10));
        Iterator<T> it2 = listA.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((C4029g1) it2.next()).c());
        }
        return new JSONArray((Collection) arrayList2);
    }
}
