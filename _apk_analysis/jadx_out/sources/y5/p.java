package y5;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: TeeDataSource.java */
/* JADX INFO: loaded from: classes11.dex */
public final class p implements com.google.android.exoplayer.upstream.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.google.android.exoplayer.upstream.a f87325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f87326b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f87327c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f87328d;

    public p(com.google.android.exoplayer.upstream.a aVar, f fVar) {
        this.f87325a = (com.google.android.exoplayer.upstream.a) a6.a.e(aVar);
        this.f87326b = (f) a6.a.e(fVar);
    }

    @Override // com.google.android.exoplayer.upstream.a
    public long a(h hVar) throws IOException {
        long jA = this.f87325a.a(hVar);
        this.f87328d = jA;
        if (jA == 0) {
            return 0L;
        }
        if (hVar.f87276g == -1 && jA != -1) {
            hVar = hVar.f(0L, jA);
        }
        this.f87327c = true;
        this.f87326b.a(hVar);
        return this.f87328d;
    }

    @Override // com.google.android.exoplayer.upstream.a
    public void b(q qVar) {
        this.f87325a.b(qVar);
    }

    @Override // com.google.android.exoplayer.upstream.a
    public void close() throws IOException {
        try {
            this.f87325a.close();
        } finally {
            if (this.f87327c) {
                this.f87327c = false;
                this.f87326b.close();
            }
        }
    }

    @Override // com.google.android.exoplayer.upstream.a
    public Map<String, List<String>> getResponseHeaders() {
        return this.f87325a.getResponseHeaders();
    }

    @Override // com.google.android.exoplayer.upstream.a
    @Nullable
    public Uri getUri() {
        return this.f87325a.getUri();
    }

    @Override // com.google.android.exoplayer.upstream.a
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        if (this.f87328d == 0) {
            return -1;
        }
        int i12 = this.f87325a.read(bArr, i10, i11);
        if (i12 > 0) {
            this.f87326b.write(bArr, i10, i12);
            long j10 = this.f87328d;
            if (j10 != -1) {
                this.f87328d = j10 - ((long) i12);
            }
        }
        return i12;
    }
}
