package kl;

import bo.d0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Attributes.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f73155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final rl.a f73156b;

    public a(@NotNull String str, @NotNull rl.a aVar) {
        tn.p.k(str, "name");
        tn.p.k(aVar, "type");
        this.f73155a = str;
        this.f73156b = aVar;
        if (!(!d0.u0(str))) {
            throw new IllegalArgumentException("Name can't be blank".toString());
        }
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return tn.p.f(this.f73155a, aVar.f73155a) && tn.p.f(this.f73156b, aVar.f73156b);
    }

    public int hashCode() {
        return (this.f73155a.hashCode() * 31) + this.f73156b.hashCode();
    }

    @NotNull
    public String toString() {
        return "AttributeKey: " + this.f73155a;
    }
}
