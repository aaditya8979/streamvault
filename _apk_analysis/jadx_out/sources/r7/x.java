package r7;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: StatsDataSource.java */
/* JADX INFO: loaded from: classes5.dex */
public final class x implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f78865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f78866b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Uri f78867c = Uri.EMPTY;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Map<String, List<String>> f78868d = Collections.emptyMap();

    public x(h hVar) {
        this.f78865a = (h) s7.a.e(hVar);
    }

    @Override // r7.h
    public long a(k kVar) throws IOException {
        this.f78867c = kVar.f78755a;
        this.f78868d = Collections.emptyMap();
        long jA = this.f78865a.a(kVar);
        this.f78867c = (Uri) s7.a.e(getUri());
        this.f78868d = getResponseHeaders();
        return jA;
    }

    @Override // r7.h
    public void b(y yVar) {
        s7.a.e(yVar);
        this.f78865a.b(yVar);
    }

    public long c() {
        return this.f78866b;
    }

    @Override // r7.h
    public void close() throws IOException {
        this.f78865a.close();
    }

    public Uri d() {
        return this.f78867c;
    }

    public Map<String, List<String>> e() {
        return this.f78868d;
    }

    public void f() {
        this.f78866b = 0L;
    }

    @Override // r7.h
    public Map<String, List<String>> getResponseHeaders() {
        return this.f78865a.getResponseHeaders();
    }

    @Override // r7.h
    @Nullable
    public Uri getUri() {
        return this.f78865a.getUri();
    }

    @Override // r7.f
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = this.f78865a.read(bArr, i10, i11);
        if (i12 != -1) {
            this.f78866b += (long) i12;
        }
        return i12;
    }
}
