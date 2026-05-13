package yo;

import java.util.ArrayList;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: TreeJsonEncoder.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class x0 extends e {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final ArrayList<JsonElement> f98003g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(@NotNull xo.a aVar, @NotNull sn.l<? super JsonElement, bn.r> lVar) {
        super(aVar, lVar, null);
        tn.p.k(aVar, "json");
        tn.p.k(lVar, "nodeConsumer");
        this.f98003g = new ArrayList<>();
    }

    @Override // yo.e, wo.o1
    @NotNull
    public String b0(@NotNull SerialDescriptor serialDescriptor, int i10) {
        tn.p.k(serialDescriptor, "descriptor");
        return String.valueOf(i10);
    }

    @Override // yo.e
    @NotNull
    public JsonElement s0() {
        return new JsonArray(this.f98003g);
    }

    @Override // yo.e
    public void w0(@NotNull String str, @NotNull JsonElement jsonElement) {
        tn.p.k(str, "key");
        tn.p.k(jsonElement, "element");
        this.f98003g.add(Integer.parseInt(str), jsonElement);
    }
}
