package com.unity3d.services.core.di;

import android.content.Context;
import androidx.datastore.core.DataMigration;
import androidx.datastore.core.DataStore;
import bn.r;
import com.unity3d.ads.adplayer.AdPlayerScope;
import com.unity3d.ads.adplayer.AndroidWebViewClient;
import com.unity3d.ads.core.configuration.AlternativeFlowReader;
import com.unity3d.ads.core.configuration.AndroidManifestIntPropertyReader;
import com.unity3d.ads.core.configuration.CommonAlternativeFlowReader;
import com.unity3d.ads.core.configuration.GameServerIdReader;
import com.unity3d.ads.core.configuration.MediationInitBlobMetadataReader;
import com.unity3d.ads.core.configuration.MediationTraitsMetadataReader;
import com.unity3d.ads.core.data.datasource.AnalyticsDataSource;
import com.unity3d.ads.core.data.datasource.AndroidAnalyticsDataSource;
import com.unity3d.ads.core.data.datasource.AndroidAppSetIdDataSource;
import com.unity3d.ads.core.data.datasource.AndroidDeveloperConsentDataSource;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import com.unity3d.ads.core.data.datasource.AndroidFIdDataSource;
import com.unity3d.ads.core.data.datasource.AndroidFIdExistenceDataSource;
import com.unity3d.ads.core.data.datasource.AndroidLegacyConfigStoreDataSource;
import com.unity3d.ads.core.data.datasource.AndroidLegacyUserConsentDataSource;
import com.unity3d.ads.core.data.datasource.AndroidLifecycleDataSource;
import com.unity3d.ads.core.data.datasource.AndroidLocalCacheDataSource;
import com.unity3d.ads.core.data.datasource.AndroidMediationDataSource;
import com.unity3d.ads.core.data.datasource.AndroidPrivacyDeviceInfoDataSource;
import com.unity3d.ads.core.data.datasource.AndroidRemoteCacheDataSource;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import com.unity3d.ads.core.data.datasource.AndroidStoreDataSource;
import com.unity3d.ads.core.data.datasource.AndroidTcfDataSource;
import com.unity3d.ads.core.data.datasource.AndroidUnityBootConfigDataSource;
import com.unity3d.ads.core.data.datasource.AndroidUnityInfoDataSource;
import com.unity3d.ads.core.data.datasource.ByteStringDataSource;
import com.unity3d.ads.core.data.datasource.CacheDataSource;
import com.unity3d.ads.core.data.datasource.DeveloperConsentDataSource;
import com.unity3d.ads.core.data.datasource.DynamicDeviceInfoDataSource;
import com.unity3d.ads.core.data.datasource.FIdDataSource;
import com.unity3d.ads.core.data.datasource.FIdExistenceDataSource;
import com.unity3d.ads.core.data.datasource.FetchGLInfoDataMigration;
import com.unity3d.ads.core.data.datasource.LegacyUserConsentDataSource;
import com.unity3d.ads.core.data.datasource.LifecycleDataSource;
import com.unity3d.ads.core.data.datasource.MediationDataSource;
import com.unity3d.ads.core.data.datasource.PrivacyDeviceInfoDataSource;
import com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource;
import com.unity3d.ads.core.data.datasource.StoreDataSource;
import com.unity3d.ads.core.data.datasource.TcfDataSource;
import com.unity3d.ads.core.data.datasource.UnityBootConfigDataSource;
import com.unity3d.ads.core.data.datasource.UniversalRequestDataSource;
import com.unity3d.ads.core.data.datasource.UniversalRequestDataStoreProvider;
import com.unity3d.ads.core.data.datasource.WebviewConfigurationDataSource;
import com.unity3d.ads.core.data.manager.AndroidOfferwallManager;
import com.unity3d.ads.core.data.manager.AndroidOmidManager;
import com.unity3d.ads.core.data.manager.AndroidSDKPropertiesManager;
import com.unity3d.ads.core.data.manager.AndroidScarManager;
import com.unity3d.ads.core.data.manager.AndroidStorageManager;
import com.unity3d.ads.core.data.manager.OfferwallManager;
import com.unity3d.ads.core.data.manager.OmidManager;
import com.unity3d.ads.core.data.manager.SDKPropertiesManager;
import com.unity3d.ads.core.data.manager.ScarManager;
import com.unity3d.ads.core.data.manager.StorageManager;
import com.unity3d.ads.core.data.manager.TransactionEventManager;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.data.repository.AndroidAdRepository;
import com.unity3d.ads.core.data.repository.AndroidCacheRepository;
import com.unity3d.ads.core.data.repository.AndroidCampaignRepository;
import com.unity3d.ads.core.data.repository.AndroidDeveloperConsentRepository;
import com.unity3d.ads.core.data.repository.AndroidDeviceInfoRepository;
import com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository;
import com.unity3d.ads.core.data.repository.AndroidLegacyUserConsentRepository;
import com.unity3d.ads.core.data.repository.AndroidMediationRepository;
import com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository;
import com.unity3d.ads.core.data.repository.AndroidSessionRepository;
import com.unity3d.ads.core.data.repository.AndroidTcfRepository;
import com.unity3d.ads.core.data.repository.AndroidTransactionEventRepository;
import com.unity3d.ads.core.data.repository.CacheRepository;
import com.unity3d.ads.core.data.repository.CampaignRepository;
import com.unity3d.ads.core.data.repository.DeveloperConsentRepository;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.DiagnosticEventRepository;
import com.unity3d.ads.core.data.repository.FocusRepository;
import com.unity3d.ads.core.data.repository.LegacyUserConsentRepository;
import com.unity3d.ads.core.data.repository.MediationRepository;
import com.unity3d.ads.core.data.repository.OpenMeasurementRepository;
import com.unity3d.ads.core.data.repository.OperativeEventRepository;
import com.unity3d.ads.core.data.repository.OrientationRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.data.repository.TcfRepository;
import com.unity3d.ads.core.data.repository.TransactionEventRepository;
import com.unity3d.ads.core.domain.AndroidBuildHeaderBiddingToken;
import com.unity3d.ads.core.domain.AndroidCacheWebViewAssets;
import com.unity3d.ads.core.domain.AndroidExecuteAdViewerRequest;
import com.unity3d.ads.core.domain.AndroidGenerateByteStringId;
import com.unity3d.ads.core.domain.AndroidGetAdDataRefreshRequest;
import com.unity3d.ads.core.domain.AndroidGetAdPlayerConfigRequest;
import com.unity3d.ads.core.domain.AndroidGetAdPlayerContext;
import com.unity3d.ads.core.domain.AndroidGetAdRequest;
import com.unity3d.ads.core.domain.AndroidGetAdRequestPolicy;
import com.unity3d.ads.core.domain.AndroidGetClientInfo;
import com.unity3d.ads.core.domain.AndroidGetInitializationCompletedRequest;
import com.unity3d.ads.core.domain.AndroidGetInitializationData;
import com.unity3d.ads.core.domain.AndroidGetInitializationRequest;
import com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload;
import com.unity3d.ads.core.domain.AndroidGetIsAdActivity;
import com.unity3d.ads.core.domain.AndroidGetLifecycleFlow;
import com.unity3d.ads.core.domain.AndroidGetLimitedSessionToken;
import com.unity3d.ads.core.domain.AndroidGetOpenGLRendererInfo;
import com.unity3d.ads.core.domain.AndroidGetSafeguardedInitializationPolicy;
import com.unity3d.ads.core.domain.AndroidGetSharedDataTimestamps;
import com.unity3d.ads.core.domain.AndroidGetUniversalRequestForPayLoad;
import com.unity3d.ads.core.domain.AndroidGetUniversalRequestSharedData;
import com.unity3d.ads.core.domain.AndroidGetWebViewContainerUseCase;
import com.unity3d.ads.core.domain.AndroidHandleFocusCounters;
import com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse;
import com.unity3d.ads.core.domain.AndroidHandleGatewayInitializationResponse;
import com.unity3d.ads.core.domain.AndroidHandleGatewayUniversalResponse;
import com.unity3d.ads.core.domain.AndroidHandleOpenUrl;
import com.unity3d.ads.core.domain.AndroidHttpClientProvider;
import com.unity3d.ads.core.domain.AndroidInitializeBoldSDK;
import com.unity3d.ads.core.domain.AndroidIntentCreation;
import com.unity3d.ads.core.domain.AndroidLoad;
import com.unity3d.ads.core.domain.AndroidRefresh;
import com.unity3d.ads.core.domain.AndroidRemoveUrlQuery;
import com.unity3d.ads.core.domain.AndroidSendDiagnosticEvent;
import com.unity3d.ads.core.domain.AndroidSendWebViewClientErrorDiagnostics;
import com.unity3d.ads.core.domain.AndroidShow;
import com.unity3d.ads.core.domain.AndroidTestDataInfo;
import com.unity3d.ads.core.domain.AndroidTriggerInitializationCompletedRequest;
import com.unity3d.ads.core.domain.AwaitInitialization;
import com.unity3d.ads.core.domain.BuildHeaderBiddingToken;
import com.unity3d.ads.core.domain.CacheFile;
import com.unity3d.ads.core.domain.CacheWebViewAssets;
import com.unity3d.ads.core.domain.CheckForGameIdAndTestModeChanges;
import com.unity3d.ads.core.domain.CleanAssets;
import com.unity3d.ads.core.domain.CleanUpWhenOpportunityExpires;
import com.unity3d.ads.core.domain.CommonAwaitInitialization;
import com.unity3d.ads.core.domain.CommonCacheFile;
import com.unity3d.ads.core.domain.CommonCheckForGameIdAndTestModeChanges;
import com.unity3d.ads.core.domain.CommonCleanAssets;
import com.unity3d.ads.core.domain.CommonCreateFile;
import com.unity3d.ads.core.domain.CommonGetAdObject;
import com.unity3d.ads.core.domain.CommonGetAdPlayer;
import com.unity3d.ads.core.domain.CommonGetCacheDirectory;
import com.unity3d.ads.core.domain.CommonGetFileExtensionFromUrl;
import com.unity3d.ads.core.domain.CommonGetGameId;
import com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken;
import com.unity3d.ads.core.domain.CommonGetInitializationState;
import com.unity3d.ads.core.domain.CommonGetIsFileCache;
import com.unity3d.ads.core.domain.CommonGetWebViewBridgeUseCase;
import com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken;
import com.unity3d.ads.core.domain.CommonSafeCallbackInvoke;
import com.unity3d.ads.core.domain.CommonSetGameId;
import com.unity3d.ads.core.domain.CommonSetInitializationState;
import com.unity3d.ads.core.domain.CommonShouldAllowInitialization;
import com.unity3d.ads.core.domain.CommonTokenNumberProvider;
import com.unity3d.ads.core.domain.CommonValidateGameId;
import com.unity3d.ads.core.domain.CreateFile;
import com.unity3d.ads.core.domain.ExecuteAdViewerRequest;
import com.unity3d.ads.core.domain.GetAdDataRefreshRequest;
import com.unity3d.ads.core.domain.GetAdObject;
import com.unity3d.ads.core.domain.GetAdPlayer;
import com.unity3d.ads.core.domain.GetAdPlayerConfigRequest;
import com.unity3d.ads.core.domain.GetAdRequest;
import com.unity3d.ads.core.domain.GetAsyncHeaderBiddingToken;
import com.unity3d.ads.core.domain.GetByteStringId;
import com.unity3d.ads.core.domain.GetCacheDirectory;
import com.unity3d.ads.core.domain.GetCachedAsset;
import com.unity3d.ads.core.domain.GetClientInfo;
import com.unity3d.ads.core.domain.GetFileExtensionFromUrl;
import com.unity3d.ads.core.domain.GetGameId;
import com.unity3d.ads.core.domain.GetHeaderBiddingToken;
import com.unity3d.ads.core.domain.GetInitRequestPolicy;
import com.unity3d.ads.core.domain.GetInitializationCompletedRequest;
import com.unity3d.ads.core.domain.GetInitializationData;
import com.unity3d.ads.core.domain.GetInitializationRequest;
import com.unity3d.ads.core.domain.GetInitializationRequestPayload;
import com.unity3d.ads.core.domain.GetInitializationState;
import com.unity3d.ads.core.domain.GetIsFileCache;
import com.unity3d.ads.core.domain.GetLatestWebViewConfiguration;
import com.unity3d.ads.core.domain.GetLimitedSessionToken;
import com.unity3d.ads.core.domain.GetOpenGLRendererInfo;
import com.unity3d.ads.core.domain.GetOperativeEventRequestPolicy;
import com.unity3d.ads.core.domain.GetOtherRequestPolicy;
import com.unity3d.ads.core.domain.GetPrivacyUpdateRequest;
import com.unity3d.ads.core.domain.GetRequestPolicy;
import com.unity3d.ads.core.domain.GetSafeguardedInitializationPolicy;
import com.unity3d.ads.core.domain.GetSharedDataTimestamps;
import com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad;
import com.unity3d.ads.core.domain.GetUniversalRequestSharedData;
import com.unity3d.ads.core.domain.GetWebViewBridgeUseCase;
import com.unity3d.ads.core.domain.HandleDebugSettings;
import com.unity3d.ads.core.domain.HandleGatewayAdResponse;
import com.unity3d.ads.core.domain.HandleGatewayInitializationResponse;
import com.unity3d.ads.core.domain.HandleGatewayUniversalResponse;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.ads.core.domain.HandleOpenUrl;
import com.unity3d.ads.core.domain.HttpClientProvider;
import com.unity3d.ads.core.domain.InitializeBoldSDK;
import com.unity3d.ads.core.domain.IntentCreation;
import com.unity3d.ads.core.domain.LegacyLoadUseCase;
import com.unity3d.ads.core.domain.LegacyShowUseCase;
import com.unity3d.ads.core.domain.Load;
import com.unity3d.ads.core.domain.Refresh;
import com.unity3d.ads.core.domain.RemoveUrlQuery;
import com.unity3d.ads.core.domain.SafeCallbackInvoke;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.domain.SendPrivacyUpdateRequest;
import com.unity3d.ads.core.domain.SendWebViewClientErrorDiagnostics;
import com.unity3d.ads.core.domain.SetGameId;
import com.unity3d.ads.core.domain.SetInitializationState;
import com.unity3d.ads.core.domain.ShouldAllowInitialization;
import com.unity3d.ads.core.domain.Show;
import com.unity3d.ads.core.domain.TokenNumberProvider;
import com.unity3d.ads.core.domain.TriggerInitializationCompletedRequest;
import com.unity3d.ads.core.domain.TriggerInitializeListener;
import com.unity3d.ads.core.domain.ValidateGameId;
import com.unity3d.ads.core.domain.attribution.AndroidAttribution;
import com.unity3d.ads.core.domain.billing.CommonProductDetailsFetcher;
import com.unity3d.ads.core.domain.billing.IsBillingClientAvailable;
import com.unity3d.ads.core.domain.billing.ProductDetailsFetcher;
import com.unity3d.ads.core.domain.billing.ProductDetailsFetcherWithFallback;
import com.unity3d.ads.core.domain.events.AndroidGetTransactionData;
import com.unity3d.ads.core.domain.events.AndroidHandleGatewayEventResponse;
import com.unity3d.ads.core.domain.events.CommonGetTransactionRequest;
import com.unity3d.ads.core.domain.events.CommonUniversalRequestTtlValidator;
import com.unity3d.ads.core.domain.events.DiagnosticEventObserver;
import com.unity3d.ads.core.domain.events.EventObservers;
import com.unity3d.ads.core.domain.events.GetDiagnosticEventBatchRequest;
import com.unity3d.ads.core.domain.events.GetDiagnosticEventRequest;
import com.unity3d.ads.core.domain.events.GetOperativeEventApi;
import com.unity3d.ads.core.domain.events.GetOperativeEventRequest;
import com.unity3d.ads.core.domain.events.GetTransactionData;
import com.unity3d.ads.core.domain.events.GetTransactionRequest;
import com.unity3d.ads.core.domain.events.HandleGatewayEventResponse;
import com.unity3d.ads.core.domain.events.OperativeEventObserver;
import com.unity3d.ads.core.domain.events.TransactionEventObserver;
import com.unity3d.ads.core.domain.events.UniversalRequestEventSender;
import com.unity3d.ads.core.domain.events.UniversalRequestTtlValidator;
import com.unity3d.ads.core.domain.offerwall.GetIsOfferwallAdReady;
import com.unity3d.ads.core.domain.offerwall.LoadOfferwallAd;
import com.unity3d.ads.core.domain.om.AndroidInitializeOMSDK;
import com.unity3d.ads.core.domain.om.AndroidOmFinishSession;
import com.unity3d.ads.core.domain.om.AndroidOmImpressionOccurred;
import com.unity3d.ads.core.domain.om.AndroidOmInteraction;
import com.unity3d.ads.core.domain.om.AndroidOmStartSession;
import com.unity3d.ads.core.domain.om.CommonGetOmData;
import com.unity3d.ads.core.domain.om.CommonIsOMActivated;
import com.unity3d.ads.core.domain.om.GetOmData;
import com.unity3d.ads.core.domain.om.InitializeOMSDK;
import com.unity3d.ads.core.domain.om.IsOMActivated;
import com.unity3d.ads.core.domain.om.OmFinishSession;
import com.unity3d.ads.core.domain.om.OmImpressionOccurred;
import com.unity3d.ads.core.domain.privacy.DeveloperConsentFlattenerRulesUseCase;
import com.unity3d.ads.core.domain.privacy.FlattenerRulesUseCase;
import com.unity3d.ads.core.domain.privacy.LegacyUserConsentFlattenerRulesUseCase;
import com.unity3d.ads.core.domain.scar.AndroidFetchSignalsAndSendUseCase;
import com.unity3d.ads.core.domain.scar.CommonScarEligibleEffectiveUseCase;
import com.unity3d.ads.core.domain.scar.CommonScarEventReceiver;
import com.unity3d.ads.core.domain.scar.FetchSignalsAndSendUseCase;
import com.unity3d.ads.core.domain.scar.GetAndroidTokenEventRequest;
import com.unity3d.ads.core.domain.scar.GetHbTokenEventRequest;
import com.unity3d.ads.core.domain.scar.HandleAndroidGetTokenRequest;
import com.unity3d.ads.core.domain.scar.HandleGetTokenRequest;
import com.unity3d.ads.core.domain.scar.LoadScarAd;
import com.unity3d.ads.core.domain.scar.ScarEligibleEffectiveUseCase;
import com.unity3d.ads.core.domain.scar.ScarTimeHackFixer;
import com.unity3d.ads.core.domain.work.BackgroundWorker;
import com.unity3d.ads.core.domain.work.DiagnosticEventRequestWorkModifier;
import com.unity3d.ads.core.domain.work.DownloadPriorityQueue;
import com.unity3d.ads.core.log.Logger;
import com.unity3d.ads.core.log.UnityLogger;
import com.unity3d.ads.core.utils.CommonCoroutineTimer;
import com.unity3d.ads.core.utils.CoroutineTimer;
import com.unity3d.ads.datastore.ByteStringStoreOuterClass;
import com.unity3d.ads.datastore.WebviewConfigurationStore;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import com.unity3d.ads.gatewayclient.GatewayClient;
import com.unity3d.services.SDKErrorHandler;
import com.unity3d.services.ads.gmascar.GMA;
import com.unity3d.services.ads.gmascar.GMAScarAdapterBridge;
import com.unity3d.services.ads.gmascar.utils.GMAEventSender;
import com.unity3d.services.ads.measurements.MeasurementsService;
import com.unity3d.services.ads.offerwall.OfferwallAdapterBridge;
import com.unity3d.services.ads.token.AsyncTokenStorage;
import com.unity3d.services.ads.token.InMemoryTokenStorage;
import com.unity3d.services.ads.token.TokenStorage;
import com.unity3d.services.ads.topics.TopicsService;
import com.unity3d.services.core.configuration.ConfigurationReader;
import com.unity3d.services.core.device.VolumeChange;
import com.unity3d.services.core.device.VolumeChangeContentObserver;
import com.unity3d.services.core.device.VolumeChangeMonitor;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.domain.task.ConfigFileFromLocalStorage;
import com.unity3d.services.core.domain.task.InitializeSDK;
import com.unity3d.services.core.domain.task.InitializeStateComplete;
import com.unity3d.services.core.domain.task.InitializeStateConfig;
import com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader;
import com.unity3d.services.core.domain.task.InitializeStateCreate;
import com.unity3d.services.core.domain.task.InitializeStateError;
import com.unity3d.services.core.domain.task.InitializeStateLoadCache;
import com.unity3d.services.core.domain.task.InitializeStateLoadWeb;
import com.unity3d.services.core.domain.task.InitializeStateNetworkError;
import com.unity3d.services.core.domain.task.InitializeStateReset;
import com.unity3d.services.core.fid.Constants;
import com.unity3d.services.core.misc.JsonStorage;
import com.unity3d.services.core.network.core.CronetEngineBuilderFactory;
import com.unity3d.services.core.network.core.HttpClient;
import com.unity3d.services.core.network.domain.CleanupDirectory;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import com.unity3d.services.core.webview.bridge.IEventSender;
import com.unity3d.services.core.webview.bridge.SharedInstances;
import com.unity3d.services.store.StoreMonitor;
import com.unity3d.services.store.StoreWebViewEventSender;
import com.unity3d.services.store.core.GatewayStoreExceptionHandler;
import com.unity3d.services.store.core.StoreEventListenerFactory;
import com.unity3d.services.store.core.StoreExceptionHandler;
import com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter;
import com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapterFactory;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import hn.c;
import jn.d;
import kotlin.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.h;
import p000do.h0;
import p000do.i0;
import p000do.l0;
import sn.a;
import sn.l;
import tn.p;
import tn.t;

