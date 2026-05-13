package gl;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: HttpMethod.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f62623b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final x f62624c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final x f62625d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final x f62626e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final x f62627f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final x f62628g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final x f62629h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final x f62630i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final List<x> f62631j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f62632a;

    /* JADX INFO: compiled from: HttpMethod.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final List<x> a() {
            return x.f62631j;
        }

        @NotNull
        public final x b() {
            return x.f62624c;
        }

        @NotNull
        public final x c() {
            return x.f62629h;
        }

        @NotNull
        public final x d() {
            return x.f62630i;
        }

        @NotNull
        public final x e() {
            return x.f62625d;
        }
    }

    static {
        x xVar = new x("GET");
        f62624c = xVar;
        x xVar2 = new x("POST");
        f62625d = xVar2;
        x xVar3 = new x("PUT");
        f62626e = xVar3;
        x xVar4 = new x("PATCH");
        f62627f = xVar4;
        x xVar5 = new x("DELETE");
        f62628g = xVar5;
        x xVar6 = new x("HEAD");
        f62629h = xVar6;
        x xVar7 = new x("OPTIONS");
        f62630i = xVar7;
        f62631j = cn.w.p(xVar, xVar2, xVar3, xVar4, xVar5, xVar6, xVar7);
    }

    public x(@NotNull String str) {
        tn.p.k(str, "value");
        this.f62632a = str;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x) && tn.p.f(this.f62632a, ((x) obj).f62632a);
    }

    @NotNull
    public final String f() {
        return this.f62632a;
    }

    public int hashCode() {
        return this.f62632a.hashCode();
    }

    @NotNull
    public String toString() {
        return this.f62632a;
    }
}
