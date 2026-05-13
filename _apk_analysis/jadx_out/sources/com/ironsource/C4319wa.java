package com.ironsource;

import java.util.Collection;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.wa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C4319wa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f34331a = 100;

    private static final boolean a(Object obj, Object obj2, int i10) {
        return ((obj instanceof JSONObject) && (obj2 instanceof JSONObject)) ? a((JSONObject) obj, (JSONObject) obj2, i10 + 1) : ((obj instanceof JSONArray) && (obj2 instanceof JSONArray)) ? a((JSONArray) obj, (JSONArray) obj2, i10 + 1) : ((obj instanceof Number) && (obj2 instanceof Number)) ? ((Number) obj).doubleValue() == ((Number) obj2).doubleValue() : tn.p.f(obj, obj2);
    }

    public static final boolean a(@NotNull JSONArray jSONArray, @NotNull JSONArray jSONArray2) {
        tn.p.k(jSONArray, "lhs");
        tn.p.k(jSONArray2, "rhs");
        return a(jSONArray, jSONArray2, 0);
    }

    private static final boolean a(JSONArray jSONArray, JSONArray jSONArray2, int i10) {
        if (jSONArray == jSONArray2) {
            return true;
        }
        if (jSONArray.length() != jSONArray2.length() || i10 > 100) {
            return false;
        }
        Iterable iterableV = zn.n.v(0, jSONArray.length());
        if ((iterableV instanceof Collection) && ((Collection) iterableV).isEmpty()) {
            return true;
        }
        Iterator it = iterableV.iterator();
        while (it.hasNext()) {
            int iNextInt = ((cn.k0) it).nextInt();
            if (!a(jSONArray.get(iNextInt), jSONArray2.get(iNextInt), i10)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean a(@NotNull JSONObject jSONObject, @NotNull JSONObject jSONObject2) {
        tn.p.k(jSONObject, "lhs");
        tn.p.k(jSONObject2, "rhs");
        return a(jSONObject, jSONObject2, 0);
    }

    private static final boolean a(JSONObject jSONObject, JSONObject jSONObject2, int i10) {
        if (jSONObject == jSONObject2) {
            return true;
        }
        if (jSONObject.length() != jSONObject2.length() || i10 > 100) {
            return false;
        }
        Iterator<String> itKeys = jSONObject.keys();
        tn.p.j(itKeys, "lhs.keys()");
        for (String str : ao.r.g(itKeys)) {
            if (!jSONObject2.has(str) || !a(jSONObject.get(str), jSONObject2.get(str), i10)) {
                return false;
            }
        }
        return true;
    }
}
