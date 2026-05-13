package mo;

import io.e0;
import io.h0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Semaphore.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f74829a = h0.e("kotlinx.coroutines.semaphore.maxSpinCycles", 100, 0, 0, 12, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final e0 f74830b = new e0("PERMIT");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final e0 f74831c = new e0("TAKEN");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final e0 f74832d = new e0("BROKEN");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final e0 f74833e = new e0("CANCELLED");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f74834f = h0.e("kotlinx.coroutines.semaphore.segmentSize", 16, 0, 0, 12, null);

    @NotNull
    public static final h a(int i10, int i11) {
        return new j(i10, i11);
    }

    public static /* synthetic */ h b(int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        return a(i10, i11);
    }

    public static final l j(long j10, l lVar) {
        return new l(j10, lVar, 0);
    }
}