/* JADX INFO: compiled from: ServiceProvider.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class ServiceProvider implements IServiceProvider {

    @NotNull
    public static final String CDN_CREATIVES_HOST = "cdn-creatives-cf-prd.acquire.unity3dusercontent.com";
    public static final int CDN_CREATIVES_PORT = 443;

    @NotNull
    public static final String DATA_STORE_GATEWAY_CACHE = "gateway_cache.pb";

    @NotNull
    public static final String DATA_STORE_GL_INFO = "glinfo.pb";

    @NotNull
    public static final String DATA_STORE_IAP_TRANSACTION = "iap_transaction.pb";

    @NotNull
    public static final String DATA_STORE_NATIVE_CONFIG = "native_configuration.pb";

    @NotNull
    public static final String DATA_STORE_PRIVACY = "privacy.pb";

    @NotNull
    public static final String DATA_STORE_PRIVACY_FSM = "privacy_fsm.pb";

    @NotNull
    public static final String DATA_STORE_UNIVERSAL_REQUEST = "universal_request.pb";

    @NotNull
    public static final String DATA_STORE_WEBVIEW_CONFIG = "webview_config.pb";

    @NotNull
    public static final String DEFAULT_DISPATCHER = "default_dispatcher";

    @NotNull
    public static final String DEV_CONSENT_PRIVACY_RULES = "dev_consent_privacy_rules";

    @NotNull
    public static final String GATEWAY_HOST = "gateway.unityads.unity3d.com";
    public static final int GATEWAY_PORT = 443;
    public static final long HTTP_CACHE_DISK_SIZE = 20971520;
    public static final long HTTP_CLIENT_FETCH_TIMEOUT = 500;

    @NotNull
    public static final ServiceProvider INSTANCE;

    @NotNull
    public static final String IO_DISPATCHER = "io_dispatcher";

    @NotNull
    public static final String LEGACY_PRIVACY_RULES = "legacy_privacy_rules";

    @NotNull
    public static final String MAIN_DISPATCHER = "main_dispatcher";

    @NotNull
    public static final String NAMED_AD_REQ = "ad_req";

    @NotNull
    public static final String NAMED_GET_TOKEN_SCOPE = "get_token_scope";

    @NotNull
    public static final String NAMED_INIT_REQ = "init_req";

    @NotNull
    public static final String NAMED_INIT_SCOPE = "init_scope";

    @NotNull
    public static final String NAMED_LOAD_SCOPE = "load_scope";

    @NotNull
    public static final String NAMED_LOCAL = "local";

    @NotNull
    public static final String NAMED_OFFERWALL_SCOPE = "offerwall_scope";

    @NotNull
    public static final String NAMED_OMID_SCOPE = "omid_scope";

    @NotNull
    public static final String NAMED_OPERATIVE_REQ = "op_event_req";

    @NotNull
    public static final String NAMED_OTHER_REQ = "other_req";

    @NotNull
    public static final String NAMED_PUBLIC_JOB = "public_job";

    @NotNull
    public static final String NAMED_REMOTE = "remote";

    @NotNull
    public static final String NAMED_SCAR_SCOPE = "scar_scope";

    @NotNull
    public static final String NAMED_SDK = "sdk";

    @NotNull
    public static final String NAMED_SHOW_SCOPE = "show_scope";

    @NotNull
    public static final String NAMED_TRANSACTION_SCOPE = "transaction_scope";

    @NotNull
    public static final String PREF_GL_INFO = "glinfo";
    public static final long SCAR_SIGNALS_FETCH_TIMEOUT = 50000;
    public static final long SCAR_VERSION_FETCH_TIMEOUT = 5000;

    @NotNull
    private static final IServicesRegistry serviceRegistry;

    static {
        ServiceProvider serviceProvider = new ServiceProvider();
        INSTANCE = serviceProvider;
        serviceRegistry = serviceProvider.initialize();
    }

    private ServiceProvider() {
    }

    @Override // com.unity3d.services.core.di.IServiceProvider
    @NotNull
    public IServicesRegistry getRegistry() {
        return serviceRegistry;
    }

    @Override // com.unity3d.services.core.di.IServiceProvider
    @NotNull
    public IServicesRegistry initialize() {
        return ServicesRegistryKt.registry(new l<ServicesRegistry, r>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1
            @Override // sn.l
            public /* bridge */ /* synthetic */ r invoke(ServicesRegistry servicesRegistry) {
                invoke2(servicesRegistry);
                return r.f5635a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull final ServicesRegistry servicesRegistry) {
                p.k(servicesRegistry, "$this$registry");
                final UnityAdsModule unityAdsModule = new UnityAdsModule();
                servicesRegistry.updateService(new ServiceKey("", t.b(Context.class)), b.b(new a<Context>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    public final Context invoke() {
                        return ClientProperties.getApplicationContext();
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(ServiceProvider.MAIN_DISPATCHER, t.b(h0.class)), b.b(new a<h0>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.2
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final h0 invoke() {
                        return unityAdsModule.mainDispatcher();
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, t.b(h0.class)), b.b(new a<h0>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.3
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final h0 invoke() {
                        return unityAdsModule.defaultDispatcher();
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(ServiceProvider.IO_DISPATCHER, t.b(h0.class)), b.b(new a<h0>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.4
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final h0 invoke() {
                        return unityAdsModule.ioDispatcher();
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(ISDKDispatchers.class)), b.b(new a<ISDKDispatchers>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.5
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final ISDKDispatchers invoke() {
                        return unityAdsModule.sdkDispatchers();
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(SDKMetricsSender.class)), b.b(new a<SDKMetricsSender>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.6
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final SDKMetricsSender invoke() {
                        return unityAdsModule.sdkMetrics();
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(ServiceProvider.NAMED_INIT_SCOPE, t.b(l0.class)), ServiceFactoryKt.factoryOf(new a<l0>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.7
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final l0 invoke() {
                        return unityAdsModule.initCoroutineScope((ISDKDispatchers) servicesRegistry.resolveService(new ServiceKey("", t.b(ISDKDispatchers.class))), (i0) servicesRegistry.resolveService(new ServiceKey("sdk", t.b(i0.class))), (g) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.NAMED_PUBLIC_JOB, t.b(g.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(ServiceProvider.NAMED_LOAD_SCOPE, t.b(l0.class)), ServiceFactoryKt.factoryOf(new a<l0>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.8
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final l0 invoke() {
                        return unityAdsModule.loadCoroutineScope((ISDKDispatchers) servicesRegistry.resolveService(new ServiceKey("", t.b(ISDKDispatchers.class))), (i0) servicesRegistry.resolveService(new ServiceKey("sdk", t.b(i0.class))), (g) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.NAMED_PUBLIC_JOB, t.b(g.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(ServiceProvider.NAMED_SHOW_SCOPE, t.b(l0.class)), ServiceFactoryKt.factoryOf(new a<l0>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.9
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final l0 invoke() {
                        return unityAdsModule.showCoroutineScope((ISDKDispatchers) servicesRegistry.resolveService(new ServiceKey("", t.b(ISDKDispatchers.class))), (i0) servicesRegistry.resolveService(new ServiceKey("sdk", t.b(i0.class))), (g) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.NAMED_PUBLIC_JOB, t.b(g.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(ServiceProvider.NAMED_TRANSACTION_SCOPE, t.b(l0.class)), ServiceFactoryKt.factoryOf(new a<l0>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.10
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final l0 invoke() {
                        return unityAdsModule.transactionCoroutineScope((ISDKDispatchers) servicesRegistry.resolveService(new ServiceKey("", t.b(ISDKDispatchers.class))), (i0) servicesRegistry.resolveService(new ServiceKey("sdk", t.b(i0.class))), (g) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.NAMED_PUBLIC_JOB, t.b(g.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(ServiceProvider.NAMED_GET_TOKEN_SCOPE, t.b(l0.class)), ServiceFactoryKt.factoryOf(new a<l0>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.11
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final l0 invoke() {
                        return unityAdsModule.getTokenCoroutineScope((ISDKDispatchers) servicesRegistry.resolveService(new ServiceKey("", t.b(ISDKDispatchers.class))), (i0) servicesRegistry.resolveService(new ServiceKey("sdk", t.b(i0.class))), (g) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.NAMED_PUBLIC_JOB, t.b(g.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(ServiceProvider.NAMED_SCAR_SCOPE, t.b(l0.class)), ServiceFactoryKt.factoryOf(new a<l0>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.12
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final l0 invoke() {
                        return unityAdsModule.scarSignalsCoroutineScope((ISDKDispatchers) servicesRegistry.resolveService(new ServiceKey("", t.b(ISDKDispatchers.class))), (i0) servicesRegistry.resolveService(new ServiceKey("sdk", t.b(i0.class))), (g) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.NAMED_PUBLIC_JOB, t.b(g.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(ServiceProvider.NAMED_OFFERWALL_SCOPE, t.b(l0.class)), ServiceFactoryKt.factoryOf(new a<l0>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.13
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final l0 invoke() {
                        return unityAdsModule.offerwallSignalsCoroutineScope((ISDKDispatchers) servicesRegistry.resolveService(new ServiceKey("", t.b(ISDKDispatchers.class))), (i0) servicesRegistry.resolveService(new ServiceKey("sdk", t.b(i0.class))), (g) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.NAMED_PUBLIC_JOB, t.b(g.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(ServiceProvider.NAMED_OMID_SCOPE, t.b(l0.class)), ServiceFactoryKt.factoryOf(new a<l0>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.14
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final l0 invoke() {
                        return unityAdsModule.omidCoroutineScope((ISDKDispatchers) servicesRegistry.resolveService(new ServiceKey("", t.b(ISDKDispatchers.class))), (i0) servicesRegistry.resolveService(new ServiceKey("sdk", t.b(i0.class))), (g) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.NAMED_PUBLIC_JOB, t.b(g.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(ServiceProvider.NAMED_PUBLIC_JOB, t.b(g.class)), ServiceFactoryKt.factoryOf(new a<g>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.15
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // sn.a
                    @NotNull
                    public final g invoke() {
                        return unityAdsModule.publicApiJob((DiagnosticEventRepository) servicesRegistry.resolveService(new ServiceKey("", t.b(DiagnosticEventRepository.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_GATEWAY_CACHE, t.b(ByteStringDataSource.class)), b.b(new a<ByteStringDataSource>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.16
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final ByteStringDataSource invoke() {
                        return new AndroidLegacyConfigStoreDataSource((StorageManager) servicesRegistry.resolveService(new ServiceKey("", t.b(StorageManager.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_PRIVACY, t.b(DataStore.class)), b.b(new a<DataStore<ByteStringStoreOuterClass.ByteStringStore>>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.17
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final DataStore<ByteStringStoreOuterClass.ByteStringStore> invoke() {
                        return unityAdsModule.privacyDataStore((Context) servicesRegistry.resolveService(new ServiceKey("", t.b(Context.class))), (h0) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, t.b(h0.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_PRIVACY, t.b(ByteStringDataSource.class)), b.b(new a<ByteStringDataSource>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.18
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final ByteStringDataSource invoke() {
                        return unityAdsModule.privacyDataStore((DataStore) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_PRIVACY, t.b(DataStore.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_PRIVACY_FSM, t.b(DataStore.class)), b.b(new a<DataStore<ByteStringStoreOuterClass.ByteStringStore>>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.19
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final DataStore<ByteStringStoreOuterClass.ByteStringStore> invoke() {
                        return unityAdsModule.privacyFsmDataStore((Context) servicesRegistry.resolveService(new ServiceKey("", t.b(Context.class))), (h0) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, t.b(h0.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_PRIVACY_FSM, t.b(ByteStringDataSource.class)), b.b(new a<ByteStringDataSource>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.20
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final ByteStringDataSource invoke() {
                        return unityAdsModule.privacyFsmDataStore((DataStore) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_PRIVACY_FSM, t.b(DataStore.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_NATIVE_CONFIG, t.b(DataStore.class)), b.b(new a<DataStore<ByteStringStoreOuterClass.ByteStringStore>>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.21
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final DataStore<ByteStringStoreOuterClass.ByteStringStore> invoke() {
                        return unityAdsModule.nativeConfigurationDataStore((Context) servicesRegistry.resolveService(new ServiceKey("", t.b(Context.class))), (h0) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, t.b(h0.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_NATIVE_CONFIG, t.b(ByteStringDataSource.class)), b.b(new a<ByteStringDataSource>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.22
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final ByteStringDataSource invoke() {
                        return unityAdsModule.nativeConfigurationDataStore((DataStore) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_NATIVE_CONFIG, t.b(DataStore.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_GL_INFO, t.b(DataStore.class)), b.b(new a<DataStore<ByteStringStoreOuterClass.ByteStringStore>>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.23
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final DataStore<ByteStringStoreOuterClass.ByteStringStore> invoke() {
                        return unityAdsModule.glInfoDataStore((Context) servicesRegistry.resolveService(new ServiceKey("", t.b(Context.class))), (h0) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, t.b(h0.class))), (DataMigration) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.PREF_GL_INFO, t.b(DataMigration.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_GL_INFO, t.b(ByteStringDataSource.class)), b.b(new a<ByteStringDataSource>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.24
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final ByteStringDataSource invoke() {
                        return unityAdsModule.glInfoDataStore((DataStore) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_GL_INFO, t.b(DataStore.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(UniversalRequestDataStoreProvider.class)), b.b(new a<UniversalRequestDataStoreProvider>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.25
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final UniversalRequestDataStoreProvider invoke() {
                        return new UniversalRequestDataStoreProvider((Context) servicesRegistry.resolveService(new ServiceKey("", t.b(Context.class))), (h0) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, t.b(h0.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_IAP_TRANSACTION, t.b(DataStore.class)), b.b(new a<DataStore<ByteStringStoreOuterClass.ByteStringStore>>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.26
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final DataStore<ByteStringStoreOuterClass.ByteStringStore> invoke() {
                        return unityAdsModule.iapTransactionDataStore((Context) servicesRegistry.resolveService(new ServiceKey("", t.b(Context.class))), (h0) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, t.b(h0.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_IAP_TRANSACTION, t.b(ByteStringDataSource.class)), b.b(new a<ByteStringDataSource>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.27
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final ByteStringDataSource invoke() {
                        return unityAdsModule.iapTransactionDataStore((DataStore) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_IAP_TRANSACTION, t.b(DataStore.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_WEBVIEW_CONFIG, t.b(DataStore.class)), b.b(new a<DataStore<WebviewConfigurationStore.WebViewConfigurationStore>>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.28
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final DataStore<WebviewConfigurationStore.WebViewConfigurationStore> invoke() {
                        return unityAdsModule.webViewConfigurationDataStore((Context) servicesRegistry.resolveService(new ServiceKey("", t.b(Context.class))), (h0) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, t.b(h0.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(AsyncTokenStorage.class)), b.b(new a<AsyncTokenStorage>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.29
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final AsyncTokenStorage invoke() {
                        return unityAdsModule.asyncTokenStorage((TokenStorage) servicesRegistry.resolveService(new ServiceKey("", t.b(TokenStorage.class))), (SDKMetricsSender) servicesRegistry.resolveService(new ServiceKey("", t.b(SDKMetricsSender.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(VolumeChangeMonitor.class)), b.b(new a<VolumeChangeMonitor>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.30
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final VolumeChangeMonitor invoke() {
                        return unityAdsModule.volumeChangeMonitor((VolumeChange) servicesRegistry.resolveService(new ServiceKey("", t.b(VolumeChange.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("PUBLIC", t.b(JsonStorage.class)), b.b(new a<JsonStorage>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.31
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final JsonStorage invoke() {
                        return unityAdsModule.publicJsonStorage();
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("PRIVATE", t.b(JsonStorage.class)), b.b(new a<JsonStorage>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.32
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final JsonStorage invoke() {
                        return unityAdsModule.privateJsonStorage();
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("MEMORY", t.b(JsonStorage.class)), b.b(new a<JsonStorage>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.33
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final JsonStorage invoke() {
                        return unityAdsModule.memoryJsonStorage();
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(NativeConfigurationOuterClass.NativeConfiguration.class)), b.b(new a<NativeConfigurationOuterClass.NativeConfiguration>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.34
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final NativeConfigurationOuterClass.NativeConfiguration invoke() {
                        return unityAdsModule.defaultNativeConfiguration();
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(MeasurementsService.class)), b.b(new a<MeasurementsService>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.35
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final MeasurementsService invoke() {
                        return unityAdsModule.measurementService((Context) servicesRegistry.resolveService(new ServiceKey("", t.b(Context.class))), (ISDKDispatchers) servicesRegistry.resolveService(new ServiceKey("", t.b(ISDKDispatchers.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(TopicsService.class)), b.b(new a<TopicsService>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.36
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final TopicsService invoke() {
                        return unityAdsModule.topicsService((Context) servicesRegistry.resolveService(new ServiceKey("", t.b(Context.class))), (ISDKDispatchers) servicesRegistry.resolveService(new ServiceKey("", t.b(ISDKDispatchers.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(CronetEngineBuilderFactory.class)), b.b(new a<CronetEngineBuilderFactory>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.37
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final CronetEngineBuilderFactory invoke() {
                        return new CronetEngineBuilderFactory();
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(HttpClientProvider.class)), b.b(new a<HttpClientProvider>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.38
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final HttpClientProvider invoke() {
                        return new AndroidHttpClientProvider((AlternativeFlowReader) servicesRegistry.resolveService(new ServiceKey("", t.b(AlternativeFlowReader.class))), (ISDKDispatchers) servicesRegistry.resolveService(new ServiceKey("", t.b(ISDKDispatchers.class))), (SendDiagnosticEvent) servicesRegistry.resolveService(new ServiceKey("", t.b(SendDiagnosticEvent.class))), (Context) servicesRegistry.resolveService(new ServiceKey("", t.b(Context.class))), (CronetEngineBuilderFactory) servicesRegistry.resolveService(new ServiceKey("", t.b(CronetEngineBuilderFactory.class))), (MediationTraitsMetadataReader) servicesRegistry.resolveService(new ServiceKey("", t.b(MediationTraitsMetadataReader.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(HttpClient.class)), b.b(new a<HttpClient>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.39

                    /* JADX INFO: renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$39$1, reason: invalid class name and collision with other inner class name */
                    /* JADX INFO: compiled from: ServiceProvider.kt */
                    @d(c = "com.unity3d.services.core.di.ServiceProvider$initialize$1$39$1", f = "ServiceProvider.kt", l = {462}, m = "invokeSuspend")
                    public static final class C07151 extends SuspendLambda implements sn.p<l0, c<? super HttpClient>, Object> {
                        public final /* synthetic */ ServicesRegistry $this_registry;
                        public int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C07151(ServicesRegistry servicesRegistry, c<? super C07151> cVar) {
                            super(2, cVar);
                            this.$this_registry = servicesRegistry;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        @NotNull
                        public final c<r> create(@Nullable Object obj, @NotNull c<?> cVar) {
                            return new C07151(this.$this_registry, cVar);
                        }

                        @Override // sn.p
                        @Nullable
                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
                        public final Object mo2invoke(@NotNull l0 l0Var, @Nullable c<? super HttpClient> cVar) {
                            return ((C07151) create(l0Var, cVar)).invokeSuspend(r.f5635a);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        @Nullable
                        public final Object invokeSuspend(@NotNull Object obj) {
                            Object objG = in.a.g();
                            int i10 = this.label;
                            if (i10 == 0) {
                                kotlin.c.b(obj);
                                HttpClientProvider httpClientProvider = (HttpClientProvider) this.$this_registry.resolveService(new ServiceKey("", t.b(HttpClientProvider.class)));
                                this.label = 1;
                                obj = httpClientProvider.invoke(this);
                                if (obj == objG) {
                                    return objG;
                                }
                            } else {
                                if (i10 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                kotlin.c.b(obj);
                            }
                            return obj;
                        }
                    }

                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final HttpClient invoke() {
                        return (HttpClient) h.b(null, new C07151(servicesRegistry, null), 1, null);
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(MediationTraitsMetadataReader.class)), ServiceFactoryKt.factoryOf(new a<MediationTraitsMetadataReader>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.40
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final MediationTraitsMetadataReader invoke() {
                        return new MediationTraitsMetadataReader((JsonStorage) servicesRegistry.resolveService(new ServiceKey("MEMORY", t.b(JsonStorage.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(AlternativeFlowReader.class)), b.b(new a<AlternativeFlowReader>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.41
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final AlternativeFlowReader invoke() {
                        return new CommonAlternativeFlowReader((ConfigurationReader) servicesRegistry.resolveService(new ServiceKey("", t.b(ConfigurationReader.class))), (SessionRepository) servicesRegistry.resolveService(new ServiceKey("", t.b(SessionRepository.class))), (MediationTraitsMetadataReader) servicesRegistry.resolveService(new ServiceKey("", t.b(MediationTraitsMetadataReader.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(TcfDataSource.class)), b.b(new a<TcfDataSource>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.42
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final TcfDataSource invoke() {
                        return new AndroidTcfDataSource();
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(TcfRepository.class)), b.b(new a<TcfRepository>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.43
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final TcfRepository invoke() {
                        return new AndroidTcfRepository((TcfDataSource) servicesRegistry.resolveService(new ServiceKey("", t.b(TcfDataSource.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(AndroidManifestIntPropertyReader.class)), b.b(new a<AndroidManifestIntPropertyReader>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.44
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final AndroidManifestIntPropertyReader invoke() {
                        return new AndroidManifestIntPropertyReader((Context) servicesRegistry.resolveService(new ServiceKey("", t.b(Context.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(AndroidTestDataInfo.class)), b.b(new a<AndroidTestDataInfo>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.45
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final AndroidTestDataInfo invoke() {
                        return new AndroidTestDataInfo((AndroidManifestIntPropertyReader) servicesRegistry.resolveService(new ServiceKey("", t.b(AndroidManifestIntPropertyReader.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(GameServerIdReader.class)), b.b(new a<GameServerIdReader>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.46
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final GameServerIdReader invoke() {
                        return new GameServerIdReader((JsonStorage) servicesRegistry.resolveService(new ServiceKey("PUBLIC", t.b(JsonStorage.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(StoreDataSource.class)), b.b(new a<StoreDataSource>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.47
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final StoreDataSource invoke() {
                        return new AndroidStoreDataSource((Context) servicesRegistry.resolveService(new ServiceKey("", t.b(Context.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(AnalyticsDataSource.class)), b.b(new a<AnalyticsDataSource>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.48
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final AnalyticsDataSource invoke() {
                        return new AndroidAnalyticsDataSource();
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(DeveloperConsentDataSource.class)), b.b(new a<DeveloperConsentDataSource>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.49
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final DeveloperConsentDataSource invoke() {
                        return new AndroidDeveloperConsentDataSource((FlattenerRulesUseCase) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.DEV_CONSENT_PRIVACY_RULES, t.b(FlattenerRulesUseCase.class))), (JsonStorage) servicesRegistry.resolveService(new ServiceKey("PUBLIC", t.b(JsonStorage.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(DynamicDeviceInfoDataSource.class)), b.b(new a<DynamicDeviceInfoDataSource>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.50
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final DynamicDeviceInfoDataSource invoke() {
                        return new AndroidDynamicDeviceInfoDataSource((Context) servicesRegistry.resolveService(new ServiceKey("", t.b(Context.class))), (LifecycleDataSource) servicesRegistry.resolveService(new ServiceKey("", t.b(LifecycleDataSource.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(LegacyUserConsentDataSource.class)), b.b(new a<LegacyUserConsentDataSource>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.51
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final LegacyUserConsentDataSource invoke() {
                        return new AndroidLegacyUserConsentDataSource((FlattenerRulesUseCase) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.LEGACY_PRIVACY_RULES, t.b(FlattenerRulesUseCase.class))), (JsonStorage) servicesRegistry.resolveService(new ServiceKey("PRIVATE", t.b(JsonStorage.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(LifecycleDataSource.class)), b.b(new a<LifecycleDataSource>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.52
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final LifecycleDataSource invoke() {
                        return new AndroidLifecycleDataSource();
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("local", t.b(CacheDataSource.class)), b.b(new a<CacheDataSource>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.53
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final CacheDataSource invoke() {
                        return new AndroidLocalCacheDataSource((CreateFile) servicesRegistry.resolveService(new ServiceKey("", t.b(CreateFile.class))), (GetFileExtensionFromUrl) servicesRegistry.resolveService(new ServiceKey("", t.b(GetFileExtensionFromUrl.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(CreateFile.class)), b.b(new a<CreateFile>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.54
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final CreateFile invoke() {
                        return new CommonCreateFile();
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(GetFileExtensionFromUrl.class)), b.b(new a<GetFileExtensionFromUrl>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.55
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final GetFileExtensionFromUrl invoke() {
                        return new CommonGetFileExtensionFromUrl((RemoveUrlQuery) servicesRegistry.resolveService(new ServiceKey("", t.b(RemoveUrlQuery.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(RemoveUrlQuery.class)), b.b(new a<RemoveUrlQuery>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.56
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final RemoveUrlQuery invoke() {
                        return new AndroidRemoveUrlQuery();
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(MediationDataSource.class)), b.b(new a<MediationDataSource>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.57
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final MediationDataSource invoke() {
                        return new AndroidMediationDataSource((JsonStorage) servicesRegistry.resolveService(new ServiceKey("MEMORY", t.b(JsonStorage.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(PrivacyDeviceInfoDataSource.class)), b.b(new a<PrivacyDeviceInfoDataSource>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.58
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final PrivacyDeviceInfoDataSource invoke() {
                        return new AndroidPrivacyDeviceInfoDataSource((Context) servicesRegistry.resolveService(new ServiceKey("", t.b(Context.class))), (FIdDataSource) servicesRegistry.resolveService(new ServiceKey("", t.b(FIdDataSource.class))), (AndroidAppSetIdDataSource) servicesRegistry.resolveService(new ServiceKey("", t.b(AndroidAppSetIdDataSource.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(ServiceProvider.NAMED_REMOTE, t.b(CacheDataSource.class)), b.b(new a<CacheDataSource>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.59
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final CacheDataSource invoke() {
                        return new AndroidRemoteCacheDataSource((h0) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, t.b(h0.class))), (CreateFile) servicesRegistry.resolveService(new ServiceKey("", t.b(CreateFile.class))), (GetFileExtensionFromUrl) servicesRegistry.resolveService(new ServiceKey("", t.b(GetFileExtensionFromUrl.class))), (HttpClientProvider) servicesRegistry.resolveService(new ServiceKey("", t.b(HttpClientProvider.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(StaticDeviceInfoDataSource.class)), b.b(new a<StaticDeviceInfoDataSource>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.60
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final StaticDeviceInfoDataSource invoke() {
                        return new AndroidStaticDeviceInfoDataSource((Context) servicesRegistry.resolveService(new ServiceKey("", t.b(Context.class))), (ByteStringDataSource) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_GL_INFO, t.b(ByteStringDataSource.class))), (AnalyticsDataSource) servicesRegistry.resolveService(new ServiceKey("", t.b(AnalyticsDataSource.class))), (StoreDataSource) servicesRegistry.resolveService(new ServiceKey("", t.b(StoreDataSource.class))), (UnityBootConfigDataSource) servicesRegistry.resolveService(new ServiceKey("", t.b(UnityBootConfigDataSource.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(ServiceProvider.PREF_GL_INFO, t.b(DataMigration.class)), b.b(new a<DataMigration<ByteStringStoreOuterClass.ByteStringStore>>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.61
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final DataMigration<ByteStringStoreOuterClass.ByteStringStore> invoke() {
                        return new FetchGLInfoDataMigration((GetOpenGLRendererInfo) servicesRegistry.resolveService(new ServiceKey("", t.b(GetOpenGLRendererInfo.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(UniversalRequestDataSource.class)), b.b(new a<UniversalRequestDataSource>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.62
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final UniversalRequestDataSource invoke() {
                        return new UniversalRequestDataSource((UniversalRequestDataStoreProvider) servicesRegistry.resolveService(new ServiceKey("", t.b(UniversalRequestDataStoreProvider.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(WebviewConfigurationDataSource.class)), b.b(new a<WebviewConfigurationDataSource>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.63
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final WebviewConfigurationDataSource invoke() {
                        return new WebviewConfigurationDataSource((DataStore) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_WEBVIEW_CONFIG, t.b(DataStore.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(OmidManager.class)), b.b(new a<OmidManager>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.64
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final OmidManager invoke() {
                        return new AndroidOmidManager();
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(SDKPropertiesManager.class)), b.b(new a<SDKPropertiesManager>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.65
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final SDKPropertiesManager invoke() {
                        return new AndroidSDKPropertiesManager();
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(StorageManager.class)), b.b(new a<StorageManager>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.66
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final StorageManager invoke() {
                        return new AndroidStorageManager();
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(BillingClientAdapter.class)), b.b(new a<BillingClientAdapter>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.67
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @Nullable
                    public final BillingClientAdapter invoke() {
                        return new BillingClientAdapterFactory().createBillingClientAdapter((Context) servicesRegistry.resolveService(new ServiceKey("", t.b(Context.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(ProductDetailsFetcher.class)), b.b(new a<ProductDetailsFetcher>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.68
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final ProductDetailsFetcher invoke() {
                        return new ProductDetailsFetcherWithFallback(new CommonProductDetailsFetcher((BillingClientAdapter) servicesRegistry.resolveService(new ServiceKey("", t.b(BillingClientAdapter.class))), "inapp"), new CommonProductDetailsFetcher((BillingClientAdapter) servicesRegistry.resolveService(new ServiceKey("", t.b(BillingClientAdapter.class))), "subs"));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(TransactionEventManager.class)), b.b(new a<TransactionEventManager>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.69
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final TransactionEventManager invoke() {
                        return new TransactionEventManager((l0) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.NAMED_TRANSACTION_SCOPE, t.b(l0.class))), (BillingClientAdapter) servicesRegistry.resolveService(new ServiceKey("", t.b(BillingClientAdapter.class))), (GetTransactionData) servicesRegistry.resolveService(new ServiceKey("", t.b(GetTransactionData.class))), (GetTransactionRequest) servicesRegistry.resolveService(new ServiceKey("", t.b(GetTransactionRequest.class))), (TransactionEventRepository) servicesRegistry.resolveService(new ServiceKey("", t.b(TransactionEventRepository.class))), (ByteStringDataSource) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_IAP_TRANSACTION, t.b(ByteStringDataSource.class))), (IsBillingClientAvailable) servicesRegistry.resolveService(new ServiceKey("", t.b(IsBillingClientAvailable.class))), (SessionRepository) servicesRegistry.resolveService(new ServiceKey("", t.b(SessionRepository.class))), (ProductDetailsFetcher) servicesRegistry.resolveService(new ServiceKey("", t.b(ProductDetailsFetcher.class))), (Logger) servicesRegistry.resolveService(new ServiceKey("", t.b(Logger.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(AdRepository.class)), b.b(new a<AdRepository>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.70
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final AdRepository invoke() {
                        return new AndroidAdRepository();
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(CacheRepository.class)), b.b(new a<CacheRepository>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.71
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final CacheRepository invoke() {
                        return new AndroidCacheRepository((h0) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, t.b(h0.class))), (GetCacheDirectory) servicesRegistry.resolveService(new ServiceKey("", t.b(GetCacheDirectory.class))), (CacheDataSource) servicesRegistry.resolveService(new ServiceKey("local", t.b(CacheDataSource.class))), (CacheDataSource) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.NAMED_REMOTE, t.b(CacheDataSource.class))), (Context) servicesRegistry.resolveService(new ServiceKey("", t.b(Context.class))), (SessionRepository) servicesRegistry.resolveService(new ServiceKey("", t.b(SessionRepository.class))), (CleanupDirectory) servicesRegistry.resolveService(new ServiceKey("", t.b(CleanupDirectory.class))), (DownloadPriorityQueue) servicesRegistry.resolveService(new ServiceKey("", t.b(DownloadPriorityQueue.class))), (CreateFile) servicesRegistry.resolveService(new ServiceKey("", t.b(CreateFile.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(GetCacheDirectory.class)), b.b(new a<GetCacheDirectory>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.72
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final GetCacheDirectory invoke() {
                        return new CommonGetCacheDirectory();
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(CampaignRepository.class)), b.b(new a<CampaignRepository>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.73
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final CampaignRepository invoke() {
                        return new AndroidCampaignRepository((GetSharedDataTimestamps) servicesRegistry.resolveService(new ServiceKey("", t.b(GetSharedDataTimestamps.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(DeveloperConsentRepository.class)), b.b(new a<DeveloperConsentRepository>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.74
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final DeveloperConsentRepository invoke() {
                        return new AndroidDeveloperConsentRepository((DeveloperConsentDataSource) servicesRegistry.resolveService(new ServiceKey("", t.b(DeveloperConsentDataSource.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(DeviceInfoRepository.class)), b.b(new a<DeviceInfoRepository>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.75
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final DeviceInfoRepository invoke() {
                        return new AndroidDeviceInfoRepository((StaticDeviceInfoDataSource) servicesRegistry.resolveService(new ServiceKey("", t.b(StaticDeviceInfoDataSource.class))), (DynamicDeviceInfoDataSource) servicesRegistry.resolveService(new ServiceKey("", t.b(DynamicDeviceInfoDataSource.class))), (PrivacyDeviceInfoDataSource) servicesRegistry.resolveService(new ServiceKey("", t.b(PrivacyDeviceInfoDataSource.class))), (SessionRepository) servicesRegistry.resolveService(new ServiceKey("", t.b(SessionRepository.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(DiagnosticEventRepository.class)), b.b(new a<DiagnosticEventRepository>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.76
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final DiagnosticEventRepository invoke() {
                        return new AndroidDiagnosticEventRepository((CoroutineTimer) servicesRegistry.resolveService(new ServiceKey("", t.b(CoroutineTimer.class))), (GetDiagnosticEventRequest) servicesRegistry.resolveService(new ServiceKey("", t.b(GetDiagnosticEventRequest.class))), (h0) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, t.b(h0.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(LegacyUserConsentRepository.class)), b.b(new a<LegacyUserConsentRepository>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.77
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final LegacyUserConsentRepository invoke() {
                        return new AndroidLegacyUserConsentRepository((LegacyUserConsentDataSource) servicesRegistry.resolveService(new ServiceKey("", t.b(LegacyUserConsentDataSource.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(MediationRepository.class)), b.b(new a<MediationRepository>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.78
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final MediationRepository invoke() {
                        return new AndroidMediationRepository((MediationDataSource) servicesRegistry.resolveService(new ServiceKey("", t.b(MediationDataSource.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(OpenMeasurementRepository.class)), b.b(new a<OpenMeasurementRepository>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.79
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final OpenMeasurementRepository invoke() {
                        return new AndroidOpenMeasurementRepository((h0) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.MAIN_DISPATCHER, t.b(h0.class))), (OmidManager) servicesRegistry.resolveService(new ServiceKey("", t.b(OmidManager.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(SessionRepository.class)), b.b(new a<SessionRepository>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.80
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final SessionRepository invoke() {
                        return new AndroidSessionRepository((ByteStringDataSource) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_GATEWAY_CACHE, t.b(ByteStringDataSource.class))), (ByteStringDataSource) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_PRIVACY, t.b(ByteStringDataSource.class))), (ByteStringDataSource) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_PRIVACY_FSM, t.b(ByteStringDataSource.class))), (ByteStringDataSource) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_NATIVE_CONFIG, t.b(ByteStringDataSource.class))), (AndroidUnityInfoDataSource) servicesRegistry.resolveService(new ServiceKey("", t.b(AndroidUnityInfoDataSource.class))), (NativeConfigurationOuterClass.NativeConfiguration) servicesRegistry.resolveService(new ServiceKey("", t.b(NativeConfigurationOuterClass.NativeConfiguration.class))), (h0) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, t.b(h0.class))), (SendDiagnosticEvent) servicesRegistry.resolveService(new ServiceKey("", t.b(SendDiagnosticEvent.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(TransactionEventRepository.class)), b.b(new a<TransactionEventRepository>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.81
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final TransactionEventRepository invoke() {
                        return new AndroidTransactionEventRepository();
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(OperativeEventRepository.class)), b.b(new a<OperativeEventRepository>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.82
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final OperativeEventRepository invoke() {
                        return new OperativeEventRepository();
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(ExecuteAdViewerRequest.class)), b.b(new a<ExecuteAdViewerRequest>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.83
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final ExecuteAdViewerRequest invoke() {
                        return new AndroidExecuteAdViewerRequest((h0) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, t.b(h0.class))), (HttpClientProvider) servicesRegistry.resolveService(new ServiceKey("", t.b(HttpClientProvider.class))), (GetCachedAsset) servicesRegistry.resolveService(new ServiceKey("", t.b(GetCachedAsset.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(GetByteStringId.class)), b.b(new a<GetByteStringId>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.84
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final GetByteStringId invoke() {
                        return new AndroidGenerateByteStringId();
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(IntentCreation.class)), ServiceFactoryKt.factoryOf(new a<IntentCreation>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.85
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final IntentCreation invoke() {
                        return new AndroidIntentCreation();
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(HandleOpenUrl.class)), ServiceFactoryKt.factoryOf(new a<HandleOpenUrl>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.86
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final HandleOpenUrl invoke() {
                        return new AndroidHandleOpenUrl((Context) servicesRegistry.resolveService(new ServiceKey("", t.b(Context.class))), (IntentCreation) servicesRegistry.resolveService(new ServiceKey("", t.b(IntentCreation.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(Refresh.class)), b.b(new a<Refresh>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.87
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final Refresh invoke() {
                        return new AndroidRefresh((h0) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, t.b(h0.class))), (GetAdDataRefreshRequest) servicesRegistry.resolveService(new ServiceKey("", t.b(GetAdDataRefreshRequest.class))), (GetRequestPolicy) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.NAMED_AD_REQ, t.b(GetRequestPolicy.class))), (GatewayClient) servicesRegistry.resolveService(new ServiceKey("", t.b(GatewayClient.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(SendDiagnosticEvent.class)), b.b(new a<SendDiagnosticEvent>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.88
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final SendDiagnosticEvent invoke() {
                        return new AndroidSendDiagnosticEvent((DiagnosticEventRepository) servicesRegistry.resolveService(new ServiceKey("", t.b(DiagnosticEventRepository.class))), (GetDiagnosticEventRequest) servicesRegistry.resolveService(new ServiceKey("", t.b(GetDiagnosticEventRequest.class))), (LifecycleDataSource) servicesRegistry.resolveService(new ServiceKey("", t.b(LifecycleDataSource.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(SendWebViewClientErrorDiagnostics.class)), b.b(new a<SendWebViewClientErrorDiagnostics>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.89
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final SendWebViewClientErrorDiagnostics invoke() {
                        return new AndroidSendWebViewClientErrorDiagnostics((SendDiagnosticEvent) servicesRegistry.resolveService(new ServiceKey("", t.b(SendDiagnosticEvent.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(Show.class)), b.b(new a<Show>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.90
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final Show invoke() {
                        return new AndroidShow((AdRepository) servicesRegistry.resolveService(new ServiceKey("", t.b(AdRepository.class))), (GameServerIdReader) servicesRegistry.resolveService(new ServiceKey("", t.b(GameServerIdReader.class))), (SendDiagnosticEvent) servicesRegistry.resolveService(new ServiceKey("", t.b(SendDiagnosticEvent.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(CacheFile.class)), b.b(new a<CacheFile>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.91
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final CacheFile invoke() {
                        return new CommonCacheFile((CacheRepository) servicesRegistry.resolveService(new ServiceKey("", t.b(CacheRepository.class))), (SendDiagnosticEvent) servicesRegistry.resolveService(new ServiceKey("", t.b(SendDiagnosticEvent.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(CleanAssets.class)), b.b(new a<CleanAssets>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.92
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final CleanAssets invoke() {
                        return new CommonCleanAssets((CacheRepository) servicesRegistry.resolveService(new ServiceKey("", t.b(CacheRepository.class))), (SendDiagnosticEvent) servicesRegistry.resolveService(new ServiceKey("", t.b(SendDiagnosticEvent.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(GetAdObject.class)), b.b(new a<GetAdObject>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.93
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final GetAdObject invoke() {
                        return new CommonGetAdObject((AdRepository) servicesRegistry.resolveService(new ServiceKey("", t.b(AdRepository.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(ScarEligibleEffectiveUseCase.class)), ServiceFactoryKt.factoryOf(new a<ScarEligibleEffectiveUseCase>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.94
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final ScarEligibleEffectiveUseCase invoke() {
                        return new CommonScarEligibleEffectiveUseCase((SessionRepository) servicesRegistry.resolveService(new ServiceKey("", t.b(SessionRepository.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(GetHeaderBiddingToken.class)), ServiceFactoryKt.factoryOf(new a<GetHeaderBiddingToken>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.95
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final GetHeaderBiddingToken invoke() {
                        return new CommonGetHeaderBiddingToken((BuildHeaderBiddingToken) servicesRegistry.resolveService(new ServiceKey("", t.b(BuildHeaderBiddingToken.class))), (FetchSignalsAndSendUseCase) servicesRegistry.resolveService(new ServiceKey("", t.b(FetchSignalsAndSendUseCase.class))), (ScarEligibleEffectiveUseCase) servicesRegistry.resolveService(new ServiceKey("", t.b(ScarEligibleEffectiveUseCase.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(BuildHeaderBiddingToken.class)), ServiceFactoryKt.factoryOf(new a<BuildHeaderBiddingToken>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.96
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final BuildHeaderBiddingToken invoke() {
                        return new AndroidBuildHeaderBiddingToken((GetByteStringId) servicesRegistry.resolveService(new ServiceKey("", t.b(GetByteStringId.class))), (GetClientInfo) servicesRegistry.resolveService(new ServiceKey("", t.b(GetClientInfo.class))), (GetSharedDataTimestamps) servicesRegistry.resolveService(new ServiceKey("", t.b(GetSharedDataTimestamps.class))), (GetLimitedSessionToken) servicesRegistry.resolveService(new ServiceKey("", t.b(GetLimitedSessionToken.class))), (GetInitializationData) servicesRegistry.resolveService(new ServiceKey("", t.b(GetInitializationData.class))), (DeviceInfoRepository) servicesRegistry.resolveService(new ServiceKey("", t.b(DeviceInfoRepository.class))), (SessionRepository) servicesRegistry.resolveService(new ServiceKey("", t.b(SessionRepository.class))), (CampaignRepository) servicesRegistry.resolveService(new ServiceKey("", t.b(CampaignRepository.class))), (TcfRepository) servicesRegistry.resolveService(new ServiceKey("", t.b(TcfRepository.class))), (AndroidTestDataInfo) servicesRegistry.resolveService(new ServiceKey("", t.b(AndroidTestDataInfo.class))), (OfferwallManager) servicesRegistry.resolveService(new ServiceKey("", t.b(OfferwallManager.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(TokenNumberProvider.class)), ServiceFactoryKt.factoryOf(new a<TokenNumberProvider>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.97
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final TokenNumberProvider invoke() {
                        return new CommonTokenNumberProvider((SessionRepository) servicesRegistry.resolveService(new ServiceKey("", t.b(SessionRepository.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(GetInitializationData.class)), b.b(new a<GetInitializationData>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.98
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final GetInitializationData invoke() {
                        return new AndroidGetInitializationData((GetInitializationRequestPayload) servicesRegistry.resolveService(new ServiceKey("", t.b(GetInitializationRequestPayload.class))), (GetUniversalRequestSharedData) servicesRegistry.resolveService(new ServiceKey("", t.b(GetUniversalRequestSharedData.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(MediationInitBlobMetadataReader.class)), ServiceFactoryKt.factoryOf(new a<MediationInitBlobMetadataReader>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.99
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final MediationInitBlobMetadataReader invoke() {
                        return new MediationInitBlobMetadataReader((JsonStorage) servicesRegistry.resolveService(new ServiceKey("MEMORY", t.b(JsonStorage.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(GetInitializationRequestPayload.class)), b.b(new a<GetInitializationRequestPayload>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.100
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final GetInitializationRequestPayload invoke() {
                        return new AndroidGetInitializationRequestPayload((GetClientInfo) servicesRegistry.resolveService(new ServiceKey("", t.b(GetClientInfo.class))), (SessionRepository) servicesRegistry.resolveService(new ServiceKey("", t.b(SessionRepository.class))), (DeviceInfoRepository) servicesRegistry.resolveService(new ServiceKey("", t.b(DeviceInfoRepository.class))), (LegacyUserConsentRepository) servicesRegistry.resolveService(new ServiceKey("", t.b(LegacyUserConsentRepository.class))), (MediationInitBlobMetadataReader) servicesRegistry.resolveService(new ServiceKey("", t.b(MediationInitBlobMetadataReader.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(GetInitializationState.class)), b.b(new a<GetInitializationState>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.101
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final GetInitializationState invoke() {
                        return new CommonGetInitializationState((SessionRepository) servicesRegistry.resolveService(new ServiceKey("", t.b(SessionRepository.class))), (SDKPropertiesManager) servicesRegistry.resolveService(new ServiceKey("", t.b(SDKPropertiesManager.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(GetIsFileCache.class)), b.b(new a<GetIsFileCache>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.102
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final GetIsFileCache invoke() {
                        return new CommonGetIsFileCache((CacheRepository) servicesRegistry.resolveService(new ServiceKey("", t.b(CacheRepository.class))), (SendDiagnosticEvent) servicesRegistry.resolveService(new ServiceKey("", t.b(SendDiagnosticEvent.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(SetInitializationState.class)), b.b(new a<SetInitializationState>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.103
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final SetInitializationState invoke() {
                        return new CommonSetInitializationState((SessionRepository) servicesRegistry.resolveService(new ServiceKey("", t.b(SessionRepository.class))), (SDKPropertiesManager) servicesRegistry.resolveService(new ServiceKey("", t.b(SDKPropertiesManager.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(ServiceProvider.NAMED_AD_REQ, t.b(GetRequestPolicy.class)), b.b(new a<GetRequestPolicy>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.104
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final GetRequestPolicy invoke() {
                        return new AndroidGetAdRequestPolicy((SessionRepository) servicesRegistry.resolveService(new ServiceKey("", t.b(SessionRepository.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(GetAdDataRefreshRequest.class)), b.b(new a<GetAdDataRefreshRequest>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.105
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final GetAdDataRefreshRequest invoke() {
                        return new AndroidGetAdDataRefreshRequest((GetUniversalRequestForPayLoad) servicesRegistry.resolveService(new ServiceKey("", t.b(GetUniversalRequestForPayLoad.class))), (SessionRepository) servicesRegistry.resolveService(new ServiceKey("", t.b(SessionRepository.class))), (DeviceInfoRepository) servicesRegistry.resolveService(new ServiceKey("", t.b(DeviceInfoRepository.class))), (CampaignRepository) servicesRegistry.resolveService(new ServiceKey("", t.b(CampaignRepository.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(GetAdPlayerConfigRequest.class)), b.b(new a<GetAdPlayerConfigRequest>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.106
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final GetAdPlayerConfigRequest invoke() {
                        return new AndroidGetAdPlayerConfigRequest((GetUniversalRequestForPayLoad) servicesRegistry.resolveService(new ServiceKey("", t.b(GetUniversalRequestForPayLoad.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(AndroidGetAdPlayerContext.class)), b.b(new a<AndroidGetAdPlayerContext>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.107
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final AndroidGetAdPlayerContext invoke() {
                        return new AndroidGetAdPlayerContext((DeviceInfoRepository) servicesRegistry.resolveService(new ServiceKey("", t.b(DeviceInfoRepository.class))), (SessionRepository) servicesRegistry.resolveService(new ServiceKey("", t.b(SessionRepository.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(GetAdRequest.class)), b.b(new a<GetAdRequest>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.108
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final GetAdRequest invoke() {
                        return new AndroidGetAdRequest((GetUniversalRequestForPayLoad) servicesRegistry.resolveService(new ServiceKey("", t.b(GetUniversalRequestForPayLoad.class))), (SessionRepository) servicesRegistry.resolveService(new ServiceKey("", t.b(SessionRepository.class))), (DeviceInfoRepository) servicesRegistry.resolveService(new ServiceKey("", t.b(DeviceInfoRepository.class))), (CampaignRepository) servicesRegistry.resolveService(new ServiceKey("", t.b(CampaignRepository.class))), (WebviewConfigurationDataSource) servicesRegistry.resolveService(new ServiceKey("", t.b(WebviewConfigurationDataSource.class))), (TcfRepository) servicesRegistry.resolveService(new ServiceKey("", t.b(TcfRepository.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(GetHbTokenEventRequest.class)), b.b(new a<GetHbTokenEventRequest>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.109
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final GetHbTokenEventRequest invoke() {
                        return new GetAndroidTokenEventRequest();
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(CommonScarEventReceiver.class)), b.b(new a<CommonScarEventReceiver>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.110
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final CommonScarEventReceiver invoke() {
                        return new CommonScarEventReceiver((l0) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.NAMED_SCAR_SCOPE, t.b(l0.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(GMAScarAdapterBridge.class)), b.b(new a<GMAScarAdapterBridge>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.111
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final GMAScarAdapterBridge invoke() {
                        GMAScarAdapterBridge bridge = GMA.getInstance(new GMAEventSender((IEventSender) servicesRegistry.resolveService(new ServiceKey("", t.b(CommonScarEventReceiver.class))))).getBridge();
                        p.j(bridge, "getInstance(GMAEventSend…EventReceiver>())).bridge");
                        return bridge;
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(ScarTimeHackFixer.class)), b.b(new a<ScarTimeHackFixer>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.112
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final ScarTimeHackFixer invoke() {
                        return new ScarTimeHackFixer((SendDiagnosticEvent) servicesRegistry.resolveService(new ServiceKey("", t.b(SendDiagnosticEvent.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(ScarManager.class)), b.b(new a<ScarManager>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.113
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final ScarManager invoke() {
                        return new AndroidScarManager((CommonScarEventReceiver) servicesRegistry.resolveService(new ServiceKey("", t.b(CommonScarEventReceiver.class))), (GMAScarAdapterBridge) servicesRegistry.resolveService(new ServiceKey("", t.b(GMAScarAdapterBridge.class))), (ScarTimeHackFixer) servicesRegistry.resolveService(new ServiceKey("", t.b(ScarTimeHackFixer.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(FetchSignalsAndSendUseCase.class)), b.b(new a<FetchSignalsAndSendUseCase>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.114
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final FetchSignalsAndSendUseCase invoke() {
                        return new AndroidFetchSignalsAndSendUseCase((l0) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.NAMED_SCAR_SCOPE, t.b(l0.class))), (ScarManager) servicesRegistry.resolveService(new ServiceKey("", t.b(ScarManager.class))), (HandleGetTokenRequest) servicesRegistry.resolveService(new ServiceKey("", t.b(HandleGetTokenRequest.class))), (SendDiagnosticEvent) servicesRegistry.resolveService(new ServiceKey("", t.b(SendDiagnosticEvent.class))), (ScarEligibleEffectiveUseCase) servicesRegistry.resolveService(new ServiceKey("", t.b(ScarEligibleEffectiveUseCase.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(LoadScarAd.class)), b.b(new a<LoadScarAd>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.115
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final LoadScarAd invoke() {
                        return new LoadScarAd((ScarManager) servicesRegistry.resolveService(new ServiceKey("", t.b(ScarManager.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(HandleGetTokenRequest.class)), b.b(new a<HandleGetTokenRequest>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.116
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final HandleGetTokenRequest invoke() {
                        return new HandleAndroidGetTokenRequest((GetUniversalRequestForPayLoad) servicesRegistry.resolveService(new ServiceKey("", t.b(GetUniversalRequestForPayLoad.class))), (GetHbTokenEventRequest) servicesRegistry.resolveService(new ServiceKey("", t.b(GetHbTokenEventRequest.class))), (GetRequestPolicy) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.NAMED_OTHER_REQ, t.b(GetRequestPolicy.class))), (GatewayClient) servicesRegistry.resolveService(new ServiceKey("", t.b(GatewayClient.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(GetClientInfo.class)), b.b(new a<GetClientInfo>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.117
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final GetClientInfo invoke() {
                        return new AndroidGetClientInfo((SessionRepository) servicesRegistry.resolveService(new ServiceKey("", t.b(SessionRepository.class))), (MediationRepository) servicesRegistry.resolveService(new ServiceKey("", t.b(MediationRepository.class))), (OmidManager) servicesRegistry.resolveService(new ServiceKey("", t.b(OmidManager.class))), (ScarManager) servicesRegistry.resolveService(new ServiceKey("", t.b(ScarManager.class))), (OfferwallManager) servicesRegistry.resolveService(new ServiceKey("", t.b(OfferwallManager.class))), (FIdExistenceDataSource) servicesRegistry.resolveService(new ServiceKey("", t.b(FIdExistenceDataSource.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(GetInitializationCompletedRequest.class)), b.b(new a<GetInitializationCompletedRequest>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.118
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final GetInitializationCompletedRequest invoke() {
                        return new AndroidGetInitializationCompletedRequest((GetUniversalRequestForPayLoad) servicesRegistry.resolveService(new ServiceKey("", t.b(GetUniversalRequestForPayLoad.class))), (DeviceInfoRepository) servicesRegistry.resolveService(new ServiceKey("", t.b(DeviceInfoRepository.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(GetInitializationRequest.class)), b.b(new a<GetInitializationRequest>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.119
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final GetInitializationRequest invoke() {
                        return new AndroidGetInitializationRequest((GetInitializationRequestPayload) servicesRegistry.resolveService(new ServiceKey("", t.b(GetInitializationRequestPayload.class))), (GetUniversalRequestForPayLoad) servicesRegistry.resolveService(new ServiceKey("", t.b(GetUniversalRequestForPayLoad.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(GetLimitedSessionToken.class)), b.b(new a<GetLimitedSessionToken>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.120
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final GetLimitedSessionToken invoke() {
                        return new AndroidGetLimitedSessionToken((DeviceInfoRepository) servicesRegistry.resolveService(new ServiceKey("", t.b(DeviceInfoRepository.class))), (SessionRepository) servicesRegistry.resolveService(new ServiceKey("", t.b(SessionRepository.class))), (MediationRepository) servicesRegistry.resolveService(new ServiceKey("", t.b(MediationRepository.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(GetOpenGLRendererInfo.class)), b.b(new a<GetOpenGLRendererInfo>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.121
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final GetOpenGLRendererInfo invoke() {
                        return new AndroidGetOpenGLRendererInfo((SessionRepository) servicesRegistry.resolveService(new ServiceKey("", t.b(SessionRepository.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(GetSharedDataTimestamps.class)), b.b(new a<GetSharedDataTimestamps>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.122
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final GetSharedDataTimestamps invoke() {
                        return new AndroidGetSharedDataTimestamps();
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(GetUniversalRequestForPayLoad.class)), b.b(new a<GetUniversalRequestForPayLoad>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.123
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final GetUniversalRequestForPayLoad invoke() {
                        return new AndroidGetUniversalRequestForPayLoad((GetUniversalRequestSharedData) servicesRegistry.resolveService(new ServiceKey("", t.b(GetUniversalRequestSharedData.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(GetUniversalRequestSharedData.class)), b.b(new a<GetUniversalRequestSharedData>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.124
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final GetUniversalRequestSharedData invoke() {
                        return new AndroidGetUniversalRequestSharedData((GetSharedDataTimestamps) servicesRegistry.resolveService(new ServiceKey("", t.b(GetSharedDataTimestamps.class))), (SessionRepository) servicesRegistry.resolveService(new ServiceKey("", t.b(SessionRepository.class))), (DeviceInfoRepository) servicesRegistry.resolveService(new ServiceKey("", t.b(DeviceInfoRepository.class))), (GetLimitedSessionToken) servicesRegistry.resolveService(new ServiceKey("", t.b(GetLimitedSessionToken.class))), (DeveloperConsentRepository) servicesRegistry.resolveService(new ServiceKey("", t.b(DeveloperConsentRepository.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(GetCachedAsset.class)), b.b(new a<GetCachedAsset>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.125
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final GetCachedAsset invoke() {
                        return new GetCachedAsset((CacheRepository) servicesRegistry.resolveService(new ServiceKey("", t.b(CacheRepository.class))), (Context) servicesRegistry.resolveService(new ServiceKey("", t.b(Context.class))), (CacheWebViewAssets) servicesRegistry.resolveService(new ServiceKey("", t.b(CacheWebViewAssets.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(GetWebViewBridgeUseCase.class)), b.b(new a<GetWebViewBridgeUseCase>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.126
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final GetWebViewBridgeUseCase invoke() {
                        return new CommonGetWebViewBridgeUseCase((h0) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, t.b(h0.class))), (SendDiagnosticEvent) servicesRegistry.resolveService(new ServiceKey("", t.b(SendDiagnosticEvent.class))), (Logger) servicesRegistry.resolveService(new ServiceKey("", t.b(Logger.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(ServiceProvider.NAMED_INIT_REQ, t.b(GetRequestPolicy.class)), b.b(new a<GetRequestPolicy>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.127
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final GetRequestPolicy invoke() {
                        return new GetInitRequestPolicy((SessionRepository) servicesRegistry.resolveService(new ServiceKey("", t.b(SessionRepository.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(GetLatestWebViewConfiguration.class)), b.b(new a<GetLatestWebViewConfiguration>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.128
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final GetLatestWebViewConfiguration invoke() {
                        return new GetLatestWebViewConfiguration((WebviewConfigurationDataSource) servicesRegistry.resolveService(new ServiceKey("", t.b(WebviewConfigurationDataSource.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(ServiceProvider.NAMED_OPERATIVE_REQ, t.b(GetRequestPolicy.class)), b.b(new a<GetRequestPolicy>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.129
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final GetRequestPolicy invoke() {
                        return new GetOperativeEventRequestPolicy((SessionRepository) servicesRegistry.resolveService(new ServiceKey("", t.b(SessionRepository.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(ServiceProvider.NAMED_OTHER_REQ, t.b(GetRequestPolicy.class)), b.b(new a<GetRequestPolicy>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.130
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final GetRequestPolicy invoke() {
                        return new GetOtherRequestPolicy((SessionRepository) servicesRegistry.resolveService(new ServiceKey("", t.b(SessionRepository.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(GetPrivacyUpdateRequest.class)), b.b(new a<GetPrivacyUpdateRequest>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.131
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final GetPrivacyUpdateRequest invoke() {
                        return new GetPrivacyUpdateRequest((GetUniversalRequestForPayLoad) servicesRegistry.resolveService(new ServiceKey("", t.b(GetUniversalRequestForPayLoad.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(HandleGatewayInitializationResponse.class)), b.b(new a<HandleGatewayInitializationResponse>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.132
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final HandleGatewayInitializationResponse invoke() {
                        return new AndroidHandleGatewayInitializationResponse((TransactionEventManager) servicesRegistry.resolveService(new ServiceKey("", t.b(TransactionEventManager.class))), (TriggerInitializationCompletedRequest) servicesRegistry.resolveService(new ServiceKey("", t.b(TriggerInitializationCompletedRequest.class))), (SessionRepository) servicesRegistry.resolveService(new ServiceKey("", t.b(SessionRepository.class))), (l0) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.NAMED_INIT_SCOPE, t.b(l0.class))), (HandleDebugSettings) servicesRegistry.resolveService(new ServiceKey("", t.b(HandleDebugSettings.class))), (GetSafeguardedInitializationPolicy) servicesRegistry.resolveService(new ServiceKey("", t.b(GetSafeguardedInitializationPolicy.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(HandleGatewayUniversalResponse.class)), b.b(new a<HandleGatewayUniversalResponse>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.133
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final HandleGatewayUniversalResponse invoke() {
                        return new AndroidHandleGatewayUniversalResponse((SessionRepository) servicesRegistry.resolveService(new ServiceKey("", t.b(SessionRepository.class))), (DeviceInfoRepository) servicesRegistry.resolveService(new ServiceKey("", t.b(DeviceInfoRepository.class))), (AndroidAppSetIdDataSource) servicesRegistry.resolveService(new ServiceKey("", t.b(AndroidAppSetIdDataSource.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(InitializeBoldSDK.class)), b.b(new a<InitializeBoldSDK>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.134
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final InitializeBoldSDK invoke() {
                        return new AndroidInitializeBoldSDK((h0) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, t.b(h0.class))), (InitializeOMSDK) servicesRegistry.resolveService(new ServiceKey("", t.b(InitializeOMSDK.class))), (GetInitializationRequest) servicesRegistry.resolveService(new ServiceKey("", t.b(GetInitializationRequest.class))), (GetRequestPolicy) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.NAMED_INIT_REQ, t.b(GetRequestPolicy.class))), (CleanAssets) servicesRegistry.resolveService(new ServiceKey("", t.b(CleanAssets.class))), (HandleGatewayInitializationResponse) servicesRegistry.resolveService(new ServiceKey("", t.b(HandleGatewayInitializationResponse.class))), (GatewayClient) servicesRegistry.resolveService(new ServiceKey("", t.b(GatewayClient.class))), (SessionRepository) servicesRegistry.resolveService(new ServiceKey("", t.b(SessionRepository.class))), (EventObservers) servicesRegistry.resolveService(new ServiceKey("", t.b(EventObservers.class))), (TriggerInitializeListener) servicesRegistry.resolveService(new ServiceKey("", t.b(TriggerInitializeListener.class))), (SendDiagnosticEvent) servicesRegistry.resolveService(new ServiceKey("", t.b(SendDiagnosticEvent.class))), (DiagnosticEventRepository) servicesRegistry.resolveService(new ServiceKey("", t.b(DiagnosticEventRepository.class))), (StorageManager) servicesRegistry.resolveService(new ServiceKey("", t.b(StorageManager.class))), (ConfigurationReader) servicesRegistry.resolveService(new ServiceKey("", t.b(ConfigurationReader.class))), (SDKPropertiesManager) servicesRegistry.resolveService(new ServiceKey("", t.b(SDKPropertiesManager.class))), (GetGameId) servicesRegistry.resolveService(new ServiceKey("", t.b(GetGameId.class))), (Logger) servicesRegistry.resolveService(new ServiceKey("", t.b(Logger.class))), (AndroidHandleFocusCounters) servicesRegistry.resolveService(new ServiceKey("", t.b(AndroidHandleFocusCounters.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(LegacyShowUseCase.class)), ServiceFactoryKt.factoryOf(new a<LegacyShowUseCase>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.135
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final LegacyShowUseCase invoke() {
                        return new LegacyShowUseCase((Show) servicesRegistry.resolveService(new ServiceKey("", t.b(Show.class))), (AdRepository) servicesRegistry.resolveService(new ServiceKey("", t.b(AdRepository.class))), (SendDiagnosticEvent) servicesRegistry.resolveService(new ServiceKey("", t.b(SendDiagnosticEvent.class))), (GetOperativeEventApi) servicesRegistry.resolveService(new ServiceKey("", t.b(GetOperativeEventApi.class))), (GetInitializationState) servicesRegistry.resolveService(new ServiceKey("", t.b(GetInitializationState.class))), (SessionRepository) servicesRegistry.resolveService(new ServiceKey("", t.b(SessionRepository.class))), (SafeCallbackInvoke) servicesRegistry.resolveService(new ServiceKey("", t.b(SafeCallbackInvoke.class))), (Logger) servicesRegistry.resolveService(new ServiceKey("", t.b(Logger.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(SendPrivacyUpdateRequest.class)), b.b(new a<SendPrivacyUpdateRequest>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.136
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final SendPrivacyUpdateRequest invoke() {
                        return new SendPrivacyUpdateRequest((GetPrivacyUpdateRequest) servicesRegistry.resolveService(new ServiceKey("", t.b(GetPrivacyUpdateRequest.class))), (GetRequestPolicy) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.NAMED_OTHER_REQ, t.b(GetRequestPolicy.class))), (GatewayClient) servicesRegistry.resolveService(new ServiceKey("", t.b(GatewayClient.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(TriggerInitializationCompletedRequest.class)), b.b(new a<TriggerInitializationCompletedRequest>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.137
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final TriggerInitializationCompletedRequest invoke() {
                        return new AndroidTriggerInitializationCompletedRequest((GetInitializationCompletedRequest) servicesRegistry.resolveService(new ServiceKey("", t.b(GetInitializationCompletedRequest.class))), (GetRequestPolicy) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.NAMED_INIT_REQ, t.b(GetRequestPolicy.class))), (GatewayClient) servicesRegistry.resolveService(new ServiceKey("", t.b(GatewayClient.class))), (SendDiagnosticEvent) servicesRegistry.resolveService(new ServiceKey("", t.b(SendDiagnosticEvent.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(TriggerInitializeListener.class)), b.b(new a<TriggerInitializeListener>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.138
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final TriggerInitializeListener invoke() {
                        return new TriggerInitializeListener((h0) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.MAIN_DISPATCHER, t.b(h0.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(DiagnosticEventObserver.class)), b.b(new a<DiagnosticEventObserver>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.139
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final DiagnosticEventObserver invoke() {
                        return new DiagnosticEventObserver((GetUniversalRequestForPayLoad) servicesRegistry.resolveService(new ServiceKey("", t.b(GetUniversalRequestForPayLoad.class))), (GetDiagnosticEventBatchRequest) servicesRegistry.resolveService(new ServiceKey("", t.b(GetDiagnosticEventBatchRequest.class))), (h0) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, t.b(h0.class))), (DiagnosticEventRepository) servicesRegistry.resolveService(new ServiceKey("", t.b(DiagnosticEventRepository.class))), (UniversalRequestDataSource) servicesRegistry.resolveService(new ServiceKey("", t.b(UniversalRequestDataSource.class))), (BackgroundWorker) servicesRegistry.resolveService(new ServiceKey("", t.b(BackgroundWorker.class))), (UniversalRequestEventSender) servicesRegistry.resolveService(new ServiceKey("", t.b(UniversalRequestEventSender.class))), (GetRequestPolicy) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.NAMED_OTHER_REQ, t.b(GetRequestPolicy.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(EventObservers.class)), b.b(new a<EventObservers>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.140
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final EventObservers invoke() {
                        return new EventObservers((OperativeEventObserver) servicesRegistry.resolveService(new ServiceKey("", t.b(OperativeEventObserver.class))), (DiagnosticEventObserver) servicesRegistry.resolveService(new ServiceKey("", t.b(DiagnosticEventObserver.class))), (TransactionEventObserver) servicesRegistry.resolveService(new ServiceKey("", t.b(TransactionEventObserver.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(GetTransactionData.class)), b.b(new a<GetTransactionData>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.141
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final GetTransactionData invoke() {
                        return new AndroidGetTransactionData((GetByteStringId) servicesRegistry.resolveService(new ServiceKey("", t.b(GetByteStringId.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(GetTransactionRequest.class)), b.b(new a<GetTransactionRequest>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.142
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final GetTransactionRequest invoke() {
                        return new CommonGetTransactionRequest((DeviceInfoRepository) servicesRegistry.resolveService(new ServiceKey("", t.b(DeviceInfoRepository.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(GetDiagnosticEventBatchRequest.class)), b.b(new a<GetDiagnosticEventBatchRequest>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.143
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final GetDiagnosticEventBatchRequest invoke() {
                        return new GetDiagnosticEventBatchRequest();
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(GetDiagnosticEventRequest.class)), b.b(new a<GetDiagnosticEventRequest>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.144
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final GetDiagnosticEventRequest invoke() {
                        return new GetDiagnosticEventRequest((GetSharedDataTimestamps) servicesRegistry.resolveService(new ServiceKey("", t.b(GetSharedDataTimestamps.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(GetOperativeEventApi.class)), b.b(new a<GetOperativeEventApi>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.145
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final GetOperativeEventApi invoke() {
                        return new GetOperativeEventApi((OperativeEventRepository) servicesRegistry.resolveService(new ServiceKey("", t.b(OperativeEventRepository.class))), (GetOperativeEventRequest) servicesRegistry.resolveService(new ServiceKey("", t.b(GetOperativeEventRequest.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(GetOperativeEventRequest.class)), b.b(new a<GetOperativeEventRequest>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.146
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final GetOperativeEventRequest invoke() {
                        return new GetOperativeEventRequest((GetByteStringId) servicesRegistry.resolveService(new ServiceKey("", t.b(GetByteStringId.class))), (DeviceInfoRepository) servicesRegistry.resolveService(new ServiceKey("", t.b(DeviceInfoRepository.class))), (SessionRepository) servicesRegistry.resolveService(new ServiceKey("", t.b(SessionRepository.class))), (CampaignRepository) servicesRegistry.resolveService(new ServiceKey("", t.b(CampaignRepository.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(HandleGatewayEventResponse.class)), b.b(new a<HandleGatewayEventResponse>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.147
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final HandleGatewayEventResponse invoke() {
                        return new AndroidHandleGatewayEventResponse();
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(OperativeEventObserver.class)), b.b(new a<OperativeEventObserver>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.148
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final OperativeEventObserver invoke() {
                        return new OperativeEventObserver((GetUniversalRequestForPayLoad) servicesRegistry.resolveService(new ServiceKey("", t.b(GetUniversalRequestForPayLoad.class))), (h0) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, t.b(h0.class))), (OperativeEventRepository) servicesRegistry.resolveService(new ServiceKey("", t.b(OperativeEventRepository.class))), (UniversalRequestDataSource) servicesRegistry.resolveService(new ServiceKey("", t.b(UniversalRequestDataSource.class))), (BackgroundWorker) servicesRegistry.resolveService(new ServiceKey("", t.b(BackgroundWorker.class))), (UniversalRequestEventSender) servicesRegistry.resolveService(new ServiceKey("", t.b(UniversalRequestEventSender.class))), (GetRequestPolicy) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.NAMED_OPERATIVE_REQ, t.b(GetRequestPolicy.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(TransactionEventObserver.class)), b.b(new a<TransactionEventObserver>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.149
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final TransactionEventObserver invoke() {
                        return new TransactionEventObserver((GetUniversalRequestForPayLoad) servicesRegistry.resolveService(new ServiceKey("", t.b(GetUniversalRequestForPayLoad.class))), (l0) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.NAMED_TRANSACTION_SCOPE, t.b(l0.class))), (TransactionEventRepository) servicesRegistry.resolveService(new ServiceKey("", t.b(TransactionEventRepository.class))), (GatewayClient) servicesRegistry.resolveService(new ServiceKey("", t.b(GatewayClient.class))), (GetRequestPolicy) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.NAMED_OTHER_REQ, t.b(GetRequestPolicy.class))), (ByteStringDataSource) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_IAP_TRANSACTION, t.b(ByteStringDataSource.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(UniversalRequestTtlValidator.class)), b.b(new a<UniversalRequestTtlValidator>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.150
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final UniversalRequestTtlValidator invoke() {
                        return new CommonUniversalRequestTtlValidator();
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(UniversalRequestEventSender.class)), b.b(new a<UniversalRequestEventSender>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.151
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final UniversalRequestEventSender invoke() {
                        return new UniversalRequestEventSender((GatewayClient) servicesRegistry.resolveService(new ServiceKey("", t.b(GatewayClient.class))), (HandleGatewayEventResponse) servicesRegistry.resolveService(new ServiceKey("", t.b(HandleGatewayEventResponse.class))), (UniversalRequestTtlValidator) servicesRegistry.resolveService(new ServiceKey("", t.b(UniversalRequestTtlValidator.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(OmFinishSession.class)), b.b(new a<OmFinishSession>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.152
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final OmFinishSession invoke() {
                        return new AndroidOmFinishSession((OpenMeasurementRepository) servicesRegistry.resolveService(new ServiceKey("", t.b(OpenMeasurementRepository.class))), (SendDiagnosticEvent) servicesRegistry.resolveService(new ServiceKey("", t.b(SendDiagnosticEvent.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(OmImpressionOccurred.class)), b.b(new a<OmImpressionOccurred>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.153
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final OmImpressionOccurred invoke() {
                        return new AndroidOmImpressionOccurred((OpenMeasurementRepository) servicesRegistry.resolveService(new ServiceKey("", t.b(OpenMeasurementRepository.class))), (SendDiagnosticEvent) servicesRegistry.resolveService(new ServiceKey("", t.b(SendDiagnosticEvent.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(AndroidOmInteraction.class)), b.b(new a<AndroidOmInteraction>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.154
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final AndroidOmInteraction invoke() {
                        return new AndroidOmStartSession((OpenMeasurementRepository) servicesRegistry.resolveService(new ServiceKey("", t.b(OpenMeasurementRepository.class))), (SendDiagnosticEvent) servicesRegistry.resolveService(new ServiceKey("", t.b(SendDiagnosticEvent.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(GetOmData.class)), b.b(new a<GetOmData>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.155
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final GetOmData invoke() {
                        return new CommonGetOmData((OpenMeasurementRepository) servicesRegistry.resolveService(new ServiceKey("", t.b(OpenMeasurementRepository.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(IsOMActivated.class)), b.b(new a<IsOMActivated>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.156
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final IsOMActivated invoke() {
                        return new CommonIsOMActivated((OpenMeasurementRepository) servicesRegistry.resolveService(new ServiceKey("", t.b(OpenMeasurementRepository.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(InitializeOMSDK.class)), b.b(new a<InitializeOMSDK>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.157
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final InitializeOMSDK invoke() {
                        return new AndroidInitializeOMSDK((Context) servicesRegistry.resolveService(new ServiceKey("", t.b(Context.class))), (SendDiagnosticEvent) servicesRegistry.resolveService(new ServiceKey("", t.b(SendDiagnosticEvent.class))), (SessionRepository) servicesRegistry.resolveService(new ServiceKey("", t.b(SessionRepository.class))), (OpenMeasurementRepository) servicesRegistry.resolveService(new ServiceKey("", t.b(OpenMeasurementRepository.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(ServiceProvider.DEV_CONSENT_PRIVACY_RULES, t.b(FlattenerRulesUseCase.class)), b.b(new a<FlattenerRulesUseCase>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.158
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final FlattenerRulesUseCase invoke() {
                        return new DeveloperConsentFlattenerRulesUseCase();
                    }
                }));
                servicesRegistry.updateService(new ServiceKey(ServiceProvider.LEGACY_PRIVACY_RULES, t.b(FlattenerRulesUseCase.class)), b.b(new a<FlattenerRulesUseCase>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.159
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final FlattenerRulesUseCase invoke() {
                        return new LegacyUserConsentFlattenerRulesUseCase();
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(BackgroundWorker.class)), b.b(new a<BackgroundWorker>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.160
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final BackgroundWorker invoke() {
                        return new BackgroundWorker((Context) servicesRegistry.resolveService(new ServiceKey("", t.b(Context.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(DiagnosticEventRequestWorkModifier.class)), b.b(new a<DiagnosticEventRequestWorkModifier>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.161
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final DiagnosticEventRequestWorkModifier invoke() {
                        return new DiagnosticEventRequestWorkModifier((SessionRepository) servicesRegistry.resolveService(new ServiceKey("", t.b(SessionRepository.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(GatewayClient.class)), b.b(new a<GatewayClient>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.162
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final GatewayClient invoke() {
                        return new CommonGatewayClient((HttpClientProvider) servicesRegistry.resolveService(new ServiceKey("", t.b(HttpClientProvider.class))), (HandleGatewayUniversalResponse) servicesRegistry.resolveService(new ServiceKey("", t.b(HandleGatewayUniversalResponse.class))), (SendDiagnosticEvent) servicesRegistry.resolveService(new ServiceKey("", t.b(SendDiagnosticEvent.class))), (SessionRepository) servicesRegistry.resolveService(new ServiceKey("", t.b(SessionRepository.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("sdk", t.b(i0.class)), b.b(new a<i0>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.163
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final i0 invoke() {
                        return new SDKErrorHandler((h0) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, t.b(h0.class))), (AlternativeFlowReader) servicesRegistry.resolveService(new ServiceKey("", t.b(AlternativeFlowReader.class))), (SendDiagnosticEvent) servicesRegistry.resolveService(new ServiceKey("", t.b(SendDiagnosticEvent.class))), (SDKMetricsSender) servicesRegistry.resolveService(new ServiceKey("", t.b(SDKMetricsSender.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(TokenStorage.class)), b.b(new a<TokenStorage>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.164
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final TokenStorage invoke() {
                        return new InMemoryTokenStorage();
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(VolumeChange.class)), b.b(new a<VolumeChange>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.165
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final VolumeChange invoke() {
                        return new VolumeChangeContentObserver();
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(ConfigFileFromLocalStorage.class)), b.b(new a<ConfigFileFromLocalStorage>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.166
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final ConfigFileFromLocalStorage invoke() {
                        return new ConfigFileFromLocalStorage((ISDKDispatchers) servicesRegistry.resolveService(new ServiceKey("", t.b(ISDKDispatchers.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(InitializeSDK.class)), b.b(new a<InitializeSDK>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.167
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final InitializeSDK invoke() {
                        return new InitializeSDK((ISDKDispatchers) servicesRegistry.resolveService(new ServiceKey("", t.b(ISDKDispatchers.class))), (ConfigFileFromLocalStorage) servicesRegistry.resolveService(new ServiceKey("", t.b(ConfigFileFromLocalStorage.class))), (InitializeStateReset) servicesRegistry.resolveService(new ServiceKey("", t.b(InitializeStateReset.class))), (InitializeStateError) servicesRegistry.resolveService(new ServiceKey("", t.b(InitializeStateError.class))), (InitializeStateConfig) servicesRegistry.resolveService(new ServiceKey("", t.b(InitializeStateConfig.class))), (InitializeStateCreate) servicesRegistry.resolveService(new ServiceKey("", t.b(InitializeStateCreate.class))), (InitializeStateLoadCache) servicesRegistry.resolveService(new ServiceKey("", t.b(InitializeStateLoadCache.class))), (InitializeStateLoadWeb) servicesRegistry.resolveService(new ServiceKey("", t.b(InitializeStateLoadWeb.class))), (InitializeStateComplete) servicesRegistry.resolveService(new ServiceKey("", t.b(InitializeStateComplete.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(InitializeStateComplete.class)), b.b(new a<InitializeStateComplete>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.168
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final InitializeStateComplete invoke() {
                        return new InitializeStateComplete((DataStore) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_NATIVE_CONFIG, t.b(DataStore.class))), (ISDKDispatchers) servicesRegistry.resolveService(new ServiceKey("", t.b(ISDKDispatchers.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(InitializeStateConfig.class)), b.b(new a<InitializeStateConfig>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.169
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final InitializeStateConfig invoke() {
                        return new InitializeStateConfig((ISDKDispatchers) servicesRegistry.resolveService(new ServiceKey("", t.b(ISDKDispatchers.class))), (InitializeStateConfigWithLoader) servicesRegistry.resolveService(new ServiceKey("", t.b(InitializeStateConfigWithLoader.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(InitializeStateConfigWithLoader.class)), b.b(new a<InitializeStateConfigWithLoader>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.170
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final InitializeStateConfigWithLoader invoke() {
                        return new InitializeStateConfigWithLoader((ISDKDispatchers) servicesRegistry.resolveService(new ServiceKey("", t.b(ISDKDispatchers.class))), (InitializeStateNetworkError) servicesRegistry.resolveService(new ServiceKey("", t.b(InitializeStateNetworkError.class))), (TokenStorage) servicesRegistry.resolveService(new ServiceKey("", t.b(TokenStorage.class))), (SDKMetricsSender) servicesRegistry.resolveService(new ServiceKey("", t.b(SDKMetricsSender.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(InitializeStateCreate.class)), b.b(new a<InitializeStateCreate>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.171
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final InitializeStateCreate invoke() {
                        return new InitializeStateCreate((ISDKDispatchers) servicesRegistry.resolveService(new ServiceKey("", t.b(ISDKDispatchers.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(InitializeStateError.class)), b.b(new a<InitializeStateError>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.172
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final InitializeStateError invoke() {
                        return new InitializeStateError((ISDKDispatchers) servicesRegistry.resolveService(new ServiceKey("", t.b(ISDKDispatchers.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(InitializeStateLoadCache.class)), b.b(new a<InitializeStateLoadCache>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.173
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final InitializeStateLoadCache invoke() {
                        return new InitializeStateLoadCache((ISDKDispatchers) servicesRegistry.resolveService(new ServiceKey("", t.b(ISDKDispatchers.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(InitializeStateLoadWeb.class)), b.b(new a<InitializeStateLoadWeb>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.174
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final InitializeStateLoadWeb invoke() {
                        return new InitializeStateLoadWeb((ISDKDispatchers) servicesRegistry.resolveService(new ServiceKey("", t.b(ISDKDispatchers.class))), (InitializeStateNetworkError) servicesRegistry.resolveService(new ServiceKey("", t.b(InitializeStateNetworkError.class))), (HttpClientProvider) servicesRegistry.resolveService(new ServiceKey("", t.b(HttpClientProvider.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(InitializeStateReset.class)), b.b(new a<InitializeStateReset>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.175
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final InitializeStateReset invoke() {
                        return new InitializeStateReset((ISDKDispatchers) servicesRegistry.resolveService(new ServiceKey("", t.b(ISDKDispatchers.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(StoreMonitor.class)), b.b(new a<StoreMonitor>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.176
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final StoreMonitor invoke() {
                        return new StoreMonitor((StoreExceptionHandler) servicesRegistry.resolveService(new ServiceKey("", t.b(StoreExceptionHandler.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(StoreWebViewEventSender.class)), b.b(new a<StoreWebViewEventSender>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.177
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final StoreWebViewEventSender invoke() {
                        return new StoreWebViewEventSender((IEventSender) servicesRegistry.resolveService(new ServiceKey("", t.b(IEventSender.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(StoreExceptionHandler.class)), b.b(new a<StoreExceptionHandler>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.178
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final StoreExceptionHandler invoke() {
                        return new GatewayStoreExceptionHandler();
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(StoreEventListenerFactory.class)), b.b(new a<StoreEventListenerFactory>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.179
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final StoreEventListenerFactory invoke() {
                        return new StoreEventListenerFactory((StoreWebViewEventSender) servicesRegistry.resolveService(new ServiceKey("", t.b(StoreWebViewEventSender.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(ConfigurationReader.class)), b.b(new a<ConfigurationReader>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.180
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final ConfigurationReader invoke() {
                        return new ConfigurationReader();
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(AndroidAttribution.class)), b.b(new a<AndroidAttribution>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.181
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final AndroidAttribution invoke() {
                        return new AndroidAttribution((Context) servicesRegistry.resolveService(new ServiceKey("", t.b(Context.class))), (ISDKDispatchers) servicesRegistry.resolveService(new ServiceKey("", t.b(ISDKDispatchers.class))), (SessionRepository) servicesRegistry.resolveService(new ServiceKey("", t.b(SessionRepository.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(AdPlayerScope.class)), ServiceFactoryKt.factoryOf(new a<AdPlayerScope>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.182
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final AdPlayerScope invoke() {
                        return new AdPlayerScope((h0) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, t.b(h0.class))), (i0) servicesRegistry.resolveService(new ServiceKey("sdk", t.b(i0.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(AndroidWebViewClient.class)), ServiceFactoryKt.factoryOf(new a<AndroidWebViewClient>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.183
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final AndroidWebViewClient invoke() {
                        return new AndroidWebViewClient((GetCachedAsset) servicesRegistry.resolveService(new ServiceKey("", t.b(GetCachedAsset.class))), (SendDiagnosticEvent) servicesRegistry.resolveService(new ServiceKey("", t.b(SendDiagnosticEvent.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(AndroidGetWebViewContainerUseCase.class)), ServiceFactoryKt.factoryOf(new a<AndroidGetWebViewContainerUseCase>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.184
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final AndroidGetWebViewContainerUseCase invoke() {
                        return new AndroidGetWebViewContainerUseCase((Context) servicesRegistry.resolveService(new ServiceKey("", t.b(Context.class))), (AndroidWebViewClient) servicesRegistry.resolveService(new ServiceKey("", t.b(AndroidWebViewClient.class))), (SendWebViewClientErrorDiagnostics) servicesRegistry.resolveService(new ServiceKey("", t.b(SendWebViewClientErrorDiagnostics.class))), (h0) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.MAIN_DISPATCHER, t.b(h0.class))), (h0) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, t.b(h0.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(Load.class)), ServiceFactoryKt.factoryOf(new a<Load>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.185
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final Load invoke() {
                        return new AndroidLoad((h0) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, t.b(h0.class))), (GetAdRequest) servicesRegistry.resolveService(new ServiceKey("", t.b(GetAdRequest.class))), (GetAdPlayerConfigRequest) servicesRegistry.resolveService(new ServiceKey("", t.b(GetAdPlayerConfigRequest.class))), (GetRequestPolicy) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.NAMED_AD_REQ, t.b(GetRequestPolicy.class))), (HandleGatewayAdResponse) servicesRegistry.resolveService(new ServiceKey("", t.b(HandleGatewayAdResponse.class))), (SessionRepository) servicesRegistry.resolveService(new ServiceKey("", t.b(SessionRepository.class))), (GatewayClient) servicesRegistry.resolveService(new ServiceKey("", t.b(GatewayClient.class))), (AdRepository) servicesRegistry.resolveService(new ServiceKey("", t.b(AdRepository.class))), (SendDiagnosticEvent) servicesRegistry.resolveService(new ServiceKey("", t.b(SendDiagnosticEvent.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(AwaitInitialization.class)), ServiceFactoryKt.factoryOf(new a<AwaitInitialization>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.186
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final AwaitInitialization invoke() {
                        return new CommonAwaitInitialization((SessionRepository) servicesRegistry.resolveService(new ServiceKey("", t.b(SessionRepository.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(GetAsyncHeaderBiddingToken.class)), ServiceFactoryKt.factoryOf(new a<GetAsyncHeaderBiddingToken>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.187
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final GetAsyncHeaderBiddingToken invoke() {
                        return new CommonInitAwaitingGetHeaderBiddingToken((GetHeaderBiddingToken) servicesRegistry.resolveService(new ServiceKey("", t.b(GetHeaderBiddingToken.class))), (SendDiagnosticEvent) servicesRegistry.resolveService(new ServiceKey("", t.b(SendDiagnosticEvent.class))), (GetInitializationState) servicesRegistry.resolveService(new ServiceKey("", t.b(GetInitializationState.class))), (AwaitInitialization) servicesRegistry.resolveService(new ServiceKey("", t.b(AwaitInitialization.class))), (SessionRepository) servicesRegistry.resolveService(new ServiceKey("", t.b(SessionRepository.class))), (SafeCallbackInvoke) servicesRegistry.resolveService(new ServiceKey("", t.b(SafeCallbackInvoke.class))), (Logger) servicesRegistry.resolveService(new ServiceKey("", t.b(Logger.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(GetAdPlayer.class)), ServiceFactoryKt.factoryOf(new a<GetAdPlayer>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.188
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final GetAdPlayer invoke() {
                        return new CommonGetAdPlayer((DeviceInfoRepository) servicesRegistry.resolveService(new ServiceKey("", t.b(DeviceInfoRepository.class))), (SessionRepository) servicesRegistry.resolveService(new ServiceKey("", t.b(SessionRepository.class))), (SendDiagnosticEvent) servicesRegistry.resolveService(new ServiceKey("", t.b(SendDiagnosticEvent.class))), (h0) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, t.b(h0.class))), (l0) servicesRegistry.resolveService(new ServiceKey("", t.b(AdPlayerScope.class))), (OpenMeasurementRepository) servicesRegistry.resolveService(new ServiceKey("", t.b(OpenMeasurementRepository.class))), (ScarManager) servicesRegistry.resolveService(new ServiceKey("", t.b(ScarManager.class))), (OfferwallManager) servicesRegistry.resolveService(new ServiceKey("", t.b(OfferwallManager.class))), (AdRepository) servicesRegistry.resolveService(new ServiceKey("", t.b(AdRepository.class))), (LifecycleDataSource) servicesRegistry.resolveService(new ServiceKey("", t.b(LifecycleDataSource.class))), (OrientationRepository) servicesRegistry.resolveService(new ServiceKey("", t.b(OrientationRepository.class))), (Context) servicesRegistry.resolveService(new ServiceKey("", t.b(Context.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(CacheWebViewAssets.class)), b.b(new a<CacheWebViewAssets>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.189
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final CacheWebViewAssets invoke() {
                        return new AndroidCacheWebViewAssets((CacheRepository) servicesRegistry.resolveService(new ServiceKey("", t.b(CacheRepository.class))), (SessionRepository) servicesRegistry.resolveService(new ServiceKey("", t.b(SessionRepository.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(HandleGatewayAdResponse.class)), ServiceFactoryKt.factoryOf(new a<HandleGatewayAdResponse>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.190
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final HandleGatewayAdResponse invoke() {
                        return new AndroidHandleGatewayAdResponse((AdRepository) servicesRegistry.resolveService(new ServiceKey("", t.b(AdRepository.class))), (AndroidGetWebViewContainerUseCase) servicesRegistry.resolveService(new ServiceKey("", t.b(AndroidGetWebViewContainerUseCase.class))), (GetWebViewBridgeUseCase) servicesRegistry.resolveService(new ServiceKey("", t.b(GetWebViewBridgeUseCase.class))), (DeviceInfoRepository) servicesRegistry.resolveService(new ServiceKey("", t.b(DeviceInfoRepository.class))), (HandleInvocationsFromAdViewer) servicesRegistry.resolveService(new ServiceKey("", t.b(HandleInvocationsFromAdViewer.class))), (CampaignRepository) servicesRegistry.resolveService(new ServiceKey("", t.b(CampaignRepository.class))), (SendDiagnosticEvent) servicesRegistry.resolveService(new ServiceKey("", t.b(SendDiagnosticEvent.class))), (GetOperativeEventApi) servicesRegistry.resolveService(new ServiceKey("", t.b(GetOperativeEventApi.class))), (GetLatestWebViewConfiguration) servicesRegistry.resolveService(new ServiceKey("", t.b(GetLatestWebViewConfiguration.class))), (AdPlayerScope) servicesRegistry.resolveService(new ServiceKey("", t.b(AdPlayerScope.class))), (GetAdPlayer) servicesRegistry.resolveService(new ServiceKey("", t.b(GetAdPlayer.class))), (CacheWebViewAssets) servicesRegistry.resolveService(new ServiceKey("", t.b(CacheWebViewAssets.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(HandleInvocationsFromAdViewer.class)), ServiceFactoryKt.factoryOf(new a<HandleInvocationsFromAdViewer>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.191
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final HandleInvocationsFromAdViewer invoke() {
                        return new HandleInvocationsFromAdViewer();
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(LegacyLoadUseCase.class)), ServiceFactoryKt.factoryOf(new a<LegacyLoadUseCase>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.192
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final LegacyLoadUseCase invoke() {
                        return new LegacyLoadUseCase((Load) servicesRegistry.resolveService(new ServiceKey("", t.b(Load.class))), (SendDiagnosticEvent) servicesRegistry.resolveService(new ServiceKey("", t.b(SendDiagnosticEvent.class))), (GetInitializationState) servicesRegistry.resolveService(new ServiceKey("", t.b(GetInitializationState.class))), (AwaitInitialization) servicesRegistry.resolveService(new ServiceKey("", t.b(AwaitInitialization.class))), (SessionRepository) servicesRegistry.resolveService(new ServiceKey("", t.b(SessionRepository.class))), (AdRepository) servicesRegistry.resolveService(new ServiceKey("", t.b(AdRepository.class))), (SafeCallbackInvoke) servicesRegistry.resolveService(new ServiceKey("", t.b(SafeCallbackInvoke.class))), (CleanUpWhenOpportunityExpires) servicesRegistry.resolveService(new ServiceKey("", t.b(CleanUpWhenOpportunityExpires.class))), (Logger) servicesRegistry.resolveService(new ServiceKey("", t.b(Logger.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(SafeCallbackInvoke.class)), b.b(new a<SafeCallbackInvoke>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.193
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final SafeCallbackInvoke invoke() {
                        return new CommonSafeCallbackInvoke((h0) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.MAIN_DISPATCHER, t.b(h0.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(InitializeStateNetworkError.class)), ServiceFactoryKt.factoryOf(new a<InitializeStateNetworkError>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.194
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final InitializeStateNetworkError invoke() {
                        return new InitializeStateNetworkError((ISDKDispatchers) servicesRegistry.resolveService(new ServiceKey("", t.b(ISDKDispatchers.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(CoroutineTimer.class)), ServiceFactoryKt.factoryOf(new a<CoroutineTimer>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.195
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final CoroutineTimer invoke() {
                        return new CommonCoroutineTimer((h0) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, t.b(h0.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(IEventSender.class)), b.b(new a<IEventSender>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.196
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final IEventSender invoke() {
                        return SharedInstances.INSTANCE.getWebViewEventSender();
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(SetGameId.class)), b.b(new a<SetGameId>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.197
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final SetGameId invoke() {
                        return new CommonSetGameId((SessionRepository) servicesRegistry.resolveService(new ServiceKey("", t.b(SessionRepository.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(GetGameId.class)), b.b(new a<GetGameId>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.198
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final GetGameId invoke() {
                        return new CommonGetGameId((SessionRepository) servicesRegistry.resolveService(new ServiceKey("", t.b(SessionRepository.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(ValidateGameId.class)), b.b(new a<ValidateGameId>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.199
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final ValidateGameId invoke() {
                        return new CommonValidateGameId((GetGameId) servicesRegistry.resolveService(new ServiceKey("", t.b(GetGameId.class))), (SetGameId) servicesRegistry.resolveService(new ServiceKey("", t.b(SetGameId.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(ShouldAllowInitialization.class)), b.b(new a<ShouldAllowInitialization>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.200
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final ShouldAllowInitialization invoke() {
                        return new CommonShouldAllowInitialization((AlternativeFlowReader) servicesRegistry.resolveService(new ServiceKey("", t.b(AlternativeFlowReader.class))), (CheckForGameIdAndTestModeChanges) servicesRegistry.resolveService(new ServiceKey("", t.b(CheckForGameIdAndTestModeChanges.class))), (GetInitializationState) servicesRegistry.resolveService(new ServiceKey("", t.b(GetInitializationState.class))), (SetInitializationState) servicesRegistry.resolveService(new ServiceKey("", t.b(SetInitializationState.class))), (ValidateGameId) servicesRegistry.resolveService(new ServiceKey("", t.b(ValidateGameId.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(CheckForGameIdAndTestModeChanges.class)), b.b(new a<CheckForGameIdAndTestModeChanges>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.201
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final CheckForGameIdAndTestModeChanges invoke() {
                        return new CommonCheckForGameIdAndTestModeChanges((GetGameId) servicesRegistry.resolveService(new ServiceKey("", t.b(GetGameId.class))), (SendDiagnosticEvent) servicesRegistry.resolveService(new ServiceKey("", t.b(SendDiagnosticEvent.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(DownloadPriorityQueue.class)), b.b(new a<DownloadPriorityQueue>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.202
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final DownloadPriorityQueue invoke() {
                        return new DownloadPriorityQueue();
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(CleanupDirectory.class)), b.b(new a<CleanupDirectory>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.203
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final CleanupDirectory invoke() {
                        return new CleanupDirectory();
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(FocusRepository.class)), b.b(new a<FocusRepository>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.204
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final FocusRepository invoke() {
                        return new FocusRepository((AndroidGetLifecycleFlow) servicesRegistry.resolveService(new ServiceKey("", t.b(AndroidGetLifecycleFlow.class))), (h0) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, t.b(h0.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(AndroidGetIsAdActivity.class)), b.b(new a<AndroidGetIsAdActivity>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.205
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final AndroidGetIsAdActivity invoke() {
                        return new AndroidGetIsAdActivity((SessionRepository) servicesRegistry.resolveService(new ServiceKey("", t.b(SessionRepository.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(AndroidGetLifecycleFlow.class)), b.b(new a<AndroidGetLifecycleFlow>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.206
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final AndroidGetLifecycleFlow invoke() {
                        return new AndroidGetLifecycleFlow((Context) servicesRegistry.resolveService(new ServiceKey("", t.b(Context.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(AndroidHandleFocusCounters.class)), b.b(new a<AndroidHandleFocusCounters>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.207
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final AndroidHandleFocusCounters invoke() {
                        return new AndroidHandleFocusCounters((SessionRepository) servicesRegistry.resolveService(new ServiceKey("", t.b(SessionRepository.class))), (FocusRepository) servicesRegistry.resolveService(new ServiceKey("", t.b(FocusRepository.class))), (AndroidGetIsAdActivity) servicesRegistry.resolveService(new ServiceKey("", t.b(AndroidGetIsAdActivity.class))), (h0) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, t.b(h0.class))), null, 16, null);
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(OfferwallAdapterBridge.class)), b.b(new a<OfferwallAdapterBridge>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.208
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final OfferwallAdapterBridge invoke() {
                        return new OfferwallAdapterBridge((l0) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.NAMED_OFFERWALL_SCOPE, t.b(l0.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(OfferwallManager.class)), b.b(new a<OfferwallManager>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.209
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final OfferwallManager invoke() {
                        return new AndroidOfferwallManager((OfferwallAdapterBridge) servicesRegistry.resolveService(new ServiceKey("", t.b(OfferwallAdapterBridge.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(LoadOfferwallAd.class)), b.b(new a<LoadOfferwallAd>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.210
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final LoadOfferwallAd invoke() {
                        return new LoadOfferwallAd((OfferwallManager) servicesRegistry.resolveService(new ServiceKey("", t.b(OfferwallManager.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(GetIsOfferwallAdReady.class)), b.b(new a<GetIsOfferwallAdReady>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.211
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final GetIsOfferwallAdReady invoke() {
                        return new GetIsOfferwallAdReady((OfferwallManager) servicesRegistry.resolveService(new ServiceKey("", t.b(OfferwallManager.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(FIdDataSource.class)), b.b(new a<FIdDataSource>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.212
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final FIdDataSource invoke() {
                        return new AndroidFIdDataSource((Context) servicesRegistry.resolveService(new ServiceKey("", t.b(Context.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(FIdExistenceDataSource.class)), b.b(new a<FIdExistenceDataSource>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.213
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final FIdExistenceDataSource invoke() {
                        return new AndroidFIdExistenceDataSource(Constants.FID_CLASS);
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(CleanUpWhenOpportunityExpires.class)), b.b(new a<CleanUpWhenOpportunityExpires>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.214
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final CleanUpWhenOpportunityExpires invoke() {
                        return new CleanUpWhenOpportunityExpires((h0) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, t.b(h0.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(OrientationRepository.class)), b.b(new a<OrientationRepository>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.215
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final OrientationRepository invoke() {
                        return new OrientationRepository((AndroidGetLifecycleFlow) servicesRegistry.resolveService(new ServiceKey("", t.b(AndroidGetLifecycleFlow.class))), (h0) servicesRegistry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, t.b(h0.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(AndroidAppSetIdDataSource.class)), b.b(new a<AndroidAppSetIdDataSource>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.216
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final AndroidAppSetIdDataSource invoke() {
                        return new AndroidAppSetIdDataSource((Context) servicesRegistry.resolveService(new ServiceKey("", t.b(Context.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(AndroidUnityInfoDataSource.class)), b.b(new a<AndroidUnityInfoDataSource>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.217
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final AndroidUnityInfoDataSource invoke() {
                        return new AndroidUnityInfoDataSource((Context) servicesRegistry.resolveService(new ServiceKey("", t.b(Context.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(HandleDebugSettings.class)), b.b(new a<HandleDebugSettings>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.218
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final HandleDebugSettings invoke() {
                        return new HandleDebugSettings((Logger) servicesRegistry.resolveService(new ServiceKey("", t.b(Logger.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(Logger.class)), b.b(new a<Logger>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.219
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final Logger invoke() {
                        return new UnityLogger((SessionRepository) servicesRegistry.resolveService(new ServiceKey("", t.b(SessionRepository.class))), (CreateFile) servicesRegistry.resolveService(new ServiceKey("", t.b(CreateFile.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(IsBillingClientAvailable.class)), b.b(new a<IsBillingClientAvailable>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.220
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final IsBillingClientAvailable invoke() {
                        return new IsBillingClientAvailable();
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(UnityBootConfigDataSource.class)), b.b(new a<UnityBootConfigDataSource>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.221
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final UnityBootConfigDataSource invoke() {
                        return new AndroidUnityBootConfigDataSource((Context) servicesRegistry.resolveService(new ServiceKey("", t.b(Context.class))));
                    }
                }));
                servicesRegistry.updateService(new ServiceKey("", t.b(GetSafeguardedInitializationPolicy.class)), b.b(new a<GetSafeguardedInitializationPolicy>() { // from class: com.unity3d.services.core.di.ServiceProvider.initialize.1.222
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // sn.a
                    @NotNull
                    public final GetSafeguardedInitializationPolicy invoke() {
                        return new AndroidGetSafeguardedInitializationPolicy();
                    }
                }));
            }
        });
    }
}
