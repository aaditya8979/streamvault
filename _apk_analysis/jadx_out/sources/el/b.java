package el;

import jl.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Content.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class b extends c.AbstractC0854c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final b f61158a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f61159b = 0;

    @Override // jl.c
    @NotNull
    public Long a() {
        return Long.valueOf(f61159b);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return 1450860306;
    }

    @NotNull
    public String toString() {
        return "EmptyContent";
    }
}
