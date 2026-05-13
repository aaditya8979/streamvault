package wq;

import java.io.File;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.JarURLConnection;
import java.net.URL;
import sq.j;

/* JADX INFO: compiled from: JarResource.java */
/* JADX INFO: loaded from: classes12.dex */
public class d extends f {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final vq.c f86673j = vq.b.a(d.class);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public JarURLConnection f86674i;

    /* JADX INFO: compiled from: JarResource.java */
    public class a extends FilterInputStream {
        public a(InputStream inputStream) {
            super(inputStream);
        }

        @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            ((FilterInputStream) this).in = j.f();
        }
    }

    public d(URL url, boolean z10) {
        super(url, null, z10);
    }

    @Override // wq.f, wq.e
    public boolean a() {
        return this.f86680d.endsWith("!/") ? k() : super.a();
    }

    @Override // wq.f, wq.e
    public File b() throws IOException {
        return null;
    }

    @Override // wq.f, wq.e
    public InputStream c() throws IOException {
        k();
        if (!this.f86680d.endsWith("!/")) {
            return new a(super.c());
        }
        return new URL(this.f86680d.substring(4, r1.length() - 2)).openStream();
    }

    @Override // wq.f, wq.e
    public synchronized void i() {
        this.f86674i = null;
        super.i();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x001d  */
    @Override // wq.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized boolean k() {
        /*
            r2 = this;
            monitor-enter(r2)
            super.k()     // Catch: java.lang.Throwable -> L20
            java.net.JarURLConnection r0 = r2.f86674i     // Catch: java.io.IOException -> Le java.lang.Throwable -> L20
            java.net.URLConnection r1 = r2.f86681e     // Catch: java.io.IOException -> Le java.lang.Throwable -> L20
            if (r0 == r1) goto L17
            r2.m()     // Catch: java.io.IOException -> Le java.lang.Throwable -> L20
            goto L17
        Le:
            r0 = move-exception
            vq.c r1 = wq.d.f86673j     // Catch: java.lang.Throwable -> L20
            r1.g(r0)     // Catch: java.lang.Throwable -> L20
            r0 = 0
            r2.f86674i = r0     // Catch: java.lang.Throwable -> L20
        L17:
            java.net.JarURLConnection r0 = r2.f86674i     // Catch: java.lang.Throwable -> L20
            if (r0 == 0) goto L1d
            r0 = 1
            goto L1e
        L1d:
            r0 = 0
        L1e:
            monitor-exit(r2)
            return r0
        L20:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: wq.d.k():boolean");
    }

    public void m() throws IOException {
        this.f86674i = (JarURLConnection) this.f86681e;
    }
}
