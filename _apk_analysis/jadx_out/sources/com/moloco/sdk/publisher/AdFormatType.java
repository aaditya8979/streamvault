package com.moloco.sdk.publisher;

import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class AdFormatType {
    private static final /* synthetic */ kn.a $ENTRIES;
    private static final /* synthetic */ AdFormatType[] $VALUES;
    public static final AdFormatType BANNER = new AdFormatType("BANNER", 0);
    public static final AdFormatType INTERSTITIAL = new AdFormatType("INTERSTITIAL", 1);
    public static final AdFormatType REWARDED = new AdFormatType(BrandSafetyUtils.f51654k, 2);
    public static final AdFormatType MREC = new AdFormatType(BrandSafetyUtils.f51658o, 3);
    public static final AdFormatType NATIVE = new AdFormatType("NATIVE", 4);

    private static final /* synthetic */ AdFormatType[] $values() {
        return new AdFormatType[]{BANNER, INTERSTITIAL, REWARDED, MREC, NATIVE};
    }

    static {
        AdFormatType[] adFormatTypeArr$values = $values();
        $VALUES = adFormatTypeArr$values;
        $ENTRIES = kotlin.enums.a.a(adFormatTypeArr$values);
    }

    private AdFormatType(String str, int i10) {
    }

    @NotNull
    public static kn.a<AdFormatType> getEntries() {
        return $ENTRIES;
    }

    public static AdFormatType valueOf(String str) {
        return (AdFormatType) Enum.valueOf(AdFormatType.class, str);
    }

    public static AdFormatType[] values() {
        return (AdFormatType[]) $VALUES.clone();
    }

    @NotNull
    public final String toLowercase() {
        String lowerCase = toString().toLowerCase(Locale.ROOT);
        p.j(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    @NotNull
    public final String toTitlecase() {
        String lowercase = toLowercase();
        if (lowercase.length() <= 0) {
            return lowercase;
        }
        StringBuilder sb2 = new StringBuilder();
        char cCharAt = lowercase.charAt(0);
        sb2.append((Object) (Character.isLowerCase(cCharAt) ? bo.b.j(cCharAt) : String.valueOf(cCharAt)));
        String strSubstring = lowercase.substring(1);
        p.j(strSubstring, "substring(...)");
        sb2.append(strSubstring);
        return sb2.toString();
    }
}
