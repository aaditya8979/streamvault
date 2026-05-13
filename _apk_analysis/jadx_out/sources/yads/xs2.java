package yads;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class xs2 implements y9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v9 f96863a;

    public xs2(v9 v9Var) {
        this.f96863a = v9Var;
    }

    @Override // yads.y9
    public final fo2 a() {
        fo2 fo2Var = new fo2((Map) null, 3);
        fo2Var.b(this.f96863a.f96001l, "ad_source");
        fo2Var.b(this.f96863a.f95991b, "ad_type_format");
        fo2Var.b(this.f96863a.f95994e, "ad_unit_id");
        fo2Var.b(this.f96863a.f95993d, "product_type");
        fo2Var.a(this.f96863a.f96004o, "server_log_id");
        fo2Var.b(this.f96863a.c().f92996a.f97849b, "size_type");
        fo2Var.b(Integer.valueOf(this.f96863a.c().f92998c), "width");
        fo2Var.b(Integer.valueOf(this.f96863a.c().f92999d), "height");
        fo2Var.f89653b = this.f96863a.f95998i;
        return fo2Var;
    }
}
