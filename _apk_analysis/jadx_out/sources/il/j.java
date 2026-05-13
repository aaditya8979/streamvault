package il;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: MutableRange.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f64316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f64317b;

    public j(int i10, int i11) {
        this.f64316a = i10;
        this.f64317b = i11;
    }

    public final int a() {
        return this.f64317b;
    }

    public final int b() {
        return this.f64316a;
    }

    public final void c(int i10) {
        this.f64317b = i10;
    }

    public final void d(int i10) {
        this.f64316a = i10;
    }

    @NotNull
    public String toString() {
        return "MutableRange(start=" + this.f64316a + ", end=" + this.f64317b + ')';
    }
}
