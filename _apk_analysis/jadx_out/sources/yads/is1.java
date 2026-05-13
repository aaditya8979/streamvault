package yads;

import android.content.Context;
import android.os.StatFs;

/* JADX INFO: loaded from: classes6.dex */
public abstract class is1 {
    public static long a(Context context, long j10, long j11) {
        long availableBlocks;
        long jK = zn.n.k(j10, j11);
        try {
            StatFs statFs = new StatFs(ug0.a(context, "").getAbsolutePath());
            availableBlocks = ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
        } catch (IllegalArgumentException unused) {
            boolean z10 = ad1.f87661a;
            availableBlocks = jK;
        }
        long j12 = 100;
        return zn.n.f(zn.n.k((((long) 2) * availableBlocks) / j12, j11), zn.n.k(jK, (availableBlocks * ((long) 50)) / j12));
    }
}
