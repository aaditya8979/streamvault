package yads;

import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class e51 implements f51 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f89102a;

    public e51(Map map) {
        this.f89102a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e51) && tn.p.f(this.f89102a, ((e51) obj).f89102a);
    }

    public final int hashCode() {
        return this.f89102a.hashCode();
    }

    public final String toString() {
        return "Success(images=" + this.f89102a + ")";
    }
}
