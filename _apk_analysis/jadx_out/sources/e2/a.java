package e2;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.UnknownHostException;
import s1.e;

/* JADX INFO: compiled from: StackTraceUtil.java */
/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f60025a;

    static {
        String name = e.class.getName();
        f60025a = name.substring(0, name.lastIndexOf(46) + 1);
    }

    public static StackTraceElement[] a(StackTraceElement[] stackTraceElementArr, int i10) {
        int length = stackTraceElementArr.length;
        if (i10 > 0) {
            length = Math.min(i10, length);
        }
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[length];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr2, 0, length);
        return stackTraceElementArr2;
    }

    public static StackTraceElement[] b(StackTraceElement[] stackTraceElementArr, String str, int i10) {
        return a(c(stackTraceElementArr, str), i10);
    }

    public static StackTraceElement[] c(StackTraceElement[] stackTraceElementArr, String str) {
        int i10;
        int length = stackTraceElementArr.length;
        for (int i11 = length - 1; i11 >= 0; i11--) {
            String className = stackTraceElementArr[i11].getClassName();
            if (className.startsWith(f60025a) || (str != null && className.startsWith(str))) {
                i10 = i11 + 1;
                break;
            }
        }
        i10 = 0;
        int i12 = length - i10;
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[i12];
        System.arraycopy(stackTraceElementArr, i10, stackTraceElementArr2, 0, i12);
        return stackTraceElementArr2;
    }

    public static String d(Throwable th2) {
        if (th2 == null) {
            return "";
        }
        for (Throwable cause = th2; cause != null; cause = cause.getCause()) {
            if (cause instanceof UnknownHostException) {
                return "";
            }
        }
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th2.printStackTrace(printWriter);
        printWriter.flush();
        return stringWriter.toString();
    }
}
