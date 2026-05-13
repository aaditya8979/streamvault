package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreapi.internal.data.JsonParser;
import io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final class Zc implements JsonParser, Converter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RemoteConfigExtensionConfiguration f66297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ JsonParser f66298b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Converter f66299c;

    public Zc(@NotNull RemoteConfigExtensionConfiguration<Object> remoteConfigExtensionConfiguration) {
        this.f66297a = remoteConfigExtensionConfiguration;
        this.f66298b = remoteConfigExtensionConfiguration.getJsonParser();
        this.f66299c = remoteConfigExtensionConfiguration.getProtobufConverter();
    }

    @NotNull
    public final RemoteConfigExtensionConfiguration<Object> a() {
        return this.f66297a;
    }

    @NotNull
    public final Object a(@NotNull JSONObject jSONObject) {
        return this.f66298b.parse(jSONObject);
    }

    @NotNull
    public final Object a(@NotNull byte[] bArr) {
        return this.f66299c.toModel(bArr);
    }

    @NotNull
    public final byte[] a(@NotNull Object obj) {
        return (byte[]) this.f66299c.fromModel(obj);
    }

    @Nullable
    public final Object b(@NotNull JSONObject jSONObject) {
        return this.f66298b.parseOrNull(jSONObject);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object fromModel(Object obj) {
        return (byte[]) this.f66299c.fromModel(obj);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    public final Object parse(JSONObject jSONObject) {
        return this.f66298b.parse(jSONObject);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    public final Object parseOrNull(JSONObject jSONObject) {
        return this.f66298b.parseOrNull(jSONObject);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        return this.f66299c.toModel((byte[]) obj);
    }
}
