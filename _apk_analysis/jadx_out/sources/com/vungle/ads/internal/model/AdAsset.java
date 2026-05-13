package com.vungle.ads.internal.model;

import bn.r;
import com.vungle.ads.internal.Constants;
import com.vungle.ads.internal.util.Logger;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Result;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: AdAsset.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0001AB3\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u0011\u001a\u00020\u000b\u0012\u0006\u0010\u0013\u001a\u00020\u000b\u0012\u0006\u0010\u0015\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b?\u0010@J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0005J\u0013\u0010\b\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016R\u0017\u0010\r\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R\u0017\u0010\u0013\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u0010R\u0017\u0010\u0015\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\"\u0010\u001d\u001a\u00020\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010$\u001a\u00020#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u0010*\u001a\u00020#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010%\u001a\u0004\b+\u0010'\"\u0004\b,\u0010)R\"\u0010-\u001a\u00020#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010%\u001a\u0004\b.\u0010'\"\u0004\b/\u0010)R$\u00100\u001a\u0004\u0018\u00010#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0011\u0010<\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b<\u0010\u0017R\u0011\u0010=\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b=\u0010\u0017R\u0011\u0010>\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b>\u0010\u0017¨\u0006B"}, d2 = {"Lcom/vungle/ads/internal/model/AdAsset;", "", "Lbn/r;", "waitForDownload", "notifyDownloadEnough", "", "isWaitingForDownload", "other", "equals", "", "hashCode", "", "toString", "adIdentifier", "Ljava/lang/String;", "getAdIdentifier", "()Ljava/lang/String;", "serverPath", "getServerPath", "localPath", "getLocalPath", "isRequired", "Z", "()Z", "percentage", "Ljava/lang/Integer;", "getPercentage", "()Ljava/lang/Integer;", "Lcom/vungle/ads/internal/model/AdAsset$Status;", "status", "Lcom/vungle/ads/internal/model/AdAsset$Status;", "getStatus", "()Lcom/vungle/ads/internal/model/AdAsset$Status;", "setStatus", "(Lcom/vungle/ads/internal/model/AdAsset$Status;)V", "", "fileSize", "J", "getFileSize", "()J", "setFileSize", "(J)V", "contentLength", "getContentLength", "setContentLength", "rangeStart", "getRangeStart", "setRangeStart", "rangeEnd", "Ljava/lang/Long;", "getRangeEnd", "()Ljava/lang/Long;", "setRangeEnd", "(Ljava/lang/Long;)V", "Ljava/lang/Object;", "waitLock", "Ljava/lang/Object;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "waitingForDownload", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isMainVideo", "isHtmlTemplate", "isPrivacyIcon", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Integer;)V", "Status", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
public final class AdAsset {

    @NotNull
    private final String adIdentifier;
    private long contentLength;
    private long fileSize;
    private final boolean isRequired;

    @NotNull
    private final String localPath;

    @Nullable
    private final Integer percentage;

    @Nullable
    private Long rangeEnd;
    private long rangeStart;

    @NotNull
    private final String serverPath;

    @NotNull
    private Status status;

    @NotNull
    private final Object waitLock;

    @NotNull
    private final AtomicBoolean waitingForDownload;

