package yads;

import com.ironsource.Q6;
import java.util.LinkedHashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public abstract class kh2 {
    public static LinkedHashMap a(ih2 ih2Var) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(Q6.G1, ih2Var.f90838a);
        qh2 qh2Var = ih2Var.f90839b;
        if (qh2Var != null) {
            linkedHashMap.put("winner_name", qh2Var.f94033a);
            linkedHashMap.put("winner_ad_unit", qh2Var.f94034b);
        }
        String lowerCase = ih2Var.f90841d.f87709a.name().toLowerCase(Locale.ROOT);
        tn.p.j(lowerCase, "toLowerCase(...)");
        linkedHashMap.put("status", lowerCase);
        Integer num = ih2Var.f90841d.f87711c;
        if (num != null) {
            linkedHashMap.put("error_code", String.valueOf(num.intValue()));
        }
        String str = ih2Var.f90841d.f87710b;
        if (str != null) {
            linkedHashMap.put("error_message", str);
        }
        return linkedHashMap;
    }
}
