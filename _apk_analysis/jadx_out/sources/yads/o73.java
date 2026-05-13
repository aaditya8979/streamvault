package yads;

import android.os.Bundle;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import yads.o73;
import yads.xq;

/* JADX INFO: loaded from: classes9.dex */
public final class o73 implements xq {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final wq f93138d = new wq() { // from class: bt.f7
        @Override // yads.wq
        public final xq fromBundle(Bundle bundle) {
            return o73.a(bundle);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h73 f93139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p51 f93140c;

    public o73(h73 h73Var, List list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= h73Var.f90268b)) {
            throw new IndexOutOfBoundsException();
        }
        this.f93139b = h73Var;
        this.f93140c = p51.a((Collection) list);
    }

    public static o73 a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(Integer.toString(0, 36));
        bundle2.getClass();
        h73 h73Var = (h73) h73.f90267g.fromBundle(bundle2);
        int[] intArray = bundle.getIntArray(Integer.toString(1, 36));
        intArray.getClass();
        return new o73(h73Var, intArray.length == 0 ? Collections.emptyList() : new sd1(0, intArray.length, intArray));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o73.class != obj.getClass()) {
            return false;
        }
        o73 o73Var = (o73) obj;
        return this.f93139b.equals(o73Var.f93139b) && this.f93140c.equals(o73Var.f93140c);
    }

    public final int hashCode() {
        return (this.f93140c.hashCode() * 31) + this.f93139b.hashCode();
    }
}
