package yads;

import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;

/* JADX INFO: loaded from: classes3.dex */
public final class ij {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e00 f90851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f90852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r2 f90853c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y9 f90854d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public i22 f90855e;

    public ij(e00 e00Var, String str, r2 r2Var, y9 y9Var) {
        this.f90851a = e00Var;
        this.f90852b = str;
        this.f90853c = r2Var;
        this.f90854d = y9Var;
    }

    public /* synthetic */ ij(o5 o5Var, e00 e00Var, String str) {
        this(e00Var, str, o5Var.a(), o5Var.b());
    }

    public final fo2 a() {
        fo2 fo2VarA = this.f90854d.a();
        fo2VarA.b(this.f90851a.f89049b, "ad_type");
        fo2VarA.a(this.f90852b, CreativeInfo.f52474c);
        fo2VarA.f89652a.putAll(this.f90853c.a());
        i22 i22Var = this.f90855e;
        return i22Var != null ? go2.a(fo2VarA, i22Var.a()) : fo2VarA;
    }
}
