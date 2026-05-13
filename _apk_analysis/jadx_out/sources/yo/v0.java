package yo;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TreeJsonEncoder.kt */
/* JADX INFO: loaded from: classes4.dex */
public class v0 extends e {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Map<String, JsonElement> f97999g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(@NotNull xo.a aVar, @NotNull sn.l<? super JsonElement, bn.r> lVar) {
        super(aVar, lVar, null);
        tn.p.k(aVar, "json");
        tn.p.k(lVar, "nodeConsumer");
        this.f97999g = new LinkedHashMap();
    }

    @Override // wo.a3, vo.d
    public <T> void f(@NotNull SerialDescriptor serialDescriptor, int i10, @NotNull so.l<? super T> lVar, @Nullable T t10) {
        tn.p.k(serialDescriptor, "descriptor");
        tn.p.k(lVar, "serializer");
        if (t10 != null || this.f97914d.j()) {
            super.f(serialDescriptor, i10, lVar, t10);
        }
    }

    @Override // yo.e
    @NotNull
    public JsonElement s0() {
        return new JsonObject(this.f97999g);
    }

    @Override // yo.e
    public void w0(@NotNull String str, @NotNull JsonElement jsonElement) {
        tn.p.k(str, "key");
        tn.p.k(jsonElement, "element");
        this.f97999g.put(str, jsonElement);
    }

    @NotNull
    public final Map<String, JsonElement> x0() {
        return this.f97999g;
    }
}
