package rl;

import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: Type.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final KClass<?> f78918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final KType f78919b;

    public a(@NotNull KClass<?> kClass, @Nullable KType kType) {
        p.k(kClass, "type");
        this.f78918a = kClass;
        this.f78919b = kType;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        KType kType = this.f78919b;
        if (kType == null) {
            a aVar = (a) obj;
            if (aVar.f78919b == null) {
                return p.f(this.f78918a, aVar.f78918a);
            }
        }
        return p.f(kType, ((a) obj).f78919b);
    }

    @NotNull
    public final KClass<?> getType() {
        return this.f78918a;
    }

    public int hashCode() {
        KType kType = this.f78919b;
        return kType != null ? kType.hashCode() : this.f78918a.hashCode();
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("TypeInfo(");
        Object obj = this.f78919b;
        if (obj == null) {
            obj = this.f78918a;
        }
        sb2.append(obj);
        sb2.append(')');
        return sb2.toString();
    }
}
