package gl;

import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Parameters.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class e0 extends kl.x implements io.ktor.http.b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(@NotNull Map<String, ? extends List<String>> map) {
        super(true, map);
        tn.p.k(map, "values");
    }

    @NotNull
    public String toString() {
        return "Parameters " + entries();
    }
}
