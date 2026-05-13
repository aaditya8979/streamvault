package com.moloco.sdk.internal.services.encryption;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public interface a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C0582a f47374a = C0582a.f47375a;

    /* JADX INFO: renamed from: com.moloco.sdk.internal.services.encryption.a$a, reason: collision with other inner class name */
    public static final class C0582a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ C0582a f47375a = new C0582a();

        @NotNull
        public final a a() {
            return new g();
        }
    }

    @NotNull
    byte[] a(@NotNull String str);

    @NotNull
    byte[] a(@NotNull byte[] bArr);
}
