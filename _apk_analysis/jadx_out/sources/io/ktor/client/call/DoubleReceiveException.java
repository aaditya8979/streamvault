package io.ktor.client.call;

import androidx.core.app.NotificationCompat;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: HttpClientCall.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class DoubleReceiveException extends IllegalStateException {

    @NotNull
    private final String message;

    public DoubleReceiveException(@NotNull HttpClientCall httpClientCall) {
        p.k(httpClientCall, NotificationCompat.CATEGORY_CALL);
        this.message = "Response already received: " + httpClientCall;
    }

    @Override // java.lang.Throwable
    @NotNull
    public String getMessage() {
        return this.message;
    }
}
