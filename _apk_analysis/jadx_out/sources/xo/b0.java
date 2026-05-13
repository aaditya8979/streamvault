package xo;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: JsonElementBuilders.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Map<String, JsonElement> f87013a = new LinkedHashMap();

    @NotNull
    public final JsonObject a() {
        return new JsonObject(this.f87013a);
    }

    @Nullable
    public final JsonElement b(@NotNull String str, @NotNull JsonElement jsonElement) {
        tn.p.k(str, "key");
        tn.p.k(jsonElement, "element");
        return this.f87013a.put(str, jsonElement);
    }
}
