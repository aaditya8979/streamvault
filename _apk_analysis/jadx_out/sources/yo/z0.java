package yo;

import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: TreeJsonEncoder.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class z0 extends v0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f98008h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f98009i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(@NotNull xo.a aVar, @NotNull sn.l<? super JsonElement, bn.r> lVar) {
        super(aVar, lVar);
        tn.p.k(aVar, "json");
        tn.p.k(lVar, "nodeConsumer");
        this.f98009i = true;
    }

    @Override // yo.v0, yo.e
    @NotNull
    public JsonElement s0() {
        return new JsonObject(x0());
    }

    @Override // yo.v0, yo.e
    public void w0(@NotNull String str, @NotNull JsonElement jsonElement) {
        tn.p.k(str, "key");
        tn.p.k(jsonElement, "element");
        if (!this.f98009i) {
            Map<String, JsonElement> mapX0 = x0();
            String str2 = this.f98008h;
            if (str2 == null) {
                tn.p.C("tag");
                str2 = null;
            }
            mapX0.put(str2, jsonElement);
            this.f98009i = true;
            return;
        }
        if (jsonElement instanceof JsonPrimitive) {
            this.f98008h = ((JsonPrimitive) jsonElement).f();
            this.f98009i = false;
        } else {
            if (jsonElement instanceof JsonObject) {
                throw j0.d(xo.c0.f87019a.getDescriptor());
            }
            if (!(jsonElement instanceof JsonArray)) {
                throw new NoWhenBranchMatchedException();
            }
            throw j0.d(xo.c.f87014a.getDescriptor());
        }
    }
}
