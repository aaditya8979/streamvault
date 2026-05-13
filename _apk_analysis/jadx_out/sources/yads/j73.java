package yads;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public final class j73 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f91111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c83 f91112b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final rb3 f91113c;

    public j73(WeakReference weakReference, c83 c83Var, rb3 rb3Var) {
        this.f91111a = weakReference;
        this.f91112b = c83Var;
        this.f91113c = rb3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j73)) {
            return false;
        }
        j73 j73Var = (j73) obj;
        return tn.p.f(this.f91111a, j73Var.f91111a) && tn.p.f(this.f91112b, j73Var.f91112b) && tn.p.f(this.f91113c, j73Var.f91113c);
    }

    public final int hashCode() {
        return this.f91113c.f94357a.hashCode() + ((this.f91112b.hashCode() + (this.f91111a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "TrackNoticeObject(manager=" + this.f91111a + ", notice=" + this.f91112b + ", validationResult=" + this.f91113c + ")";
    }
}
