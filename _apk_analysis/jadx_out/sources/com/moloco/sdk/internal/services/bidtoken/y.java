package com.moloco.sdk.internal.services.bidtoken;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public interface y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f47331a = a.f47332a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f47332a = new a();

        @NotNull
        public final y a(@NotNull com.moloco.sdk.internal.bidtoken.b bVar, @NotNull com.moloco.sdk.internal.services.j jVar) {
            tn.p.k(bVar, "bidTokenParser");
            tn.p.k(jVar, "timeProviderService");
            return new w(bVar, jVar);
        }
    }

    @NotNull
    n a();

    @Nullable
    Object a(@NotNull n nVar, @NotNull hn.c<? super bn.r> cVar);

    @Nullable
    Object a(@NotNull hn.c<? super B> cVar);
}
