package com.google.android.exoplayer2;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.c0;
import com.google.android.exoplayer2.f;
import com.google.android.exoplayer2.p;
import com.google.common.collect.ImmutableList;
import com.vungle.ads.internal.protos.Sdk;
import f7.c;
import java.util.ArrayList;
import s7.m0;

/* JADX INFO: compiled from: Timeline.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class c0 implements f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c0 f21384b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f.a<c0> f21385c = new f.a() { // from class: d6.b2
        @Override // com.google.android.exoplayer2.f.a
        public final com.google.android.exoplayer2.f fromBundle(Bundle bundle) {
            return com.google.android.exoplayer2.c0.b(bundle);
        }
    };

    /* JADX INFO: compiled from: Timeline.java */
    public class a extends c0 {
        @Override // com.google.android.exoplayer2.c0
        public int f(Object obj) {
            return -1;
        }

        @Override // com.google.android.exoplayer2.c0
        public b k(int i10, b bVar, boolean z10) {
            throw new IndexOutOfBoundsException();
        }

        @Override // com.google.android.exoplayer2.c0
        public int m() {
            return 0;
        }

        @Override // com.google.android.exoplayer2.c0
        public Object q(int i10) {
            throw new IndexOutOfBoundsException();
        }

        @Override // com.google.android.exoplayer2.c0
        public d s(int i10, d dVar, long j10) {
            throw new IndexOutOfBoundsException();
        }

        @Override // com.google.android.exoplayer2.c0
        public int t() {
            return 0;
        }
    }

    /* JADX INFO: compiled from: Timeline.java */
    public static final class b implements f {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final f.a<b> f21386i = new f.a() { // from class: d6.c2
            @Override // com.google.android.exoplayer2.f.a
            public final com.google.android.exoplayer2.f fromBundle(Bundle bundle) {
                return c0.b.c(bundle);
            }
        };

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public Object f21387b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public Object f21388c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f21389d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f21390e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f21391f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f21392g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public f7.c f21393h = f7.c.f61578h;

        public static b c(Bundle bundle) {
            int i10 = bundle.getInt(u(0), 0);
            long j10 = bundle.getLong(u(1), -9223372036854775807L);
            long j11 = bundle.getLong(u(2), 0L);
            boolean z10 = bundle.getBoolean(u(3));
            Bundle bundle2 = bundle.getBundle(u(4));
            f7.c cVar = bundle2 != null ? (f7.c) f7.c.f61580j.fromBundle(bundle2) : f7.c.f61578h;
            b bVar = new b();
            bVar.w(null, null, i10, j10, j11, cVar, z10);
            return bVar;
        }

        public static String u(int i10) {
            return Integer.toString(i10, 36);
        }

        public int d(int i10) {
            return this.f21393h.c(i10).f61589c;
        }

        public long e(int i10, int i11) {
            c.a aVarC = this.f21393h.c(i10);
            if (aVarC.f61589c != -1) {
                return aVarC.f61593g[i11];
            }
            return -9223372036854775807L;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !b.class.equals(obj.getClass())) {
                return false;
            }
            b bVar = (b) obj;
            return m0.c(this.f21387b, bVar.f21387b) && m0.c(this.f21388c, bVar.f21388c) && this.f21389d == bVar.f21389d && this.f21390e == bVar.f21390e && this.f21391f == bVar.f21391f && this.f21392g == bVar.f21392g && m0.c(this.f21393h, bVar.f21393h);
        }

        public int f() {
            return this.f21393h.f61582c;
        }

        public int g(long j10) {
            return this.f21393h.d(j10, this.f21390e);
        }

        public int h(long j10) {
            return this.f21393h.e(j10, this.f21390e);
        }

        public int hashCode() {
            Object obj = this.f21387b;
            int iHashCode = (Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE + (obj == null ? 0 : obj.hashCode())) * 31;
            Object obj2 = this.f21388c;
            int iHashCode2 = (((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.f21389d) * 31;
            long j10 = this.f21390e;
            int i10 = (iHashCode2 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
            long j11 = this.f21391f;
            return ((((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f21392g ? 1 : 0)) * 31) + this.f21393h.hashCode();
        }

        public long i(int i10) {
            return this.f21393h.c(i10).f61588b;
        }

        public long j() {
            return this.f21393h.f61583d;
        }

        public int k(int i10, int i11) {
            c.a aVarC = this.f21393h.c(i10);
            if (aVarC.f61589c != -1) {
                return aVarC.f61592f[i11];
            }
            return 0;
        }

        public long l(int i10) {
            return this.f21393h.c(i10).f61594h;
        }

        public long m() {
            return this.f21390e;
        }

        public int n(int i10) {
            return this.f21393h.c(i10).e();
        }

        public int o(int i10, int i11) {
            return this.f21393h.c(i10).f(i11);
        }

        public long p() {
            return m0.Q0(this.f21391f);
        }

        public long q() {
            return this.f21391f;
        }

        public int r() {
            return this.f21393h.f61585f;
        }

        public boolean s(int i10) {
            return !this.f21393h.c(i10).g();
        }

        public boolean t(int i10) {
            return this.f21393h.c(i10).f61595i;
        }

        @Override // com.google.android.exoplayer2.f
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putInt(u(0), this.f21389d);
            bundle.putLong(u(1), this.f21390e);
            bundle.putLong(u(2), this.f21391f);
            bundle.putBoolean(u(3), this.f21392g);
            bundle.putBundle(u(4), this.f21393h.toBundle());
            return bundle;
        }

        public b v(@Nullable Object obj, @Nullable Object obj2, int i10, long j10, long j11) {
            return w(obj, obj2, i10, j10, j11, f7.c.f61578h, false);
        }

        public b w(@Nullable Object obj, @Nullable Object obj2, int i10, long j10, long j11, f7.c cVar, boolean z10) {
            this.f21387b = obj;
            this.f21388c = obj2;
            this.f21389d = i10;
            this.f21390e = j10;
            this.f21391f = j11;
            this.f21393h = cVar;
            this.f21392g = z10;
            return this;
        }
    }

    /* JADX INFO: compiled from: Timeline.java */
    public static final class c extends c0 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final ImmutableList<d> f21394d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final ImmutableList<b> f21395e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int[] f21396f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int[] f21397g;

        public c(ImmutableList<d> immutableList, ImmutableList<b> immutableList2, int[] iArr) {
            s7.a.a(immutableList.size() == iArr.length);
            this.f21394d = immutableList;
            this.f21395e = immutableList2;
            this.f21396f = iArr;
            this.f21397g = new int[iArr.length];
            for (int i10 = 0; i10 < iArr.length; i10++) {
                this.f21397g[iArr[i10]] = i10;
            }
        }

        @Override // com.google.android.exoplayer2.c0
        public int e(boolean z10) {
            if (u()) {
                return -1;
            }
            if (z10) {
                return this.f21396f[0];
            }
            return 0;
        }

        @Override // com.google.android.exoplayer2.c0
        public int f(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.android.exoplayer2.c0
        public int g(boolean z10) {
            if (u()) {
                return -1;
            }
            return z10 ? this.f21396f[t() - 1] : t() - 1;
        }

        @Override // com.google.android.exoplayer2.c0
        public int i(int i10, int i11, boolean z10) {
            if (i11 == 1) {
                return i10;
            }
            if (i10 != g(z10)) {
                return z10 ? this.f21396f[this.f21397g[i10] + 1] : i10 + 1;
            }
            if (i11 == 2) {
                return e(z10);
            }
            return -1;
        }

        @Override // com.google.android.exoplayer2.c0
        public b k(int i10, b bVar, boolean z10) {
            b bVar2 = this.f21395e.get(i10);
            bVar.w(bVar2.f21387b, bVar2.f21388c, bVar2.f21389d, bVar2.f21390e, bVar2.f21391f, bVar2.f21393h, bVar2.f21392g);
            return bVar;
        }

        @Override // com.google.android.exoplayer2.c0
        public int m() {
            return this.f21395e.size();
        }

        @Override // com.google.android.exoplayer2.c0
        public int p(int i10, int i11, boolean z10) {
            if (i11 == 1) {
                return i10;
            }
            if (i10 != e(z10)) {
                return z10 ? this.f21396f[this.f21397g[i10] - 1] : i10 - 1;
            }
            if (i11 == 2) {
                return g(z10);
            }
            return -1;
        }

        @Override // com.google.android.exoplayer2.c0
        public Object q(int i10) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.android.exoplayer2.c0
        public d s(int i10, d dVar, long j10) {
            d dVar2 = this.f21394d.get(i10);
            dVar.k(dVar2.f21402b, dVar2.f21404d, dVar2.f21405e, dVar2.f21406f, dVar2.f21407g, dVar2.f21408h, dVar2.f21409i, dVar2.f21410j, dVar2.f21412l, dVar2.f21414n, dVar2.f21415o, dVar2.f21416p, dVar2.f21417q, dVar2.f21418r);
            dVar.f21413m = dVar2.f21413m;
            return dVar;
        }

        @Override // com.google.android.exoplayer2.c0
        public int t() {
            return this.f21394d.size();
        }
    }

    /* JADX INFO: compiled from: Timeline.java */
    public static final class d implements f {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final Object f21398s = new Object();

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final Object f21399t = new Object();

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public static final p f21400u = new p.c().d("com.google.android.exoplayer2.Timeline").g(Uri.EMPTY).a();

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final f.a<d> f21401v = new f.a() { // from class: d6.d2
            @Override // com.google.android.exoplayer2.f.a
            public final com.google.android.exoplayer2.f fromBundle(Bundle bundle) {
                return c0.d.c(bundle);
            }
        };

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        @Deprecated
        public Object f21403c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public Object f21405e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f21406f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public long f21407g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public long f21408h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f21409i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f21410j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @Deprecated
        public boolean f21411k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        @Nullable
        public p.g f21412l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public boolean f21413m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public long f21414n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public long f21415o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f21416p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f21417q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public long f21418r;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f21402b = f21398s;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public p f21404d = f21400u;

        public static d c(Bundle bundle) {
            Bundle bundle2 = bundle.getBundle(j(1));
            p pVar = bundle2 != null ? (p) p.f22031k.fromBundle(bundle2) : null;
            long j10 = bundle.getLong(j(2), -9223372036854775807L);
            long j11 = bundle.getLong(j(3), -9223372036854775807L);
            long j12 = bundle.getLong(j(4), -9223372036854775807L);
            boolean z10 = bundle.getBoolean(j(5), false);
            boolean z11 = bundle.getBoolean(j(6), false);
            Bundle bundle3 = bundle.getBundle(j(7));
            p.g gVar = bundle3 != null ? (p.g) p.g.f22085h.fromBundle(bundle3) : null;
            boolean z12 = bundle.getBoolean(j(8), false);
            long j13 = bundle.getLong(j(9), 0L);
            long j14 = bundle.getLong(j(10), -9223372036854775807L);
            int i10 = bundle.getInt(j(11), 0);
            int i11 = bundle.getInt(j(12), 0);
            long j15 = bundle.getLong(j(13), 0L);
            d dVar = new d();
            dVar.k(f21399t, pVar, null, j10, j11, j12, z10, z11, gVar, j13, j14, i10, i11, j15);
            dVar.f21413m = z12;
            return dVar;
        }

        public static String j(int i10) {
            return Integer.toString(i10, 36);
        }

        public long d() {
            return m0.V(this.f21408h);
        }

        public long e() {
            return m0.Q0(this.f21414n);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !d.class.equals(obj.getClass())) {
                return false;
            }
            d dVar = (d) obj;
            return m0.c(this.f21402b, dVar.f21402b) && m0.c(this.f21404d, dVar.f21404d) && m0.c(this.f21405e, dVar.f21405e) && m0.c(this.f21412l, dVar.f21412l) && this.f21406f == dVar.f21406f && this.f21407g == dVar.f21407g && this.f21408h == dVar.f21408h && this.f21409i == dVar.f21409i && this.f21410j == dVar.f21410j && this.f21413m == dVar.f21413m && this.f21414n == dVar.f21414n && this.f21415o == dVar.f21415o && this.f21416p == dVar.f21416p && this.f21417q == dVar.f21417q && this.f21418r == dVar.f21418r;
        }

        public long f() {
            return this.f21414n;
        }

        public long g() {
            return m0.Q0(this.f21415o);
        }

        public long h() {
            return this.f21418r;
        }

        public int hashCode() {
            int iHashCode = (((Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE + this.f21402b.hashCode()) * 31) + this.f21404d.hashCode()) * 31;
            Object obj = this.f21405e;
            int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
            p.g gVar = this.f21412l;
            int iHashCode3 = (iHashCode2 + (gVar != null ? gVar.hashCode() : 0)) * 31;
            long j10 = this.f21406f;
            int i10 = (iHashCode3 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
            long j11 = this.f21407g;
            int i11 = (i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
            long j12 = this.f21408h;
            int i12 = (((((((i11 + ((int) (j12 ^ (j12 >>> 32)))) * 31) + (this.f21409i ? 1 : 0)) * 31) + (this.f21410j ? 1 : 0)) * 31) + (this.f21413m ? 1 : 0)) * 31;
            long j13 = this.f21414n;
            int i13 = (i12 + ((int) (j13 ^ (j13 >>> 32)))) * 31;
            long j14 = this.f21415o;
            int i14 = (((((i13 + ((int) (j14 ^ (j14 >>> 32)))) * 31) + this.f21416p) * 31) + this.f21417q) * 31;
            long j15 = this.f21418r;
            return i14 + ((int) (j15 ^ (j15 >>> 32)));
        }

        public boolean i() {
            s7.a.g(this.f21411k == (this.f21412l != null));
            return this.f21412l != null;
        }

        public d k(Object obj, @Nullable p pVar, @Nullable Object obj2, long j10, long j11, long j12, boolean z10, boolean z11, @Nullable p.g gVar, long j13, long j14, int i10, int i11, long j15) {
            p.h hVar;
            this.f21402b = obj;
            this.f21404d = pVar != null ? pVar : f21400u;
            this.f21403c = (pVar == null || (hVar = pVar.f22033c) == null) ? null : hVar.f22103h;
            this.f21405e = obj2;
            this.f21406f = j10;
            this.f21407g = j11;
            this.f21408h = j12;
            this.f21409i = z10;
            this.f21410j = z11;
            this.f21411k = gVar != null;
            this.f21412l = gVar;
            this.f21414n = j13;
            this.f21415o = j14;
            this.f21416p = i10;
            this.f21417q = i11;
            this.f21418r = j15;
            this.f21413m = false;
            return this;
        }

        public final Bundle l(boolean z10) {
            Bundle bundle = new Bundle();
            bundle.putBundle(j(1), (z10 ? p.f22030j : this.f21404d).toBundle());
            bundle.putLong(j(2), this.f21406f);
            bundle.putLong(j(3), this.f21407g);
            bundle.putLong(j(4), this.f21408h);
            bundle.putBoolean(j(5), this.f21409i);
            bundle.putBoolean(j(6), this.f21410j);
            p.g gVar = this.f21412l;
            if (gVar != null) {
                bundle.putBundle(j(7), gVar.toBundle());
            }
            bundle.putBoolean(j(8), this.f21413m);
            bundle.putLong(j(9), this.f21414n);
            bundle.putLong(j(10), this.f21415o);
            bundle.putInt(j(11), this.f21416p);
            bundle.putInt(j(12), this.f21417q);
            bundle.putLong(j(13), this.f21418r);
            return bundle;
        }

        @Override // com.google.android.exoplayer2.f
        public Bundle toBundle() {
            return l(false);
        }
    }

    public static c0 b(Bundle bundle) {
        ImmutableList immutableListC = c(d.f21401v, s7.b.a(bundle, w(0)));
        ImmutableList immutableListC2 = c(b.f21386i, s7.b.a(bundle, w(1)));
        int[] intArray = bundle.getIntArray(w(2));
        if (intArray == null) {
            intArray = d(immutableListC.size());
        }
        return new c(immutableListC, immutableListC2, intArray);
    }

    public static <T extends f> ImmutableList<T> c(f.a<T> aVar, @Nullable IBinder iBinder) {
        if (iBinder == null) {
            return ImmutableList.of();
        }
        ImmutableList.a aVar2 = new ImmutableList.a();
        ImmutableList<Bundle> immutableListA = d6.b.a(iBinder);
        for (int i10 = 0; i10 < immutableListA.size(); i10++) {
            aVar2.a(aVar.fromBundle(immutableListA.get(i10)));
        }
        return aVar2.m();
    }

    public static int[] d(int i10) {
        int[] iArr = new int[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            iArr[i11] = i11;
        }
        return iArr;
    }

    public static String w(int i10) {
        return Integer.toString(i10, 36);
    }

    public int e(boolean z10) {
        return u() ? -1 : 0;
    }

    public boolean equals(@Nullable Object obj) {
        int iG;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        if (c0Var.t() != t() || c0Var.m() != m()) {
            return false;
        }
        d dVar = new d();
        b bVar = new b();
        d dVar2 = new d();
        b bVar2 = new b();
        for (int i10 = 0; i10 < t(); i10++) {
            if (!r(i10, dVar).equals(c0Var.r(i10, dVar2))) {
                return false;
            }
        }
        for (int i11 = 0; i11 < m(); i11++) {
            if (!k(i11, bVar, true).equals(c0Var.k(i11, bVar2, true))) {
                return false;
            }
        }
        int iE = e(true);
        if (iE != c0Var.e(true) || (iG = g(true)) != c0Var.g(true)) {
            return false;
        }
        while (iE != iG) {
            int i12 = i(iE, 0, true);
            if (i12 != c0Var.i(iE, 0, true)) {
                return false;
            }
            iE = i12;
        }
        return true;
    }

    public abstract int f(Object obj);

    public int g(boolean z10) {
        if (u()) {
            return -1;
        }
        return t() - 1;
    }

    public final int h(int i10, b bVar, d dVar, int i11, boolean z10) {
        int i12 = j(i10, bVar).f21389d;
        if (r(i12, dVar).f21417q != i10) {
            return i10 + 1;
        }
        int i13 = i(i12, i11, z10);
        if (i13 == -1) {
            return -1;
        }
        return r(i13, dVar).f21416p;
    }

    public int hashCode() {
        d dVar = new d();
        b bVar = new b();
        int iT = Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE + t();
        for (int i10 = 0; i10 < t(); i10++) {
            iT = (iT * 31) + r(i10, dVar).hashCode();
        }
        int iM = (iT * 31) + m();
        for (int i11 = 0; i11 < m(); i11++) {
            iM = (iM * 31) + k(i11, bVar, true).hashCode();
        }
        int iE = e(true);
        while (iE != -1) {
            iM = (iM * 31) + iE;
            iE = i(iE, 0, true);
        }
        return iM;
    }

    public int i(int i10, int i11, boolean z10) {
        if (i11 == 0) {
            if (i10 == g(z10)) {
                return -1;
            }
            return i10 + 1;
        }
        if (i11 == 1) {
            return i10;
        }
        if (i11 == 2) {
            return i10 == g(z10) ? e(z10) : i10 + 1;
        }
        throw new IllegalStateException();
    }

    public final b j(int i10, b bVar) {
        return k(i10, bVar, false);
    }

    public abstract b k(int i10, b bVar, boolean z10);

    public b l(Object obj, b bVar) {
        return k(f(obj), bVar, true);
    }

    public abstract int m();

    public final Pair<Object, Long> n(d dVar, b bVar, int i10, long j10) {
        return (Pair) s7.a.e(o(dVar, bVar, i10, j10, 0L));
    }

    @Nullable
    public final Pair<Object, Long> o(d dVar, b bVar, int i10, long j10, long j11) {
        s7.a.c(i10, 0, t());
        s(i10, dVar, j11);
        if (j10 == -9223372036854775807L) {
            j10 = dVar.f();
            if (j10 == -9223372036854775807L) {
                return null;
            }
        }
        int i11 = dVar.f21416p;
        j(i11, bVar);
        while (i11 < dVar.f21417q && bVar.f21391f != j10) {
            int i12 = i11 + 1;
            if (j(i12, bVar).f21391f > j10) {
                break;
            }
            i11 = i12;
        }
        k(i11, bVar, true);
        long jMin = j10 - bVar.f21391f;
        long j12 = bVar.f21390e;
        if (j12 != -9223372036854775807L) {
            jMin = Math.min(jMin, j12 - 1);
        }
        return Pair.create(s7.a.e(bVar.f21388c), Long.valueOf(Math.max(0L, jMin)));
    }

    public int p(int i10, int i11, boolean z10) {
        if (i11 == 0) {
            if (i10 == e(z10)) {
                return -1;
            }
            return i10 - 1;
        }
        if (i11 == 1) {
            return i10;
        }
        if (i11 == 2) {
            return i10 == e(z10) ? g(z10) : i10 - 1;
        }
        throw new IllegalStateException();
    }

    public abstract Object q(int i10);

    public final d r(int i10, d dVar) {
        return s(i10, dVar, 0L);
    }

    public abstract d s(int i10, d dVar, long j10);

    public abstract int t();

    @Override // com.google.android.exoplayer2.f
    public final Bundle toBundle() {
        return x(false);
    }

    public final boolean u() {
        return t() == 0;
    }

    public final boolean v(int i10, b bVar, d dVar, int i11, boolean z10) {
        return h(i10, bVar, dVar, i11, z10) == -1;
    }

    public final Bundle x(boolean z10) {
        ArrayList arrayList = new ArrayList();
        int iT = t();
        d dVar = new d();
        for (int i10 = 0; i10 < iT; i10++) {
            arrayList.add(s(i10, dVar, 0L).l(z10));
        }
        ArrayList arrayList2 = new ArrayList();
        int iM = m();
        b bVar = new b();
        for (int i11 = 0; i11 < iM; i11++) {
            arrayList2.add(k(i11, bVar, false).toBundle());
        }
        int[] iArr = new int[iT];
        if (iT > 0) {
            iArr[0] = e(true);
        }
        for (int i12 = 1; i12 < iT; i12++) {
            iArr[i12] = i(iArr[i12 - 1], 0, true);
        }
        Bundle bundle = new Bundle();
        s7.b.c(bundle, w(0), new d6.b(arrayList));
        s7.b.c(bundle, w(1), new d6.b(arrayList2));
        bundle.putIntArray(w(2), iArr);
        return bundle;
    }
}
