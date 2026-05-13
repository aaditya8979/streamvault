package com.vungle.ads.internal.downloader;

import bn.g;
import bo.a0;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.C3978d4;
import com.safedk.android.internal.partials.LiftoffMonetizeNetworkBridge;
import com.unity3d.services.core.di.ServiceProvider;
import com.vungle.ads.NoSpaceError;
import com.vungle.ads.OutOfMemory;
import com.vungle.ads.internal.ConfigManager;
import com.vungle.ads.internal.downloader.AssetDownloadListener;
import com.vungle.ads.internal.downloader.AssetDownloader;
import com.vungle.ads.internal.executor.VungleThreadPoolExecutor;
import com.vungle.ads.internal.presenter.NativeAdPresenter;
import com.vungle.ads.internal.task.PriorityRunnable;
import com.vungle.ads.internal.ui.AdActivity;
import com.vungle.ads.internal.util.Logger;
import com.vungle.ads.internal.util.PathProvider;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.b;
import okhttp3.Cache;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.http.RealResponseBody;
import okio.GzipSource;
import okio.Okio;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: AssetDownloader.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0007\u0018\u0000 -2\u00020\u0001:\u0002-.B\u0017\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b+\u0010,J$\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002J\u001a\u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002J\"\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004H\u0002J\"\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\u0010\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001c\u0010\u0018\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010\u001a\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u001b\u001a\u00020\bH\u0016R\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001b\u0010'\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006/"}, d2 = {"Lcom/vungle/ads/internal/downloader/AssetDownloader;", "Lcom/vungle/ads/internal/downloader/Downloader;", "Lcom/vungle/ads/internal/downloader/DownloadRequest;", "downloadRequest", "Lcom/vungle/ads/internal/downloader/AssetDownloadListener;", "downloadListener", "Lcom/vungle/ads/internal/downloader/AssetDownloadListener$DownloadError;", "downloadError", "Lbn/r;", "deliverError", "launchRequest", "Lokhttp3/Response;", "networkResponse", "Lokhttp3/ResponseBody;", "decodeGzipIfNeeded", "Ljava/io/File;", C3978d4.i.f31327b, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "deliverSuccess", "Lcom/vungle/ads/internal/downloader/AssetDownloadListener$Progress;", "progress", "onProgressChanged", "", "checkSpaceAvailable", NativeAdPresenter.DOWNLOAD, AdActivity.REQUEST_KEY_EXTRA, "cancel", "cancelAll", "Lcom/vungle/ads/internal/executor/VungleThreadPoolExecutor;", "downloadExecutor", "Lcom/vungle/ads/internal/executor/VungleThreadPoolExecutor;", "Lcom/vungle/ads/internal/util/PathProvider;", "pathProvider", "Lcom/vungle/ads/internal/util/PathProvider;", "Lokhttp3/OkHttpClient;", "okHttpClient$delegate", "Lbn/g;", "getOkHttpClient", "()Lokhttp3/OkHttpClient;", "okHttpClient", "", "transitioning", "Ljava/util/List;", "<init>", "(Lcom/vungle/ads/internal/executor/VungleThreadPoolExecutor;Lcom/vungle/ads/internal/util/PathProvider;)V", VastTagName.COMPANION, "OkHttpSingleton", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
public final class AssetDownloader implements Downloader {

    @NotNull
    private static final String CONTENT_ENCODING = "Content-Encoding";

    @NotNull
    private static final String CONTENT_TYPE = "Content-Type";
    private static final int DOWNLOAD_CHUNK_SIZE = 2048;

    @NotNull
    private static final String GZIP = "gzip";
    private static final int MAX_PERCENT = 100;
    private static final int MINIMUM_SPACE_REQUIRED_MB = 20971520;
    private static final int PROGRESS_STEP = 1;

    @NotNull
    private static final String TAG = "AssetDownloader";

    @NotNull
    private final VungleThreadPoolExecutor downloadExecutor;

    /* JADX INFO: renamed from: okHttpClient$delegate, reason: from kotlin metadata */
    @NotNull
    private final g okHttpClient;

    @NotNull
    private final PathProvider pathProvider;

    @NotNull
    private final List<DownloadRequest> transitioning;

    /* JADX INFO: compiled from: AssetDownloader.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/vungle/ads/internal/downloader/AssetDownloader$OkHttpSingleton;", "", "()V", "client", "Lokhttp3/OkHttpClient;", "createOkHttpClient", "pathProvider", "Lcom/vungle/ads/internal/util/PathProvider;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class OkHttpSingleton {

        @NotNull
        public static final OkHttpSingleton INSTANCE = new OkHttpSingleton();

        @Nullable
        private static OkHttpClient client;

        private OkHttpSingleton() {
        }

        @NotNull
        public final OkHttpClient createOkHttpClient(@NotNull PathProvider pathProvider) {
            p.k(pathProvider, "pathProvider");
            OkHttpClient okHttpClient = client;
            if (okHttpClient != null) {
                return okHttpClient;
            }
            OkHttpClient.Builder builder = new OkHttpClient.Builder();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            OkHttpClient.Builder builderFollowSslRedirects = builder.readTimeout(60L, timeUnit).connectTimeout(60L, timeUnit).cache(null).followRedirects(true).followSslRedirects(true);
            ConfigManager configManager = ConfigManager.INSTANCE;
            if (configManager.isCleverCacheEnabled()) {
                long cleverCacheDiskSize = configManager.getCleverCacheDiskSize();
                int cleverCacheDiskPercentage = configManager.getCleverCacheDiskPercentage();
                String absolutePath = pathProvider.getCleverCacheDir().getAbsolutePath();
                p.j(absolutePath, "pathProvider.getCleverCacheDir().absolutePath");
                long jMin = Math.min(cleverCacheDiskSize, (pathProvider.getAvailableBytes(absolutePath) * ((long) cleverCacheDiskPercentage)) / ((long) 100));
                if (jMin > 0) {
                    builderFollowSslRedirects.cache(new Cache(pathProvider.getCleverCacheDir(), jMin));
                } else {
                    Logger.INSTANCE.w("OkHttpClientWrapper", "cache disk capacity size <=0, no clever cache active.");
                }
            }
            OkHttpClient okHttpClientBuild = builderFollowSslRedirects.build();
            client = okHttpClientBuild;
            return okHttpClientBuild;
        }
    }

    public AssetDownloader(@NotNull VungleThreadPoolExecutor vungleThreadPoolExecutor, @NotNull PathProvider pathProvider) {
        p.k(vungleThreadPoolExecutor, "downloadExecutor");
        p.k(pathProvider, "pathProvider");
        this.downloadExecutor = vungleThreadPoolExecutor;
        this.pathProvider = pathProvider;
        this.okHttpClient = b.b(new sn.a<OkHttpClient>() { // from class: com.vungle.ads.internal.downloader.AssetDownloader$okHttpClient$2
            {
                super(0);
            }

            @Override // sn.a
            @NotNull
            public final OkHttpClient invoke() {
                return AssetDownloader.OkHttpSingleton.INSTANCE.createOkHttpClient(this.this$0.pathProvider);
            }
        });
        this.transitioning = new ArrayList();
    }

    private final boolean checkSpaceAvailable(DownloadRequest downloadRequest) {
        PathProvider pathProvider = this.pathProvider;
        String absolutePath = pathProvider.getVungleDir().getAbsolutePath();
        p.j(absolutePath, "pathProvider.getVungleDir().absolutePath");
        long availableBytes = pathProvider.getAvailableBytes(absolutePath);
        if (availableBytes >= ServiceProvider.HTTP_CACHE_DISK_SIZE) {
            return true;
        }
        new NoSpaceError("Insufficient space " + availableBytes).setLogEntry$vungle_ads_release(downloadRequest.getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
        return false;
    }

    private final ResponseBody decodeGzipIfNeeded(Response networkResponse) {
        ResponseBody responseBodyOkhttp3Response_body = LiftoffMonetizeNetworkBridge.okhttp3Response_body(networkResponse);
        if (!a0.J(GZIP, Response.header$default(networkResponse, CONTENT_ENCODING, null, 2, null), true) || responseBodyOkhttp3Response_body == null) {
            return responseBodyOkhttp3Response_body;
        }
        return new RealResponseBody(Response.header$default(networkResponse, "Content-Type", null, 2, null), -1L, Okio.buffer(new GzipSource(LiftoffMonetizeNetworkBridge.retrofitExceptionCatchingRequestBody_source(responseBodyOkhttp3Response_body))));
    }

    private final void deliverError(DownloadRequest downloadRequest, AssetDownloadListener assetDownloadListener, AssetDownloadListener.DownloadError downloadError) {
        if (assetDownloadListener != null) {
            assetDownloadListener.onError(downloadError, downloadRequest);
        }
    }

    private final void deliverSuccess(File file, DownloadRequest downloadRequest, AssetDownloadListener assetDownloadListener) {
        Logger.INSTANCE.d(TAG, "On success " + downloadRequest);
        if (assetDownloadListener != null) {
            assetDownloadListener.onSuccess(file, downloadRequest);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: download$lambda-0, reason: not valid java name */
    public static final void m7309download$lambda0(DownloadRequest downloadRequest, AssetDownloader assetDownloader, AssetDownloadListener assetDownloadListener) {
        p.k(assetDownloader, "this$0");
        assetDownloader.deliverError(downloadRequest, assetDownloadListener, new AssetDownloadListener.DownloadError(-1, new OutOfMemory("Failed to execute download request: " + downloadRequest.getAsset().getServerPath()), AssetDownloadListener.DownloadError.ErrorReason.INSTANCE.getINTERNAL_ERROR()));
    }

    private final OkHttpClient getOkHttpClient() {
        return (OkHttpClient) this.okHttpClient.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0247, code lost:
    
        r7.setStatus(com.vungle.ads.internal.downloader.AssetDownloadListener.Progress.ProgressStatus.INSTANCE.getCANCELLED());
     */
    /* JADX WARN: Removed duplicated region for block: B:219:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0537  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x053c  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x053f  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x054c  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x057c  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0587  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x058b  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x05ac  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x05b1  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x05b4  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x05c1  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x05f2  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x05f4  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x05fe  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x061e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0150 A[Catch: Exception -> 0x04c8, all -> 0x04d5, TRY_LEAVE, TryCatch #36 {all -> 0x04d5, blocks: (B:41:0x0146, B:42:0x014a, B:44:0x0150, B:56:0x018d), top: B:312:0x0146 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void launchRequest(com.vungle.ads.internal.downloader.DownloadRequest r30, com.vungle.ads.internal.downloader.AssetDownloadListener r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1622
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.ads.internal.downloader.AssetDownloader.launchRequest(com.vungle.ads.internal.downloader.DownloadRequest, com.vungle.ads.internal.downloader.AssetDownloadListener):void");
    }

    private final void onProgressChanged(DownloadRequest downloadRequest, AssetDownloadListener.Progress progress, AssetDownloadListener assetDownloadListener) {
        if (assetDownloadListener != null) {
            assetDownloadListener.onProgress(progress, downloadRequest);
        }
    }

    @Override // com.vungle.ads.internal.downloader.Downloader
    public void cancel(@Nullable DownloadRequest downloadRequest) {
        if (downloadRequest == null || downloadRequest.isCancelled()) {
            return;
        }
        downloadRequest.cancel();
    }

    @Override // com.vungle.ads.internal.downloader.Downloader
    public void cancelAll() {
        Iterator<T> it = this.transitioning.iterator();
        while (it.hasNext()) {
            cancel((DownloadRequest) it.next());
        }
        this.transitioning.clear();
    }

    @Override // com.vungle.ads.internal.downloader.Downloader
    public void download(@Nullable final DownloadRequest downloadRequest, @Nullable final AssetDownloadListener assetDownloadListener) {
        if (downloadRequest == null) {
            return;
        }
        this.transitioning.add(downloadRequest);
        this.downloadExecutor.execute(new PriorityRunnable() { // from class: com.vungle.ads.internal.downloader.AssetDownloader.download.1
            @Override // com.vungle.ads.internal.task.PriorityRunnable
            public int getPriority() {
                return downloadRequest.getPriority();
            }

            @Override // java.lang.Runnable
            public void run() throws Throwable {
                AssetDownloader.this.launchRequest(downloadRequest, assetDownloadListener);
            }
        }, new Runnable() { // from class: com.vungle.ads.internal.downloader.a
            @Override // java.lang.Runnable
            public final void run() {
                AssetDownloader.m7309download$lambda0(downloadRequest, this, assetDownloadListener);
            }
        });
    }
}
