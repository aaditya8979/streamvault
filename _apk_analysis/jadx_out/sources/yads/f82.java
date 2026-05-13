package yads;

import java.util.Map;
import org.json.JSONException;

/* JADX INFO: loaded from: classes9.dex */
public final class f82 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fm2 f89514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hm2 f89515b;

    public /* synthetic */ f82() {
        this(new fm2(), hm2.f90465b.a());
    }

    public f82(fm2 fm2Var, hm2 hm2Var) {
        this.f89514a = fm2Var;
        this.f89515b = hm2Var;
    }

    public final e82 a(po2 po2Var) {
        String str;
        hm2 hm2Var = this.f89515b;
        hm2Var.getClass();
        synchronized (hm2.f90466c) {
            str = (String) hm2Var.f90468a.get(po2Var);
            hm2Var.f90468a.remove(po2Var);
        }
        if (str == null) {
            return null;
        }
        try {
            this.f89514a.getClass();
            dm2 dm2VarA = fm2.a(str);
            byte[] bytes = dm2VarA.f88917b.getBytes(bo.c.f5639b);
            tn.p.j(bytes, "getBytes(...)");
            Map map = dm2VarA.f88916a;
            return new e82(200, bytes, map, e82.a(map), false);
        } catch (JSONException unused) {
            return null;
        }
    }
}
