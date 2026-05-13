package com.yandex.mobile.ads.instream.media3;

import androidx.annotation.MainThread;
import androidx.media3.common.AdViewProvider;
import androidx.media3.common.Player;
import androidx.media3.datasource.DataSpec;
import androidx.media3.exoplayer.source.ads.AdsLoader;
import androidx.media3.exoplayer.source.ads.AdsMediaSource;
import java.io.IOException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import yads.aj2;

/* JADX INFO: loaded from: classes8.dex */
@MainThread
public final class YandexAdsLoader extends aj2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f59189a = new a(0);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(int i10) {
            this();
        }
    }

    @Override // androidx.media3.exoplayer.source.ads.AdsLoader
    public void handlePrepareComplete(@NotNull AdsMediaSource adsMediaSource, int i10, int i11) {
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.ads.AdsLoader
    public void handlePrepareError(@NotNull AdsMediaSource adsMediaSource, int i10, int i11, @NotNull IOException iOException) {
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.ads.AdsLoader
    public void release() {
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.ads.AdsLoader
    public void setPlayer(@Nullable Player player) {
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.ads.AdsLoader
    public void setSupportedContentTypes(@NotNull int... iArr) {
    }

    @Override // androidx.media3.exoplayer.source.ads.AdsLoader
    public void start(@NotNull AdsMediaSource adsMediaSource, @NotNull DataSpec dataSpec, @NotNull Object obj, @NotNull AdViewProvider adViewProvider, @NotNull AdsLoader.EventListener eventListener) {
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.ads.AdsLoader
    public void stop(@NotNull AdsMediaSource adsMediaSource, @NotNull AdsLoader.EventListener eventListener) {
        throw null;
    }
}
