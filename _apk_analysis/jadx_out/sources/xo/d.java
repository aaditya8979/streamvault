package xo;

import kotlinx.serialization.json.ClassDiscriminatorMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Json.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f87024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f87025b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f87026c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f87027d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f87028e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public String f87029f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f87030g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public String f87031h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public ClassDiscriminatorMode f87032i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f87033j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public y f87034k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f87035l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f87036m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f87037n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f87038o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f87039p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f87040q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public zo.c f87041r;

    public d(@NotNull a aVar) {
        tn.p.k(aVar, "json");
        this.f87024a = aVar.e().i();
        this.f87025b = aVar.e().j();
        this.f87026c = aVar.e().k();
        this.f87027d = aVar.e().q();
        this.f87028e = aVar.e().m();
        this.f87029f = aVar.e().n();
        this.f87030g = aVar.e().g();
        this.f87031h = aVar.e().e();
        this.f87032i = aVar.e().f();
        this.f87033j = aVar.e().o();
        this.f87034k = aVar.e().l();
        this.f87035l = aVar.e().h();
        this.f87036m = aVar.e().d();
        this.f87037n = aVar.e().a();
        this.f87038o = aVar.e().b();
        this.f87039p = aVar.e().c();
        this.f87040q = aVar.e().p();
        this.f87041r = aVar.a();
    }

    @NotNull
    public final f a() {
        boolean z10 = true;
        if (this.f87040q) {
            if (!tn.p.f(this.f87031h, "type")) {
                throw new IllegalArgumentException("Class discriminator should not be specified when array polymorphism is specified".toString());
            }
            if (!(this.f87032i == ClassDiscriminatorMode.POLYMORPHIC)) {
                throw new IllegalArgumentException("useArrayPolymorphism option can only be used if classDiscriminatorMode in a default POLYMORPHIC state.".toString());
            }
        }
        if (this.f87028e) {
            if (!tn.p.f(this.f87029f, "    ")) {
                String str = this.f87029f;
                int i10 = 0;
                while (true) {
                    if (i10 >= str.length()) {
                        break;
                    }
                    char cCharAt = str.charAt(i10);
                    if (!(cCharAt == ' ' || cCharAt == '\t' || cCharAt == '\r' || cCharAt == '\n')) {
                        z10 = false;
                        break;
                    }
                    i10++;
                }
                if (!z10) {
                    throw new IllegalArgumentException(("Only whitespace, tab, newline and carriage return are allowed as pretty print symbols. Had " + this.f87029f).toString());
                }
            }
        } else if (!tn.p.f(this.f87029f, "    ")) {
            throw new IllegalArgumentException("Indent should not be specified when default printing mode is used".toString());
        }
        return new f(this.f87024a, this.f87026c, this.f87027d, this.f87039p, this.f87028e, this.f87025b, this.f87029f, this.f87030g, this.f87040q, this.f87031h, this.f87038o, this.f87033j, this.f87034k, this.f87035l, this.f87036m, this.f87037n, this.f87032i);
    }

    @NotNull
    public final zo.c b() {
        return this.f87041r;
    }

    public final void c(boolean z10) {
        this.f87039p = z10;
    }

    public final void d(boolean z10) {
        this.f87024a = z10;
    }

    public final void e(boolean z10) {
        this.f87025b = z10;
    }

    public final void f(boolean z10) {
        this.f87026c = z10;
    }

    public final void g(boolean z10) {
        this.f87027d = z10;
    }

    public final void h(boolean z10) {
        this.f87028e = z10;
    }
}
