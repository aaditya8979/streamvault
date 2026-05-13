package yads;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import yads.xq;

/* JADX INFO: loaded from: classes3.dex */
public final class d6 implements xq {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final wq f88760i = new wq() { // from class: bt.t0
        @Override // yads.wq
        public final xq fromBundle(Bundle bundle) {
            return yads.d6.a(bundle);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f88761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f88762c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Uri[] f88763d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int[] f88764e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long[] f88765f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f88766g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f88767h;

    public d6(long j10, int i10, int[] iArr, Uri[] uriArr, long[] jArr, long j11, boolean z10) {
        ni.a(iArr.length == uriArr.length);
        this.f88761b = j10;
        this.f88762c = i10;
        this.f88764e = iArr;
        this.f88763d = uriArr;
        this.f88765f = jArr;
        this.f88766g = j11;
        this.f88767h = z10;
    }

    public static d6 a(Bundle bundle) {
        long j10 = bundle.getLong(Integer.toString(0, 36));
        int i10 = bundle.getInt(Integer.toString(1, 36), -1);
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(Integer.toString(2, 36));
        int[] intArray = bundle.getIntArray(Integer.toString(3, 36));
        long[] longArray = bundle.getLongArray(Integer.toString(4, 36));
        return new d6(j10, i10, intArray == null ? new int[0] : intArray, parcelableArrayList == null ? new Uri[0] : (Uri[]) parcelableArrayList.toArray(new Uri[0]), longArray == null ? new long[0] : longArray, bundle.getLong(Integer.toString(5, 36)), bundle.getBoolean(Integer.toString(6, 36)));
    }

    public final int a(int i10) {
        int i11;
        int i12 = i10 + 1;
        while (true) {
            int[] iArr = this.f88764e;
            if (i12 >= iArr.length || this.f88767h || (i11 = iArr[i12]) == 0 || i11 == 1) {
                break;
            }
            i12++;
        }
        return i12;
    }

    public final d6 a() {
        int[] iArr = this.f88764e;
        int length = iArr.length;
        int iMax = Math.max(0, length);
        int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
        Arrays.fill(iArrCopyOf, length, iMax, 0);
        long[] jArr = this.f88765f;
        int length2 = jArr.length;
        int iMax2 = Math.max(0, length2);
        long[] jArrCopyOf = Arrays.copyOf(jArr, iMax2);
        Arrays.fill(jArrCopyOf, length2, iMax2, -9223372036854775807L);
        return new d6(this.f88761b, 0, iArrCopyOf, (Uri[]) Arrays.copyOf(this.f88763d, 0), jArrCopyOf, this.f88766g, this.f88767h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d6.class != obj.getClass()) {
            return false;
        }
        d6 d6Var = (d6) obj;
        return this.f88761b == d6Var.f88761b && this.f88762c == d6Var.f88762c && Arrays.equals(this.f88763d, d6Var.f88763d) && Arrays.equals(this.f88764e, d6Var.f88764e) && Arrays.equals(this.f88765f, d6Var.f88765f) && this.f88766g == d6Var.f88766g && this.f88767h == d6Var.f88767h;
    }

    public final int hashCode() {
        int i10 = this.f88762c * 31;
        long j10 = this.f88761b;
        int iHashCode = (Arrays.hashCode(this.f88765f) + ((Arrays.hashCode(this.f88764e) + ((((i10 + ((int) (j10 ^ (j10 >>> 32)))) * 31) + Arrays.hashCode(this.f88763d)) * 31)) * 31)) * 31;
        long j11 = this.f88766g;
        return ((iHashCode + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f88767h ? 1 : 0);
    }
}
