package com.ironsource;

import com.safedk.android.internal.partials.IronSourceVideoBridge;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public interface W {

    public static final class a implements W {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final JSONObject f30607a;

        public a(@NotNull JSONObject jSONObject) {
            tn.p.k(jSONObject, "applicationConfig");
            this.f30607a = jSONObject;
        }

        @Override // com.ironsource.W
        @NotNull
        public JSONObject a() {
            JSONObject jSONObjectOptJSONObject = this.f30607a.optJSONObject("controllerConfig");
            return jSONObjectOptJSONObject == null ? IronSourceVideoBridge.jsonObjectInit() : jSONObjectOptJSONObject;
        }

        @Override // com.ironsource.W
        public int b() {
            int iOptInt = this.f30607a.optInt("debugMode", 0);
            if (this.f30607a.optBoolean(b.f30612e, false)) {
                return 3;
            }
            return iOptInt;
        }

        @Override // com.ironsource.W
        @NotNull
        public String c() {
            String strOptString = this.f30607a.optString("controllerUrl");
            return strOptString == null ? "" : strOptString;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f30608a = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final String f30609b = "controllerUrl";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public static final String f30610c = "controllerConfig";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public static final String f30611d = "debugMode";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public static final String f30612e = "adptDebugMode";

        private b() {
        }
    }

    @NotNull
    JSONObject a();

    int b();

    @NotNull
    String c();
}
