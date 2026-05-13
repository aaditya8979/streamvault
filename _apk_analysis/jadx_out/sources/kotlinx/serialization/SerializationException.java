package kotlinx.serialization;

import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SerializationExceptions.kt */
/* JADX INFO: loaded from: classes9.dex */
public class SerializationException extends IllegalArgumentException {
    public SerializationException() {
    }

    public SerializationException(@Nullable String str) {
        super(str);
    }

    public SerializationException(@Nullable String str, @Nullable Throwable th2) {
        super(str, th2);
    }

    public SerializationException(@Nullable Throwable th2) {
        super(th2);
    }
}
