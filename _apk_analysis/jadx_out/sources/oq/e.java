package oq;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import javax.servlet.ServletException;
import mq.n;
import org.eclipse.jetty.http.HttpStatus;

/* JADX INFO: compiled from: ErrorHandler.java */
/* JADX INFO: loaded from: classes5.dex */
public class e extends oq.a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final vq.c f76533s = vq.b.a(e.class);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f76534p = true;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f76535q = true;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f76536r = "must-revalidate,no-cache,no-store";

    /* JADX INFO: compiled from: ErrorHandler.java */
    public interface a {
        String a(an.a aVar);
    }

    public void A0(an.a aVar, Writer writer, int i10, String str, boolean z10) throws IOException {
        C0(aVar, writer, i10, str, aVar.v());
        if (z10) {
            D0(aVar, writer);
        }
        writer.write("<hr /><i><small>Powered by Jetty://</small></i>");
        for (int i11 = 0; i11 < 20; i11++) {
            writer.write("<br/>                                                \n");
        }
    }

    public void B0(an.a aVar, Writer writer, int i10, String str) throws IOException {
        writer.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\"/>\n");
        writer.write("<title>Error ");
        writer.write(Integer.toString(i10));
        if (this.f76535q) {
            writer.write(32);
            y0(writer, str);
        }
        writer.write("</title>\n");
    }

    public void C0(an.a aVar, Writer writer, int i10, String str, String str2) throws IOException {
        writer.write("<h2>HTTP ERROR ");
        writer.write(Integer.toString(i10));
        writer.write("</h2>\n<p>Problem accessing ");
        y0(writer, str2);
        writer.write(". Reason:\n<pre>    ");
        y0(writer, str);
        writer.write("</pre></p>");
    }

    public void D0(an.a aVar, Writer writer) throws IOException {
        for (Throwable cause = (Throwable) aVar.getAttribute("javax.servlet.error.exception"); cause != null; cause = cause.getCause()) {
            writer.write("<h3>Caused by:</h3><pre>");
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            cause.printStackTrace(printWriter);
            printWriter.flush();
            y0(writer, stringWriter.getBuffer().toString());
            writer.write("</pre>\n");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // mq.i
    public void a0(String str, n nVar, an.a aVar, an.c cVar) throws IOException {
        String strA;
        String str2;
        mq.b bVarO = mq.b.o();
        String method = aVar.getMethod();
        if (!method.equals("GET") && !method.equals("POST") && !method.equals("HEAD")) {
            bVarO.x().m0(true);
            return;
        }
        if ((this instanceof a) && (strA = ((a) this).a(aVar)) != null && aVar.getServletContext() != null && ((str2 = (String) aVar.getAttribute("org.eclipse.jetty.server.error_page")) == null || !str2.equals(strA))) {
            aVar.a("org.eclipse.jetty.server.error_page", strA);
            mq.h hVar = (mq.h) aVar.getServletContext().d(strA);
            try {
                if (hVar != null) {
                    hVar.d(aVar, cVar);
                    return;
                }
                f76533s.f("No error page " + strA, new Object[0]);
            } catch (ServletException e10) {
                f76533s.d("EXCEPTION ", e10);
                return;
            }
        }
        bVarO.x().m0(true);
        cVar.l("text/html;charset=ISO-8859-1");
        String str3 = this.f76536r;
        if (str3 != null) {
            cVar.j("Cache-Control", str3);
        }
        sq.f fVar = new sq.f(4096);
        x0(aVar, fVar, bVarO.B().w(), bVarO.B().u());
        fVar.flush();
        cVar.p(fVar.h());
        fVar.m(cVar.e());
        fVar.d();
    }

    public void x0(an.a aVar, Writer writer, int i10, String str) throws IOException {
        z0(aVar, writer, i10, str, this.f76534p);
    }

    public void y0(Writer writer, String str) throws IOException {
        if (str == null) {
            return;
        }
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt == '&') {
                writer.write("&amp;");
            } else if (cCharAt == '<') {
                writer.write("&lt;");
            } else if (cCharAt == '>') {
                writer.write("&gt;");
            } else if (!Character.isISOControl(cCharAt) || Character.isWhitespace(cCharAt)) {
                writer.write(cCharAt);
            } else {
                writer.write(63);
            }
        }
    }

    public void z0(an.a aVar, Writer writer, int i10, String str, boolean z10) throws IOException {
        if (str == null) {
            str = HttpStatus.b(i10);
        }
        String str2 = str;
        writer.write("<html>\n<head>\n");
        B0(aVar, writer, i10, str2);
        writer.write("</head>\n<body>");
        A0(aVar, writer, i10, str2, z10);
        writer.write("\n</body>\n</html>\n");
    }
}
