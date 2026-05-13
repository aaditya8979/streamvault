package wq;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.security.Permission;
import sq.q;

/* JADX INFO: compiled from: FileResource.java */
/* JADX INFO: loaded from: classes4.dex */
public class b extends f {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final vq.c f86659l = vq.b.a(b.class);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static boolean f86660m = true;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public File f86661i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public transient URL f86662j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public transient boolean f86663k;

    public b(URL url) throws URISyntaxException, IOException {
        super(url, null);
        this.f86662j = null;
        this.f86663k = false;
        try {
            this.f86661i = new File(new URI(url.toString()));
        } catch (URISyntaxException e10) {
            throw e10;
        } catch (Exception e11) {
            f86659l.g(e11);
            try {
                URI uri = new URI("file:" + q.f(url.toString().substring(5)));
                if (uri.getAuthority() == null) {
                    this.f86661i = new File(uri);
                } else {
                    this.f86661i = new File("//" + uri.getAuthority() + q.d(url.getFile()));
                }
            } catch (Exception e12) {
                f86659l.g(e12);
                k();
                Permission permission = this.f86681e.getPermission();
                this.f86661i = new File(permission == null ? url.getFile() : permission.getName());
            }
        }
        if (!this.f86661i.isDirectory()) {
            if (this.f86680d.endsWith("/")) {
                this.f86680d = this.f86680d.substring(0, r6.length() - 1);
                return;
            }
            return;
        }
        if (this.f86680d.endsWith("/")) {
            return;
        }
        this.f86680d += "/";
    }

    public b(URL url, URLConnection uRLConnection, File file) {
        super(url, uRLConnection);
        this.f86662j = null;
        this.f86663k = false;
        this.f86661i = file;
        if (!file.isDirectory() || this.f86680d.endsWith("/")) {
            return;
        }
        this.f86680d += "/";
    }

    @Override // wq.f, wq.e
    public boolean a() {
        return this.f86661i.exists();
    }

    @Override // wq.f, wq.e
    public File b() {
        return this.f86661i;
    }

    @Override // wq.f, wq.e
    public InputStream c() throws IOException {
        return new FileInputStream(this.f86661i);
    }

    @Override // wq.f, wq.e
    public long d() {
        return this.f86661i.lastModified();
    }

    @Override // wq.f, wq.e
    public boolean delete() throws SecurityException {
        return this.f86661i.delete();
    }

    @Override // wq.f
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof b)) {
            return false;
        }
        Object obj2 = ((b) obj).f86661i;
        File file = this.f86661i;
        if (obj2 != file) {
            return file != null && file.equals(obj2);
        }
        return true;
    }

    @Override // wq.f
    public int hashCode() {
        File file = this.f86661i;
        return file == null ? super.hashCode() : file.hashCode();
    }
}
