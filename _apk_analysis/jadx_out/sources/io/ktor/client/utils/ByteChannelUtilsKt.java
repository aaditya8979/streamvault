package io.ktor.client.utils;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import io.ktor.utils.io.ByteWriteChannelOperationsKt;
import io.ktor.utils.io.a;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.m1;
import tn.p;

/* JADX INFO: compiled from: ByteChannelUtils.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class ByteChannelUtilsKt {
    @NotNull
    public static final a a(@NotNull a aVar, @NotNull d dVar, @Nullable Long l10, @NotNull wk.a aVar2) {
        p.k(aVar, "<this>");
        p.k(dVar, GAMConfig.KEY_CONTEXT);
        p.k(aVar2, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        return ByteWriteChannelOperationsKt.h(m1.f59865b, dVar, true, new ByteChannelUtilsKt$observable$1(aVar, aVar2, l10, null)).b();
    }
}
