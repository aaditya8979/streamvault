package com.inmobi.media.ads.network.common.model;

import androidx.annotation.Keep;
import com.inmobi.media.Ue;
import java.util.LinkedList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public final class AdSet {

    @NotNull
    private String adSetId = "";

    @Ue
    @NotNull
    private final LinkedList<Ad> ads = new LinkedList<>();
    private long expiry = -1;
    private final boolean isPod;
    private boolean isRewarded;
    private final boolean logEnabled;
    private int podSuccessCount;

    @Nullable
    private final String transactionId;

    @NotNull
    public final String getAdSetId() {
        return this.adSetId;
    }

    @NotNull
    public final LinkedList<Ad> getAds() {
        return this.ads;
    }

    public final long getExpiry() {
        return this.expiry;
    }

    public final boolean getLogEnabled() {
        return this.logEnabled;
    }

    public final int getPodSuccessCount() {
        return this.podSuccessCount;
    }

    @Nullable
    public final String getTransactionId() {
        return this.transactionId;
    }

    public final boolean isPod() {
        return this.isPod;
    }

    public final boolean isRewarded() {
        return this.isRewarded;
    }

    public final void setExpiry(long j10) {
        this.expiry = j10;
    }
}
