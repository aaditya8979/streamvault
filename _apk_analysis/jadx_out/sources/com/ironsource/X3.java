package com.ironsource;

import android.content.Context;
import com.ironsource.C3978d4;
import com.ironsource.sdk.service.Connectivity.BroadcastReceiverStrategy;
import com.ironsource.sdk.utils.Logger;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public abstract class X3 implements InterfaceC4316w7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private InterfaceC4299v7 f30663a;

    public X3(JSONObject jSONObject, Context context) {
        this.f30663a = a(jSONObject, context);
        Logger.i(X3.class.getSimpleName(), "created ConnectivityAdapter with strategy " + this.f30663a.getClass().getSimpleName());
    }

    private InterfaceC4299v7 a(JSONObject jSONObject, Context context) {
        if (jSONObject.optInt(C3978d4.j.f31390g0) != 1 && C1.c(context, "android.permission.ACCESS_NETWORK_STATE")) {
            return new C4076ic(this);
        }
        return new BroadcastReceiverStrategy(this);
    }

    public JSONObject a(Context context) {
        return this.f30663a.c(context);
    }

    @Override // com.ironsource.InterfaceC4316w7
    public void a() {
    }

    @Override // com.ironsource.InterfaceC4316w7
    public void a(String str, JSONObject jSONObject) {
    }

    public void b() {
        this.f30663a.a();
    }

    public void b(Context context) {
        this.f30663a.b(context);
    }

    @Override // com.ironsource.InterfaceC4316w7
    public void b(String str, JSONObject jSONObject) {
    }

    public void c(Context context) {
        this.f30663a.a(context);
    }
}
