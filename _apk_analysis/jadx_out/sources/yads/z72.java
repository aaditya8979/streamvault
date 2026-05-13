package yads;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class z72 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d4 f97416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v9 f97417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f97418c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b51 f97419d;

    public /* synthetic */ z72(d4 d4Var, v9 v9Var, List list) {
        this(d4Var, v9Var, list, new b51());
    }

    public z72(d4 d4Var, v9 v9Var, List list, b51 b51Var) {
        this.f97416a = d4Var;
        this.f97417b = v9Var;
        this.f97418c = list;
        this.f97419d = b51Var;
    }

    public final boolean a() {
        if (this.f97416a.f88752m) {
            if (!this.f97417b.B) {
                return true;
            }
            Set setA = this.f97419d.a(this.f97418c);
            if (!setA.isEmpty()) {
                Iterator it = setA.iterator();
                while (it.hasNext()) {
                    if (!((u41) it.next()).f95552f) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
