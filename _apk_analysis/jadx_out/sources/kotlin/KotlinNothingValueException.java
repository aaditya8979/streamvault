package kotlin;

import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ExceptionsH.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class KotlinNothingValueException extends RuntimeException {
    public KotlinNothingValueException() {
    }

    public KotlinNothingValueException(@Nullable String str) {
        super(str);
    }

    public KotlinNothingValueException(@Nullable String str, @Nullable Throwable th2) {
        super(str, th2);
    }

    public KotlinNothingValueException(@Nullable Throwable th2) {
        super(th2);
    }
}
