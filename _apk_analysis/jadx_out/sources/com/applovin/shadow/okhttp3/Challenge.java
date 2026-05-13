package com.applovin.shadow.okhttp3;

import com.ironsource.G5;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: Challenge.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class Challenge {

    @NotNull
    private final Map<String, String> authParams;

    @NotNull
    private final String scheme;

    /* JADX WARN: Illegal instructions before constructor call */
    public Challenge(@NotNull String str, @NotNull String str2) {
        p.k(str, "scheme");
        p.k(str2, "realm");
        Map mapSingletonMap = Collections.singletonMap("realm", str2);
        p.j(mapSingletonMap, "singletonMap(\"realm\", realm)");
        this(str, (Map<String, String>) mapSingletonMap);
    }

    public Challenge(@NotNull String str, @NotNull Map<String, String> map) {
        String lowerCase;
        p.k(str, "scheme");
        p.k(map, "authParams");
        this.scheme = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (key != null) {
                Locale locale = Locale.US;
                p.j(locale, "US");
                lowerCase = key.toLowerCase(locale);
                p.j(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            } else {
                lowerCase = null;
            }
            linkedHashMap.put(lowerCase, value);
        }
        Map<String, String> mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        p.j(mapUnmodifiableMap, "unmodifiableMap<String?, String>(newAuthParams)");
        this.authParams = mapUnmodifiableMap;
    }

    @NotNull
    /* JADX INFO: renamed from: -deprecated_authParams, reason: not valid java name */
    public final Map<String, String> m4145deprecated_authParams() {
        return this.authParams;
    }

    @NotNull
    /* JADX INFO: renamed from: -deprecated_charset, reason: not valid java name */
    public final Charset m4146deprecated_charset() {
        return charset();
    }

    @Nullable
    /* JADX INFO: renamed from: -deprecated_realm, reason: not valid java name */
    public final String m4147deprecated_realm() {
        return realm();
    }

    @NotNull
    /* JADX INFO: renamed from: -deprecated_scheme, reason: not valid java name */
    public final String m4148deprecated_scheme() {
        return this.scheme;
    }

    @NotNull
    public final Map<String, String> authParams() {
        return this.authParams;
    }

    @NotNull
    public final Charset charset() {
        String str = this.authParams.get(G5.M);
        if (str != null) {
            try {
                Charset charsetForName = Charset.forName(str);
                p.j(charsetForName, "forName(charset)");
                return charsetForName;
            } catch (Exception unused) {
            }
        }
        Charset charset = StandardCharsets.ISO_8859_1;
        p.j(charset, "ISO_8859_1");
        return charset;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof Challenge) {
            Challenge challenge = (Challenge) obj;
            if (p.f(challenge.scheme, this.scheme) && p.f(challenge.authParams, this.authParams)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((899 + this.scheme.hashCode()) * 31) + this.authParams.hashCode();
    }

    @Nullable
    public final String realm() {
        return this.authParams.get("realm");
    }

    @NotNull
    public final String scheme() {
        return this.scheme;
    }

    @NotNull
    public String toString() {
        return this.scheme + " authParams=" + this.authParams;
    }

    @NotNull
    public final Challenge withCharset(@NotNull Charset charset) {
        p.k(charset, G5.M);
        Map mapC = kotlin.collections.a.C(this.authParams);
        String strName = charset.name();
        p.j(strName, "charset.name()");
        mapC.put(G5.M, strName);
        return new Challenge(this.scheme, (Map<String, String>) mapC);
    }
}
