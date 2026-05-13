package yo;

import kotlin.NoWhenBranchMatchedException;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: TreeJsonDecoder.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class l1 {
    public static final <T> T a(@NotNull xo.a aVar, @NotNull JsonElement jsonElement, @NotNull so.c<? extends T> cVar) {
        Decoder o0Var;
        tn.p.k(aVar, "json");
        tn.p.k(jsonElement, "element");
        tn.p.k(cVar, "deserializer");
        if (jsonElement instanceof JsonObject) {
            o0Var = new u0(aVar, (JsonObject) jsonElement, null, null, 12, null);
        } else if (jsonElement instanceof JsonArray) {
            o0Var = new w0(aVar, (JsonArray) jsonElement);
        } else {
            if (!(jsonElement instanceof xo.v) && !tn.p.f(jsonElement, JsonNull.INSTANCE)) {
                throw new NoWhenBranchMatchedException();
            }
            o0Var = new o0(aVar, (JsonPrimitive) jsonElement, null, 4, null);
        }
        return (T) o0Var.A(cVar);
    }

    public static final <T> T b(@NotNull xo.a aVar, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull so.c<? extends T> cVar) {
        tn.p.k(aVar, "<this>");
        tn.p.k(str, "discriminator");
        tn.p.k(jsonObject, "element");
        tn.p.k(cVar, "deserializer");
        return (T) new u0(aVar, jsonObject, str, cVar.getDescriptor()).A(cVar);
    }
}
