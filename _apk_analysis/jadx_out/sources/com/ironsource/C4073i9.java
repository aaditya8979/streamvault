package com.ironsource;

import android.content.Context;
import com.ironsource.Ne;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.i9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C4073i9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f31948a = new a(null);

    /* JADX INFO: renamed from: com.ironsource.i9$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        private final JSONObject a(Context context) {
            try {
                return IronSourceVideoBridge.jsonObjectInit(IronSourceUtils.e(context));
            } catch (JSONException unused) {
                return IronSourceVideoBridge.jsonObjectInit();
            }
        }

        public final boolean b(@NotNull Context context) {
            tn.p.k(context, GAMConfig.KEY_CONTEXT);
            E3 e3D = d(context);
            return e3D.d().length() > 0 && e3D.e().length() > 0;
        }

        @Nullable
        public final Ne c(@NotNull Context context) {
            tn.p.k(context, GAMConfig.KEY_CONTEXT);
            E3 e3D = d(context);
            if (e3D.d().length() <= 0 || e3D.e().length() <= 0) {
                e3D = null;
            }
            if (e3D == null) {
                return null;
            }
            Ne ne2 = new Ne(context, e3D.d(), e3D.f(), e3D.e());
            ne2.a(Ne.a.CACHE);
            return ne2;
        }

        @NotNull
        public final E3 d(@NotNull Context context) {
            tn.p.k(context, GAMConfig.KEY_CONTEXT);
            JSONObject jSONObjectA = a(context);
            String strOptString = jSONObjectA.optString("appKey");
            String strOptString2 = jSONObjectA.optString("userId");
            String strOptString3 = jSONObjectA.optString("response");
            tn.p.j(strOptString, "cachedAppKey");
            tn.p.j(strOptString2, "cachedUserId");
            tn.p.j(strOptString3, "cachedSettings");
            return new E3(strOptString, strOptString2, strOptString3);
        }
    }

    public static final boolean a(@NotNull Context context) {
        return f31948a.b(context);
    }

    @Nullable
    public static final Ne b(@NotNull Context context) {
        return f31948a.c(context);
    }

    @NotNull
    public static final E3 c(@NotNull Context context) {
        return f31948a.d(context);
    }
}
