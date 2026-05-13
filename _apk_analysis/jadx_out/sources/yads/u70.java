package yads;

/* JADX INFO: loaded from: classes11.dex */
public final class u70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f95570a;

    public u70(boolean z10) {
        this.f95570a = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u70) && this.f95570a == ((u70) obj).f95570a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f95570a);
    }

    public final String toString() {
        return "DebugPanelErrorIndicatorData(isEnabled=" + this.f95570a + ")";
    }
}
