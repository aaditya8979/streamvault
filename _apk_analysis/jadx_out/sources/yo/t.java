package yo;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Composers.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class t extends s {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f97992c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(@NotNull g0 g0Var, boolean z10) {
        super(g0Var);
        tn.p.k(g0Var, "writer");
        this.f97992c = z10;
    }

    @Override // yo.s
    public void n(@NotNull String str) {
        tn.p.k(str, "value");
        if (this.f97992c) {
            super.n(str);
        } else {
            super.k(str);
        }
    }
}
