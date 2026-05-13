package e7;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.f;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;

/* JADX INFO: compiled from: TrackGroupArray.java */
/* JADX INFO: loaded from: classes3.dex */
public final class i0 implements com.google.android.exoplayer2.f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final i0 f60875e = new i0(new g0[0]);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final f.a<i0> f60876f = new f.a() { // from class: e7.h0
        @Override // com.google.android.exoplayer2.f.a
        public final com.google.android.exoplayer2.f fromBundle(Bundle bundle) {
            return i0.e(bundle);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f60877b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImmutableList<g0> f60878c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f60879d;

    public i0(g0... g0VarArr) {
        this.f60878c = ImmutableList.copyOf(g0VarArr);
        this.f60877b = g0VarArr.length;
        f();
    }

    public static String d(int i10) {
        return Integer.toString(i10, 36);
    }

    public static /* synthetic */ i0 e(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(d(0));
        return parcelableArrayList == null ? new i0(new g0[0]) : new i0((g0[]) s7.c.b(g0.f60865g, parcelableArrayList).toArray(new g0[0]));
    }

    public g0 b(int i10) {
        return this.f60878c.get(i10);
    }

    public int c(g0 g0Var) {
        int iIndexOf = this.f60878c.indexOf(g0Var);
        if (iIndexOf >= 0) {
            return iIndexOf;
        }
        return -1;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i0.class != obj.getClass()) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return this.f60877b == i0Var.f60877b && this.f60878c.equals(i0Var.f60878c);
    }

    public final void f() {
        int i10 = 0;
        while (i10 < this.f60878c.size()) {
            int i11 = i10 + 1;
            for (int i12 = i11; i12 < this.f60878c.size(); i12++) {
                if (this.f60878c.get(i10).equals(this.f60878c.get(i12))) {
                    s7.q.d("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i10 = i11;
        }
    }

    public int hashCode() {
        if (this.f60879d == 0) {
            this.f60879d = this.f60878c.hashCode();
        }
        return this.f60879d;
    }

    @Override // com.google.android.exoplayer2.f
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(d(0), s7.c.d(this.f60878c));
        return bundle;
    }
}
