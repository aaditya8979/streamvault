package am;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Callable;
import xl.s;

/* JADX INFO: compiled from: AndroidSchedulers.java */
/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s f3999a = zl.a.d(new CallableC0004a());

    /* JADX INFO: renamed from: am.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AndroidSchedulers.java */
    public static class CallableC0004a implements Callable<s> {
        @Override // java.util.concurrent.Callable
        public s call() throws Exception {
            return b.f4000a;
        }
    }

    /* JADX INFO: compiled from: AndroidSchedulers.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final s f4000a = new am.b(new Handler(Looper.getMainLooper()), false);
    }

    public static s a() {
        return zl.a.e(f3999a);
    }
}
