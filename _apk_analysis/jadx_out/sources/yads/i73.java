package yads;

import android.os.Bundle;
import java.util.ArrayList;
import yads.i73;
import yads.xq;

/* JADX INFO: loaded from: classes12.dex */
public final class i73 implements xq {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final i73 f90693e = new i73(new h73[0]);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final wq f90694f = new wq() { // from class: bt.q2
        @Override // yads.wq
        public final xq fromBundle(Bundle bundle) {
            return i73.a(bundle);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f90695b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final sm2 f90696c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f90697d;

    public i73(h73... h73VarArr) {
        this.f90696c = p51.b(h73VarArr);
        this.f90695b = h73VarArr.length;
        a();
    }

    public static i73 a(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(Integer.toString(0, 36));
        return parcelableArrayList == null ? new i73(new h73[0]) : new i73((h73[]) yq.a(h73.f90267g, parcelableArrayList).toArray(new h73[0]));
    }

    public final h73 a(int i10) {
        return (h73) this.f90696c.get(i10);
    }

    public final void a() {
        int i10 = 0;
        while (i10 < this.f90696c.size()) {
            int i11 = i10 + 1;
            for (int i12 = i11; i12 < this.f90696c.size(); i12++) {
                if (((h73) this.f90696c.get(i10)).equals(this.f90696c.get(i12))) {
                    ih1.a("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i10 = i11;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i73.class != obj.getClass()) {
            return false;
        }
        i73 i73Var = (i73) obj;
        return this.f90695b == i73Var.f90695b && this.f90696c.equals(i73Var.f90696c);
    }

    public final int hashCode() {
        if (this.f90697d == 0) {
            this.f90697d = this.f90696c.hashCode();
        }
        return this.f90697d;
    }
}
