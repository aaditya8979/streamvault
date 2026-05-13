package s7;

import android.os.Trace;
import androidx.annotation.RequiresApi;

/* JADX INFO: compiled from: TraceUtil.java */
/* JADX INFO: loaded from: classes10.dex */
public final class k0 {
    public static void a(String str) {
        if (m0.f79487a >= 18) {
            b(str);
        }
    }

    @RequiresApi(18)
    public static void b(String str) {
        Trace.beginSection(str);
    }

    public static void c() {
        if (m0.f79487a >= 18) {
            d();
        }
    }

    @RequiresApi(18)
    public static void d() {
        Trace.endSection();
    }
}
