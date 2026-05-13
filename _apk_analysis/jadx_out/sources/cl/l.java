package cl;

import gl.v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: utils.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class l {
    public static final void a(@NotNull v vVar, @NotNull String str, @Nullable Object obj) {
        p.k(vVar, "<this>");
        p.k(str, "key");
        if (obj != null) {
            vVar.getHeaders().e(str, obj.toString());
        }
    }
}
