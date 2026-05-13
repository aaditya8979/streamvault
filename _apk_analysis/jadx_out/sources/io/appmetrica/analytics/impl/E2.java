package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public abstract class E2 implements ModulePreferences {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC5194vl f65172a;

    public E2(@NotNull InterfaceC5194vl interfaceC5194vl) {
        this.f65172a = interfaceC5194vl;
    }

    @NotNull
    public abstract String a(@NotNull String str);

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final boolean getBoolean(@NotNull String str, boolean z10) {
        return ((AbstractC5286zd) this.f65172a).c(str, z10);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final int getInt(@NotNull String str, int i10) {
        return ((AbstractC5286zd) this.f65172a).c(str, i10);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final long getLong(@NotNull String str, long j10) {
        return ((AbstractC5286zd) this.f65172a).c(a(str), j10);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    @Nullable
    public final String getString(@NotNull String str, @Nullable String str2) {
        return ((AbstractC5286zd) this.f65172a).c(a(str), str2);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final void putBoolean(@NotNull String str, boolean z10) {
        AbstractC5286zd abstractC5286zd = (AbstractC5286zd) this.f65172a;
        ((Ye) ((InterfaceC5194vl) abstractC5286zd.b(abstractC5286zd.f(a(str)), z10))).b();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final void putInt(@NotNull String str, int i10) {
        AbstractC5286zd abstractC5286zd = (AbstractC5286zd) this.f65172a;
        ((Ye) ((InterfaceC5194vl) abstractC5286zd.b(abstractC5286zd.f(str), i10))).b();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final void putLong(@NotNull String str, long j10) {
        AbstractC5286zd abstractC5286zd = (AbstractC5286zd) this.f65172a;
        ((Ye) ((InterfaceC5194vl) abstractC5286zd.b(abstractC5286zd.f(a(str)), j10))).b();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final void putString(@NotNull String str, @Nullable String str2) {
        AbstractC5286zd abstractC5286zd = (AbstractC5286zd) this.f65172a;
        ((Ye) ((InterfaceC5194vl) abstractC5286zd.b(abstractC5286zd.f(a(str)), str2))).b();
    }
}
