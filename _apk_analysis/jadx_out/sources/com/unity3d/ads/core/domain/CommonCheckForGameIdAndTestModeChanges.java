package com.unity3d.ads.core.domain;

import bn.h;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.services.core.configuration.InitializeEventsMetricSender;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.properties.SdkProperties;
import com.unity3d.services.core.request.metrics.Metric;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: CommonCheckForGameIdAndTestModeChanges.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class CommonCheckForGameIdAndTestModeChanges implements CheckForGameIdAndTestModeChanges {

    @NotNull
    private final GetGameId getGameId;

    @NotNull
    private final SendDiagnosticEvent sendDiagnosticEvent;

    public CommonCheckForGameIdAndTestModeChanges(@NotNull GetGameId getGameId, @NotNull SendDiagnosticEvent sendDiagnosticEvent) {
        p.k(getGameId, "getGameId");
        p.k(sendDiagnosticEvent, "sendDiagnosticEvent");
        this.getGameId = getGameId;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
    }

    private final void sendDiagnostic(String str, Map<String, String> map, boolean z10) {
        if (z10) {
            InitializeEventsMetricSender.getInstance().sendMetric(new Metric(str, map, null, 4, null));
        } else {
            SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, str, null, map, null, null, null, 58, null);
        }
    }

    @Override // com.unity3d.ads.core.domain.CheckForGameIdAndTestModeChanges
    public void invoke(boolean z10) {
        String strInvoke = this.getGameId.invoke();
        if (strInvoke == null) {
            strInvoke = "null";
        }
        String previousGameId = ClientProperties.getPreviousGameId();
        if (previousGameId == null) {
            previousGameId = "null";
        }
        Map<String, String> mapM = kotlin.collections.a.m(h.a("previous_game_id", previousGameId), h.a("game_id", strInvoke));
        if (p.f(previousGameId, "null")) {
            return;
        }
        if (p.f(strInvoke, previousGameId)) {
            sendDiagnostic("native_initialize_game_id_same", mapM, z10);
        } else {
            sendDiagnostic("native_initialize_game_id_changed", mapM, z10);
        }
        boolean zIsTestMode = SdkProperties.isTestMode();
        boolean previousTestMode = SdkProperties.getPreviousTestMode();
        Map<String, String> mapM2 = kotlin.collections.a.m(h.a("previous_test_mode", String.valueOf(previousTestMode)), h.a("test_mode", String.valueOf(zIsTestMode)));
        if (zIsTestMode != previousTestMode) {
            sendDiagnostic("native_initialize_test_mode_changed", mapM2, z10);
        } else {
            sendDiagnostic("native_initialize_test_mode_same", mapM2, z10);
        }
    }
}
