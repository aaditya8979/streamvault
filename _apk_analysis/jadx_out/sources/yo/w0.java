package yo;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: TreeJsonDecoder.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class w0 extends c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final JsonArray f98000h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f98001i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f98002j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(@NotNull xo.a aVar, @NotNull JsonArray jsonArray) {
        super(aVar, jsonArray, null, 4, null);
        tn.p.k(aVar, "json");
        tn.p.k(jsonArray, "value");
        this.f98000h = jsonArray;
        this.f98001i = A0().size();
        this.f98002j = -1;
    }

    @Override // yo.c
    @NotNull
    /* JADX INFO: renamed from: D0, reason: merged with bridge method [inline-methods] */
    public JsonArray A0() {
        return this.f98000h;
    }

    @Override // wo.n1
    @NotNull
    public String g0(@NotNull SerialDescriptor serialDescriptor, int i10) {
        tn.p.k(serialDescriptor, "descriptor");
        return String.valueOf(i10);
    }

    @Override // yo.c
    @NotNull
    public JsonElement m0(@NotNull String str) {
        tn.p.k(str, "tag");
        return A0().get(Integer.parseInt(str));
    }

    @Override // vo.c
    public int w(@NotNull SerialDescriptor serialDescriptor) {
        tn.p.k(serialDescriptor, "descriptor");
        int i10 = this.f98002j;
        if (i10 >= this.f98001i - 1) {
            return -1;
        }
        int i11 = i10 + 1;
        this.f98002j = i11;
        return i11;
    }
}
