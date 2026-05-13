package kotlinx.serialization.json;

import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;
import so.k;
import xo.z;

/* JADX INFO: compiled from: JsonElement.kt */
/* JADX INFO: loaded from: classes3.dex */
@k(with = z.class)
public final class JsonNull extends JsonPrimitive {

    @NotNull
    public static final JsonNull INSTANCE = new JsonNull();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final String f73472b = "null";

    public JsonNull() {
        super(null);
    }

    @Override // kotlinx.serialization.json.JsonPrimitive
    @NotNull
    public String f() {
        return f73472b;
    }

    @NotNull
    public final KSerializer<JsonNull> serializer() {
        return z.f87070a;
    }
}
