package com.vungle.ads.internal.signals;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import androidx.annotation.VisibleForTesting;
import bn.g;
import bn.r;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.internal.ConfigManager;
import com.vungle.ads.internal.executor.Executors;
import com.vungle.ads.internal.model.UnclosedAd;
import com.vungle.ads.internal.persistence.FilePreferences;
import com.vungle.ads.internal.platform.DeviceCheckUtils;
import com.vungle.ads.internal.session.UnclosedAdDetector;
import com.vungle.ads.internal.util.ActivityManager;
import com.vungle.ads.internal.util.Logger;
import com.vungle.ads.internal.util.PathProvider;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.b;
import kotlin.reflect.KTypeProjection;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import so.t;
import tn.p;
import xo.a;
import xo.d;
import xo.u;

/* JADX INFO: compiled from: SignalManager.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 T2\u00020\u0001:\u0001TB\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\bR\u0010SJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\u0006\u0010\u0006\u001a\u00020\u0002J\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007J\u0006\u0010\u000b\u001a\u00020\u0002J\u000e\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fJ\u000e\u0010\u000f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fJ\u0018\u0010\u0013\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0012\u001a\u00020\tJ\u0010\u0010\u0015\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0007J\b\u0010\u0016\u001a\u0004\u0018\u00010\u0007J\u0010\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0010R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\"\u0010!\u001a\u00020 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010'\u001a\u00020 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010\"\u001a\u0004\b(\u0010$\"\u0004\b)\u0010&R\"\u0010*\u001a\u00020 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010\"\u001a\u0004\b+\u0010$\"\u0004\b,\u0010&R\"\u0010-\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u00103\u001a\u00020 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u0010\"\u001a\u0004\b4\u0010$\"\u0004\b5\u0010&R(\u00107\u001a\u0002068\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b7\u00108\u0012\u0004\b=\u0010>\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R.\u0010@\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020 0?8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\u001b\u0010K\u001a\u00020F8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR\u0016\u0010M\u001a\u00020L8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u0011\u0010Q\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bO\u0010P¨\u0006Y²\u0006\f\u0010V\u001a\u00020U8\nX\u008a\u0084\u0002²\u0006\f\u0010X\u001a\u00020W8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/vungle/ads/internal/signals/SignalManager;", "", "Lbn/r;", "updateSessionCount", "registerNotifications", "updateSessionDuration", "createNewSessionData", "", "placementId", "Lcom/vungle/ads/internal/signals/SignaledAd;", "getSignaledAd", "increaseSessionDepthCounter", "Lcom/vungle/ads/internal/model/UnclosedAd;", "unclosedAd", "recordUnclosedAd", "removeUnclosedAd", "Landroid/content/Context;", GAMConfig.KEY_CONTEXT, "signaledAd", "registerSignaledAd", "signals", "updateTemplateSignals", "generateSignals", "ctx", "", "screenOrientation", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Lxo/a;", "json", "Lxo/a;", "", "enterBackgroundTime", "J", "getEnterBackgroundTime", "()J", "setEnterBackgroundTime", "(J)V", "enterForegroundTime", "getEnterForegroundTime", "setEnterForegroundTime", "sessionDuration", "getSessionDuration", "setSessionDuration", "sessionCount", "I", "getSessionCount", "()I", "setSessionCount", "(I)V", "sessionSeriesCreatedTime", "getSessionSeriesCreatedTime", "setSessionSeriesCreatedTime", "Lcom/vungle/ads/internal/signals/SessionData;", "currentSession", "Lcom/vungle/ads/internal/signals/SessionData;", "getCurrentSession$vungle_ads_release", "()Lcom/vungle/ads/internal/signals/SessionData;", "setCurrentSession$vungle_ads_release", "(Lcom/vungle/ads/internal/signals/SessionData;)V", "getCurrentSession$vungle_ads_release$annotations", "()V", "Ljava/util/concurrent/ConcurrentHashMap;", "mapOfLastLoadTimes", "Ljava/util/concurrent/ConcurrentHashMap;", "getMapOfLastLoadTimes", "()Ljava/util/concurrent/ConcurrentHashMap;", "setMapOfLastLoadTimes", "(Ljava/util/concurrent/ConcurrentHashMap;)V", "Lcom/vungle/ads/internal/persistence/FilePreferences;", "filePreferences$delegate", "Lbn/g;", "getFilePreferences", "()Lcom/vungle/ads/internal/persistence/FilePreferences;", "filePreferences", "Lcom/vungle/ads/internal/session/UnclosedAdDetector;", "unclosedAdDetector", "Lcom/vungle/ads/internal/session/UnclosedAdDetector;", "getUuid", "()Ljava/lang/String;", CommonUrlParts.UUID, "<init>", "(Landroid/content/Context;)V", VastTagName.COMPANION, "Lcom/vungle/ads/internal/executor/Executors;", "executors", "Lcom/vungle/ads/internal/util/PathProvider;", "pathProvider", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
public final class SignalManager {

    @NotNull
    public static final String SESSION_COUNT_KEY = "vungle_signal_session_count";
    private static final int SESSION_COUNT_NOT_SET = -1;

    @NotNull
    public static final String SESSION_TIME_KEY = "vungle_signal_session_creation_time";
    public static final int SIGNAL_VERSION = 2;

    @NotNull
    private static final String TAG = "SignalManager";
    public static final long TWENTY_FOUR_HOURS_MILLIS = 86400000;

    @NotNull
    private final Context context;

    @NotNull
    private SessionData currentSession;
    private long enterBackgroundTime;
    private long enterForegroundTime;

    /* JADX INFO: renamed from: filePreferences$delegate, reason: from kotlin metadata */
    @NotNull
    private final g filePreferences;

    @NotNull
    private final a json;

    @NotNull
    private ConcurrentHashMap<String, Long> mapOfLastLoadTimes;
    private int sessionCount;
    private long sessionDuration;
    private long sessionSeriesCreatedTime;

    @NotNull
    private UnclosedAdDetector unclosedAdDetector;

    public SignalManager(@NotNull final Context context) {
        p.k(context, GAMConfig.KEY_CONTEXT);
        this.context = context;
        int i10 = 1;
        this.json = u.b(null, new l<d, r>() { // from class: com.vungle.ads.internal.signals.SignalManager$json$1
            @Override // sn.l
            public /* bridge */ /* synthetic */ r invoke(d dVar) {
                invoke2(dVar);
                return r.f5635a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull d dVar) {
                p.k(dVar, "$this$Json");
                dVar.f(true);
                dVar.d(true);
                dVar.e(false);
            }
        }, 1, null);
        this.enterForegroundTime = System.currentTimeMillis();
        this.sessionCount = -1;
        this.mapOfLastLoadTimes = new ConcurrentHashMap<>();
        ServiceLocator.Companion companion = ServiceLocator.INSTANCE;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        this.filePreferences = b.a(lazyThreadSafetyMode, new sn.a<FilePreferences>() { // from class: com.vungle.ads.internal.signals.SignalManager$special$$inlined$inject$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.persistence.FilePreferences, java.lang.Object] */
            @Override // sn.a
            @NotNull
            public final FilePreferences invoke() {
                return ServiceLocator.INSTANCE.getInstance(context).getService(FilePreferences.class);
            }
        });
        registerNotifications();
        this.sessionSeriesCreatedTime = getFilePreferences().getLong(SESSION_TIME_KEY, -1L);
        updateSessionCount();
        this.currentSession = new SessionData(this.sessionCount);
        UnclosedAdDetector unclosedAdDetector = new UnclosedAdDetector(context, this.currentSession.getSessionId(), m7343_init_$lambda0(b.a(lazyThreadSafetyMode, new sn.a<Executors>() { // from class: com.vungle.ads.internal.signals.SignalManager$special$$inlined$inject$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.executor.Executors, java.lang.Object] */
            @Override // sn.a
            @NotNull
            public final Executors invoke() {
                return ServiceLocator.INSTANCE.getInstance(context).getService(Executors.class);
            }
        })), m7344_init_$lambda1(b.a(lazyThreadSafetyMode, new sn.a<PathProvider>() { // from class: com.vungle.ads.internal.signals.SignalManager$special$$inlined$inject$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.util.PathProvider, java.lang.Object] */
            @Override // sn.a
            @NotNull
            public final PathProvider invoke() {
                return ServiceLocator.INSTANCE.getInstance(context).getService(PathProvider.class);
            }
        })));
        this.unclosedAdDetector = unclosedAdDetector;
        this.currentSession.setUnclosedAd(unclosedAdDetector.retrieveUnclosedAd());
        Logger.INSTANCE.w(TAG, new sn.a<String>() { // from class: com.vungle.ads.internal.signals.SignalManager.1
            {
                super(0);
            }

            @Override // sn.a
            @NotNull
            public final String invoke() {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("unclosedad: ");
                a aVar = SignalManager.this.json;
                List<UnclosedAd> unclosedAd = SignalManager.this.getCurrentSession().getUnclosedAd();
                KSerializer<Object> kSerializerB = t.b(aVar.a(), tn.t.n(List.class, KTypeProjection.Companion.invariant(tn.t.m(UnclosedAd.class))));
                p.i(kSerializerB, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                sb2.append(aVar.b(kSerializerB, unclosedAd));
                return sb2.toString();
            }
        });
        try {
            SessionData sessionData = this.currentSession;
            DeviceCheckUtils deviceCheckUtils = DeviceCheckUtils.INSTANCE;
            sessionData.setDevice(deviceCheckUtils.isEmulator() ? 0 : 1);
            this.currentSession.setVPNConnected(deviceCheckUtils.isVpnConnected(context) ? 1 : 0);
            this.currentSession.setOverlayGranted(deviceCheckUtils.hasSystemAlertWindowPermission(context) ? 1 : 0);
            this.currentSession.setSensorCount(deviceCheckUtils.getSensorCount(context));
            SessionData sessionData2 = this.currentSession;
            if (!deviceCheckUtils.isProxyEnabled(context)) {
                i10 = 0;
            }
            sessionData2.setHttpProxyEnabled(i10);
        } catch (Exception e10) {
            Logger.INSTANCE.e(TAG, "Failed to collect device signals: " + e10.getLocalizedMessage());
        }
    }

    /* JADX INFO: renamed from: _init_$lambda-0, reason: not valid java name */
    private static final Executors m7343_init_$lambda0(g<? extends Executors> gVar) {
        return gVar.getValue();
    }

    /* JADX INFO: renamed from: _init_$lambda-1, reason: not valid java name */
    private static final PathProvider m7344_init_$lambda1(g<PathProvider> gVar) {
        return gVar.getValue();
    }

    @VisibleForTesting(otherwise = 2)
    public static /* synthetic */ void getCurrentSession$vungle_ads_release$annotations() {
    }

    private final void registerNotifications() {
        ActivityManager.INSTANCE.addLifecycleListener(new ActivityManager.LifeCycleCallback() { // from class: com.vungle.ads.internal.signals.SignalManager.registerNotifications.1
            @Override // com.vungle.ads.internal.util.ActivityManager.LifeCycleCallback
            public void onBackground() {
                Logger.INSTANCE.d(SignalManager.TAG, "SignalManager#onBackground()");
                SignalManager.this.setEnterBackgroundTime(System.currentTimeMillis());
                SignalManager signalManager = SignalManager.this;
                signalManager.setSessionDuration(signalManager.getSessionDuration() + (SignalManager.this.getEnterBackgroundTime() - SignalManager.this.getEnterForegroundTime()));
            }

            @Override // com.vungle.ads.internal.util.ActivityManager.LifeCycleCallback
            public void onForeground() {
                Logger.INSTANCE.d(SignalManager.TAG, "SignalManager#onForeground()");
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - SignalManager.this.getEnterBackgroundTime() > ConfigManager.INSTANCE.getSignalsSessionTimeout()) {
                    SignalManager.this.createNewSessionData();
                }
                SignalManager.this.setEnterForegroundTime(jCurrentTimeMillis);
                SignalManager.this.setEnterBackgroundTime(0L);
            }
        });
    }

    private final void updateSessionCount() {
        if (this.sessionCount == -1) {
            this.sessionCount = getFilePreferences().getInt(SESSION_COUNT_KEY, 0);
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j10 = this.sessionSeriesCreatedTime;
        long j11 = jCurrentTimeMillis - j10;
        if (j10 < 0 || j11 >= TWENTY_FOUR_HOURS_MILLIS) {
            this.sessionCount = 1;
            getFilePreferences().put(SESSION_TIME_KEY, jCurrentTimeMillis);
            this.sessionSeriesCreatedTime = jCurrentTimeMillis;
        } else {
            this.sessionCount++;
        }
        getFilePreferences().put(SESSION_COUNT_KEY, this.sessionCount);
        getFilePreferences().apply();
    }

    private final void updateSessionDuration() {
        this.currentSession.setSessionDuration((this.sessionDuration + System.currentTimeMillis()) - this.enterForegroundTime);
    }

    public final void createNewSessionData() {
        updateSessionCount();
        this.currentSession = new SessionData(this.sessionCount);
    }

    @Nullable
    public final String generateSignals() {
        updateSessionDuration();
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("2:");
            a aVar = this.json;
            SessionData sessionData = this.currentSession;
            KSerializer<Object> kSerializerB = t.b(aVar.a(), tn.t.m(SessionData.class));
            p.i(kSerializerB, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
            sb2.append(aVar.b(kSerializerB, sessionData));
            return sb2.toString();
        } catch (Throwable unused) {
            return null;
        }
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @NotNull
    /* JADX INFO: renamed from: getCurrentSession$vungle_ads_release, reason: from getter */
    public final SessionData getCurrentSession() {
        return this.currentSession;
    }

    public final long getEnterBackgroundTime() {
        return this.enterBackgroundTime;
    }

    public final long getEnterForegroundTime() {
        return this.enterForegroundTime;
    }

    @NotNull
    public final FilePreferences getFilePreferences() {
        return (FilePreferences) this.filePreferences.getValue();
    }

    @NotNull
    public final ConcurrentHashMap<String, Long> getMapOfLastLoadTimes() {
        return this.mapOfLastLoadTimes;
    }

    public final int getSessionCount() {
        return this.sessionCount;
    }

    public final long getSessionDuration() {
        return this.sessionDuration;
    }

    public final long getSessionSeriesCreatedTime() {
        return this.sessionSeriesCreatedTime;
    }

    @NotNull
    public final synchronized SignaledAd getSignaledAd(@NotNull String placementId) {
        long jCurrentTimeMillis;
        Long l10;
        p.k(placementId, "placementId");
        jCurrentTimeMillis = System.currentTimeMillis();
        l10 = this.mapOfLastLoadTimes.containsKey(placementId) ? this.mapOfLastLoadTimes.get(placementId) : null;
        this.mapOfLastLoadTimes.put(placementId, Long.valueOf(jCurrentTimeMillis));
        return new SignaledAd(l10, jCurrentTimeMillis);
    }

    @NotNull
    public final String getUuid() {
        return this.currentSession.getSessionId();
    }

    public final synchronized void increaseSessionDepthCounter() {
        SessionData sessionData = this.currentSession;
        sessionData.setSessionDepthCounter(sessionData.getSessionDepthCounter() + 1);
    }

    public final void recordUnclosedAd(@NotNull UnclosedAd unclosedAd) {
        p.k(unclosedAd, "unclosedAd");
        if (ConfigManager.INSTANCE.signalsDisabled()) {
            return;
        }
        this.unclosedAdDetector.addUnclosedAd(unclosedAd);
    }

    public final void registerSignaledAd(@Nullable Context context, @NotNull SignaledAd signaledAd) {
        p.k(signaledAd, "signaledAd");
        this.currentSession.getSignaledAd().clear();
        this.currentSession.getSignaledAd().add(signaledAd);
        this.currentSession.getSignaledAd().get(0).setScreenOrientation(screenOrientation(context));
    }

    public final void removeUnclosedAd(@NotNull UnclosedAd unclosedAd) {
        p.k(unclosedAd, "unclosedAd");
        if (ConfigManager.INSTANCE.signalsDisabled()) {
            return;
        }
        this.unclosedAdDetector.removeUnclosedAd(unclosedAd);
    }

    public final int screenOrientation(@Nullable Context ctx) {
        Configuration configuration;
        if (ctx == null) {
            ctx = this.context;
        }
        Resources resources = ctx.getResources();
        Integer numValueOf = (resources == null || (configuration = resources.getConfiguration()) == null) ? null : Integer.valueOf(configuration.orientation);
        if (numValueOf != null && numValueOf.intValue() == 2) {
            return 2;
        }
        if (numValueOf != null && numValueOf.intValue() == 1) {
            return 1;
        }
        return (numValueOf != null && numValueOf.intValue() == 0) ? 0 : -1;
    }

    public final void setCurrentSession$vungle_ads_release(@NotNull SessionData sessionData) {
        p.k(sessionData, "<set-?>");
        this.currentSession = sessionData;
    }

    public final void setEnterBackgroundTime(long j10) {
        this.enterBackgroundTime = j10;
    }

    public final void setEnterForegroundTime(long j10) {
        this.enterForegroundTime = j10;
    }

    public final void setMapOfLastLoadTimes(@NotNull ConcurrentHashMap<String, Long> concurrentHashMap) {
        p.k(concurrentHashMap, "<set-?>");
        this.mapOfLastLoadTimes = concurrentHashMap;
    }

    public final void setSessionCount(int i10) {
        this.sessionCount = i10;
    }

    public final void setSessionDuration(long j10) {
        this.sessionDuration = j10;
    }

    public final void setSessionSeriesCreatedTime(long j10) {
        this.sessionSeriesCreatedTime = j10;
    }

    public final void updateTemplateSignals(@Nullable String str) {
        if ((str == null || str.length() == 0) || !(true ^ this.currentSession.getSignaledAd().isEmpty())) {
            return;
        }
        this.currentSession.getSignaledAd().get(0).setTemplateSignals(str);
    }
}
