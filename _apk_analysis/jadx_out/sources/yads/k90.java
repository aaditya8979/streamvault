package yads;

import android.net.Uri;

/* JADX INFO: loaded from: classes7.dex */
public final class k90 implements m90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f91521a;

    public k90(Uri uri) {
        this.f91521a = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k90) && tn.p.f(this.f91521a, ((k90) obj).f91521a);
    }

    public final int hashCode() {
        return this.f91521a.hashCode();
    }

    public final String toString() {
        return "ShareReport(reportUri=" + this.f91521a + ")";
    }
}
