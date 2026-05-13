package io.ktor.client.plugins;

import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: HttpSend.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class SendCountExceedException extends IllegalStateException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SendCountExceedException(@NotNull String str) {
        super(str);
        p.k(str, "message");
    }
}
