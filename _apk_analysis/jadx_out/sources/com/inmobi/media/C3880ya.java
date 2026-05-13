package com.inmobi.media;

import com.inmobi.media.C3880ya;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.inmobi.media.ya, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3880ya {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p000do.l0 f28575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f28576b;

    public C3880ya(p000do.l0 l0Var) {
        tn.p.k(l0Var, "coroutineScope");
        this.f28575a = l0Var;
        this.f28576b = Collections.synchronizedMap(new LinkedHashMap());
    }

    public static final bn.r a(C3880ya c3880ya, String str, kotlinx.coroutines.g gVar, Throwable th2) {
        List list = (List) c3880ya.f28576b.get(str);
        if (list != null) {
            list.remove(gVar);
        }
        return bn.r.f5635a;
    }

    public final void a(final String str, sn.p pVar) {
        tn.p.k(str, "id");
        tn.p.k(pVar, "block");
        final kotlinx.coroutines.g gVarD = p000do.i.d(this.f28575a, null, null, new C3855xa(pVar, null), 3, null);
        Map map = this.f28576b;
        tn.p.j(map, "jobMap");
        Object objSynchronizedList = map.get(str);
        if (objSynchronizedList == null) {
            objSynchronizedList = Collections.synchronizedList(new ArrayList());
            map.put(str, objSynchronizedList);
        }
        ((List) objSynchronizedList).add(gVarD);
        gVarD.f(new sn.l() { // from class: n9.oc
            @Override // sn.l
            public final Object invoke(Object obj) {
                return C3880ya.a(this.f75553b, str, gVarD, (Throwable) obj);
            }
        });
    }
}
