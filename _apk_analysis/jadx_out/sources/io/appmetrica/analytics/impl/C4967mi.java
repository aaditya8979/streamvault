package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Map;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.mi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C4967mi implements to {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f67305a;

    public C4967mi(@NonNull Map<String, ?> map) {
        this.f67305a = map;
    }

    @Override // io.appmetrica.analytics.impl.to
    public final ro a(@Nullable String str) {
        return this.f67305a.containsKey(str) ? new ro(this, false, String.format("Failed to activate AppMetrica with provided apiKey ApiKey %s has already been used by another reporter.", str)) : new ro(this, true, "");
    }
}
