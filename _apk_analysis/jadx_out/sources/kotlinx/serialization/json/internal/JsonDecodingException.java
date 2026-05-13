package kotlinx.serialization.json.internal;

import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: JsonExceptions.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class JsonDecodingException extends JsonException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsonDecodingException(@NotNull String str) {
        super(str);
        p.k(str, "message");
    }
}
