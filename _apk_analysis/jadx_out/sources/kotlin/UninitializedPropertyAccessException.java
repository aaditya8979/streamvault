package kotlin;

import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: UninitializedPropertyAccessException.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class UninitializedPropertyAccessException extends RuntimeException {
    public UninitializedPropertyAccessException() {
    }

    public UninitializedPropertyAccessException(@Nullable String str) {
        super(str);
    }

    public UninitializedPropertyAccessException(@Nullable String str, @Nullable Throwable th2) {
        super(str, th2);
    }

    public UninitializedPropertyAccessException(@Nullable Throwable th2) {
        super(th2);
    }
}
