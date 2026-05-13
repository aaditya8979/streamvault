package d6;

import androidx.annotation.Nullable;

/* JADX INFO: compiled from: RendererConfiguration.java */
/* JADX INFO: loaded from: classes7.dex */
public final class v1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final v1 f59706b = new v1(false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f59707a;

    public v1(boolean z10) {
        this.f59707a = z10;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && v1.class == obj.getClass() && this.f59707a == ((v1) obj).f59707a;
    }

    public int hashCode() {
        return !this.f59707a ? 1 : 0;
    }
}
