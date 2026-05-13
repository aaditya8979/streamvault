package e5;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: IcyDataSource.java */
/* JADX INFO: loaded from: classes9.dex */
public final class n implements com.google.android.exoplayer.upstream.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.google.android.exoplayer.upstream.a f60552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f60553b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f60554c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f60555d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f60556e;

    /* JADX INFO: compiled from: IcyDataSource.java */
    public interface a {
        void a(a6.t tVar);
    }

    public n(com.google.android.exoplayer.upstream.a aVar, int i10, a aVar2) {
        a6.a.a(i10 > 0);
        this.f60552a = aVar;
        this.f60553b = i10;
        this.f60554c = aVar2;
        this.f60555d = new byte[1];
        this.f60556e = i10;
    }

    @Override // com.google.android.exoplayer.upstream.a
    public long a(y5.h hVar) throws IOException {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.exoplayer.upstream.a
    public void b(y5.q qVar) {
        this.f60552a.b(qVar);
    }

    public final boolean c() throws IOException {
        if (this.f60552a.read(this.f60555d, 0, 1) == -1) {
            return false;
        }
        int i10 = (this.f60555d[0] & 255) << 4;
        if (i10 == 0) {
            return true;
        }
        byte[] bArr = new byte[i10];
        int i11 = i10;
        int i12 = 0;
        while (i11 > 0) {
            int i13 = this.f60552a.read(bArr, i12, i11);
            if (i13 == -1) {
                return false;
            }
            i12 += i13;
            i11 -= i13;
        }
        while (i10 > 0 && bArr[i10 - 1] == 0) {
            i10--;
        }
        if (i10 > 0) {
            this.f60554c.a(new a6.t(bArr, i10));
        }
        return true;
    }

    @Override // com.google.android.exoplayer.upstream.a
    public void close() throws IOException {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.exoplayer.upstream.a
    public Map<String, List<String>> getResponseHeaders() {
        return this.f60552a.getResponseHeaders();
    }

    @Override // com.google.android.exoplayer.upstream.a
    @Nullable
    public Uri getUri() {
        return this.f60552a.getUri();
    }

    @Override // com.google.android.exoplayer.upstream.a
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        if (this.f60556e == 0) {
            if (!c()) {
                return -1;
            }
            this.f60556e = this.f60553b;
        }
        int i12 = this.f60552a.read(bArr, i10, Math.min(this.f60556e, i11));
        if (i12 != -1) {
            this.f60556e -= i12;
        }
        return i12;
    }
}
