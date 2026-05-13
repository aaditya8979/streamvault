package yads;

import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class rb3 implements tb3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f94357a;

    public rb3(List list) {
        this.f94357a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rb3) && tn.p.f(this.f94357a, ((rb3) obj).f94357a);
    }

    public final int hashCode() {
        return this.f94357a.hashCode();
    }

    public final String toString() {
        return "Success(warnings=" + this.f94357a + ")";
    }
}
