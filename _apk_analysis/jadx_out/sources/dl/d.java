package dl;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: HttpResponsePipeline.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final rl.a f59813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Object f59814b;

    public d(@NotNull rl.a aVar, @NotNull Object obj) {
        p.k(aVar, "expectedType");
        p.k(obj, "response");
        this.f59813a = aVar;
        this.f59814b = obj;
    }

    @NotNull
    public final rl.a a() {
        return this.f59813a;
    }

    @NotNull
    public final Object b() {
        return this.f59814b;
    }

    @NotNull
    public final Object c() {
        return this.f59814b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return p.f(this.f59813a, dVar.f59813a) && p.f(this.f59814b, dVar.f59814b);
    }

    public int hashCode() {
        return (this.f59813a.hashCode() * 31) + this.f59814b.hashCode();
    }

    @NotNull
    public String toString() {
        return "HttpResponseContainer(expectedType=" + this.f59813a + ", response=" + this.f59814b + ')';
    }
}
