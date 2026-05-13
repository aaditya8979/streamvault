package com.unity3d.ads.core.domain.scar;

import bn.r;
import com.google.protobuf.ByteString;
import com.unity3d.ads.TokenConfiguration;
import hn.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: FetchSignalsAndSendUseCase.kt */
/* JADX INFO: loaded from: classes3.dex */
public interface FetchSignalsAndSendUseCase {
    @Nullable
    Object invoke(int i10, @NotNull ByteString byteString, @Nullable TokenConfiguration tokenConfiguration, @NotNull c<? super r> cVar);
}
