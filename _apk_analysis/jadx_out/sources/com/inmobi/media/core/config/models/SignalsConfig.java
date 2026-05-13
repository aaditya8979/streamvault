package com.inmobi.media.core.config.models;

import android.webkit.URLUtil;
import androidx.annotation.Keep;
import androidx.annotation.VisibleForTesting;
import cn.w;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import tn.p;

/* JADX INFO: loaded from: classes8.dex */
@Keep
public final class SignalsConfig extends Config {

    @Nullable
    private JSONObject ext;

    @NotNull
    private IceConfig ice = new IceConfig();

    @NotNull
    private UnifiedIdServiceConfig unifiedIdServiceConfig = new UnifiedIdServiceConfig();

    @NotNull
    private NovatiqConfig novatiqConfig = new NovatiqConfig();

    @NotNull
    private SessionConfig session = new SessionConfig();

    @NotNull
    private PublisherConfig publisher = new PublisherConfig();

    @NotNull
    private String kA = "wWFMAWbSEtvl5VxZbQGMK7";
    private int vAK = 1;
    private int lowMemoryFreq = 300;

    @NotNull
    private BootTimeConfig bts = new BootTimeConfig();

    @NotNull
    private Purchases purchases = new Purchases();

    @Keep
    public static final class BootTimeConfig {
        private final boolean enabled;
        private final int maxEntries = 3;
        private final int threshold = 120;

        public final boolean getEnabled() {
            return this.enabled;
        }

        public final int getMaxEntries() {
            return this.maxEntries;
        }

        public final int getThreshold() {
            return this.threshold;
        }
    }

    @Keep
    public static final class CellIceConfig {
        private boolean cce;
        private int cof;
        private boolean vce;

        public final boolean getCce() {
            return this.cce;
        }

        public final int getCof() {
            return this.cof;
        }

        public final boolean getVce() {
            return this.vce;
        }

        public final void setCce(boolean z10) {
            this.cce = z10;
        }

        public final void setCof(int i10) {
            this.cof = i10;
        }

        public final void setVce(boolean z10) {
            this.vce = z10;
        }
    }

    @Keep
    public static final class IceConfig {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private CellIceConfig f27004c = new CellIceConfig();
        private boolean locationEnabled;
        private boolean sessionEnabled;

        public final int getCellOperatorFlag() {
            return this.f27004c.getCof();
        }

        public final boolean isConnectedCellTowerEnabled() {
            return this.f27004c.getCce();
        }

        public final boolean isLocationEnabled() {
            return this.locationEnabled;
        }

        public final boolean isSessionEnabled() {
            return this.sessionEnabled;
        }

        public final boolean isValid() {
            return getCellOperatorFlag() >= 0;
        }

        public final boolean isVisibleCellTowerEnabled() {
            return this.f27004c.getVce();
        }
    }

    @Keep
    public static final class NovatiqConfig {
        private boolean isNovatiqEnabled = true;

        @NotNull
        private List<String> carrierNames = w.m();

        @NotNull
        private String beaconUrl = "https://spadsync.com/sync";

        @NotNull
        public final String getBeaconUrl() {
            return this.beaconUrl;
        }

        @NotNull
        public final List<String> getCarrierNames() {
            return this.carrierNames;
        }

        public final boolean isNovatiqEnabled() {
            return this.isNovatiqEnabled;
        }

        @VisibleForTesting(otherwise = 2)
        public final void setBeaconUrl(@NotNull String str) {
            p.k(str, "<set-?>");
            this.beaconUrl = str;
        }

        @VisibleForTesting(otherwise = 2)
        public final void setCarrierNames(@NotNull List<String> list) {
            p.k(list, "<set-?>");
            this.carrierNames = list;
        }

        @VisibleForTesting(otherwise = 2)
        public final void setNovatiqEnabled(boolean z10) {
            this.isNovatiqEnabled = z10;
        }
    }

    @Keep
    public static final class PublisherConfig {
        private final boolean enableAB;
        private final boolean enableMCO;

        @NotNull
        private final Map<String, String> generalKeys = new LinkedHashMap();

        @NotNull
        private final Map<String, String> adSpecificKeys = new LinkedHashMap();
        private final int payloadSize = 6000;

        @NotNull
        private final AutoInputData auto = new AutoInputData();

        @NotNull
        private final ObjInputData obj = new ObjInputData();

        @NotNull
        private final DirectInputData direct = new DirectInputData();

        @Keep
        public static final class AutoInputData extends BaseInputData {

            @NotNull
            private final Map<String, KeyData> allowedKeys = new LinkedHashMap();

            @NotNull
            private final List<String> incompatibleSdkVer = w.m();

            @NotNull
            private final String topic = "";

            @NotNull
            public final Map<String, KeyData> getAllowedKeys() {
                return this.allowedKeys;
            }

            @NotNull
            public final List<String> getIncompatibleSdkVer() {
                return this.incompatibleSdkVer;
            }

            @NotNull
            public final String getTopic() {
                return this.topic;
            }
        }

        @Keep
        public static class BaseInputData {
            private final boolean enabled;
            private final int expiry = 604800;
            private final int count = 5;
            private final int precision = 6;
            private final int strLen = 3;

            @NotNull
            private final DepthData depth = new DepthData();

            public final int getCount() {
                return this.count;
            }

            @NotNull
            public final DepthData getDepth() {
                return this.depth;
            }

            public final boolean getEnabled() {
                return this.enabled;
            }

            public final int getExpiry() {
                return this.expiry;
            }

