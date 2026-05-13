package yo;

import kotlinx.serialization.json.JsonElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TreeJsonEncoder.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class p0 extends e {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public JsonElement f97973g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(@NotNull xo.a aVar, @NotNull sn.l<? super JsonElement, bn.r> lVar) {
        super(aVar, lVar, null);
        tn.p.k(aVar, "json");
        tn.p.k(lVar, "nodeConsumer");
        Z("primitive");
    }

    @Override // yo.e
    @NotNull
    public JsonElement s0() {
        JsonElement jsonElement = this.f97973g;
        if (jsonElement != null) {
            return jsonElement;
        }
        throw new IllegalArgumentException("Primitive element has not been recorded. Is call to .encodeXxx is missing in serializer?".toString());
    }

    @Override // yo.e
    public void w0(@NotNull String str, @NotNull JsonElement jsonElement) {
        tn.p.k(str, "key");
        tn.p.k(jsonElement, "element");
        if (!(str == "primitive")) {
            throw new IllegalArgumentException("This output can only consume primitives with 'primitive' tag".toString());
        }
        if (!(this.f97973g == null)) {
            throw new IllegalArgumentException("Primitive element was already recorded. Does call to .encodeXxx happen more than once?".toString());
        }
        this.f97973g = jsonElement;
        t0().invoke(jsonElement);
    }
}
