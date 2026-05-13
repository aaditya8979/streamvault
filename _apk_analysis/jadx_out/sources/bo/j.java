package bo;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Regex.kt */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f5696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final zn.i f5697b;

    public j(@NotNull String str, @NotNull zn.i iVar) {
        tn.p.k(str, "value");
        tn.p.k(iVar, "range");
        this.f5696a = str;
        this.f5697b = iVar;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return tn.p.f(this.f5696a, jVar.f5696a) && tn.p.f(this.f5697b, jVar.f5697b);
    }

    public int hashCode() {
        return (this.f5696a.hashCode() * 31) + this.f5697b.hashCode();
    }

    @NotNull
    public String toString() {
        return "MatchGroup(value=" + this.f5696a + ", range=" + this.f5697b + ')';
    }
}
