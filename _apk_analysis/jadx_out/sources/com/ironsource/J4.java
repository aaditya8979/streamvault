package com.ironsource;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class J4 implements Me<String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f29652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f29653b;

    public J4(@NotNull String str, @NotNull String str2) {
        tn.p.k(str, "encryptedResponse");
        tn.p.k(str2, "descriptionKey");
        this.f29652a = str;
        this.f29653b = str2;
    }

    @Override // com.ironsource.Me
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public String a() {
        String strB = N9.b(this.f29653b, this.f29652a);
        if (strB == null || strB.length() == 0) {
            throw new IllegalArgumentException("Decryption failed");
        }
        tn.p.j(strB, "value");
        return strB;
    }
}
