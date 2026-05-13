package kotlin;

import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: NoWhenBranchMatchedException.kt */
/* JADX INFO: loaded from: classes10.dex */
public class NoWhenBranchMatchedException extends RuntimeException {
    public NoWhenBranchMatchedException() {
    }

    public NoWhenBranchMatchedException(@Nullable String str) {
        super(str);
    }

    public NoWhenBranchMatchedException(@Nullable String str, @Nullable Throwable th2) {
        super(str, th2);
    }

    public NoWhenBranchMatchedException(@Nullable Throwable th2) {
        super(th2);
    }
}
