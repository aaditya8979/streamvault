package k8;

import io.bidmachine.iab.vast.tags.VastAttributes;

/* JADX INFO: compiled from: Dimension.java */
/* JADX INFO: loaded from: classes11.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f73014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f73015b;

    public int a() {
        return this.f73015b;
    }

    public int b() {
        return this.f73014a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (this.f73014a == cVar.f73014a && this.f73015b == cVar.f73015b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.f73014a * 32713) + this.f73015b;
    }

    public String toString() {
        return this.f73014a + VastAttributes.HORIZONTAL_POSITION + this.f73015b;
    }
}
