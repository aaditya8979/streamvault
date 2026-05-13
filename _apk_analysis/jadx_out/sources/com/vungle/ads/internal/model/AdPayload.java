package com.vungle.ads.internal.model;

import androidx.annotation.VisibleForTesting;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import bn.h;
import bo.d0;
import cn.a0;
import com.ironsource.Y5;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.foundation.entity.b;
import com.vungle.ads.AdConfig;
import com.vungle.ads.TpatError;
import com.vungle.ads.internal.Constants;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.util.FileUtility;
import com.vungle.ads.internal.util.LogEntry;
import com.vungle.ads.internal.util.Logger;
import io.bidmachine.ads.networks.adaptiverendering.measurer.AdMeasurerFactory;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.io.File;
import java.net.URI;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.c;
import kotlin.reflect.KClass;
import kotlin.text.Regex;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import so.k;
import tn.i;
import tn.p;
import tn.t;
import tn.x;
import to.a;
import vo.d;
import wo.a1;
import wo.c2;
import wo.f;
import wo.g1;
import wo.r2;
import wo.v0;
import wo.w2;
import xo.b0;
import xo.f0;

/* JADX INFO: compiled from: AdPayload.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u000f\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 \u008b\u00012\u00020\u0001:\u0016\u008c\u0001\u008d\u0001\u008e\u0001\u008f\u0001\u008b\u0001\u0090\u0001\u0091\u0001\u0092\u0001\u0093\u0001\u0094\u0001\u0095\u0001B'\u0012\u0010\b\u0002\u0010M\u001a\n\u0012\u0004\u0012\u00020L\u0018\u00010+\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001B\u008a\u0001\b\u0017\u0012\u0007\u0010\u0087\u0001\u001a\u00020\u0007\u0012\u0010\b\u0001\u0010M\u001a\n\u0012\u0004\u0012\u00020L\u0018\u00010+\u0012\n\b\u0001\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\b\u0010T\u001a\u0004\u0018\u00010S\u0012\u0016\b\u0001\u0010W\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010V\u0012\u0016\b\u0001\u0010Z\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010;\u0012\u0006\u0010a\u001a\u00020\t\u0012\b\u0010x\u001a\u0004\u0018\u00010\u0005\u0012\n\u0010\u0089\u0001\u001a\u0005\u0018\u00010\u0088\u0001¢\u0006\u0006\b\u0085\u0001\u0010\u008a\u0001J\u001e\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J'\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\r\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u0005H\u0002J\u001e\u0010\u0010\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005H\u0002J!\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014HÇ\u0001J\b\u0010\u0018\u001a\u0004\u0018\u00010\u0005J\b\u0010\u0019\u001a\u0004\u0018\u00010\u0005J\b\u0010\u001a\u001a\u0004\u0018\u00010\u0005J\u0006\u0010\u001b\u001a\u00020\u0007J\u0006\u0010\u001c\u001a\u00020\u0007J\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dJ\b\u0010 \u001a\u0004\u0018\u00010\u001fJ\u0006\u0010!\u001a\u00020\tJ\u0006\u0010\"\u001a\u00020\tJ\u0006\u0010#\u001a\u00020\tJ\u0006\u0010$\u001a\u00020\tJ\u000e\u0010&\u001a\u00020\t2\u0006\u0010%\u001a\u00020\u0005J\u0006\u0010'\u001a\u00020\tJ\u0010\u0010*\u001a\u0004\u0018\u00010)2\u0006\u0010(\u001a\u00020\u0005J\u0014\u0010,\u001a\b\u0012\u0004\u0012\u00020)0+2\u0006\u0010\u0003\u001a\u00020\u0002J.\u0010/\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010+2\u0006\u0010-\u001a\u00020\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0005J\u0006\u00100\u001a\u00020\u0016J\u0006\u00101\u001a\u00020\tJ\u000e\u00102\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010+J\u0006\u00103\u001a\u00020\tJ\b\u00104\u001a\u0004\u0018\u00010\u0005J&\u00109\u001a\u00020\u00162\u0006\u00105\u001a\u00020\u00052\u0006\u00106\u001a\u00020\u00052\u0006\u00107\u001a\u00020\u00052\u0006\u00108\u001a\u00020\u0005J\u0006\u0010:\u001a\u00020\u0016J\u0012\u0010<\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050;J\u0006\u0010>\u001a\u00020=J\u0017\u0010@\u001a\u00020\u00072\b\u0010?\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b@\u0010AJ\u0006\u0010B\u001a\u00020\u0005J\b\u0010C\u001a\u0004\u0018\u00010\u0005J\b\u0010D\u001a\u0004\u0018\u00010\u0005J\b\u0010E\u001a\u0004\u0018\u00010\u0005J\b\u0010G\u001a\u0004\u0018\u00010FJ\u0006\u0010H\u001a\u00020\tJ\u0016\u0010K\u001a\u00020\u00162\u0006\u0010I\u001a\u00020\u00052\u0006\u0010J\u001a\u00020\u0002R\"\u0010M\u001a\n\u0012\u0004\u0012\u00020L\u0018\u00010+8\u0002X\u0083\u0004¢\u0006\f\n\u0004\bM\u0010N\u0012\u0004\bO\u0010PR\u001c\u0010 \u001a\u0004\u0018\u00010\u001f8\u0002X\u0083\u0004¢\u0006\f\n\u0004\b \u0010Q\u0012\u0004\bR\u0010PR\u0018\u0010T\u001a\u0004\u0018\u00010S8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010UR(\u0010W\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050V8\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\bW\u0010X\u0012\u0004\bY\u0010PR4\u0010Z\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050;8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bZ\u0010[\u0012\u0004\b`\u0010P\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R\"\u0010a\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\ba\u0010b\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR*\u0010h\u001a\u0004\u0018\u00010g8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bh\u0010i\u0012\u0004\bn\u0010P\u001a\u0004\bj\u0010k\"\u0004\bl\u0010mR*\u0010p\u001a\u0004\u0018\u00010o8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\bp\u0010q\u0012\u0004\bv\u0010P\u001a\u0004\br\u0010s\"\u0004\bt\u0010uR(\u0010x\u001a\u0004\u0018\u00010\u00052\b\u0010w\u001a\u0004\u0018\u00010\u00058\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bx\u0010y\u001a\u0004\bz\u0010{R,\u0010|\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020)0;8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b|\u0010[\u0012\u0004\b~\u0010P\u001a\u0004\b}\u0010]R\u0018\u0010\u0081\u0001\u001a\u0004\u0018\u00010L8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u007f\u0010\u0080\u0001R\u0019\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u001d8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001¨\u0006\u0096\u0001"}, d2 = {"Lcom/vungle/ads/internal/model/AdPayload;", "", "Ljava/io/File;", "dir", "Lkotlin/Pair;", "", "getIndexHtmlFile", "", "percentage", "", "computeAssetRequirement", "(Ljava/lang/Integer;)Lkotlin/Pair;", "value", "valueOrEmpty", "oldValue", "newValue", "complexReplace", "self", "Lvo/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lbn/r;", "write$Self", "placementId", "eventId", "advAppId", "adWidth", "adHeight", "Lcom/vungle/ads/internal/model/AdPayload$AdUnit;", "adUnit", "Lcom/vungle/ads/internal/model/ConfigPayload;", "config", "adLoadOptimizationEnabled", "isPartialDownloadEnabled", "omEnabled", "isClickCoordinatesTrackingEnabled", "failingUrl", "isCriticalAsset", "heartbeatEnabled", "remoteUrl", "Lcom/vungle/ads/internal/model/AdAsset;", "getLocalPartialDownloadAssets", "", "getDownloadableAssets", "event", "secondValue", "getTpatUrls", "recordExpiryWindowStart", "hasExpired", "getWinNotifications", "isNativeTemplateType", "templateType", "title", "body", "keepWatching", "close", "setIncentivizedText", "setAssetFullyDownloaded", "", "getMRAIDArgsInMap", "Lkotlinx/serialization/json/JsonObject;", "createMRAIDArgs", "incentivized", "getShowCloseDelay", "(Ljava/lang/Boolean;)I", "getCreativeId", "getAdSource", "getMediationName", "getViewMasterVersion", "Lcom/vungle/ads/internal/model/AdPayload$WebViewSettings;", "getWebViewSettings", "usePreloading", "adIdentifier", "localFile", "updateAdAssetPath", "Lcom/vungle/ads/internal/model/AdPayload$PlacementAdUnit;", b.JSON_KEY_ADS, "Ljava/util/List;", "getAds$annotations", "()V", "Lcom/vungle/ads/internal/model/ConfigPayload;", "getConfig$annotations", "", "expiryWindowStart", "Ljava/lang/Long;", "Ljava/util/concurrent/ConcurrentHashMap;", "mraidFiles", "Ljava/util/concurrent/ConcurrentHashMap;", "getMraidFiles$annotations", "incentivizedTextSettings", "Ljava/util/Map;", "getIncentivizedTextSettings", "()Ljava/util/Map;", "setIncentivizedTextSettings", "(Ljava/util/Map;)V", "getIncentivizedTextSettings$annotations", "assetsFullyDownloaded", "Z", "getAssetsFullyDownloaded", "()Z", "setAssetsFullyDownloaded", "(Z)V", "Lcom/vungle/ads/AdConfig;", "adConfig", "Lcom/vungle/ads/AdConfig;", "getAdConfig", "()Lcom/vungle/ads/AdConfig;", "setAdConfig", "(Lcom/vungle/ads/AdConfig;)V", "getAdConfig$annotations", "Lcom/vungle/ads/internal/util/LogEntry;", "logEntry", "Lcom/vungle/ads/internal/util/LogEntry;", "getLogEntry$vungle_ads_release", "()Lcom/vungle/ads/internal/util/LogEntry;", "setLogEntry$vungle_ads_release", "(Lcom/vungle/ads/internal/util/LogEntry;)V", "getLogEntry$vungle_ads_release$annotations", "<set-?>", "indexFilePath", "Ljava/lang/String;", "getIndexFilePath", "()Ljava/lang/String;", "partialDownloadAssets", "getPartialDownloadAssets$vungle_ads_release", "getPartialDownloadAssets$vungle_ads_release$annotations", "getAd", "()Lcom/vungle/ads/internal/model/AdPayload$PlacementAdUnit;", "ad", "getAdMarkup", "()Lcom/vungle/ads/internal/model/AdPayload$AdUnit;", "adMarkup", "<init>", "(Ljava/util/List;Lcom/vungle/ads/internal/model/ConfigPayload;)V", "seen1", "Lwo/r2;", "serializationConstructorMarker", "(ILjava/util/List;Lcom/vungle/ads/internal/model/ConfigPayload;Ljava/lang/Long;Ljava/util/concurrent/ConcurrentHashMap;Ljava/util/Map;ZLjava/lang/String;Lwo/r2;)V", VastTagName.COMPANION, "$serializer", "AdSizeInfo", "AdUnit", "CacheableReplacement", "PlacementAdUnit", "TemplateSettings", "TpatSerializer", "ViewAbility", "ViewAbilityInfo", "WebViewSettings", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
@k
public final class AdPayload {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String FILE_SCHEME = "file://";

    @NotNull
    public static final String INCENTIVIZED_BODY_TEXT = "INCENTIVIZED_BODY_TEXT";

    @NotNull
    public static final String INCENTIVIZED_CLOSE_TEXT = "INCENTIVIZED_CLOSE_TEXT";

    @NotNull
    public static final String INCENTIVIZED_CONTINUE_TEXT = "INCENTIVIZED_CONTINUE_TEXT";

    @NotNull
    public static final String INCENTIVIZED_TITLE_TEXT = "INCENTIVIZED_TITLE_TEXT";

    @NotNull
    public static final String KEY_VM = "vmURL";

    @NotNull
    private static final String TAG = "AdPayload";

    @NotNull
    public static final String TPAT_CLICK_COORDINATES_URLS = "video.clickCoordinates";

    @NotNull
    private static final String UNKNOWN = "unknown";

    @Nullable
    private AdConfig adConfig;

    @Nullable
    private final List<PlacementAdUnit> ads;
    private boolean assetsFullyDownloaded;

    @Nullable
    private final ConfigPayload config;

    @Nullable
    private Long expiryWindowStart;

    @NotNull
    private Map<String, String> incentivizedTextSettings;

    @Nullable
    private String indexFilePath;

    @Nullable
    private LogEntry logEntry;

    @NotNull
    private ConcurrentHashMap<String, String> mraidFiles;

    @NotNull
    private final Map<String, AdAsset> partialDownloadAssets;

    /* JADX INFO: compiled from: AdPayload.kt */
    @Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002$#B\u001f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u001d\u0010\u001eB3\b\u0017\u0012\u0006\u0010\u001f\u001a\u00020\t\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\b\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\u001d\u0010\"J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u0012\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ(\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0012\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0013\u001a\u00020\tHÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\r\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010\u0017\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0018\u0010\u000bR\"\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010\u0017\u0012\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b¨\u0006%"}, d2 = {"Lcom/vungle/ads/internal/model/AdPayload$AdSizeInfo;", "", "self", "Lvo/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lbn/r;", "write$Self", "", "component1", "()Ljava/lang/Integer;", "component2", "width", "height", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/vungle/ads/internal/model/AdPayload$AdSizeInfo;", "", "toString", "hashCode", "other", "", "equals", "Ljava/lang/Integer;", "getWidth", "getWidth$annotations", "()V", "getHeight", "getHeight$annotations", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;)V", "seen1", "Lwo/r2;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/lang/Integer;Lwo/r2;)V", VastTagName.COMPANION, "$serializer", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
    @k
    public static final /* data */ class AdSizeInfo {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @Nullable
        private final Integer height;

        @Nullable
        private final Integer width;

        /* JADX INFO: compiled from: AdPayload.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/internal/model/AdPayload$AdSizeInfo$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/vungle/ads/internal/model/AdPayload$AdSizeInfo;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(i iVar) {
                this();
            }

            @NotNull
            public final KSerializer<AdSizeInfo> serializer() {
                return AdPayload$AdSizeInfo$$serializer.INSTANCE;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public AdSizeInfo() {
            this((Integer) null, (Integer) (0 == true ? 1 : 0), 3, (i) (0 == true ? 1 : 0));
        }

        public /* synthetic */ AdSizeInfo(int i10, Integer num, Integer num2, r2 r2Var) {
            if ((i10 & 0) != 0) {
                c2.a(i10, 0, AdPayload$AdSizeInfo$$serializer.INSTANCE.getDescriptor());
            }
            if ((i10 & 1) == 0) {
                this.width = 0;
            } else {
                this.width = num;
            }
            if ((i10 & 2) == 0) {
                this.height = 0;
            } else {
                this.height = num2;
            }
        }

        public AdSizeInfo(@Nullable Integer num, @Nullable Integer num2) {
            this.width = num;
            this.height = num2;
        }

        public /* synthetic */ AdSizeInfo(Integer num, Integer num2, int i10, i iVar) {
            this((i10 & 1) != 0 ? 0 : num, (i10 & 2) != 0 ? 0 : num2);
        }

        public static /* synthetic */ AdSizeInfo copy$default(AdSizeInfo adSizeInfo, Integer num, Integer num2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                num = adSizeInfo.width;
            }
            if ((i10 & 2) != 0) {
                num2 = adSizeInfo.height;
            }
            return adSizeInfo.copy(num, num2);
        }

        public static /* synthetic */ void getHeight$annotations() {
        }

        public static /* synthetic */ void getWidth$annotations() {
        }

        public static final void write$Self(@NotNull AdSizeInfo adSizeInfo, @NotNull d dVar, @NotNull SerialDescriptor serialDescriptor) {
            Integer num;
            Integer num2;
            p.k(adSizeInfo, "self");
            p.k(dVar, "output");
            p.k(serialDescriptor, "serialDesc");
            if (dVar.r(serialDescriptor, 0) || (num = adSizeInfo.width) == null || num.intValue() != 0) {
                dVar.f(serialDescriptor, 0, v0.f86626a, adSizeInfo.width);
            }
            if (dVar.r(serialDescriptor, 1) || (num2 = adSizeInfo.height) == null || num2.intValue() != 0) {
                dVar.f(serialDescriptor, 1, v0.f86626a, adSizeInfo.height);
            }
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Integer getWidth() {
            return this.width;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Integer getHeight() {
            return this.height;
        }

        @NotNull
        public final AdSizeInfo copy(@Nullable Integer width, @Nullable Integer height) {
            return new AdSizeInfo(width, height);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AdSizeInfo)) {
                return false;
            }
            AdSizeInfo adSizeInfo = (AdSizeInfo) other;
            return p.f(this.width, adSizeInfo.width) && p.f(this.height, adSizeInfo.height);
        }

        @Nullable
        public final Integer getHeight() {
            return this.height;
        }

        @Nullable
        public final Integer getWidth() {
            return this.width;
        }

        public int hashCode() {
            Integer num = this.width;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            Integer num2 = this.height;
            return iHashCode + (num2 != null ? num2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "AdSizeInfo(width=" + this.width + ", height=" + this.height + ')';
        }
    }

    /* JADX INFO: compiled from: AdPayload.kt */
    @Metadata(bv = {}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bw\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 ©\u00012\u00020\u0001:\u0004ª\u0001©\u0001B\u008f\u0003\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\r\u0012\u001c\b\u0002\u0010?\u001a\u0016\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u001c\u0018\u00010\u001b\u0012\n\b\u0002\u0010@\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010A\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010B\u001a\u0004\u0018\u00010\t\u0012\u0010\b\u0002\u0010C\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u001c\u0012\u0010\b\u0002\u0010D\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u001c\u0012\n\b\u0002\u0010E\u001a\u0004\u0018\u00010#\u0012\n\b\u0002\u0010F\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010G\u001a\u0004\u0018\u00010&\u0012\n\b\u0002\u0010H\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010I\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010J\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010K\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010L\u001a\u0004\u0018\u00010,\u0012\n\b\u0002\u0010M\u001a\u0004\u0018\u00010.\u0012\n\b\u0002\u0010N\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010O\u001a\u0004\u0018\u00010\u0012¢\u0006\u0006\b£\u0001\u0010¤\u0001B¦\u0003\b\u0017\u0012\u0007\u0010¥\u0001\u001a\u00020\r\u0012\n\b\u0001\u00102\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u00103\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u00104\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u00105\u001a\u0004\u0018\u00010\r\u0012\n\b\u0001\u00106\u001a\u0004\u0018\u00010\r\u0012\n\b\u0001\u00107\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u00108\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0001\u00109\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0001\u0010:\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0001\u0010;\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010<\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010=\u001a\u0004\u0018\u00010\r\u0012\n\b\u0001\u0010>\u001a\u0004\u0018\u00010\r\u0012\u001c\b\u0001\u0010?\u001a\u0016\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u001c\u0018\u00010\u001b\u0012\n\b\u0001\u0010@\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010A\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010B\u001a\u0004\u0018\u00010\t\u0012\u0010\b\u0001\u0010C\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u001c\u0012\u0010\b\u0001\u0010D\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u001c\u0012\n\b\u0001\u0010E\u001a\u0004\u0018\u00010#\u0012\n\b\u0001\u0010F\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010G\u001a\u0004\u0018\u00010&\u0012\n\b\u0001\u0010H\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010I\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010J\u001a\u0004\u0018\u00010\r\u0012\n\b\u0001\u0010K\u001a\u0004\u0018\u00010\r\u0012\n\b\u0001\u0010L\u001a\u0004\u0018\u00010,\u0012\n\b\u0001\u0010M\u001a\u0004\u0018\u00010.\u0012\n\b\u0001\u0010N\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0001\u0010O\u001a\u0004\u0018\u00010\u0012\u0012\n\u0010§\u0001\u001a\u0005\u0018\u00010¦\u0001¢\u0006\u0006\b£\u0001\u0010¨\u0001J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u000b\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0014J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u000fJ\u0012\u0010\u001a\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u000fJ\u001d\u0010\u001d\u001a\u0016\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u001c\u0018\u00010\u001bHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\tHÆ\u0003J\u0011\u0010!\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u001cHÆ\u0003J\u0011\u0010\"\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u001cHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010#HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010&HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0012\u0010*\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b*\u0010\u000fJ\u0012\u0010+\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b+\u0010\u000fJ\u000b\u0010-\u001a\u0004\u0018\u00010,HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010.HÆ\u0003J\u0012\u00100\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b0\u0010\u0014J\u0012\u00101\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b1\u0010\u0014J\u0096\u0003\u0010P\u001a\u00020\u00002\n\b\u0002\u00102\u001a\u0004\u0018\u00010\t2\n\b\u0002\u00103\u001a\u0004\u0018\u00010\t2\n\b\u0002\u00104\u001a\u0004\u0018\u00010\t2\n\b\u0002\u00105\u001a\u0004\u0018\u00010\r2\n\b\u0002\u00106\u001a\u0004\u0018\u00010\r2\n\b\u0002\u00107\u001a\u0004\u0018\u00010\t2\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\r2\u001c\b\u0002\u0010?\u001a\u0016\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u001c\u0018\u00010\u001b2\n\b\u0002\u0010@\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010A\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010B\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010C\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u001c2\u0010\b\u0002\u0010D\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u001c2\n\b\u0002\u0010E\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010F\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010G\u001a\u0004\u0018\u00010&2\n\b\u0002\u0010H\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010I\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010J\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010K\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010L\u001a\u0004\u0018\u00010,2\n\b\u0002\u0010M\u001a\u0004\u0018\u00010.2\n\b\u0002\u0010N\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010O\u001a\u0004\u0018\u00010\u0012HÆ\u0001¢\u0006\u0004\bP\u0010QJ\t\u0010R\u001a\u00020\tHÖ\u0001J\t\u0010S\u001a\u00020\rHÖ\u0001J\u0013\u0010U\u001a\u00020\u00122\b\u0010T\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u00102\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b2\u0010V\u0012\u0004\bY\u0010Z\u001a\u0004\bW\u0010XR\"\u00103\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b3\u0010V\u0012\u0004\b\\\u0010Z\u001a\u0004\b[\u0010XR\"\u00104\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b4\u0010V\u0012\u0004\b^\u0010Z\u001a\u0004\b]\u0010XR\"\u00105\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b5\u0010_\u0012\u0004\ba\u0010Z\u001a\u0004\b`\u0010\u000fR\"\u00106\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b6\u0010_\u0012\u0004\bc\u0010Z\u001a\u0004\bb\u0010\u000fR\"\u00107\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b7\u0010V\u0012\u0004\be\u0010Z\u001a\u0004\bd\u0010XR\"\u00108\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b8\u0010f\u0012\u0004\bh\u0010Z\u001a\u0004\bg\u0010\u0014R\"\u00109\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b9\u0010f\u0012\u0004\bj\u0010Z\u001a\u0004\bi\u0010\u0014R\"\u0010:\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b:\u0010f\u0012\u0004\bl\u0010Z\u001a\u0004\bk\u0010\u0014R\"\u0010;\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b;\u0010V\u0012\u0004\bn\u0010Z\u001a\u0004\bm\u0010XR\"\u0010<\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b<\u0010V\u0012\u0004\bp\u0010Z\u001a\u0004\bo\u0010XR\"\u0010=\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b=\u0010_\u0012\u0004\br\u0010Z\u001a\u0004\bq\u0010\u000fR\"\u0010>\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b>\u0010_\u0012\u0004\bt\u0010Z\u001a\u0004\bs\u0010\u000fR4\u0010?\u001a\u0016\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u001c\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b?\u0010u\u0012\u0004\bx\u0010Z\u001a\u0004\bv\u0010wR\"\u0010@\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b@\u0010V\u0012\u0004\bz\u0010Z\u001a\u0004\by\u0010XR\"\u0010A\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bA\u0010V\u0012\u0004\b|\u0010Z\u001a\u0004\b{\u0010XR\"\u0010B\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bB\u0010V\u0012\u0004\b~\u0010Z\u001a\u0004\b}\u0010XR+\u0010C\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\u0015\n\u0004\bC\u0010\u007f\u0012\u0005\b\u0082\u0001\u0010Z\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001R+\u0010D\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\u0015\n\u0004\bD\u0010\u007f\u0012\u0005\b\u0084\u0001\u0010Z\u001a\u0006\b\u0083\u0001\u0010\u0081\u0001R&\u0010E\u001a\u0004\u0018\u00010#8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\bE\u0010\u0085\u0001\u0012\u0005\b\u0088\u0001\u0010Z\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001R$\u0010F\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\bF\u0010V\u0012\u0005\b\u008a\u0001\u0010Z\u001a\u0005\b\u0089\u0001\u0010XR&\u0010G\u001a\u0004\u0018\u00010&8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\bG\u0010\u008b\u0001\u0012\u0005\b\u008e\u0001\u0010Z\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001R$\u0010H\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\bH\u0010V\u0012\u0005\b\u0090\u0001\u0010Z\u001a\u0005\b\u008f\u0001\u0010XR$\u0010I\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\bI\u0010V\u0012\u0005\b\u0092\u0001\u0010Z\u001a\u0005\b\u0091\u0001\u0010XR$\u0010J\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\bJ\u0010_\u0012\u0005\b\u0094\u0001\u0010Z\u001a\u0005\b\u0093\u0001\u0010\u000fR$\u0010K\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\bK\u0010_\u0012\u0005\b\u0096\u0001\u0010Z\u001a\u0005\b\u0095\u0001\u0010\u000fR&\u0010L\u001a\u0004\u0018\u00010,8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\bL\u0010\u0097\u0001\u0012\u0005\b\u009a\u0001\u0010Z\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001R&\u0010M\u001a\u0004\u0018\u00010.8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\bM\u0010\u009b\u0001\u0012\u0005\b\u009e\u0001\u0010Z\u001a\u0006\b\u009c\u0001\u0010\u009d\u0001R$\u0010N\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\bN\u0010f\u0012\u0005\b \u0001\u0010Z\u001a\u0005\b\u009f\u0001\u0010\u0014R$\u0010O\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\bO\u0010f\u0012\u0005\b¢\u0001\u0010Z\u001a\u0005\b¡\u0001\u0010\u0014¨\u0006«\u0001"}, d2 = {"Lcom/vungle/ads/internal/model/AdPayload$AdUnit;", "", "self", "Lvo/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lbn/r;", "write$Self", "", "component1", "component2", "component3", "", "component4", "()Ljava/lang/Integer;", "component5", "component6", "", "component7", "()Ljava/lang/Boolean;", "component8", "component9", "component10", "component11", "component12", "component13", "", "", "component14", "component15", "component16", "component17", "component18", "component19", "Lcom/vungle/ads/internal/model/AdPayload$ViewAbility;", "component20", "component21", "Lcom/vungle/ads/internal/model/AdPayload$TemplateSettings;", "component22", "component23", "component24", "component25", "component26", "Lcom/vungle/ads/internal/model/AdPayload$AdSizeInfo;", "component27", "Lcom/vungle/ads/internal/model/AdPayload$WebViewSettings;", "component28", "component29", "component30", "id", "adType", "adSource", "expiry", "expiryDuration", "deeplinkUrl", "clickCoordinatesEnabled", "adLoadOptimizationEnabled", "templateHeartbeatCheck", "mediationName", "info", "sleep", IronSourceConstants.EVENTS_ERROR_CODE, "tpat", AdPayload.KEY_VM, "vmVersion", "adMarketId", "notification", "loadAdUrls", "viewAbility", "templateType", "templateSettings", "creativeId", "advAppId", "showClose", "showCloseIncentivized", "adSizeInfo", "webViewSettings", "usePreloading", "partialDownloadEnabled", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/vungle/ads/internal/model/AdPayload$ViewAbility;Ljava/lang/String;Lcom/vungle/ads/internal/model/AdPayload$TemplateSettings;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/vungle/ads/internal/model/AdPayload$AdSizeInfo;Lcom/vungle/ads/internal/model/AdPayload$WebViewSettings;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/vungle/ads/internal/model/AdPayload$AdUnit;", "toString", "hashCode", "other", "equals", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getId$annotations", "()V", "getAdType", "getAdType$annotations", "getAdSource", "getAdSource$annotations", "Ljava/lang/Integer;", "getExpiry", "getExpiry$annotations", "getExpiryDuration", "getExpiryDuration$annotations", "getDeeplinkUrl", "getDeeplinkUrl$annotations", "Ljava/lang/Boolean;", "getClickCoordinatesEnabled", "getClickCoordinatesEnabled$annotations", "getAdLoadOptimizationEnabled", "getAdLoadOptimizationEnabled$annotations", "getTemplateHeartbeatCheck", "getTemplateHeartbeatCheck$annotations", "getMediationName", "getMediationName$annotations", "getInfo", "getInfo$annotations", "getSleep", "getSleep$annotations", "getErrorCode", "getErrorCode$annotations", "Ljava/util/Map;", "getTpat", "()Ljava/util/Map;", "getTpat$annotations", "getVmURL", "getVmURL$annotations", "getVmVersion", "getVmVersion$annotations", "getAdMarketId", "getAdMarketId$annotations", "Ljava/util/List;", "getNotification", "()Ljava/util/List;", "getNotification$annotations", "getLoadAdUrls", "getLoadAdUrls$annotations", "Lcom/vungle/ads/internal/model/AdPayload$ViewAbility;", "getViewAbility", "()Lcom/vungle/ads/internal/model/AdPayload$ViewAbility;", "getViewAbility$annotations", "getTemplateType", "getTemplateType$annotations", "Lcom/vungle/ads/internal/model/AdPayload$TemplateSettings;", "getTemplateSettings", "()Lcom/vungle/ads/internal/model/AdPayload$TemplateSettings;", "getTemplateSettings$annotations", "getCreativeId", "getCreativeId$annotations", "getAdvAppId", "getAdvAppId$annotations", "getShowClose", "getShowClose$annotations", "getShowCloseIncentivized", "getShowCloseIncentivized$annotations", "Lcom/vungle/ads/internal/model/AdPayload$AdSizeInfo;", "getAdSizeInfo", "()Lcom/vungle/ads/internal/model/AdPayload$AdSizeInfo;", "getAdSizeInfo$annotations", "Lcom/vungle/ads/internal/model/AdPayload$WebViewSettings;", "getWebViewSettings", "()Lcom/vungle/ads/internal/model/AdPayload$WebViewSettings;", "getWebViewSettings$annotations", "getUsePreloading", "getUsePreloading$annotations", "getPartialDownloadEnabled", "getPartialDownloadEnabled$annotations", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/vungle/ads/internal/model/AdPayload$ViewAbility;Ljava/lang/String;Lcom/vungle/ads/internal/model/AdPayload$TemplateSettings;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/vungle/ads/internal/model/AdPayload$AdSizeInfo;Lcom/vungle/ads/internal/model/AdPayload$WebViewSettings;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "seen1", "Lwo/r2;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/vungle/ads/internal/model/AdPayload$ViewAbility;Ljava/lang/String;Lcom/vungle/ads/internal/model/AdPayload$TemplateSettings;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/vungle/ads/internal/model/AdPayload$AdSizeInfo;Lcom/vungle/ads/internal/model/AdPayload$WebViewSettings;Ljava/lang/Boolean;Ljava/lang/Boolean;Lwo/r2;)V", VastTagName.COMPANION, "$serializer", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
    @k
    public static final /* data */ class AdUnit {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @Nullable
        private final Boolean adLoadOptimizationEnabled;

        @Nullable
        private final String adMarketId;

        @Nullable
        private final AdSizeInfo adSizeInfo;

        @Nullable
        private final String adSource;

        @Nullable
        private final String adType;

        @Nullable
        private final String advAppId;

        @Nullable
        private final Boolean clickCoordinatesEnabled;

        @Nullable
        private final String creativeId;

        @Nullable
        private final String deeplinkUrl;

        @Nullable
        private final Integer errorCode;

        @Nullable
        private final Integer expiry;

        @Nullable
        private final Integer expiryDuration;

        @Nullable
        private final String id;

        @Nullable
        private final String info;

        @Nullable
        private final List<String> loadAdUrls;

        @Nullable
        private final String mediationName;

        @Nullable
        private final List<String> notification;

        @Nullable
        private final Boolean partialDownloadEnabled;

        @Nullable
        private final Integer showClose;

        @Nullable
        private final Integer showCloseIncentivized;

        @Nullable
        private final Integer sleep;

        @Nullable
        private final Boolean templateHeartbeatCheck;

        @Nullable
        private final TemplateSettings templateSettings;

        @Nullable
        private final String templateType;

        @Nullable
        private final Map<String, List<String>> tpat;

        @Nullable
        private final Boolean usePreloading;

        @Nullable
        private final ViewAbility viewAbility;

        @Nullable
        private final String vmURL;

        @Nullable
        private final String vmVersion;

        @Nullable
        private final WebViewSettings webViewSettings;

        /* JADX INFO: compiled from: AdPayload.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/internal/model/AdPayload$AdUnit$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/vungle/ads/internal/model/AdPayload$AdUnit;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(i iVar) {
                this();
            }

            @NotNull
            public final KSerializer<AdUnit> serializer() {
                return AdPayload$AdUnit$$serializer.INSTANCE;
            }
        }

        public AdUnit() {
            this((String) null, (String) null, (String) null, (Integer) null, (Integer) null, (String) null, (Boolean) null, (Boolean) null, (Boolean) null, (String) null, (String) null, (Integer) null, (Integer) null, (Map) null, (String) null, (String) null, (String) null, (List) null, (List) null, (ViewAbility) null, (String) null, (TemplateSettings) null, (String) null, (String) null, (Integer) null, (Integer) null, (AdSizeInfo) null, (WebViewSettings) null, (Boolean) null, (Boolean) null, 1073741823, (i) null);
        }

        public /* synthetic */ AdUnit(int i10, String str, String str2, String str3, Integer num, Integer num2, String str4, Boolean bool, Boolean bool2, Boolean bool3, String str5, String str6, Integer num3, Integer num4, @k(with = TpatSerializer.class) Map map, String str7, String str8, String str9, List list, List list2, ViewAbility viewAbility, String str10, TemplateSettings templateSettings, String str11, String str12, Integer num5, Integer num6, AdSizeInfo adSizeInfo, WebViewSettings webViewSettings, Boolean bool4, Boolean bool5, r2 r2Var) {
            if ((i10 & 0) != 0) {
                c2.a(i10, 0, AdPayload$AdUnit$$serializer.INSTANCE.getDescriptor());
            }
            if ((i10 & 1) == 0) {
                this.id = null;
            } else {
                this.id = str;
            }
            if ((i10 & 2) == 0) {
                this.adType = null;
            } else {
                this.adType = str2;
            }
            if ((i10 & 4) == 0) {
                this.adSource = null;
            } else {
                this.adSource = str3;
            }
            if ((i10 & 8) == 0) {
                this.expiry = null;
            } else {
                this.expiry = num;
            }
            if ((i10 & 16) == 0) {
                this.expiryDuration = null;
            } else {
                this.expiryDuration = num2;
            }
            if ((i10 & 32) == 0) {
                this.deeplinkUrl = null;
            } else {
                this.deeplinkUrl = str4;
            }
            if ((i10 & 64) == 0) {
                this.clickCoordinatesEnabled = null;
            } else {
                this.clickCoordinatesEnabled = bool;
            }
            if ((i10 & 128) == 0) {
                this.adLoadOptimizationEnabled = null;
            } else {
                this.adLoadOptimizationEnabled = bool2;
            }
            if ((i10 & 256) == 0) {
                this.templateHeartbeatCheck = null;
            } else {
                this.templateHeartbeatCheck = bool3;
            }
            if ((i10 & 512) == 0) {
                this.mediationName = null;
            } else {
                this.mediationName = str5;
            }
            if ((i10 & 1024) == 0) {
                this.info = null;
            } else {
                this.info = str6;
            }
            if ((i10 & 2048) == 0) {
                this.sleep = null;
            } else {
                this.sleep = num3;
            }
            if ((i10 & 4096) == 0) {
                this.errorCode = null;
            } else {
                this.errorCode = num4;
            }
            if ((i10 & 8192) == 0) {
                this.tpat = null;
            } else {
                this.tpat = map;
            }
            if ((i10 & 16384) == 0) {
                this.vmURL = null;
            } else {
                this.vmURL = str7;
            }
            if ((32768 & i10) == 0) {
                this.vmVersion = null;
            } else {
                this.vmVersion = str8;
            }
            if ((65536 & i10) == 0) {
                this.adMarketId = null;
            } else {
                this.adMarketId = str9;
            }
            if ((131072 & i10) == 0) {
                this.notification = null;
            } else {
                this.notification = list;
            }
            if ((262144 & i10) == 0) {
                this.loadAdUrls = null;
            } else {
                this.loadAdUrls = list2;
            }
            if ((524288 & i10) == 0) {
                this.viewAbility = null;
            } else {
                this.viewAbility = viewAbility;
            }
            if ((1048576 & i10) == 0) {
                this.templateType = null;
            } else {
                this.templateType = str10;
            }
            if ((2097152 & i10) == 0) {
                this.templateSettings = null;
            } else {
                this.templateSettings = templateSettings;
            }
            if ((4194304 & i10) == 0) {
                this.creativeId = null;
            } else {
                this.creativeId = str11;
            }
            if ((8388608 & i10) == 0) {
                this.advAppId = null;
            } else {
                this.advAppId = str12;
            }
            if ((16777216 & i10) == 0) {
                this.showClose = 0;
            } else {
                this.showClose = num5;
            }
            if ((33554432 & i10) == 0) {
                this.showCloseIncentivized = 0;
            } else {
                this.showCloseIncentivized = num6;
            }
            if ((67108864 & i10) == 0) {
                this.adSizeInfo = null;
            } else {
                this.adSizeInfo = adSizeInfo;
            }
            if ((134217728 & i10) == 0) {
                this.webViewSettings = null;
            } else {
                this.webViewSettings = webViewSettings;
            }
            this.usePreloading = (268435456 & i10) == 0 ? Boolean.FALSE : bool4;
            if ((i10 & 536870912) == 0) {
                this.partialDownloadEnabled = null;
            } else {
                this.partialDownloadEnabled = bool5;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public AdUnit(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Integer num, @Nullable Integer num2, @Nullable String str4, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable String str5, @Nullable String str6, @Nullable Integer num3, @Nullable Integer num4, @Nullable Map<String, ? extends List<String>> map, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable List<String> list, @Nullable List<String> list2, @Nullable ViewAbility viewAbility, @Nullable String str10, @Nullable TemplateSettings templateSettings, @Nullable String str11, @Nullable String str12, @Nullable Integer num5, @Nullable Integer num6, @Nullable AdSizeInfo adSizeInfo, @Nullable WebViewSettings webViewSettings, @Nullable Boolean bool4, @Nullable Boolean bool5) {
            this.id = str;
            this.adType = str2;
            this.adSource = str3;
            this.expiry = num;
            this.expiryDuration = num2;
            this.deeplinkUrl = str4;
            this.clickCoordinatesEnabled = bool;
            this.adLoadOptimizationEnabled = bool2;
            this.templateHeartbeatCheck = bool3;
            this.mediationName = str5;
            this.info = str6;
            this.sleep = num3;
            this.errorCode = num4;
            this.tpat = map;
            this.vmURL = str7;
            this.vmVersion = str8;
            this.adMarketId = str9;
            this.notification = list;
            this.loadAdUrls = list2;
            this.viewAbility = viewAbility;
            this.templateType = str10;
            this.templateSettings = templateSettings;
            this.creativeId = str11;
            this.advAppId = str12;
            this.showClose = num5;
            this.showCloseIncentivized = num6;
            this.adSizeInfo = adSizeInfo;
            this.webViewSettings = webViewSettings;
            this.usePreloading = bool4;
            this.partialDownloadEnabled = bool5;
        }

        public /* synthetic */ AdUnit(String str, String str2, String str3, Integer num, Integer num2, String str4, Boolean bool, Boolean bool2, Boolean bool3, String str5, String str6, Integer num3, Integer num4, Map map, String str7, String str8, String str9, List list, List list2, ViewAbility viewAbility, String str10, TemplateSettings templateSettings, String str11, String str12, Integer num5, Integer num6, AdSizeInfo adSizeInfo, WebViewSettings webViewSettings, Boolean bool4, Boolean bool5, int i10, i iVar) {
            this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : num, (i10 & 16) != 0 ? null : num2, (i10 & 32) != 0 ? null : str4, (i10 & 64) != 0 ? null : bool, (i10 & 128) != 0 ? null : bool2, (i10 & 256) != 0 ? null : bool3, (i10 & 512) != 0 ? null : str5, (i10 & 1024) != 0 ? null : str6, (i10 & 2048) != 0 ? null : num3, (i10 & 4096) != 0 ? null : num4, (i10 & 8192) != 0 ? null : map, (i10 & 16384) != 0 ? null : str7, (i10 & 32768) != 0 ? null : str8, (i10 & 65536) != 0 ? null : str9, (i10 & 131072) != 0 ? null : list, (i10 & 262144) != 0 ? null : list2, (i10 & 524288) != 0 ? null : viewAbility, (i10 & 1048576) != 0 ? null : str10, (i10 & 2097152) != 0 ? null : templateSettings, (i10 & 4194304) != 0 ? null : str11, (i10 & 8388608) != 0 ? null : str12, (i10 & 16777216) != 0 ? 0 : num5, (i10 & 33554432) != 0 ? 0 : num6, (i10 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? null : adSizeInfo, (i10 & 134217728) != 0 ? null : webViewSettings, (i10 & 268435456) != 0 ? Boolean.FALSE : bool4, (i10 & 536870912) != 0 ? null : bool5);
        }

        public static /* synthetic */ void getAdLoadOptimizationEnabled$annotations() {
        }

        public static /* synthetic */ void getAdMarketId$annotations() {
        }

        public static /* synthetic */ void getAdSizeInfo$annotations() {
        }

        public static /* synthetic */ void getAdSource$annotations() {
        }

        public static /* synthetic */ void getAdType$annotations() {
        }

        public static /* synthetic */ void getAdvAppId$annotations() {
        }

        public static /* synthetic */ void getClickCoordinatesEnabled$annotations() {
        }

        public static /* synthetic */ void getCreativeId$annotations() {
        }

        public static /* synthetic */ void getDeeplinkUrl$annotations() {
        }

        public static /* synthetic */ void getErrorCode$annotations() {
        }

        public static /* synthetic */ void getExpiry$annotations() {
        }

        public static /* synthetic */ void getExpiryDuration$annotations() {
        }

        public static /* synthetic */ void getId$annotations() {
        }

        public static /* synthetic */ void getInfo$annotations() {
        }

        public static /* synthetic */ void getLoadAdUrls$annotations() {
        }

        public static /* synthetic */ void getMediationName$annotations() {
        }

        public static /* synthetic */ void getNotification$annotations() {
        }

        public static /* synthetic */ void getPartialDownloadEnabled$annotations() {
        }

        public static /* synthetic */ void getShowClose$annotations() {
        }

        public static /* synthetic */ void getShowCloseIncentivized$annotations() {
        }

        public static /* synthetic */ void getSleep$annotations() {
        }

        public static /* synthetic */ void getTemplateHeartbeatCheck$annotations() {
        }

        public static /* synthetic */ void getTemplateSettings$annotations() {
        }

        public static /* synthetic */ void getTemplateType$annotations() {
        }

        @k(with = TpatSerializer.class)
        public static /* synthetic */ void getTpat$annotations() {
        }

        public static /* synthetic */ void getUsePreloading$annotations() {
        }

        public static /* synthetic */ void getViewAbility$annotations() {
        }

        public static /* synthetic */ void getVmURL$annotations() {
        }

        public static /* synthetic */ void getVmVersion$annotations() {
        }

        public static /* synthetic */ void getWebViewSettings$annotations() {
        }

        public static final void write$Self(@NotNull AdUnit adUnit, @NotNull d dVar, @NotNull SerialDescriptor serialDescriptor) {
            Integer num;
            Integer num2;
            p.k(adUnit, "self");
            p.k(dVar, "output");
            p.k(serialDescriptor, "serialDesc");
            if (dVar.r(serialDescriptor, 0) || adUnit.id != null) {
                dVar.f(serialDescriptor, 0, w2.f86635a, adUnit.id);
            }
            if (dVar.r(serialDescriptor, 1) || adUnit.adType != null) {
                dVar.f(serialDescriptor, 1, w2.f86635a, adUnit.adType);
            }
            if (dVar.r(serialDescriptor, 2) || adUnit.adSource != null) {
                dVar.f(serialDescriptor, 2, w2.f86635a, adUnit.adSource);
            }
            if (dVar.r(serialDescriptor, 3) || adUnit.expiry != null) {
                dVar.f(serialDescriptor, 3, v0.f86626a, adUnit.expiry);
            }
            if (dVar.r(serialDescriptor, 4) || adUnit.expiryDuration != null) {
                dVar.f(serialDescriptor, 4, v0.f86626a, adUnit.expiryDuration);
            }
            if (dVar.r(serialDescriptor, 5) || adUnit.deeplinkUrl != null) {
                dVar.f(serialDescriptor, 5, w2.f86635a, adUnit.deeplinkUrl);
            }
            if (dVar.r(serialDescriptor, 6) || adUnit.clickCoordinatesEnabled != null) {
                dVar.f(serialDescriptor, 6, wo.i.f86540a, adUnit.clickCoordinatesEnabled);
            }
            if (dVar.r(serialDescriptor, 7) || adUnit.adLoadOptimizationEnabled != null) {
                dVar.f(serialDescriptor, 7, wo.i.f86540a, adUnit.adLoadOptimizationEnabled);
            }
            if (dVar.r(serialDescriptor, 8) || adUnit.templateHeartbeatCheck != null) {
                dVar.f(serialDescriptor, 8, wo.i.f86540a, adUnit.templateHeartbeatCheck);
            }
            if (dVar.r(serialDescriptor, 9) || adUnit.mediationName != null) {
                dVar.f(serialDescriptor, 9, w2.f86635a, adUnit.mediationName);
            }
            if (dVar.r(serialDescriptor, 10) || adUnit.info != null) {
                dVar.f(serialDescriptor, 10, w2.f86635a, adUnit.info);
            }
            if (dVar.r(serialDescriptor, 11) || adUnit.sleep != null) {
                dVar.f(serialDescriptor, 11, v0.f86626a, adUnit.sleep);
            }
            if (dVar.r(serialDescriptor, 12) || adUnit.errorCode != null) {
                dVar.f(serialDescriptor, 12, v0.f86626a, adUnit.errorCode);
            }
            if (dVar.r(serialDescriptor, 13) || adUnit.tpat != null) {
                dVar.f(serialDescriptor, 13, TpatSerializer.INSTANCE, adUnit.tpat);
            }
            if (dVar.r(serialDescriptor, 14) || adUnit.vmURL != null) {
                dVar.f(serialDescriptor, 14, w2.f86635a, adUnit.vmURL);
            }
            if (dVar.r(serialDescriptor, 15) || adUnit.vmVersion != null) {
                dVar.f(serialDescriptor, 15, w2.f86635a, adUnit.vmVersion);
            }
            if (dVar.r(serialDescriptor, 16) || adUnit.adMarketId != null) {
                dVar.f(serialDescriptor, 16, w2.f86635a, adUnit.adMarketId);
            }
            if (dVar.r(serialDescriptor, 17) || adUnit.notification != null) {
                dVar.f(serialDescriptor, 17, new f(w2.f86635a), adUnit.notification);
            }
            if (dVar.r(serialDescriptor, 18) || adUnit.loadAdUrls != null) {
                dVar.f(serialDescriptor, 18, new f(w2.f86635a), adUnit.loadAdUrls);
            }
            if (dVar.r(serialDescriptor, 19) || adUnit.viewAbility != null) {
                dVar.f(serialDescriptor, 19, AdPayload$ViewAbility$$serializer.INSTANCE, adUnit.viewAbility);
            }
            if (dVar.r(serialDescriptor, 20) || adUnit.templateType != null) {
                dVar.f(serialDescriptor, 20, w2.f86635a, adUnit.templateType);
            }
            if (dVar.r(serialDescriptor, 21) || adUnit.templateSettings != null) {
                dVar.f(serialDescriptor, 21, AdPayload$TemplateSettings$$serializer.INSTANCE, adUnit.templateSettings);
            }
            if (dVar.r(serialDescriptor, 22) || adUnit.creativeId != null) {
                dVar.f(serialDescriptor, 22, w2.f86635a, adUnit.creativeId);
            }
            if (dVar.r(serialDescriptor, 23) || adUnit.advAppId != null) {
                dVar.f(serialDescriptor, 23, w2.f86635a, adUnit.advAppId);
            }
            if (dVar.r(serialDescriptor, 24) || (num = adUnit.showClose) == null || num.intValue() != 0) {
                dVar.f(serialDescriptor, 24, v0.f86626a, adUnit.showClose);
            }
            if (dVar.r(serialDescriptor, 25) || (num2 = adUnit.showCloseIncentivized) == null || num2.intValue() != 0) {
                dVar.f(serialDescriptor, 25, v0.f86626a, adUnit.showCloseIncentivized);
            }
            if (dVar.r(serialDescriptor, 26) || adUnit.adSizeInfo != null) {
                dVar.f(serialDescriptor, 26, AdPayload$AdSizeInfo$$serializer.INSTANCE, adUnit.adSizeInfo);
            }
            if (dVar.r(serialDescriptor, 27) || adUnit.webViewSettings != null) {
                dVar.f(serialDescriptor, 27, AdPayload$WebViewSettings$$serializer.INSTANCE, adUnit.webViewSettings);
            }
            if (dVar.r(serialDescriptor, 28) || !p.f(adUnit.usePreloading, Boolean.FALSE)) {
                dVar.f(serialDescriptor, 28, wo.i.f86540a, adUnit.usePreloading);
            }
            if (dVar.r(serialDescriptor, 29) || adUnit.partialDownloadEnabled != null) {
                dVar.f(serialDescriptor, 29, wo.i.f86540a, adUnit.partialDownloadEnabled);
            }
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @Nullable
        /* JADX INFO: renamed from: component10, reason: from getter */
        public final String getMediationName() {
            return this.mediationName;
        }

        @Nullable
        /* JADX INFO: renamed from: component11, reason: from getter */
        public final String getInfo() {
            return this.info;
        }

        @Nullable
        /* JADX INFO: renamed from: component12, reason: from getter */
        public final Integer getSleep() {
            return this.sleep;
        }

        @Nullable
        /* JADX INFO: renamed from: component13, reason: from getter */
        public final Integer getErrorCode() {
            return this.errorCode;
        }

        @Nullable
        public final Map<String, List<String>> component14() {
            return this.tpat;
        }

        @Nullable
        /* JADX INFO: renamed from: component15, reason: from getter */
        public final String getVmURL() {
            return this.vmURL;
        }

        @Nullable
        /* JADX INFO: renamed from: component16, reason: from getter */
        public final String getVmVersion() {
            return this.vmVersion;
        }

        @Nullable
        /* JADX INFO: renamed from: component17, reason: from getter */
        public final String getAdMarketId() {
            return this.adMarketId;
        }

        @Nullable
        public final List<String> component18() {
            return this.notification;
        }

        @Nullable
        public final List<String> component19() {
            return this.loadAdUrls;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getAdType() {
            return this.adType;
        }

        @Nullable
        /* JADX INFO: renamed from: component20, reason: from getter */
        public final ViewAbility getViewAbility() {
            return this.viewAbility;
        }

        @Nullable
        /* JADX INFO: renamed from: component21, reason: from getter */
        public final String getTemplateType() {
            return this.templateType;
        }

        @Nullable
        /* JADX INFO: renamed from: component22, reason: from getter */
        public final TemplateSettings getTemplateSettings() {
            return this.templateSettings;
        }

        @Nullable
        /* JADX INFO: renamed from: component23, reason: from getter */
        public final String getCreativeId() {
            return this.creativeId;
        }

        @Nullable
        /* JADX INFO: renamed from: component24, reason: from getter */
        public final String getAdvAppId() {
            return this.advAppId;
        }

        @Nullable
        /* JADX INFO: renamed from: component25, reason: from getter */
        public final Integer getShowClose() {
            return this.showClose;
        }

        @Nullable
        /* JADX INFO: renamed from: component26, reason: from getter */
        public final Integer getShowCloseIncentivized() {
            return this.showCloseIncentivized;
        }

        @Nullable
        /* JADX INFO: renamed from: component27, reason: from getter */
        public final AdSizeInfo getAdSizeInfo() {
            return this.adSizeInfo;
        }

        @Nullable
        /* JADX INFO: renamed from: component28, reason: from getter */
        public final WebViewSettings getWebViewSettings() {
            return this.webViewSettings;
        }

        @Nullable
        /* JADX INFO: renamed from: component29, reason: from getter */
        public final Boolean getUsePreloading() {
            return this.usePreloading;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getAdSource() {
            return this.adSource;
        }

        @Nullable
        /* JADX INFO: renamed from: component30, reason: from getter */
        public final Boolean getPartialDownloadEnabled() {
            return this.partialDownloadEnabled;
        }

        @Nullable
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final Integer getExpiry() {
            return this.expiry;
        }

        @Nullable
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final Integer getExpiryDuration() {
            return this.expiryDuration;
        }

        @Nullable
        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getDeeplinkUrl() {
            return this.deeplinkUrl;
        }

        @Nullable
        /* JADX INFO: renamed from: component7, reason: from getter */
        public final Boolean getClickCoordinatesEnabled() {
            return this.clickCoordinatesEnabled;
        }

        @Nullable
        /* JADX INFO: renamed from: component8, reason: from getter */
        public final Boolean getAdLoadOptimizationEnabled() {
            return this.adLoadOptimizationEnabled;
        }

        @Nullable
        /* JADX INFO: renamed from: component9, reason: from getter */
        public final Boolean getTemplateHeartbeatCheck() {
            return this.templateHeartbeatCheck;
        }

        @NotNull
        public final AdUnit copy(@Nullable String id2, @Nullable String adType, @Nullable String adSource, @Nullable Integer expiry, @Nullable Integer expiryDuration, @Nullable String deeplinkUrl, @Nullable Boolean clickCoordinatesEnabled, @Nullable Boolean adLoadOptimizationEnabled, @Nullable Boolean templateHeartbeatCheck, @Nullable String mediationName, @Nullable String info, @Nullable Integer sleep, @Nullable Integer errorCode, @Nullable Map<String, ? extends List<String>> tpat, @Nullable String vmURL, @Nullable String vmVersion, @Nullable String adMarketId, @Nullable List<String> notification, @Nullable List<String> loadAdUrls, @Nullable ViewAbility viewAbility, @Nullable String templateType, @Nullable TemplateSettings templateSettings, @Nullable String creativeId, @Nullable String advAppId, @Nullable Integer showClose, @Nullable Integer showCloseIncentivized, @Nullable AdSizeInfo adSizeInfo, @Nullable WebViewSettings webViewSettings, @Nullable Boolean usePreloading, @Nullable Boolean partialDownloadEnabled) {
            return new AdUnit(id2, adType, adSource, expiry, expiryDuration, deeplinkUrl, clickCoordinatesEnabled, adLoadOptimizationEnabled, templateHeartbeatCheck, mediationName, info, sleep, errorCode, tpat, vmURL, vmVersion, adMarketId, notification, loadAdUrls, viewAbility, templateType, templateSettings, creativeId, advAppId, showClose, showCloseIncentivized, adSizeInfo, webViewSettings, usePreloading, partialDownloadEnabled);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AdUnit)) {
                return false;
            }
            AdUnit adUnit = (AdUnit) other;
            return p.f(this.id, adUnit.id) && p.f(this.adType, adUnit.adType) && p.f(this.adSource, adUnit.adSource) && p.f(this.expiry, adUnit.expiry) && p.f(this.expiryDuration, adUnit.expiryDuration) && p.f(this.deeplinkUrl, adUnit.deeplinkUrl) && p.f(this.clickCoordinatesEnabled, adUnit.clickCoordinatesEnabled) && p.f(this.adLoadOptimizationEnabled, adUnit.adLoadOptimizationEnabled) && p.f(this.templateHeartbeatCheck, adUnit.templateHeartbeatCheck) && p.f(this.mediationName, adUnit.mediationName) && p.f(this.info, adUnit.info) && p.f(this.sleep, adUnit.sleep) && p.f(this.errorCode, adUnit.errorCode) && p.f(this.tpat, adUnit.tpat) && p.f(this.vmURL, adUnit.vmURL) && p.f(this.vmVersion, adUnit.vmVersion) && p.f(this.adMarketId, adUnit.adMarketId) && p.f(this.notification, adUnit.notification) && p.f(this.loadAdUrls, adUnit.loadAdUrls) && p.f(this.viewAbility, adUnit.viewAbility) && p.f(this.templateType, adUnit.templateType) && p.f(this.templateSettings, adUnit.templateSettings) && p.f(this.creativeId, adUnit.creativeId) && p.f(this.advAppId, adUnit.advAppId) && p.f(this.showClose, adUnit.showClose) && p.f(this.showCloseIncentivized, adUnit.showCloseIncentivized) && p.f(this.adSizeInfo, adUnit.adSizeInfo) && p.f(this.webViewSettings, adUnit.webViewSettings) && p.f(this.usePreloading, adUnit.usePreloading) && p.f(this.partialDownloadEnabled, adUnit.partialDownloadEnabled);
        }

        @Nullable
        public final Boolean getAdLoadOptimizationEnabled() {
            return this.adLoadOptimizationEnabled;
        }

        @Nullable
        public final String getAdMarketId() {
            return this.adMarketId;
        }

        @Nullable
        public final AdSizeInfo getAdSizeInfo() {
            return this.adSizeInfo;
        }

        @Nullable
        public final String getAdSource() {
            return this.adSource;
        }

        @Nullable
        public final String getAdType() {
            return this.adType;
        }

        @Nullable
        public final String getAdvAppId() {
            return this.advAppId;
        }

        @Nullable
        public final Boolean getClickCoordinatesEnabled() {
            return this.clickCoordinatesEnabled;
        }

        @Nullable
        public final String getCreativeId() {
            return this.creativeId;
        }

        @Nullable
        public final String getDeeplinkUrl() {
            return this.deeplinkUrl;
        }

        @Nullable
        public final Integer getErrorCode() {
            return this.errorCode;
        }

        @Nullable
        public final Integer getExpiry() {
            return this.expiry;
        }

        @Nullable
        public final Integer getExpiryDuration() {
            return this.expiryDuration;
        }

        @Nullable
        public final String getId() {
            return this.id;
        }

        @Nullable
        public final String getInfo() {
            return this.info;
        }

        @Nullable
        public final List<String> getLoadAdUrls() {
            return this.loadAdUrls;
        }

        @Nullable
        public final String getMediationName() {
            return this.mediationName;
        }

        @Nullable
        public final List<String> getNotification() {
            return this.notification;
        }

        @Nullable
        public final Boolean getPartialDownloadEnabled() {
            return this.partialDownloadEnabled;
        }

        @Nullable
        public final Integer getShowClose() {
            return this.showClose;
        }

        @Nullable
        public final Integer getShowCloseIncentivized() {
            return this.showCloseIncentivized;
        }

        @Nullable
        public final Integer getSleep() {
            return this.sleep;
        }

        @Nullable
        public final Boolean getTemplateHeartbeatCheck() {
            return this.templateHeartbeatCheck;
        }

        @Nullable
        public final TemplateSettings getTemplateSettings() {
            return this.templateSettings;
        }

        @Nullable
        public final String getTemplateType() {
            return this.templateType;
        }

        @Nullable
        public final Map<String, List<String>> getTpat() {
            return this.tpat;
        }

        @Nullable
        public final Boolean getUsePreloading() {
            return this.usePreloading;
        }

        @Nullable
        public final ViewAbility getViewAbility() {
            return this.viewAbility;
        }

        @Nullable
        public final String getVmURL() {
            return this.vmURL;
        }

        @Nullable
        public final String getVmVersion() {
            return this.vmVersion;
        }

        @Nullable
        public final WebViewSettings getWebViewSettings() {
            return this.webViewSettings;
        }

        public int hashCode() {
            String str = this.id;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.adType;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.adSource;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Integer num = this.expiry;
            int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.expiryDuration;
            int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
            String str4 = this.deeplinkUrl;
            int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Boolean bool = this.clickCoordinatesEnabled;
            int iHashCode7 = (iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.adLoadOptimizationEnabled;
            int iHashCode8 = (iHashCode7 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            Boolean bool3 = this.templateHeartbeatCheck;
            int iHashCode9 = (iHashCode8 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            String str5 = this.mediationName;
            int iHashCode10 = (iHashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.info;
            int iHashCode11 = (iHashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31;
            Integer num3 = this.sleep;
            int iHashCode12 = (iHashCode11 + (num3 == null ? 0 : num3.hashCode())) * 31;
            Integer num4 = this.errorCode;
            int iHashCode13 = (iHashCode12 + (num4 == null ? 0 : num4.hashCode())) * 31;
            Map<String, List<String>> map = this.tpat;
            int iHashCode14 = (iHashCode13 + (map == null ? 0 : map.hashCode())) * 31;
            String str7 = this.vmURL;
            int iHashCode15 = (iHashCode14 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.vmVersion;
            int iHashCode16 = (iHashCode15 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.adMarketId;
            int iHashCode17 = (iHashCode16 + (str9 == null ? 0 : str9.hashCode())) * 31;
            List<String> list = this.notification;
            int iHashCode18 = (iHashCode17 + (list == null ? 0 : list.hashCode())) * 31;
            List<String> list2 = this.loadAdUrls;
            int iHashCode19 = (iHashCode18 + (list2 == null ? 0 : list2.hashCode())) * 31;
            ViewAbility viewAbility = this.viewAbility;
            int iHashCode20 = (iHashCode19 + (viewAbility == null ? 0 : viewAbility.hashCode())) * 31;
            String str10 = this.templateType;
            int iHashCode21 = (iHashCode20 + (str10 == null ? 0 : str10.hashCode())) * 31;
            TemplateSettings templateSettings = this.templateSettings;
            int iHashCode22 = (iHashCode21 + (templateSettings == null ? 0 : templateSettings.hashCode())) * 31;
            String str11 = this.creativeId;
            int iHashCode23 = (iHashCode22 + (str11 == null ? 0 : str11.hashCode())) * 31;
            String str12 = this.advAppId;
            int iHashCode24 = (iHashCode23 + (str12 == null ? 0 : str12.hashCode())) * 31;
            Integer num5 = this.showClose;
            int iHashCode25 = (iHashCode24 + (num5 == null ? 0 : num5.hashCode())) * 31;
            Integer num6 = this.showCloseIncentivized;
            int iHashCode26 = (iHashCode25 + (num6 == null ? 0 : num6.hashCode())) * 31;
            AdSizeInfo adSizeInfo = this.adSizeInfo;
            int iHashCode27 = (iHashCode26 + (adSizeInfo == null ? 0 : adSizeInfo.hashCode())) * 31;
            WebViewSettings webViewSettings = this.webViewSettings;
            int iHashCode28 = (iHashCode27 + (webViewSettings == null ? 0 : webViewSettings.hashCode())) * 31;
            Boolean bool4 = this.usePreloading;
            int iHashCode29 = (iHashCode28 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
            Boolean bool5 = this.partialDownloadEnabled;
            return iHashCode29 + (bool5 != null ? bool5.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "AdUnit(id=" + this.id + ", adType=" + this.adType + ", adSource=" + this.adSource + ", expiry=" + this.expiry + ", expiryDuration=" + this.expiryDuration + ", deeplinkUrl=" + this.deeplinkUrl + ", clickCoordinatesEnabled=" + this.clickCoordinatesEnabled + ", adLoadOptimizationEnabled=" + this.adLoadOptimizationEnabled + ", templateHeartbeatCheck=" + this.templateHeartbeatCheck + ", mediationName=" + this.mediationName + ", info=" + this.info + ", sleep=" + this.sleep + ", errorCode=" + this.errorCode + ", tpat=" + this.tpat + ", vmURL=" + this.vmURL + ", vmVersion=" + this.vmVersion + ", adMarketId=" + this.adMarketId + ", notification=" + this.notification + ", loadAdUrls=" + this.loadAdUrls + ", viewAbility=" + this.viewAbility + ", templateType=" + this.templateType + ", templateSettings=" + this.templateSettings + ", creativeId=" + this.creativeId + ", advAppId=" + this.advAppId + ", showClose=" + this.showClose + ", showCloseIncentivized=" + this.showCloseIncentivized + ", adSizeInfo=" + this.adSizeInfo + ", webViewSettings=" + this.webViewSettings + ", usePreloading=" + this.usePreloading + ", partialDownloadEnabled=" + this.partialDownloadEnabled + ')';
        }
    }

    /* JADX INFO: compiled from: AdPayload.kt */
    @Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002('B+\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b!\u0010\"B;\b\u0017\u0012\u0006\u0010#\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\f\u0012\b\u0010%\u001a\u0004\u0018\u00010$¢\u0006\u0004\b!\u0010&J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u000b\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0012\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ4\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0014\u001a\u00020\tHÖ\u0001J\t\u0010\u0015\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0019\u001a\u0004\b\u001c\u0010\u001bR\"\u0010\u0011\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\u001d\u0012\u0004\b\u001f\u0010 \u001a\u0004\b\u001e\u0010\u000e¨\u0006)"}, d2 = {"Lcom/vungle/ads/internal/model/AdPayload$CacheableReplacement;", "", "self", "Lvo/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lbn/r;", "write$Self", "", "component1", "component2", "", "component3", "()Ljava/lang/Integer;", "url", "extension", "downloadPercent", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/vungle/ads/internal/model/AdPayload$CacheableReplacement;", "toString", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getUrl", "()Ljava/lang/String;", "getExtension", "Ljava/lang/Integer;", "getDownloadPercent", "getDownloadPercent$annotations", "()V", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "seen1", "Lwo/r2;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lwo/r2;)V", VastTagName.COMPANION, "$serializer", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
    @k
    public static final /* data */ class CacheableReplacement {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @Nullable
        private final Integer downloadPercent;

        @Nullable
        private final String extension;

        @Nullable
        private final String url;

        /* JADX INFO: compiled from: AdPayload.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/internal/model/AdPayload$CacheableReplacement$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/vungle/ads/internal/model/AdPayload$CacheableReplacement;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(i iVar) {
                this();
            }

            @NotNull
            public final KSerializer<CacheableReplacement> serializer() {
                return AdPayload$CacheableReplacement$$serializer.INSTANCE;
            }
        }

        public CacheableReplacement() {
            this((String) null, (String) null, (Integer) null, 7, (i) null);
        }

        public /* synthetic */ CacheableReplacement(int i10, String str, String str2, Integer num, r2 r2Var) {
            if ((i10 & 0) != 0) {
                c2.a(i10, 0, AdPayload$CacheableReplacement$$serializer.INSTANCE.getDescriptor());
            }
            if ((i10 & 1) == 0) {
                this.url = null;
            } else {
                this.url = str;
            }
            if ((i10 & 2) == 0) {
                this.extension = null;
            } else {
                this.extension = str2;
            }
            if ((i10 & 4) == 0) {
                this.downloadPercent = null;
            } else {
                this.downloadPercent = num;
            }
        }

        public CacheableReplacement(@Nullable String str, @Nullable String str2, @Nullable Integer num) {
            this.url = str;
            this.extension = str2;
            this.downloadPercent = num;
        }

        public /* synthetic */ CacheableReplacement(String str, String str2, Integer num, int i10, i iVar) {
            this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : num);
        }

        public static /* synthetic */ CacheableReplacement copy$default(CacheableReplacement cacheableReplacement, String str, String str2, Integer num, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = cacheableReplacement.url;
            }
            if ((i10 & 2) != 0) {
                str2 = cacheableReplacement.extension;
            }
            if ((i10 & 4) != 0) {
                num = cacheableReplacement.downloadPercent;
            }
            return cacheableReplacement.copy(str, str2, num);
        }

        public static /* synthetic */ void getDownloadPercent$annotations() {
        }

        public static final void write$Self(@NotNull CacheableReplacement cacheableReplacement, @NotNull d dVar, @NotNull SerialDescriptor serialDescriptor) {
            p.k(cacheableReplacement, "self");
            p.k(dVar, "output");
            p.k(serialDescriptor, "serialDesc");
            if (dVar.r(serialDescriptor, 0) || cacheableReplacement.url != null) {
                dVar.f(serialDescriptor, 0, w2.f86635a, cacheableReplacement.url);
            }
            if (dVar.r(serialDescriptor, 1) || cacheableReplacement.extension != null) {
                dVar.f(serialDescriptor, 1, w2.f86635a, cacheableReplacement.extension);
            }
            if (dVar.r(serialDescriptor, 2) || cacheableReplacement.downloadPercent != null) {
                dVar.f(serialDescriptor, 2, v0.f86626a, cacheableReplacement.downloadPercent);
            }
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getExtension() {
            return this.extension;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Integer getDownloadPercent() {
            return this.downloadPercent;
        }

        @NotNull
        public final CacheableReplacement copy(@Nullable String url, @Nullable String extension, @Nullable Integer downloadPercent) {
            return new CacheableReplacement(url, extension, downloadPercent);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CacheableReplacement)) {
                return false;
            }
            CacheableReplacement cacheableReplacement = (CacheableReplacement) other;
            return p.f(this.url, cacheableReplacement.url) && p.f(this.extension, cacheableReplacement.extension) && p.f(this.downloadPercent, cacheableReplacement.downloadPercent);
        }

        @Nullable
        public final Integer getDownloadPercent() {
            return this.downloadPercent;
        }

        @Nullable
        public final String getExtension() {
            return this.extension;
        }

        @Nullable
        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            String str = this.url;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.extension;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Integer num = this.downloadPercent;
            return iHashCode2 + (num != null ? num.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "CacheableReplacement(url=" + this.url + ", extension=" + this.extension + ", downloadPercent=" + this.downloadPercent + ')';
        }
    }

    /* JADX INFO: compiled from: AdPayload.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0001R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/vungle/ads/internal/model/AdPayload$Companion;", "", "()V", "FILE_SCHEME", "", AdPayload.INCENTIVIZED_BODY_TEXT, AdPayload.INCENTIVIZED_CLOSE_TEXT, AdPayload.INCENTIVIZED_CONTINUE_TEXT, AdPayload.INCENTIVIZED_TITLE_TEXT, "KEY_VM", "TAG", "TPAT_CLICK_COORDINATES_URLS", "UNKNOWN", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/vungle/ads/internal/model/AdPayload;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        @NotNull
        public final KSerializer<AdPayload> serializer() {
            return AdPayload$$serializer.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: AdPayload.kt */
    @Metadata(bv = {}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002&%B\u001f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u001f\u0010 B3\b\u0017\u0012\u0006\u0010!\u001a\u00020\u0011\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b\u001f\u0010$J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u000b\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0003J!\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\t\u0010\u0010\u001a\u00020\tHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0011HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\r\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010\u0016\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018R\"\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010\u001b\u0012\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001c\u0010\u001d¨\u0006'"}, d2 = {"Lcom/vungle/ads/internal/model/AdPayload$PlacementAdUnit;", "", "self", "Lvo/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lbn/r;", "write$Self", "", "component1", "Lcom/vungle/ads/internal/model/AdPayload$AdUnit;", "component2", "placementReferenceId", "adMarkup", "copy", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getPlacementReferenceId", "()Ljava/lang/String;", "getPlacementReferenceId$annotations", "()V", "Lcom/vungle/ads/internal/model/AdPayload$AdUnit;", "getAdMarkup", "()Lcom/vungle/ads/internal/model/AdPayload$AdUnit;", "getAdMarkup$annotations", "<init>", "(Ljava/lang/String;Lcom/vungle/ads/internal/model/AdPayload$AdUnit;)V", "seen1", "Lwo/r2;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/vungle/ads/internal/model/AdPayload$AdUnit;Lwo/r2;)V", VastTagName.COMPANION, "$serializer", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
    @k
    public static final /* data */ class PlacementAdUnit {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @Nullable
        private final AdUnit adMarkup;

        @Nullable
        private final String placementReferenceId;

        /* JADX INFO: compiled from: AdPayload.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/internal/model/AdPayload$PlacementAdUnit$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/vungle/ads/internal/model/AdPayload$PlacementAdUnit;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(i iVar) {
                this();
            }

            @NotNull
            public final KSerializer<PlacementAdUnit> serializer() {
                return AdPayload$PlacementAdUnit$$serializer.INSTANCE;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public PlacementAdUnit() {
            this((String) null, (AdUnit) (0 == true ? 1 : 0), 3, (i) (0 == true ? 1 : 0));
        }

        public /* synthetic */ PlacementAdUnit(int i10, String str, AdUnit adUnit, r2 r2Var) {
            if ((i10 & 0) != 0) {
                c2.a(i10, 0, AdPayload$PlacementAdUnit$$serializer.INSTANCE.getDescriptor());
            }
            if ((i10 & 1) == 0) {
                this.placementReferenceId = null;
            } else {
                this.placementReferenceId = str;
            }
            if ((i10 & 2) == 0) {
                this.adMarkup = null;
            } else {
                this.adMarkup = adUnit;
            }
        }

        public PlacementAdUnit(@Nullable String str, @Nullable AdUnit adUnit) {
            this.placementReferenceId = str;
            this.adMarkup = adUnit;
        }

        public /* synthetic */ PlacementAdUnit(String str, AdUnit adUnit, int i10, i iVar) {
            this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : adUnit);
        }

        public static /* synthetic */ PlacementAdUnit copy$default(PlacementAdUnit placementAdUnit, String str, AdUnit adUnit, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = placementAdUnit.placementReferenceId;
            }
            if ((i10 & 2) != 0) {
                adUnit = placementAdUnit.adMarkup;
            }
            return placementAdUnit.copy(str, adUnit);
        }

        public static /* synthetic */ void getAdMarkup$annotations() {
        }

        public static /* synthetic */ void getPlacementReferenceId$annotations() {
        }

        public static final void write$Self(@NotNull PlacementAdUnit placementAdUnit, @NotNull d dVar, @NotNull SerialDescriptor serialDescriptor) {
            p.k(placementAdUnit, "self");
            p.k(dVar, "output");
            p.k(serialDescriptor, "serialDesc");
            if (dVar.r(serialDescriptor, 0) || placementAdUnit.placementReferenceId != null) {
                dVar.f(serialDescriptor, 0, w2.f86635a, placementAdUnit.placementReferenceId);
            }
            if (dVar.r(serialDescriptor, 1) || placementAdUnit.adMarkup != null) {
                dVar.f(serialDescriptor, 1, AdPayload$AdUnit$$serializer.INSTANCE, placementAdUnit.adMarkup);
            }
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getPlacementReferenceId() {
            return this.placementReferenceId;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final AdUnit getAdMarkup() {
            return this.adMarkup;
        }

        @NotNull
        public final PlacementAdUnit copy(@Nullable String placementReferenceId, @Nullable AdUnit adMarkup) {
            return new PlacementAdUnit(placementReferenceId, adMarkup);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PlacementAdUnit)) {
                return false;
            }
            PlacementAdUnit placementAdUnit = (PlacementAdUnit) other;
            return p.f(this.placementReferenceId, placementAdUnit.placementReferenceId) && p.f(this.adMarkup, placementAdUnit.adMarkup);
        }

        @Nullable
        public final AdUnit getAdMarkup() {
            return this.adMarkup;
        }

        @Nullable
        public final String getPlacementReferenceId() {
            return this.placementReferenceId;
        }

        public int hashCode() {
            String str = this.placementReferenceId;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            AdUnit adUnit = this.adMarkup;
            return iHashCode + (adUnit != null ? adUnit.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "PlacementAdUnit(placementReferenceId=" + this.placementReferenceId + ", adMarkup=" + this.adMarkup + ')';
        }
    }

    /* JADX INFO: compiled from: AdPayload.kt */
    @Metadata(bv = {}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%$B7\u0012\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\f\u0018\u00010\t¢\u0006\u0004\b\u001e\u0010\u001fBK\b\u0017\u0012\u0006\u0010 \u001a\u00020\u0012\u0012\u0016\b\u0001\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0016\b\u0001\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\f\u0018\u00010\t\u0012\b\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b\u001e\u0010#J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u0017\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J\u0017\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\f\u0018\u00010\tHÆ\u0003J9\u0010\u0010\u001a\u00020\u00002\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\f\u0018\u00010\tHÆ\u0001J\t\u0010\u0011\u001a\u00020\nHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0012HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003R.\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010\u0017\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019R.\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\f\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010\u0017\u0012\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001c\u0010\u0019¨\u0006&"}, d2 = {"Lcom/vungle/ads/internal/model/AdPayload$TemplateSettings;", "", "self", "Lvo/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lbn/r;", "write$Self", "", "", "component1", "Lcom/vungle/ads/internal/model/AdPayload$CacheableReplacement;", "component2", "normalReplacements", "cacheableReplacements", "copy", "toString", "", "hashCode", "other", "", "equals", "Ljava/util/Map;", "getNormalReplacements", "()Ljava/util/Map;", "getNormalReplacements$annotations", "()V", "getCacheableReplacements", "getCacheableReplacements$annotations", "<init>", "(Ljava/util/Map;Ljava/util/Map;)V", "seen1", "Lwo/r2;", "serializationConstructorMarker", "(ILjava/util/Map;Ljava/util/Map;Lwo/r2;)V", VastTagName.COMPANION, "$serializer", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
    @k
    public static final /* data */ class TemplateSettings {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @Nullable
        private final Map<String, CacheableReplacement> cacheableReplacements;

        @Nullable
        private final Map<String, String> normalReplacements;

        /* JADX INFO: compiled from: AdPayload.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/internal/model/AdPayload$TemplateSettings$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/vungle/ads/internal/model/AdPayload$TemplateSettings;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(i iVar) {
                this();
            }

            @NotNull
            public final KSerializer<TemplateSettings> serializer() {
                return AdPayload$TemplateSettings$$serializer.INSTANCE;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public TemplateSettings() {
            this((Map) null, (Map) (0 == true ? 1 : 0), 3, (i) (0 == true ? 1 : 0));
        }

        public /* synthetic */ TemplateSettings(int i10, Map map, Map map2, r2 r2Var) {
            if ((i10 & 0) != 0) {
                c2.a(i10, 0, AdPayload$TemplateSettings$$serializer.INSTANCE.getDescriptor());
            }
            if ((i10 & 1) == 0) {
                this.normalReplacements = null;
            } else {
                this.normalReplacements = map;
            }
            if ((i10 & 2) == 0) {
                this.cacheableReplacements = null;
            } else {
                this.cacheableReplacements = map2;
            }
        }

        public TemplateSettings(@Nullable Map<String, String> map, @Nullable Map<String, CacheableReplacement> map2) {
            this.normalReplacements = map;
            this.cacheableReplacements = map2;
        }

        public /* synthetic */ TemplateSettings(Map map, Map map2, int i10, i iVar) {
            this((i10 & 1) != 0 ? null : map, (i10 & 2) != 0 ? null : map2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TemplateSettings copy$default(TemplateSettings templateSettings, Map map, Map map2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                map = templateSettings.normalReplacements;
            }
            if ((i10 & 2) != 0) {
                map2 = templateSettings.cacheableReplacements;
            }
            return templateSettings.copy(map, map2);
        }

        public static /* synthetic */ void getCacheableReplacements$annotations() {
        }

        public static /* synthetic */ void getNormalReplacements$annotations() {
        }

        public static final void write$Self(@NotNull TemplateSettings templateSettings, @NotNull d dVar, @NotNull SerialDescriptor serialDescriptor) {
            p.k(templateSettings, "self");
            p.k(dVar, "output");
            p.k(serialDescriptor, "serialDesc");
            if (dVar.r(serialDescriptor, 0) || templateSettings.normalReplacements != null) {
                w2 w2Var = w2.f86635a;
                dVar.f(serialDescriptor, 0, new a1(w2Var, w2Var), templateSettings.normalReplacements);
            }
            if (dVar.r(serialDescriptor, 1) || templateSettings.cacheableReplacements != null) {
                dVar.f(serialDescriptor, 1, new a1(w2.f86635a, AdPayload$CacheableReplacement$$serializer.INSTANCE), templateSettings.cacheableReplacements);
            }
        }

        @Nullable
        public final Map<String, String> component1() {
            return this.normalReplacements;
        }

        @Nullable
        public final Map<String, CacheableReplacement> component2() {
            return this.cacheableReplacements;
        }

        @NotNull
        public final TemplateSettings copy(@Nullable Map<String, String> normalReplacements, @Nullable Map<String, CacheableReplacement> cacheableReplacements) {
            return new TemplateSettings(normalReplacements, cacheableReplacements);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TemplateSettings)) {
                return false;
            }
            TemplateSettings templateSettings = (TemplateSettings) other;
            return p.f(this.normalReplacements, templateSettings.normalReplacements) && p.f(this.cacheableReplacements, templateSettings.cacheableReplacements);
        }

        @Nullable
        public final Map<String, CacheableReplacement> getCacheableReplacements() {
            return this.cacheableReplacements;
        }

        @Nullable
        public final Map<String, String> getNormalReplacements() {
            return this.normalReplacements;
        }

        public int hashCode() {
            Map<String, String> map = this.normalReplacements;
            int iHashCode = (map == null ? 0 : map.hashCode()) * 31;
            Map<String, CacheableReplacement> map2 = this.cacheableReplacements;
            return iHashCode + (map2 != null ? map2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "TemplateSettings(normalReplacements=" + this.normalReplacements + ", cacheableReplacements=" + this.cacheableReplacements + ')';
        }
    }

    /* JADX INFO: compiled from: AdPayload.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00040\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0014¨\u0006\n"}, d2 = {"Lcom/vungle/ads/internal/model/AdPayload$TpatSerializer;", "Lxo/f0;", "", "", "", "Lkotlinx/serialization/json/JsonElement;", "element", "transformDeserialize", "<init>", "()V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
    public static final class TpatSerializer extends f0<Map<String, ? extends List<? extends String>>> {

        @NotNull
        public static final TpatSerializer INSTANCE = new TpatSerializer();

        /* JADX WARN: Illegal instructions before constructor call */
        private TpatSerializer() {
            x xVar = x.f85368a;
            super(a.k(a.J(xVar), a.h(a.J(xVar))));
        }

        @Override // xo.f0
        @NotNull
        public JsonElement transformDeserialize(@NotNull JsonElement element) {
            p.k(element, "element");
            JsonObject jsonObjectI = xo.i.i(element);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, JsonElement> entry : jsonObjectI.entrySet()) {
                if (!p.f(entry.getKey(), "moat")) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            return new JsonObject(linkedHashMap);
        }
    }

    /* JADX INFO: compiled from: AdPayload.kt */
    @Metadata(bv = {}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001e\u001dB\u0013\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0017\u0010\u0018B%\b\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u000f\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u0017\u0010\u001cJ!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u000b\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0015\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\tHÆ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001f"}, d2 = {"Lcom/vungle/ads/internal/model/AdPayload$ViewAbility;", "", "self", "Lvo/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lbn/r;", "write$Self", "Lcom/vungle/ads/internal/model/AdPayload$ViewAbilityInfo;", "component1", AdMeasurerFactory.OM, "copy", "", "toString", "", "hashCode", "other", "", "equals", "Lcom/vungle/ads/internal/model/AdPayload$ViewAbilityInfo;", "getOm", "()Lcom/vungle/ads/internal/model/AdPayload$ViewAbilityInfo;", "<init>", "(Lcom/vungle/ads/internal/model/AdPayload$ViewAbilityInfo;)V", "seen1", "Lwo/r2;", "serializationConstructorMarker", "(ILcom/vungle/ads/internal/model/AdPayload$ViewAbilityInfo;Lwo/r2;)V", VastTagName.COMPANION, "$serializer", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
    @k
    public static final /* data */ class ViewAbility {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @Nullable
        private final ViewAbilityInfo om;

        /* JADX INFO: compiled from: AdPayload.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/internal/model/AdPayload$ViewAbility$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/vungle/ads/internal/model/AdPayload$ViewAbility;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(i iVar) {
                this();
            }

            @NotNull
            public final KSerializer<ViewAbility> serializer() {
                return AdPayload$ViewAbility$$serializer.INSTANCE;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ViewAbility() {
            this((ViewAbilityInfo) null, 1, (i) (0 == true ? 1 : 0));
        }

        public /* synthetic */ ViewAbility(int i10, ViewAbilityInfo viewAbilityInfo, r2 r2Var) {
            if ((i10 & 0) != 0) {
                c2.a(i10, 0, AdPayload$ViewAbility$$serializer.INSTANCE.getDescriptor());
            }
            if ((i10 & 1) == 0) {
                this.om = null;
            } else {
                this.om = viewAbilityInfo;
            }
        }

        public ViewAbility(@Nullable ViewAbilityInfo viewAbilityInfo) {
            this.om = viewAbilityInfo;
        }

        public /* synthetic */ ViewAbility(ViewAbilityInfo viewAbilityInfo, int i10, i iVar) {
            this((i10 & 1) != 0 ? null : viewAbilityInfo);
        }

        public static /* synthetic */ ViewAbility copy$default(ViewAbility viewAbility, ViewAbilityInfo viewAbilityInfo, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                viewAbilityInfo = viewAbility.om;
            }
            return viewAbility.copy(viewAbilityInfo);
        }

        public static final void write$Self(@NotNull ViewAbility viewAbility, @NotNull d dVar, @NotNull SerialDescriptor serialDescriptor) {
            p.k(viewAbility, "self");
            p.k(dVar, "output");
            p.k(serialDescriptor, "serialDesc");
            boolean z10 = true;
            if (!dVar.r(serialDescriptor, 0) && viewAbility.om == null) {
                z10 = false;
            }
            if (z10) {
                dVar.f(serialDescriptor, 0, AdPayload$ViewAbilityInfo$$serializer.INSTANCE, viewAbility.om);
            }
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final ViewAbilityInfo getOm() {
            return this.om;
        }

        @NotNull
        public final ViewAbility copy(@Nullable ViewAbilityInfo om2) {
            return new ViewAbility(om2);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ViewAbility) && p.f(this.om, ((ViewAbility) other).om);
        }

        @Nullable
        public final ViewAbilityInfo getOm() {
            return this.om;
        }

        public int hashCode() {
            ViewAbilityInfo viewAbilityInfo = this.om;
            if (viewAbilityInfo == null) {
                return 0;
            }
            return viewAbilityInfo.hashCode();
        }

        @NotNull
        public String toString() {
            return "ViewAbility(om=" + this.om + ')';
        }
    }

    /* JADX INFO: compiled from: AdPayload.kt */
    @Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%$B\u001f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u001e\u0010\u001fB3\b\u0017\u0012\u0006\u0010 \u001a\u00020\u0013\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\f\u0012\b\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b\u001e\u0010#J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u0012\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0003J(\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0012\u001a\u00020\fHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0013HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\t2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010\u0017\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u000e\u0010\u000bR\"\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010\u001a\u0012\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001b\u0010\u001c¨\u0006&"}, d2 = {"Lcom/vungle/ads/internal/model/AdPayload$ViewAbilityInfo;", "", "self", "Lvo/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lbn/r;", "write$Self", "", "component1", "()Ljava/lang/Boolean;", "", "component2", "isEnabled", "extraVast", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;)Lcom/vungle/ads/internal/model/AdPayload$ViewAbilityInfo;", "toString", "", "hashCode", "other", "equals", "Ljava/lang/Boolean;", "isEnabled$annotations", "()V", "Ljava/lang/String;", "getExtraVast", "()Ljava/lang/String;", "getExtraVast$annotations", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;)V", "seen1", "Lwo/r2;", "serializationConstructorMarker", "(ILjava/lang/Boolean;Ljava/lang/String;Lwo/r2;)V", VastTagName.COMPANION, "$serializer", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
    @k
    public static final /* data */ class ViewAbilityInfo {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @Nullable
        private final String extraVast;

        @Nullable
        private final Boolean isEnabled;

        /* JADX INFO: compiled from: AdPayload.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/internal/model/AdPayload$ViewAbilityInfo$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/vungle/ads/internal/model/AdPayload$ViewAbilityInfo;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(i iVar) {
                this();
            }

            @NotNull
            public final KSerializer<ViewAbilityInfo> serializer() {
                return AdPayload$ViewAbilityInfo$$serializer.INSTANCE;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ViewAbilityInfo() {
            this((Boolean) null, (String) (0 == true ? 1 : 0), 3, (i) (0 == true ? 1 : 0));
        }

        public /* synthetic */ ViewAbilityInfo(int i10, Boolean bool, String str, r2 r2Var) {
            if ((i10 & 0) != 0) {
                c2.a(i10, 0, AdPayload$ViewAbilityInfo$$serializer.INSTANCE.getDescriptor());
            }
            if ((i10 & 1) == 0) {
                this.isEnabled = null;
            } else {
                this.isEnabled = bool;
            }
            if ((i10 & 2) == 0) {
                this.extraVast = null;
            } else {
                this.extraVast = str;
            }
        }

        public ViewAbilityInfo(@Nullable Boolean bool, @Nullable String str) {
            this.isEnabled = bool;
            this.extraVast = str;
        }

        public /* synthetic */ ViewAbilityInfo(Boolean bool, String str, int i10, i iVar) {
            this((i10 & 1) != 0 ? null : bool, (i10 & 2) != 0 ? null : str);
        }

        public static /* synthetic */ ViewAbilityInfo copy$default(ViewAbilityInfo viewAbilityInfo, Boolean bool, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                bool = viewAbilityInfo.isEnabled;
            }
            if ((i10 & 2) != 0) {
                str = viewAbilityInfo.extraVast;
            }
            return viewAbilityInfo.copy(bool, str);
        }

        public static /* synthetic */ void getExtraVast$annotations() {
        }

        public static /* synthetic */ void isEnabled$annotations() {
        }

        public static final void write$Self(@NotNull ViewAbilityInfo viewAbilityInfo, @NotNull d dVar, @NotNull SerialDescriptor serialDescriptor) {
            p.k(viewAbilityInfo, "self");
            p.k(dVar, "output");
            p.k(serialDescriptor, "serialDesc");
            if (dVar.r(serialDescriptor, 0) || viewAbilityInfo.isEnabled != null) {
                dVar.f(serialDescriptor, 0, wo.i.f86540a, viewAbilityInfo.isEnabled);
            }
            if (dVar.r(serialDescriptor, 1) || viewAbilityInfo.extraVast != null) {
                dVar.f(serialDescriptor, 1, w2.f86635a, viewAbilityInfo.extraVast);
            }
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Boolean getIsEnabled() {
            return this.isEnabled;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getExtraVast() {
            return this.extraVast;
        }

        @NotNull
        public final ViewAbilityInfo copy(@Nullable Boolean isEnabled, @Nullable String extraVast) {
            return new ViewAbilityInfo(isEnabled, extraVast);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ViewAbilityInfo)) {
                return false;
            }
            ViewAbilityInfo viewAbilityInfo = (ViewAbilityInfo) other;
            return p.f(this.isEnabled, viewAbilityInfo.isEnabled) && p.f(this.extraVast, viewAbilityInfo.extraVast);
        }

        @Nullable
        public final String getExtraVast() {
            return this.extraVast;
        }

        public int hashCode() {
            Boolean bool = this.isEnabled;
            int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            String str = this.extraVast;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        @Nullable
        public final Boolean isEnabled() {
            return this.isEnabled;
        }

        @NotNull
        public String toString() {
            return "ViewAbilityInfo(isEnabled=" + this.isEnabled + ", extraVast=" + this.extraVast + ')';
        }
    }

    /* JADX INFO: compiled from: AdPayload.kt */
    @Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002$#B\u001f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u001d\u0010\u001eB3\b\u0017\u0012\u0006\u0010\u001f\u001a\u00020\u0013\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\b\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\u001d\u0010\"J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u0012\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ(\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0012\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0013HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\t2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\r\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010\u0017\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0018\u0010\u000bR\"\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010\u0017\u0012\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b¨\u0006%"}, d2 = {"Lcom/vungle/ads/internal/model/AdPayload$WebViewSettings;", "", "self", "Lvo/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lbn/r;", "write$Self", "", "component1", "()Ljava/lang/Boolean;", "component2", "allowFileAccessFromFileUrls", "allowUniversalAccessFromFileUrls", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/vungle/ads/internal/model/AdPayload$WebViewSettings;", "", "toString", "", "hashCode", "other", "equals", "Ljava/lang/Boolean;", "getAllowFileAccessFromFileUrls", "getAllowFileAccessFromFileUrls$annotations", "()V", "getAllowUniversalAccessFromFileUrls", "getAllowUniversalAccessFromFileUrls$annotations", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "seen1", "Lwo/r2;", "serializationConstructorMarker", "(ILjava/lang/Boolean;Ljava/lang/Boolean;Lwo/r2;)V", VastTagName.COMPANION, "$serializer", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
    @k
    public static final /* data */ class WebViewSettings {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @Nullable
        private final Boolean allowFileAccessFromFileUrls;

        @Nullable
        private final Boolean allowUniversalAccessFromFileUrls;

        /* JADX INFO: compiled from: AdPayload.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/internal/model/AdPayload$WebViewSettings$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/vungle/ads/internal/model/AdPayload$WebViewSettings;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(i iVar) {
                this();
            }

            @NotNull
            public final KSerializer<WebViewSettings> serializer() {
                return AdPayload$WebViewSettings$$serializer.INSTANCE;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public WebViewSettings() {
            this((Boolean) null, (Boolean) (0 == true ? 1 : 0), 3, (i) (0 == true ? 1 : 0));
        }

        public /* synthetic */ WebViewSettings(int i10, Boolean bool, Boolean bool2, r2 r2Var) {
            if ((i10 & 0) != 0) {
                c2.a(i10, 0, AdPayload$WebViewSettings$$serializer.INSTANCE.getDescriptor());
            }
            if ((i10 & 1) == 0) {
                this.allowFileAccessFromFileUrls = null;
            } else {
                this.allowFileAccessFromFileUrls = bool;
            }
            if ((i10 & 2) == 0) {
                this.allowUniversalAccessFromFileUrls = null;
            } else {
                this.allowUniversalAccessFromFileUrls = bool2;
            }
        }

        public WebViewSettings(@Nullable Boolean bool, @Nullable Boolean bool2) {
            this.allowFileAccessFromFileUrls = bool;
            this.allowUniversalAccessFromFileUrls = bool2;
        }

        public /* synthetic */ WebViewSettings(Boolean bool, Boolean bool2, int i10, i iVar) {
            this((i10 & 1) != 0 ? null : bool, (i10 & 2) != 0 ? null : bool2);
        }

        public static /* synthetic */ WebViewSettings copy$default(WebViewSettings webViewSettings, Boolean bool, Boolean bool2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                bool = webViewSettings.allowFileAccessFromFileUrls;
            }
            if ((i10 & 2) != 0) {
                bool2 = webViewSettings.allowUniversalAccessFromFileUrls;
            }
            return webViewSettings.copy(bool, bool2);
        }

        public static /* synthetic */ void getAllowFileAccessFromFileUrls$annotations() {
        }

        public static /* synthetic */ void getAllowUniversalAccessFromFileUrls$annotations() {
        }

        public static final void write$Self(@NotNull WebViewSettings webViewSettings, @NotNull d dVar, @NotNull SerialDescriptor serialDescriptor) {
            p.k(webViewSettings, "self");
            p.k(dVar, "output");
            p.k(serialDescriptor, "serialDesc");
            if (dVar.r(serialDescriptor, 0) || webViewSettings.allowFileAccessFromFileUrls != null) {
                dVar.f(serialDescriptor, 0, wo.i.f86540a, webViewSettings.allowFileAccessFromFileUrls);
            }
            if (dVar.r(serialDescriptor, 1) || webViewSettings.allowUniversalAccessFromFileUrls != null) {
                dVar.f(serialDescriptor, 1, wo.i.f86540a, webViewSettings.allowUniversalAccessFromFileUrls);
            }
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Boolean getAllowFileAccessFromFileUrls() {
            return this.allowFileAccessFromFileUrls;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Boolean getAllowUniversalAccessFromFileUrls() {
            return this.allowUniversalAccessFromFileUrls;
        }

        @NotNull
        public final WebViewSettings copy(@Nullable Boolean allowFileAccessFromFileUrls, @Nullable Boolean allowUniversalAccessFromFileUrls) {
            return new WebViewSettings(allowFileAccessFromFileUrls, allowUniversalAccessFromFileUrls);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WebViewSettings)) {
                return false;
            }
            WebViewSettings webViewSettings = (WebViewSettings) other;
            return p.f(this.allowFileAccessFromFileUrls, webViewSettings.allowFileAccessFromFileUrls) && p.f(this.allowUniversalAccessFromFileUrls, webViewSettings.allowUniversalAccessFromFileUrls);
        }

        @Nullable
        public final Boolean getAllowFileAccessFromFileUrls() {
            return this.allowFileAccessFromFileUrls;
        }

        @Nullable
        public final Boolean getAllowUniversalAccessFromFileUrls() {
            return this.allowUniversalAccessFromFileUrls;
        }

        public int hashCode() {
            Boolean bool = this.allowFileAccessFromFileUrls;
            int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            Boolean bool2 = this.allowUniversalAccessFromFileUrls;
            return iHashCode + (bool2 != null ? bool2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "WebViewSettings(allowFileAccessFromFileUrls=" + this.allowFileAccessFromFileUrls + ", allowUniversalAccessFromFileUrls=" + this.allowUniversalAccessFromFileUrls + ')';
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AdPayload() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public /* synthetic */ AdPayload(int i10, List list, ConfigPayload configPayload, Long l10, ConcurrentHashMap concurrentHashMap, @VisibleForTesting Map map, boolean z10, String str, r2 r2Var) {
        if ((i10 & 0) != 0) {
            c2.a(i10, 0, AdPayload$$serializer.INSTANCE.getDescriptor());
        }
        if ((i10 & 1) == 0) {
            this.ads = null;
        } else {
            this.ads = list;
        }
        if ((i10 & 2) == 0) {
            this.config = null;
        } else {
            this.config = configPayload;
        }
        if ((i10 & 4) == 0) {
            this.expiryWindowStart = null;
        } else {
            this.expiryWindowStart = l10;
        }
        if ((i10 & 8) == 0) {
            this.mraidFiles = new ConcurrentHashMap<>();
        } else {
            this.mraidFiles = concurrentHashMap;
        }
        if ((i10 & 16) == 0) {
            this.incentivizedTextSettings = new HashMap();
        } else {
            this.incentivizedTextSettings = map;
        }
        if ((i10 & 32) == 0) {
            this.assetsFullyDownloaded = false;
        } else {
            this.assetsFullyDownloaded = z10;
        }
        this.adConfig = null;
        this.logEntry = null;
        if ((i10 & 64) == 0) {
            this.indexFilePath = null;
        } else {
            this.indexFilePath = str;
        }
        this.partialDownloadAssets = new LinkedHashMap();
    }

    public AdPayload(@Nullable List<PlacementAdUnit> list, @Nullable ConfigPayload configPayload) {
        this.ads = list;
        this.config = configPayload;
        this.mraidFiles = new ConcurrentHashMap<>();
        this.incentivizedTextSettings = new HashMap();
        this.partialDownloadAssets = new LinkedHashMap();
    }

    public /* synthetic */ AdPayload(List list, ConfigPayload configPayload, int i10, i iVar) {
        this((i10 & 1) != 0 ? null : list, (i10 & 2) != 0 ? null : configPayload);
    }

    private final String complexReplace(String str, String str2, String str3) {
        String strQuote = Pattern.quote(str2);
        p.j(strQuote, "quote(oldValue)");
        return new Regex(strQuote).replace(str, valueOrEmpty(str3));
    }

    private final Pair<Boolean, Integer> computeAssetRequirement(Integer percentage) {
        return (isNativeTemplateType() || !adLoadOptimizationEnabled()) ? h.a(Boolean.TRUE, null) : !isPartialDownloadEnabled() ? h.a(Boolean.FALSE, null) : (percentage == null || percentage.intValue() <= 0) ? h.a(Boolean.FALSE, null) : h.a(Boolean.TRUE, percentage);
    }

    private final PlacementAdUnit getAd() {
        List<PlacementAdUnit> list = this.ads;
        if (list == null || !(!list.isEmpty())) {
            return null;
        }
        return list.get(0);
    }

    public static /* synthetic */ void getAdConfig$annotations() {
    }

    private final AdUnit getAdMarkup() {
        PlacementAdUnit ad2 = getAd();
        if (ad2 != null) {
            return ad2.getAdMarkup();
        }
        return null;
    }

    private static /* synthetic */ void getAds$annotations() {
    }

    private static /* synthetic */ void getConfig$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getIncentivizedTextSettings$annotations() {
    }

    private final Pair<String, File> getIndexHtmlFile(File dir) {
        AdUnit adMarkup;
        String vmURL;
        Object objM7534constructorimpl;
        File parentFile;
        if (isNativeTemplateType() || (adMarkup = getAdMarkup()) == null || (vmURL = adMarkup.getVmURL()) == null) {
            return null;
        }
        if (!FileUtility.INSTANCE.isValidUrl(vmURL)) {
            vmURL = null;
        }
        if (vmURL == null) {
            return null;
        }
        try {
            Result.a aVar = Result.Companion;
            String path = new URI(vmURL).getPath();
            p.j(path, "URI(url).path");
            List listT0 = d0.T0(d0.t1(path, '/'), new char[]{'/'}, false, 0, 6, null);
            objM7534constructorimpl = Result.m7534constructorimpl(listT0.size() >= 2 ? cn.f0.D0(cn.f0.Z0(listT0, 2), "_", null, null, 0, null, null, 62, null) : "index.html");
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM7534constructorimpl = Result.m7534constructorimpl(c.a(th2));
        }
        if (Result.m7539isFailureimpl(objM7534constructorimpl)) {
            objM7534constructorimpl = null;
        }
        String str = (String) objM7534constructorimpl;
        if (str == null || (parentFile = dir.getParentFile()) == null) {
            return null;
        }
        return new Pair<>(vmURL, new File(parentFile, str));
    }

    public static /* synthetic */ void getLogEntry$vungle_ads_release$annotations() {
    }

    private static /* synthetic */ void getMraidFiles$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getPartialDownloadAssets$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ List getTpatUrls$default(AdPayload adPayload, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        if ((i10 & 4) != 0) {
            str3 = null;
        }
        return adPayload.getTpatUrls(str, str2, str3);
    }

    private final String valueOrEmpty(String value) {
        return value == null ? "" : value;
    }

    public static final void write$Self(@NotNull AdPayload adPayload, @NotNull d dVar, @NotNull SerialDescriptor serialDescriptor) {
        p.k(adPayload, "self");
        p.k(dVar, "output");
        p.k(serialDescriptor, "serialDesc");
        if (dVar.r(serialDescriptor, 0) || adPayload.ads != null) {
            dVar.f(serialDescriptor, 0, new f(AdPayload$PlacementAdUnit$$serializer.INSTANCE), adPayload.ads);
        }
        if (dVar.r(serialDescriptor, 1) || adPayload.config != null) {
            dVar.f(serialDescriptor, 1, ConfigPayload$$serializer.INSTANCE, adPayload.config);
        }
        if (dVar.r(serialDescriptor, 2) || adPayload.expiryWindowStart != null) {
            dVar.f(serialDescriptor, 2, g1.f86515a, adPayload.expiryWindowStart);
        }
        if (dVar.r(serialDescriptor, 3) || !p.f(adPayload.mraidFiles, new ConcurrentHashMap())) {
            KClass kClassB = t.b(ConcurrentHashMap.class);
            w2 w2Var = w2.f86635a;
            dVar.g(serialDescriptor, 3, new so.b(kClassB, null, new KSerializer[]{w2Var, w2Var}), adPayload.mraidFiles);
        }
        if (dVar.r(serialDescriptor, 4) || !p.f(adPayload.incentivizedTextSettings, new HashMap())) {
            w2 w2Var2 = w2.f86635a;
            dVar.g(serialDescriptor, 4, new a1(w2Var2, w2Var2), adPayload.incentivizedTextSettings);
        }
        if (dVar.r(serialDescriptor, 5) || adPayload.assetsFullyDownloaded) {
            dVar.p(serialDescriptor, 5, adPayload.assetsFullyDownloaded);
        }
        if (dVar.r(serialDescriptor, 6) || adPayload.indexFilePath != null) {
            dVar.f(serialDescriptor, 6, w2.f86635a, adPayload.indexFilePath);
        }
    }

    public final int adHeight() {
        AdSizeInfo adSizeInfo;
        Integer height;
        AdUnit adMarkup = getAdMarkup();
        if (adMarkup == null || (adSizeInfo = adMarkup.getAdSizeInfo()) == null || (height = adSizeInfo.getHeight()) == null) {
            return 0;
        }
        return height.intValue();
    }

    public final boolean adLoadOptimizationEnabled() {
        Boolean adLoadOptimizationEnabled;
        AdUnit adMarkup = getAdMarkup();
        if (adMarkup == null || (adLoadOptimizationEnabled = adMarkup.getAdLoadOptimizationEnabled()) == null) {
            return true;
        }
        return adLoadOptimizationEnabled.booleanValue();
    }

    @Nullable
    public final AdUnit adUnit() {
        return getAdMarkup();
    }

    public final int adWidth() {
        AdSizeInfo adSizeInfo;
        Integer width;
        AdUnit adMarkup = getAdMarkup();
        if (adMarkup == null || (adSizeInfo = adMarkup.getAdSizeInfo()) == null || (width = adSizeInfo.getWidth()) == null) {
            return 0;
        }
        return width.intValue();
    }

    @Nullable
    public final String advAppId() {
        AdUnit adMarkup = getAdMarkup();
        if (adMarkup != null) {
            return adMarkup.getAdvAppId();
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: config, reason: from getter */
    public final ConfigPayload getConfig() {
        return this.config;
    }

    @NotNull
    public final JsonObject createMRAIDArgs() {
        Map<String, String> mRAIDArgsInMap = getMRAIDArgsInMap();
        b0 b0Var = new b0();
        for (Map.Entry<String, String> entry : mRAIDArgsInMap.entrySet()) {
            xo.h.d(b0Var, entry.getKey(), entry.getValue());
        }
        return b0Var.a();
    }

    @Nullable
    public final String eventId() {
        AdUnit adMarkup = getAdMarkup();
        if (adMarkup != null) {
            return adMarkup.getId();
        }
        return null;
    }

    @Nullable
    public final AdConfig getAdConfig() {
        return this.adConfig;
    }

    @Nullable
    public final String getAdSource() {
        AdUnit adMarkup = getAdMarkup();
        if (adMarkup != null) {
            return adMarkup.getAdSource();
        }
        return null;
    }

    public final boolean getAssetsFullyDownloaded() {
        return this.assetsFullyDownloaded;
    }

    @NotNull
    public final String getCreativeId() {
        String creativeId;
        AdUnit adMarkup = getAdMarkup();
        return (adMarkup == null || (creativeId = adMarkup.getCreativeId()) == null) ? "unknown" : creativeId;
    }

    @NotNull
    public final List<AdAsset> getDownloadableAssets(@NotNull File dir) {
        TemplateSettings templateSettings;
        Map<String, CacheableReplacement> cacheableReplacements;
        p.k(dir, "dir");
        ArrayList arrayList = new ArrayList();
        Pair<String, File> indexHtmlFile = getIndexHtmlFile(dir);
        if (indexHtmlFile != null) {
            String strComponent1 = indexHtmlFile.component1();
            File fileComponent2 = indexHtmlFile.component2();
            this.indexFilePath = fileComponent2.getAbsolutePath();
            if (!fileComponent2.exists()) {
                Logger.INSTANCE.d(TAG, "No cacheable index file found, creating new one: " + fileComponent2);
                String absolutePath = fileComponent2.getAbsolutePath();
                p.j(absolutePath, "indexFile.absolutePath");
                arrayList.add(new AdAsset(KEY_VM, strComponent1, absolutePath, true, null, 16, null));
            }
        }
        AdUnit adMarkup = getAdMarkup();
        if (adMarkup != null && (templateSettings = adMarkup.getTemplateSettings()) != null && (cacheableReplacements = templateSettings.getCacheableReplacements()) != null) {
            for (Map.Entry<String, CacheableReplacement> entry : cacheableReplacements.entrySet()) {
                String key = entry.getKey();
                CacheableReplacement value = entry.getValue();
                String url = value.getUrl();
                if (url != null) {
                    FileUtility fileUtility = FileUtility.INSTANCE;
                    if (fileUtility.isValidUrl(url)) {
                        String absolutePath2 = new File(dir, fileUtility.guessFileName(url, value.getExtension())).getAbsolutePath();
                        Pair<Boolean, Integer> pairComputeAssetRequirement = computeAssetRequirement(value.getDownloadPercent());
                        boolean zBooleanValue = pairComputeAssetRequirement.component1().booleanValue();
                        Integer numComponent2 = pairComputeAssetRequirement.component2();
                        p.j(absolutePath2, Y5.c.f30725c);
                        AdAsset adAsset = new AdAsset(key, url, absolutePath2, zBooleanValue, numComponent2);
                        arrayList.add(adAsset);
                        if (zBooleanValue && numComponent2 != null) {
                            this.partialDownloadAssets.put(url, adAsset);
                        }
                    }
                }
            }
        }
        if (arrayList.size() > 1) {
            a0.D(arrayList, new Comparator() { // from class: com.vungle.ads.internal.model.AdPayload$getDownloadableAssets$$inlined$sortByDescending$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t10, T t11) {
                    return fn.b.d(Boolean.valueOf(((AdAsset) t11).getIsRequired()), Boolean.valueOf(((AdAsset) t10).getIsRequired()));
                }
            });
        }
        return arrayList;
    }

    @NotNull
    public final Map<String, String> getIncentivizedTextSettings() {
        return this.incentivizedTextSettings;
    }

    @Nullable
    public final String getIndexFilePath() {
        return this.indexFilePath;
    }

    @Nullable
    public final AdAsset getLocalPartialDownloadAssets(@NotNull String remoteUrl) {
        p.k(remoteUrl, "remoteUrl");
        return this.partialDownloadAssets.get(remoteUrl);
    }

    @Nullable
    /* JADX INFO: renamed from: getLogEntry$vungle_ads_release, reason: from getter */
    public final LogEntry getLogEntry() {
        return this.logEntry;
    }

    @NotNull
    public final Map<String, String> getMRAIDArgsInMap() {
        TemplateSettings templateSettings;
        Map<String, CacheableReplacement> cacheableReplacements;
        TemplateSettings templateSettings2;
        Map<String, String> normalReplacements;
        AdUnit adMarkup = getAdMarkup();
        if ((adMarkup != null ? adMarkup.getTemplateSettings() : null) == null) {
            throw new IllegalArgumentException("Advertisement does not have MRAID Arguments!".toString());
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        AdUnit adMarkup2 = getAdMarkup();
        if (adMarkup2 != null && (templateSettings2 = adMarkup2.getTemplateSettings()) != null && (normalReplacements = templateSettings2.getNormalReplacements()) != null) {
            linkedHashMap.putAll(normalReplacements);
        }
        AdUnit adMarkup3 = getAdMarkup();
        if (adMarkup3 != null && (templateSettings = adMarkup3.getTemplateSettings()) != null && (cacheableReplacements = templateSettings.getCacheableReplacements()) != null) {
            for (Map.Entry<String, CacheableReplacement> entry : cacheableReplacements.entrySet()) {
                String url = entry.getValue().getUrl();
                if (url != null) {
                    linkedHashMap.put(entry.getKey(), url);
                }
            }
        }
        if (!this.mraidFiles.isEmpty()) {
            linkedHashMap.putAll(this.mraidFiles);
        }
        if (!this.incentivizedTextSettings.isEmpty()) {
            linkedHashMap.putAll(this.incentivizedTextSettings);
        }
        return linkedHashMap;
    }

    @Nullable
    public final String getMediationName() {
        AdUnit adMarkup = getAdMarkup();
        if (adMarkup != null) {
            return adMarkup.getMediationName();
        }
        return null;
    }

    @NotNull
    public final Map<String, AdAsset> getPartialDownloadAssets$vungle_ads_release() {
        return this.partialDownloadAssets;
    }

    public final int getShowCloseDelay(@Nullable Boolean incentivized) {
        Integer showClose;
        Integer showCloseIncentivized;
        if (p.f(incentivized, Boolean.TRUE)) {
            AdUnit adMarkup = getAdMarkup();
            if (adMarkup == null || (showCloseIncentivized = adMarkup.getShowCloseIncentivized()) == null) {
                return 0;
            }
            return showCloseIncentivized.intValue() * 1000;
        }
        AdUnit adMarkup2 = getAdMarkup();
        if (adMarkup2 == null || (showClose = adMarkup2.getShowClose()) == null) {
            return 0;
        }
        return showClose.intValue() * 1000;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Nullable
    public final List<String> getTpatUrls(@NotNull String event, @Nullable String value, @Nullable String secondValue) {
        ArrayList arrayList;
        Map<String, List<String>> tpat;
        Map<String, List<String>> tpat2;
        p.k(event, "event");
        AdUnit adMarkup = getAdMarkup();
        if ((adMarkup == null || (tpat2 = adMarkup.getTpat()) == null || tpat2.containsKey(event)) ? false : true) {
            new TpatError(Sdk.SDKError.Reason.INVALID_TPAT_KEY, "Arbitrary tpat key: " + event).setLogEntry$vungle_ads_release(this.logEntry).logErrorNoReturnValue$vungle_ads_release();
            return null;
        }
        AdUnit adMarkup2 = getAdMarkup();
        List<String> list = (adMarkup2 == null || (tpat = adMarkup2.getTpat()) == null) ? null : tpat.get(event);
        if (list == null || list.isEmpty()) {
            new TpatError(Sdk.SDKError.Reason.EMPTY_TPAT_ERROR, "Empty tpat key: " + event).setLogEntry$vungle_ads_release(this.logEntry).logErrorNoReturnValue$vungle_ads_release();
            return null;
        }
        switch (event.hashCode()) {
            case -2125915830:
                if (!event.equals("checkpoint.0")) {
                    return list;
                }
                arrayList = new ArrayList(cn.x.x(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(complexReplace(complexReplace(complexReplace((String) it.next(), Constants.REMOTE_PLAY_KEY, String.valueOf(!this.assetsFullyDownloaded)), Constants.NETWORK_OPERATOR_KEY, value), Constants.DEVICE_VOLUME_KEY, secondValue));
                }
                break;
                break;
            case -747709511:
                if (!event.equals(Constants.VIDEO_LENGTH_TPAT)) {
                    return list;
                }
                arrayList = new ArrayList(cn.x.x(list, 10));
                Iterator<T> it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(complexReplace((String) it2.next(), Constants.VIDEO_LENGTH_KEY, value));
                }
                break;
                break;
            case -132489083:
                if (!event.equals(Constants.AD_LOAD_DURATION)) {
                    return list;
                }
                arrayList = new ArrayList(cn.x.x(list, 10));
                Iterator<T> it3 = list.iterator();
                while (it3.hasNext()) {
                    arrayList.add(complexReplace((String) it3.next(), Constants.AD_LOAD_DURATION_KEY, value));
                }
                break;
                break;
            case 1516630125:
                if (!event.equals(Constants.AD_CLOSE)) {
                    return list;
                }
                arrayList = new ArrayList(cn.x.x(list, 10));
                Iterator<T> it4 = list.iterator();
                while (it4.hasNext()) {
                    arrayList.add(complexReplace(complexReplace((String) it4.next(), Constants.AD_DURATION_KEY, value), Constants.DEVICE_VOLUME_KEY, secondValue));
                }
                break;
                break;
            case 1940309120:
                if (!event.equals(Constants.DEEPLINK_CLICK)) {
                    return list;
                }
                arrayList = new ArrayList(cn.x.x(list, 10));
                Iterator<T> it5 = list.iterator();
                while (it5.hasNext()) {
                    arrayList.add(complexReplace((String) it5.next(), Constants.DEEPLINK_SUCCESS_KEY, value));
                }
                break;
                break;
            default:
                return list;
        }
        return arrayList;
    }

    @Nullable
    public final String getViewMasterVersion() {
        AdUnit adMarkup = getAdMarkup();
        if (adMarkup != null) {
            return adMarkup.getVmVersion();
        }
        return null;
    }

    @Nullable
    public final WebViewSettings getWebViewSettings() {
        AdUnit adMarkup = getAdMarkup();
        if (adMarkup != null) {
            return adMarkup.getWebViewSettings();
        }
        return null;
    }

    @Nullable
    public final List<String> getWinNotifications() {
        AdUnit adMarkup = getAdMarkup();
        if (adMarkup != null) {
            return adMarkup.getNotification();
        }
        return null;
    }

    public final boolean hasExpired() {
        AdUnit adMarkup = getAdMarkup();
        if (adMarkup == null) {
            return false;
        }
        Long l10 = this.expiryWindowStart;
        if (adMarkup.getExpiryDuration() != null && l10 != null) {
            if ((System.currentTimeMillis() - l10.longValue()) / 1000 <= (adMarkup.getExpiryDuration() != null ? Long.valueOf(r0.intValue()) : null).longValue()) {
                return false;
            }
        } else {
            if (adMarkup.getExpiry() == null) {
                return false;
            }
            if (System.currentTimeMillis() / 1000 <= (adMarkup.getExpiry() != null ? Long.valueOf(r0.intValue()) : null).longValue()) {
                return false;
            }
        }
        return true;
    }

    public final boolean heartbeatEnabled() {
        Boolean templateHeartbeatCheck;
        AdUnit adMarkup = getAdMarkup();
        if (adMarkup == null || (templateHeartbeatCheck = adMarkup.getTemplateHeartbeatCheck()) == null) {
            return false;
        }
        return templateHeartbeatCheck.booleanValue();
    }

    public final boolean isClickCoordinatesTrackingEnabled() {
        Boolean clickCoordinatesEnabled;
        AdUnit adMarkup = getAdMarkup();
        if (adMarkup == null || (clickCoordinatesEnabled = adMarkup.getClickCoordinatesEnabled()) == null) {
            return false;
        }
        return clickCoordinatesEnabled.booleanValue();
    }

    public final boolean isCriticalAsset(@NotNull String failingUrl) {
        TemplateSettings templateSettings;
        Map<String, CacheableReplacement> cacheableReplacements;
        p.k(failingUrl, "failingUrl");
        if (!isNativeTemplateType()) {
            AdUnit adMarkup = getAdMarkup();
            if (p.f(adMarkup != null ? adMarkup.getVmURL() : null, failingUrl)) {
                return true;
            }
        }
        AdUnit adMarkup2 = getAdMarkup();
        if (adMarkup2 == null || (templateSettings = adMarkup2.getTemplateSettings()) == null || (cacheableReplacements = templateSettings.getCacheableReplacements()) == null) {
            return false;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, CacheableReplacement> entry : cacheableReplacements.entrySet()) {
            if (p.f(entry.getValue().getUrl(), failingUrl)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return !linkedHashMap.isEmpty();
    }

    public final boolean isNativeTemplateType() {
        return p.f(templateType(), "native");
    }

    public final boolean isPartialDownloadEnabled() {
        Boolean partialDownloadEnabled;
        AdUnit adMarkup = getAdMarkup();
        if (adMarkup == null || (partialDownloadEnabled = adMarkup.getPartialDownloadEnabled()) == null) {
            return false;
        }
        return partialDownloadEnabled.booleanValue();
    }

    public final boolean omEnabled() {
        ViewAbility viewAbility;
        ViewAbilityInfo om2;
        Boolean boolIsEnabled;
        AdUnit adMarkup = getAdMarkup();
        if (adMarkup == null || (viewAbility = adMarkup.getViewAbility()) == null || (om2 = viewAbility.getOm()) == null || (boolIsEnabled = om2.isEnabled()) == null) {
            return false;
        }
        return boolIsEnabled.booleanValue();
    }

    @Nullable
    public final String placementId() {
        PlacementAdUnit ad2 = getAd();
        if (ad2 != null) {
            return ad2.getPlacementReferenceId();
        }
        return null;
    }

    public final void recordExpiryWindowStart() {
        this.expiryWindowStart = Long.valueOf(System.currentTimeMillis());
    }

    public final void setAdConfig(@Nullable AdConfig adConfig) {
        this.adConfig = adConfig;
    }

    public final void setAssetFullyDownloaded() {
        this.assetsFullyDownloaded = true;
    }

    public final void setAssetsFullyDownloaded(boolean z10) {
        this.assetsFullyDownloaded = z10;
    }

    public final void setIncentivizedText(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        p.k(str, "title");
        p.k(str2, "body");
        p.k(str3, "keepWatching");
        p.k(str4, "close");
        if (str.length() > 0) {
            this.incentivizedTextSettings.put(INCENTIVIZED_TITLE_TEXT, str);
        }
        if (str2.length() > 0) {
            this.incentivizedTextSettings.put(INCENTIVIZED_BODY_TEXT, str2);
        }
        if (str3.length() > 0) {
            this.incentivizedTextSettings.put(INCENTIVIZED_CONTINUE_TEXT, str3);
        }
        if (str4.length() > 0) {
            this.incentivizedTextSettings.put(INCENTIVIZED_CLOSE_TEXT, str4);
        }
    }

    public final void setIncentivizedTextSettings(@NotNull Map<String, String> map) {
        p.k(map, "<set-?>");
        this.incentivizedTextSettings = map;
    }

    public final void setLogEntry$vungle_ads_release(@Nullable LogEntry logEntry) {
        this.logEntry = logEntry;
    }

    @Nullable
    public final String templateType() {
        AdUnit adMarkup = getAdMarkup();
        if (adMarkup != null) {
            return adMarkup.getTemplateType();
        }
        return null;
    }

    public final synchronized void updateAdAssetPath(@NotNull String str, @NotNull File file) {
        p.k(str, "adIdentifier");
        p.k(file, "localFile");
        if (file.exists()) {
            this.mraidFiles.put(str, FILE_SCHEME + file.getAbsolutePath());
        }
    }

    public final boolean usePreloading() {
        AdUnit adMarkup = getAdMarkup();
        if (adMarkup != null) {
            return p.f(adMarkup.getUsePreloading(), Boolean.TRUE);
        }
        return false;
    }
}
