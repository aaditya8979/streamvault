package ab;

import android.os.SystemClock;

/* JADX INFO: compiled from: DoubleUtils.java */
/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static long f3697a;

    public static boolean a() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime - f3697a < 600) {
            return true;
        }
        f3697a = jElapsedRealtime;
        return false;
    }
}
