package kotlinx.serialization;

import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SerializationExceptions.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class UnknownFieldException extends SerializationException {
    public UnknownFieldException(int i10) {
        this("An unknown field for index " + i10);
    }

    public UnknownFieldException(@Nullable String str) {
        super(str);
    }
}
