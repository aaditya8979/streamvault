package com.facebook.appevents;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.VisibleForTesting;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformerWebRequests;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.a0;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.inmobi.unification.sdk.InitializationStatus;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vungle.ads.internal.ui.AdActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: compiled from: AppEventQueue.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b7\u00108J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0007J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\fH\u0007J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u001a\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0007J\u001e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0011H\u0007J*\u0010\u001c\u001a\u0004\u0018\u00010\u00152\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0011H\u0007J0\u0010 \u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u0011H\u0007R\u001c\u0010%\u001a\n \"*\u0004\u0018\u00010!0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8\u0002X\u0082D¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u001c\u0010/\u001a\n \"*\u0004\u0018\u00010,0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u001c\u00103\u001a\b\u0012\u0002\b\u0003\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00106\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00105¨\u00069"}, d2 = {"Lcom/facebook/appevents/k;", "", "Lbn/r;", "s", "Lcom/facebook/appevents/FlushReason;", "reason", "l", "Lcom/facebook/appevents/AccessTokenAppIdPair;", "accessTokenAppId", "Lcom/facebook/appevents/AppEvent;", "appEvent", "g", "", "p", "n", "Lcom/facebook/appevents/c;", "appEventCollection", "Lcom/facebook/appevents/w;", "u", "flushResults", "", "Lcom/facebook/GraphRequest;", CampaignEx.JSON_KEY_AD_K, "Lcom/facebook/appevents/y;", "appEvents", "", "limitEventUsage", "flushState", "i", AdActivity.REQUEST_KEY_EXTRA, "Lk2/z;", "response", "q", "", "kotlin.jvm.PlatformType", "b", "Ljava/lang/String;", "TAG", "", "c", "I", "NUM_LOG_EVENTS_TO_TRY_TO_FLUSH_AFTER", "d", "Lcom/facebook/appevents/c;", "Ljava/util/concurrent/ScheduledExecutorService;", "e", "Ljava/util/concurrent/ScheduledExecutorService;", "singleThreadExecutor", "Ljava/util/concurrent/ScheduledFuture;", InneractiveMediationDefs.GENDER_FEMALE, "Ljava/util/concurrent/ScheduledFuture;", "scheduledFuture", "Ljava/lang/Runnable;", "Ljava/lang/Runnable;", "flushRunnable", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class k {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public static ScheduledFuture<?> scheduledFuture;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final k f15208a = new k();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final String TAG = k.class.getName();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final int NUM_LOG_EVENTS_TO_TRY_TO_FLUSH_AFTER = 100;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static volatile c appEventCollection = new c();

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final ScheduledExecutorService singleThreadExecutor = Executors.newSingleThreadScheduledExecutor();

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Runnable flushRunnable = new Runnable() { // from class: com.facebook.appevents.f
        @Override // java.lang.Runnable
        public final void run() {
            k.o();
        }
    };

    public static final void g(@NotNull final AccessTokenAppIdPair accessTokenAppIdPair, @NotNull final AppEvent appEvent) {
        if (c3.a.d(k.class)) {
            return;
        }
        try {
            tn.p.k(accessTokenAppIdPair, "accessTokenAppId");
            tn.p.k(appEvent, "appEvent");
            singleThreadExecutor.execute(new Runnable() { // from class: com.facebook.appevents.e
                @Override // java.lang.Runnable
                public final void run() {
                    k.h(accessTokenAppIdPair, appEvent);
                }
            });
        } catch (Throwable th2) {
            c3.a.b(th2, k.class);
        }
    }

    public static final void h(AccessTokenAppIdPair accessTokenAppIdPair, AppEvent appEvent) {
        if (c3.a.d(k.class)) {
            return;
        }
        try {
            tn.p.k(accessTokenAppIdPair, "$accessTokenAppId");
            tn.p.k(appEvent, "$appEvent");
            appEventCollection.a(accessTokenAppIdPair, appEvent);
            if (AppEventsLogger.INSTANCE.d() != AppEventsLogger.FlushBehavior.EXPLICIT_ONLY && appEventCollection.d() > NUM_LOG_EVENTS_TO_TRY_TO_FLUSH_AFTER) {
                n(FlushReason.EVENT_THRESHOLD);
            } else if (scheduledFuture == null) {
                scheduledFuture = singleThreadExecutor.schedule(flushRunnable, 15L, TimeUnit.SECONDS);
            }
        } catch (Throwable th2) {
            c3.a.b(th2, k.class);
        }
    }

    @Nullable
    public static final GraphRequest i(@NotNull final AccessTokenAppIdPair accessTokenAppId, @NotNull final y appEvents, boolean limitEventUsage, @NotNull final w flushState) {
        if (c3.a.d(k.class)) {
            return null;
        }
        try {
            tn.p.k(accessTokenAppId, "accessTokenAppId");
            tn.p.k(appEvents, "appEvents");
            tn.p.k(flushState, "flushState");
            String applicationId = accessTokenAppId.getApplicationId();
            com.facebook.internal.q qVarN = FetchedAppSettingsManager.n(applicationId, false);
            GraphRequest.Companion companion = GraphRequest.INSTANCE;
            tn.x xVar = tn.x.f85368a;
            String str = String.format("%s/activities", Arrays.copyOf(new Object[]{applicationId}, 1));
            tn.p.j(str, "java.lang.String.format(format, *args)");
            final GraphRequest graphRequestA = companion.A(null, str, null, null);
            graphRequestA.D(true);
            Bundle parameters = graphRequestA.getParameters();
            if (parameters == null) {
                parameters = new Bundle();
            }
            parameters.putString("access_token", accessTokenAppId.getAccessTokenString());
            String strD = x.INSTANCE.d();
            if (strD != null) {
                parameters.putString("device_token", strD);
            }
            String strK = o.INSTANCE.k();
            if (strK != null) {
                parameters.putString("install_referrer", strK);
            }
            graphRequestA.G(parameters);
            int iE = appEvents.e(graphRequestA, k2.t.l(), qVarN != null ? qVarN.getSupportsImplicitLogging() : false, limitEventUsage);
            if (iE == 0) {
                return null;
            }
            flushState.c(flushState.getNumEvents() + iE);
            graphRequestA.C(new GraphRequest.b() { // from class: com.facebook.appevents.g
                @Override // com.facebook.GraphRequest.b
                public final void a(k2.z zVar) {
                    k.j(accessTokenAppId, graphRequestA, appEvents, flushState, zVar);
                }
            });
            return graphRequestA;
        } catch (Throwable th2) {
            c3.a.b(th2, k.class);
            return null;
        }
    }

    public static final void j(AccessTokenAppIdPair accessTokenAppIdPair, GraphRequest graphRequest, y yVar, w wVar, k2.z zVar) {
        if (c3.a.d(k.class)) {
            return;
        }
        try {
            tn.p.k(accessTokenAppIdPair, "$accessTokenAppId");
            tn.p.k(graphRequest, "$postRequest");
            tn.p.k(yVar, "$appEvents");
            tn.p.k(wVar, "$flushState");
            tn.p.k(zVar, "response");
            q(accessTokenAppIdPair, graphRequest, zVar, yVar, wVar);
        } catch (Throwable th2) {
            c3.a.b(th2, k.class);
        }
    }

    @NotNull
    public static final List<GraphRequest> k(@NotNull c appEventCollection2, @NotNull w flushResults) {
        if (c3.a.d(k.class)) {
            return null;
        }
        try {
            tn.p.k(appEventCollection2, "appEventCollection");
            tn.p.k(flushResults, "flushResults");
            boolean z10 = k2.t.z(k2.t.l());
            ArrayList arrayList = new ArrayList();
            for (AccessTokenAppIdPair accessTokenAppIdPair : appEventCollection2.f()) {
                y yVarC = appEventCollection2.c(accessTokenAppIdPair);
                if (yVarC == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                GraphRequest graphRequestI = i(accessTokenAppIdPair, yVarC, z10, flushResults);
                if (graphRequestI != null) {
                    arrayList.add(graphRequestI);
                    if (m2.b.f73931a.f()) {
                        AppEventsConversionsAPITransformerWebRequests.l(graphRequestI);
                    }
                }
            }
            return arrayList;
        } catch (Throwable th2) {
            c3.a.b(th2, k.class);
            return null;
        }
    }

    public static final void l(@NotNull final FlushReason flushReason) {
        if (c3.a.d(k.class)) {
            return;
        }
        try {
            tn.p.k(flushReason, "reason");
            singleThreadExecutor.execute(new Runnable() { // from class: com.facebook.appevents.h
                @Override // java.lang.Runnable
                public final void run() {
                    k.m(flushReason);
                }
            });
        } catch (Throwable th2) {
            c3.a.b(th2, k.class);
        }
    }

    public static final void m(FlushReason flushReason) {
        if (c3.a.d(k.class)) {
            return;
        }
        try {
            tn.p.k(flushReason, "$reason");
            n(flushReason);
        } catch (Throwable th2) {
            c3.a.b(th2, k.class);
        }
    }

    public static final void n(@NotNull FlushReason flushReason) {
        if (c3.a.d(k.class)) {
            return;
        }
        try {
            tn.p.k(flushReason, "reason");
            appEventCollection.b(d.a());
            try {
                w wVarU = u(flushReason, appEventCollection);
                if (wVarU != null) {
                    Intent intent = new Intent("com.facebook.sdk.APP_EVENTS_FLUSHED");
                    intent.putExtra("com.facebook.sdk.APP_EVENTS_NUM_EVENTS_FLUSHED", wVarU.getNumEvents());
                    intent.putExtra("com.facebook.sdk.APP_EVENTS_FLUSH_RESULT", wVarU.getResult());
                    LocalBroadcastManager.getInstance(k2.t.l()).sendBroadcast(intent);
                }
            } catch (Exception e10) {
                Log.w(TAG, "Caught unexpected exception while flushing app events: ", e10);
            }
        } catch (Throwable th2) {
            c3.a.b(th2, k.class);
        }
    }

    public static final void o() {
        if (c3.a.d(k.class)) {
            return;
        }
        try {
            scheduledFuture = null;
            if (AppEventsLogger.INSTANCE.d() != AppEventsLogger.FlushBehavior.EXPLICIT_ONLY) {
                n(FlushReason.TIMER);
            }
        } catch (Throwable th2) {
            c3.a.b(th2, k.class);
        }
    }

    @NotNull
    public static final Set<AccessTokenAppIdPair> p() {
        if (c3.a.d(k.class)) {
            return null;
        }
        try {
            return appEventCollection.f();
        } catch (Throwable th2) {
            c3.a.b(th2, k.class);
            return null;
        }
    }

    public static final void q(@NotNull final AccessTokenAppIdPair accessTokenAppIdPair, @NotNull GraphRequest graphRequest, @NotNull k2.z zVar, @NotNull final y yVar, @NotNull w wVar) {
        String string;
        if (c3.a.d(k.class)) {
            return;
        }
        try {
            tn.p.k(accessTokenAppIdPair, "accessTokenAppId");
            tn.p.k(graphRequest, AdActivity.REQUEST_KEY_EXTRA);
            tn.p.k(zVar, "response");
            tn.p.k(yVar, "appEvents");
            tn.p.k(wVar, "flushState");
            FacebookRequestError error = zVar.getError();
            String str = InitializationStatus.SUCCESS;
            FlushResult flushResult = FlushResult.SUCCESS;
            boolean z10 = true;
            if (error != null) {
                if (error.getCom.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE java.lang.String() == -1) {
                    str = "Failed: No Connectivity";
                    flushResult = FlushResult.NO_CONNECTIVITY;
                } else {
                    tn.x xVar = tn.x.f85368a;
                    str = String.format("Failed:\n  Response: %s\n  Error %s", Arrays.copyOf(new Object[]{zVar.toString(), error.toString()}, 2));
                    tn.p.j(str, "java.lang.String.format(format, *args)");
                    flushResult = FlushResult.SERVER_ERROR;
                }
            }
            k2.t tVar = k2.t.f72784a;
            if (k2.t.H(LoggingBehavior.APP_EVENTS)) {
                try {
                    string = new JSONArray((String) graphRequest.getTag()).toString(2);
                    tn.p.j(string, "{\n            val jsonArray = JSONArray(eventsJsonString)\n            jsonArray.toString(2)\n          }");
                } catch (JSONException unused) {
                    string = "<Can't encode events for debug logging>";
                }
                a0.Companion companion = com.facebook.internal.a0.INSTANCE;
                LoggingBehavior loggingBehavior = LoggingBehavior.APP_EVENTS;
                String str2 = TAG;
                tn.p.j(str2, "TAG");
                companion.c(loggingBehavior, str2, "Flush completed\nParams: %s\n  Result: %s\n  Events JSON: %s", String.valueOf(graphRequest.getGraphObject()), str, string);
            }
            if (error == null) {
                z10 = false;
            }
            yVar.b(z10);
            FlushResult flushResult2 = FlushResult.NO_CONNECTIVITY;
            if (flushResult == flushResult2) {
                k2.t.t().execute(new Runnable() { // from class: com.facebook.appevents.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        k.r(accessTokenAppIdPair, yVar);
                    }
                });
            }
            if (flushResult == FlushResult.SUCCESS || wVar.getResult() == flushResult2) {
                return;
            }
            wVar.setResult(flushResult);
        } catch (Throwable th2) {
            c3.a.b(th2, k.class);
        }
    }

    public static final void r(AccessTokenAppIdPair accessTokenAppIdPair, y yVar) {
        if (c3.a.d(k.class)) {
            return;
        }
        try {
            tn.p.k(accessTokenAppIdPair, "$accessTokenAppId");
            tn.p.k(yVar, "$appEvents");
            l.a(accessTokenAppIdPair, yVar);
        } catch (Throwable th2) {
            c3.a.b(th2, k.class);
        }
    }

    public static final void s() {
        if (c3.a.d(k.class)) {
            return;
        }
        try {
            singleThreadExecutor.execute(new Runnable() { // from class: com.facebook.appevents.i
                @Override // java.lang.Runnable
                public final void run() {
                    k.t();
                }
            });
        } catch (Throwable th2) {
            c3.a.b(th2, k.class);
        }
    }

    public static final void t() {
        if (c3.a.d(k.class)) {
            return;
        }
        try {
            l lVar = l.f15215a;
            l.b(appEventCollection);
            appEventCollection = new c();
        } catch (Throwable th2) {
            c3.a.b(th2, k.class);
        }
    }

    @VisibleForTesting(otherwise = 2)
    @Nullable
    public static final w u(@NotNull FlushReason reason, @NotNull c appEventCollection2) {
        if (c3.a.d(k.class)) {
            return null;
        }
        try {
            tn.p.k(reason, "reason");
            tn.p.k(appEventCollection2, "appEventCollection");
            w wVar = new w();
            List<GraphRequest> listK = k(appEventCollection2, wVar);
            if (!(!listK.isEmpty())) {
                return null;
            }
            a0.Companion companion = com.facebook.internal.a0.INSTANCE;
            LoggingBehavior loggingBehavior = LoggingBehavior.APP_EVENTS;
            String str = TAG;
            tn.p.j(str, "TAG");
            companion.c(loggingBehavior, str, "Flushing %d events due to %s.", Integer.valueOf(wVar.getNumEvents()), reason.toString());
            Iterator<GraphRequest> it = listK.iterator();
            while (it.hasNext()) {
                it.next().k();
            }
            return wVar;
        } catch (Throwable th2) {
            c3.a.b(th2, k.class);
            return null;
        }
    }
}
