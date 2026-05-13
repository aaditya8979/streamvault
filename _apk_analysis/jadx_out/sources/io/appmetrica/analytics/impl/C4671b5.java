package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.b5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4671b5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f66422a;

    public C4671b5(String str) {
        this.f66422a = str;
    }

    public final PublicLogger a() {
        return LoggerStorage.getOrCreatePublicLogger(this.f66422a);
    }
}
