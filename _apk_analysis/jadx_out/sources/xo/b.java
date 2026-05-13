package xo;

import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: JsonElementBuilders.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final List<JsonElement> f87012a = new ArrayList();

    public final boolean a(@NotNull JsonElement jsonElement) {
        tn.p.k(jsonElement, "element");
        this.f87012a.add(jsonElement);
        return true;
    }

    @NotNull
    public final JsonArray b() {
        return new JsonArray(this.f87012a);
    }
}
