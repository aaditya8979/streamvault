package com.ironsource.mediationsdk;

import android.content.Context;
import com.ironsource.C4066i2;
import com.ironsource.C4193p2;
import com.ironsource.S1;
import com.ironsource.mediationsdk.e;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.net.URL;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final C4193p2 f32600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f32601b;

    public f(@NotNull C4193p2 c4193p2, @NotNull String str) {
        tn.p.k(c4193p2, "settings");
        tn.p.k(str, JsonStorageKeyNames.SESSION_ID_KEY);
        this.f32600a = c4193p2;
        this.f32601b = str;
    }

    private final JSONObject a(Context context, i iVar) throws JSONException {
        JSONObject jSONObjectA = d.b().a(iVar);
        tn.p.j(jSONObjectA, "getInstance().enrichToke…low(auctionRequestParams)");
        return jSONObjectA;
    }

    @Override // com.ironsource.mediationsdk.g
    @NotNull
    public e.a a(@NotNull Context context, @NotNull i iVar, @NotNull S1 s12) throws JSONException {
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        tn.p.k(iVar, "auctionRequestParams");
        tn.p.k(s12, "auctionListener");
        JSONObject jSONObjectA = a(context, iVar);
        String strA = this.f32600a.a(iVar.s());
        return iVar.s() ? new C4066i2(s12, new URL(strA), jSONObjectA, iVar.t(), this.f32600a) : new e.a(s12, new URL(strA), jSONObjectA, iVar.t(), this.f32600a);
    }

    @Override // com.ironsource.mediationsdk.g
    public boolean a() {
        return this.f32600a.n();
    }

    @Override // com.ironsource.mediationsdk.g
    public boolean b() {
        return this.f32600a.g() > 0;
    }
}
