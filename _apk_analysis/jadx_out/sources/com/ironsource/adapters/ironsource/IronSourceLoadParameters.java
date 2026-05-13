package com.ironsource.adapters.ironsource;

import com.ironsource.mediationsdk.d;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import tn.i;
import tn.p;

/* JADX INFO: loaded from: classes5.dex */
public interface IronSourceLoadParameters {

    public static final class Base implements IronSourceLoadParameters {

        @NotNull
        private final JSONObject loadConfig;

        @Nullable
        private final String serverData;

        public Base(@NotNull JSONObject jSONObject, @Nullable String str) {
            p.k(jSONObject, "loadConfig");
            this.loadConfig = jSONObject;
            this.serverData = str;
        }

        public /* synthetic */ Base(JSONObject jSONObject, String str, int i10, i iVar) {
            this(jSONObject, (i10 & 2) != 0 ? null : str);
        }

        @Override // com.ironsource.adapters.ironsource.IronSourceLoadParameters
        @NotNull
        public JSONObject config() {
            return this.loadConfig;
        }

        @Override // com.ironsource.adapters.ironsource.IronSourceLoadParameters
        public boolean demandOnly() {
            return this.loadConfig.optBoolean(Constants.DEMAND_ONLY, false);
        }

        @Override // com.ironsource.adapters.ironsource.IronSourceLoadParameters
        @NotNull
        public HashMap<String, String> value() {
            HashMap<String, String> map = new HashMap<>();
            map.put("isOneFlow", String.valueOf(this.loadConfig.optBoolean("isOneFlow")));
            if (this.serverData != null) {
                String strA = d.b().a(this.serverData);
                p.j(strA, "getInstance().getAdmFromServerData(serverData)");
                map.put("adm", strA);
                map.putAll(d.b().b(this.serverData));
            }
            return map;
        }
    }

    public static final class Constants {

        @NotNull
        public static final String ADM_KEY = "adm";

        @NotNull
        public static final String DEMAND_ONLY = "demandOnly";

        @NotNull
        public static final Constants INSTANCE = new Constants();

        @NotNull
        public static final String ONE_FLOW_KEY = "isOneFlow";

        private Constants() {
        }
    }

    public static final class WithLog implements IronSourceLoadParameters {

        @NotNull
        private final IronSourceLoadParameters loadParameters;

        public WithLog(@NotNull IronSourceLoadParameters ironSourceLoadParameters) {
            p.k(ironSourceLoadParameters, "loadParameters");
            this.loadParameters = ironSourceLoadParameters;
        }

        @Override // com.ironsource.adapters.ironsource.IronSourceLoadParameters
        @NotNull
        public JSONObject config() {
            return this.loadParameters.config();
        }

        @Override // com.ironsource.adapters.ironsource.IronSourceLoadParameters
        public boolean demandOnly() {
            return this.loadParameters.demandOnly();
        }

        @Override // com.ironsource.adapters.ironsource.IronSourceLoadParameters
        @NotNull
        public HashMap<String, String> value() {
            HashMap<String, String> mapValue = this.loadParameters.value();
            if (!mapValue.isEmpty()) {
                IronLog.ADAPTER_API.verbose("instance extra params:");
                for (String str : mapValue.keySet()) {
                    IronLog.ADAPTER_API.verbose(str + "=" + ((Object) mapValue.get(str)));
                }
            }
            return mapValue;
        }
    }

    @NotNull
    JSONObject config();

    boolean demandOnly();

    @NotNull
    HashMap<String, String> value();
}
