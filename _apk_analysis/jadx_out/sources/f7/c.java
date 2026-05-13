package f7;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.CheckResult;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.f;
import f7.c;
import java.util.ArrayList;
import java.util.Arrays;
import s7.m0;

/* JADX INFO: compiled from: AdPlaybackState.java */
/* JADX INFO: loaded from: classes2.dex */
public final class c implements f {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final c f61578h = new c(null, new a[0], 0, -9223372036854775807L, 0);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f61579i = new a(0).j(0);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final f.a<c> f61580j = new f.a() { // from class: f7.a
        @Override // com.google.android.exoplayer2.f.a
        public final f fromBundle(Bundle bundle) {
            return c.b(bundle);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final Object f61581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f61582c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f61583d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f61584e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f61585f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a[] f61586g;

    /* JADX INFO: compiled from: AdPlaybackState.java */
    public static final class a implements f {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final f.a<a> f61587j = new f.a() { // from class: f7.b
            @Override // com.google.android.exoplayer2.f.a
            public final f fromBundle(Bundle bundle) {
                return c.a.d(bundle);
            }
        };

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f61588b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f61589c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f61590d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Uri[] f61591e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int[] f61592f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final long[] f61593g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final long f61594h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final boolean f61595i;

        public a(long j10) {
            this(j10, -1, -1, new int[0], new Uri[0], new long[0], 0L, false);
        }

        public a(long j10, int i10, int i11, int[] iArr, Uri[] uriArr, long[] jArr, long j11, boolean z10) {
            s7.a.a(iArr.length == uriArr.length);
            this.f61588b = j10;
            this.f61589c = i10;
            this.f61590d = i11;
            this.f61592f = iArr;
            this.f61591e = uriArr;
            this.f61593g = jArr;
            this.f61594h = j11;
            this.f61595i = z10;
        }

        @CheckResult
        public static long[] b(long[] jArr, int i10) {
            int length = jArr.length;
            int iMax = Math.max(i10, length);
            long[] jArrCopyOf = Arrays.copyOf(jArr, iMax);
            Arrays.fill(jArrCopyOf, length, iMax, -9223372036854775807L);
            return jArrCopyOf;
        }

        @CheckResult
        public static int[] c(int[] iArr, int i10) {
            int length = iArr.length;
            int iMax = Math.max(i10, length);
            int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
            Arrays.fill(iArrCopyOf, length, iMax, 0);
            return iArrCopyOf;
        }

        public static a d(Bundle bundle) {
            long j10 = bundle.getLong(h(0));
            int i10 = bundle.getInt(h(1), -1);
            int i11 = bundle.getInt(h(7), -1);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(h(2));
            int[] intArray = bundle.getIntArray(h(3));
            long[] longArray = bundle.getLongArray(h(4));
            long j11 = bundle.getLong(h(5));
            boolean z10 = bundle.getBoolean(h(6));
            if (intArray == null) {
                intArray = new int[0];
            }
            return new a(j10, i10, i11, intArray, parcelableArrayList == null ? new Uri[0] : (Uri[]) parcelableArrayList.toArray(new Uri[0]), longArray == null ? new long[0] : longArray, j11, z10);
        }

        public static String h(int i10) {
            return Integer.toString(i10, 36);
        }

        public int e() {
            return f(-1);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f61588b == aVar.f61588b && this.f61589c == aVar.f61589c && this.f61590d == aVar.f61590d && Arrays.equals(this.f61591e, aVar.f61591e) && Arrays.equals(this.f61592f, aVar.f61592f) && Arrays.equals(this.f61593g, aVar.f61593g) && this.f61594h == aVar.f61594h && this.f61595i == aVar.f61595i;
        }

        public int f(@IntRange(from = -1) int i10) {
            int i11;
            int i12 = i10 + 1;
            while (true) {
                int[] iArr = this.f61592f;
                if (i12 >= iArr.length || this.f61595i || (i11 = iArr[i12]) == 0 || i11 == 1) {
                    break;
                }
                i12++;
            }
            return i12;
        }

        public boolean g() {
            if (this.f61589c == -1) {
                return true;
            }
            for (int i10 = 0; i10 < this.f61589c; i10++) {
                int i11 = this.f61592f[i10];
                if (i11 == 0 || i11 == 1) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int i10 = ((this.f61589c * 31) + this.f61590d) * 31;
            long j10 = this.f61588b;
            int iHashCode = (((((((i10 + ((int) (j10 ^ (j10 >>> 32)))) * 31) + Arrays.hashCode(this.f61591e)) * 31) + Arrays.hashCode(this.f61592f)) * 31) + Arrays.hashCode(this.f61593g)) * 31;
            long j11 = this.f61594h;
            return ((iHashCode + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f61595i ? 1 : 0);
        }

        public boolean i() {
            return this.f61589c == -1 || e() < this.f61589c;
        }

        @CheckResult
        public a j(int i10) {
            int[] iArrC = c(this.f61592f, i10);
            long[] jArrB = b(this.f61593g, i10);
            return new a(this.f61588b, i10, this.f61590d, iArrC, (Uri[]) Arrays.copyOf(this.f61591e, i10), jArrB, this.f61594h, this.f61595i);
        }

        @Override // com.google.android.exoplayer2.f
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putLong(h(0), this.f61588b);
            bundle.putInt(h(1), this.f61589c);
            bundle.putInt(h(7), this.f61590d);
            bundle.putParcelableArrayList(h(2), new ArrayList<>(Arrays.asList(this.f61591e)));
            bundle.putIntArray(h(3), this.f61592f);
            bundle.putLongArray(h(4), this.f61593g);
            bundle.putLong(h(5), this.f61594h);
            bundle.putBoolean(h(6), this.f61595i);
            return bundle;
        }
    }

    public c(@Nullable Object obj, a[] aVarArr, long j10, long j11, int i10) {
        this.f61581b = obj;
        this.f61583d = j10;
        this.f61584e = j11;
        this.f61582c = aVarArr.length + i10;
        this.f61586g = aVarArr;
        this.f61585f = i10;
    }

    public static c b(Bundle bundle) {
        a[] aVarArr;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(g(1));
        if (parcelableArrayList == null) {
            aVarArr = new a[0];
        } else {
            a[] aVarArr2 = new a[parcelableArrayList.size()];
            for (int i10 = 0; i10 < parcelableArrayList.size(); i10++) {
                aVarArr2[i10] = (a) a.f61587j.fromBundle((Bundle) parcelableArrayList.get(i10));
            }
            aVarArr = aVarArr2;
        }
        return new c(null, aVarArr, bundle.getLong(g(2), 0L), bundle.getLong(g(3), -9223372036854775807L), bundle.getInt(g(4)));
    }

    public static String g(int i10) {
        return Integer.toString(i10, 36);
    }

    public a c(@IntRange(from = 0) int i10) {
        int i11 = this.f61585f;
        return i10 < i11 ? f61579i : this.f61586g[i10 - i11];
    }

    public int d(long j10, long j11) {
        if (j10 == Long.MIN_VALUE) {
            return -1;
        }
        if (j11 != -9223372036854775807L && j10 >= j11) {
            return -1;
        }
        int i10 = this.f61585f;
        while (i10 < this.f61582c && ((c(i10).f61588b != Long.MIN_VALUE && c(i10).f61588b <= j10) || !c(i10).i())) {
            i10++;
        }
        if (i10 < this.f61582c) {
            return i10;
        }
        return -1;
    }

    public int e(long j10, long j11) {
        int i10 = this.f61582c - 1;
        while (i10 >= 0 && f(j10, j11, i10)) {
            i10--;
        }
        if (i10 < 0 || !c(i10).g()) {
            return -1;
        }
        return i10;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return m0.c(this.f61581b, cVar.f61581b) && this.f61582c == cVar.f61582c && this.f61583d == cVar.f61583d && this.f61584e == cVar.f61584e && this.f61585f == cVar.f61585f && Arrays.equals(this.f61586g, cVar.f61586g);
    }

    public final boolean f(long j10, long j11, int i10) {
        if (j10 == Long.MIN_VALUE) {
            return false;
        }
        long j12 = c(i10).f61588b;
        return j12 == Long.MIN_VALUE ? j11 == -9223372036854775807L || j10 < j11 : j10 < j12;
    }

    public int hashCode() {
        int i10 = this.f61582c * 31;
        Object obj = this.f61581b;
        return ((((((((i10 + (obj == null ? 0 : obj.hashCode())) * 31) + ((int) this.f61583d)) * 31) + ((int) this.f61584e)) * 31) + this.f61585f) * 31) + Arrays.hashCode(this.f61586g);
    }

    @Override // com.google.android.exoplayer2.f
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        for (a aVar : this.f61586g) {
            arrayList.add(aVar.toBundle());
        }
        bundle.putParcelableArrayList(g(1), arrayList);
        bundle.putLong(g(2), this.f61583d);
        bundle.putLong(g(3), this.f61584e);
        bundle.putInt(g(4), this.f61585f);
        return bundle;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("AdPlaybackState(adsId=");
        sb2.append(this.f61581b);
        sb2.append(", adResumePositionUs=");
        sb2.append(this.f61583d);
        sb2.append(", adGroups=[");
        for (int i10 = 0; i10 < this.f61586g.length; i10++) {
            sb2.append("adGroup(timeUs=");
            sb2.append(this.f61586g[i10].f61588b);
            sb2.append(", ads=[");
            for (int i11 = 0; i11 < this.f61586g[i10].f61592f.length; i11++) {
                sb2.append("ad(state=");
                int i12 = this.f61586g[i10].f61592f[i11];
                if (i12 == 0) {
                    sb2.append('_');
                } else if (i12 == 1) {
                    sb2.append('R');
                } else if (i12 == 2) {
                    sb2.append('S');
                } else if (i12 == 3) {
                    sb2.append('P');
                } else if (i12 != 4) {
                    sb2.append('?');
                } else {
                    sb2.append('!');
                }
                sb2.append(", durationUs=");
                sb2.append(this.f61586g[i10].f61593g[i11]);
                sb2.append(')');
                if (i11 < this.f61586g[i10].f61592f.length - 1) {
                    sb2.append(", ");
                }
            }
            sb2.append("])");
            if (i10 < this.f61586g.length - 1) {
                sb2.append(", ");
            }
        }
        sb2.append("])");
        return sb2.toString();
    }
}
