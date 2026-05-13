package io.ktor.http;

import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: HttpHeaders.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class IllegalHeaderValueException extends IllegalArgumentException {

    @NotNull
    private final String headerValue;
    private final int position;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IllegalHeaderValueException(@NotNull String str, int i10) {
        super("Header value '" + str + "' contains illegal character '" + str.charAt(i10) + "' (code " + (str.charAt(i10) & 255) + ')');
        p.k(str, "headerValue");
        this.headerValue = str;
        this.position = i10;
    }

    @NotNull
    public final String getHeaderValue() {
        return this.headerValue;
    }

    public final int getPosition() {
        return this.position;
    }
}
