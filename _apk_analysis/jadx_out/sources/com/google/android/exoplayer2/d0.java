package com.google.android.exoplayer2;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.d0;
import com.google.android.exoplayer2.f;
import com.google.common.collect.ImmutableList;
import e7.g0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: Tracks.java */
/* JADX INFO: loaded from: classes4.dex */
public final class d0 implements f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d0 f21420c = new d0(ImmutableList.of());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f.a<d0> f21421d = new f.a() { // from class: d6.e2
        @Override // com.google.android.exoplayer2.f.a
        public final com.google.android.exoplayer2.f fromBundle(Bundle bundle) {
            return com.google.android.exoplayer2.d0.f(bundle);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImmutableList<a> f21422b;

    /* JADX INFO: compiled from: Tracks.java */
    public static final class a implements f {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final f.a<a> f21423g = new f.a() { // from class: d6.f2
            @Override // com.google.android.exoplayer2.f.a
            public final com.google.android.exoplayer2.f fromBundle(Bundle bundle) {
                return d0.a.j(bundle);
            }
        };

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f21424b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final g0 f21425c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f21426d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int[] f21427e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean[] f21428f;

        public a(g0 g0Var, boolean z10, int[] iArr, boolean[] zArr) {
            int i10 = g0Var.f60866b;
            this.f21424b = i10;
            boolean z11 = false;
            s7.a.a(i10 == iArr.length && i10 == zArr.length);
            this.f21425c = g0Var;
            if (z10 && i10 > 1) {
                z11 = true;
            }
            this.f21426d = z11;
            this.f21427e = (int[]) iArr.clone();
            this.f21428f = (boolean[]) zArr.clone();
        }

        public static String i(int i10) {
            return Integer.toString(i10, 36);
        }

        public static /* synthetic */ a j(Bundle bundle) {
            g0 g0Var = (g0) g0.f60865g.fromBundle((Bundle) s7.a.e(bundle.getBundle(i(0))));
            return new a(g0Var, bundle.getBoolean(i(4), false), (int[]) y7.g.a(bundle.getIntArray(i(1)), new int[g0Var.f60866b]), (boolean[]) y7.g.a(bundle.getBooleanArray(i(3)), new boolean[g0Var.f60866b]));
        }

        public g0 b() {
            return this.f21425c;
        }

        public m c(int i10) {
            return this.f21425c.c(i10);
        }

        public boolean d() {
            return this.f21426d;
        }

        public boolean e() {
            return b8.a.b(this.f21428f, true);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f21426d == aVar.f21426d && this.f21425c.equals(aVar.f21425c) && Arrays.equals(this.f21427e, aVar.f21427e) && Arrays.equals(this.f21428f, aVar.f21428f);
        }

        public boolean f(int i10) {
            return this.f21428f[i10];
        }

        public boolean g(int i10) {
            return h(i10, false);
        }

        public int getType() {
            return this.f21425c.f60868d;
        }

        public boolean h(int i10, boolean z10) {
            int i11 = this.f21427e[i10];
            return i11 == 4 || (z10 && i11 == 3);
        }

        public int hashCode() {
            return (((((this.f21425c.hashCode() * 31) + (this.f21426d ? 1 : 0)) * 31) + Arrays.hashCode(this.f21427e)) * 31) + Arrays.hashCode(this.f21428f);
        }

        @Override // com.google.android.exoplayer2.f
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putBundle(i(0), this.f21425c.toBundle());
            bundle.putIntArray(i(1), this.f21427e);
            bundle.putBooleanArray(i(3), this.f21428f);
            bundle.putBoolean(i(4), this.f21426d);
            return bundle;
        }
    }

    public d0(List<a> list) {
        this.f21422b = ImmutableList.copyOf((Collection) list);
    }

    public static String e(int i10) {
        return Integer.toString(i10, 36);
    }

    public static /* synthetic */ d0 f(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(e(0));
        return new d0(parcelableArrayList == null ? ImmutableList.of() : s7.c.b(a.f21423g, parcelableArrayList));
    }

    public ImmutableList<a> b() {
        return this.f21422b;
    }

    public boolean c() {
        return this.f21422b.isEmpty();
    }

    public boolean d(int i10) {
        for (int i11 = 0; i11 < this.f21422b.size(); i11++) {
            a aVar = this.f21422b.get(i11);
            if (aVar.e() && aVar.getType() == i10) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d0.class != obj.getClass()) {
            return false;
        }
        return this.f21422b.equals(((d0) obj).f21422b);
    }

    public int hashCode() {
        return this.f21422b.hashCode();
    }

    @Override // com.google.android.exoplayer2.f
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(e(0), s7.c.d(this.f21422b));
        return bundle;
    }
}
