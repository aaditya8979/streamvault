package an;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ResourceBundle;
import zm.n;

/* JADX INFO: compiled from: HttpServlet.java */
/* JADX INFO: loaded from: classes3.dex */
public class l extends d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ResourceBundle f4011f = ResourceBundle.getBundle("javax.servlet.http.LocalStrings");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public k f4012b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public PrintWriter f4013c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f4014d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f4015e;

    public l(c cVar) {
        super(cVar);
        this.f4012b = new k();
    }

    @Override // an.d, an.c
    public void a(String str, String str2) {
        super.a(str, str2);
        s(str);
    }

    @Override // zm.u, zm.t
    public n e() throws IOException {
        if (this.f4013c != null) {
            throw new IllegalStateException(f4011f.getString("err.ise.getOutputStream"));
        }
        this.f4015e = true;
        return this.f4012b;
    }

    @Override // zm.u, zm.t
    public PrintWriter h() throws UnsupportedEncodingException {
        if (this.f4015e) {
            throw new IllegalStateException(f4011f.getString("err.ise.getWriter"));
        }
        if (this.f4013c == null) {
            this.f4013c = new PrintWriter(new OutputStreamWriter(this.f4012b, f()));
        }
        return this.f4013c;
    }

    @Override // an.d, an.c
    public void j(String str, String str2) {
        super.j(str, str2);
        s(str);
    }

    @Override // zm.u, zm.t
    public void p(int i10) {
        super.p(i10);
        this.f4014d = true;
    }

    public final void s(String str) {
        if ("content-length".equalsIgnoreCase(str)) {
            this.f4014d = true;
        }
    }

    public void t() {
        if (this.f4014d) {
            return;
        }
        PrintWriter printWriter = this.f4013c;
        if (printWriter != null) {
            printWriter.flush();
        }
        p(this.f4012b.d());
    }
}
