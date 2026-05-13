package yads;

import java.io.FilterInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;

/* JADX INFO: loaded from: classes12.dex */
public final class c21 extends FilterInputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HttpURLConnection f88268a;

    public c21(HttpURLConnection httpURLConnection) {
        super(d21.a(httpURLConnection));
        this.f88268a = httpURLConnection;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        super.close();
        this.f88268a.disconnect();
    }
}
