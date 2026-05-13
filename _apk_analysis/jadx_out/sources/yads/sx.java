package yads;

import com.ironsource.C3978d4;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class sx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final aq2 f94977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n9 f94978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wy f94979c;

    public /* synthetic */ sx() {
        this(new aq2(), new n9(), new wy());
    }

    public sx(aq2 aq2Var, n9 n9Var, wy wyVar) {
        this.f94977a = aq2Var;
        this.f94978b = n9Var;
        this.f94979c = wyVar;
    }

    public final fo2 a(v9 v9Var, d4 d4Var) {
        fo2 fo2VarB = this.f94977a.b(v9Var, d4Var);
        fo2 fo2VarA = this.f94978b.a(d4Var.f88744e);
        wy wyVar = this.f94979c;
        wyVar.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!tn.y.m(linkedHashMap)) {
            linkedHashMap = null;
        }
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap();
        }
        xa2 xa2Var = wyVar.f96559a;
        int i10 = d4Var.f88753n;
        xa2Var.getClass();
        linkedHashMap.put("orientation", i10 != 1 ? i10 != 2 ? "undefined" : C3978d4.i.C : C3978d4.i.D);
        fo2 fo2VarA2 = go2.a(fo2VarB, fo2VarA);
        c cVar = fo2VarA2.f89653b;
        return new fo2(kotlin.collections.a.q(fo2VarA2.f89652a, linkedHashMap), cVar != null ? cVar : null);
    }
}
