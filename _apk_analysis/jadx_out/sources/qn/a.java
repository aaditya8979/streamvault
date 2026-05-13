package qn;

import bn.d;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AutoCloseableJVM.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class a {
    public static final void a(@Nullable AutoCloseable autoCloseable, @Nullable Throwable th2) throws Exception {
        if (autoCloseable != null) {
            if (th2 == null) {
                autoCloseable.close();
                return;
            }
            try {
                autoCloseable.close();
            } catch (Throwable th3) {
                d.a(th2, th3);
            }
        }
    }
}
