package com.moloco.sdk.internal.services.bidtoken;

import com.moloco.sdk.service_locator.b;
import kotlin.Result;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public interface u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f47313a = a.f47314a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f47314a = new a();

        @NotNull
        public final u a() {
            return new r(b.h.f47664a.h(), s.f47307a.a(), com.moloco.sdk.internal.services.encryption.a.f47374a.a(), com.moloco.sdk.internal.services.bidtoken.providers.m.f47236a.a());
        }
    }

    @Nullable
    Object a(@NotNull com.moloco.sdk.acm.recorder.a aVar, @NotNull String str, @NotNull h hVar, @NotNull hn.c<? super Result<String>> cVar);
}
