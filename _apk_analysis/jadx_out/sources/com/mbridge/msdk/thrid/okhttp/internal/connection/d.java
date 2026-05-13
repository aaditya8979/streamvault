package com.mbridge.msdk.thrid.okhttp.internal.connection;

import com.mbridge.msdk.thrid.okhttp.c0;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: compiled from: RouteDatabase.java */
/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set<c0> f40360a = new LinkedHashSet();

    public synchronized void a(c0 c0Var) {
        this.f40360a.remove(c0Var);
    }

    public synchronized void b(c0 c0Var) {
        this.f40360a.add(c0Var);
    }

    public synchronized boolean c(c0 c0Var) {
        return this.f40360a.contains(c0Var);
    }
}
