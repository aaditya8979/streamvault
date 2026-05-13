package yads;

import com.yandex.mobile.ads.R$font;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class zw0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ zw0[] f97811f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f97812b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f97813c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f97814d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f97815e;

    static {
        zw0[] zw0VarArr = {new zw0(R$font.monetization_ads_internal_font_light, R$font.monetization_ads_internal_font_regular, R$font.monetization_ads_internal_font_medium, R$font.monetization_ads_internal_font_bold)};
        f97811f = zw0VarArr;
        kotlin.enums.a.a(zw0VarArr);
    }

    public zw0(int i10, int i11, int i12, int i13) {
        this.f97812b = i10;
        this.f97813c = i11;
        this.f97814d = i12;
        this.f97815e = i13;
    }

    public static zw0 valueOf(String str) {
        return (zw0) Enum.valueOf(zw0.class, str);
    }

    public static zw0[] values() {
        return (zw0[]) f97811f.clone();
    }
}
