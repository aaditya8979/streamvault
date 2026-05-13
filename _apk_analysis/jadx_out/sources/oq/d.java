package oq;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.ServletException;
import mq.i;
import mq.j;
import mq.n;
import org.eclipse.jetty.http.PathMap;
import org.eclipse.jetty.util.LazyList;

/* JADX INFO: compiled from: ContextHandlerCollection.java */
/* JADX INFO: loaded from: classes5.dex */
public class d extends f {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final vq.c f76530u = vq.b.a(d.class);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public volatile PathMap f76531s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Class<? extends c> f76532t;

    public d() {
        super(true);
        this.f76532t = c.class;
    }

    @Override // oq.f
    public void C0(i[] iVarArr) {
        this.f76531s = null;
        super.C0(iVarArr);
        if (isStarted()) {
            D0();
        }
    }

    public void D0() {
        i[] iVarArrU;
        Map map;
        PathMap pathMap = new PathMap();
        i[] iVarArrN = N();
        for (int i10 = 0; iVarArrN != null && i10 < iVarArrN.length; i10++) {
            i iVar = iVarArrN[i10];
            if (iVar instanceof c) {
                iVarArrU = new i[]{iVar};
            } else if (iVar instanceof j) {
                iVarArrU = ((j) iVar).U(c.class);
            } else {
                continue;
            }
            for (i iVar2 : iVarArrU) {
                c cVar = (c) iVar2;
                String strU0 = cVar.U0();
                if (strU0 == null || strU0.indexOf(44) >= 0 || strU0.startsWith("*")) {
                    throw new IllegalArgumentException("Illegal context spec:" + strU0);
                }
                if (!strU0.startsWith("/")) {
                    strU0 = '/' + strU0;
                }
                if (strU0.length() > 1) {
                    if (strU0.endsWith("/")) {
                        strU0 = strU0 + "*";
                    } else if (!strU0.endsWith("/*")) {
                        strU0 = strU0 + "/*";
                    }
                }
                Object obj = pathMap.get(strU0);
                String[] strArrD1 = cVar.d1();
                if (strArrD1 != null && strArrD1.length > 0) {
                    if (obj instanceof Map) {
                        map = (Map) obj;
                    } else {
                        HashMap map2 = new HashMap();
                        map2.put("*", obj);
                        pathMap.put(strU0, map2);
                        map = map2;
                    }
                    for (String str : strArrD1) {
                        map.put(str, LazyList.add(map.get(str), iVarArrN[i10]));
                    }
                } else if (obj instanceof Map) {
                    Map map3 = (Map) obj;
                    map3.put("*", LazyList.add(map3.get("*"), iVarArrN[i10]));
                } else {
                    pathMap.put(strU0, LazyList.add(obj, iVarArrN[i10]));
                }
            }
        }
        this.f76531s = pathMap;
    }

    public final String E0(String str) {
        if (str == null) {
            return null;
        }
        return str.endsWith(".") ? str.substring(0, str.length() - 1) : str;
    }

    @Override // oq.f, mq.i
    public void a0(String str, n nVar, an.a aVar, an.c cVar) throws ServletException, IOException {
        c cVarK;
        i[] iVarArrN = N();
        if (iVarArrN == null || iVarArrN.length == 0) {
            return;
        }
        mq.c cVarY = nVar.y();
        if (cVarY.o() && (cVarK = cVarY.k()) != null) {
            cVarK.a0(str, nVar, aVar, cVar);
            return;
        }
        PathMap pathMap = this.f76531s;
        if (pathMap == null || str == null || !str.startsWith("/")) {
            for (i iVar : iVarArrN) {
                iVar.a0(str, nVar, aVar, cVar);
                if (nVar.X()) {
                    return;
                }
            }
            return;
        }
        Object lazyMatches = pathMap.getLazyMatches(str);
        for (int i10 = 0; i10 < LazyList.size(lazyMatches); i10++) {
            Object value = ((Map.Entry) LazyList.get(lazyMatches, i10)).getValue();
            if (value instanceof Map) {
                Map map = (Map) value;
                String strE0 = E0(aVar.s());
                Object obj = map.get(strE0);
                for (int i11 = 0; i11 < LazyList.size(obj); i11++) {
                    ((i) LazyList.get(obj, i11)).a0(str, nVar, aVar, cVar);
                    if (nVar.X()) {
                        return;
                    }
                }
                Object obj2 = map.get("*." + strE0.substring(strE0.indexOf(".") + 1));
                for (int i12 = 0; i12 < LazyList.size(obj2); i12++) {
                    ((i) LazyList.get(obj2, i12)).a0(str, nVar, aVar, cVar);
                    if (nVar.X()) {
                        return;
                    }
                }
                Object obj3 = map.get("*");
                for (int i13 = 0; i13 < LazyList.size(obj3); i13++) {
                    ((i) LazyList.get(obj3, i13)).a0(str, nVar, aVar, cVar);
                    if (nVar.X()) {
                        return;
                    }
                }
            } else {
                for (int i14 = 0; i14 < LazyList.size(value); i14++) {
                    ((i) LazyList.get(value, i14)).a0(str, nVar, aVar, cVar);
                    if (nVar.X()) {
                        return;
                    }
                }
            }
        }
    }

    @Override // oq.f, oq.a, uq.b, uq.a
    public void d0() throws Exception {
        D0();
        super.d0();
    }
}
