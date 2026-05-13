package yads;

/* JADX INFO: loaded from: classes2.dex */
public final class z80 implements g90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f97422a;

    public z80(String str) {
        this.f97422a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z80) && tn.p.f(this.f97422a, ((z80) obj).f97422a);
    }

    public final int hashCode() {
        return this.f97422a.hashCode();
    }

    public final String toString() {
        return "OnAdUnitClick(id=" + this.f97422a + ")";
    }
}
