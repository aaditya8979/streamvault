package gl;

import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Headers.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class o extends kl.x implements m {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(@NotNull Map<String, ? extends List<String>> map) {
        super(true, map);
        tn.p.k(map, "values");
    }

    @NotNull
    public String toString() {
        return "Headers " + entries();
    }
}
