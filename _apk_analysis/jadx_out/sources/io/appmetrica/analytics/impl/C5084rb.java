package io.appmetrica.analytics.impl;

import androidx.annotation.Nullable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.rb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C5084rb implements to {
    @Override // io.appmetrica.analytics.impl.to
    public final ro a(@Nullable String str) {
        return str == null ? new ro(this, false, "key is null") : str.startsWith(H7.f65310b) ? new ro(this, false, "key starts with appmetrica") : str.length() > 200 ? new ro(this, false, "key length more then 200 characters") : new ro(this, true, "");
    }
}
