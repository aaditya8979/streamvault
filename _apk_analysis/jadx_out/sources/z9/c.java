package z9;

import ia.c;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: FileDownloadUrlConnection.java */
/* JADX INFO: loaded from: classes10.dex */
public class c implements z9.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public URLConnection f98264a;

    /* JADX INFO: compiled from: FileDownloadUrlConnection.java */
    public static class a {
    }

    /* JADX INFO: compiled from: FileDownloadUrlConnection.java */
    public static class b implements c.b {
        public b() {
            this(null);
        }

        public b(a aVar) {
        }

        @Override // ia.c.b
        public z9.b create(String str) throws IOException {
            return new c(str, (a) null);
        }
    }

    public c(String str, a aVar) throws IOException {
        this(new URL(str), aVar);
    }

    public c(URL url, a aVar) throws IOException {
        URLConnection uRLConnectionOpenConnection = url.openConnection();
        this.f98264a = uRLConnectionOpenConnection;
        if (uRLConnectionOpenConnection instanceof HttpURLConnection) {
            ((HttpURLConnection) uRLConnectionOpenConnection).setInstanceFollowRedirects(false);
        }
    }

    @Override // z9.b
    public void a(String str, String str2) {
        this.f98264a.addRequestProperty(str, str2);
    }

    @Override // z9.b
    public InputStream b() throws IOException {
        return this.f98264a.getInputStream();
    }

    @Override // z9.b
    public void c() {
        try {
            this.f98264a.getInputStream().close();
        } catch (IOException unused) {
        }
    }

    @Override // z9.b
    public Map<String, List<String>> d() {
        return this.f98264a.getRequestProperties();
    }

    @Override // z9.b
    public Map<String, List<String>> e() {
        return this.f98264a.getHeaderFields();
    }

    @Override // z9.b
    public void execute() throws IOException {
        this.f98264a.connect();
    }

    @Override // z9.b
    public boolean f(String str, long j10) {
        return false;
    }

    @Override // z9.b
    public String g(String str) {
        return this.f98264a.getHeaderField(str);
    }

    @Override // z9.b
    public int getResponseCode() throws IOException {
        URLConnection uRLConnection = this.f98264a;
        if (uRLConnection instanceof HttpURLConnection) {
            return ((HttpURLConnection) uRLConnection).getResponseCode();
        }
        return 0;
    }

    @Override // z9.b
    public boolean h(String str) throws ProtocolException {
        URLConnection uRLConnection = this.f98264a;
        if (!(uRLConnection instanceof HttpURLConnection)) {
            return false;
        }
        ((HttpURLConnection) uRLConnection).setRequestMethod(str);
        return true;
    }
}
