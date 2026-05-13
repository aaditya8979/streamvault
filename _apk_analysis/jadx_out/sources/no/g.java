package no;

import bo.d0;
import java.io.InputStream;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: JvmCore.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class g {
    @NotNull
    public static final j a(@NotNull InputStream inputStream) {
        tn.p.k(inputStream, "<this>");
        return new f(inputStream);
    }

    public static final boolean b(@NotNull AssertionError assertionError) {
        tn.p.k(assertionError, "<this>");
        if (assertionError.getCause() == null) {
            return false;
        }
        String message = assertionError.getMessage();
        return message != null ? d0.c0(message, "getsockname failed", false, 2, null) : false;
    }
}
