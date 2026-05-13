package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ze, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5287ze implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5170um fromModel(@NonNull C5262ye c5262ye) {
        C5170um c5170um = new C5170um();
        c5170um.f67792a = c5262ye.f68036a;
        c5170um.f67793b = c5262ye.f68037b;
        return c5170um;
    }

    @NonNull
    public final C5262ye a(@NonNull C5170um c5170um) {
        return new C5262ye(c5170um.f67792a, c5170um.f67793b);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        C5170um c5170um = (C5170um) obj;
        return new C5262ye(c5170um.f67792a, c5170um.f67793b);
    }
}
