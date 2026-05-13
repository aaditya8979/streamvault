package yo;

import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: TreeJsonDecoder.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class y0 extends u0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final JsonObject f98004l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final List<String> f98005m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f98006n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f98007o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(@NotNull xo.a aVar, @NotNull JsonObject jsonObject) {
        super(aVar, jsonObject, null, null, 12, null);
        tn.p.k(aVar, "json");
        tn.p.k(jsonObject, "value");
        this.f98004l = jsonObject;
        List<String> listG1 = cn.f0.g1(A0().keySet());
        this.f98005m = listG1;
        this.f98006n = listG1.size() * 2;
        this.f98007o = -1;
    }

    @Override // yo.u0, yo.c
    @NotNull
    /* JADX INFO: renamed from: E0, reason: merged with bridge method [inline-methods] */
    public JsonObject A0() {
        return this.f98004l;
    }

    @Override // yo.u0, yo.c, vo.c
    public void c(@NotNull SerialDescriptor serialDescriptor) {
        tn.p.k(serialDescriptor, "descriptor");
    }

    @Override // yo.u0, wo.n1
    @NotNull
    public String g0(@NotNull SerialDescriptor serialDescriptor, int i10) {
        tn.p.k(serialDescriptor, "descriptor");
        return this.f98005m.get(i10 / 2);
    }

    @Override // yo.u0, yo.c
    @NotNull
    public JsonElement m0(@NotNull String str) {
        tn.p.k(str, "tag");
        return this.f98007o % 2 == 0 ? xo.i.c(str) : (JsonElement) kotlin.collections.a.k(A0(), str);
    }

    @Override // yo.u0, vo.c
    public int w(@NotNull SerialDescriptor serialDescriptor) {
        tn.p.k(serialDescriptor, "descriptor");
        int i10 = this.f98007o;
        if (i10 >= this.f98006n - 1) {
            return -1;
        }
        int i11 = i10 + 1;
        this.f98007o = i11;
        return i11;
    }
}
