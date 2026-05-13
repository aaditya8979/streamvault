package com.ironsource;

import com.ironsource.environment.ContextProvider;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.g9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C4037g9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C4037g9 f31804a = new C4037g9();

    private C4037g9() {
    }

    @NotNull
    public static final JSONObject a() throws JSONException {
        new X9().b(ContextProvider.getInstance().getApplicationContext());
        String string = new C4019f9().a().toString();
        tn.p.j(string, "InitProvider().getInitData().toString()");
        Pe.c(string);
        JSONObject jSONObjectPut = IronSourceVideoBridge.jsonObjectInit().put("data", N9.e(C4196p5.b().c(), string));
        tn.p.j(jSONObjectPut, "encodedJsonInitResponse");
        return jSONObjectPut;
    }
}
