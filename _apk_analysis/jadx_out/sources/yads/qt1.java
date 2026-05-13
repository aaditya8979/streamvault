package yads;

import java.util.ArrayList;
import java.util.Map;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes3.dex */
public final class qt1 extends ho {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cm2 f94147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f82 f94148b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z11 f94149c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d21 f94150d;

    public qt1(SSLSocketFactory sSLSocketFactory, cm2 cm2Var, f82 f82Var, z11 z11Var, e21 e21Var) {
        this.f94147a = cm2Var;
        this.f94148b = f82Var;
        this.f94149c = z11Var;
        e21Var.getClass();
        this.f94150d = e21.a(sSLSocketFactory);
    }

    @Override // yads.ho
    public final y11 a(po2 po2Var, Map map) {
        boolean z10;
        synchronized (eu1.f89373a) {
            z10 = eu1.f89374b;
        }
        return z10 ? (y11) new pt1(this, map).invoke(po2Var) : b(po2Var, map);
    }

    public final y11 b(po2 po2Var, Map map) {
        e82 e82VarA = this.f94148b.a(po2Var);
        if (e82VarA == null) {
            return this.f94150d.a(po2Var, map);
        }
        this.f94147a.getClass();
        ArrayList arrayList = new ArrayList();
        Map map2 = e82VarA.f89159c;
        if (map2 != null) {
            for (Map.Entry entry : map2.entrySet()) {
                arrayList.add(new q01((String) entry.getKey(), (String) entry.getValue()));
            }
        }
        return new y11(e82VarA.f89157a, arrayList, e82VarA.f89158b);
    }
}
