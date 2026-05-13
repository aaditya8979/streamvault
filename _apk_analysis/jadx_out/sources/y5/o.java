package y5;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: StatsDataSource.java */
/* JADX INFO: loaded from: classes11.dex */
public final class o implements com.google.android.exoplayer.upstream.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.google.android.exoplayer.upstream.a f87321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f87322b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Uri f87323c = Uri.EMPTY;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Map<String, List<String>> f87324d = Collections.emptyMap();

    public o(com.google.android.exoplayer.upstream.a aVar) {
        this.f87321a = (com.google.android.exoplayer.upstream.a) a6.a.e(aVar);
    }

    @Override // com.google.android.exoplayer.upstream.a
    public long a(h hVar) throws IOException {
        this.f87323c = hVar.f87270a;
        this.f87324d = Collections.emptyMap();
        long jA = this.f87321a.a(hVar);
        this.f87323c = (Uri) a6.a.e(getUri());
        this.f87324d = getResponseHeaders();
        return jA;
    }

    @Override // com.google.android.exoplayer.upstream.a
    public void b(q qVar) {
        this.f87321a.b(qVar);
    }

    public long c() {
        return this.f87322b;
    }

    @Override // com.google.android.exoplayer.upstream.a
    public void close() throws IOException {
        this.f87321a.close();
    }

    public Uri d() {
        return this.f87323c;
    }

    public Map<String, List<String>> e() {
        return this.f87324d;
    }

    public void f() {
        this.f87322b = 0L;
    }

    @Override // com.google.android.exoplayer.upstream.a
    public Map<String, List<String>> getResponseHeaders() {
        return this.f87321a.getResponseHeaders();
    }

    @Override // com.google.android.exoplayer.upstream.a
    @Nullable
    public Uri getUri() {
        return this.f87321a.getUri();
    }

    @Override // com.google.android.exoplayer.upstream.a
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = this.f87321a.read(bArr, i10, i11);
        if (i12 != -1) {
            this.f87322b += (long) i12;
        }
        return i12;
    }
}
