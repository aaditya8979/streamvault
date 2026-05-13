package yads;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class yt1 implements zt1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f97291a;

    public yt1(List list) {
        this.f97291a = list;
    }

    public final List a() {
        return this.f97291a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yt1) && tn.p.f(this.f97291a, ((yt1) obj).f97291a);
    }

    public final int hashCode() {
        return this.f97291a.hashCode();
    }

    public final String toString() {
        return "IncorrectIntegration(causes=" + this.f97291a + ")";
    }
}
