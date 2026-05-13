package com.unity3d.services.core.di;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.datastore.core.DataMigration;
import androidx.datastore.core.DataStore;
import androidx.datastore.core.DataStoreFactory;
import bn.r;
import cn.v;
import com.unity3d.ads.core.data.datasource.AndroidByteStringDataSource;
import com.unity3d.ads.core.data.datasource.ByteStringDataSource;
import com.unity3d.ads.core.data.model.ByteStringSerializer;
import com.unity3d.ads.core.data.model.WebViewConfigurationStoreSerializer;
import com.unity3d.ads.core.data.repository.DiagnosticEventRepository;
import com.unity3d.ads.core.extensions.ContextExtensionsKt;
import com.unity3d.ads.datastore.ByteStringStoreOuterClass;
import com.unity3d.ads.datastore.WebviewConfigurationStore;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.ads.measurements.MeasurementsService;
import com.unity3d.services.ads.token.AsyncTokenStorage;
import com.unity3d.services.ads.token.InMemoryAsyncTokenStorage;
import com.unity3d.services.ads.token.TokenStorage;
import com.unity3d.services.ads.topics.TopicsService;
import com.unity3d.services.core.device.Storage;
import com.unity3d.services.core.device.StorageManager;
import com.unity3d.services.core.device.VolumeChange;
import com.unity3d.services.core.device.VolumeChangeMonitor;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.domain.SDKDispatchers;
import com.unity3d.services.core.misc.JsonStorage;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.request.metrics.SDKMetrics;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import com.unity3d.services.core.webview.bridge.SharedInstances;
import gatewayprotocol.v1.AdOperationsConfigurationKt;
import gatewayprotocol.v1.DiagnosticEventsConfigurationKt;
import gatewayprotocol.v1.FeatureFlagsKt;
import gatewayprotocol.v1.NativeConfigurationKt;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import gatewayprotocol.v1.RequestPolicyKt;
import gatewayprotocol.v1.RequestRetryPolicyKt;
import gatewayprotocol.v1.RequestTimeoutPolicyKt;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.io.File;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.d;
import kotlinx.coroutines.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.h0;
import p000do.i0;
import p000do.j2;
import p000do.k0;
import p000do.l0;
import p000do.w;
import p000do.w0;
import sn.a;
import sn.l;
import tn.p;

