package yads;

/* JADX INFO: loaded from: classes11.dex */
public final class h10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f90193a;

    public h10(float f10) {
        this.f90193a = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h10) && Float.compare(this.f90193a, ((h10) obj).f90193a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f90193a);
    }

    public final String toString() {
        return "CoreNativeAdMedia(aspectRatio=" + this.f90193a + ")";
    }
}
