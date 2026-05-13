package com.unity3d.ads.core.data.repository;

import android.content.Context;
import android.webkit.WebView;
import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.model.OMData;
import com.unity3d.ads.core.data.model.OMResult;
import com.unity3d.ads.core.data.model.OmidOptions;
import hn.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: OpenMeasurementRepository.kt */
/* JADX INFO: loaded from: classes12.dex */
public interface OpenMeasurementRepository {
    @Nullable
    Object activateOM(@NotNull Context context, @NotNull c<? super OMResult> cVar);

    @Nullable
    Object finishSession(@NotNull ByteString byteString, @NotNull c<? super OMResult> cVar);

    @NotNull
    OMData getOmData();

    boolean hasSessionFinished(@NotNull ByteString byteString);

    @Nullable
    Object impressionOccurred(@NotNull ByteString byteString, boolean z10, @NotNull c<? super OMResult> cVar);

    boolean isOMActive();

    void setOMActive(boolean z10);

    @Nullable
    Object startSession(@NotNull ByteString byteString, @Nullable WebView webView, @NotNull OmidOptions omidOptions, @NotNull c<? super OMResult> cVar);
}
