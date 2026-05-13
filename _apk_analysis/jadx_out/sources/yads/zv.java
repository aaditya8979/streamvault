package yads;

/* JADX INFO: loaded from: classes12.dex */
public final class zv implements m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f97796a;

    public zv(String str) {
        this.f97796a = str;
    }

    @Override // yads.m0
    public final String a() {
        return this.f97796a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zv) && tn.p.f(this.f97796a, ((zv) obj).f97796a);
    }

    public final int hashCode() {
        return this.f97796a.hashCode();
    }

    public final String toString() {
        return "CloseAction(actionType=" + this.f97796a + ")";
    }
}
