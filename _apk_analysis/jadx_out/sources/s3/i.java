package s3;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: MintegralSlotIdentifier.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f79059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f79060b;

    public i(@NotNull String str, @NotNull String str2) {
        p.k(str, "adUnitId");
        p.k(str2, "placementId");
        this.f79059a = str;
        this.f79060b = str2;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return p.f(this.f79059a, iVar.f79059a) && p.f(this.f79060b, iVar.f79060b);
    }

    public int hashCode() {
        return (this.f79059a.hashCode() * 31) + this.f79060b.hashCode();
    }

    @NotNull
    public String toString() {
        return "MintegralSlotIdentifier(adUnitId=" + this.f79059a + ", placementId=" + this.f79060b + ")";
    }
}
