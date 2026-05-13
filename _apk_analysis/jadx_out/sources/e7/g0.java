package e7;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.f;
import com.google.common.collect.ImmutableList;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: TrackGroup.java */
/* JADX INFO: loaded from: classes3.dex */
public final class g0 implements com.google.android.exoplayer2.f {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final f.a<g0> f60865g = new f.a() { // from class: e7.f0
        @Override // com.google.android.exoplayer2.f.a
        public final com.google.android.exoplayer2.f fromBundle(Bundle bundle) {
            return g0.f(bundle);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f60866b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f60867c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f60868d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.google.android.exoplayer2.m[] f60869e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f60870f;

    public g0(String str, com.google.android.exoplayer2.m... mVarArr) {
        s7.a.a(mVarArr.length > 0);
        this.f60867c = str;
        this.f60869e = mVarArr;
        this.f60866b = mVarArr.length;
        int i10 = s7.u.i(mVarArr[0].f21751m);
        this.f60868d = i10 == -1 ? s7.u.i(mVarArr[0].f21750l) : i10;
        j();
    }

    public g0(com.google.android.exoplayer2.m... mVarArr) {
        this("", mVarArr);
    }

    public static String e(int i10) {
        return Integer.toString(i10, 36);
    }

    public static /* synthetic */ g0 f(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(e(0));
        return new g0(bundle.getString(e(1), ""), (com.google.android.exoplayer2.m[]) (parcelableArrayList == null ? ImmutableList.of() : s7.c.b(com.google.android.exoplayer2.m.I, parcelableArrayList)).toArray(new com.google.android.exoplayer2.m[0]));
    }

    public static void g(String str, @Nullable String str2, @Nullable String str3, int i10) {
        s7.q.d("TrackGroup", "", new IllegalStateException("Different " + str + " combined in one TrackGroup: '" + str2 + "' (track 0) and '" + str3 + "' (track " + i10 + ")"));
    }

    public static String h(@Nullable String str) {
        return (str == null || str.equals("und")) ? "" : str;
    }

    public static int i(int i10) {
        return i10 | 16384;
    }

    @CheckResult
    public g0 b(String str) {
        return new g0(str, this.f60869e);
    }

    public com.google.android.exoplayer2.m c(int i10) {
        return this.f60869e[i10];
    }

    public int d(com.google.android.exoplayer2.m mVar) {
        int i10 = 0;
        while (true) {
            com.google.android.exoplayer2.m[] mVarArr = this.f60869e;
            if (i10 >= mVarArr.length) {
                return -1;
            }
            if (mVar == mVarArr[i10]) {
                return i10;
            }
            i10++;
        }
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g0.class != obj.getClass()) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return this.f60867c.equals(g0Var.f60867c) && Arrays.equals(this.f60869e, g0Var.f60869e);
    }

    public int hashCode() {
        if (this.f60870f == 0) {
            this.f60870f = ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f60867c.hashCode()) * 31) + Arrays.hashCode(this.f60869e);
        }
        return this.f60870f;
    }

    public final void j() {
        String strH = h(this.f60869e[0].f21742d);
        int i10 = i(this.f60869e[0].f21744f);
        int i11 = 1;
        while (true) {
            com.google.android.exoplayer2.m[] mVarArr = this.f60869e;
            if (i11 >= mVarArr.length) {
                return;
            }
            if (!strH.equals(h(mVarArr[i11].f21742d))) {
                com.google.android.exoplayer2.m[] mVarArr2 = this.f60869e;
                g("languages", mVarArr2[0].f21742d, mVarArr2[i11].f21742d, i11);
                return;
            } else {
                if (i10 != i(this.f60869e[i11].f21744f)) {
                    g("role flags", Integer.toBinaryString(this.f60869e[0].f21744f), Integer.toBinaryString(this.f60869e[i11].f21744f), i11);
                    return;
                }
                i11++;
            }
        }
    }

    @Override // com.google.android.exoplayer2.f
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(this.f60869e.length);
        for (com.google.android.exoplayer2.m mVar : this.f60869e) {
            arrayList.add(mVar.j(true));
        }
        bundle.putParcelableArrayList(e(0), arrayList);
        bundle.putString(e(1), this.f60867c);
        return bundle;
    }
}
