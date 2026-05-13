package xo;

import kotlinx.serialization.json.JsonElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: JsonElementBuilders.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class h {
    public static final boolean a(@NotNull b bVar, @Nullable String str) {
        tn.p.k(bVar, "<this>");
        return bVar.a(i.c(str));
    }

    @Nullable
    public static final JsonElement b(@NotNull b0 b0Var, @NotNull String str, @Nullable Boolean bool) {
        tn.p.k(b0Var, "<this>");
        tn.p.k(str, "key");
        return b0Var.b(str, i.a(bool));
    }

    @Nullable
    public static final JsonElement c(@NotNull b0 b0Var, @NotNull String str, @Nullable Number number) {
        tn.p.k(b0Var, "<this>");
        tn.p.k(str, "key");
        return b0Var.b(str, i.b(number));
    }

    @Nullable
    public static final JsonElement d(@NotNull b0 b0Var, @NotNull String str, @Nullable String str2) {
        tn.p.k(b0Var, "<this>");
        tn.p.k(str, "key");
        return b0Var.b(str, i.c(str2));
    }

    @Nullable
    public static final JsonElement e(@NotNull b0 b0Var, @NotNull String str, @NotNull sn.l<? super b, bn.r> lVar) {
        tn.p.k(b0Var, "<this>");
        tn.p.k(str, "key");
        tn.p.k(lVar, "builderAction");
        b bVar = new b();
        lVar.invoke(bVar);
        return b0Var.b(str, bVar.b());
    }

    @Nullable
    public static final JsonElement f(@NotNull b0 b0Var, @NotNull String str, @NotNull sn.l<? super b0, bn.r> lVar) {
        tn.p.k(b0Var, "<this>");
        tn.p.k(str, "key");
        tn.p.k(lVar, "builderAction");
        b0 b0Var2 = new b0();
        lVar.invoke(b0Var2);
        return b0Var.b(str, b0Var2.a());
    }
}
