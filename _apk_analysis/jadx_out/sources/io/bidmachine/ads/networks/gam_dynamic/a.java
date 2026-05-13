package io.bidmachine.ads.networks.gam_dynamic;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.explorestack.protobuf.StringValue;
import com.explorestack.protobuf.Struct;
import com.explorestack.protobuf.UInt32Value;
import com.explorestack.protobuf.UInt64Value;
import io.bidmachine.AdsFormat;
import io.bidmachine.ads.networks.gam_dynamic.WaterfallLoader;
import io.bidmachine.ads.networks.gam_dynamic.WaterfallNetworkRequest;
import io.bidmachine.ads.networks.gam_dynamic.versions.VersionWrapper;
import io.bidmachine.core.Logger;
import io.bidmachine.core.Utils;
import io.bidmachine.protobuf.Waterfall;
import io.bidmachine.util.taskmanager.TaskManager;
import io.bidmachine.util.taskmanager.coroutine.NetworkTaskManager;
import io.bidmachine.utils.BMError;
import io.bidmachine.utils.Tag;
import io.bidmachine.utils.lazy.LazyValue;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import uh.g;
import uh.j;
import uh.o;

/* JADX INFO: compiled from: WaterfallController.java */
/* JADX INFO: loaded from: classes11.dex */
public class a {

    @NonNull
    private static final TaskManager TASK_MANAGER = new NetworkTaskManager();

    @NonNull
    @VisibleForTesting
    public final AdsFormat adsFormat;

    @NonNull
    private final Context applicationContext;

    @VisibleForTesting
    public int cacheSize;

    @NonNull
    private final g gamAdManager;

    @NonNull
    private final j gamEventTracker;

    @NonNull
    private final o gamNetwork;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @Nullable
    @VisibleForTesting
    public String f68604id;

    @VisibleForTesting
    public int maxRetryDegree;

    @NonNull
    private final NetworkParams networkParams;

    @VisibleForTesting
    public long refreshTimeOutMs;

    @Nullable
    @VisibleForTesting
    public String refreshUrl;

    @VisibleForTesting
    public int retryBaseSec;

    @Nullable
    @VisibleForTesting
    public StringValue serverParams;

    @NonNull
    private final Tag tag;

    @NonNull
    private final TaskExecutor taskExecutor;

    @NonNull
    private final VersionWrapper versionWrapper;

    @Nullable
    @VisibleForTesting
    public WaterfallLoader waterfallLoader;

    @NonNull
    @VisibleForTesting
    public final List<Waterfall.Configuration.AdUnit> adUnitList = new LinkedList();

    @NonNull
    @VisibleForTesting
    public final AtomicBoolean isLoading = new AtomicBoolean(false);

    @NonNull
    @VisibleForTesting
    public final AtomicBoolean isPolling = new AtomicBoolean(false);

    @NonNull
    @VisibleForTesting
    public final AtomicBoolean isShouldPollAfter = new AtomicBoolean(false);

    @NonNull
    @VisibleForTesting
    public final AtomicInteger failedWaterfallLoadAttempts = new AtomicInteger(0);

    /* JADX INFO: renamed from: io.bidmachine.ads.networks.gam_dynamic.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: WaterfallController.java */
    @VisibleForTesting
    public class C0794a implements WaterfallNetworkRequest.Callback {
        public C0794a() {
        }

        @Override // io.bidmachine.ads.networks.gam_dynamic.WaterfallNetworkRequest.Callback, io.bidmachine.core.NetworkRequest.CancelCallback
        public void onCanceled() {
            a.this.onWaterfallRequestFail("Request is canceled");
        }

        @Override // io.bidmachine.ads.networks.gam_dynamic.WaterfallNetworkRequest.Callback, io.bidmachine.core.NetworkRequest.Callback
        public void onFail(@Nullable BMError bMError) {
            a.this.onWaterfallRequestFail(bMError != null ? bMError.getMessage() : "Unknown");
        }

        @Override // io.bidmachine.ads.networks.gam_dynamic.WaterfallNetworkRequest.Callback, io.bidmachine.core.NetworkRequest.Callback
        public void onSuccess(@Nullable Waterfall.Configuration configuration) {
            if (configuration != null) {
                a.this.onWaterfallRequestSuccess(configuration);
            } else {
                a.this.onWaterfallRequestFail("Configuration response is null");
            }
        }
    }

    /* JADX INFO: compiled from: WaterfallController.java */
    @VisibleForTesting
    public class b implements WaterfallLoader.Listener {

        @NonNull
        @VisibleForTesting
        public final AtomicBoolean isAdLoaded = new AtomicBoolean(false);

        public b() {
        }

        @Override // io.bidmachine.ads.networks.gam_dynamic.WaterfallLoader.Listener
        public void onAdLoaded() {
            this.isAdLoaded.set(true);
            a.this.failedWaterfallLoadAttempts.set(0);
        }

