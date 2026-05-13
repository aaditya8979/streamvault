package com.inmobi.media.core.config.models;

import androidx.annotation.Keep;
import androidx.annotation.VisibleForTesting;
import bo.d0;
import cn.w;
import com.inmobi.media.Bi;
import com.inmobi.media.H6;
import com.inmobi.media.Se;
import com.inmobi.media.T9;
import com.inmobi.media.Ue;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;
import zn.i;

/* JADX INFO: loaded from: classes.dex */
@Keep
public final class RootConfig extends Config {

    @NotNull
    public static final Bi Companion = new Bi();
    public static final long DEFAULT_EXPIRY_IN_SEC = 86400;

    @NotNull
    public static final String DEFAULT_FALLBACK_URL = "https://config.inmobi.com/config-server/v1/config/secure.cfg";
    public static final int DEFAULT_MAX_RETRIES = 3;
    public static final int DEFAULT_RETRY_INTERVAL = 60;
    private boolean monetizationDisabled;
    private int maxRetries = 3;
    private int retryInterval = 60;

    @Ue
    @Nullable
    private GDPR gdpr = new GDPR();

    @NotNull
    private final List<ComponentConfig> components = w.m();

    @NotNull
    private final List<String> ipAddrTPSupport = w.m();

    @Keep
    public static final class ComponentConfig {

        @NotNull
        private String type = "";
        private long expiry = Long.MAX_VALUE;

        @NotNull
        private String url = "";

        public final long getExpiry() {
            return this.expiry;
        }

        @NotNull
        public final String getType() {
            return this.type;
        }

        @NotNull
        public final String getUrl() {
            return this.url;
        }

        public final boolean isValid() {
            return d0.s1(getType()).toString().length() != 0 && getExpiry() >= 0 && getExpiry() <= 86400 && !H6.a(this.url);
        }
    }

    @Keep
    public static final class GDPR {

        @Ue
        @Nullable
        private Boolean transmitRequest = Boolean.TRUE;

        @Nullable
        public final Boolean getTransmitRequest() {
            return this.transmitRequest;
        }

        public final boolean isValid() {
            return this.transmitRequest != null;
        }
    }

    public final long getExpiryInMillisForType(@NotNull String str) {
        p.k(str, "type");
        for (ComponentConfig componentConfig : this.components) {
            if (p.f(str, componentConfig.getType())) {
                long expiry = componentConfig.getExpiry();
                i iVar = Se.f26314a;
                return expiry * ((long) 1000);
            }
        }
        i iVar2 = Se.f26314a;
        return ((long) 1000) * 86400;
    }

    @NotNull
    public final List<String> getIPAddrTPSupport() {
        return this.ipAddrTPSupport;
    }

    public final int getMaxRetries() {
        return this.maxRetries;
    }

    public final int getRetryInterval() {
        return this.retryInterval;
    }

    @Override // com.inmobi.media.core.config.models.Config
    @NotNull
    public String getType() {
        return "root";
    }

    @NotNull
    public final String getUrlForType(@NotNull String str) {
        Object next;
        p.k(str, "type");
        Iterator<T> it = this.components.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (p.f(((ComponentConfig) next).getType(), str)) {
                break;
            }
        }
        ComponentConfig componentConfig = (ComponentConfig) next;
        String url = componentConfig != null ? componentConfig.getUrl() : null;
        return (url == null || url.length() == 0) ? DEFAULT_FALLBACK_URL : url;
    }

    public final boolean isMonetizationDisabled() {
        return this.monetizationDisabled;
    }

    @Override // com.inmobi.media.core.config.models.Config
    public boolean isValid() {
        if (this.maxRetries >= 0 && this.retryInterval >= 0) {
            Iterator<T> it = this.components.iterator();
            while (it.hasNext()) {
                if (!((ComponentConfig) it.next()).isValid()) {
                    return false;
                }
            }
            GDPR gdpr = this.gdpr;
            if (gdpr != null && gdpr.isValid()) {
                return true;
            }
        }
        return false;
    }

    @VisibleForTesting(otherwise = 2)
    public final void setIncludeIdParams(@NotNull T9 t92) {
        p.k(t92, "includeIds");
        setIncludeIds(t92);
    }

    @VisibleForTesting(otherwise = 2)
    public final void setMaxRetries(int i10) {
        this.maxRetries = i10;
    }

    @VisibleForTesting(otherwise = 2)
    public final void setRetryInterval(int i10) {
        this.retryInterval = i10;
    }

    public final boolean shouldTransmitRequest() {
        Boolean transmitRequest;
        GDPR gdpr = this.gdpr;
        if (gdpr != null) {
            gdpr.getTransmitRequest();
        }
        GDPR gdpr2 = this.gdpr;
        if (gdpr2 == null || (transmitRequest = gdpr2.getTransmitRequest()) == null) {
            return true;
        }
        return transmitRequest.booleanValue();
    }
}
