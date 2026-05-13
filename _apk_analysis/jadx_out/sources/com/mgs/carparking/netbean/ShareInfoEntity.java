package com.mgs.carparking.netbean;

import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ShareInfoEntity.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class ShareInfoEntity {

    @Nullable
    private String copyUrl;

    @Nullable
    private String qrCodeUrl;

    @Nullable
    private String saveAlbumUrl;

    @Nullable
    public final String getCopyUrl() {
        return this.copyUrl;
    }

    @Nullable
    public final String getQrCodeUrl() {
        return this.qrCodeUrl;
    }

    @Nullable
    public final String getSaveAlbumUrl() {
        return this.saveAlbumUrl;
    }

    public final void setCopyUrl(@Nullable String str) {
        this.copyUrl = str;
    }

    public final void setQrCodeUrl(@Nullable String str) {
        this.qrCodeUrl = str;
    }

    public final void setSaveAlbumUrl(@Nullable String str) {
        this.saveAlbumUrl = str;
    }
}
