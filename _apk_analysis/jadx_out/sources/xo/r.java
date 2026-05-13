package xo;

import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonElement;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: JsonEncoder.kt */
/* JADX INFO: loaded from: classes5.dex */
public interface r extends Encoder, vo.d {
    @NotNull
    a d();

    void s(@NotNull JsonElement jsonElement);
}
