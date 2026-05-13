package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleRemoteConfig;
import io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigMetaInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.vk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C5193vk implements ModuleRemoteConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SdkIdentifiers f67860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RemoteConfigMetaInfo f67861b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f67862c;

    public C5193vk(@NotNull SdkIdentifiers sdkIdentifiers, @NotNull RemoteConfigMetaInfo remoteConfigMetaInfo, Object obj) {
        this.f67860a = sdkIdentifiers;
        this.f67861b = remoteConfigMetaInfo;
        this.f67862c = obj;
    }

    public static C5193vk a(C5193vk c5193vk, SdkIdentifiers sdkIdentifiers, RemoteConfigMetaInfo remoteConfigMetaInfo, Object obj, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            sdkIdentifiers = c5193vk.f67860a;
        }
        if ((i10 & 2) != 0) {
            remoteConfigMetaInfo = c5193vk.f67861b;
        }
        if ((i10 & 4) != 0) {
            obj = c5193vk.f67862c;
        }
        c5193vk.getClass();
        return new C5193vk(sdkIdentifiers, remoteConfigMetaInfo, obj);
    }

    @NotNull
    public final SdkIdentifiers a() {
        return this.f67860a;
    }

    @NotNull
    public final C5193vk a(@NotNull SdkIdentifiers sdkIdentifiers, @NotNull RemoteConfigMetaInfo remoteConfigMetaInfo, Object obj) {
        return new C5193vk(sdkIdentifiers, remoteConfigMetaInfo, obj);
    }

    @NotNull
    public final RemoteConfigMetaInfo b() {
        return this.f67861b;
    }

    public final Object c() {
        return this.f67862c;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5193vk)) {
            return false;
        }
        C5193vk c5193vk = (C5193vk) obj;
        return tn.p.f(this.f67860a, c5193vk.f67860a) && tn.p.f(this.f67861b, c5193vk.f67861b) && tn.p.f(this.f67862c, c5193vk.f67862c);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleRemoteConfig
    public final Object getFeaturesConfig() {
        return this.f67862c;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleRemoteConfig
    @NotNull
    public final SdkIdentifiers getIdentifiers() {
        return this.f67860a;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleRemoteConfig
    @NotNull
    public final RemoteConfigMetaInfo getRemoteConfigMetaInfo() {
        return this.f67861b;
    }

    public final int hashCode() {
        int iHashCode = (this.f67861b.hashCode() + (this.f67860a.hashCode() * 31)) * 31;
        Object obj = this.f67862c;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    @NotNull
    public final String toString() {
        return "ServiceModuleRemoteConfigModel(identifiers=" + this.f67860a + ", remoteConfigMetaInfo=" + this.f67861b + ", featuresConfig=" + this.f67862c + ')';
    }
}
