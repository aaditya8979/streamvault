package s7;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.Size;
import java.net.UnknownHostException;

/* JADX INFO: compiled from: Log.java */
/* JADX INFO: loaded from: classes5.dex */
public final class q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @GuardedBy("lock")
    public static int f79518b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @GuardedBy("lock")
    public static boolean f79519c = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f79517a = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @GuardedBy("lock")
    public static a f79520d = a.f79521a;

    /* JADX INFO: compiled from: Log.java */
    public interface a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f79521a = new C0951a();

        /* JADX INFO: renamed from: s7.q$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: Log.java */
        public class C0951a implements a {
            @Override // s7.q.a
            public void a(String str, String str2) {
                Log.e(str, str2);
            }

            @Override // s7.q.a
            public void b(String str, String str2) {
                Log.i(str, str2);
            }

            @Override // s7.q.a
            public void d(String str, String str2) {
                Log.d(str, str2);
            }

            @Override // s7.q.a
            public void w(String str, String str2) {
                Log.w(str, str2);
            }
        }

        void a(String str, String str2);

        void b(String str, String str2);

        void d(String str, String str2);

        void w(String str, String str2);
    }

    public static String a(String str, @Nullable Throwable th2) {
        String strE = e(th2);
        if (TextUtils.isEmpty(strE)) {
            return str;
        }
        return str + "\n  " + strE.replace("\n", "\n  ") + '\n';
    }

    public static void b(@Size(max = 23) String str, String str2) {
        synchronized (f79517a) {
            if (f79518b == 0) {
                f79520d.d(str, str2);
            }
        }
    }

    public static void c(@Size(max = 23) String str, String str2) {
        synchronized (f79517a) {
            if (f79518b <= 3) {
                f79520d.a(str, str2);
            }
        }
    }

    public static void d(@Size(max = 23) String str, String str2, @Nullable Throwable th2) {
        c(str, a(str2, th2));
    }

    @Nullable
    public static String e(@Nullable Throwable th2) {
        synchronized (f79517a) {
            if (th2 == null) {
                return null;
            }
            if (h(th2)) {
                return "UnknownHostException (no network)";
            }
            if (f79519c) {
                return Log.getStackTraceString(th2).trim().replace("\t", "    ");
            }
            return th2.getMessage();
        }
    }

    public static void f(@Size(max = 23) String str, String str2) {
        synchronized (f79517a) {
            if (f79518b <= 1) {
                f79520d.b(str, str2);
            }
        }
    }

    public static void g(@Size(max = 23) String str, String str2, @Nullable Throwable th2) {
        f(str, a(str2, th2));
    }

    public static boolean h(@Nullable Throwable th2) {
        while (th2 != null) {
            if (th2 instanceof UnknownHostException) {
                return true;
            }
            th2 = th2.getCause();
        }
        return false;
    }

    public static void i(@Size(max = 23) String str, String str2) {
        synchronized (f79517a) {
            if (f79518b <= 2) {
                f79520d.w(str, str2);
            }
        }
    }

    public static void j(@Size(max = 23) String str, String str2, @Nullable Throwable th2) {
        i(str, a(str2, th2));
    }
}
