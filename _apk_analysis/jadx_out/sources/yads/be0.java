package yads;

import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class be0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zl2 f87971a;

    public /* synthetic */ be0() {
        this(new zl2());
    }

    public be0(zl2 zl2Var) {
        this.f87971a = zl2Var;
    }

    public final String a(String str, Map map) {
        Map mapQ = kotlin.collections.a.q(map, cn.p0.g(bn.h.a("{CLIENT_TIME}", String.valueOf(System.currentTimeMillis()))));
        this.f87971a.getClass();
        String strS = str;
        for (Map.Entry entry : mapQ.entrySet()) {
            strS = bo.a0.S(strS, (String) entry.getKey(), (String) entry.getValue(), false, 4, null);
        }
        return strS;
    }
}
