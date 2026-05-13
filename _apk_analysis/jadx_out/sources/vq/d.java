package vq;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.ironsource.Z7;
import java.io.PrintStream;
import java.security.AccessControlException;
import java.util.Properties;
import sq.i;

/* JADX INFO: compiled from: StdErrLog.java */
/* JADX INFO: loaded from: classes3.dex */
public class d extends a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f86134i = System.getProperty("line.separator");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static i f86135j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Properties f86136k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final boolean f86137l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final boolean f86138m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f86139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f86140b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public PrintStream f86141c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f86142d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f86143e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f86144f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f86145g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f86146h;

    static {
        Properties properties = new Properties();
        f86136k = properties;
        Properties properties2 = b.f86128a;
        f86137l = Boolean.parseBoolean(properties2.getProperty("org.eclipse.jetty.util.log.SOURCE", properties2.getProperty("org.eclipse.jetty.util.log.stderr.SOURCE", com.ironsource.mediationsdk.metadata.a.f32683h)));
        f86138m = Boolean.parseBoolean(b.f86128a.getProperty("org.eclipse.jetty.util.log.stderr.LONG", com.ironsource.mediationsdk.metadata.a.f32683h));
        properties.putAll(b.f86128a);
        String[] strArr = {"DEBUG", "org.eclipse.jetty.util.log.DEBUG", "org.eclipse.jetty.util.log.stderr.DEBUG"};
        for (int i10 = 0; i10 < 3; i10++) {
            String str = strArr[i10];
            if (System.getProperty(str) != null) {
                System.err.printf("System Property [%s] has been deprecated! (Use org.eclipse.jetty.LEVEL=DEBUG instead)%n", str);
            }
        }
        try {
            f86135j = new i("yyyy-MM-dd HH:mm:ss");
        } catch (Exception e10) {
            e10.printStackTrace(System.err);
        }
    }

    public d() {
        this(null);
    }

    public d(String str) {
        this(str, f86136k);
    }

    public d(String str, Properties properties) {
        Properties properties2;
        this.f86139a = 2;
        this.f86141c = null;
        this.f86142d = f86137l;
        this.f86143e = f86138m;
        this.f86146h = false;
        if (properties != null && properties != (properties2 = f86136k)) {
            properties2.putAll(properties);
        }
        str = str == null ? "" : str;
        this.f86144f = str;
        this.f86145g = l(str);
        int iS = s(properties, str);
        this.f86139a = iS;
        this.f86140b = iS;
        try {
            this.f86142d = Boolean.parseBoolean(properties.getProperty(str + ".SOURCE", Boolean.toString(this.f86142d)));
        } catch (AccessControlException unused) {
            this.f86142d = f86137l;
        }
    }

    public static String l(String str) {
        String[] strArrSplit = str.split("\\.");
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < strArrSplit.length - 1; i10++) {
            sb2.append(strArrSplit[i10].charAt(0));
        }
        if (sb2.length() > 0) {
            sb2.append('.');
        }
        sb2.append(strArrSplit[strArrSplit.length - 1]);
        return sb2.toString();
    }

    public static int r(String str, String str2) {
        if (str2 == null) {
            return -1;
        }
        String strTrim = str2.trim();
        if ("ALL".equalsIgnoreCase(strTrim)) {
            return 0;
        }
        if ("DEBUG".equalsIgnoreCase(strTrim)) {
            return 1;
        }
        if ("INFO".equalsIgnoreCase(strTrim)) {
            return 2;
        }
        if ("WARN".equalsIgnoreCase(strTrim)) {
            return 3;
        }
        System.err.println("Unknown StdErrLog level [" + str + "]=[" + strTrim + "], expecting only [ALL, DEBUG, INFO, WARN] as values.");
        return -1;
    }

    public static int s(Properties properties, String str) {
        while (str != null && str.length() > 0) {
            int iR = r(str + ".LEVEL", properties.getProperty(str + ".LEVEL"));
            if (iR != -1) {
                return iR;
            }
            int iLastIndexOf = str.lastIndexOf(46);
            str = iLastIndexOf >= 0 ? str.substring(0, iLastIndexOf) : null;
        }
        return r("log.LEVEL", properties.getProperty("log.LEVEL", "INFO"));
    }

    @Override // vq.c
    public void b(Throwable th2) {
        debug("", th2);
    }

    @Override // vq.c
    public void c(String str, Throwable th2) {
        if (this.f86139a <= 2) {
            StringBuilder sb2 = new StringBuilder(64);
            n(sb2, ":INFO:", str, th2);
            PrintStream printStream = this.f86141c;
            if (printStream == null) {
                printStream = System.err;
            }
            printStream.println(sb2);
        }
    }

    @Override // vq.c
    public void d(String str, Throwable th2) {
        if (this.f86139a <= 3) {
            StringBuilder sb2 = new StringBuilder(64);
            n(sb2, ":WARN:", str, th2);
            PrintStream printStream = this.f86141c;
            if (printStream == null) {
                printStream = System.err;
            }
            printStream.println(sb2);
        }
    }

    @Override // vq.c
    public void debug(String str, Throwable th2) {
        if (this.f86139a <= 1) {
            StringBuilder sb2 = new StringBuilder(64);
            n(sb2, ":DBUG:", str, th2);
            PrintStream printStream = this.f86141c;
            if (printStream == null) {
                printStream = System.err;
            }
            printStream.println(sb2);
        }
    }

    @Override // vq.c
    public void e(Throwable th2) {
        d("", th2);
    }

    @Override // vq.c
    public void f(String str, Object... objArr) {
        if (this.f86139a <= 3) {
            StringBuilder sb2 = new StringBuilder(64);
            o(sb2, ":WARN:", str, objArr);
            PrintStream printStream = this.f86141c;
            if (printStream == null) {
                printStream = System.err;
            }
            printStream.println(sb2);
        }
    }

    @Override // vq.c
    public void g(Throwable th2) {
        if (this.f86139a <= 0) {
            StringBuilder sb2 = new StringBuilder(64);
            n(sb2, ":IGNORED:", "", th2);
            PrintStream printStream = this.f86141c;
            if (printStream == null) {
                printStream = System.err;
            }
            printStream.println(sb2);
        }
    }

    @Override // vq.c
    public String getName() {
        return this.f86144f;
    }

    @Override // vq.c
    public void h(String str, Object... objArr) {
        if (this.f86139a <= 1) {
            StringBuilder sb2 = new StringBuilder(64);
            o(sb2, ":DBUG:", str, objArr);
            PrintStream printStream = this.f86141c;
            if (printStream == null) {
                printStream = System.err;
            }
            printStream.println(sb2);
        }
    }

    @Override // vq.c
    public void i(String str, Object... objArr) {
        if (this.f86139a <= 2) {
            StringBuilder sb2 = new StringBuilder(64);
            o(sb2, ":INFO:", str, objArr);
            PrintStream printStream = this.f86141c;
            if (printStream == null) {
                printStream = System.err;
            }
            printStream.println(sb2);
        }
    }

    @Override // vq.c
    public boolean isDebugEnabled() {
        return this.f86139a <= 1;
    }

    @Override // vq.a
    public c k(String str) {
        d dVar = new d(str);
        dVar.u(this.f86143e);
        dVar.v(this.f86142d);
        dVar.f86141c = this.f86141c;
        int i10 = this.f86139a;
        if (i10 != this.f86140b) {
            dVar.f86139a = i10;
        }
        return dVar;
    }

    public final void m(StringBuilder sb2, String str) {
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (!Character.isISOControl(cCharAt)) {
                sb2.append(cCharAt);
            } else if (cCharAt == '\n') {
                sb2.append('|');
            } else if (cCharAt == '\r') {
                sb2.append('<');
            } else {
                sb2.append('?');
            }
        }
    }

    public final void n(StringBuilder sb2, String str, String str2, Throwable th2) {
        o(sb2, str, str2, new Object[0]);
        if (t()) {
            p(sb2, String.valueOf(th2), new Object[0]);
        } else {
            q(sb2, th2);
        }
    }

    public final void o(StringBuilder sb2, String str, String str2, Object... objArr) {
        w(sb2, f86135j.c(), f86135j.b(), str);
        p(sb2, str2, objArr);
    }

    public final void p(StringBuilder sb2, String str, Object... objArr) {
        if (str == null) {
            str = "";
            for (int i10 = 0; i10 < objArr.length; i10++) {
                str = str + "{} ";
            }
        }
        int length = 0;
        for (Object obj : objArr) {
            int iIndexOf = str.indexOf(JsonUtils.EMPTY_JSON, length);
            if (iIndexOf < 0) {
                m(sb2, str.substring(length));
                sb2.append(Z7.f30794r);
                sb2.append(obj);
                length = str.length();
            } else {
                m(sb2, str.substring(length, iIndexOf));
                sb2.append(String.valueOf(obj));
                length = iIndexOf + 2;
            }
        }
        m(sb2, str.substring(length));
    }

    public final void q(StringBuilder sb2, Throwable th2) {
        if (th2 == null) {
            sb2.append("null");
            return;
        }
        sb2.append(f86134i);
        p(sb2, th2.toString(), new Object[0]);
        StackTraceElement[] stackTrace = th2.getStackTrace();
        for (int i10 = 0; stackTrace != null && i10 < stackTrace.length; i10++) {
            sb2.append(f86134i);
            sb2.append("\tat ");
            p(sb2, stackTrace[i10].toString(), new Object[0]);
        }
        Throwable cause = th2.getCause();
        if (cause == null || cause == th2) {
            return;
        }
        sb2.append(f86134i);
        sb2.append("Caused by: ");
        q(sb2, cause);
    }

    public boolean t() {
        return this.f86146h;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("StdErrLog:");
        sb2.append(this.f86144f);
        sb2.append(":LEVEL=");
        int i10 = this.f86139a;
        if (i10 == 0) {
            sb2.append("ALL");
        } else if (i10 == 1) {
            sb2.append("DEBUG");
        } else if (i10 == 2) {
            sb2.append("INFO");
        } else if (i10 != 3) {
            sb2.append("?");
        } else {
            sb2.append("WARN");
        }
        return sb2.toString();
    }

    public void u(boolean z10) {
        this.f86143e = z10;
    }

    public void v(boolean z10) {
        this.f86142d = z10;
    }

    public final void w(StringBuilder sb2, String str, int i10, String str2) {
        sb2.setLength(0);
        sb2.append(str);
        if (i10 > 99) {
            sb2.append('.');
        } else if (i10 > 9) {
            sb2.append(".0");
        } else {
            sb2.append(".00");
        }
        sb2.append(i10);
        sb2.append(str2);
        if (this.f86143e) {
            sb2.append(this.f86144f);
        } else {
            sb2.append(this.f86145g);
        }
        sb2.append(':');
        if (this.f86142d) {
            for (StackTraceElement stackTraceElement : new Throwable().getStackTrace()) {
                String className = stackTraceElement.getClassName();
                if (!className.equals(d.class.getName()) && !className.equals(b.class.getName())) {
                    if (this.f86143e || !className.startsWith("org.eclipse.jetty.")) {
                        sb2.append(className);
                    } else {
                        sb2.append(l(className));
                    }
                    sb2.append('#');
                    sb2.append(stackTraceElement.getMethodName());
                    if (stackTraceElement.getFileName() != null) {
                        sb2.append('(');
                        sb2.append(stackTraceElement.getFileName());
                        sb2.append(':');
                        sb2.append(stackTraceElement.getLineNumber());
                        sb2.append(')');
                    }
                    sb2.append(':');
                    return;
                }
            }
        }
    }
}
