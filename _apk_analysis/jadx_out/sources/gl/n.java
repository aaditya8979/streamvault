package gl;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Headers.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class n extends kl.w {
    public n() {
        this(0, 1, null);
    }

    public n(int i10) {
        super(true, i10);
    }

    public /* synthetic */ n(int i10, int i11, tn.i iVar) {
        this((i11 & 1) != 0 ? 8 : i10);
    }

    @Override // kl.w
    public void n(@NotNull String str) {
        tn.p.k(str, "name");
        super.n(str);
        s.f62569a.a(str);
    }

    @Override // kl.w
    public void o(@NotNull String str) {
        tn.p.k(str, "value");
        super.o(str);
        s.f62569a.b(str);
    }

    @NotNull
    public m p() {
        return new o(k());
    }
}
