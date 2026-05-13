package yads;

import com.yandex.div.core.DivKit;
import java.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
public final class mt1 extends wt1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f92567a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pd3 f92568b;

    public mt1(pd3 pd3Var) {
        this.f92568b = pd3Var;
    }

    public final void a(vt1 vt1Var) {
        try {
            pd3 pd3Var = this.f92568b;
            String versionName = DivKit.Companion.getVersionName();
            pd3Var.getClass();
            od3 od3VarA = pd3.a(versionName);
            this.f92568b.getClass();
            od3 od3VarA2 = pd3.a("32.18.1");
            Integer numValueOf = od3VarA2 != null ? Integer.valueOf(od3VarA2.f93188b) : null;
            if (numValueOf != null) {
                int iIntValue = numValueOf.intValue();
                if (od3VarA == null || !(this.f92567a || od3VarA.f93188b == iIntValue)) {
                    Object[] objArr = new Object[2];
                    objArr[0] = numValueOf;
                    objArr[1] = od3VarA != null ? Integer.valueOf(od3VarA.f93188b) : null;
                    String str = String.format("Unsupported DivKit major version. Expected: %s. Actual: %s", Arrays.copyOf(objArr, 2));
                    tn.p.j(str, "format(...)");
                    ub1 ub1Var = new ub1(str, str);
                    vt1Var.getClass();
                    throw ub1Var;
                }
            }
        } catch (NoClassDefFoundError unused) {
            String str2 = String.format("DivKit is unavailable. Please check your buildscripts for exclusion rules for 'com.yandex.div:div'", Arrays.copyOf(new Object[0], 0));
            tn.p.j(str2, "format(...)");
            ub1 ub1Var2 = new ub1(str2, str2);
            vt1Var.getClass();
            throw ub1Var2;
        }
    }
}
