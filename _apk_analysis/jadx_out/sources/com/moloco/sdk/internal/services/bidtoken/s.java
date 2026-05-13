package com.moloco.sdk.internal.services.bidtoken;

import com.moloco.sdk.BidToken$ClientBidTokenComponents;
import com.moloco.sdk.service_locator.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public interface s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f47307a = a.f47308a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f47308a = new a();

        @NotNull
        public final s a() {
            b.e eVar = b.e.f47645a;
            return new t(eVar.l(), eVar.m());
        }
    }

    @NotNull
    BidToken$ClientBidTokenComponents a(@NotNull com.moloco.sdk.internal.services.bidtoken.providers.k kVar, @NotNull h hVar);

    @NotNull
    byte[] a(@NotNull byte[] bArr, @NotNull byte[] bArr2);
}
