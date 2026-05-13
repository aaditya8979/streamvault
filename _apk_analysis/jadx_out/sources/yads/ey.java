package yads;

import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public final class ey extends sa2 implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Comparator f89403b;

    public ey(Comparator comparator) {
        this.f89403b = (Comparator) ng2.a(comparator);
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f89403b.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ey) {
            return this.f89403b.equals(((ey) obj).f89403b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f89403b.hashCode();
    }

    public final String toString() {
        return this.f89403b.toString();
    }
}
