package yads;

import android.content.Context;
import java.util.Map;
import org.json.JSONException;

/* JADX INFO: loaded from: classes11.dex */
public final class h12 implements eq2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nm3 f90196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a42 f90197b;

    public /* synthetic */ h12(Context context, at1 at1Var) {
        this(d82.a(), new a42(context, at1Var));
    }

    public h12(nm3 nm3Var, a42 a42Var) {
        this.f90196a = nm3Var;
        this.f90197b = a42Var;
    }

    @Override // yads.eq2
    public final Object a(e82 e82Var) {
        nm3 nm3Var = this.f90196a;
        nm3Var.f92890a.getClass();
        int i10 = e82Var.f89157a;
        xp2 xp2Var = new xp2(e82Var.f89158b);
        Map mapJ = e82Var.f89159c;
        if (mapJ == null) {
            mapJ = kotlin.collections.a.j();
        }
        String strA = ((h82) nm3Var.f92891b).a(new wp2(i10, xp2Var, mapJ));
        if (strA != null && strA.length() != 0) {
            Map mapJ2 = e82Var.f89159c;
            if (mapJ2 == null) {
                mapJ2 = kotlin.collections.a.j();
            }
            try {
                return this.f90197b.a(strA, new kn(mapJ2));
            } catch (JSONException e10) {
                bn.d.b(e10);
                boolean z10 = ad1.f87661a;
            } catch (z02 e11) {
                bn.d.b(e11);
                boolean z11 = ad1.f87661a;
            }
        }
        return null;
    }
}
