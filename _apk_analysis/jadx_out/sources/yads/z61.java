package yads;

import android.net.Uri;

/* JADX INFO: loaded from: classes3.dex */
public final class z61 implements a71 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f97410a;

    public z61(Uri uri) {
        this.f97410a = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z61) && tn.p.f(this.f97410a, ((z61) obj).f97410a);
    }

    public final int hashCode() {
        return this.f97410a.hashCode();
    }

    public final String toString() {
        return "Success(reportUri=" + this.f97410a + ")";
    }
}
