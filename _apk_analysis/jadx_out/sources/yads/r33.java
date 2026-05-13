package yads;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public final class r33 implements p30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p30 f94277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f94278b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Uri f94279c = Uri.EMPTY;

    public r33(p30 p30Var) {
        this.f94277a = (p30) ni.a(p30Var);
        Collections.emptyMap();
    }

    @Override // yads.p30
    public final long a(u30 u30Var) {
        this.f94279c = u30Var.f95522a;
        Collections.emptyMap();
        long jA = this.f94277a.a(u30Var);
        Uri uri = this.f94277a.getUri();
        uri.getClass();
        this.f94279c = uri;
        this.f94277a.getResponseHeaders();
        return jA;
    }

    @Override // yads.p30
    public final void a(r83 r83Var) {
        r83Var.getClass();
        this.f94277a.a(r83Var);
    }

    @Override // yads.p30
    public final void close() {
        this.f94277a.close();
    }

    @Override // yads.p30
    public final Map getResponseHeaders() {
        return this.f94277a.getResponseHeaders();
    }

    @Override // yads.p30
    public final Uri getUri() {
        return this.f94277a.getUri();
    }

    @Override // yads.l30
    public final int read(byte[] bArr, int i10, int i11) {
        int i12 = this.f94277a.read(bArr, i10, i11);
        if (i12 != -1) {
            this.f94278b += (long) i12;
        }
        return i12;
    }
}
