package com.mbridge.msdk.thrid.okhttp.internal.connection;

import java.io.IOException;

/* JADX INFO: compiled from: RouteException.java */
/* JADX INFO: loaded from: classes2.dex */
public final class e extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private IOException f40361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private IOException f40362b;

    public e(IOException iOException) {
        super(iOException);
        this.f40361a = iOException;
        this.f40362b = iOException;
    }

    public void a(IOException iOException) {
        com.mbridge.msdk.thrid.okhttp.internal.c.a((Throwable) this.f40361a, (Throwable) iOException);
        this.f40362b = iOException;
    }

    public IOException d() {
        return this.f40361a;
    }

    public IOException g() {
        return this.f40362b;
    }
}
