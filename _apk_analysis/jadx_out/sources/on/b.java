package on;

import java.io.Closeable;
import java.io.IOException;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Closeable.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class b {
    public static final void a(@Nullable Closeable closeable, @Nullable Throwable th2) throws IOException {
        if (closeable != null) {
            if (th2 == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th3) {
                bn.d.a(th2, th3);
            }
        }
    }
}
