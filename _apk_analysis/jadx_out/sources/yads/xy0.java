package yads;

import android.content.Context;
import android.location.Location;

/* JADX INFO: loaded from: classes2.dex */
public final class xy0 implements ch1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hh1 f96926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f96927b;

    public /* synthetic */ xy0(Context context, String str) {
        this(new hh1(context, str));
    }

    public xy0(hh1 hh1Var) {
        this.f96926a = hh1Var;
        this.f96927b = new Object();
    }

    @Override // yads.ch1
    public final Location a() {
        Location location;
        synchronized (this.f96927b) {
            hh1 hh1Var = this.f96926a;
            gh1 gh1VarA = hh1Var.f90418c;
            if (gh1VarA == null) {
                gh1VarA = hh1Var.a();
            }
            if (gh1VarA != null) {
                Object objA = om2.a(gh1VarA.f89984a, "isComplete", new Object[0]);
                Boolean bool = objA instanceof Boolean ? (Boolean) objA : null;
                if (bool != null && bool.booleanValue()) {
                    Object objA2 = om2.a(gh1VarA.f89984a, "getResult", new Object[0]);
                    location = objA2 instanceof Location ? (Location) objA2 : null;
                    hh1 hh1Var2 = this.f96926a;
                    hh1Var2.f90418c = hh1Var2.a();
                    hh1Var2.f90418c = hh1Var2.a();
                }
            }
        }
        return location;
    }
}
