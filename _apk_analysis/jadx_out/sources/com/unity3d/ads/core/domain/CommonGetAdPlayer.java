package com.unity3d.ads.core.domain;

import android.content.Context;
import com.google.protobuf.ByteString;
import com.unity3d.ads.adplayer.AdPlayer;
import com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer;
import com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer;
import com.unity3d.ads.adplayer.AndroidWebViewContainer;
import com.unity3d.ads.adplayer.WebViewAdPlayer;
import com.unity3d.ads.adplayer.WebViewBridge;
import com.unity3d.ads.core.data.datasource.LifecycleDataSource;
import com.unity3d.ads.core.data.manager.OfferwallManager;
import com.unity3d.ads.core.data.manager.ScarManager;
import com.unity3d.ads.core.data.model.CoroutineOpportunity;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.OpenMeasurementRepository;
import com.unity3d.ads.core.data.repository.OrientationRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import kotlinx.coroutines.d;
import org.jetbrains.annotations.NotNull;
import p000do.h0;
import p000do.l0;
import tn.p;

/* JADX INFO: compiled from: CommonGetAdPlayer.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class CommonGetAdPlayer implements GetAdPlayer {

    @NotNull
    private final l0 adPlayerScope;

    @NotNull
    private final AdRepository adRepository;

    @NotNull
    private final Context context;

    @NotNull
    private final h0 defaultDispatcher;

    @NotNull
    private final DeviceInfoRepository deviceInfoRepository;

    @NotNull
    private final LifecycleDataSource lifecycleDataSource;

    @NotNull
    private final OfferwallManager offerwallManager;

    @NotNull
    private final OpenMeasurementRepository openMeasurementRepository;

    @NotNull
    private final OrientationRepository orientationRepository;

    @NotNull
    private final ScarManager scarManager;

    @NotNull
    private final SendDiagnosticEvent sendDiagnosticEvent;

    @NotNull
    private final SessionRepository sessionRepository;

    public CommonGetAdPlayer(@NotNull DeviceInfoRepository deviceInfoRepository, @NotNull SessionRepository sessionRepository, @NotNull SendDiagnosticEvent sendDiagnosticEvent, @NotNull h0 h0Var, @NotNull l0 l0Var, @NotNull OpenMeasurementRepository openMeasurementRepository, @NotNull ScarManager scarManager, @NotNull OfferwallManager offerwallManager, @NotNull AdRepository adRepository, @NotNull LifecycleDataSource lifecycleDataSource, @NotNull OrientationRepository orientationRepository, @NotNull Context context) {
        p.k(deviceInfoRepository, "deviceInfoRepository");
        p.k(sessionRepository, "sessionRepository");
        p.k(sendDiagnosticEvent, "sendDiagnosticEvent");
        p.k(h0Var, "defaultDispatcher");
        p.k(l0Var, "adPlayerScope");
        p.k(openMeasurementRepository, "openMeasurementRepository");
        p.k(scarManager, "scarManager");
        p.k(offerwallManager, "offerwallManager");
        p.k(adRepository, "adRepository");
        p.k(lifecycleDataSource, "lifecycleDataSource");
        p.k(orientationRepository, "orientationRepository");
        p.k(context, GAMConfig.KEY_CONTEXT);
        this.deviceInfoRepository = deviceInfoRepository;
        this.sessionRepository = sessionRepository;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.defaultDispatcher = h0Var;
        this.adPlayerScope = l0Var;
        this.openMeasurementRepository = openMeasurementRepository;
        this.scarManager = scarManager;
        this.offerwallManager = offerwallManager;
        this.adRepository = adRepository;
        this.lifecycleDataSource = lifecycleDataSource;
        this.orientationRepository = orientationRepository;
        this.context = context;
    }

    @Override // com.unity3d.ads.core.domain.GetAdPlayer
    @NotNull
    public AdPlayer invoke(@NotNull WebViewBridge webViewBridge, @NotNull AndroidWebViewContainer androidWebViewContainer, @NotNull ByteString byteString, @NotNull DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType) {
        p.k(webViewBridge, "webviewBridge");
        p.k(androidWebViewContainer, "webviewContainer");
        p.k(byteString, "opportunityId");
        p.k(diagnosticAdType, "adType");
        WebViewAdPlayer webViewAdPlayer = new WebViewAdPlayer(webViewBridge, this.deviceInfoRepository, this.sessionRepository, this.defaultDispatcher, this.sendDiagnosticEvent, androidWebViewContainer, d.i(this.adPlayerScope, new CoroutineOpportunity(byteString)));
        if (diagnosticAdType != DiagnosticEventRequestOuterClass.DiagnosticAdType.DIAGNOSTIC_AD_TYPE_FULLSCREEN) {
            String string = ProtobufExtensionsKt.toUUID(byteString).toString();
            OpenMeasurementRepository openMeasurementRepository = this.openMeasurementRepository;
            ScarManager scarManager = this.scarManager;
            LifecycleDataSource lifecycleDataSource = this.lifecycleDataSource;
            Context context = this.context;
            p.j(string, "toString()");
            return new AndroidEmbeddableWebViewAdPlayer(webViewAdPlayer, string, androidWebViewContainer, openMeasurementRepository, scarManager, lifecycleDataSource, context);
        }
        String string2 = ProtobufExtensionsKt.toUUID(byteString).toString();
        DeviceInfoRepository deviceInfoRepository = this.deviceInfoRepository;
        SessionRepository sessionRepository = this.sessionRepository;
        OpenMeasurementRepository openMeasurementRepository2 = this.openMeasurementRepository;
        ScarManager scarManager2 = this.scarManager;
        OfferwallManager offerwallManager = this.offerwallManager;
        SendDiagnosticEvent sendDiagnosticEvent = this.sendDiagnosticEvent;
        AdRepository adRepository = this.adRepository;
        OrientationRepository orientationRepository = this.orientationRepository;
        Context context2 = this.context;
        p.j(string2, "toString()");
        return new AndroidFullscreenWebViewAdPlayer(webViewAdPlayer, string2, androidWebViewContainer, deviceInfoRepository, sessionRepository, openMeasurementRepository2, scarManager2, offerwallManager, sendDiagnosticEvent, adRepository, orientationRepository, context2);
    }
}
