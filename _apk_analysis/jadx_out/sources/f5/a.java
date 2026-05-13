package f5;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.util.Arrays;

/* JADX INFO: compiled from: AdPlaybackState.java */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f61460f = new a(new long[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f61461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f61462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0760a[] f61463c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f61464d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f61465e;

    /* JADX INFO: renamed from: f5.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AdPlaybackState.java */
    public static final class C0760a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f61466a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Uri[] f61467b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int[] f61468c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long[] f61469d;

        public C0760a() {
            this(-1, new int[0], new Uri[0], new long[0]);
        }

        public C0760a(int i10, int[] iArr, Uri[] uriArr, long[] jArr) {
            a6.a.a(iArr.length == uriArr.length);
            this.f61466a = i10;
            this.f61468c = iArr;
            this.f61467b = uriArr;
            this.f61469d = jArr;
        }

        public int a() {
            return b(-1);
        }

        public int b(int i10) {
            int i11;
            int i12 = i10 + 1;
            while (true) {
                int[] iArr = this.f61468c;
                if (i12 >= iArr.length || (i11 = iArr[i12]) == 0 || i11 == 1) {
                    break;
                }
                i12++;
            }
            return i12;
        }

        public boolean c() {
            return this.f61466a == -1 || a() < this.f61466a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C0760a.class != obj.getClass()) {
                return false;
            }
            C0760a c0760a = (C0760a) obj;
            return this.f61466a == c0760a.f61466a && Arrays.equals(this.f61467b, c0760a.f61467b) && Arrays.equals(this.f61468c, c0760a.f61468c) && Arrays.equals(this.f61469d, c0760a.f61469d);
        }

        public int hashCode() {
            return (((((this.f61466a * 31) + Arrays.hashCode(this.f61467b)) * 31) + Arrays.hashCode(this.f61468c)) * 31) + Arrays.hashCode(this.f61469d);
        }
    }

    public a(long... jArr) {
        int length = jArr.length;
        this.f61461a = length;
        this.f61462b = Arrays.copyOf(jArr, length);
        this.f61463c = new C0760a[length];
        for (int i10 = 0; i10 < length; i10++) {
            this.f61463c[i10] = new C0760a();
        }
        this.f61464d = 0L;
        this.f61465e = -9223372036854775807L;
    }

    public int a(long j10, long j11) {
        if (j10 == Long.MIN_VALUE) {
            return -1;
        }
        if (j11 != -9223372036854775807L && j10 >= j11) {
            return -1;
        }
        int i10 = 0;
        while (true) {
            long[] jArr = this.f61462b;
            if (i10 >= jArr.length) {
                break;
            }
            long j12 = jArr[i10];
            if (j12 == Long.MIN_VALUE || (j10 < j12 && this.f61463c[i10].c())) {
                break;
            }
            i10++;
        }
        if (i10 < this.f61462b.length) {
            return i10;
        }
        return -1;
    }

    public int b(long j10, long j11) {
        int length = this.f61462b.length - 1;
        while (length >= 0 && c(j10, j11, length)) {
            length--;
        }
        if (length < 0 || !this.f61463c[length].c()) {
            return -1;
        }
        return length;
    }

    public final boolean c(long j10, long j11, int i10) {
        if (j10 == Long.MIN_VALUE) {
            return false;
        }
        long j12 = this.f61462b[i10];
        return j12 == Long.MIN_VALUE ? j11 == -9223372036854775807L || j10 < j11 : j10 < j12;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.f61461a == aVar.f61461a && this.f61464d == aVar.f61464d && this.f61465e == aVar.f61465e && Arrays.equals(this.f61462b, aVar.f61462b) && Arrays.equals(this.f61463c, aVar.f61463c);
    }

    public int hashCode() {
        return (((((((this.f61461a * 31) + ((int) this.f61464d)) * 31) + ((int) this.f61465e)) * 31) + Arrays.hashCode(this.f61462b)) * 31) + Arrays.hashCode(this.f61463c);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("AdPlaybackState(adResumePositionUs=");
        sb2.append(this.f61464d);
        sb2.append(", adGroups=[");
        for (int i10 = 0; i10 < this.f61463c.length; i10++) {
            sb2.append("adGroup(timeUs=");
            sb2.append(this.f61462b[i10]);
            sb2.append(", ads=[");
            for (int i11 = 0; i11 < this.f61463c[i10].f61468c.length; i11++) {
                sb2.append("ad(state=");
                int i12 = this.f61463c[i10].f61468c[i11];
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
                sb2.append(this.f61463c[i10].f61469d[i11]);
                sb2.append(')');
                if (i11 < this.f61463c[i10].f61468c.length - 1) {
                    sb2.append(", ");
                }
            }
            sb2.append("])");
            if (i10 < this.f61463c.length - 1) {
                sb2.append(", ");
            }
        }
        sb2.append("])");
        return sb2.toString();
    }
}