    /* JADX INFO: compiled from: AdAsset.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/vungle/ads/internal/model/AdAsset$Status;", "", "(Ljava/lang/String;I)V", "NEW", "DOWNLOAD_RUNNING", "DOWNLOAD_FAILED", "DOWNLOAD_SUCCESS", "PROCESSED", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public enum Status {
        NEW,
        DOWNLOAD_RUNNING,
        DOWNLOAD_FAILED,
        DOWNLOAD_SUCCESS,
        PROCESSED
    }

    public AdAsset(@NotNull String str, @NotNull String str2, @NotNull String str3, boolean z10, @Nullable Integer num) {
        p.k(str, "adIdentifier");
        p.k(str2, "serverPath");
        p.k(str3, "localPath");
        this.adIdentifier = str;
        this.serverPath = str2;
        this.localPath = str3;
        this.isRequired = z10;
        this.percentage = num;
        this.status = Status.NEW;
        this.waitLock = new Object();
        this.waitingForDownload = new AtomicBoolean(false);
    }

    public /* synthetic */ AdAsset(String str, String str2, String str3, boolean z10, Integer num, int i10, i iVar) {
        this(str, str2, str3, z10, (i10 & 16) != 0 ? null : num);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !p.f(AdAsset.class, other.getClass())) {
            return false;
        }
        AdAsset adAsset = (AdAsset) other;
        if (this.status == adAsset.status && this.fileSize == adAsset.fileSize && this.isRequired == adAsset.isRequired && p.f(this.adIdentifier, adAsset.adIdentifier) && p.f(this.serverPath, adAsset.serverPath) && this.contentLength == adAsset.contentLength && p.f(this.percentage, adAsset.percentage)) {
            return p.f(this.localPath, adAsset.localPath);
        }
        return false;
    }

    @NotNull
    public final String getAdIdentifier() {
        return this.adIdentifier;
    }

    public final long getContentLength() {
        return this.contentLength;
    }

    public final long getFileSize() {
        return this.fileSize;
    }

    @NotNull
    public final String getLocalPath() {
        return this.localPath;
    }

    @Nullable
    public final Integer getPercentage() {
        return this.percentage;
    }

    @Nullable
    public final Long getRangeEnd() {
        return this.rangeEnd;
    }

    public final long getRangeStart() {
        return this.rangeStart;
    }

    @NotNull
    public final String getServerPath() {
        return this.serverPath;
    }

    @NotNull
    public final Status getStatus() {
        return this.status;
    }

    public int hashCode() {
        int iHashCode = ((((((this.adIdentifier.hashCode() * 31) + this.serverPath.hashCode()) * 31) + this.localPath.hashCode()) * 31) + this.status.hashCode()) * 31;
        long j10 = this.fileSize;
        int iHashCode2 = (((iHashCode + ((int) (j10 ^ (j10 >>> 32)))) * 31) + Boolean.hashCode(this.isRequired)) * 31;
        long j11 = this.contentLength;
        int i10 = (iHashCode2 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        Integer num = this.percentage;
        return i10 + (num != null ? num.hashCode() : 0);
    }

    public final boolean isHtmlTemplate() {
        return p.f(this.adIdentifier, AdPayload.KEY_VM);
    }

    public final boolean isMainVideo() {
        return p.f(this.adIdentifier, Constants.KEY_MAIN_VIDEO);
    }

    public final boolean isPrivacyIcon() {
        return p.f(this.adIdentifier, "VUNGLE_PRIVACY_ICON_URL");
    }

    /* JADX INFO: renamed from: isRequired, reason: from getter */
    public final boolean getIsRequired() {
        return this.isRequired;
    }

    public final boolean isWaitingForDownload() {
        return this.waitingForDownload.get();
    }

    public final void notifyDownloadEnough() {
        if (this.waitingForDownload.getAndSet(false)) {
            synchronized (this.waitLock) {
                this.waitLock.notifyAll();
                r rVar = r.f5635a;
            }
        }
    }

    public final void setContentLength(long j10) {
        this.contentLength = j10;
    }

    public final void setFileSize(long j10) {
        this.fileSize = j10;
    }

    public final void setRangeEnd(@Nullable Long l10) {
        this.rangeEnd = l10;
    }

    public final void setRangeStart(long j10) {
        this.rangeStart = j10;
    }

    public final void setStatus(@NotNull Status status) {
        p.k(status, "<set-?>");
        this.status = status;
    }

    @NotNull
    public String toString() {
        return "AdAsset(adIdentifier=" + this.adIdentifier + ", serverPath=" + this.serverPath + ", localPath=" + this.localPath + ", status=" + this.status + ", fileSize=" + this.fileSize + ", contentLength=" + this.contentLength + ", isRequired=" + this.isRequired + ", percentage=" + this.percentage + ')';
    }

    public final void waitForDownload() {
        Object objM7534constructorimpl;
        this.waitingForDownload.set(true);
        synchronized (this.waitLock) {
            try {
                Result.a aVar = Result.Companion;
                this.waitLock.wait();
                objM7534constructorimpl = Result.m7534constructorimpl(r.f5635a);
            } finally {
            }
            Throwable thM7537exceptionOrNullimpl = Result.m7537exceptionOrNullimpl(objM7534constructorimpl);
            if (thM7537exceptionOrNullimpl != null) {
                Logger.INSTANCE.e("AdAsset", "Interrupted while waiting for file download: " + this, thM7537exceptionOrNullimpl);
            }
        }
    }
}
