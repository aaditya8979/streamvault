package wq;

import java.io.File;
import java.io.FilePermission;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.security.Permission;

/* JADX INFO: compiled from: URLResource.java */
/* JADX INFO: loaded from: classes4.dex */
public class f extends e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final vq.c f86678h = vq.b.a(f.class);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public URL f86679c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f86680d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public URLConnection f86681e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public InputStream f86682f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public transient boolean f86683g;

    public f(URL url, URLConnection uRLConnection) {
        this.f86682f = null;
        this.f86683g = e.f86677b;
        this.f86679c = url;
        this.f86680d = url.toString();
        this.f86681e = uRLConnection;
    }

    public f(URL url, URLConnection uRLConnection, boolean z10) {
        this(url, uRLConnection);
        this.f86683g = z10;
    }

    @Override // wq.e
    public boolean a() {
        try {
            synchronized (this) {
                if (k() && this.f86682f == null) {
                    this.f86682f = this.f86681e.getInputStream();
                }
            }
        } catch (IOException e10) {
            f86678h.g(e10);
        }
        return this.f86682f != null;
    }

    @Override // wq.e
    public File b() throws IOException {
        if (k()) {
            Permission permission = this.f86681e.getPermission();
            if (permission instanceof FilePermission) {
                return new File(permission.getName());
            }
        }
        try {
            return new File(this.f86679c.getFile());
        } catch (Exception e10) {
            f86678h.g(e10);
            return null;
        }
    }

    @Override // wq.e
    public synchronized InputStream c() throws IOException {
        if (!k()) {
            throw new IOException("Invalid resource");
        }
        try {
            InputStream inputStream = this.f86682f;
            if (inputStream != null) {
                this.f86682f = null;
                return inputStream;
            }
            return this.f86681e.getInputStream();
        } finally {
            this.f86681e = null;
        }
    }

    @Override // wq.e
    public long d() {
        if (k()) {
            return this.f86681e.getLastModified();
        }
        return -1L;
    }

    @Override // wq.e
    public boolean delete() throws SecurityException {
        throw new SecurityException("Delete not supported");
    }

    public boolean equals(Object obj) {
        return (obj instanceof f) && this.f86680d.equals(((f) obj).f86680d);
    }

    public int hashCode() {
        return this.f86680d.hashCode();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0016 A[Catch: all -> 0x001a, TRY_LEAVE, TryCatch #1 {, blocks: (B:3:0x0001, B:6:0x0006, B:10:0x0010, B:11:0x0012, B:13:0x0016, B:9:0x000b), top: B:21:0x0001, inners: #0 }] */
    @Override // wq.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void i() {
        /*
            r3 = this;
            monitor-enter(r3)
            java.io.InputStream r0 = r3.f86682f     // Catch: java.lang.Throwable -> L1a
            r1 = 0
            if (r0 == 0) goto L12
            r0.close()     // Catch: java.io.IOException -> La java.lang.Throwable -> L1a
            goto L10
        La:
            r0 = move-exception
            vq.c r2 = wq.f.f86678h     // Catch: java.lang.Throwable -> L1a
            r2.g(r0)     // Catch: java.lang.Throwable -> L1a
        L10:
            r3.f86682f = r1     // Catch: java.lang.Throwable -> L1a
        L12:
            java.net.URLConnection r0 = r3.f86681e     // Catch: java.lang.Throwable -> L1a
            if (r0 == 0) goto L18
            r3.f86681e = r1     // Catch: java.lang.Throwable -> L1a
        L18:
            monitor-exit(r3)
            return
        L1a:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: wq.f.i():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized boolean k() {
        /*
            r2 = this;
            monitor-enter(r2)
            java.net.URLConnection r0 = r2.f86681e     // Catch: java.lang.Throwable -> L22
            if (r0 != 0) goto L19
            java.net.URL r0 = r2.f86679c     // Catch: java.io.IOException -> L13 java.lang.Throwable -> L22
            java.net.URLConnection r0 = r0.openConnection()     // Catch: java.io.IOException -> L13 java.lang.Throwable -> L22
            r2.f86681e = r0     // Catch: java.io.IOException -> L13 java.lang.Throwable -> L22
            boolean r1 = r2.f86683g     // Catch: java.io.IOException -> L13 java.lang.Throwable -> L22
            r0.setUseCaches(r1)     // Catch: java.io.IOException -> L13 java.lang.Throwable -> L22
            goto L19
        L13:
            r0 = move-exception
            vq.c r1 = wq.f.f86678h     // Catch: java.lang.Throwable -> L22
            r1.g(r0)     // Catch: java.lang.Throwable -> L22
        L19:
            java.net.URLConnection r0 = r2.f86681e     // Catch: java.lang.Throwable -> L22
            if (r0 == 0) goto L1f
            r0 = 1
            goto L20
        L1f:
            r0 = 0
        L20:
            monitor-exit(r2)
            return r0
        L22:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: wq.f.k():boolean");
    }

    public boolean l() {
        return this.f86683g;
    }

    public String toString() {
        return this.f86680d;
    }
}
