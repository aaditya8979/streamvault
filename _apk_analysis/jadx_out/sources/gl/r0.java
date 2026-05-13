package gl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: UrlDecodedParametersBuilder.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class r0 {
    public static final void b(kl.u uVar, kl.u uVar2) {
        for (String str : uVar2.names()) {
            List<String> listA = uVar2.a(str);
            if (listA == null) {
                listA = cn.w.m();
            }
            String strK = e.k(str, 0, 0, false, null, 15, null);
            ArrayList arrayList = new ArrayList(cn.x.x(listA, 10));
            Iterator<T> it = listA.iterator();
            while (it.hasNext()) {
                arrayList.add(e.k((String) it.next(), 0, 0, true, null, 11, null));
            }
            uVar.c(strK, arrayList);
        }
    }

    public static final void c(kl.u uVar, kl.t tVar) {
        for (String str : tVar.names()) {
            List<String> listA = tVar.a(str);
            if (listA == null) {
                listA = cn.w.m();
            }
            String strM = e.m(str, false, 1, null);
            ArrayList arrayList = new ArrayList(cn.x.x(listA, 10));
            Iterator<T> it = listA.iterator();
            while (it.hasNext()) {
                arrayList.add(e.o((String) it.next()));
            }
            uVar.c(strM, arrayList);
        }
    }

    @NotNull
    public static final io.ktor.http.b d(@NotNull kl.u uVar) {
        tn.p.k(uVar, "parameters");
        c0 c0VarB = io.ktor.http.c.b(0, 1, null);
        b(c0VarB, uVar);
        return c0VarB.build();
    }

    @NotNull
    public static final c0 e(@NotNull kl.t tVar) {
        tn.p.k(tVar, "parameters");
        c0 c0VarB = io.ktor.http.c.b(0, 1, null);
        c(c0VarB, tVar);
        return c0VarB;
    }
}
