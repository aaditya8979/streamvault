package com.applovin.shadow.okhttp3.internal.connection;

import com.applovin.shadow.okhttp3.Route;
import java.util.LinkedHashSet;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: RouteDatabase.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class RouteDatabase {

    @NotNull
    private final Set<Route> failedRoutes = new LinkedHashSet();

    public final synchronized void connected(@NotNull Route route) {
        p.k(route, "route");
        this.failedRoutes.remove(route);
    }

    public final synchronized void failed(@NotNull Route route) {
        p.k(route, "failedRoute");
        this.failedRoutes.add(route);
    }

    public final synchronized boolean shouldPostpone(@NotNull Route route) {
        p.k(route, "route");
        return this.failedRoutes.contains(route);
    }
}
