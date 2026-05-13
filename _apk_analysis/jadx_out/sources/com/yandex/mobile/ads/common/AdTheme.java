package com.yandex.mobile.ads.common;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class AdTheme {
    public static final AdTheme DARK;
    public static final AdTheme LIGHT;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ AdTheme[] f59154c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ kn.a f59155d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f59156b;

    static {
        AdTheme adTheme = new AdTheme(0, "LIGHT", "light");
        LIGHT = adTheme;
        AdTheme adTheme2 = new AdTheme(1, "DARK", "dark");
        DARK = adTheme2;
        AdTheme[] adThemeArr = {adTheme, adTheme2};
        f59154c = adThemeArr;
        f59155d = kotlin.enums.a.a(adThemeArr);
    }

    private AdTheme(int i10, String str, String str2) {
        this.f59156b = str2;
    }

    @NotNull
    public static kn.a<AdTheme> getEntries() {
        return f59155d;
    }

    public static AdTheme valueOf(String str) {
        return (AdTheme) Enum.valueOf(AdTheme.class, str);
    }

    public static AdTheme[] values() {
        return (AdTheme[]) f59154c.clone();
    }

    @NotNull
    public final String getValue() {
        return this.f59156b;
    }
}
