package yads;

import android.content.Context;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class dh1 {
    public static ArrayList a(Context context) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new qe1(context, new eh1()));
        Object obj = dw2.f89000j;
        nt2 nt2VarA = cw2.a().a(context);
        if (nt2VarA != null && !nt2VarA.f92948g) {
            if (a01.f87532b == null) {
                synchronized (a01.f87531a) {
                    if (a01.f87532b == null) {
                        a01.f87532b = new xy0(context, "com.google.android.gms.location.LocationServices");
                    }
                    bn.r rVar = bn.r.f5635a;
                }
            }
            xy0 xy0Var = a01.f87532b;
            if (xy0Var == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            arrayList.add(xy0Var);
            arrayList.add(y01.a(context));
        }
        return arrayList;
    }
}
