package sg.bigo.ads.common.h.b;

import android.content.Context;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class b {
    public static sg.bigo.ads.common.h.a a(String str) {
        a aVarC = i.c(str);
        if (aVarC != null) {
            return aVarC.f82187b;
        }
        return null;
    }

    public static void a() {
        Iterator<a> it = i.b().iterator();
        while (it.hasNext()) {
            i.a(it.next());
        }
        i.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> void a(Context context, T t10) {
        if (t10 == 0) {
            return;
        }
        if (t10.getClass() == sg.bigo.ads.common.h.a.class) {
            a(context, (sg.bigo.ads.common.h.a) t10);
            return;
        }
        if (!(t10 instanceof List)) {
            sg.bigo.ads.common.t.a.a(0, "DownloadHandler", "argument is only Downloader or List ");
            return;
        }
        List list = (List) t10;
        if (list.size() <= 0 || list.get(0).getClass() != sg.bigo.ads.common.h.a.class) {
            sg.bigo.ads.common.t.a.a(0, "DownloadHandler", "argument of collect is only Downloader");
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a(context, (sg.bigo.ads.common.h.a) it.next());
        }
    }

    private static void a(Context context, sg.bigo.ads.common.h.a aVar) {
        a aVarC = i.c(aVar.f82143a);
        if (aVarC != null) {
            if (aVarC.f82187b.equals(aVar)) {
                aVarC.b(aVar.f82149g);
                aVarC.a(aVar.f82151i);
                aVarC.f82190e = h.f82201a;
                f.a().a(aVar.f82143a);
                return;
            }
            a(aVar.f82143a);
        }
        a aVar2 = new a(aVar);
        aVar2.f82188c = new d(context, aVar2);
        aVar2.f82190e = h.f82201a;
        i.b(aVar2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> void a(T t10) {
        if (t10 == 0) {
            return;
        }
        if (t10.getClass() == String.class) {
            i.b((String) t10);
        } else {
            sg.bigo.ads.common.t.a.a(0, "DownloadHandler", "argument is only String or List ");
        }
    }

    public static void a(String str, e eVar) {
        CopyOnWriteArrayList<e> copyOnWriteArrayList;
        f fVarA = f.a();
        if (!fVarA.f82198a.containsKey(str) || (copyOnWriteArrayList = fVarA.f82198a.get(str)) == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        }
        if (copyOnWriteArrayList.contains(eVar)) {
            return;
        }
        copyOnWriteArrayList.add(eVar);
        fVarA.f82198a.put(str, copyOnWriteArrayList);
    }

    public static void a(boolean z10) {
        g.a(z10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> void b(T t10) {
        if (t10 == 0) {
            return;
        }
        if (t10.getClass() == String.class) {
            i.a((String) t10);
        } else {
            sg.bigo.ads.common.t.a.a(0, "DownloadHandler", "argument is only String or List ");
        }
    }
}
