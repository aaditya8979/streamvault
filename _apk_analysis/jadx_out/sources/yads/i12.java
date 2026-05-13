package yads;

import com.ironsource.Q6;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class i12 implements fq2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d4 f90629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t22 f90630b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jr1 f90631c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public v9 f90632d;

    public /* synthetic */ i12(d4 d4Var) {
        this(d4Var, new f22(), new jr1());
    }

    public i12(d4 d4Var, t22 t22Var, jr1 jr1Var) {
        this.f90629a = d4Var;
        this.f90630b = t22Var;
        this.f90631c = jr1Var;
    }

    public final fo2 a() {
        fo2 fo2Var;
        fo2 fo2Var2 = new fo2((Map) null, 3);
        v9 v9Var = this.f90632d;
        if (v9Var == null) {
            return fo2Var2;
        }
        fo2 fo2VarA = go2.a(fo2Var2, this.f90630b.a(v9Var, this.f90629a, (d12) v9Var.f96009t));
        qq1 qq1Var = this.f90629a.f88750k;
        jr1 jr1Var = this.f90631c;
        if (qq1Var != null) {
            jr1Var.getClass();
            fo2Var = jr1.a(qq1Var);
        } else {
            jr1Var.getClass();
            fo2Var = new fo2(new LinkedHashMap(), 2);
            fo2Var.b(bo2.f88105a, Q6.G1);
        }
        return go2.a(fo2VarA, fo2Var);
    }

    public final void a(v9 v9Var) {
        this.f90632d = v9Var;
    }
}
