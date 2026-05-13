package com.unity3d.ads.core.extensions;

import cn.k0;
import cn.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import tn.p;
import zn.i;
import zn.n;

/* JADX INFO: compiled from: JSONArrayExtensions.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class JSONArrayExtensionsKt {
    @NotNull
    public static final Map<String, List<String>> getHeadersMap(@NotNull JSONArray jSONArray) throws JSONException {
        p.k(jSONArray, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            Object obj = jSONArray.get(i10);
            p.i(obj, "null cannot be cast to non-null type org.json.JSONArray");
            JSONArray jSONArray2 = (JSONArray) obj;
            List arrayList = (List) linkedHashMap.get(jSONArray2.getString(0));
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            String string = jSONArray2.getString(1);
            p.j(string, "header.getString(1)");
            arrayList.add(string);
            String string2 = jSONArray2.getString(0);
            p.j(string2, "header.getString(0)");
            linkedHashMap.put(string2, arrayList);
        }
        return linkedHashMap;
    }

    @NotNull
    public static final Object[] toTypedArray(@NotNull JSONArray jSONArray) {
        p.k(jSONArray, "<this>");
        i iVarV = n.v(0, jSONArray.length());
        ArrayList arrayList = new ArrayList(x.x(iVarV, 10));
        Iterator<Integer> it = iVarV.iterator();
        while (it.hasNext()) {
            arrayList.add(jSONArray.get(((k0) it).nextInt()));
        }
        return arrayList.toArray(new Object[0]);
    }
}
