package yo;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TreeJsonDecoder.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class o0 extends c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final JsonElement f97971h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(@NotNull xo.a aVar, @NotNull JsonElement jsonElement, @Nullable String str) {
        super(aVar, jsonElement, str, null);
        tn.p.k(aVar, "json");
        tn.p.k(jsonElement, "value");
        this.f97971h = jsonElement;
        d0("primitive");
    }

    public /* synthetic */ o0(xo.a aVar, JsonElement jsonElement, String str, int i10, tn.i iVar) {
        this(aVar, jsonElement, (i10 & 4) != 0 ? null : str);
    }

    @Override // yo.c
    @NotNull
    public JsonElement A0() {
        return this.f97971h;
    }

    @Override // yo.c
    @NotNull
    public JsonElement m0(@NotNull String str) {
        tn.p.k(str, "tag");
        if (str == "primitive") {
            return A0();
        }
        throw new IllegalArgumentException("This input can only handle primitives with 'primitive' tag".toString());
    }

    @Override // vo.c
    public int w(@NotNull SerialDescriptor serialDescriptor) {
        tn.p.k(serialDescriptor, "descriptor");
        return 0;
    }
}
