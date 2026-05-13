package yads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.random.Random;

/* JADX INFO: loaded from: classes4.dex */
public final class w61 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xo.a f96294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jn f96295b;

    public w61(xo.a aVar, jn jnVar) {
        this.f96294a = aVar;
        this.f96295b = jnVar;
    }

    public final String a(m80 m80Var) {
        xo.a aVar = this.f96294a;
        xo.a.f87008d.a();
        String strB = aVar.b(m80.Companion.serializer(), m80Var);
        this.f96295b.getClass();
        String strA = jn.a(strB);
        if (strA == null) {
            strA = "";
        }
        List listN0 = cn.f0.N0(new zn.c('A', 'Z'), new zn.c('a', 'z'));
        zn.i iVar = new zn.i(1, 3);
        ArrayList arrayList = new ArrayList(cn.x.x(iVar, 10));
        Iterator<Integer> it = iVar.iterator();
        while (it.hasNext()) {
            ((cn.k0) it).nextInt();
            Character ch2 = (Character) cn.f0.Q0(listN0, Random.Default);
            ch2.getClass();
            arrayList.add(ch2);
        }
        return cn.f0.D0(arrayList, "", null, null, 0, null, null, 62, null) + strA;
    }
}
