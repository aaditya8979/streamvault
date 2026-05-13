package sg.bigo.ads.common.h.b;

import com.ironsource.Z7;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Map<String, a> f82209a = new HashMap();

    public static void a() {
        f82209a.clear();
    }

    public static void a(String str) {
        a aVarC = c(str);
        if (aVarC == null) {
            sg.bigo.ads.common.t.a.a(0, "TaskManager", "you add " + str + " to TaskQueue ?");
            return;
        }
        int i10 = aVarC.f82190e;
        if (i10 == h.f82204d || i10 == h.f82206f) {
            sg.bigo.ads.common.t.a.a(0, 3, "TaskManager", "start downloadBean = ".concat(String.valueOf(aVarC)));
            return;
        }
        aVarC.f82190e = h.f82202b;
        f.a().a(aVarC.f82186a);
        g.f82200a.execute(aVarC.f82188c);
    }

    public static void a(a aVar) {
        aVar.f82191f = "It's remove !!!";
        if (aVar.f82190e != h.f82206f) {
            aVar.f82190e = h.f82207g;
            f.a().a(aVar.f82186a);
        }
        f.a().b(aVar.f82186a);
        g.a(aVar.f82188c);
    }

    public static Collection<a> b() {
        return f82209a.values();
    }

    public static void b(String str) {
        a aVarC = c(str);
        if (aVarC != null) {
            a(aVarC);
        } else {
            sg.bigo.ads.common.t.a.a(0, "TaskManager", "you add " + str + " to TaskQueue ?");
        }
        if (f82209a.containsKey(str)) {
            f82209a.remove(str);
        }
    }

    public static void b(a aVar) {
        if (f82209a.containsKey(aVar.f82186a)) {
            return;
        }
        sg.bigo.ads.common.t.a.a(0, 3, "TaskManager", Z7.f30794r + f82209a.keySet().size());
        f82209a.put(aVar.f82186a, aVar);
    }

    public static a c(String str) {
        if (f82209a.containsKey(str)) {
            return f82209a.get(str);
        }
        return null;
    }
}
