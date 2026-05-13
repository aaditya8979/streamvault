package xo;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonPrimitive;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import yo.k1;

/* JADX INFO: compiled from: JsonElement.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class v extends JsonPrimitive {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f87065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final SerialDescriptor f87066c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f87067d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(@NotNull Object obj, boolean z10, @Nullable SerialDescriptor serialDescriptor) {
        super(null);
        tn.p.k(obj, "body");
        this.f87065b = z10;
        this.f87066c = serialDescriptor;
        this.f87067d = obj.toString();
        if (serialDescriptor != null && !serialDescriptor.isInline()) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    public /* synthetic */ v(Object obj, boolean z10, SerialDescriptor serialDescriptor, int i10, tn.i iVar) {
        this(obj, z10, (i10 & 4) != 0 ? null : serialDescriptor);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v.class != obj.getClass()) {
            return false;
        }
        v vVar = (v) obj;
        return h() == vVar.h() && tn.p.f(f(), vVar.f());
    }

    @Override // kotlinx.serialization.json.JsonPrimitive
    @NotNull
    public String f() {
        return this.f87067d;
    }

    @Nullable
    public final SerialDescriptor g() {
        return this.f87066c;
    }

    public boolean h() {
        return this.f87065b;
    }

    public int hashCode() {
        return (Boolean.hashCode(h()) * 31) + f().hashCode();
    }

    @Override // kotlinx.serialization.json.JsonPrimitive
    @NotNull
    public String toString() {
        if (!h()) {
            return f();
        }
        StringBuilder sb2 = new StringBuilder();
        k1.c(sb2, f());
        return sb2.toString();
    }
}
