package com.ironsource.adqualitysdk.sdk;

import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.i.aj;
import com.ironsource.adqualitysdk.sdk.i.k;
import com.ironsource.adqualitysdk.sdk.i.kc;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class ISAdQualityConfig {

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private final Map<String, String> f36;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private final ISAdQualityDeviceIdType f37;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private final boolean f38;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private final String f39;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private final boolean f40;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private final ISAdQualityLogLevel f41;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private final String f42;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private final Set<ISAdQualityInitListener> f43;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private final boolean f44;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private final boolean f45;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private final boolean f46;

    public static class Builder {

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private String f57 = null;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private boolean f53 = false;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private boolean f56 = false;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private boolean f54 = false;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private ISAdQualityLogLevel f55 = ISAdQualityLogLevel.INFO;

        /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
        private final Set<ISAdQualityInitListener> f51 = new HashSet();

        /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
        private String f49 = null;

        /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
        private boolean f52 = false;

        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
        private boolean f50 = false;

        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
        private ISAdQualityDeviceIdType f48 = ISAdQualityDeviceIdType.NONE;

        /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
        private final Map<String, String> f47 = new HashMap();

        public Builder addAdQualityInitListener(ISAdQualityInitListener iSAdQualityInitListener) {
            this.f51.add(iSAdQualityInitListener);
            return this;
        }

        public ISAdQualityConfig build() {
            return new ISAdQualityConfig(this.f57, this.f53, this.f56, this.f54, this.f55, this.f51, this.f49, this.f52, this.f50, this.f48, this.f47, (byte) 0);
        }

        public Builder removeAdQualityInitListener(ISAdQualityInitListener iSAdQualityInitListener) {
            this.f51.remove(iSAdQualityInitListener);
            return this;
        }

        @Deprecated
        public Builder setAdQualityInitListener(ISAdQualityInitListener iSAdQualityInitListener) {
            return addAdQualityInitListener(iSAdQualityInitListener);
        }

        public Builder setCoppa(boolean z10) {
            this.f52 = z10;
            this.f50 = true;
            return this;
        }

        public Builder setDeviceIdType(ISAdQualityDeviceIdType iSAdQualityDeviceIdType) {
            this.f48 = iSAdQualityDeviceIdType;
            return this;
        }

        public Builder setInitializationSource(String str) {
            if (kc.m6938(str, 20)) {
                this.f49 = str;
            } else {
                StringBuilder sb2 = new StringBuilder("setInitializationSource( ");
                sb2.append(str);
                sb2.append(" ) init source must have length of 1-20");
                k.m6890("ISAdQualityConfig", sb2.toString());
            }
            return this;
        }

        public Builder setLogLevel(ISAdQualityLogLevel iSAdQualityLogLevel) {
            this.f55 = iSAdQualityLogLevel;
            return this;
        }

        public Builder setMetaData(String str, String str2) {
            if (TextUtils.isEmpty(str2)) {
                return this;
            }
            if (!aj.m4498(str)) {
                if (aj.m4501(this.f47, str)) {
                    StringBuilder sb2 = new StringBuilder("setMetaData( ");
                    sb2.append(str);
                    sb2.append(" , ");
                    sb2.append(str2);
                    sb2.append(" ) limited to 5 meta data values. Ignoring meta data value.");
                    k.m6890("ISAdQualityConfig", sb2.toString());
                    return this;
                }
                if (!aj.m4499(str, str2)) {
                    StringBuilder sb3 = new StringBuilder("setMetaData( ");
                    sb3.append(str);
                    sb3.append(" , ");
                    sb3.append(str2);
                    sb3.append(" ) the length of both the key and the value should be between 1 and 64");
                    sb3.append(" characters.");
                    k.m6890("ISAdQualityConfig", sb3.toString());
                    return this;
                }
            }
            this.f47.put(str, str2);
            return this;
        }

        public Builder setMetaData(JSONObject jSONObject) {
            if (jSONObject != null) {
                for (int i10 = 0; i10 < jSONObject.names().length(); i10++) {
                    try {
                        String string = jSONObject.names().getString(i10);
                        Object objOpt = jSONObject.opt(string);
                        if (objOpt instanceof String) {
                            setMetaData(string, (String) objOpt);
                        } else {
                            StringBuilder sb2 = new StringBuilder("setMetaData( ");
                            sb2.append(string);
                            sb2.append(" , ");
                            sb2.append(objOpt);
                            sb2.append(" ) value must be a string");
                            k.m6890("ISAdQualityConfig", sb2.toString());
                        }
                    } catch (Exception unused) {
                    }
                }
            }
            return this;
        }

        public Builder setTestMode(boolean z10) {
            this.f56 = z10;
            this.f54 = true;
            return this;
        }

        public Builder setUserId(String str) {
            this.f57 = str;
            this.f53 = true;
            return this;
        }
    }

    private ISAdQualityConfig(String str, boolean z10, boolean z11, boolean z12, ISAdQualityLogLevel iSAdQualityLogLevel, Set<ISAdQualityInitListener> set, String str2, boolean z13, boolean z14, ISAdQualityDeviceIdType iSAdQualityDeviceIdType, Map<String, String> map) {
        this.f42 = str;
        this.f44 = z10;
        this.f46 = z11;
        this.f45 = z12;
        this.f41 = iSAdQualityLogLevel;
        this.f43 = set;
        this.f39 = str2;
        this.f38 = z13;
        this.f40 = z14;
        this.f37 = iSAdQualityDeviceIdType;
        this.f36 = map;
    }

    public /* synthetic */ ISAdQualityConfig(String str, boolean z10, boolean z11, boolean z12, ISAdQualityLogLevel iSAdQualityLogLevel, Set set, String str2, boolean z13, boolean z14, ISAdQualityDeviceIdType iSAdQualityDeviceIdType, Map map, byte b10) {
        this(str, z10, z11, z12, iSAdQualityLogLevel, set, str2, z13, z14, iSAdQualityDeviceIdType, map);
    }

    public static ISAdQualityConfig merge(ISAdQualityConfig iSAdQualityConfig, ISAdQualityConfig iSAdQualityConfig2) {
        Builder builder = new Builder();
        if (iSAdQualityConfig.f44) {
            builder.setUserId(iSAdQualityConfig.f42);
        } else if (iSAdQualityConfig2.f44) {
            builder.setUserId(iSAdQualityConfig2.f42);
        }
        if (iSAdQualityConfig.f45) {
            builder.setTestMode(iSAdQualityConfig.f46);
        } else if (iSAdQualityConfig2.f45) {
            builder.setTestMode(iSAdQualityConfig2.f46);
        }
        if (iSAdQualityConfig.f40) {
            builder.setCoppa(iSAdQualityConfig.f38);
        } else if (iSAdQualityConfig2.f40) {
            builder.setCoppa(iSAdQualityConfig2.f38);
        }
        ISAdQualityLogLevel iSAdQualityLogLevel = iSAdQualityConfig.f41;
        if (iSAdQualityLogLevel == null) {
            iSAdQualityLogLevel = iSAdQualityConfig2.f41;
        }
        builder.setLogLevel(iSAdQualityLogLevel);
        Iterator<ISAdQualityInitListener> it = iSAdQualityConfig.f43.iterator();
        while (it.hasNext()) {
            builder.addAdQualityInitListener(it.next());
        }
        Iterator<ISAdQualityInitListener> it2 = iSAdQualityConfig2.f43.iterator();
        while (it2.hasNext()) {
            builder.addAdQualityInitListener(it2.next());
        }
        String str = iSAdQualityConfig.f39;
        if (str != null) {
            builder.setInitializationSource(str);
        } else {
            String str2 = iSAdQualityConfig2.f39;
            if (str2 != null) {
                builder.setInitializationSource(str2);
            }
        }
        ISAdQualityDeviceIdType iSAdQualityDeviceIdType = iSAdQualityConfig.f37;
        if (iSAdQualityDeviceIdType == null) {
            iSAdQualityDeviceIdType = iSAdQualityConfig2.f37;
        }
        builder.setDeviceIdType(iSAdQualityDeviceIdType);
        HashMap map = new HashMap(iSAdQualityConfig2.f36);
        map.putAll(iSAdQualityConfig.f36);
        for (Map.Entry entry : map.entrySet()) {
            builder.setMetaData((String) entry.getKey(), (String) entry.getValue());
        }
        return builder.build();
    }

    public Set<ISAdQualityInitListener> getAdQualityInitListeners() {
        return this.f43;
    }

    public boolean getCoppa() {
        return this.f38;
    }

    public ISAdQualityDeviceIdType getDeviceIdType() {
        return this.f37;
    }

    public String getInitializationSource() {
        return this.f39;
    }

    public ISAdQualityLogLevel getLogLevel() {
        return this.f41;
    }

    public Map<String, String> getMetaData() {
        return this.f36;
    }

    public String getUserId() {
        return this.f42;
    }

    public boolean isTestMode() {
        return this.f46;
    }

    public boolean isUserIdSet() {
        return this.f44;
    }
}
