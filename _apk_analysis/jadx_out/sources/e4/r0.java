package e4;

import androidx.annotation.Nullable;

/* JADX INFO: compiled from: RendererConfiguration.java */
/* JADX INFO: loaded from: classes10.dex */
public final class r0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final r0 f60215b = new r0(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f60216a;

    public r0(int i10) {
        this.f60216a = i10;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && r0.class == obj.getClass() && this.f60216a == ((r0) obj).f60216a;
    }

    public int hashCode() {
        return this.f60216a;
    }
}
