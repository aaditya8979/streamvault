package yads;

import android.net.Uri;
import com.ironsource.C3978d4;
import com.ironsource.Z7;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class u30 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f95521k = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f95522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f95523b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f95524c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f95525d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map f95526e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f95527f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f95528g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f95529h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f95530i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f95531j;

    static {
        ho0.a("goog.exo.datasource");
    }

    public u30(Uri uri, long j10, int i10, byte[] bArr, Map map, long j11, long j12, String str, int i11, Object obj) {
        byte[] bArr2 = bArr;
        boolean z10 = true;
        ni.a(j10 + j11 >= 0);
        ni.a(j11 >= 0);
        if (j12 <= 0 && j12 != -1) {
            z10 = false;
        }
        ni.a(z10);
        this.f95522a = uri;
        this.f95523b = j10;
        this.f95524c = i10;
        this.f95525d = (bArr2 == null || bArr2.length == 0) ? null : bArr2;
        this.f95526e = Collections.unmodifiableMap(new HashMap(map));
        this.f95527f = j11;
        this.f95528g = j12;
        this.f95529h = str;
        this.f95530i = i11;
        this.f95531j = obj;
    }

    public final u30 a(long j10, long j11) {
        return (j10 == 0 && this.f95528g == j11) ? this : new u30(this.f95522a, this.f95523b, this.f95524c, this.f95525d, this.f95526e, this.f95527f + j10, j11, this.f95529h, this.f95530i, this.f95531j);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("DataSpec[");
        int i10 = this.f95524c;
        if (i10 == 1) {
            str = "GET";
        } else if (i10 == 2) {
            str = "POST";
        } else {
            if (i10 != 3) {
                throw new IllegalStateException();
            }
            str = "HEAD";
        }
        sb2.append(str);
        sb2.append(Z7.f30794r);
        sb2.append(this.f95522a);
        sb2.append(", ");
        sb2.append(this.f95527f);
        sb2.append(", ");
        sb2.append(this.f95528g);
        sb2.append(", ");
        sb2.append(this.f95529h);
        sb2.append(", ");
        sb2.append(this.f95530i);
        sb2.append(C3978d4.j.f31385e);
        return sb2.toString();
    }
}
