package yads;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class bq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v9 f88108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final io2 f88109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ij f88110c;

    public /* synthetic */ bq(o5 o5Var, e00 e00Var, v9 v9Var, String str, at1 at1Var) {
        this(v9Var, at1Var, new ij(o5Var, e00Var, str));
    }

    public bq(v9 v9Var, at1 at1Var, ij ijVar) {
        this.f88108a = v9Var;
        this.f88109b = at1Var;
        this.f88110c = ijVar;
    }

    public final void a(String str) {
        fo2 fo2VarA = this.f88110c.a();
        fo2VarA.b("no_view_for_asset", "reason");
        fo2VarA.b(str, "asset_name");
        Map map = this.f88108a.f96010u;
        if (map != null) {
            fo2VarA.f89652a.putAll(map);
        }
        c cVar = this.f88108a.f95998i;
        fo2VarA.f89653b = cVar;
        this.f88109b.a(new eo2(co2.A.a(), kotlin.collections.a.C(fo2VarA.f89652a), cVar));
    }
}
