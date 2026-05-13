package kotlinx.serialization.json.internal;

import kotlinx.serialization.SerializationException;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: JsonExceptions.kt */
/* JADX INFO: loaded from: classes9.dex */
public class JsonException extends SerializationException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsonException(@NotNull String str) {
        super(str);
        p.k(str, "message");
    }
}
