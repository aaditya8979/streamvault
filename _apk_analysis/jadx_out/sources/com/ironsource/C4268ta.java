package com.ironsource;

import com.safedk.android.internal.partials.IronSourceVideoBridge;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.ta, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C4268ta implements Me<JSONObject> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Me<String> f34103a;

    public C4268ta(@NotNull Me<String> me2) {
        tn.p.k(me2, "serverResponse");
        this.f34103a = me2;
    }

    @Override // com.ironsource.Me
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject a() {
        return IronSourceVideoBridge.jsonObjectInit(this.f34103a.a());
    }
}
