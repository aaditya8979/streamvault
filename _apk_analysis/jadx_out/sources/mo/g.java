package mo;

import io.e0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Mutex.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final e0 f74826a = new e0("NO_OWNER");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final e0 f74827b = new e0("ALREADY_LOCKED_BY_OWNER");

    @NotNull
    public static final a a(boolean z10) {
        return new f(z10);
    }

    public static /* synthetic */ a b(boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return a(z10);
    }
}
