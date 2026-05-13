package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.services.UtilityServiceConfiguration;
import io.appmetrica.analytics.coreutils.internal.services.UtilityServiceProvider;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ko, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C4922ko implements InterfaceC4946lm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UtilityServiceProvider f67172a;

    public C4922ko(@NotNull UtilityServiceProvider utilityServiceProvider) {
        this.f67172a = utilityServiceProvider;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4946lm
    public final void a(@NotNull C4817gm c4817gm) {
        this.f67172a.updateConfiguration(new UtilityServiceConfiguration(c4817gm.f66867v, c4817gm.f66866u));
    }
}
