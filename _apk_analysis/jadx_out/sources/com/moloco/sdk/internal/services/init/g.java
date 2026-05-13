package com.moloco.sdk.internal.services.init;

import android.content.SharedPreferences;
import androidx.annotation.VisibleForTesting;
import bn.r;
import com.moloco.sdk.Init$SDKInitResponse;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: loaded from: classes9.dex */
public interface g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f47469a = a.f47470a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f47470a = new a();

        @NotNull
        public final g a(@NotNull SharedPreferences sharedPreferences) {
            p.k(sharedPreferences, "sharedPreferences");
            return new h(sharedPreferences, com.moloco.sdk.internal.scheduling.c.a().getIo());
        }
    }

    @Nullable
    Object a(@NotNull com.moloco.sdk.internal.services.init.a aVar, @NotNull com.moloco.sdk.acm.recorder.a aVar2, @NotNull hn.c<? super Init$SDKInitResponse> cVar);

    @VisibleForTesting(otherwise = 5)
    @Nullable
    Object a(@NotNull hn.c<? super r> cVar);

    @Nullable
    Object b(@NotNull com.moloco.sdk.internal.services.init.a aVar, @NotNull com.moloco.sdk.acm.recorder.a aVar2, @NotNull hn.c<? super r> cVar);

    @Nullable
    Object c(@NotNull com.moloco.sdk.internal.services.init.a aVar, @NotNull com.moloco.sdk.acm.recorder.a aVar2, @NotNull Init$SDKInitResponse init$SDKInitResponse, @NotNull hn.c<? super r> cVar);
}
