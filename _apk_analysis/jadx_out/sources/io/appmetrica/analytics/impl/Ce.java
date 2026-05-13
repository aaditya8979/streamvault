package io.appmetrica.analytics.impl;

import java.io.IOException;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class Ce implements InterfaceC4926l2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f65114a = 10;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f65115b = 13;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Regex f65116c = new Regex("^[0-9()\\-+\\s]+$");

    @Override // io.appmetrica.analytics.impl.InterfaceC4926l2
    @Nullable
    public final String a(@NotNull String str) throws IOException {
        StringBuilder sb2 = new StringBuilder();
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (Character.isDigit(cCharAt)) {
                sb2.append(cCharAt);
            }
        }
        String string = sb2.toString();
        int length2 = string.length();
        Character chA1 = bo.f0.A1(str);
        Character chA12 = bo.f0.A1(string);
        if (length2 < this.f65114a || length2 > this.f65115b || ((chA12 != null && chA12.charValue() == '0') || !this.f65116c.matches(str))) {
            return null;
        }
        if (length2 == 10 && (chA1 == null || chA1.charValue() != '+')) {
            return com.ironsource.Gc.f29437e.concat(string);
        }
        if (length2 == 11) {
            if (chA1 != null && chA1.charValue() == '+' && chA12 != null && chA12.charValue() == '8') {
                return null;
            }
            if (chA12 != null && chA12.charValue() == '8') {
                return com.ironsource.Gc.f29437e + string.substring(1);
            }
        }
        if (length2 < 12 || chA1 == null || chA1.charValue() != '+' || chA12 == null || chA12.charValue() != '7') {
            return string;
        }
        return null;
    }
}
