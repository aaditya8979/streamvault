package yads;

import android.os.Trace;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d73 {
    public static void a() {
        if (ib3.f90737a >= 18) {
            Trace.endSection();
        }
    }

    public static void a(String str) {
        if (ib3.f90737a >= 18) {
            Trace.beginSection(str);
        }
    }
}
