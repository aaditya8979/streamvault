package com.applovin.shadow.okhttp3.internal.connection;

import bn.d;
import java.io.IOException;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: RouteException.kt */
/* JADX INFO: loaded from: classes.dex */
public final class RouteException extends RuntimeException {

    @NotNull
    private final IOException firstConnectException;

    @NotNull
    private IOException lastConnectException;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteException(@NotNull IOException iOException) {
        super(iOException);
        p.k(iOException, "firstConnectException");
        this.firstConnectException = iOException;
        this.lastConnectException = iOException;
    }

    public final void addConnectException(@NotNull IOException iOException) {
        p.k(iOException, "e");
        d.a(this.firstConnectException, iOException);
        this.lastConnectException = iOException;
    }

    @NotNull
    public final IOException getFirstConnectException() {
        return this.firstConnectException;
    }

    @NotNull
    public final IOException getLastConnectException() {
        return this.lastConnectException;
    }
}
