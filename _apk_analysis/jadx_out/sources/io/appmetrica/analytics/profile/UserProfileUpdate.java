package io.appmetrica.analytics.profile;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.InterfaceC4793fo;

/* JADX INFO: loaded from: classes3.dex */
public class UserProfileUpdate<T extends InterfaceC4793fo> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4793fo f68360a;

    public UserProfileUpdate(InterfaceC4793fo interfaceC4793fo) {
        this.f68360a = interfaceC4793fo;
    }

    @NonNull
    public T getUserProfileUpdatePatcher() {
        return (T) this.f68360a;
    }
}