/* JADX INFO: compiled from: UnityAdsModule.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class UnityAdsModule {
    private final NativeConfigurationOuterClass.AdOperationsConfiguration getDefaultAdOperations() {
        AdOperationsConfigurationKt.Dsl.Companion companion = AdOperationsConfigurationKt.Dsl.Companion;
        NativeConfigurationOuterClass.AdOperationsConfiguration.Builder builderNewBuilder = NativeConfigurationOuterClass.AdOperationsConfiguration.newBuilder();
        p.j(builderNewBuilder, "newBuilder()");
        AdOperationsConfigurationKt.Dsl dsl_create = companion._create(builderNewBuilder);
        dsl_create.setLoadTimeoutMs(30000);
        dsl_create.setShowTimeoutMs(10000);
        dsl_create.setGetTokenTimeoutMs(UnityAdsConstants.AdOperations.GET_TOKEN_TIMEOUT_MS);
        return dsl_create._build();
    }

    private final NativeConfigurationOuterClass.RequestPolicy getDefaultRequestPolicy() {
        RequestPolicyKt.Dsl.Companion companion = RequestPolicyKt.Dsl.Companion;
        NativeConfigurationOuterClass.RequestPolicy.Builder builderNewBuilder = NativeConfigurationOuterClass.RequestPolicy.newBuilder();
        p.j(builderNewBuilder, "newBuilder()");
        RequestPolicyKt.Dsl dsl_create = companion._create(builderNewBuilder);
        dsl_create.setRetryPolicy(getDefaultRequestRetryPolicy());
        dsl_create.setTimeoutPolicy(getDefaultRequestTimeoutPolicy());
        return dsl_create._build();
    }

    private final NativeConfigurationOuterClass.RequestRetryPolicy getDefaultRequestRetryPolicy() {
        RequestRetryPolicyKt.Dsl.Companion companion = RequestRetryPolicyKt.Dsl.Companion;
        NativeConfigurationOuterClass.RequestRetryPolicy.Builder builderNewBuilder = NativeConfigurationOuterClass.RequestRetryPolicy.newBuilder();
        p.j(builderNewBuilder, "newBuilder()");
        RequestRetryPolicyKt.Dsl dsl_create = companion._create(builderNewBuilder);
        dsl_create.setMaxDuration(120000);
        dsl_create.setRetryWaitBase(500);
        dsl_create.setRetryJitterPct(0.1f);
        dsl_create.setShouldStoreLocally(false);
        dsl_create.setRetryMaxInterval(2500);
        dsl_create.setRetryScalingFactor(2.0f);
        return dsl_create._build();
    }

    private final NativeConfigurationOuterClass.RequestTimeoutPolicy getDefaultRequestTimeoutPolicy() {
        RequestTimeoutPolicyKt.Dsl.Companion companion = RequestTimeoutPolicyKt.Dsl.Companion;
        NativeConfigurationOuterClass.RequestTimeoutPolicy.Builder builderNewBuilder = NativeConfigurationOuterClass.RequestTimeoutPolicy.newBuilder();
        p.j(builderNewBuilder, "newBuilder()");
        RequestTimeoutPolicyKt.Dsl dsl_create = companion._create(builderNewBuilder);
        dsl_create.setConnectTimeoutMs(30000);
        dsl_create.setReadTimeoutMs(30000);
        dsl_create.setWriteTimeoutMs(30000);
        dsl_create.setOverallTimeoutMs(30000);
        return dsl_create._build();
    }

    private final ByteStringDataSource provideByteStringDataSource(DataStore<ByteStringStoreOuterClass.ByteStringStore> dataStore) {
        return new AndroidByteStringDataSource(dataStore);
    }

    private final DataStore<ByteStringStoreOuterClass.ByteStringStore> provideByteStringDataStore(final Context context, h0 h0Var, final String str) {
        return DataStoreFactory.create$default(DataStoreFactory.INSTANCE, new ByteStringSerializer(), null, null, d.a(h0Var.plus(j2.b(null, 1, null))), new a<File>() { // from class: com.unity3d.services.core.di.UnityAdsModule.provideByteStringDataStore.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.a
            @NotNull
            public final File invoke() {
                return ContextExtensionsKt.unityAdsDataStoreFile(context, str);
            }
        }, 4, null);
    }

    private final JsonStorage provideJsonStorage(StorageManager.StorageType storageType) {
        if (!StorageManager.init(ClientProperties.getApplicationContext())) {
            throw new IllegalStateException("StorageManager failed to initialize".toString());
        }
        Storage storage = StorageManager.getStorage(storageType);
        p.j(storage, "getStorage(storageType)");
        return storage;
    }

    @NotNull
    public final Context androidContext() {
        Context applicationContext = ClientProperties.getApplicationContext();
        p.j(applicationContext, "getApplicationContext()");
        return applicationContext;
    }

    @NotNull
    public final AsyncTokenStorage asyncTokenStorage(@NotNull TokenStorage tokenStorage, @NotNull SDKMetricsSender sDKMetricsSender) {
        p.k(tokenStorage, "tokenStorage");
        p.k(sDKMetricsSender, "sdkMetricsSender");
        return new InMemoryAsyncTokenStorage(null, new Handler(Looper.getMainLooper()), sDKMetricsSender, tokenStorage);
    }

    @NotNull
    public final ByteStringDataSource auidDataStore(@NotNull DataStore<ByteStringStoreOuterClass.ByteStringStore> dataStore) {
        p.k(dataStore, "dataStore");
        return provideByteStringDataSource(dataStore);
    }

    @NotNull
    public final h0 defaultDispatcher() {
        return w0.a();
    }

    @NotNull
    public final NativeConfigurationOuterClass.NativeConfiguration defaultNativeConfiguration() {
        NativeConfigurationKt.Dsl.Companion companion = NativeConfigurationKt.Dsl.Companion;
        NativeConfigurationOuterClass.NativeConfiguration.Builder builderNewBuilder = NativeConfigurationOuterClass.NativeConfiguration.newBuilder();
        p.j(builderNewBuilder, "newBuilder()");
        NativeConfigurationKt.Dsl dsl_create = companion._create(builderNewBuilder);
        dsl_create.setAdOperations(getDefaultAdOperations());
        dsl_create.setInitPolicy(getDefaultRequestPolicy());
        dsl_create.setAdPolicy(getDefaultRequestPolicy());
        dsl_create.setOtherPolicy(getDefaultRequestPolicy());
        dsl_create.setOperativeEventPolicy(getDefaultRequestPolicy());
        DiagnosticEventsConfigurationKt.Dsl.Companion companion2 = DiagnosticEventsConfigurationKt.Dsl.Companion;
        NativeConfigurationOuterClass.DiagnosticEventsConfiguration.Builder builderNewBuilder2 = NativeConfigurationOuterClass.DiagnosticEventsConfiguration.newBuilder();
        p.j(builderNewBuilder2, "newBuilder()");
        DiagnosticEventsConfigurationKt.Dsl dsl_create2 = companion2._create(builderNewBuilder2);
        dsl_create2.setEnabled(true);
        dsl_create2.setMaxBatchSize(10);
        dsl_create2.setMaxBatchIntervalMs(30000);
        dsl_create2.setTtmEnabled(false);
        dsl_create.setDiagnosticEvents(dsl_create2._build());
        FeatureFlagsKt.Dsl.Companion companion3 = FeatureFlagsKt.Dsl.Companion;
        NativeConfigurationOuterClass.FeatureFlags.Builder builderNewBuilder3 = NativeConfigurationOuterClass.FeatureFlags.newBuilder();
        p.j(builderNewBuilder3, "newBuilder()");
        FeatureFlagsKt.Dsl dsl_create3 = companion3._create(builderNewBuilder3);
        dsl_create3.setBoldSdkNextSessionEnabled(true);
        dsl_create.setFeatureFlags(dsl_create3._build());
        return dsl_create._build();
    }

    @NotNull
    public final ByteStringDataSource gatewayCacheDataStore(@NotNull DataStore<ByteStringStoreOuterClass.ByteStringStore> dataStore) {
        p.k(dataStore, "dataStore");
        return provideByteStringDataSource(dataStore);
    }

    @NotNull
    public final DataStore<ByteStringStoreOuterClass.ByteStringStore> gatewayDataStore(@NotNull Context context, @NotNull h0 h0Var) {
        p.k(context, GAMConfig.KEY_CONTEXT);
        p.k(h0Var, "dispatcher");
        return provideByteStringDataStore(context, h0Var, ServiceProvider.DATA_STORE_GATEWAY_CACHE);
    }

    @NotNull
    public final l0 getTokenCoroutineScope(@NotNull ISDKDispatchers iSDKDispatchers, @NotNull i0 i0Var, @NotNull g gVar) {
        p.k(iSDKDispatchers, "dispatchers");
        p.k(i0Var, "errorHandler");
        p.k(gVar, "parentJob");
        return d.a(gVar.plus(iSDKDispatchers.getDefault()).plus(new k0(ServiceProvider.NAMED_GET_TOKEN_SCOPE)).plus(i0Var));
    }

    @NotNull
    public final DataStore<ByteStringStoreOuterClass.ByteStringStore> glInfoDataStore(@NotNull final Context context, @NotNull h0 h0Var, @NotNull DataMigration<ByteStringStoreOuterClass.ByteStringStore> dataMigration) {
        p.k(context, GAMConfig.KEY_CONTEXT);
        p.k(h0Var, "dispatcher");
        p.k(dataMigration, "fetchGLInfo");
        return DataStoreFactory.create$default(DataStoreFactory.INSTANCE, new ByteStringSerializer(), null, v.e(dataMigration), d.a(h0Var.plus(j2.b(null, 1, null))), new a<File>() { // from class: com.unity3d.services.core.di.UnityAdsModule.glInfoDataStore.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.a
            @NotNull
            public final File invoke() {
                return ContextExtensionsKt.unityAdsDataStoreFile(context, ServiceProvider.DATA_STORE_GL_INFO);
            }
        }, 2, null);
    }

    @NotNull
    public final ByteStringDataSource glInfoDataStore(@NotNull DataStore<ByteStringStoreOuterClass.ByteStringStore> dataStore) {
        p.k(dataStore, "dataStore");
        return provideByteStringDataSource(dataStore);
    }

    @NotNull
    public final DataStore<ByteStringStoreOuterClass.ByteStringStore> iapTransactionDataStore(@NotNull Context context, @NotNull h0 h0Var) {
        p.k(context, GAMConfig.KEY_CONTEXT);
        p.k(h0Var, "dispatcher");
        return provideByteStringDataStore(context, h0Var, ServiceProvider.DATA_STORE_IAP_TRANSACTION);
    }

    @NotNull
    public final ByteStringDataSource iapTransactionDataStore(@NotNull DataStore<ByteStringStoreOuterClass.ByteStringStore> dataStore) {
        p.k(dataStore, "dataStore");
        return provideByteStringDataSource(dataStore);
    }

    @NotNull
    public final ByteStringDataSource idfiDataStore(@NotNull DataStore<ByteStringStoreOuterClass.ByteStringStore> dataStore) {
        p.k(dataStore, "dataStore");
        return provideByteStringDataSource(dataStore);
    }

    @NotNull
    public final l0 initCoroutineScope(@NotNull ISDKDispatchers iSDKDispatchers, @NotNull i0 i0Var, @NotNull g gVar) {
        p.k(iSDKDispatchers, "dispatchers");
        p.k(i0Var, "errorHandler");
        p.k(gVar, "parentJob");
        return d.a(gVar.plus(iSDKDispatchers.getDefault()).plus(new k0(ServiceProvider.NAMED_INIT_SCOPE)).plus(i0Var));
    }

    @NotNull
    public final h0 ioDispatcher() {
        return w0.b();
    }

    @NotNull
    public final l0 loadCoroutineScope(@NotNull ISDKDispatchers iSDKDispatchers, @NotNull i0 i0Var, @NotNull g gVar) {
        p.k(iSDKDispatchers, "dispatchers");
        p.k(i0Var, "errorHandler");
        p.k(gVar, "parentJob");
        return d.a(gVar.plus(iSDKDispatchers.getDefault()).plus(new k0(ServiceProvider.NAMED_LOAD_SCOPE)).plus(i0Var));
    }

    @NotNull
    public final h0 mainDispatcher() {
        return w0.c();
    }

    @NotNull
    public final MeasurementsService measurementService(@NotNull Context context, @NotNull ISDKDispatchers iSDKDispatchers) {
        p.k(context, GAMConfig.KEY_CONTEXT);
        p.k(iSDKDispatchers, "dispatchers");
        return new MeasurementsService(context, iSDKDispatchers, SharedInstances.INSTANCE.getWebViewEventSender());
    }

    @NotNull
    public final JsonStorage memoryJsonStorage() {
        return provideJsonStorage(StorageManager.StorageType.MEMORY);
    }

    @NotNull
    public final DataStore<ByteStringStoreOuterClass.ByteStringStore> nativeConfigurationDataStore(@NotNull Context context, @NotNull h0 h0Var) {
        p.k(context, GAMConfig.KEY_CONTEXT);
        p.k(h0Var, "dispatcher");
        return provideByteStringDataStore(context, h0Var, ServiceProvider.DATA_STORE_NATIVE_CONFIG);
    }

    @NotNull
    public final ByteStringDataSource nativeConfigurationDataStore(@NotNull DataStore<ByteStringStoreOuterClass.ByteStringStore> dataStore) {
        p.k(dataStore, "dataStore");
        return provideByteStringDataSource(dataStore);
    }

    @NotNull
    public final l0 offerwallSignalsCoroutineScope(@NotNull ISDKDispatchers iSDKDispatchers, @NotNull i0 i0Var, @NotNull g gVar) {
        p.k(iSDKDispatchers, "dispatchers");
        p.k(i0Var, "errorHandler");
        p.k(gVar, "parentJob");
        return d.a(gVar.plus(iSDKDispatchers.getDefault()).plus(new k0(ServiceProvider.NAMED_OFFERWALL_SCOPE)).plus(i0Var));
    }

    @NotNull
    public final l0 omidCoroutineScope(@NotNull ISDKDispatchers iSDKDispatchers, @NotNull i0 i0Var, @NotNull g gVar) {
        p.k(iSDKDispatchers, "dispatchers");
        p.k(i0Var, "errorHandler");
        p.k(gVar, "parentJob");
        return d.a(gVar.plus(iSDKDispatchers.getDefault()).plus(new k0(ServiceProvider.NAMED_OMID_SCOPE)).plus(i0Var));
    }

    @NotNull
    public final DataStore<ByteStringStoreOuterClass.ByteStringStore> privacyDataStore(@NotNull Context context, @NotNull h0 h0Var) {
        p.k(context, GAMConfig.KEY_CONTEXT);
        p.k(h0Var, "dispatcher");
        return provideByteStringDataStore(context, h0Var, ServiceProvider.DATA_STORE_PRIVACY);
    }

    @NotNull
    public final ByteStringDataSource privacyDataStore(@NotNull DataStore<ByteStringStoreOuterClass.ByteStringStore> dataStore) {
        p.k(dataStore, "dataStore");
        return provideByteStringDataSource(dataStore);
    }

    @NotNull
    public final DataStore<ByteStringStoreOuterClass.ByteStringStore> privacyFsmDataStore(@NotNull Context context, @NotNull h0 h0Var) {
        p.k(context, GAMConfig.KEY_CONTEXT);
        p.k(h0Var, "dispatcher");
        return provideByteStringDataStore(context, h0Var, ServiceProvider.DATA_STORE_PRIVACY_FSM);
    }

    @NotNull
    public final ByteStringDataSource privacyFsmDataStore(@NotNull DataStore<ByteStringStoreOuterClass.ByteStringStore> dataStore) {
        p.k(dataStore, "dataStore");
        return provideByteStringDataSource(dataStore);
    }

    @NotNull
    public final JsonStorage privateJsonStorage() {
        return provideJsonStorage(StorageManager.StorageType.PRIVATE);
    }

    @NotNull
    public final g publicApiJob(@NotNull final DiagnosticEventRepository diagnosticEventRepository) {
        p.k(diagnosticEventRepository, "diagnosticEventRepository");
        w wVarB = JobKt__JobKt.b(null, 1, null);
        wVarB.f(new l<Throwable, r>() { // from class: com.unity3d.services.core.di.UnityAdsModule$publicApiJob$1$1
            {
                super(1);
            }

            @Override // sn.l
            public /* bridge */ /* synthetic */ r invoke(Throwable th2) {
                invoke2(th2);
                return r.f5635a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@Nullable Throwable th2) {
                diagnosticEventRepository.flush();
            }
        });
        return wVarB;
    }

    @NotNull
    public final JsonStorage publicJsonStorage() {
        return provideJsonStorage(StorageManager.StorageType.PUBLIC);
    }

    @NotNull
    public final l0 scarSignalsCoroutineScope(@NotNull ISDKDispatchers iSDKDispatchers, @NotNull i0 i0Var, @NotNull g gVar) {
        p.k(iSDKDispatchers, "dispatchers");
        p.k(i0Var, "errorHandler");
        p.k(gVar, "parentJob");
        return d.a(gVar.plus(iSDKDispatchers.getDefault()).plus(new k0(ServiceProvider.NAMED_SCAR_SCOPE)).plus(i0Var));
    }

    @NotNull
    public final ISDKDispatchers sdkDispatchers() {
        return new SDKDispatchers();
    }

    @NotNull
    public final SDKMetricsSender sdkMetrics() {
        SDKMetricsSender sDKMetrics = SDKMetrics.getInstance();
        p.j(sDKMetrics, "getInstance()");
        return sDKMetrics;
    }

    @NotNull
    public final l0 showCoroutineScope(@NotNull ISDKDispatchers iSDKDispatchers, @NotNull i0 i0Var, @NotNull g gVar) {
        p.k(iSDKDispatchers, "dispatchers");
        p.k(i0Var, "errorHandler");
        p.k(gVar, "parentJob");
        return d.a(gVar.plus(iSDKDispatchers.getDefault()).plus(new k0(ServiceProvider.NAMED_SHOW_SCOPE)).plus(i0Var));
    }

    @NotNull
    public final TopicsService topicsService(@NotNull Context context, @NotNull ISDKDispatchers iSDKDispatchers) {
        p.k(context, GAMConfig.KEY_CONTEXT);
        p.k(iSDKDispatchers, "dispatchers");
        return new TopicsService(context, iSDKDispatchers, SharedInstances.INSTANCE.getWebViewEventSender());
    }

    @NotNull
    public final l0 transactionCoroutineScope(@NotNull ISDKDispatchers iSDKDispatchers, @NotNull i0 i0Var, @NotNull g gVar) {
        p.k(iSDKDispatchers, "dispatchers");
        p.k(i0Var, "errorHandler");
        p.k(gVar, "parentJob");
        return d.a(gVar.plus(iSDKDispatchers.getDefault()).plus(new k0(ServiceProvider.NAMED_TRANSACTION_SCOPE)).plus(i0Var));
    }

    @NotNull
    public final VolumeChangeMonitor volumeChangeMonitor(@NotNull VolumeChange volumeChange) {
        p.k(volumeChange, "volumeChange");
        return new VolumeChangeMonitor(SharedInstances.INSTANCE.getWebViewEventSender(), volumeChange);
    }

    @NotNull
    public final DataStore<WebviewConfigurationStore.WebViewConfigurationStore> webViewConfigurationDataStore(@NotNull final Context context, @NotNull h0 h0Var) {
        p.k(context, GAMConfig.KEY_CONTEXT);
        p.k(h0Var, "dispatcher");
        return DataStoreFactory.create$default(DataStoreFactory.INSTANCE, new WebViewConfigurationStoreSerializer(), null, null, d.a(h0Var.plus(j2.b(null, 1, null))), new a<File>() { // from class: com.unity3d.services.core.di.UnityAdsModule.webViewConfigurationDataStore.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.a
            @NotNull
            public final File invoke() {
                return ContextExtensionsKt.unityAdsDataStoreFile(context, ServiceProvider.DATA_STORE_WEBVIEW_CONFIG);
            }
        }, 4, null);
    }
}
