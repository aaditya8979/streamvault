package wq;

import java.io.File;
import java.io.IOException;
import java.net.JarURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Enumeration;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

/* JADX INFO: compiled from: JarFileResource.java */
/* JADX INFO: loaded from: classes4.dex */
public class c extends d {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final vq.c f86664s = vq.b.a(c.class);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public JarFile f86665k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public File f86666l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String[] f86667m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public JarEntry f86668n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f86669o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f86670p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f86671q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f86672r;

    public c(URL url, boolean z10) {
        super(url, z10);
    }

    @Override // wq.d, wq.f, wq.e
    public boolean a() {
        boolean z10 = true;
        if (this.f86672r) {
            return true;
        }
        if (this.f86680d.endsWith("!/")) {
            try {
                return e.e(this.f86680d.substring(4, r0.length() - 2)).a();
            } catch (Exception e10) {
                f86664s.g(e10);
                return false;
            }
        }
        boolean zK = k();
        if (this.f86670p != null && this.f86671q == null) {
            this.f86669o = zK;
            return true;
        }
        JarFile jarFile = null;
        if (zK) {
            jarFile = this.f86665k;
        } else {
            try {
                JarURLConnection jarURLConnection = (JarURLConnection) new URL(this.f86670p).openConnection();
                jarURLConnection.setUseCaches(l());
                jarFile = jarURLConnection.getJarFile();
            } catch (Exception e11) {
                f86664s.g(e11);
            }
        }
        if (jarFile != null && this.f86668n == null && !this.f86669o) {
            Enumeration<JarEntry> enumerationEntries = jarFile.entries();
            while (true) {
                if (!enumerationEntries.hasMoreElements()) {
                    break;
                }
                JarEntry jarEntryNextElement = enumerationEntries.nextElement();
                String strReplace = jarEntryNextElement.getName().replace('\\', '/');
                if (!strReplace.equals(this.f86671q)) {
                    if (!this.f86671q.endsWith("/")) {
                        if (strReplace.startsWith(this.f86671q) && strReplace.length() > this.f86671q.length() && strReplace.charAt(this.f86671q.length()) == '/') {
                            this.f86669o = true;
                            break;
                        }
                    } else if (strReplace.startsWith(this.f86671q)) {
                        this.f86669o = true;
                        break;
                    }
                } else {
                    this.f86668n = jarEntryNextElement;
                    this.f86669o = this.f86671q.endsWith("/");
                    break;
                }
            }
            if (this.f86669o && !this.f86680d.endsWith("/")) {
                this.f86680d += "/";
                try {
                    this.f86679c = new URL(this.f86680d);
                } catch (MalformedURLException e12) {
                    f86664s.e(e12);
                }
            }
        }
        if (!this.f86669o && this.f86668n == null) {
            z10 = false;
        }
        this.f86672r = z10;
        return z10;
    }

    @Override // wq.f, wq.e
    public long d() {
        JarEntry jarEntry;
        if (!k() || this.f86666l == null) {
            return -1L;
        }
        return (!a() || (jarEntry = this.f86668n) == null) ? this.f86666l.lastModified() : jarEntry.getTime();
    }

    @Override // wq.d, wq.f, wq.e
    public synchronized void i() {
        this.f86667m = null;
        this.f86668n = null;
        this.f86666l = null;
        if (l() || this.f86665k == null) {
            this.f86665k = null;
            super.i();
        } else {
            try {
                f86664s.h("Closing JarFile " + this.f86665k.getName(), new Object[0]);
                this.f86665k.close();
            } catch (IOException e10) {
                f86664s.g(e10);
            }
            this.f86665k = null;
            super.i();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // wq.d, wq.f
    public boolean k() {
        try {
            super.k();
            return this.f86665k != null;
        } finally {
            if (this.f86674i == null) {
                this.f86668n = null;
                this.f86666l = null;
                this.f86665k = null;
                this.f86667m = null;
            }
        }
    }

    @Override // wq.d
    public synchronized void m() throws IOException {
        super.m();
        this.f86668n = null;
        this.f86666l = null;
        this.f86665k = null;
        this.f86667m = null;
        int iIndexOf = this.f86680d.indexOf("!/") + 2;
        this.f86670p = this.f86680d.substring(0, iIndexOf);
        String strSubstring = this.f86680d.substring(iIndexOf);
        this.f86671q = strSubstring;
        if (strSubstring.length() == 0) {
            this.f86671q = null;
        }
        this.f86665k = this.f86674i.getJarFile();
        this.f86666l = new File(this.f86665k.getName());
    }
}