        @Override // io.bidmachine.ads.networks.gam_dynamic.WaterfallLoader.Listener
        public void onWaterfallLoadCompleted(@NonNull Queue<Waterfall.Result.AdUnit> queue) {
            a.this.isPolling.set(false);
            if (!this.isAdLoaded.get()) {
                a.this.failedWaterfallLoadAttempts.incrementAndGet();
            }
            a.this.requestNextWaterfall(queue);
        }
    }

    public a(@NonNull Context context, @NonNull NetworkParams networkParams, @NonNull AdsFormat adsFormat, @NonNull Waterfall.Configuration configuration, @NonNull VersionWrapper versionWrapper, @NonNull o oVar, @NonNull g gVar, @NonNull j jVar, @NonNull TaskExecutor taskExecutor) {
        this.tag = new Tag(networkParams.getNetworkName() + "WaterfallController");
        this.applicationContext = context.getApplicationContext();
        this.networkParams = networkParams;
        this.adsFormat = adsFormat;
        this.versionWrapper = versionWrapper;
        this.gamNetwork = oVar;
        this.gamAdManager = gVar;
        this.taskExecutor = taskExecutor;
        this.gamEventTracker = jVar;
        setWaterfallConfiguration(configuration);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String lambda$loadWaterfall$0(long j10) {
        return String.format("(%s) Execution waterfall load started after - %s ms (failedAttempts - %s, maxRetryDegree - %s, retryBase - %s sec)", this.adsFormat, Long.valueOf(j10), Integer.valueOf(this.failedWaterfallLoadAttempts.get()), Integer.valueOf(this.maxRetryDegree), Integer.valueOf(this.retryBaseSec));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String lambda$loadWaterfall$1() {
        return String.format("(%s) Fail to start loading waterfall", this.adsFormat);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String lambda$onWaterfallRequestFail$4(String str) {
        return String.format("(%s) onWaterfallRequestFail - %s", this.adsFormat, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String lambda$onWaterfallRequestSuccess$3() {
        return String.format("(%s) onWaterfallRequestSuccess", this.adsFormat);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String lambda$processLoadCompleted$5() {
        return String.format("(%s) Loading completed", this.adsFormat);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String lambda$requestNextWaterfall$2() {
        return String.format("(%s) Request next waterfall", this.adsFormat);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$sortDescByPrice$6(Waterfall.Configuration.AdUnit adUnit, Waterfall.Configuration.AdUnit adUnit2) {
        return -Double.compare(adUnit.getPrice(), adUnit2.getPrice());
    }

    @VisibleForTesting
    public long calculateLoadingDelayMs() {
        return (long) (Math.pow(this.retryBaseSec, Math.min(this.failedWaterfallLoadAttempts.get(), this.maxRetryDegree)) * 1000.0d);
    }

    @VisibleForTesting
    public void clearWaterfall() {
        this.waterfallLoader = null;
    }

    public void load(boolean z10) {
        if (this.isLoading.compareAndSet(false, true)) {
            this.isPolling.set(true);
            this.failedWaterfallLoadAttempts.set(0);
            loadWaterfall();
        } else {
            if (!z10 || this.isPolling.get()) {
                return;
            }
            this.isShouldPollAfter.set(true);
        }
    }

    @VisibleForTesting
    public void loadWaterfall() {
        this.isShouldPollAfter.set(false);
        this.waterfallLoader = new WaterfallLoader(this.applicationContext, this.networkParams, this.adsFormat, this.versionWrapper, this.gamNetwork, this.gamAdManager, this.gamEventTracker, this.taskExecutor, this.f68604id, this.adUnitList, this.cacheSize, new b());
        final long jCalculateLoadingDelayMs = calculateLoadingDelayMs();
        Logger.d(this.tag, (LazyValue<String>) new LazyValue() { // from class: uh.j0
            @Override // io.bidmachine.utils.lazy.LazyValue
            public final Object get() {
                return this.f85676a.lambda$loadWaterfall$0(jCalculateLoadingDelayMs);
            }
        });
        if (this.taskExecutor.execute(this.waterfallLoader, jCalculateLoadingDelayMs)) {
            return;
        }
        Logger.d(this.tag, (LazyValue<String>) new LazyValue() { // from class: uh.k0
            @Override // io.bidmachine.utils.lazy.LazyValue
            public final Object get() {
                return this.f85678a.lambda$loadWaterfall$1();
            }
        });
        processLoadCompleted();
    }

    @VisibleForTesting
    public void onWaterfallRequestFail(@NonNull final String str) {
        Logger.d(this.tag, (LazyValue<String>) new LazyValue() { // from class: uh.p0
            @Override // io.bidmachine.utils.lazy.LazyValue
            public final Object get() {
                return this.f85683a.lambda$onWaterfallRequestFail$4(str);
            }
        });
        loadWaterfall();
    }

    @VisibleForTesting
    public void onWaterfallRequestSuccess(@NonNull Waterfall.Configuration configuration) {
        Logger.d(this.tag, (LazyValue<String>) new LazyValue() { // from class: uh.m0
            @Override // io.bidmachine.utils.lazy.LazyValue
            public final Object get() {
                return this.f85679a.lambda$onWaterfallRequestSuccess$3();
            }
        });
        setWaterfallConfiguration(configuration);
        if (this.isShouldPollAfter.get() || !configuration.getShouldBreak()) {
            loadWaterfall();
        } else {
            processLoadCompleted();
        }
    }

    @VisibleForTesting
    public void processLoadCompleted() {
        Logger.d(this.tag, (LazyValue<String>) new LazyValue() { // from class: uh.n0
            @Override // io.bidmachine.utils.lazy.LazyValue
            public final Object get() {
                return this.f85680a.lambda$processLoadCompleted$5();
            }
        });
        clearWaterfall();
        this.isLoading.set(false);
    }

    @VisibleForTesting
    public void requestNextWaterfall(@NonNull Queue<Waterfall.Result.AdUnit> queue) {
        Logger.d(this.tag, (LazyValue<String>) new LazyValue() { // from class: uh.o0
            @Override // io.bidmachine.utils.lazy.LazyValue
            public final Object get() {
                return this.f85681a.lambda$requestNextWaterfall$2();
            }
        });
        if (TextUtils.isEmpty(this.refreshUrl) || !Utils.isHttpUrl(this.refreshUrl)) {
            onWaterfallRequestFail("Request next waterfall failed (refreshUrl is null or empty or incorrect)");
            return;
        }
        Waterfall.Result.Builder builderAddAllAdUnitResults = Waterfall.Result.newBuilder().setFormat(StringValue.newBuilder().setValue(this.adsFormat.getRemoteName()).build()).addAllAdUnitResults(queue);
        String str = this.f68604id;
        if (str != null) {
            builderAddAllAdUnitResults.setWaterfallId(str);
        }
        List<Waterfall.Result.CachedAdUnit> cachedAdUnitList = this.gamAdManager.getCachedAdUnitList(this.adsFormat);
        if (cachedAdUnitList != null && !cachedAdUnitList.isEmpty()) {
            builderAddAllAdUnitResults.addAllCachedAdUnits(cachedAdUnitList);
        }
        Struct ext = this.networkParams.getExt(this.applicationContext);
        if (ext != null) {
            builderAddAllAdUnitResults.setExt(ext);
        }
        StringValue stringValue = this.serverParams;
        if (stringValue != null) {
            builderAddAllAdUnitResults.setServerParams(stringValue);
        }
        C0794a c0794a = new C0794a();
        WaterfallNetworkRequest waterfallNetworkRequest = new WaterfallNetworkRequest(this.refreshUrl, builderAddAllAdUnitResults.build(), (int) this.refreshTimeOutMs);
        waterfallNetworkRequest.setCallback(c0794a);
        waterfallNetworkRequest.setCancelCallback(c0794a);
        waterfallNetworkRequest.request(TASK_MANAGER);
    }

    @VisibleForTesting
    public void setWaterfallConfiguration(@NonNull Waterfall.Configuration configuration) {
        this.f68604id = configuration.getId();
        this.adUnitList.clear();
        List<Waterfall.Configuration.AdUnit> adUnitsList = configuration.getAdUnitsList();
        if (adUnitsList != null && !adUnitsList.isEmpty()) {
            this.adUnitList.addAll(adUnitsList);
            sortDescByPrice(this.adUnitList);
        }
        StringValue refreshUrl = configuration.hasRefreshUrl() ? configuration.getRefreshUrl() : null;
        if (refreshUrl != null) {
            String value = refreshUrl.getValue();
            if (!TextUtils.isEmpty(value) && Utils.isHttpUrl(value)) {
                this.refreshUrl = refreshUrl.getValue();
            }
        }
        UInt32Value cacheSize = configuration.hasCacheSize() ? configuration.getCacheSize() : null;
        this.cacheSize = cacheSize != null ? cacheSize.getValue() : 1;
        UInt32Value retryBase = configuration.hasRetryBase() ? configuration.getRetryBase() : null;
        this.retryBaseSec = retryBase != null ? retryBase.getValue() : 2;
        UInt32Value maxRetryDegree = configuration.hasMaxRetryDegree() ? configuration.getMaxRetryDegree() : null;
        this.maxRetryDegree = maxRetryDegree != null ? maxRetryDegree.getValue() : 5;
        UInt64Value refreshTimeout = configuration.hasRefreshTimeout() ? configuration.getRefreshTimeout() : null;
        this.refreshTimeOutMs = refreshTimeout != null ? refreshTimeout.getValue() : 10000L;
        this.serverParams = configuration.hasServerParams() ? configuration.getServerParams() : null;
    }

    @VisibleForTesting
    public void sortDescByPrice(@NonNull List<Waterfall.Configuration.AdUnit> list) {
        Collections.sort(list, new Comparator() { // from class: uh.l0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return io.bidmachine.ads.networks.gam_dynamic.a.lambda$sortDescByPrice$6((Waterfall.Configuration.AdUnit) obj, (Waterfall.Configuration.AdUnit) obj2);
            }
        });
    }
}
