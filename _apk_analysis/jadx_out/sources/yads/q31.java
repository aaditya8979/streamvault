package yads;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes10.dex */
public final class q31 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f93874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bitmap f93875b;

    public q31(String str, Bitmap bitmap) {
        this.f93874a = str;
        this.f93875b = bitmap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q31)) {
            return false;
        }
        q31 q31Var = (q31) obj;
        return tn.p.f(this.f93874a, q31Var.f93874a) && tn.p.f(this.f93875b, q31Var.f93875b);
    }

    public final int hashCode() {
        return this.f93875b.hashCode() + (this.f93874a.hashCode() * 31);
    }

    public final String toString() {
        return "ImageData(url=" + this.f93874a + ", bitmap=" + this.f93875b + ")";
    }
}
