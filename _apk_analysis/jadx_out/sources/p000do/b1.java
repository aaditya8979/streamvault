package p000do;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: JobSupport.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class b1 implements o1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f59824b;

    public b1(boolean z10) {
        this.f59824b = z10;
    }

    @Override // p000do.o1
    @Nullable
    public z1 b() {
        return null;
    }

    @Override // p000do.o1
    public boolean isActive() {
        return this.f59824b;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Empty{");
        sb2.append(isActive() ? "Active" : "New");
        sb2.append('}');
        return sb2.toString();
    }
}
