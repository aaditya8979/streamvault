package r7;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.ironsource.C3978d4;
import com.ironsource.Z7;
import d6.x0;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: DataSpec.java */
/* JADX INFO: loaded from: classes5.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f78755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f78756b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f78757c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final byte[] f78758d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map<String, String> f78759e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Deprecated
    public final long f78760f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f78761g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f78762h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public final String f78763i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f78764j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public final Object f78765k;

    /* JADX INFO: compiled from: DataSpec.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public Uri f78766a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f78767b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f78768c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public byte[] f78769d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Map<String, String> f78770e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f78771f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public long f78772g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @Nullable
        public String f78773h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f78774i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @Nullable
        public Object f78775j;

        public b() {
            this.f78768c = 1;
            this.f78770e = Collections.emptyMap();
            this.f78772g = -1L;
        }

        public b(k kVar) {
            this.f78766a = kVar.f78755a;
            this.f78767b = kVar.f78756b;
            this.f78768c = kVar.f78757c;
            this.f78769d = kVar.f78758d;
            this.f78770e = kVar.f78759e;
            this.f78771f = kVar.f78761g;
            this.f78772g = kVar.f78762h;
            this.f78773h = kVar.f78763i;
            this.f78774i = kVar.f78764j;
            this.f78775j = kVar.f78765k;
        }

        public k a() {
            s7.a.j(this.f78766a, "The uri must be set.");
            return new k(this.f78766a, this.f78767b, this.f78768c, this.f78769d, this.f78770e, this.f78771f, this.f78772g, this.f78773h, this.f78774i, this.f78775j);
        }

        public b b(int i10) {
            this.f78774i = i10;
            return this;
        }

        public b c(@Nullable byte[] bArr) {
            this.f78769d = bArr;
            return this;
        }

        public b d(int i10) {
            this.f78768c = i10;
            return this;
        }

        public b e(Map<String, String> map) {
            this.f78770e = map;
            return this;
        }

        public b f(@Nullable String str) {
            this.f78773h = str;
            return this;
        }

        public b g(long j10) {
            this.f78771f = j10;
            return this;
        }

        public b h(Uri uri) {
            this.f78766a = uri;
            return this;
        }

        public b i(String str) {
            this.f78766a = Uri.parse(str);
            return this;
        }
    }

    static {
        x0.a("goog.exo.datasource");
    }

    public k(Uri uri, long j10, int i10, @Nullable byte[] bArr, Map<String, String> map, long j11, long j12, @Nullable String str, int i11, @Nullable Object obj) {
        byte[] bArr2 = bArr;
        long j13 = j10 + j11;
        boolean z10 = true;
        s7.a.a(j13 >= 0);
        s7.a.a(j11 >= 0);
        if (j12 <= 0 && j12 != -1) {
            z10 = false;
        }
        s7.a.a(z10);
        this.f78755a = uri;
        this.f78756b = j10;
        this.f78757c = i10;
        this.f78758d = (bArr2 == null || bArr2.length == 0) ? null : bArr2;
        this.f78759e = Collections.unmodifiableMap(new HashMap(map));
        this.f78761g = j11;
        this.f78760f = j13;
        this.f78762h = j12;
        this.f78763i = str;
        this.f78764j = i11;
        this.f78765k = obj;
    }

    public static String c(int i10) {
        if (i10 == 1) {
            return "GET";
        }
        if (i10 == 2) {
            return "POST";
        }
        if (i10 == 3) {
            return "HEAD";
        }
        throw new IllegalStateException();
    }

    public b a() {
        return new b();
    }

    public final String b() {
        return c(this.f78757c);
    }

    public boolean d(int i10) {
        return (this.f78764j & i10) == i10;
    }

    public String toString() {
        return "DataSpec[" + b() + Z7.f30794r + this.f78755a + ", " + this.f78761g + ", " + this.f78762h + ", " + this.f78763i + ", " + this.f78764j + C3978d4.j.f31385e;
    }
}
