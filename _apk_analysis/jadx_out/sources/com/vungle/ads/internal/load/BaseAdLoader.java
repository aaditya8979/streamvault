package com.vungle.ads.internal.load;

import android.content.Context;
import androidx.annotation.WorkerThread;
import bn.g;
import com.ironsource.C3978d4;
import com.ironsource.Mf;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.f;
import com.vungle.ads.AdExpiredError;
import com.vungle.ads.AdPayloadError;
import com.vungle.ads.AdResponseEmptyError;
import com.vungle.ads.AnalyticsClient;
import com.vungle.ads.AssetWriteError;
import com.vungle.ads.InvalidAssetUrlError;
import com.vungle.ads.InvalidEventIdError;
import com.vungle.ads.InvalidTemplateURLError;
import com.vungle.ads.NativeAssetError;
import com.vungle.ads.OmSdkJsError;
import com.vungle.ads.PlacementMismatchError;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.SingleValueMetric;
import com.vungle.ads.TimeIntervalMetric;
import com.vungle.ads.VungleError;
import com.vungle.ads.internal.ConfigManager;
import com.vungle.ads.internal.Constants;
import com.vungle.ads.internal.NativeAdInternal;
import com.vungle.ads.internal.downloader.AssetDownloadListener;
import com.vungle.ads.internal.downloader.DownloadRequest;
import com.vungle.ads.internal.downloader.Downloader;
import com.vungle.ads.internal.executor.Executors;
import com.vungle.ads.internal.load.BaseAdLoader;
import com.vungle.ads.internal.model.AdAsset;
import com.vungle.ads.internal.model.AdPayload;
import com.vungle.ads.internal.model.ConfigPayload;
import com.vungle.ads.internal.network.TpatRequest;
import com.vungle.ads.internal.network.TpatSender;
import com.vungle.ads.internal.network.VungleApiClient;
import com.vungle.ads.internal.omsdk.OMInjector;
import com.vungle.ads.internal.presenter.PreloadDelegate;
import com.vungle.ads.internal.presenter.WebViewManager;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.task.JobRunner;
import com.vungle.ads.internal.task.ResendTpatJob;
import com.vungle.ads.internal.ui.AdActivity;
import com.vungle.ads.internal.util.FileUtility;
import com.vungle.ads.internal.util.LogEntry;
import com.vungle.ads.internal.util.Logger;
import com.vungle.ads.internal.util.PathProvider;
import com.vungle.ads.internal.util.Utils;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.a;
import tn.p;

