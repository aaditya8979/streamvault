package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.ConfigProvider;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.zb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5284zb implements ConfigProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Y4 f68062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bn.g f68063b = kotlin.b.b(new C5259yb(this));

    public C5284zb(@NotNull Y4 y42) {
        this.f68062a = y42;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ConfigProvider
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4941lh getConfig() {
        return (C4941lh) this.f68063b.getValue();
    }
}
