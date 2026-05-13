package com.unity3d.ads.beta;

import android.content.Context;
import com.unity3d.services.core.log.DeviceLog;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.Map;
import kotlin.collections.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: InitializationConfiguration.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class InitializationConfiguration {

    @NotNull
    private final Context context;

    @NotNull
    private final Map<String, String> extras;

    @NotNull
    private final String gameID;
    private final boolean isTestModeEnabled;

    @NotNull
    private final DeviceLog.UnityAdsLogLevel logLevel;

    @Nullable
    private final MediationInfo mediationInfo;

    /* JADX INFO: compiled from: InitializationConfiguration.kt */
    public static final class Builder {

        @NotNull
        private final Context context;

        @NotNull
        private Map<String, String> extras;

        @NotNull
        private final String gameID;
        private final boolean isTestModeEnabled;

        @NotNull
        private DeviceLog.UnityAdsLogLevel logLevel;

        @Nullable
        private MediationInfo mediationInfo;

        public Builder(@NotNull Context context, @NotNull String str, boolean z10) {
            p.k(context, GAMConfig.KEY_CONTEXT);
            p.k(str, "gameID");
            this.context = context;
            this.gameID = str;
            this.isTestModeEnabled = z10;
            this.logLevel = DeviceLog.UnityAdsLogLevel.INFO;
            this.extras = a.j();
        }

        @NotNull
        public final InitializationConfiguration build() {
            return new InitializationConfiguration(this.context, this.gameID, this.isTestModeEnabled, this.logLevel, this.extras, this.mediationInfo);
        }

        @NotNull
        public final Builder withExtras(@NotNull Map<String, String> map) {
            p.k(map, "extras");
            this.extras = map;
            return this;
        }

        @NotNull
        public final Builder withLogLevel(@NotNull DeviceLog.UnityAdsLogLevel unityAdsLogLevel) {
            p.k(unityAdsLogLevel, "logLevel");
            this.logLevel = unityAdsLogLevel;
            return this;
        }

        @NotNull
        public final Builder withMediationInfo(@Nullable MediationInfo mediationInfo) {
            this.mediationInfo = mediationInfo;
            return this;
        }
    }

    public InitializationConfiguration(@NotNull Context context, @NotNull String str, boolean z10, @NotNull DeviceLog.UnityAdsLogLevel unityAdsLogLevel, @NotNull Map<String, String> map, @Nullable MediationInfo mediationInfo) {
        p.k(context, GAMConfig.KEY_CONTEXT);
        p.k(str, "gameID");
        p.k(unityAdsLogLevel, "logLevel");
        p.k(map, "extras");
        this.context = context;
        this.gameID = str;
        this.isTestModeEnabled = z10;
        this.logLevel = unityAdsLogLevel;
        this.extras = map;
        this.mediationInfo = mediationInfo;
    }

    public /* synthetic */ InitializationConfiguration(Context context, String str, boolean z10, DeviceLog.UnityAdsLogLevel unityAdsLogLevel, Map map, MediationInfo mediationInfo, int i10, i iVar) {
        this(context, str, z10, (i10 & 8) != 0 ? DeviceLog.UnityAdsLogLevel.INFO : unityAdsLogLevel, (i10 & 16) != 0 ? a.j() : map, (i10 & 32) != 0 ? null : mediationInfo);
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @NotNull
    public final Map<String, String> getExtras() {
        return this.extras;
    }

    @NotNull
    public final String getGameID() {
        return this.gameID;
    }

    @NotNull
    public final DeviceLog.UnityAdsLogLevel getLogLevel() {
        return this.logLevel;
    }

    @Nullable
    public final MediationInfo getMediationInfo() {
        return this.mediationInfo;
    }

    public final boolean isTestModeEnabled() {
        return this.isTestModeEnabled;
    }
}
