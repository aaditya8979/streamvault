package com.ironsource;

import com.ironsource.mediationsdk.demandOnly.p;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public interface V1 {

    public static final class a implements V1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        private final JSONObject f30579a;

        /* JADX WARN: Multi-variable type inference failed */
        public a() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public a(@Nullable JSONObject jSONObject) {
            this.f30579a = jSONObject;
        }

        public /* synthetic */ a(JSONObject jSONObject, int i10, tn.i iVar) {
            this((i10 & 1) != 0 ? IronSourceVideoBridge.jsonObjectInit() : jSONObject);
        }

        @Override // com.ironsource.V1
        @NotNull
        public com.ironsource.mediationsdk.demandOnly.p a(@NotNull String str) {
            tn.p.k(str, "instanceId");
            JSONObject jSONObject = this.f30579a;
            JSONObject jSONObjectOptJSONObject = jSONObject != null ? jSONObject.optJSONObject(str) : null;
            String strOptString = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optString("plumbus") : null;
            return strOptString != null ? new p.a(strOptString) : new p.b();
        }
    }

    @NotNull
    com.ironsource.mediationsdk.demandOnly.p a(@NotNull String str);
}
