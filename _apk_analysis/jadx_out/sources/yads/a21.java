package yads;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class a21 extends ho {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ho f87551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fb3 f87552b;

    public a21(qt1 qt1Var, fb3 fb3Var) {
        this.f87551a = qt1Var;
        this.f87552b = fb3Var;
    }

    @Override // yads.ho
    public final y11 a(po2 po2Var, Map map) {
        HashMap map2 = new HashMap();
        map2.putAll(map);
        u11 u11Var = u11.f95481c;
        map2.put("User-Agent", ((l53) this.f87552b.f89523a).a());
        return this.f87551a.a(po2Var, map2);
    }
}
