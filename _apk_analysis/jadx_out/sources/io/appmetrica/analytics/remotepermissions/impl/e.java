package io.appmetrica.analytics.remotepermissions.impl;

import cn.w0;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy;
import java.util.Set;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class e implements PermissionStrategy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Set f68367a = w0.f();

    public final synchronized void a(@NotNull Set<String> set) {
        this.f68367a = set;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy
    public final synchronized boolean forbidUsePermission(@NotNull String str) {
        return !this.f68367a.contains(str);
    }
}
