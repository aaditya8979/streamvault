package yads;

import com.monetization.ads.quality.base.model.configuration.AdQualityVerifiableNetwork;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class z8 {
    public static i8 a(f8 f8Var) {
        Object next;
        int i10 = f8Var.f89510e;
        boolean z10 = f8Var.f89506a;
        boolean z11 = f8Var.f89511f;
        Map map = f8Var.f89513h;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            d8 d8Var = e8.f89151c;
            String str = (String) entry.getKey();
            d8Var.getClass();
            Iterator<E> it = e8.f89153e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (tn.p.f(((e8) next).f89154b, str)) {
                    break;
                }
            }
            AdQualityVerifiableNetwork adQualityVerifiableNetworkA = d8.a((e8) next);
            if (adQualityVerifiableNetworkA != null) {
                linkedHashMap.put(adQualityVerifiableNetworkA, new x8(((h8) entry.getValue()).f90274b, ((h8) entry.getValue()).f90273a));
            }
        }
        return new i8(i10, z10, z11, linkedHashMap, f8Var.f89512g);
    }
}
