package bn;

import java.io.PrintWriter;
import java.io.StringWriter;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Exceptions.kt */
/* JADX INFO: loaded from: classes10.dex */
public class d {
    public static final void a(@NotNull Throwable th2, @NotNull Throwable th3) {
        tn.p.k(th2, "<this>");
        tn.p.k(th3, "exception");
        if (th2 != th3) {
            ln.b.f73875a.a(th2, th3);
        }
    }

    @NotNull
    public static final String b(@NotNull Throwable th2) {
        tn.p.k(th2, "<this>");
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th2.printStackTrace(printWriter);
        printWriter.flush();
        String string = stringWriter.toString();
        tn.p.j(string, "toString(...)");
        return string;
    }
}
