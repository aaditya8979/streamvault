package com.unity3d.ads.core.extensions;

import bo.c;
import java.net.URLConnection;
import java.util.Arrays;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: StringExtensions.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class StringExtensionsKt {
    @NotNull
    public static final String getSHA256Hash(@NotNull String str) {
        p.k(str, "<this>");
        byte[] bytes = str.getBytes(c.f5639b);
        p.j(bytes, "this as java.lang.String).getBytes(charset)");
        String strHex = ByteString.of(Arrays.copyOf(bytes, bytes.length)).sha256().hex();
        p.j(strHex, "bytes.sha256().hex()");
        return strHex;
    }

    @Nullable
    public static final String guessMimeType(@NotNull String str) {
        p.k(str, "<this>");
        return URLConnection.guessContentTypeFromName(str);
    }
}
