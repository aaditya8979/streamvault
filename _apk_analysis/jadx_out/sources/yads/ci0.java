package yads;

import android.net.Uri;

/* JADX INFO: loaded from: classes12.dex */
public final class ci0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f88466a;

    public ci0(Uri uri) {
        this.f88466a = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ci0) && tn.p.f(this.f88466a, ((ci0) obj).f88466a);
    }

    public final int hashCode() {
        return this.f88466a.hashCode();
    }

    public final String toString() {
        return "DivKitClickExtensionData(url=" + this.f88466a + ")";
    }
}
