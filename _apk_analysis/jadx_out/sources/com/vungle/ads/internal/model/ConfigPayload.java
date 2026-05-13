package com.vungle.ads.internal.model;

import cn.p0;
import com.inmobi.sdk.InMobiSdk;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import so.k;
import tn.i;
import tn.p;
import vo.d;
import wo.c2;
import wo.f;
import wo.g1;
import wo.r2;
import wo.v0;
import wo.w2;
import zn.n;

/* JADX INFO: compiled from: ConfigPayload.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b_\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u0000 \u008a\u00012\u00020\u0001:\u0014\u008b\u0001\u008c\u0001\u008d\u0001\u008a\u0001\u008e\u0001\u008f\u0001\u0090\u0001\u0091\u0001\u0092\u0001\u0093\u0001Bó\u0001\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u000f\u0012\u0010\b\u0002\u0010/\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010:\u001a\u0004\u0018\u00010$\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010'\u0012\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\u0018¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001B\u008a\u0002\b\u0017\u0012\u0007\u0010\u0086\u0001\u001a\u00020\u001c\u0012\n\b\u0001\u0010+\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010,\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010-\u001a\u0004\u0018\u00010\r\u0012\n\b\u0001\u0010.\u001a\u0004\u0018\u00010\u000f\u0012\u0010\b\u0001\u0010/\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u0012\n\b\u0001\u00100\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0001\u00101\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0001\u00102\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0001\u00103\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0001\u00104\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0001\u00105\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0001\u00106\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0001\u00107\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0001\u00108\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0001\u00109\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0001\u0010:\u001a\u0004\u0018\u00010$\u0012\n\b\u0001\u0010;\u001a\u0004\u0018\u00010'\u0012\n\b\u0001\u0010<\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0001\u0010=\u001a\u0004\u0018\u00010\u0018\u0012\n\u0010\u0088\u0001\u001a\u0005\u0018\u00010\u0087\u0001¢\u0006\u0006\b\u0084\u0001\u0010\u0089\u0001J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u000b\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u0011\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001aJ\u0012\u0010 \u001a\u0004\u0018\u00010\u001cHÆ\u0003¢\u0006\u0004\b \u0010\u001eJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\b!\u0010\u001aJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\b\"\u0010\u001aJ\u0012\u0010#\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\b#\u0010\u001aJ\u0012\u0010%\u001a\u0004\u0018\u00010$HÆ\u0003¢\u0006\u0004\b%\u0010&J\u000b\u0010(\u001a\u0004\u0018\u00010'HÆ\u0003J\u0012\u0010)\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\b)\u0010\u001aJ\u0012\u0010*\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\b*\u0010\u001aJú\u0001\u0010>\u001a\u00020\u00002\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u000f2\u0010\b\u0002\u0010/\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010:\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010;\u001a\u0004\u0018\u00010'2\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\u0018HÆ\u0001¢\u0006\u0004\b>\u0010?J\t\u0010@\u001a\u00020\u0016HÖ\u0001J\t\u0010A\u001a\u00020\u001cHÖ\u0001J\u0013\u0010C\u001a\u00020\u00182\b\u0010B\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010+\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b+\u0010D\u0012\u0004\bG\u0010H\u001a\u0004\bE\u0010FR\"\u0010,\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b,\u0010I\u0012\u0004\bL\u0010H\u001a\u0004\bJ\u0010KR\"\u0010-\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b-\u0010M\u0012\u0004\bP\u0010H\u001a\u0004\bN\u0010OR\"\u0010.\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b.\u0010Q\u0012\u0004\bT\u0010H\u001a\u0004\bR\u0010SR(\u0010/\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b/\u0010U\u0012\u0004\bX\u0010H\u001a\u0004\bV\u0010WR\"\u00100\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b0\u0010Y\u0012\u0004\b\\\u0010H\u001a\u0004\bZ\u0010[R\"\u00101\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b1\u0010]\u0012\u0004\b`\u0010H\u001a\u0004\b^\u0010_R\"\u00102\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b2\u0010a\u0012\u0004\bc\u0010H\u001a\u0004\bb\u0010\u001aR\"\u00103\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b3\u0010a\u0012\u0004\bd\u0010H\u001a\u0004\b3\u0010\u001aR\"\u00104\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b4\u0010e\u0012\u0004\bg\u0010H\u001a\u0004\bf\u0010\u001eR\"\u00105\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b5\u0010a\u0012\u0004\bi\u0010H\u001a\u0004\bh\u0010\u001aR\"\u00106\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b6\u0010e\u0012\u0004\bk\u0010H\u001a\u0004\bj\u0010\u001eR\"\u00107\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b7\u0010a\u0012\u0004\bm\u0010H\u001a\u0004\bl\u0010\u001aR\"\u00108\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b8\u0010a\u0012\u0004\bo\u0010H\u001a\u0004\bn\u0010\u001aR\"\u00109\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b9\u0010a\u0012\u0004\bq\u0010H\u001a\u0004\bp\u0010\u001aR*\u0010:\u001a\u0004\u0018\u00010$8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b:\u0010r\u0012\u0004\bv\u0010H\u001a\u0004\bs\u0010&\"\u0004\bt\u0010uR*\u0010;\u001a\u0004\u0018\u00010'8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b;\u0010w\u0012\u0004\b|\u0010H\u001a\u0004\bx\u0010y\"\u0004\bz\u0010{R+\u0010<\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u0019\n\u0004\b<\u0010a\u0012\u0005\b\u0080\u0001\u0010H\u001a\u0004\b}\u0010\u001a\"\u0004\b~\u0010\u007fR-\u0010=\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u001b\n\u0004\b=\u0010a\u0012\u0005\b\u0083\u0001\u0010H\u001a\u0005\b\u0081\u0001\u0010\u001a\"\u0005\b\u0082\u0001\u0010\u007f¨\u0006\u0094\u0001"}, d2 = {"Lcom/vungle/ads/internal/model/ConfigPayload;", "", "self", "Lvo/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lbn/r;", "write$Self", "Lcom/vungle/ads/internal/model/ConfigPayload$CleverCache;", "component1", "Lcom/vungle/ads/internal/model/ConfigPayload$ConfigSettings;", "component2", "Lcom/vungle/ads/internal/model/ConfigPayload$Endpoints;", "component3", "Lcom/vungle/ads/internal/model/ConfigPayload$LogMetricsSettings;", "component4", "", "Lcom/vungle/ads/internal/model/Placement;", "component5", "Lcom/vungle/ads/internal/model/ConfigPayload$UserPrivacy;", "component6", "", "component7", "", "component8", "()Ljava/lang/Boolean;", "component9", "", "component10", "()Ljava/lang/Integer;", "component11", "component12", "component13", "component14", "component15", "", "component16", "()Ljava/lang/Long;", "Lcom/vungle/ads/internal/model/ConfigPayload$AutoRedirect;", "component17", "component18", "component19", "cleverCache", "configSettings", "endpoints", "logMetricsSettings", "placements", "userPrivacy", "configExtension", "disableAdId", "isReportIncentivizedEnabled", "sessionTimeout", "waitForConnectivityForTPAT", "signalSessionTimeout", "signalsDisabled", "fpdEnabled", "rtaDebugging", "configLastValidatedTimestamp", "autoRedirect", "retryPriorityTPATs", "enableOT", "copy", "(Lcom/vungle/ads/internal/model/ConfigPayload$CleverCache;Lcom/vungle/ads/internal/model/ConfigPayload$ConfigSettings;Lcom/vungle/ads/internal/model/ConfigPayload$Endpoints;Lcom/vungle/ads/internal/model/ConfigPayload$LogMetricsSettings;Ljava/util/List;Lcom/vungle/ads/internal/model/ConfigPayload$UserPrivacy;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Long;Lcom/vungle/ads/internal/model/ConfigPayload$AutoRedirect;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/vungle/ads/internal/model/ConfigPayload;", "toString", "hashCode", "other", "equals", "Lcom/vungle/ads/internal/model/ConfigPayload$CleverCache;", "getCleverCache", "()Lcom/vungle/ads/internal/model/ConfigPayload$CleverCache;", "getCleverCache$annotations", "()V", "Lcom/vungle/ads/internal/model/ConfigPayload$ConfigSettings;", "getConfigSettings", "()Lcom/vungle/ads/internal/model/ConfigPayload$ConfigSettings;", "getConfigSettings$annotations", "Lcom/vungle/ads/internal/model/ConfigPayload$Endpoints;", "getEndpoints", "()Lcom/vungle/ads/internal/model/ConfigPayload$Endpoints;", "getEndpoints$annotations", "Lcom/vungle/ads/internal/model/ConfigPayload$LogMetricsSettings;", "getLogMetricsSettings", "()Lcom/vungle/ads/internal/model/ConfigPayload$LogMetricsSettings;", "getLogMetricsSettings$annotations", "Ljava/util/List;", "getPlacements", "()Ljava/util/List;", "getPlacements$annotations", "Lcom/vungle/ads/internal/model/ConfigPayload$UserPrivacy;", "getUserPrivacy", "()Lcom/vungle/ads/internal/model/ConfigPayload$UserPrivacy;", "getUserPrivacy$annotations", "Ljava/lang/String;", "getConfigExtension", "()Ljava/lang/String;", "getConfigExtension$annotations", "Ljava/lang/Boolean;", "getDisableAdId", "getDisableAdId$annotations", "isReportIncentivizedEnabled$annotations", "Ljava/lang/Integer;", "getSessionTimeout", "getSessionTimeout$annotations", "getWaitForConnectivityForTPAT", "getWaitForConnectivityForTPAT$annotations", "getSignalSessionTimeout", "getSignalSessionTimeout$annotations", "getSignalsDisabled", "getSignalsDisabled$annotations", "getFpdEnabled", "getFpdEnabled$annotations", "getRtaDebugging", "getRtaDebugging$annotations", "Ljava/lang/Long;", "getConfigLastValidatedTimestamp", "setConfigLastValidatedTimestamp", "(Ljava/lang/Long;)V", "getConfigLastValidatedTimestamp$annotations", "Lcom/vungle/ads/internal/model/ConfigPayload$AutoRedirect;", "getAutoRedirect", "()Lcom/vungle/ads/internal/model/ConfigPayload$AutoRedirect;", "setAutoRedirect", "(Lcom/vungle/ads/internal/model/ConfigPayload$AutoRedirect;)V", "getAutoRedirect$annotations", "getRetryPriorityTPATs", "setRetryPriorityTPATs", "(Ljava/lang/Boolean;)V", "getRetryPriorityTPATs$annotations", "getEnableOT", "setEnableOT", "getEnableOT$annotations", "<init>", "(Lcom/vungle/ads/internal/model/ConfigPayload$CleverCache;Lcom/vungle/ads/internal/model/ConfigPayload$ConfigSettings;Lcom/vungle/ads/internal/model/ConfigPayload$Endpoints;Lcom/vungle/ads/internal/model/ConfigPayload$LogMetricsSettings;Ljava/util/List;Lcom/vungle/ads/internal/model/ConfigPayload$UserPrivacy;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Long;Lcom/vungle/ads/internal/model/ConfigPayload$AutoRedirect;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "seen1", "Lwo/r2;", "serializationConstructorMarker", "(ILcom/vungle/ads/internal/model/ConfigPayload$CleverCache;Lcom/vungle/ads/internal/model/ConfigPayload$ConfigSettings;Lcom/vungle/ads/internal/model/ConfigPayload$Endpoints;Lcom/vungle/ads/internal/model/ConfigPayload$LogMetricsSettings;Ljava/util/List;Lcom/vungle/ads/internal/model/ConfigPayload$UserPrivacy;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Long;Lcom/vungle/ads/internal/model/ConfigPayload$AutoRedirect;Ljava/lang/Boolean;Ljava/lang/Boolean;Lwo/r2;)V", VastTagName.COMPANION, "$serializer", "AutoRedirect", "CleverCache", "ConfigSettings", "Endpoints", "GDPRSettings", "IABSettings", "LogMetricsSettings", "UserPrivacy", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
@k
public final /* data */ class ConfigPayload {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private AutoRedirect autoRedirect;

    @Nullable
    private final CleverCache cleverCache;

    @Nullable
    private final String configExtension;

    @Nullable
    private Long configLastValidatedTimestamp;

    @Nullable
    private final ConfigSettings configSettings;

    @Nullable
    private final Boolean disableAdId;

    @Nullable
    private Boolean enableOT;

    @Nullable
    private final Endpoints endpoints;

    @Nullable
    private final Boolean fpdEnabled;

    @Nullable
    private final Boolean isReportIncentivizedEnabled;

    @Nullable
    private final LogMetricsSettings logMetricsSettings;

    @Nullable
    private final List<Placement> placements;

    @Nullable
    private Boolean retryPriorityTPATs;

    @Nullable
    private final Boolean rtaDebugging;

    @Nullable
    private final Integer sessionTimeout;

    @Nullable
    private final Integer signalSessionTimeout;

    @Nullable
    private final Boolean signalsDisabled;

    @Nullable
    private final UserPrivacy userPrivacy;

    @Nullable
    private final Boolean waitForConnectivityForTPAT;

    /* JADX INFO: compiled from: ConfigPayload.kt */
    @Metadata(bv = {}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002'&B\u001f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b \u0010!B3\b\u0017\u0012\u0006\u0010\"\u001a\u00020\u0015\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\f\u0012\b\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b \u0010%J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u0012\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ(\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0014\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0015HÖ\u0001J\u0013\u0010\u0018\u001a\u00020\t2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u000f\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010\u0019\u0012\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001a\u0010\u000bR\"\u0010\u0010\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010\u001d\u0012\u0004\b\u001f\u0010\u001c\u001a\u0004\b\u001e\u0010\u000e¨\u0006("}, d2 = {"Lcom/vungle/ads/internal/model/ConfigPayload$AutoRedirect;", "", "self", "Lvo/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lbn/r;", "write$Self", "", "component1", "()Ljava/lang/Boolean;", "", "component2", "()Ljava/lang/Long;", "allowAutoRedirect", "afterClickDuration", "copy", "(Ljava/lang/Boolean;Ljava/lang/Long;)Lcom/vungle/ads/internal/model/ConfigPayload$AutoRedirect;", "", "toString", "", "hashCode", "other", "equals", "Ljava/lang/Boolean;", "getAllowAutoRedirect", "getAllowAutoRedirect$annotations", "()V", "Ljava/lang/Long;", "getAfterClickDuration", "getAfterClickDuration$annotations", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Long;)V", "seen1", "Lwo/r2;", "serializationConstructorMarker", "(ILjava/lang/Boolean;Ljava/lang/Long;Lwo/r2;)V", VastTagName.COMPANION, "$serializer", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
    @k
    public static final /* data */ class AutoRedirect {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @Nullable
        private final Long afterClickDuration;

        @Nullable
        private final Boolean allowAutoRedirect;

        /* JADX INFO: compiled from: ConfigPayload.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/internal/model/ConfigPayload$AutoRedirect$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/vungle/ads/internal/model/ConfigPayload$AutoRedirect;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(i iVar) {
                this();
            }

            @NotNull
            public final KSerializer<AutoRedirect> serializer() {
                return ConfigPayload$AutoRedirect$$serializer.INSTANCE;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public AutoRedirect() {
            this((Boolean) null, (Long) (0 == true ? 1 : 0), 3, (i) (0 == true ? 1 : 0));
        }

        public /* synthetic */ AutoRedirect(int i10, Boolean bool, Long l10, r2 r2Var) {
            if ((i10 & 0) != 0) {
                c2.a(i10, 0, ConfigPayload$AutoRedirect$$serializer.INSTANCE.getDescriptor());
            }
            this.allowAutoRedirect = (i10 & 1) == 0 ? Boolean.FALSE : bool;
            if ((i10 & 2) == 0) {
                this.afterClickDuration = Long.MAX_VALUE;
            } else {
                this.afterClickDuration = l10;
            }
        }

        public AutoRedirect(@Nullable Boolean bool, @Nullable Long l10) {
            this.allowAutoRedirect = bool;
            this.afterClickDuration = l10;
        }

        public /* synthetic */ AutoRedirect(Boolean bool, Long l10, int i10, i iVar) {
            this((i10 & 1) != 0 ? Boolean.FALSE : bool, (i10 & 2) != 0 ? Long.MAX_VALUE : l10);
        }

        public static /* synthetic */ AutoRedirect copy$default(AutoRedirect autoRedirect, Boolean bool, Long l10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                bool = autoRedirect.allowAutoRedirect;
            }
            if ((i10 & 2) != 0) {
                l10 = autoRedirect.afterClickDuration;
            }
            return autoRedirect.copy(bool, l10);
        }

        public static /* synthetic */ void getAfterClickDuration$annotations() {
        }

        public static /* synthetic */ void getAllowAutoRedirect$annotations() {
        }

        public static final void write$Self(@NotNull AutoRedirect autoRedirect, @NotNull d dVar, @NotNull SerialDescriptor serialDescriptor) {
            Long l10;
            p.k(autoRedirect, "self");
            p.k(dVar, "output");
            p.k(serialDescriptor, "serialDesc");
            if (dVar.r(serialDescriptor, 0) || !p.f(autoRedirect.allowAutoRedirect, Boolean.FALSE)) {
                dVar.f(serialDescriptor, 0, wo.i.f86540a, autoRedirect.allowAutoRedirect);
            }
            if (dVar.r(serialDescriptor, 1) || (l10 = autoRedirect.afterClickDuration) == null || l10.longValue() != Long.MAX_VALUE) {
                dVar.f(serialDescriptor, 1, g1.f86515a, autoRedirect.afterClickDuration);
            }
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Boolean getAllowAutoRedirect() {
            return this.allowAutoRedirect;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Long getAfterClickDuration() {
            return this.afterClickDuration;
        }

        @NotNull
        public final AutoRedirect copy(@Nullable Boolean allowAutoRedirect, @Nullable Long afterClickDuration) {
            return new AutoRedirect(allowAutoRedirect, afterClickDuration);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AutoRedirect)) {
                return false;
            }
            AutoRedirect autoRedirect = (AutoRedirect) other;
            return p.f(this.allowAutoRedirect, autoRedirect.allowAutoRedirect) && p.f(this.afterClickDuration, autoRedirect.afterClickDuration);
        }

        @Nullable
        public final Long getAfterClickDuration() {
            return this.afterClickDuration;
        }

        @Nullable
        public final Boolean getAllowAutoRedirect() {
            return this.allowAutoRedirect;
        }

        public int hashCode() {
            Boolean bool = this.allowAutoRedirect;
            int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            Long l10 = this.afterClickDuration;
            return iHashCode + (l10 != null ? l10.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "AutoRedirect(allowAutoRedirect=" + this.allowAutoRedirect + ", afterClickDuration=" + this.afterClickDuration + ')';
        }
    }

    /* JADX INFO: compiled from: ConfigPayload.kt */
    @Metadata(bv = {}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002-,B+\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b&\u0010'B?\b\u0017\u0012\u0006\u0010(\u001a\u00020\u000f\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010*\u001a\u0004\u0018\u00010)¢\u0006\u0004\b&\u0010+J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u0012\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J4\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0018\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0019\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u001b\u001a\u00020\t2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0012\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u001c\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001d\u0010\u000bR\"\u0010\u0013\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010 \u0012\u0004\b\"\u0010\u001f\u001a\u0004\b!\u0010\u000eR\"\u0010\u0014\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010#\u0012\u0004\b%\u0010\u001f\u001a\u0004\b$\u0010\u0011¨\u0006."}, d2 = {"Lcom/vungle/ads/internal/model/ConfigPayload$CleverCache;", "", "self", "Lvo/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lbn/r;", "write$Self", "", "component1", "()Ljava/lang/Boolean;", "", "component2", "()Ljava/lang/Long;", "", "component3", "()Ljava/lang/Integer;", "enabled", "diskSize", "diskPercentage", "copy", "(Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Integer;)Lcom/vungle/ads/internal/model/ConfigPayload$CleverCache;", "", "toString", "hashCode", "other", "equals", "Ljava/lang/Boolean;", "getEnabled", "getEnabled$annotations", "()V", "Ljava/lang/Long;", "getDiskSize", "getDiskSize$annotations", "Ljava/lang/Integer;", "getDiskPercentage", "getDiskPercentage$annotations", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Integer;)V", "seen1", "Lwo/r2;", "serializationConstructorMarker", "(ILjava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Integer;Lwo/r2;)V", VastTagName.COMPANION, "$serializer", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
    @k
    public static final /* data */ class CleverCache {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @Nullable
        private final Integer diskPercentage;

        @Nullable
        private final Long diskSize;

        @Nullable
        private final Boolean enabled;

        /* JADX INFO: compiled from: ConfigPayload.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/internal/model/ConfigPayload$CleverCache$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/vungle/ads/internal/model/ConfigPayload$CleverCache;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(i iVar) {
                this();
            }

            @NotNull
            public final KSerializer<CleverCache> serializer() {
                return ConfigPayload$CleverCache$$serializer.INSTANCE;
            }
        }

        public CleverCache() {
            this((Boolean) null, (Long) null, (Integer) null, 7, (i) null);
        }

        public /* synthetic */ CleverCache(int i10, Boolean bool, Long l10, Integer num, r2 r2Var) {
            if ((i10 & 0) != 0) {
                c2.a(i10, 0, ConfigPayload$CleverCache$$serializer.INSTANCE.getDescriptor());
            }
            this.enabled = (i10 & 1) == 0 ? Boolean.FALSE : bool;
            if ((i10 & 2) == 0) {
                this.diskSize = 1000L;
            } else {
                this.diskSize = l10;
            }
            if ((i10 & 4) == 0) {
                this.diskPercentage = 3;
            } else {
                this.diskPercentage = num;
            }
        }

        public CleverCache(@Nullable Boolean bool, @Nullable Long l10, @Nullable Integer num) {
            this.enabled = bool;
            this.diskSize = l10;
            this.diskPercentage = num;
        }

        public /* synthetic */ CleverCache(Boolean bool, Long l10, Integer num, int i10, i iVar) {
            this((i10 & 1) != 0 ? Boolean.FALSE : bool, (i10 & 2) != 0 ? 1000L : l10, (i10 & 4) != 0 ? 3 : num);
        }

        public static /* synthetic */ CleverCache copy$default(CleverCache cleverCache, Boolean bool, Long l10, Integer num, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                bool = cleverCache.enabled;
            }
            if ((i10 & 2) != 0) {
                l10 = cleverCache.diskSize;
            }
            if ((i10 & 4) != 0) {
                num = cleverCache.diskPercentage;
            }
            return cleverCache.copy(bool, l10, num);
        }

        public static /* synthetic */ void getDiskPercentage$annotations() {
        }

        public static /* synthetic */ void getDiskSize$annotations() {
        }

        public static /* synthetic */ void getEnabled$annotations() {
        }

        public static final void write$Self(@NotNull CleverCache cleverCache, @NotNull d dVar, @NotNull SerialDescriptor serialDescriptor) {
            Long l10;
            Integer num;
            p.k(cleverCache, "self");
            p.k(dVar, "output");
            p.k(serialDescriptor, "serialDesc");
            if (dVar.r(serialDescriptor, 0) || !p.f(cleverCache.enabled, Boolean.FALSE)) {
                dVar.f(serialDescriptor, 0, wo.i.f86540a, cleverCache.enabled);
            }
            if (dVar.r(serialDescriptor, 1) || (l10 = cleverCache.diskSize) == null || l10.longValue() != 1000) {
                dVar.f(serialDescriptor, 1, g1.f86515a, cleverCache.diskSize);
            }
            if (dVar.r(serialDescriptor, 2) || (num = cleverCache.diskPercentage) == null || num.intValue() != 3) {
                dVar.f(serialDescriptor, 2, v0.f86626a, cleverCache.diskPercentage);
            }
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Boolean getEnabled() {
            return this.enabled;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Long getDiskSize() {
            return this.diskSize;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Integer getDiskPercentage() {
            return this.diskPercentage;
        }

        @NotNull
        public final CleverCache copy(@Nullable Boolean enabled, @Nullable Long diskSize, @Nullable Integer diskPercentage) {
            return new CleverCache(enabled, diskSize, diskPercentage);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CleverCache)) {
                return false;
            }
            CleverCache cleverCache = (CleverCache) other;
            return p.f(this.enabled, cleverCache.enabled) && p.f(this.diskSize, cleverCache.diskSize) && p.f(this.diskPercentage, cleverCache.diskPercentage);
        }

        @Nullable
        public final Integer getDiskPercentage() {
            return this.diskPercentage;
        }

        @Nullable
        public final Long getDiskSize() {
            return this.diskSize;
        }

        @Nullable
        public final Boolean getEnabled() {
            return this.enabled;
        }

        public int hashCode() {
            Boolean bool = this.enabled;
            int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            Long l10 = this.diskSize;
            int iHashCode2 = (iHashCode + (l10 == null ? 0 : l10.hashCode())) * 31;
            Integer num = this.diskPercentage;
            return iHashCode2 + (num != null ? num.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "CleverCache(enabled=" + this.enabled + ", diskSize=" + this.diskSize + ", diskPercentage=" + this.diskPercentage + ')';
        }
    }

    /* JADX INFO: compiled from: ConfigPayload.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/internal/model/ConfigPayload$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/vungle/ads/internal/model/ConfigPayload;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        @NotNull
        public final KSerializer<ConfigPayload> serializer() {
            return ConfigPayload$$serializer.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: ConfigPayload.kt */
    @Metadata(bv = {}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000  2\u00020\u0001:\u0002! B\u0013\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u001a\u0010\u001bB'\b\u0017\u0012\u0006\u0010\u001c\u001a\u00020\u0011\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001a\u0010\u001fJ!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u0012\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0011HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\f\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010\u0016\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0017\u0010\u000b¨\u0006\""}, d2 = {"Lcom/vungle/ads/internal/model/ConfigPayload$ConfigSettings;", "", "self", "Lvo/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lbn/r;", "write$Self", "", "component1", "()Ljava/lang/Long;", "refreshTime", "copy", "(Ljava/lang/Long;)Lcom/vungle/ads/internal/model/ConfigPayload$ConfigSettings;", "", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/Long;", "getRefreshTime", "getRefreshTime$annotations", "()V", "<init>", "(Ljava/lang/Long;)V", "seen1", "Lwo/r2;", "serializationConstructorMarker", "(ILjava/lang/Long;Lwo/r2;)V", VastTagName.COMPANION, "$serializer", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
    @k
    public static final /* data */ class ConfigSettings {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @Nullable
        private final Long refreshTime;

        /* JADX INFO: compiled from: ConfigPayload.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/internal/model/ConfigPayload$ConfigSettings$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/vungle/ads/internal/model/ConfigPayload$ConfigSettings;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(i iVar) {
                this();
            }

            @NotNull
            public final KSerializer<ConfigSettings> serializer() {
                return ConfigPayload$ConfigSettings$$serializer.INSTANCE;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ConfigSettings() {
            this((Long) null, 1, (i) (0 == true ? 1 : 0));
        }

        public /* synthetic */ ConfigSettings(int i10, Long l10, r2 r2Var) {
            if ((i10 & 0) != 0) {
                c2.a(i10, 0, ConfigPayload$ConfigSettings$$serializer.INSTANCE.getDescriptor());
            }
            if ((i10 & 1) == 0) {
                this.refreshTime = null;
            } else {
                this.refreshTime = l10;
            }
        }

        public ConfigSettings(@Nullable Long l10) {
            this.refreshTime = l10;
        }

        public /* synthetic */ ConfigSettings(Long l10, int i10, i iVar) {
            this((i10 & 1) != 0 ? null : l10);
        }

        public static /* synthetic */ ConfigSettings copy$default(ConfigSettings configSettings, Long l10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                l10 = configSettings.refreshTime;
            }
            return configSettings.copy(l10);
        }

        public static /* synthetic */ void getRefreshTime$annotations() {
        }

        public static final void write$Self(@NotNull ConfigSettings configSettings, @NotNull d dVar, @NotNull SerialDescriptor serialDescriptor) {
            p.k(configSettings, "self");
            p.k(dVar, "output");
            p.k(serialDescriptor, "serialDesc");
            boolean z10 = true;
            if (!dVar.r(serialDescriptor, 0) && configSettings.refreshTime == null) {
                z10 = false;
            }
            if (z10) {
                dVar.f(serialDescriptor, 0, g1.f86515a, configSettings.refreshTime);
            }
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Long getRefreshTime() {
            return this.refreshTime;
        }

        @NotNull
        public final ConfigSettings copy(@Nullable Long refreshTime) {
            return new ConfigSettings(refreshTime);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ConfigSettings) && p.f(this.refreshTime, ((ConfigSettings) other).refreshTime);
        }

        @Nullable
        public final Long getRefreshTime() {
            return this.refreshTime;
        }

        public int hashCode() {
            Long l10 = this.refreshTime;
            if (l10 == null) {
                return 0;
            }
            return l10.hashCode();
        }

        @NotNull
        public String toString() {
            return "ConfigSettings(refreshTime=" + this.refreshTime + ')';
        }
    }

    /* JADX INFO: compiled from: ConfigPayload.kt */
    @Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+*B7\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b$\u0010%BK\b\u0017\u0012\u0006\u0010&\u001a\u00020\u0014\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\t\u0012\b\u0010(\u001a\u0004\u0018\u00010'¢\u0006\u0004\b$\u0010)J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u000b\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\tHÆ\u0003J9\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\tHÆ\u0001J\t\u0010\u0013\u001a\u00020\tHÖ\u0001J\t\u0010\u0015\u001a\u00020\u0014HÖ\u0001J\u0013\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010\u0019\u0012\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001bR\"\u0010\u000f\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010\u0019\u0012\u0004\b\u001f\u0010\u001d\u001a\u0004\b\u001e\u0010\u001bR\"\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010\u0019\u0012\u0004\b!\u0010\u001d\u001a\u0004\b \u0010\u001bR\"\u0010\u0011\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\u0019\u0012\u0004\b#\u0010\u001d\u001a\u0004\b\"\u0010\u001b¨\u0006,"}, d2 = {"Lcom/vungle/ads/internal/model/ConfigPayload$Endpoints;", "", "self", "Lvo/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lbn/r;", "write$Self", "", "component1", "component2", "component3", "component4", "adsEndpoint", "riEndpoint", "errorLogsEndpoint", "metricsEndpoint", "copy", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getAdsEndpoint", "()Ljava/lang/String;", "getAdsEndpoint$annotations", "()V", "getRiEndpoint", "getRiEndpoint$annotations", "getErrorLogsEndpoint", "getErrorLogsEndpoint$annotations", "getMetricsEndpoint", "getMetricsEndpoint$annotations", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen1", "Lwo/r2;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lwo/r2;)V", VastTagName.COMPANION, "$serializer", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
    @k
    public static final /* data */ class Endpoints {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @Nullable
        private final String adsEndpoint;

        @Nullable
        private final String errorLogsEndpoint;

        @Nullable
        private final String metricsEndpoint;

        @Nullable
        private final String riEndpoint;

        /* JADX INFO: compiled from: ConfigPayload.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/internal/model/ConfigPayload$Endpoints$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/vungle/ads/internal/model/ConfigPayload$Endpoints;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(i iVar) {
                this();
            }

            @NotNull
            public final KSerializer<Endpoints> serializer() {
                return ConfigPayload$Endpoints$$serializer.INSTANCE;
            }
        }

        public Endpoints() {
            this((String) null, (String) null, (String) null, (String) null, 15, (i) null);
        }

        public /* synthetic */ Endpoints(int i10, String str, String str2, String str3, String str4, r2 r2Var) {
            if ((i10 & 0) != 0) {
                c2.a(i10, 0, ConfigPayload$Endpoints$$serializer.INSTANCE.getDescriptor());
            }
            if ((i10 & 1) == 0) {
                this.adsEndpoint = null;
            } else {
                this.adsEndpoint = str;
            }
            if ((i10 & 2) == 0) {
                this.riEndpoint = null;
            } else {
                this.riEndpoint = str2;
            }
            if ((i10 & 4) == 0) {
                this.errorLogsEndpoint = null;
            } else {
                this.errorLogsEndpoint = str3;
            }
            if ((i10 & 8) == 0) {
                this.metricsEndpoint = null;
            } else {
                this.metricsEndpoint = str4;
            }
        }

        public Endpoints(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
            this.adsEndpoint = str;
            this.riEndpoint = str2;
            this.errorLogsEndpoint = str3;
            this.metricsEndpoint = str4;
        }

        public /* synthetic */ Endpoints(String str, String str2, String str3, String str4, int i10, i iVar) {
            this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4);
        }

        public static /* synthetic */ Endpoints copy$default(Endpoints endpoints, String str, String str2, String str3, String str4, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = endpoints.adsEndpoint;
            }
            if ((i10 & 2) != 0) {
                str2 = endpoints.riEndpoint;
            }
            if ((i10 & 4) != 0) {
                str3 = endpoints.errorLogsEndpoint;
            }
            if ((i10 & 8) != 0) {
                str4 = endpoints.metricsEndpoint;
            }
            return endpoints.copy(str, str2, str3, str4);
        }

        public static /* synthetic */ void getAdsEndpoint$annotations() {
        }

        public static /* synthetic */ void getErrorLogsEndpoint$annotations() {
        }

        public static /* synthetic */ void getMetricsEndpoint$annotations() {
        }

        public static /* synthetic */ void getRiEndpoint$annotations() {
        }

        public static final void write$Self(@NotNull Endpoints endpoints, @NotNull d dVar, @NotNull SerialDescriptor serialDescriptor) {
            p.k(endpoints, "self");
            p.k(dVar, "output");
            p.k(serialDescriptor, "serialDesc");
            if (dVar.r(serialDescriptor, 0) || endpoints.adsEndpoint != null) {
                dVar.f(serialDescriptor, 0, w2.f86635a, endpoints.adsEndpoint);
            }
            if (dVar.r(serialDescriptor, 1) || endpoints.riEndpoint != null) {
                dVar.f(serialDescriptor, 1, w2.f86635a, endpoints.riEndpoint);
            }
            if (dVar.r(serialDescriptor, 2) || endpoints.errorLogsEndpoint != null) {
                dVar.f(serialDescriptor, 2, w2.f86635a, endpoints.errorLogsEndpoint);
            }
            if (dVar.r(serialDescriptor, 3) || endpoints.metricsEndpoint != null) {
                dVar.f(serialDescriptor, 3, w2.f86635a, endpoints.metricsEndpoint);
            }
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getAdsEndpoint() {
            return this.adsEndpoint;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getRiEndpoint() {
            return this.riEndpoint;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getErrorLogsEndpoint() {
            return this.errorLogsEndpoint;
        }

        @Nullable
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getMetricsEndpoint() {
            return this.metricsEndpoint;
        }

        @NotNull
        public final Endpoints copy(@Nullable String adsEndpoint, @Nullable String riEndpoint, @Nullable String errorLogsEndpoint, @Nullable String metricsEndpoint) {
            return new Endpoints(adsEndpoint, riEndpoint, errorLogsEndpoint, metricsEndpoint);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Endpoints)) {
                return false;
            }
            Endpoints endpoints = (Endpoints) other;
            return p.f(this.adsEndpoint, endpoints.adsEndpoint) && p.f(this.riEndpoint, endpoints.riEndpoint) && p.f(this.errorLogsEndpoint, endpoints.errorLogsEndpoint) && p.f(this.metricsEndpoint, endpoints.metricsEndpoint);
        }

        @Nullable
        public final String getAdsEndpoint() {
            return this.adsEndpoint;
        }

        @Nullable
        public final String getErrorLogsEndpoint() {
            return this.errorLogsEndpoint;
        }

        @Nullable
        public final String getMetricsEndpoint() {
            return this.metricsEndpoint;
        }

        @Nullable
        public final String getRiEndpoint() {
            return this.riEndpoint;
        }

        public int hashCode() {
            String str = this.adsEndpoint;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.riEndpoint;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.errorLogsEndpoint;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.metricsEndpoint;
            return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Endpoints(adsEndpoint=" + this.adsEndpoint + ", riEndpoint=" + this.riEndpoint + ", errorLogsEndpoint=" + this.errorLogsEndpoint + ", metricsEndpoint=" + this.metricsEndpoint + ')';
        }
    }

    /* JADX INFO: compiled from: ConfigPayload.kt */
    @Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 42\u00020\u0001:\u000254BO\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b.\u0010/Bc\b\u0017\u0012\u0006\u00100\u001a\u00020\u001b\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\f\u0012\b\u00102\u001a\u0004\u0018\u000101¢\u0006\u0004\b.\u00103J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u0012\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\fHÆ\u0003JX\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u001a\u001a\u00020\fHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001bHÖ\u0001J\u0013\u0010\u001e\u001a\u00020\t2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0012\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u001f\u0012\u0004\b \u0010!\u001a\u0004\b\u0012\u0010\u000bR\"\u0010\u0013\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\"\u0012\u0004\b%\u0010!\u001a\u0004\b#\u0010$R\"\u0010\u0014\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010\"\u0012\u0004\b'\u0010!\u001a\u0004\b&\u0010$R\"\u0010\u0015\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010\"\u0012\u0004\b)\u0010!\u001a\u0004\b(\u0010$R\"\u0010\u0016\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\"\u0012\u0004\b+\u0010!\u001a\u0004\b*\u0010$R\"\u0010\u0017\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010\"\u0012\u0004\b-\u0010!\u001a\u0004\b,\u0010$¨\u00066"}, d2 = {"Lcom/vungle/ads/internal/model/ConfigPayload$GDPRSettings;", "", "self", "Lvo/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lbn/r;", "write$Self", "", "component1", "()Ljava/lang/Boolean;", "", "component2", "component3", "component4", "component5", "component6", "isCountryDataProtected", "consentTitle", "consentMessage", "consentMessageVersion", "buttonAccept", "buttonDeny", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/vungle/ads/internal/model/ConfigPayload$GDPRSettings;", "toString", "", "hashCode", "other", "equals", "Ljava/lang/Boolean;", "isCountryDataProtected$annotations", "()V", "Ljava/lang/String;", "getConsentTitle", "()Ljava/lang/String;", "getConsentTitle$annotations", "getConsentMessage", "getConsentMessage$annotations", "getConsentMessageVersion", "getConsentMessageVersion$annotations", "getButtonAccept", "getButtonAccept$annotations", "getButtonDeny", "getButtonDeny$annotations", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen1", "Lwo/r2;", "serializationConstructorMarker", "(ILjava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lwo/r2;)V", VastTagName.COMPANION, "$serializer", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
    @k
    public static final /* data */ class GDPRSettings {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @Nullable
        private final String buttonAccept;

        @Nullable
        private final String buttonDeny;

        @Nullable
        private final String consentMessage;

        @Nullable
        private final String consentMessageVersion;

        @Nullable
        private final String consentTitle;

        @Nullable
        private final Boolean isCountryDataProtected;

        /* JADX INFO: compiled from: ConfigPayload.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/internal/model/ConfigPayload$GDPRSettings$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/vungle/ads/internal/model/ConfigPayload$GDPRSettings;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(i iVar) {
                this();
            }

            @NotNull
            public final KSerializer<GDPRSettings> serializer() {
                return ConfigPayload$GDPRSettings$$serializer.INSTANCE;
            }
        }

        public GDPRSettings() {
            this((Boolean) null, (String) null, (String) null, (String) null, (String) null, (String) null, 63, (i) null);
        }

        public /* synthetic */ GDPRSettings(int i10, Boolean bool, String str, String str2, String str3, String str4, String str5, r2 r2Var) {
            if ((i10 & 0) != 0) {
                c2.a(i10, 0, ConfigPayload$GDPRSettings$$serializer.INSTANCE.getDescriptor());
            }
            if ((i10 & 1) == 0) {
                this.isCountryDataProtected = null;
            } else {
                this.isCountryDataProtected = bool;
            }
            if ((i10 & 2) == 0) {
                this.consentTitle = null;
            } else {
                this.consentTitle = str;
            }
            if ((i10 & 4) == 0) {
                this.consentMessage = null;
            } else {
                this.consentMessage = str2;
            }
            if ((i10 & 8) == 0) {
                this.consentMessageVersion = null;
            } else {
                this.consentMessageVersion = str3;
            }
            if ((i10 & 16) == 0) {
                this.buttonAccept = null;
            } else {
                this.buttonAccept = str4;
            }
            if ((i10 & 32) == 0) {
                this.buttonDeny = null;
            } else {
                this.buttonDeny = str5;
            }
        }

        public GDPRSettings(@Nullable Boolean bool, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
            this.isCountryDataProtected = bool;
            this.consentTitle = str;
            this.consentMessage = str2;
            this.consentMessageVersion = str3;
            this.buttonAccept = str4;
            this.buttonDeny = str5;
        }

        public /* synthetic */ GDPRSettings(Boolean bool, String str, String str2, String str3, String str4, String str5, int i10, i iVar) {
            this((i10 & 1) != 0 ? null : bool, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : str2, (i10 & 8) != 0 ? null : str3, (i10 & 16) != 0 ? null : str4, (i10 & 32) != 0 ? null : str5);
        }

        public static /* synthetic */ GDPRSettings copy$default(GDPRSettings gDPRSettings, Boolean bool, String str, String str2, String str3, String str4, String str5, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                bool = gDPRSettings.isCountryDataProtected;
            }
            if ((i10 & 2) != 0) {
                str = gDPRSettings.consentTitle;
            }
            String str6 = str;
            if ((i10 & 4) != 0) {
                str2 = gDPRSettings.consentMessage;
            }
            String str7 = str2;
            if ((i10 & 8) != 0) {
                str3 = gDPRSettings.consentMessageVersion;
            }
            String str8 = str3;
            if ((i10 & 16) != 0) {
                str4 = gDPRSettings.buttonAccept;
            }
            String str9 = str4;
            if ((i10 & 32) != 0) {
                str5 = gDPRSettings.buttonDeny;
            }
            return gDPRSettings.copy(bool, str6, str7, str8, str9, str5);
        }

        public static /* synthetic */ void getButtonAccept$annotations() {
        }

        public static /* synthetic */ void getButtonDeny$annotations() {
        }

        public static /* synthetic */ void getConsentMessage$annotations() {
        }

        public static /* synthetic */ void getConsentMessageVersion$annotations() {
        }

        public static /* synthetic */ void getConsentTitle$annotations() {
        }

        public static /* synthetic */ void isCountryDataProtected$annotations() {
        }

        public static final void write$Self(@NotNull GDPRSettings gDPRSettings, @NotNull d dVar, @NotNull SerialDescriptor serialDescriptor) {
            p.k(gDPRSettings, "self");
            p.k(dVar, "output");
            p.k(serialDescriptor, "serialDesc");
            if (dVar.r(serialDescriptor, 0) || gDPRSettings.isCountryDataProtected != null) {
                dVar.f(serialDescriptor, 0, wo.i.f86540a, gDPRSettings.isCountryDataProtected);
            }
            if (dVar.r(serialDescriptor, 1) || gDPRSettings.consentTitle != null) {
                dVar.f(serialDescriptor, 1, w2.f86635a, gDPRSettings.consentTitle);
            }
            if (dVar.r(serialDescriptor, 2) || gDPRSettings.consentMessage != null) {
                dVar.f(serialDescriptor, 2, w2.f86635a, gDPRSettings.consentMessage);
            }
            if (dVar.r(serialDescriptor, 3) || gDPRSettings.consentMessageVersion != null) {
                dVar.f(serialDescriptor, 3, w2.f86635a, gDPRSettings.consentMessageVersion);
            }
            if (dVar.r(serialDescriptor, 4) || gDPRSettings.buttonAccept != null) {
                dVar.f(serialDescriptor, 4, w2.f86635a, gDPRSettings.buttonAccept);
            }
            if (dVar.r(serialDescriptor, 5) || gDPRSettings.buttonDeny != null) {
                dVar.f(serialDescriptor, 5, w2.f86635a, gDPRSettings.buttonDeny);
            }
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Boolean getIsCountryDataProtected() {
            return this.isCountryDataProtected;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getConsentTitle() {
            return this.consentTitle;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getConsentMessage() {
            return this.consentMessage;
        }

        @Nullable
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getConsentMessageVersion() {
            return this.consentMessageVersion;
        }

        @Nullable
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getButtonAccept() {
            return this.buttonAccept;
        }

        @Nullable
        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getButtonDeny() {
            return this.buttonDeny;
        }

        @NotNull
        public final GDPRSettings copy(@Nullable Boolean isCountryDataProtected, @Nullable String consentTitle, @Nullable String consentMessage, @Nullable String consentMessageVersion, @Nullable String buttonAccept, @Nullable String buttonDeny) {
            return new GDPRSettings(isCountryDataProtected, consentTitle, consentMessage, consentMessageVersion, buttonAccept, buttonDeny);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GDPRSettings)) {
                return false;
            }
            GDPRSettings gDPRSettings = (GDPRSettings) other;
            return p.f(this.isCountryDataProtected, gDPRSettings.isCountryDataProtected) && p.f(this.consentTitle, gDPRSettings.consentTitle) && p.f(this.consentMessage, gDPRSettings.consentMessage) && p.f(this.consentMessageVersion, gDPRSettings.consentMessageVersion) && p.f(this.buttonAccept, gDPRSettings.buttonAccept) && p.f(this.buttonDeny, gDPRSettings.buttonDeny);
        }

        @Nullable
        public final String getButtonAccept() {
            return this.buttonAccept;
        }

        @Nullable
        public final String getButtonDeny() {
            return this.buttonDeny;
        }

        @Nullable
        public final String getConsentMessage() {
            return this.consentMessage;
        }

        @Nullable
        public final String getConsentMessageVersion() {
            return this.consentMessageVersion;
        }

        @Nullable
        public final String getConsentTitle() {
            return this.consentTitle;
        }

        public int hashCode() {
            Boolean bool = this.isCountryDataProtected;
            int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            String str = this.consentTitle;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.consentMessage;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.consentMessageVersion;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.buttonAccept;
            int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.buttonDeny;
            return iHashCode5 + (str5 != null ? str5.hashCode() : 0);
        }

        @Nullable
        public final Boolean isCountryDataProtected() {
            return this.isCountryDataProtected;
        }

        @NotNull
        public String toString() {
            return "GDPRSettings(isCountryDataProtected=" + this.isCountryDataProtected + ", consentTitle=" + this.consentTitle + ", consentMessage=" + this.consentMessage + ", consentMessageVersion=" + this.consentMessageVersion + ", buttonAccept=" + this.buttonAccept + ", buttonDeny=" + this.buttonDeny + ')';
        }
    }

    /* JADX INFO: compiled from: ConfigPayload.kt */
    @Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0003 \u001f!B\u0013\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0019\u0010\u001aB'\b\u0017\u0012\u0006\u0010\u001b\u001a\u00020\t\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u0019\u0010\u001eJ!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u0012\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0011\u001a\u00020\tHÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\f\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010\u0015\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0016\u0010\u000b¨\u0006\""}, d2 = {"Lcom/vungle/ads/internal/model/ConfigPayload$IABSettings;", "", "self", "Lvo/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lbn/r;", "write$Self", "", "component1", "()Ljava/lang/Integer;", "tcfStatus", "copy", "(Ljava/lang/Integer;)Lcom/vungle/ads/internal/model/ConfigPayload$IABSettings;", "", "toString", "hashCode", "other", "", "equals", "Ljava/lang/Integer;", "getTcfStatus", "getTcfStatus$annotations", "()V", "<init>", "(Ljava/lang/Integer;)V", "seen1", "Lwo/r2;", "serializationConstructorMarker", "(ILjava/lang/Integer;Lwo/r2;)V", VastTagName.COMPANION, "$serializer", "TcfStatus", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
    @k
    public static final /* data */ class IABSettings {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @Nullable
        private final Integer tcfStatus;

        /* JADX INFO: compiled from: ConfigPayload.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/internal/model/ConfigPayload$IABSettings$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/vungle/ads/internal/model/ConfigPayload$IABSettings;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(i iVar) {
                this();
            }

            @NotNull
            public final KSerializer<IABSettings> serializer() {
                return ConfigPayload$IABSettings$$serializer.INSTANCE;
            }
        }

        /* JADX INFO: compiled from: ConfigPayload.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, d2 = {"Lcom/vungle/ads/internal/model/ConfigPayload$IABSettings$TcfStatus;", "", "rawValue", "", "(Ljava/lang/String;II)V", "getRawValue", "()I", "ALLOW_ID", "DISABLE_ID", "LEGACY", VastTagName.COMPANION, "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public enum TcfStatus {
            ALLOW_ID(0),
            DISABLE_ID(1),
            LEGACY(2);


            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            @NotNull
            public static final Companion INSTANCE = new Companion(null);

            @NotNull
            private static final Map<Integer, TcfStatus> rawValueMap;
            private final int rawValue;

            /* JADX INFO: compiled from: ConfigPayload.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\tR\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/vungle/ads/internal/model/ConfigPayload$IABSettings$TcfStatus$Companion;", "", "()V", "rawValueMap", "", "", "Lcom/vungle/ads/internal/model/ConfigPayload$IABSettings$TcfStatus;", "fromRawValue", "rawValue", "(Ljava/lang/Integer;)Lcom/vungle/ads/internal/model/ConfigPayload$IABSettings$TcfStatus;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(i iVar) {
                    this();
                }

                @Nullable
                public final TcfStatus fromRawValue(@Nullable Integer rawValue) {
                    return (TcfStatus) TcfStatus.rawValueMap.get(rawValue);
                }
            }

            static {
                TcfStatus[] tcfStatusArrValues = values();
                LinkedHashMap linkedHashMap = new LinkedHashMap(n.e(p0.f(tcfStatusArrValues.length), 16));
                for (TcfStatus tcfStatus : tcfStatusArrValues) {
                    linkedHashMap.put(Integer.valueOf(tcfStatus.rawValue), tcfStatus);
                }
                rawValueMap = linkedHashMap;
            }

            TcfStatus(int i10) {
                this.rawValue = i10;
            }

            public final int getRawValue() {
                return this.rawValue;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public IABSettings() {
            this((Integer) null, 1, (i) (0 == true ? 1 : 0));
        }

        public /* synthetic */ IABSettings(int i10, Integer num, r2 r2Var) {
            if ((i10 & 0) != 0) {
                c2.a(i10, 0, ConfigPayload$IABSettings$$serializer.INSTANCE.getDescriptor());
            }
            if ((i10 & 1) == 0) {
                this.tcfStatus = null;
            } else {
                this.tcfStatus = num;
            }
        }

        public IABSettings(@Nullable Integer num) {
            this.tcfStatus = num;
        }

        public /* synthetic */ IABSettings(Integer num, int i10, i iVar) {
            this((i10 & 1) != 0 ? null : num);
        }

        public static /* synthetic */ IABSettings copy$default(IABSettings iABSettings, Integer num, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                num = iABSettings.tcfStatus;
            }
            return iABSettings.copy(num);
        }

        public static /* synthetic */ void getTcfStatus$annotations() {
        }

        public static final void write$Self(@NotNull IABSettings iABSettings, @NotNull d dVar, @NotNull SerialDescriptor serialDescriptor) {
            p.k(iABSettings, "self");
            p.k(dVar, "output");
            p.k(serialDescriptor, "serialDesc");
            boolean z10 = true;
            if (!dVar.r(serialDescriptor, 0) && iABSettings.tcfStatus == null) {
                z10 = false;
            }
            if (z10) {
                dVar.f(serialDescriptor, 0, v0.f86626a, iABSettings.tcfStatus);
            }
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Integer getTcfStatus() {
            return this.tcfStatus;
        }

        @NotNull
        public final IABSettings copy(@Nullable Integer tcfStatus) {
            return new IABSettings(tcfStatus);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof IABSettings) && p.f(this.tcfStatus, ((IABSettings) other).tcfStatus);
        }

        @Nullable
        public final Integer getTcfStatus() {
            return this.tcfStatus;
        }

        public int hashCode() {
            Integer num = this.tcfStatus;
            if (num == null) {
                return 0;
            }
            return num.hashCode();
        }

        @NotNull
        public String toString() {
            return "IABSettings(tcfStatus=" + this.tcfStatus + ')';
        }
    }

    /* JADX INFO: compiled from: ConfigPayload.kt */
    @Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002&%B\u001f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u001f\u0010 B3\b\u0017\u0012\u0006\u0010!\u001a\u00020\t\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\f\u0012\b\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b\u001f\u0010$J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u0012\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ(\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0014\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0015\u001a\u00020\tHÖ\u0001J\u0013\u0010\u0017\u001a\u00020\f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u000f\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010\u0018\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0019\u0010\u000bR\"\u0010\u0010\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010\u001c\u0012\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001d\u0010\u000e¨\u0006'"}, d2 = {"Lcom/vungle/ads/internal/model/ConfigPayload$LogMetricsSettings;", "", "self", "Lvo/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lbn/r;", "write$Self", "", "component1", "()Ljava/lang/Integer;", "", "component2", "()Ljava/lang/Boolean;", "errorLogLevel", "metricsEnabled", "copy", "(Ljava/lang/Integer;Ljava/lang/Boolean;)Lcom/vungle/ads/internal/model/ConfigPayload$LogMetricsSettings;", "", "toString", "hashCode", "other", "equals", "Ljava/lang/Integer;", "getErrorLogLevel", "getErrorLogLevel$annotations", "()V", "Ljava/lang/Boolean;", "getMetricsEnabled", "getMetricsEnabled$annotations", "<init>", "(Ljava/lang/Integer;Ljava/lang/Boolean;)V", "seen1", "Lwo/r2;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/lang/Boolean;Lwo/r2;)V", VastTagName.COMPANION, "$serializer", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
    @k
    public static final /* data */ class LogMetricsSettings {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @Nullable
        private final Integer errorLogLevel;

        @Nullable
        private final Boolean metricsEnabled;

        /* JADX INFO: compiled from: ConfigPayload.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/internal/model/ConfigPayload$LogMetricsSettings$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/vungle/ads/internal/model/ConfigPayload$LogMetricsSettings;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(i iVar) {
                this();
            }

            @NotNull
            public final KSerializer<LogMetricsSettings> serializer() {
                return ConfigPayload$LogMetricsSettings$$serializer.INSTANCE;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public LogMetricsSettings() {
            this((Integer) null, (Boolean) (0 == true ? 1 : 0), 3, (i) (0 == true ? 1 : 0));
        }

        public /* synthetic */ LogMetricsSettings(int i10, Integer num, Boolean bool, r2 r2Var) {
            if ((i10 & 0) != 0) {
                c2.a(i10, 0, ConfigPayload$LogMetricsSettings$$serializer.INSTANCE.getDescriptor());
            }
            if ((i10 & 1) == 0) {
                this.errorLogLevel = null;
            } else {
                this.errorLogLevel = num;
            }
            if ((i10 & 2) == 0) {
                this.metricsEnabled = null;
            } else {
                this.metricsEnabled = bool;
            }
        }

        public LogMetricsSettings(@Nullable Integer num, @Nullable Boolean bool) {
            this.errorLogLevel = num;
            this.metricsEnabled = bool;
        }

        public /* synthetic */ LogMetricsSettings(Integer num, Boolean bool, int i10, i iVar) {
            this((i10 & 1) != 0 ? null : num, (i10 & 2) != 0 ? null : bool);
        }

        public static /* synthetic */ LogMetricsSettings copy$default(LogMetricsSettings logMetricsSettings, Integer num, Boolean bool, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                num = logMetricsSettings.errorLogLevel;
            }
            if ((i10 & 2) != 0) {
                bool = logMetricsSettings.metricsEnabled;
            }
            return logMetricsSettings.copy(num, bool);
        }

        public static /* synthetic */ void getErrorLogLevel$annotations() {
        }

        public static /* synthetic */ void getMetricsEnabled$annotations() {
        }

        public static final void write$Self(@NotNull LogMetricsSettings logMetricsSettings, @NotNull d dVar, @NotNull SerialDescriptor serialDescriptor) {
            p.k(logMetricsSettings, "self");
            p.k(dVar, "output");
            p.k(serialDescriptor, "serialDesc");
            if (dVar.r(serialDescriptor, 0) || logMetricsSettings.errorLogLevel != null) {
                dVar.f(serialDescriptor, 0, v0.f86626a, logMetricsSettings.errorLogLevel);
            }
            if (dVar.r(serialDescriptor, 1) || logMetricsSettings.metricsEnabled != null) {
                dVar.f(serialDescriptor, 1, wo.i.f86540a, logMetricsSettings.metricsEnabled);
            }
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Integer getErrorLogLevel() {
            return this.errorLogLevel;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Boolean getMetricsEnabled() {
            return this.metricsEnabled;
        }

        @NotNull
        public final LogMetricsSettings copy(@Nullable Integer errorLogLevel, @Nullable Boolean metricsEnabled) {
            return new LogMetricsSettings(errorLogLevel, metricsEnabled);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LogMetricsSettings)) {
                return false;
            }
            LogMetricsSettings logMetricsSettings = (LogMetricsSettings) other;
            return p.f(this.errorLogLevel, logMetricsSettings.errorLogLevel) && p.f(this.metricsEnabled, logMetricsSettings.metricsEnabled);
        }

        @Nullable
        public final Integer getErrorLogLevel() {
            return this.errorLogLevel;
        }

        @Nullable
        public final Boolean getMetricsEnabled() {
            return this.metricsEnabled;
        }

        public int hashCode() {
            Integer num = this.errorLogLevel;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            Boolean bool = this.metricsEnabled;
            return iHashCode + (bool != null ? bool.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "LogMetricsSettings(errorLogLevel=" + this.errorLogLevel + ", metricsEnabled=" + this.metricsEnabled + ')';
        }
    }

    /* JADX INFO: compiled from: ConfigPayload.kt */
    @Metadata(bv = {}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002'&B\u001f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b \u0010!B3\b\u0017\u0012\u0006\u0010\"\u001a\u00020\u0012\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b \u0010%J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u000b\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0003J!\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0012HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\r\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010\u0017\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019R\"\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010\u001c\u0012\u0004\b\u001f\u0010\u001b\u001a\u0004\b\u001d\u0010\u001e¨\u0006("}, d2 = {"Lcom/vungle/ads/internal/model/ConfigPayload$UserPrivacy;", "", "self", "Lvo/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lbn/r;", "write$Self", "Lcom/vungle/ads/internal/model/ConfigPayload$GDPRSettings;", "component1", "Lcom/vungle/ads/internal/model/ConfigPayload$IABSettings;", "component2", InMobiSdk.IM_GDPR_CONSENT_GDPR_APPLIES, "iab", "copy", "", "toString", "", "hashCode", "other", "", "equals", "Lcom/vungle/ads/internal/model/ConfigPayload$GDPRSettings;", "getGdpr", "()Lcom/vungle/ads/internal/model/ConfigPayload$GDPRSettings;", "getGdpr$annotations", "()V", "Lcom/vungle/ads/internal/model/ConfigPayload$IABSettings;", "getIab", "()Lcom/vungle/ads/internal/model/ConfigPayload$IABSettings;", "getIab$annotations", "<init>", "(Lcom/vungle/ads/internal/model/ConfigPayload$GDPRSettings;Lcom/vungle/ads/internal/model/ConfigPayload$IABSettings;)V", "seen1", "Lwo/r2;", "serializationConstructorMarker", "(ILcom/vungle/ads/internal/model/ConfigPayload$GDPRSettings;Lcom/vungle/ads/internal/model/ConfigPayload$IABSettings;Lwo/r2;)V", VastTagName.COMPANION, "$serializer", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
    @k
    public static final /* data */ class UserPrivacy {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @Nullable
        private final GDPRSettings gdpr;

        @Nullable
        private final IABSettings iab;

        /* JADX INFO: compiled from: ConfigPayload.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/internal/model/ConfigPayload$UserPrivacy$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/vungle/ads/internal/model/ConfigPayload$UserPrivacy;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(i iVar) {
                this();
            }

            @NotNull
            public final KSerializer<UserPrivacy> serializer() {
                return ConfigPayload$UserPrivacy$$serializer.INSTANCE;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public UserPrivacy() {
            this((GDPRSettings) null, (IABSettings) (0 == true ? 1 : 0), 3, (i) (0 == true ? 1 : 0));
        }

        public /* synthetic */ UserPrivacy(int i10, GDPRSettings gDPRSettings, IABSettings iABSettings, r2 r2Var) {
            if ((i10 & 0) != 0) {
                c2.a(i10, 0, ConfigPayload$UserPrivacy$$serializer.INSTANCE.getDescriptor());
            }
            if ((i10 & 1) == 0) {
                this.gdpr = null;
            } else {
                this.gdpr = gDPRSettings;
            }
            if ((i10 & 2) == 0) {
                this.iab = null;
            } else {
                this.iab = iABSettings;
            }
        }

        public UserPrivacy(@Nullable GDPRSettings gDPRSettings, @Nullable IABSettings iABSettings) {
            this.gdpr = gDPRSettings;
            this.iab = iABSettings;
        }

        public /* synthetic */ UserPrivacy(GDPRSettings gDPRSettings, IABSettings iABSettings, int i10, i iVar) {
            this((i10 & 1) != 0 ? null : gDPRSettings, (i10 & 2) != 0 ? null : iABSettings);
        }

        public static /* synthetic */ UserPrivacy copy$default(UserPrivacy userPrivacy, GDPRSettings gDPRSettings, IABSettings iABSettings, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                gDPRSettings = userPrivacy.gdpr;
            }
            if ((i10 & 2) != 0) {
                iABSettings = userPrivacy.iab;
            }
            return userPrivacy.copy(gDPRSettings, iABSettings);
        }

        public static /* synthetic */ void getGdpr$annotations() {
        }

        public static /* synthetic */ void getIab$annotations() {
        }

        public static final void write$Self(@NotNull UserPrivacy userPrivacy, @NotNull d dVar, @NotNull SerialDescriptor serialDescriptor) {
            p.k(userPrivacy, "self");
            p.k(dVar, "output");
            p.k(serialDescriptor, "serialDesc");
            if (dVar.r(serialDescriptor, 0) || userPrivacy.gdpr != null) {
                dVar.f(serialDescriptor, 0, ConfigPayload$GDPRSettings$$serializer.INSTANCE, userPrivacy.gdpr);
            }
            if (dVar.r(serialDescriptor, 1) || userPrivacy.iab != null) {
                dVar.f(serialDescriptor, 1, ConfigPayload$IABSettings$$serializer.INSTANCE, userPrivacy.iab);
            }
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final GDPRSettings getGdpr() {
            return this.gdpr;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final IABSettings getIab() {
            return this.iab;
        }

        @NotNull
        public final UserPrivacy copy(@Nullable GDPRSettings gdpr, @Nullable IABSettings iab) {
            return new UserPrivacy(gdpr, iab);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UserPrivacy)) {
                return false;
            }
            UserPrivacy userPrivacy = (UserPrivacy) other;
            return p.f(this.gdpr, userPrivacy.gdpr) && p.f(this.iab, userPrivacy.iab);
        }

        @Nullable
        public final GDPRSettings getGdpr() {
            return this.gdpr;
        }

        @Nullable
        public final IABSettings getIab() {
            return this.iab;
        }

        public int hashCode() {
            GDPRSettings gDPRSettings = this.gdpr;
            int iHashCode = (gDPRSettings == null ? 0 : gDPRSettings.hashCode()) * 31;
            IABSettings iABSettings = this.iab;
            return iHashCode + (iABSettings != null ? iABSettings.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "UserPrivacy(gdpr=" + this.gdpr + ", iab=" + this.iab + ')';
        }
    }

    public ConfigPayload() {
        this((CleverCache) null, (ConfigSettings) null, (Endpoints) null, (LogMetricsSettings) null, (List) null, (UserPrivacy) null, (String) null, (Boolean) null, (Boolean) null, (Integer) null, (Boolean) null, (Integer) null, (Boolean) null, (Boolean) null, (Boolean) null, (Long) null, (AutoRedirect) null, (Boolean) null, (Boolean) null, 524287, (i) null);
    }

    public /* synthetic */ ConfigPayload(int i10, CleverCache cleverCache, ConfigSettings configSettings, Endpoints endpoints, LogMetricsSettings logMetricsSettings, List list, UserPrivacy userPrivacy, String str, Boolean bool, Boolean bool2, Integer num, Boolean bool3, Integer num2, Boolean bool4, Boolean bool5, Boolean bool6, Long l10, AutoRedirect autoRedirect, Boolean bool7, Boolean bool8, r2 r2Var) {
        if ((i10 & 0) != 0) {
            c2.a(i10, 0, ConfigPayload$$serializer.INSTANCE.getDescriptor());
        }
        if ((i10 & 1) == 0) {
            this.cleverCache = null;
        } else {
            this.cleverCache = cleverCache;
        }
        if ((i10 & 2) == 0) {
            this.configSettings = null;
        } else {
            this.configSettings = configSettings;
        }
        if ((i10 & 4) == 0) {
            this.endpoints = null;
        } else {
            this.endpoints = endpoints;
        }
        if ((i10 & 8) == 0) {
            this.logMetricsSettings = null;
        } else {
            this.logMetricsSettings = logMetricsSettings;
        }
        if ((i10 & 16) == 0) {
            this.placements = null;
        } else {
            this.placements = list;
        }
        if ((i10 & 32) == 0) {
            this.userPrivacy = null;
        } else {
            this.userPrivacy = userPrivacy;
        }
        if ((i10 & 64) == 0) {
            this.configExtension = null;
        } else {
            this.configExtension = str;
        }
        this.disableAdId = (i10 & 128) == 0 ? Boolean.TRUE : bool;
        if ((i10 & 256) == 0) {
            this.isReportIncentivizedEnabled = null;
        } else {
            this.isReportIncentivizedEnabled = bool2;
        }
        if ((i10 & 512) == 0) {
            this.sessionTimeout = null;
        } else {
            this.sessionTimeout = num;
        }
        if ((i10 & 1024) == 0) {
            this.waitForConnectivityForTPAT = null;
        } else {
            this.waitForConnectivityForTPAT = bool3;
        }
        if ((i10 & 2048) == 0) {
            this.signalSessionTimeout = null;
        } else {
            this.signalSessionTimeout = num2;
        }
        if ((i10 & 4096) == 0) {
            this.signalsDisabled = null;
        } else {
            this.signalsDisabled = bool4;
        }
        if ((i10 & 8192) == 0) {
            this.fpdEnabled = null;
        } else {
            this.fpdEnabled = bool5;
        }
        if ((i10 & 16384) == 0) {
            this.rtaDebugging = null;
        } else {
            this.rtaDebugging = bool6;
        }
        if ((32768 & i10) == 0) {
            this.configLastValidatedTimestamp = null;
        } else {
            this.configLastValidatedTimestamp = l10;
        }
        if ((65536 & i10) == 0) {
            this.autoRedirect = null;
        } else {
            this.autoRedirect = autoRedirect;
        }
        if ((131072 & i10) == 0) {
            this.retryPriorityTPATs = null;
        } else {
            this.retryPriorityTPATs = bool7;
        }
        if ((i10 & 262144) == 0) {
            this.enableOT = null;
        } else {
            this.enableOT = bool8;
        }
    }

    public ConfigPayload(@Nullable CleverCache cleverCache, @Nullable ConfigSettings configSettings, @Nullable Endpoints endpoints, @Nullable LogMetricsSettings logMetricsSettings, @Nullable List<Placement> list, @Nullable UserPrivacy userPrivacy, @Nullable String str, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Integer num, @Nullable Boolean bool3, @Nullable Integer num2, @Nullable Boolean bool4, @Nullable Boolean bool5, @Nullable Boolean bool6, @Nullable Long l10, @Nullable AutoRedirect autoRedirect, @Nullable Boolean bool7, @Nullable Boolean bool8) {
        this.cleverCache = cleverCache;
        this.configSettings = configSettings;
        this.endpoints = endpoints;
        this.logMetricsSettings = logMetricsSettings;
        this.placements = list;
        this.userPrivacy = userPrivacy;
        this.configExtension = str;
        this.disableAdId = bool;
        this.isReportIncentivizedEnabled = bool2;
        this.sessionTimeout = num;
        this.waitForConnectivityForTPAT = bool3;
        this.signalSessionTimeout = num2;
        this.signalsDisabled = bool4;
        this.fpdEnabled = bool5;
        this.rtaDebugging = bool6;
        this.configLastValidatedTimestamp = l10;
        this.autoRedirect = autoRedirect;
        this.retryPriorityTPATs = bool7;
        this.enableOT = bool8;
    }

    public /* synthetic */ ConfigPayload(CleverCache cleverCache, ConfigSettings configSettings, Endpoints endpoints, LogMetricsSettings logMetricsSettings, List list, UserPrivacy userPrivacy, String str, Boolean bool, Boolean bool2, Integer num, Boolean bool3, Integer num2, Boolean bool4, Boolean bool5, Boolean bool6, Long l10, AutoRedirect autoRedirect, Boolean bool7, Boolean bool8, int i10, i iVar) {
        this((i10 & 1) != 0 ? null : cleverCache, (i10 & 2) != 0 ? null : configSettings, (i10 & 4) != 0 ? null : endpoints, (i10 & 8) != 0 ? null : logMetricsSettings, (i10 & 16) != 0 ? null : list, (i10 & 32) != 0 ? null : userPrivacy, (i10 & 64) != 0 ? null : str, (i10 & 128) != 0 ? Boolean.TRUE : bool, (i10 & 256) != 0 ? null : bool2, (i10 & 512) != 0 ? null : num, (i10 & 1024) != 0 ? null : bool3, (i10 & 2048) != 0 ? null : num2, (i10 & 4096) != 0 ? null : bool4, (i10 & 8192) != 0 ? null : bool5, (i10 & 16384) != 0 ? null : bool6, (i10 & 32768) != 0 ? null : l10, (i10 & 65536) != 0 ? null : autoRedirect, (i10 & 131072) != 0 ? null : bool7, (i10 & 262144) != 0 ? null : bool8);
    }

    public static /* synthetic */ void getAutoRedirect$annotations() {
    }

    public static /* synthetic */ void getCleverCache$annotations() {
    }

    public static /* synthetic */ void getConfigExtension$annotations() {
    }

    public static /* synthetic */ void getConfigLastValidatedTimestamp$annotations() {
    }

    public static /* synthetic */ void getConfigSettings$annotations() {
    }

    public static /* synthetic */ void getDisableAdId$annotations() {
    }

    public static /* synthetic */ void getEnableOT$annotations() {
    }

    public static /* synthetic */ void getEndpoints$annotations() {
    }

    public static /* synthetic */ void getFpdEnabled$annotations() {
    }

    public static /* synthetic */ void getLogMetricsSettings$annotations() {
    }

    public static /* synthetic */ void getPlacements$annotations() {
    }

    public static /* synthetic */ void getRetryPriorityTPATs$annotations() {
    }

    public static /* synthetic */ void getRtaDebugging$annotations() {
    }

    public static /* synthetic */ void getSessionTimeout$annotations() {
    }

    public static /* synthetic */ void getSignalSessionTimeout$annotations() {
    }

    public static /* synthetic */ void getSignalsDisabled$annotations() {
    }

    public static /* synthetic */ void getUserPrivacy$annotations() {
    }

    public static /* synthetic */ void getWaitForConnectivityForTPAT$annotations() {
    }

    public static /* synthetic */ void isReportIncentivizedEnabled$annotations() {
    }

    public static final void write$Self(@NotNull ConfigPayload configPayload, @NotNull d dVar, @NotNull SerialDescriptor serialDescriptor) {
        p.k(configPayload, "self");
        p.k(dVar, "output");
        p.k(serialDescriptor, "serialDesc");
        if (dVar.r(serialDescriptor, 0) || configPayload.cleverCache != null) {
            dVar.f(serialDescriptor, 0, ConfigPayload$CleverCache$$serializer.INSTANCE, configPayload.cleverCache);
        }
        if (dVar.r(serialDescriptor, 1) || configPayload.configSettings != null) {
            dVar.f(serialDescriptor, 1, ConfigPayload$ConfigSettings$$serializer.INSTANCE, configPayload.configSettings);
        }
        if (dVar.r(serialDescriptor, 2) || configPayload.endpoints != null) {
            dVar.f(serialDescriptor, 2, ConfigPayload$Endpoints$$serializer.INSTANCE, configPayload.endpoints);
        }
        if (dVar.r(serialDescriptor, 3) || configPayload.logMetricsSettings != null) {
            dVar.f(serialDescriptor, 3, ConfigPayload$LogMetricsSettings$$serializer.INSTANCE, configPayload.logMetricsSettings);
        }
        if (dVar.r(serialDescriptor, 4) || configPayload.placements != null) {
            dVar.f(serialDescriptor, 4, new f(Placement$$serializer.INSTANCE), configPayload.placements);
        }
        if (dVar.r(serialDescriptor, 5) || configPayload.userPrivacy != null) {
            dVar.f(serialDescriptor, 5, ConfigPayload$UserPrivacy$$serializer.INSTANCE, configPayload.userPrivacy);
        }
        if (dVar.r(serialDescriptor, 6) || configPayload.configExtension != null) {
            dVar.f(serialDescriptor, 6, w2.f86635a, configPayload.configExtension);
        }
        if (dVar.r(serialDescriptor, 7) || !p.f(configPayload.disableAdId, Boolean.TRUE)) {
            dVar.f(serialDescriptor, 7, wo.i.f86540a, configPayload.disableAdId);
        }
        if (dVar.r(serialDescriptor, 8) || configPayload.isReportIncentivizedEnabled != null) {
            dVar.f(serialDescriptor, 8, wo.i.f86540a, configPayload.isReportIncentivizedEnabled);
        }
        if (dVar.r(serialDescriptor, 9) || configPayload.sessionTimeout != null) {
            dVar.f(serialDescriptor, 9, v0.f86626a, configPayload.sessionTimeout);
        }
        if (dVar.r(serialDescriptor, 10) || configPayload.waitForConnectivityForTPAT != null) {
            dVar.f(serialDescriptor, 10, wo.i.f86540a, configPayload.waitForConnectivityForTPAT);
        }
        if (dVar.r(serialDescriptor, 11) || configPayload.signalSessionTimeout != null) {
            dVar.f(serialDescriptor, 11, v0.f86626a, configPayload.signalSessionTimeout);
        }
        if (dVar.r(serialDescriptor, 12) || configPayload.signalsDisabled != null) {
            dVar.f(serialDescriptor, 12, wo.i.f86540a, configPayload.signalsDisabled);
        }
        if (dVar.r(serialDescriptor, 13) || configPayload.fpdEnabled != null) {
            dVar.f(serialDescriptor, 13, wo.i.f86540a, configPayload.fpdEnabled);
        }
        if (dVar.r(serialDescriptor, 14) || configPayload.rtaDebugging != null) {
            dVar.f(serialDescriptor, 14, wo.i.f86540a, configPayload.rtaDebugging);
        }
        if (dVar.r(serialDescriptor, 15) || configPayload.configLastValidatedTimestamp != null) {
            dVar.f(serialDescriptor, 15, g1.f86515a, configPayload.configLastValidatedTimestamp);
        }
        if (dVar.r(serialDescriptor, 16) || configPayload.autoRedirect != null) {
            dVar.f(serialDescriptor, 16, ConfigPayload$AutoRedirect$$serializer.INSTANCE, configPayload.autoRedirect);
        }
        if (dVar.r(serialDescriptor, 17) || configPayload.retryPriorityTPATs != null) {
            dVar.f(serialDescriptor, 17, wo.i.f86540a, configPayload.retryPriorityTPATs);
        }
        if (dVar.r(serialDescriptor, 18) || configPayload.enableOT != null) {
            dVar.f(serialDescriptor, 18, wo.i.f86540a, configPayload.enableOT);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final CleverCache getCleverCache() {
        return this.cleverCache;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Integer getSessionTimeout() {
        return this.sessionTimeout;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Boolean getWaitForConnectivityForTPAT() {
        return this.waitForConnectivityForTPAT;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Integer getSignalSessionTimeout() {
        return this.signalSessionTimeout;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Boolean getSignalsDisabled() {
        return this.signalsDisabled;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Boolean getFpdEnabled() {
        return this.fpdEnabled;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final Boolean getRtaDebugging() {
        return this.rtaDebugging;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final Long getConfigLastValidatedTimestamp() {
        return this.configLastValidatedTimestamp;
    }

    @Nullable
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final AutoRedirect getAutoRedirect() {
        return this.autoRedirect;
    }

    @Nullable
    /* JADX INFO: renamed from: component18, reason: from getter */
    public final Boolean getRetryPriorityTPATs() {
        return this.retryPriorityTPATs;
    }

    @Nullable
    /* JADX INFO: renamed from: component19, reason: from getter */
    public final Boolean getEnableOT() {
        return this.enableOT;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ConfigSettings getConfigSettings() {
        return this.configSettings;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Endpoints getEndpoints() {
        return this.endpoints;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final LogMetricsSettings getLogMetricsSettings() {
        return this.logMetricsSettings;
    }

    @Nullable
    public final List<Placement> component5() {
        return this.placements;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final UserPrivacy getUserPrivacy() {
        return this.userPrivacy;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getConfigExtension() {
        return this.configExtension;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Boolean getDisableAdId() {
        return this.disableAdId;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Boolean getIsReportIncentivizedEnabled() {
        return this.isReportIncentivizedEnabled;
    }

    @NotNull
    public final ConfigPayload copy(@Nullable CleverCache cleverCache, @Nullable ConfigSettings configSettings, @Nullable Endpoints endpoints, @Nullable LogMetricsSettings logMetricsSettings, @Nullable List<Placement> placements, @Nullable UserPrivacy userPrivacy, @Nullable String configExtension, @Nullable Boolean disableAdId, @Nullable Boolean isReportIncentivizedEnabled, @Nullable Integer sessionTimeout, @Nullable Boolean waitForConnectivityForTPAT, @Nullable Integer signalSessionTimeout, @Nullable Boolean signalsDisabled, @Nullable Boolean fpdEnabled, @Nullable Boolean rtaDebugging, @Nullable Long configLastValidatedTimestamp, @Nullable AutoRedirect autoRedirect, @Nullable Boolean retryPriorityTPATs, @Nullable Boolean enableOT) {
        return new ConfigPayload(cleverCache, configSettings, endpoints, logMetricsSettings, placements, userPrivacy, configExtension, disableAdId, isReportIncentivizedEnabled, sessionTimeout, waitForConnectivityForTPAT, signalSessionTimeout, signalsDisabled, fpdEnabled, rtaDebugging, configLastValidatedTimestamp, autoRedirect, retryPriorityTPATs, enableOT);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConfigPayload)) {
            return false;
        }
        ConfigPayload configPayload = (ConfigPayload) other;
        return p.f(this.cleverCache, configPayload.cleverCache) && p.f(this.configSettings, configPayload.configSettings) && p.f(this.endpoints, configPayload.endpoints) && p.f(this.logMetricsSettings, configPayload.logMetricsSettings) && p.f(this.placements, configPayload.placements) && p.f(this.userPrivacy, configPayload.userPrivacy) && p.f(this.configExtension, configPayload.configExtension) && p.f(this.disableAdId, configPayload.disableAdId) && p.f(this.isReportIncentivizedEnabled, configPayload.isReportIncentivizedEnabled) && p.f(this.sessionTimeout, configPayload.sessionTimeout) && p.f(this.waitForConnectivityForTPAT, configPayload.waitForConnectivityForTPAT) && p.f(this.signalSessionTimeout, configPayload.signalSessionTimeout) && p.f(this.signalsDisabled, configPayload.signalsDisabled) && p.f(this.fpdEnabled, configPayload.fpdEnabled) && p.f(this.rtaDebugging, configPayload.rtaDebugging) && p.f(this.configLastValidatedTimestamp, configPayload.configLastValidatedTimestamp) && p.f(this.autoRedirect, configPayload.autoRedirect) && p.f(this.retryPriorityTPATs, configPayload.retryPriorityTPATs) && p.f(this.enableOT, configPayload.enableOT);
    }

    @Nullable
    public final AutoRedirect getAutoRedirect() {
        return this.autoRedirect;
    }

    @Nullable
    public final CleverCache getCleverCache() {
        return this.cleverCache;
    }

    @Nullable
    public final String getConfigExtension() {
        return this.configExtension;
    }

    @Nullable
    public final Long getConfigLastValidatedTimestamp() {
        return this.configLastValidatedTimestamp;
    }

    @Nullable
    public final ConfigSettings getConfigSettings() {
        return this.configSettings;
    }

    @Nullable
    public final Boolean getDisableAdId() {
        return this.disableAdId;
    }

    @Nullable
    public final Boolean getEnableOT() {
        return this.enableOT;
    }

    @Nullable
    public final Endpoints getEndpoints() {
        return this.endpoints;
    }

    @Nullable
    public final Boolean getFpdEnabled() {
        return this.fpdEnabled;
    }

    @Nullable
    public final LogMetricsSettings getLogMetricsSettings() {
        return this.logMetricsSettings;
    }

    @Nullable
    public final List<Placement> getPlacements() {
        return this.placements;
    }

    @Nullable
    public final Boolean getRetryPriorityTPATs() {
        return this.retryPriorityTPATs;
    }

    @Nullable
    public final Boolean getRtaDebugging() {
        return this.rtaDebugging;
    }

    @Nullable
    public final Integer getSessionTimeout() {
        return this.sessionTimeout;
    }

    @Nullable
    public final Integer getSignalSessionTimeout() {
        return this.signalSessionTimeout;
    }

    @Nullable
    public final Boolean getSignalsDisabled() {
        return this.signalsDisabled;
    }

    @Nullable
    public final UserPrivacy getUserPrivacy() {
        return this.userPrivacy;
    }

    @Nullable
    public final Boolean getWaitForConnectivityForTPAT() {
        return this.waitForConnectivityForTPAT;
    }

    public int hashCode() {
        CleverCache cleverCache = this.cleverCache;
        int iHashCode = (cleverCache == null ? 0 : cleverCache.hashCode()) * 31;
        ConfigSettings configSettings = this.configSettings;
        int iHashCode2 = (iHashCode + (configSettings == null ? 0 : configSettings.hashCode())) * 31;
        Endpoints endpoints = this.endpoints;
        int iHashCode3 = (iHashCode2 + (endpoints == null ? 0 : endpoints.hashCode())) * 31;
        LogMetricsSettings logMetricsSettings = this.logMetricsSettings;
        int iHashCode4 = (iHashCode3 + (logMetricsSettings == null ? 0 : logMetricsSettings.hashCode())) * 31;
        List<Placement> list = this.placements;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        UserPrivacy userPrivacy = this.userPrivacy;
        int iHashCode6 = (iHashCode5 + (userPrivacy == null ? 0 : userPrivacy.hashCode())) * 31;
        String str = this.configExtension;
        int iHashCode7 = (iHashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.disableAdId;
        int iHashCode8 = (iHashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isReportIncentivizedEnabled;
        int iHashCode9 = (iHashCode8 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num = this.sessionTimeout;
        int iHashCode10 = (iHashCode9 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool3 = this.waitForConnectivityForTPAT;
        int iHashCode11 = (iHashCode10 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Integer num2 = this.signalSessionTimeout;
        int iHashCode12 = (iHashCode11 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool4 = this.signalsDisabled;
        int iHashCode13 = (iHashCode12 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.fpdEnabled;
        int iHashCode14 = (iHashCode13 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.rtaDebugging;
        int iHashCode15 = (iHashCode14 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Long l10 = this.configLastValidatedTimestamp;
        int iHashCode16 = (iHashCode15 + (l10 == null ? 0 : l10.hashCode())) * 31;
        AutoRedirect autoRedirect = this.autoRedirect;
        int iHashCode17 = (iHashCode16 + (autoRedirect == null ? 0 : autoRedirect.hashCode())) * 31;
        Boolean bool7 = this.retryPriorityTPATs;
        int iHashCode18 = (iHashCode17 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        Boolean bool8 = this.enableOT;
        return iHashCode18 + (bool8 != null ? bool8.hashCode() : 0);
    }

    @Nullable
    public final Boolean isReportIncentivizedEnabled() {
        return this.isReportIncentivizedEnabled;
    }

    public final void setAutoRedirect(@Nullable AutoRedirect autoRedirect) {
        this.autoRedirect = autoRedirect;
    }

    public final void setConfigLastValidatedTimestamp(@Nullable Long l10) {
        this.configLastValidatedTimestamp = l10;
    }

    public final void setEnableOT(@Nullable Boolean bool) {
        this.enableOT = bool;
    }

    public final void setRetryPriorityTPATs(@Nullable Boolean bool) {
        this.retryPriorityTPATs = bool;
    }

    @NotNull
    public String toString() {
        return "ConfigPayload(cleverCache=" + this.cleverCache + ", configSettings=" + this.configSettings + ", endpoints=" + this.endpoints + ", logMetricsSettings=" + this.logMetricsSettings + ", placements=" + this.placements + ", userPrivacy=" + this.userPrivacy + ", configExtension=" + this.configExtension + ", disableAdId=" + this.disableAdId + ", isReportIncentivizedEnabled=" + this.isReportIncentivizedEnabled + ", sessionTimeout=" + this.sessionTimeout + ", waitForConnectivityForTPAT=" + this.waitForConnectivityForTPAT + ", signalSessionTimeout=" + this.signalSessionTimeout + ", signalsDisabled=" + this.signalsDisabled + ", fpdEnabled=" + this.fpdEnabled + ", rtaDebugging=" + this.rtaDebugging + ", configLastValidatedTimestamp=" + this.configLastValidatedTimestamp + ", autoRedirect=" + this.autoRedirect + ", retryPriorityTPATs=" + this.retryPriorityTPATs + ", enableOT=" + this.enableOT + ')';
    }
}
