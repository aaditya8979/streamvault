package yads;

import android.os.Bundle;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.ArrayList;
import java.util.Arrays;
import yads.h73;
import yads.xq;

/* JADX INFO: loaded from: classes10.dex */
public final class h73 implements xq {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final wq f90267g = new wq() { // from class: bt.h2
        @Override // yads.wq
        public final xq fromBundle(Bundle bundle) {
            return h73.a(bundle);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f90268b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f90269c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f90270d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final mx0[] f90271e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f90272f;

    public h73(String str, mx0... mx0VarArr) {
        ni.a(mx0VarArr.length > 0);
        this.f90269c = str;
        this.f90271e = mx0VarArr;
        this.f90268b = mx0VarArr.length;
        int iD = ht1.d(mx0VarArr[0].f92610m);
        this.f90270d = iD == -1 ? ht1.d(mx0VarArr[0].f92609l) : iD;
        a();
    }

    public h73(mx0... mx0VarArr) {
        this("", mx0VarArr);
    }

    public static h73 a(Bundle bundle) {
        sm2 sm2VarA;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(Integer.toString(0, 36));
        if (parcelableArrayList == null) {
            m51 m51Var = p51.f93439c;
            sm2VarA = sm2.f94878f;
        } else {
            sm2VarA = yq.a(mx0.I, parcelableArrayList);
        }
        return new h73(bundle.getString(Integer.toString(1, 36), ""), (mx0[]) sm2VarA.toArray(new mx0[0]));
    }

    public final int a(mx0 mx0Var) {
        int i10 = 0;
        while (true) {
            mx0[] mx0VarArr = this.f90271e;
            if (i10 >= mx0VarArr.length) {
                return -1;
            }
            if (mx0Var == mx0VarArr[i10]) {
                return i10;
            }
            i10++;
        }
    }

    public final mx0 a(int i10) {
        return this.f90271e[i10];
    }

    public final void a() {
        String str = this.f90271e[0].f92601d;
        if (str == null || str.equals("und")) {
            str = "";
        }
        int i10 = this.f90271e[0].f92603f | 16384;
        int i11 = 1;
        while (true) {
            mx0[] mx0VarArr = this.f90271e;
            if (i11 >= mx0VarArr.length) {
                return;
            }
            String str2 = mx0VarArr[i11].f92601d;
            if (str2 == null || str2.equals("und")) {
                str2 = "";
            }
            if (!str.equals(str2)) {
                mx0[] mx0VarArr2 = this.f90271e;
                ih1.b("TrackGroup", ih1.a("", new IllegalStateException("Different languages combined in one TrackGroup: '" + mx0VarArr2[0].f92601d + "' (track 0) and '" + mx0VarArr2[i11].f92601d + "' (track " + i11 + ")")));
                return;
            }
            mx0[] mx0VarArr3 = this.f90271e;
            if (i10 != (mx0VarArr3[i11].f92603f | 16384)) {
                ih1.b("TrackGroup", ih1.a("", new IllegalStateException("Different role flags combined in one TrackGroup: '" + Integer.toBinaryString(mx0VarArr3[0].f92603f) + "' (track 0) and '" + Integer.toBinaryString(this.f90271e[i11].f92603f) + "' (track " + i11 + ")")));
                return;
            }
            i11++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h73.class != obj.getClass()) {
            return false;
        }
        h73 h73Var = (h73) obj;
        return this.f90269c.equals(h73Var.f90269c) && Arrays.equals(this.f90271e, h73Var.f90271e);
    }

    public final int hashCode() {
        if (this.f90272f == 0) {
            this.f90272f = k4.a(this.f90269c, IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31) + Arrays.hashCode(this.f90271e);
        }
        return this.f90272f;
    }
}
