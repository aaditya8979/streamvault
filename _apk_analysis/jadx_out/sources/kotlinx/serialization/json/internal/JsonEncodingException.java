package kotlinx.serialization.json.internal;

import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: JsonExceptions.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class JsonEncodingException extends JsonException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsonEncodingException(@NotNull String str) {
        super(str);
        p.k(str, "message");
    }
}
