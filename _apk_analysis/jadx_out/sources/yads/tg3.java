package yads;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class tg3 extends ug3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f95212a;

    public tg3(List list) {
        super(0);
        this.f95212a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tg3) && tn.p.f(this.f95212a, ((tg3) obj).f95212a);
    }

    public final int hashCode() {
        return this.f95212a.hashCode();
    }

    public final String toString() {
        return "Success(result=" + this.f95212a + ")";
    }
}
