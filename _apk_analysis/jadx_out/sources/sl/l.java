package sl;

import io.ktor.utils.io.CountedByteReadChannel;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CountedByteReadChannel.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class l {
    @NotNull
    public static final CountedByteReadChannel a(@NotNull io.ktor.utils.io.a aVar) {
        tn.p.k(aVar, "<this>");
        return new CountedByteReadChannel(aVar);
    }
}
