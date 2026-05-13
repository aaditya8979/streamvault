package io.appmetrica.analytics.impl;

/* JADX INFO: loaded from: classes11.dex */
public final class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f65262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f65263b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f65264c;

    public G(int i10, int i11, int i12) {
        this.f65262a = i10;
        this.f65263b = i11;
        this.f65264c = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!tn.p.f(G.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.impl.id.AdvIdGetterController.CanTrackIdentifiers");
        }
        G g10 = (G) obj;
        return this.f65262a == g10.f65262a && this.f65263b == g10.f65263b && this.f65264c == g10.f65264c;
    }

    public final int hashCode() {
        return L7.a(this.f65264c) + ((L7.a(this.f65263b) + (L7.a(this.f65262a) * 31)) * 31);
    }

    public final String toString() {
        return "CanTrackIdentifiers(canTrackGaid=" + H.a(this.f65262a) + ", canTrackHoaid=" + H.a(this.f65263b) + ", canTrackYandexAdvId=" + H.a(this.f65264c) + ')';
    }
}
