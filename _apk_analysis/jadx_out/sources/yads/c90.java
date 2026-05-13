package yads;

/* JADX INFO: loaded from: classes11.dex */
public final class c90 implements g90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f88396a;

    public c90(boolean z10) {
        this.f88396a = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c90) && this.f88396a == ((c90) obj).f88396a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f88396a);
    }

    public final String toString() {
        return "OnDebugErrorIndicatorSwitch(isChecked=" + this.f88396a + ")";
    }
}
