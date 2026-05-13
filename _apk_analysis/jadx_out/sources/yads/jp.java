package yads;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class jp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final xo.a f91322a = ge1.f89968a;

    public static String a(String str) {
        return "BiddingSettingsAdUnitIdsInfo_" + str;
    }

    public static hp a(rg1 rg1Var) {
        tg1 tg1Var = (tg1) rg1Var;
        Set setA = tg1Var.a("BiddingSettingsAdUnitIdsSet", cn.w0.f());
        if (setA == null) {
            setA = cn.w0.f();
        }
        Set setA2 = tg1Var.a("MediationPrefetchSettingsAdUnitIdsSet", cn.w0.f());
        if (setA2 == null) {
            setA2 = cn.w0.f();
        }
        ip ipVar = new ip();
        ArrayList arrayList = new ArrayList(setA.size());
        Iterator it = setA.iterator();
        while (it.hasNext()) {
            String strC = tg1Var.c(a((String) it.next()));
            if (strC != null && strC.length() != 0) {
                try {
                    gb gbVarA = ipVar.a(new JSONObject(strC));
                    if (gbVarA != null) {
                        arrayList.add(gbVarA);
                    }
                } catch (JSONException unused) {
                    boolean z10 = ad1.f87661a;
                }
            }
        }
        long jB = tg1Var.b("MediationPrefetchLoadTimeoutMillis");
        ArrayList arrayList2 = new ArrayList(setA2.size());
        Iterator it2 = setA2.iterator();
        while (it2.hasNext()) {
            String strC2 = tg1Var.c(b((String) it2.next()));
            if (strC2 != null) {
                xo.a aVar = f91322a;
                aVar.a();
                xr1 xr1Var = (xr1) aVar.c(to.a.t(xr1.Companion.serializer()), strC2);
                if (xr1Var != null) {
                    arrayList2.add(xr1Var);
                }
            }
        }
        gs1 gs1Var = new gs1(jB, arrayList2);
        if ((!arrayList.isEmpty()) || (!setA2.isEmpty())) {
            return new hp(arrayList, gs1Var);
        }
        return null;
    }

    public static void a(rg1 rg1Var, hp hpVar) {
        List<xr1> listM;
        List<gb> list = hpVar.f90475b;
        HashSet hashSet = new HashSet(list.size());
        for (gb gbVar : list) {
            String str = gbVar.f89898b;
            String str2 = gbVar.f89900d;
            hashSet.add(str);
            ((tg1) rg1Var).a(a(str), str2);
        }
        tg1 tg1Var = (tg1) rg1Var;
        Set<String> setA = tg1Var.a("BiddingSettingsAdUnitIdsSet", cn.w0.f());
        if (setA == null) {
            setA = cn.w0.f();
        }
        for (String str3 : setA) {
            if (!hashSet.contains(str3)) {
                tg1Var.d(a(str3));
            }
        }
        tg1Var.a("BiddingSettingsAdUnitIdsSet", hashSet);
        gs1 gs1Var = hpVar.f90476c;
        long j10 = gs1Var != null ? gs1Var.f90101b : 0L;
        if (gs1Var == null || (listM = gs1Var.f90102c) == null) {
            listM = cn.w.m();
        }
        HashSet hashSet2 = new HashSet(listM.size());
        for (xr1 xr1Var : listM) {
            hashSet2.add(xr1Var.f96859b);
            String strB = b(xr1Var.f96859b);
            xo.a aVar = f91322a;
            aVar.a();
            tg1Var.a(strB, aVar.b(xr1.Companion.serializer(), xr1Var));
        }
        Set<String> setA2 = tg1Var.a("MediationPrefetchSettingsAdUnitIdsSet", cn.w0.f());
        if (setA2 == null) {
            setA2 = cn.w0.f();
        }
        for (String str4 : setA2) {
            if (!hashSet2.contains(str4)) {
                tg1Var.d(b(str4));
            }
        }
        tg1Var.a("MediationPrefetchSettingsAdUnitIdsSet", hashSet2);
        tg1Var.a("MediationPrefetchLoadTimeoutMillis", j10);
    }

    public static String b(String str) {
        return "MediationPrefetchSettingsAdUnitIdsInfo_" + str;
    }

    public static void b(rg1 rg1Var) {
        tg1 tg1Var = (tg1) rg1Var;
        Set setA = tg1Var.a("BiddingSettingsAdUnitIdsSet", cn.w0.f());
        if (setA == null) {
            setA = cn.w0.f();
        }
        Set setA2 = tg1Var.a("MediationPrefetchSettingsAdUnitIdsSet", cn.w0.f());
        if (setA2 == null) {
            setA2 = cn.w0.f();
        }
        Iterator it = setA.iterator();
        while (it.hasNext()) {
            tg1Var.d(a((String) it.next()));
        }
        Iterator it2 = setA2.iterator();
        while (it2.hasNext()) {
            tg1Var.d(b((String) it2.next()));
        }
        tg1Var.d("BiddingSettingsAdUnitIdsSet");
        tg1Var.d("MediationPrefetchSettingsAdUnitIdsSet");
    }
}
