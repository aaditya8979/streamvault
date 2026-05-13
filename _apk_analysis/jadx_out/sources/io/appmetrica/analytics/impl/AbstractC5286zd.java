package io.appmetrica.analytics.impl;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.zd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractC5286zd extends Ye implements InterfaceC5194vl {
    public AbstractC5286zd(@NotNull Ia ia2) {
        this(ia2, null);
    }

    public AbstractC5286zd(@NotNull Ia ia2, @Nullable String str) {
        super(ia2, str);
    }

    public final int c(@NotNull String str, int i10) {
        return this.f66262a.getInt(f(str), i10);
    }

    public final long c(@NotNull String str, long j10) {
        return this.f66262a.getLong(f(str), j10);
    }

    @Nullable
    public final String c(@NotNull String str, @Nullable String str2) {
        return this.f66262a.getString(f(str), str2);
    }

    public final boolean c(@NotNull String str, boolean z10) {
        return this.f66262a.getBoolean(f(str), z10);
    }

    @NotNull
    public final InterfaceC5194vl d(@NotNull String str, int i10) {
        return (InterfaceC5194vl) b(f(str), i10);
    }

    @NotNull
    public final InterfaceC5194vl d(@NotNull String str, long j10) {
        return (InterfaceC5194vl) b(f(str), j10);
    }

    @NotNull
    public final InterfaceC5194vl d(@NotNull String str, @Nullable String str2) {
        return (InterfaceC5194vl) b(f(str), str2);
    }

    @NotNull
    public final InterfaceC5194vl d(@NotNull String str, boolean z10) {
        return (InterfaceC5194vl) b(f(str), z10);
    }

    public final boolean e(@NotNull String str) {
        return this.f66262a.a(f(str));
    }

    @NotNull
    public abstract String f(@NotNull String str);

    @NotNull
    public InterfaceC5194vl g(@NotNull String str) {
        return (InterfaceC5194vl) d(f(str));
    }
}
