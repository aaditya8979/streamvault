package yads;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class j83 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final za f91126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bv f91127b;

    public /* synthetic */ j83(za zaVar) {
        this(zaVar, new bv());
    }

    public j83(za zaVar, bv bvVar) {
        this.f91126a = zaVar;
        this.f91127b = bvVar;
    }

    public final void a(List list, yu yuVar) {
        this.f91127b.f88153a.getClass();
        Map mapG = cn.p0.g(bn.h.a("{CLICK_DEST}", av.a(yuVar)));
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                za zaVar = this.f91126a;
                dd2 dd2Var = new dd2(zaVar.f97442c, zaVar.f97440a, zaVar.f97441b, k83.f91513d);
                if (str.length() > 0) {
                    za.f97439d.execute(new ya(str, dd2Var, mapG));
                }
            }
        }
    }
}