/* JADX INFO: compiled from: BaseAdLoader.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {}, d1 = {"\u0000Ô\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000 w2\u00020\u0001:\u0001wB?\u0012\u0006\u0010*\u001a\u00020)\u0012\u0006\u0010/\u001a\u00020.\u0012\u0006\u00104\u001a\u000203\u0012\u0006\u00109\u001a\u000208\u0012\u0006\u0010<\u001a\u00020;\u0012\u0006\u0010?\u001a\u00020>\u0012\u0006\u0010C\u001a\u00020\u0011¢\u0006\u0004\bu\u0010vJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0012\u0010\r\u001a\u0004\u0018\u00010\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u001a\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u00072\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002J\b\u0010\u0010\u001a\u00020\u0002H\u0002J\u0010\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0003J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\u0016\u001a\u00020\u0002H\u0002J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0017\u001a\u00020\u000bH\u0002J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0017\u001a\u00020\u000bH\u0002J\u0010\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u000bH\u0002J\u000e\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001cJ\b\u0010\u001f\u001a\u00020\u0002H$J\b\u0010 \u001a\u00020\u0002H&J\u0006\u0010!\u001a\u00020\u0002J\u000e\u0010#\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u0018J#\u0010(\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$H\u0000¢\u0006\u0004\b&\u0010'R\u0017\u0010*\u001a\u00020)8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010/\u001a\u00020.8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0017\u00104\u001a\u0002038\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0014\u00109\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010<\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0017\u0010?\u001a\u00020>8\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u0017\u0010C\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u0014\u0010H\u001a\u00020G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u001a\u0010L\u001a\b\u0012\u0004\u0012\u00020K0J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010NR\u0016\u0010P\u001a\u00020O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u0016\u0010R\u001a\u00020O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010QR\u001a\u0010T\u001a\b\u0012\u0004\u0012\u00020\u00070S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR$\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\f\u0010V\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR\u0016\u0010[\u001a\u00020O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010QR\u0016\u0010\\\u001a\u00020O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010QR\u0014\u0010^\u001a\u00020]8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u0016\u0010`\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010aR\u0016\u0010b\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010aR\u0016\u0010c\u001a\u00020]8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010_R\u0016\u0010d\u001a\u00020]8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010_R\u0016\u0010e\u001a\u00020]8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010_R\u0016\u0010f\u001a\u00020]8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010_R$\u0010h\u001a\u0004\u0018\u00010g8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bh\u0010i\u001a\u0004\bj\u0010k\"\u0004\bl\u0010mR\u0016\u0010o\u001a\u00020n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bo\u0010pR\u0014\u0010t\u001a\u00020q8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\br\u0010s¨\u0006|²\u0006\f\u0010y\u001a\u00020x8\nX\u008a\u0084\u0002²\u0006\f\u0010{\u001a\u00020z8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/vungle/ads/internal/load/BaseAdLoader;", "", "Lbn/r;", "downloadAssets", Mf.f29847a, "Ljava/io/File;", C3978d4.i.f31327b, "Lcom/vungle/ads/internal/model/AdAsset;", "adAsset", "", "fileIsValid", "Lcom/vungle/ads/internal/model/AdPayload;", "advertisement", "getDestinationDir", "asset", "processVmTemplate", "onRequiredDownloadCompleted", "Lcom/vungle/ads/internal/load/AdRequest;", AdActivity.REQUEST_KEY_EXTRA, "onDownloadCompleted", "Lcom/vungle/ads/internal/downloader/DownloadRequest$Priority;", "getAssetPriority", "injectOMSDKIfNeeded", "adPayload", "Lcom/vungle/ads/VungleError;", "validateAdMetadata", "getTemplateError", "getErrorInfo", "Lcom/vungle/ads/internal/load/AdLoaderCallback;", "adLoaderCallback", f.H, "requestAd", "onAdLoadReady", "cancel", "error", Mf.f29848b, "Lcom/vungle/ads/SingleValueMetric;", "metric", "handleAdMetaData$vungle_ads_release", "(Lcom/vungle/ads/internal/model/AdPayload;Lcom/vungle/ads/SingleValueMetric;)V", "handleAdMetaData", "Landroid/content/Context;", GAMConfig.KEY_CONTEXT, "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Lcom/vungle/ads/internal/network/VungleApiClient;", "vungleApiClient", "Lcom/vungle/ads/internal/network/VungleApiClient;", "getVungleApiClient", "()Lcom/vungle/ads/internal/network/VungleApiClient;", "Lcom/vungle/ads/internal/executor/Executors;", "sdkExecutors", "Lcom/vungle/ads/internal/executor/Executors;", "getSdkExecutors", "()Lcom/vungle/ads/internal/executor/Executors;", "Lcom/vungle/ads/internal/omsdk/OMInjector;", "omInjector", "Lcom/vungle/ads/internal/omsdk/OMInjector;", "Lcom/vungle/ads/internal/downloader/Downloader;", "downloader", "Lcom/vungle/ads/internal/downloader/Downloader;", "Lcom/vungle/ads/internal/util/PathProvider;", "pathProvider", "Lcom/vungle/ads/internal/util/PathProvider;", "getPathProvider", "()Lcom/vungle/ads/internal/util/PathProvider;", "adRequest", "Lcom/vungle/ads/internal/load/AdRequest;", "getAdRequest", "()Lcom/vungle/ads/internal/load/AdRequest;", "Ljava/util/concurrent/atomic/AtomicLong;", "downloadCount", "Ljava/util/concurrent/atomic/AtomicLong;", "", "", "downloadRequiredAssets", "Ljava/util/Set;", "Lcom/vungle/ads/internal/load/AdLoaderCallback;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "notifySuccess", "Ljava/util/concurrent/atomic/AtomicBoolean;", "notifyFailed", "", "adAssets", "Ljava/util/List;", "Lcom/vungle/ads/internal/model/AdPayload;", "getAdvertisement$vungle_ads_release", "()Lcom/vungle/ads/internal/model/AdPayload;", "setAdvertisement$vungle_ads_release", "(Lcom/vungle/ads/internal/model/AdPayload;)V", "fullyDownloaded", "requiredAssetDownloaded", "Lcom/vungle/ads/TimeIntervalMetric;", "requestToResponseMetric", "Lcom/vungle/ads/TimeIntervalMetric;", "mainVideoSizeMetric", "Lcom/vungle/ads/SingleValueMetric;", "templateHtmlSizeMetric", "assetDownloadDurationMetric", "adRequiredDownloadDurationMetric", "adOptionalDownloadDurationMetric", "adPreloadToReadyDurationMetric", "Lcom/vungle/ads/internal/util/LogEntry;", "logEntry", "Lcom/vungle/ads/internal/util/LogEntry;", "getLogEntry$vungle_ads_release", "()Lcom/vungle/ads/internal/util/LogEntry;", "setLogEntry$vungle_ads_release", "(Lcom/vungle/ads/internal/util/LogEntry;)V", "", "loadStart", "J", "Lcom/vungle/ads/internal/downloader/AssetDownloadListener;", "getAssetDownloadListener", "()Lcom/vungle/ads/internal/downloader/AssetDownloadListener;", "assetDownloadListener", "<init>", "(Landroid/content/Context;Lcom/vungle/ads/internal/network/VungleApiClient;Lcom/vungle/ads/internal/executor/Executors;Lcom/vungle/ads/internal/omsdk/OMInjector;Lcom/vungle/ads/internal/downloader/Downloader;Lcom/vungle/ads/internal/util/PathProvider;Lcom/vungle/ads/internal/load/AdRequest;)V", VastTagName.COMPANION, "Lcom/vungle/ads/internal/task/JobRunner;", "jobRunner", "Lcom/vungle/ads/internal/network/TpatSender;", "tpatSender", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
public abstract class BaseAdLoader {

    @NotNull
    private static final String DOWNLOADED_FILE_NOT_FOUND = "Downloaded file not found!";

    @NotNull
    private static final String TAG = "BaseAdLoader";

    @NotNull
    private final List<AdAsset> adAssets;

    @Nullable
    private AdLoaderCallback adLoaderCallback;

    @NotNull
    private TimeIntervalMetric adOptionalDownloadDurationMetric;

    @NotNull
    private TimeIntervalMetric adPreloadToReadyDurationMetric;

    @NotNull
    private final AdRequest adRequest;

    @NotNull
    private TimeIntervalMetric adRequiredDownloadDurationMetric;

    @Nullable
    private AdPayload advertisement;

    @NotNull
    private TimeIntervalMetric assetDownloadDurationMetric;

    @NotNull
    private final Context context;

    @NotNull
    private final AtomicLong downloadCount;

    @NotNull
    private final Set<String> downloadRequiredAssets;

    @NotNull
    private final Downloader downloader;

    @NotNull
    private AtomicBoolean fullyDownloaded;
    private long loadStart;

    @Nullable
    private LogEntry logEntry;

    @NotNull
    private SingleValueMetric mainVideoSizeMetric;

    @NotNull
    private AtomicBoolean notifyFailed;

    @NotNull
    private AtomicBoolean notifySuccess;

    @NotNull
    private final OMInjector omInjector;

    @NotNull
    private final PathProvider pathProvider;

    @NotNull
    private final TimeIntervalMetric requestToResponseMetric;

    @NotNull
    private AtomicBoolean requiredAssetDownloaded;

    @NotNull
    private final Executors sdkExecutors;

    @NotNull
    private SingleValueMetric templateHtmlSizeMetric;

    @NotNull
    private final VungleApiClient vungleApiClient;

    public BaseAdLoader(@NotNull Context context, @NotNull VungleApiClient vungleApiClient, @NotNull Executors executors, @NotNull OMInjector oMInjector, @NotNull Downloader downloader, @NotNull PathProvider pathProvider, @NotNull AdRequest adRequest) {
        p.k(context, GAMConfig.KEY_CONTEXT);
        p.k(vungleApiClient, "vungleApiClient");
        p.k(executors, "sdkExecutors");
        p.k(oMInjector, "omInjector");
        p.k(downloader, "downloader");
        p.k(pathProvider, "pathProvider");
        p.k(adRequest, "adRequest");
        this.context = context;
        this.vungleApiClient = vungleApiClient;
        this.sdkExecutors = executors;
        this.omInjector = oMInjector;
        this.downloader = downloader;
        this.pathProvider = pathProvider;
        this.adRequest = adRequest;
        this.downloadCount = new AtomicLong(0L);
        this.downloadRequiredAssets = new LinkedHashSet();
        this.notifySuccess = new AtomicBoolean(false);
        this.notifyFailed = new AtomicBoolean(false);
        this.adAssets = new ArrayList();
        this.fullyDownloaded = new AtomicBoolean(true);
        this.requiredAssetDownloaded = new AtomicBoolean(true);
        this.requestToResponseMetric = new TimeIntervalMetric(Sdk.SDKMetric.SDKMetricType.AD_REQUEST_TO_RESPONSE_DURATION_MS);
        this.mainVideoSizeMetric = new SingleValueMetric(Sdk.SDKMetric.SDKMetricType.ASSET_FILE_SIZE);
        this.templateHtmlSizeMetric = new SingleValueMetric(Sdk.SDKMetric.SDKMetricType.TEMPLATE_HTML_SIZE);
        this.assetDownloadDurationMetric = new TimeIntervalMetric(Sdk.SDKMetric.SDKMetricType.ASSET_DOWNLOAD_DURATION_MS);
        this.adRequiredDownloadDurationMetric = new TimeIntervalMetric(Sdk.SDKMetric.SDKMetricType.AD_REQUIRED_DOWNLOAD_DURATION_MS);
        this.adOptionalDownloadDurationMetric = new TimeIntervalMetric(Sdk.SDKMetric.SDKMetricType.AD_OPTIONAL_DOWNLOAD_DURATION_MS);
        this.adPreloadToReadyDurationMetric = new TimeIntervalMetric(Sdk.SDKMetric.SDKMetricType.AD_PRELOAD_TO_READY_DURATION_MS);
    }

    private final void downloadAssets() {
        this.assetDownloadDurationMetric.markStart();
        this.adRequiredDownloadDurationMetric.markStart();
        this.adOptionalDownloadDurationMetric.markStart();
        this.downloadCount.set(this.adAssets.size());
        for (AdAsset adAsset : this.adAssets) {
            DownloadRequest downloadRequest = new DownloadRequest(getAssetPriority(adAsset), adAsset, this.logEntry);
            if (adAsset.isHtmlTemplate()) {
                downloadRequest.startTemplateRecord();
            }
            if (adAsset.getIsRequired()) {
                this.downloadRequiredAssets.add(adAsset.getServerPath());
            }
            this.downloader.download(downloadRequest, getAssetDownloadListener());
        }
    }

    private final boolean fileIsValid(File file, AdAsset adAsset) {
        return file.exists() && file.length() == adAsset.getFileSize();
    }

    private final AssetDownloadListener getAssetDownloadListener() {
        return new BaseAdLoader$assetDownloadListener$1(this);
    }

    private final DownloadRequest.Priority getAssetPriority(AdAsset adAsset) {
        return adAsset.getIsRequired() ? DownloadRequest.Priority.CRITICAL : DownloadRequest.Priority.HIGHEST;
    }

    private final File getDestinationDir(AdPayload advertisement) {
        return this.pathProvider.getDownloadsDirForAd(advertisement.eventId());
    }

    private final VungleError getErrorInfo(AdPayload adPayload) {
        AdPayload.AdUnit adUnit = adPayload.adUnit();
        Integer errorCode = adUnit != null ? adUnit.getErrorCode() : null;
        AdPayload.AdUnit adUnit2 = adPayload.adUnit();
        Integer sleep = adUnit2 != null ? adUnit2.getSleep() : null;
        AdPayload.AdUnit adUnit3 = adPayload.adUnit();
        String str = "Response error: " + sleep + ", Request failed with error: " + errorCode + ", " + (adUnit3 != null ? adUnit3.getInfo() : null);
        boolean z10 = false;
        if (((((errorCode != null && errorCode.intValue() == 10001) || (errorCode != null && errorCode.intValue() == 10002)) || (errorCode != null && errorCode.intValue() == 20001)) || (errorCode != null && errorCode.intValue() == 30001)) || (errorCode != null && errorCode.intValue() == 30002)) {
            z10 = true;
        }
        if (!z10) {
            return new AdPayloadError(Sdk.SDKError.Reason.PLACEMENT_SLEEP, str);
        }
        Sdk.SDKError.Reason reasonForNumber = Sdk.SDKError.Reason.forNumber(errorCode.intValue());
        p.j(reasonForNumber, "forNumber(errorCode)");
        return new AdPayloadError(reasonForNumber, str);
    }

    private final VungleError getTemplateError(AdPayload adPayload) {
        AdPayload.AdUnit adUnit = adPayload.adUnit();
        AdPayload.TemplateSettings templateSettings = adUnit != null ? adUnit.getTemplateSettings() : null;
        if (templateSettings == null) {
            return new AdResponseEmptyError("Missing template settings");
        }
        Map<String, AdPayload.CacheableReplacement> cacheableReplacements = templateSettings.getCacheableReplacements();
        if (!adPayload.isNativeTemplateType()) {
            AdPayload.AdUnit adUnit2 = adPayload.adUnit();
            String vmURL = adUnit2 != null ? adUnit2.getVmURL() : null;
            if (vmURL == null || vmURL.length() == 0) {
                return new InvalidTemplateURLError("Failed to prepare null vmURL for downloading.");
            }
            if (!Utils.INSTANCE.isUrlValid(vmURL)) {
                return new InvalidTemplateURLError("Failed to load vm url: " + vmURL);
            }
        } else if (cacheableReplacements != null) {
            AdPayload.CacheableReplacement cacheableReplacement = cacheableReplacements.get(NativeAdInternal.TOKEN_MAIN_IMAGE);
            if ((cacheableReplacement != null ? cacheableReplacement.getUrl() : null) == null) {
                return new NativeAssetError("Unable to load null main image.");
            }
            AdPayload.CacheableReplacement cacheableReplacement2 = cacheableReplacements.get("VUNGLE_PRIVACY_ICON_URL");
            if ((cacheableReplacement2 != null ? cacheableReplacement2.getUrl() : null) == null) {
                return new NativeAssetError("Unable to load null privacy image.");
            }
        }
        if (cacheableReplacements != null) {
            for (Map.Entry<String, AdPayload.CacheableReplacement> entry : cacheableReplacements.entrySet()) {
                String url = entry.getValue().getUrl();
                if (url == null || url.length() == 0) {
                    return new InvalidAssetUrlError("None asset URL for " + entry.getKey());
                }
                if (!Utils.INSTANCE.isUrlValid(url)) {
                    return new InvalidAssetUrlError("Invalid asset URL " + url);
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: handleAdMetaData$lambda-4, reason: not valid java name */
    private static final TpatSender m7315handleAdMetaData$lambda4(g<TpatSender> gVar) {
        return gVar.getValue();
    }

    public static /* synthetic */ void handleAdMetaData$vungle_ads_release$default(BaseAdLoader baseAdLoader, AdPayload adPayload, SingleValueMetric singleValueMetric, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: handleAdMetaData");
        }
        if ((i10 & 2) != 0) {
            singleValueMetric = null;
        }
        baseAdLoader.handleAdMetaData$vungle_ads_release(adPayload, singleValueMetric);
    }

    private final void injectOMSDKIfNeeded() {
        AdPayload adPayload = this.advertisement;
        if (adPayload != null && adPayload.omEnabled()) {
            try {
                this.omInjector.init();
                this.omInjector.injectJsFiles$vungle_ads_release(this.pathProvider.getVmDir());
            } catch (Exception e10) {
                Logger.INSTANCE.e(TAG, "Failed to inject OMSDK: " + e10.getMessage());
                new OmSdkJsError(Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED, "Failed to inject OMSDK: " + e10.getMessage()).setLogEntry$vungle_ads_release(this.logEntry).logErrorNoReturnValue$vungle_ads_release();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: loadAd$lambda-0, reason: not valid java name */
    public static final void m7316loadAd$lambda0(BaseAdLoader baseAdLoader) {
        p.k(baseAdLoader, "this$0");
        baseAdLoader.requestToResponseMetric.markStart();
        baseAdLoader.requestAd();
    }

    private final void onAdReady() {
        final AdPayload adPayload = this.advertisement;
        if (adPayload == null || this.notifyFailed.get() || !this.notifySuccess.compareAndSet(false, true)) {
            return;
        }
        if (adPayload.usePreloading()) {
            this.adPreloadToReadyDurationMetric.markStart();
            String strValueOf = String.valueOf(adPayload.getIndexFilePath());
            Logger.INSTANCE.w(TAG, "start preloading");
            WebViewManager.INSTANCE.preloadWebView$vungle_ads_release(this.context, adPayload, this.adRequest.getPlacement(), strValueOf, adPayload.getWebViewSettings(), new PreloadDelegate() { // from class: com.vungle.ads.internal.load.BaseAdLoader$onAdReady$1$1
                @Override // com.vungle.ads.internal.presenter.PreloadDelegate
                public void onAdFailedToPlay() {
                    this.this$0.adPreloadToReadyDurationMetric.markEnd();
                    AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, this.this$0.adPreloadToReadyDurationMetric, this.this$0.getLogEntry(), (String) null, 4, (Object) null);
                    Logger.INSTANCE.e("BaseAdLoader", "fail to load ad");
                    this.this$0.onAdLoadReady();
                    AdLoaderCallback adLoaderCallback = this.this$0.adLoaderCallback;
                    if (adLoaderCallback != null) {
                        adLoaderCallback.onSuccess(adPayload);
                    }
                }

                @Override // com.vungle.ads.internal.presenter.PreloadDelegate
                public void onAdReadyToPlay() {
                    this.this$0.adPreloadToReadyDurationMetric.markEnd();
                    AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, this.this$0.adPreloadToReadyDurationMetric, this.this$0.getLogEntry(), (String) null, 4, (Object) null);
                    this.this$0.onAdLoadReady();
                    AdLoaderCallback adLoaderCallback = this.this$0.adLoaderCallback;
                    if (adLoaderCallback != null) {
                        adLoaderCallback.onSuccess(adPayload);
                    }
                }
            }, Long.valueOf(System.currentTimeMillis() - this.loadStart));
        } else {
            onAdLoadReady();
            AdLoaderCallback adLoaderCallback = this.adLoaderCallback;
            if (adLoaderCallback != null) {
                adLoaderCallback.onSuccess(adPayload);
            }
        }
        ServiceLocator.Companion companion = ServiceLocator.INSTANCE;
        final Context context = this.context;
        m7317onAdReady$lambda2$lambda1(b.a(LazyThreadSafetyMode.SYNCHRONIZED, new a<JobRunner>() { // from class: com.vungle.ads.internal.load.BaseAdLoader$onAdReady$lambda-2$$inlined$inject$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.task.JobRunner, java.lang.Object] */
            @Override // sn.a
            @NotNull
            public final JobRunner invoke() {
                return ServiceLocator.INSTANCE.getInstance(context).getService(JobRunner.class);
            }
        })).execute(ResendTpatJob.INSTANCE.makeJobInfo());
    }

    /* JADX INFO: renamed from: onAdReady$lambda-2$lambda-1, reason: not valid java name */
    private static final JobRunner m7317onAdReady$lambda2$lambda1(g<? extends JobRunner> gVar) {
        return gVar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @WorkerThread
    public final void onDownloadCompleted(AdRequest adRequest) {
        Logger.INSTANCE.d(TAG, "All download completed " + adRequest);
        AdPayload adPayload = this.advertisement;
        if (adPayload != null) {
            adPayload.setAssetFullyDownloaded();
        }
        onAdReady();
        this.assetDownloadDurationMetric.markEnd();
        AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
        AnalyticsClient.logMetric$vungle_ads_release$default(analyticsClient, this.assetDownloadDurationMetric, this.logEntry, (String) null, 4, (Object) null);
        this.adOptionalDownloadDurationMetric.markEnd();
        AnalyticsClient.logMetric$vungle_ads_release$default(analyticsClient, this.adOptionalDownloadDurationMetric, this.logEntry, (String) null, 4, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onRequiredDownloadCompleted() {
        this.adRequiredDownloadDurationMetric.markEnd();
        AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, this.adRequiredDownloadDurationMetric, this.logEntry, (String) null, 4, (Object) null);
        onAdReady();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean processVmTemplate(AdAsset asset, AdPayload advertisement) {
        if (advertisement == null || asset.getStatus() != AdAsset.Status.DOWNLOAD_SUCCESS) {
            return false;
        }
        if ((asset.getLocalPath().length() == 0) || !fileIsValid(new File(asset.getLocalPath()), asset)) {
            return false;
        }
        File destinationDir = getDestinationDir(advertisement);
        if (destinationDir == null || !destinationDir.isDirectory()) {
            Logger.INSTANCE.e(TAG, "Unable to access Destination Directory");
            return false;
        }
        FileUtility.printDirectoryTree(destinationDir);
        return true;
    }

    private final VungleError validateAdMetadata(AdPayload adPayload) {
        Integer sleep;
        AdPayload.AdUnit adUnit = adPayload.adUnit();
        if (adUnit != null && (sleep = adUnit.getSleep()) != null) {
            sleep.intValue();
            return getErrorInfo(adPayload);
        }
        String referenceId = this.adRequest.getPlacement().getReferenceId();
        AdPayload adPayload2 = this.advertisement;
        if (!p.f(referenceId, adPayload2 != null ? adPayload2.placementId() : null)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Waterfall request and responses placement don't match ");
            AdPayload adPayload3 = this.advertisement;
            sb2.append(adPayload3 != null ? adPayload3.placementId() : null);
            sb2.append('.');
            return new PlacementMismatchError(sb2.toString());
        }
        VungleError templateError = getTemplateError(adPayload);
        if (templateError != null) {
            return templateError;
        }
        if (!adPayload.hasExpired()) {
            String strEventId = adPayload.eventId();
            if (strEventId == null || strEventId.length() == 0) {
                return new InvalidEventIdError("Event id is invalid.");
            }
            return null;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("The ad markup has expired for playback. Ad expiry: ");
        AdPayload.AdUnit adUnit2 = adPayload.adUnit();
        sb3.append(adUnit2 != null ? adUnit2.getExpiry() : null);
        sb3.append(", device: ");
        sb3.append(System.currentTimeMillis());
        return new AdExpiredError(sb3.toString());
    }

    public final void cancel() {
        this.downloader.cancelAll();
    }

    @NotNull
    public final AdRequest getAdRequest() {
        return this.adRequest;
    }

    @Nullable
    /* JADX INFO: renamed from: getAdvertisement$vungle_ads_release, reason: from getter */
    public final AdPayload getAdvertisement() {
        return this.advertisement;
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @Nullable
    /* JADX INFO: renamed from: getLogEntry$vungle_ads_release, reason: from getter */
    public final LogEntry getLogEntry() {
        return this.logEntry;
    }

    @NotNull
    public final PathProvider getPathProvider() {
        return this.pathProvider;
    }

    @NotNull
    public final Executors getSdkExecutors() {
        return this.sdkExecutors;
    }

    @NotNull
    public final VungleApiClient getVungleApiClient() {
        return this.vungleApiClient;
    }

    public final void handleAdMetaData$vungle_ads_release(@NotNull AdPayload advertisement, @Nullable SingleValueMetric metric) {
        List<String> loadAdUrls;
        p.k(advertisement, "advertisement");
        this.advertisement = advertisement;
        if (advertisement != null) {
            advertisement.recordExpiryWindowStart();
        }
        advertisement.setLogEntry$vungle_ads_release(this.logEntry);
        LogEntry logEntry = this.logEntry;
        if (logEntry != null) {
            logEntry.setEventId$vungle_ads_release(advertisement.eventId());
        }
        LogEntry logEntry2 = this.logEntry;
        if (logEntry2 != null) {
            logEntry2.setCreativeId$vungle_ads_release(advertisement.getCreativeId());
        }
        LogEntry logEntry3 = this.logEntry;
        if (logEntry3 != null) {
            logEntry3.setAdSource$vungle_ads_release(advertisement.getAdSource());
        }
        LogEntry logEntry4 = this.logEntry;
        if (logEntry4 != null) {
            logEntry4.setMediationName$vungle_ads_release(advertisement.getMediationName());
        }
        LogEntry logEntry5 = this.logEntry;
        if (logEntry5 != null) {
            logEntry5.setVmVersion$vungle_ads_release(advertisement.getViewMasterVersion());
        }
        LogEntry logEntry6 = this.logEntry;
        if (logEntry6 != null) {
            logEntry6.setPartialDownloadEnabled$vungle_ads_release(Boolean.valueOf(advertisement.isPartialDownloadEnabled()));
        }
        LogEntry logEntry7 = this.logEntry;
        if (logEntry7 != null) {
            logEntry7.setAdoEnabled$vungle_ads_release(Boolean.valueOf(advertisement.adLoadOptimizationEnabled()));
        }
        this.requestToResponseMetric.markEnd();
        AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, this.requestToResponseMetric, this.logEntry, (String) null, 4, (Object) null);
        ConfigPayload config = advertisement.getConfig();
        if (config != null) {
            ConfigManager.INSTANCE.initWithConfig$vungle_ads_release(this.context, config, false, metric);
        }
        VungleError vungleErrorValidateAdMetadata = validateAdMetadata(advertisement);
        if (vungleErrorValidateAdMetadata != null) {
            onAdLoadFailed(vungleErrorValidateAdMetadata.setLogEntry$vungle_ads_release(this.logEntry).logError$vungle_ads_release());
            return;
        }
        File destinationDir = getDestinationDir(advertisement);
        if (destinationDir == null || !destinationDir.isDirectory() || !destinationDir.exists()) {
            onAdLoadFailed(new AssetWriteError("Invalid directory. " + destinationDir).setLogEntry$vungle_ads_release(this.logEntry).logError$vungle_ads_release());
            return;
        }
        injectOMSDKIfNeeded();
        ServiceLocator.Companion companion = ServiceLocator.INSTANCE;
        final Context context = this.context;
        g gVarA = b.a(LazyThreadSafetyMode.SYNCHRONIZED, new a<TpatSender>() { // from class: com.vungle.ads.internal.load.BaseAdLoader$handleAdMetaData$$inlined$inject$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.network.TpatSender, java.lang.Object] */
            @Override // sn.a
            @NotNull
            public final TpatSender invoke() {
                return ServiceLocator.INSTANCE.getInstance(context).getService(TpatSender.class);
            }
        });
        AdPayload.AdUnit adUnit = advertisement.adUnit();
        if (adUnit != null && (loadAdUrls = adUnit.getLoadAdUrls()) != null) {
            Iterator<T> it = loadAdUrls.iterator();
            while (it.hasNext()) {
                TpatSender.sendTpat$default(m7315handleAdMetaData$lambda4(gVarA), new TpatRequest.Builder((String) it.next()).tpatKey(Constants.LOAD_AD).withLogEntry(this.logEntry).build(), false, 2, null);
            }
        }
        if (!this.adAssets.isEmpty()) {
            this.adAssets.clear();
        }
        this.adAssets.addAll(advertisement.getDownloadableAssets(destinationDir));
        if (this.adAssets.isEmpty()) {
            onAdReady();
        } else {
            downloadAssets();
        }
    }

    public final void loadAd(@NotNull AdLoaderCallback adLoaderCallback) {
        p.k(adLoaderCallback, "adLoaderCallback");
        this.adLoaderCallback = adLoaderCallback;
        this.loadStart = System.currentTimeMillis();
        this.sdkExecutors.getBACKGROUND_EXECUTOR().execute(new Runnable() { // from class: nf.a
            @Override // java.lang.Runnable
            public final void run() {
                BaseAdLoader.m7316loadAd$lambda0(this.f75864b);
            }
        });
    }

    public final void onAdLoadFailed(@NotNull VungleError vungleError) {
        AdLoaderCallback adLoaderCallback;
        p.k(vungleError, "error");
        if (this.notifySuccess.get() || !this.notifyFailed.compareAndSet(false, true) || (adLoaderCallback = this.adLoaderCallback) == null) {
            return;
        }
        adLoaderCallback.onFailure(vungleError);
    }

    public abstract void onAdLoadReady();

    public abstract void requestAd();

    public final void setAdvertisement$vungle_ads_release(@Nullable AdPayload adPayload) {
        this.advertisement = adPayload;
    }

    public final void setLogEntry$vungle_ads_release(@Nullable LogEntry logEntry) {
        this.logEntry = logEntry;
    }
}
