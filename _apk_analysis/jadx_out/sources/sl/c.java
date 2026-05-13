package sl;

import java.io.IOException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ByteReadChannel.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class c {
    public static final void a(@NotNull io.ktor.utils.io.a aVar) {
        tn.p.k(aVar, "<this>");
        aVar.a(new IOException("Channel was cancelled"));
    }
}
