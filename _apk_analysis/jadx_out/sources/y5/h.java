package y5;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.ironsource.C3978d4;
import com.ironsource.Z7;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: DataSpec.java */
/* JADX INFO: loaded from: classes11.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f87270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f87271b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final byte[] f87272c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map<String, String> f87273d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f87274e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f87275f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f87276g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public final String f87277h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f87278i;

    public h(Uri uri, int i10) {
        this(uri, 0L, -1L, null, i10);
    }

    public h(Uri uri, int i10, @Nullable byte[] bArr, long j10, long j11, long j12, @Nullable String str, int i11) {
        this(uri, i10, bArr, j10, j11, j12, str, i11, Collections.emptyMap());
    }

    public h(Uri uri, int i10, @Nullable byte[] bArr, long j10, long j11, long j12, @Nullable String str, int i11, Map<String, String> map) {
        byte[] bArr2 = bArr;
        boolean z10 = true;
        a6.a.a(j10 >= 0);
        a6.a.a(j11 >= 0);
        if (j12 <= 0 && j12 != -1) {
            z10 = false;
        }
        a6.a.a(z10);
        this.f87270a = uri;
        this.f87271b = i10;
        this.f87272c = (bArr2 == null || bArr2.length == 0) ? null : bArr2;
        this.f87274e = j10;
        this.f87275f = j11;
        this.f87276g = j12;
        this.f87277h = str;
        this.f87278i = i11;
        this.f87273d = Collections.unmodifiableMap(new HashMap(map));
    }

    public h(Uri uri, long j10, long j11, long j12, @Nullable String str, int i10) {
        this(uri, null, j10, j11, j12, str, i10);
    }

    public h(Uri uri, long j10, long j11, @Nullable String str) {
        this(uri, j10, j10, j11, str, 0);
    }

    public h(Uri uri, long j10, long j11, @Nullable String str, int i10) {
        this(uri, j10, j10, j11, str, i10);
    }

    public h(Uri uri, long j10, long j11, @Nullable String str, int i10, Map<String, String> map) {
        this(uri, c(null), null, j10, j10, j11, str, i10, map);
    }

    public h(Uri uri, @Nullable byte[] bArr, long j10, long j11, long j12, @Nullable String str, int i10) {
        this(uri, c(bArr), bArr, j10, j11, j12, str, i10);
    }

    public static String b(int i10) {
        if (i10 == 1) {
            return "GET";
        }
        if (i10 == 2) {
            return "POST";
        }
        if (i10 == 3) {
            return "HEAD";
        }
        throw new AssertionError(i10);
    }

    public static int c(@Nullable byte[] bArr) {
        return bArr != null ? 2 : 1;
    }

    public final String a() {
        return b(this.f87271b);
    }

    public boolean d(int i10) {
        return (this.f87278i & i10) == i10;
    }

    public h e(long j10) {
        long j11 = this.f87276g;
        return f(j10, j11 != -1 ? j11 - j10 : -1L);
    }

    public h f(long j10, long j11) {
        return (j10 == 0 && this.f87276g == j11) ? this : new h(this.f87270a, this.f87271b, this.f87272c, this.f87274e + j10, this.f87275f + j10, j11, this.f87277h, this.f87278i, this.f87273d);
    }

    public String toString() {
        return "DataSpec[" + a() + Z7.f30794r + this.f87270a + ", " + Arrays.toString(this.f87272c) + ", " + this.f87274e + ", " + this.f87275f + ", " + this.f87276g + ", " + this.f87277h + ", " + this.f87278i + C3978d4.j.f31385e;
    }
}
