package gl;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: HttpProtocolVersion.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class z {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f62634d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final z f62635e = new z("HTTP", 2, 0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final z f62636f = new z("HTTP", 1, 1);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final z f62637g = new z("HTTP", 1, 0);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final z f62638h = new z("SPDY", 3, 0);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final z f62639i = new z("QUIC", 1, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f62640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f62641b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f62642c;

    /* JADX INFO: compiled from: HttpProtocolVersion.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final z a() {
            return z.f62636f;
        }
    }

    public z(@NotNull String str, int i10, int i11) {
        tn.p.k(str, "name");
        this.f62640a = str;
        this.f62641b = i10;
        this.f62642c = i11;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return tn.p.f(this.f62640a, zVar.f62640a) && this.f62641b == zVar.f62641b && this.f62642c == zVar.f62642c;
    }

    public int hashCode() {
        return (((this.f62640a.hashCode() * 31) + Integer.hashCode(this.f62641b)) * 31) + Integer.hashCode(this.f62642c);
    }

    @NotNull
    public String toString() {
        return this.f62640a + '/' + this.f62641b + '.' + this.f62642c;
    }
}