            public final int getPrecision() {
                return this.precision;
            }

            public final int getStrLen() {
                return this.strLen;
            }
        }

        @Keep
        public static final class DepthData {
            private final boolean enabled;

            public final boolean getEnabled() {
                return this.enabled;
            }
        }

        @Keep
        public static final class DirectInputData extends BaseInputData {

            @NotNull
            private final Map<String, String> allowedKeys = new LinkedHashMap();

            @NotNull
            public final Map<String, String> getAllowedKeys() {
                return this.allowedKeys;
            }
        }

        @Keep
        public static final class KeyData {

            @NotNull
            private final String name = "";

            @NotNull
            private final String type = "";

            @NotNull
            public final String getName() {
                return this.name;
            }

            @NotNull
            public final String getType() {
                return this.type;
            }
        }

        @Keep
        public static final class ObjInputData extends BaseInputData {

            @NotNull
            private final Map<String, KeyData> allowedKeysAnd = new LinkedHashMap();

            @NotNull
            public final Map<String, KeyData> getAllowedKeysAnd() {
                return this.allowedKeysAnd;
            }
        }

        @NotNull
        public final Map<String, String> getAdSpecificKeys() {
            return this.adSpecificKeys;
        }

        @NotNull
        public final AutoInputData getAuto() {
            return this.auto;
        }

        @NotNull
        public final DirectInputData getDirect() {
            return this.direct;
        }

        public final boolean getEnableAB() {
            return this.enableAB;
        }

        public final boolean getEnableMCO() {
            return this.enableMCO;
        }

        @NotNull
        public final Map<String, String> getGeneralKeys() {
            return this.generalKeys;
        }

        @NotNull
        public final ObjInputData getObj() {
            return this.obj;
        }

        public final int getPayloadSize() {
            return this.payloadSize;
        }
    }

    @Keep
    public static final class Purchases {
        private boolean inapp;

        @NotNull
        private List<String> versionList = w.p("7.0.0", "7.1.0", "7.1.1");

        public final boolean getInapp() {
            return this.inapp;
        }

        @NotNull
        public final List<String> getVersionList() {
            return this.versionList;
        }

        public final void setInapp(boolean z10) {
            this.inapp = z10;
        }

        public final void setVersionList(@NotNull List<String> list) {
            p.k(list, "<set-?>");
            this.versionList = list;
        }
    }

    @Keep
    public static final class SessionConfig {

        @NotNull
        private List<Integer> control = w.p(0, 1, 2, 3, 4, 5, 6);

        @NotNull
        public final List<Integer> getSigControlList() {
            return this.control;
        }
    }

    @Keep
    public static final class UnifiedIdServiceConfig {
        private boolean enabled;
        private int maxRetries;
        private int retryInterval;

        @NotNull
        private String url = "https://unif-id.ssp.inmobi.com/fetch";
        private int timeout = 10;

        public final int getMaxRetries() {
            return this.maxRetries;
        }

        public final int getRetryInterval() {
            return this.retryInterval;
        }

        public final int getTimeout() {
            return this.timeout;
        }

        @NotNull
        public final String getUrl() {
            return this.url;
        }

        public final boolean isEnabled() {
            return this.enabled;
        }

        public final boolean isValid() {
            return URLUtil.isValidUrl(this.url) && this.maxRetries >= 0 && this.timeout >= 0 && this.retryInterval >= 0;
        }

        public final void setMaxRetries(int i10) {
            this.maxRetries = i10;
        }

        public final void setRetryInterval(int i10) {
            this.retryInterval = i10;
        }

        public final void setTimeout(int i10) {
            this.timeout = i10;
        }

        public final void setUrl(@NotNull String str) {
            p.k(str, "<set-?>");
            this.url = str;
        }
    }

    @NotNull
    public final String getAK() {
        return this.kA;
    }

    public final int getAKV() {
        return this.vAK;
    }

    @NotNull
    public final BootTimeConfig getBts() {
        return this.bts;
    }

    @Nullable
    public final JSONObject getExt() {
        return this.ext;
    }

    @NotNull
    public final IceConfig getIceConfig() {
        return this.ice;
    }

    public final int getLowMemoryFreq() {
        return this.lowMemoryFreq;
    }

    @NotNull
    public final NovatiqConfig getNovatiqConfig() {
        return this.novatiqConfig;
    }

    @NotNull
    public final PublisherConfig getPublisherConfig() {
        return this.publisher;
    }

    @NotNull
    public final Purchases getPurchases() {
        return this.purchases;
    }

    @NotNull
    public final SessionConfig getSessionConfig() {
        return this.session;
    }

    @Override // com.inmobi.media.core.config.models.Config
    @NotNull
    public String getType() {
        return "signals";
    }

    @NotNull
    public final UnifiedIdServiceConfig getUnifiedIdServiceConfig() {
        return this.unifiedIdServiceConfig;
    }

    @Override // com.inmobi.media.core.config.models.Config
    public boolean isValid() {
        return this.ice.isValid() && this.unifiedIdServiceConfig.isValid();
    }

    public final void setBts(@NotNull BootTimeConfig bootTimeConfig) {
        p.k(bootTimeConfig, "<set-?>");
        this.bts = bootTimeConfig;
    }

    public final void setLowMemoryFreq(int i10) {
        this.lowMemoryFreq = i10;
    }

    public final void setPurchases(@NotNull Purchases purchases) {
        p.k(purchases, "<set-?>");
        this.purchases = purchases;
    }
}
