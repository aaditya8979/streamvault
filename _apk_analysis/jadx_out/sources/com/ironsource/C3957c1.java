package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.c1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C3957c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private NetworkSettings f31087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private JSONObject f31088b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private IronSource.a f31089c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f31090d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f31091e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f31092f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f31093g;

    public C3957c1(NetworkSettings networkSettings, JSONObject jSONObject, IronSource.a aVar) {
        this.f31087a = networkSettings;
        this.f31088b = jSONObject;
        int iOptInt = jSONObject.optInt("instanceType");
        this.f31092f = iOptInt;
        this.f31090d = iOptInt == 2;
        this.f31091e = jSONObject.optBoolean(IronSourceConstants.EARLY_INIT_FIELD);
        this.f31093g = jSONObject.optInt(Ne.f29925e2, 99);
        this.f31089c = aVar;
    }

    public String a() {
        return this.f31087a.getAdSourceNameForEvents();
    }

    public IronSource.a b() {
        return this.f31089c;
    }

    public JSONObject c() {
        return this.f31088b;
    }

    public int d() {
        return this.f31092f;
    }

    public int e() {
        return this.f31093g;
    }

    public String f() {
        return this.f31087a.getProviderName();
    }

    public String g() {
        return this.f31087a.getProviderTypeForReflection();
    }

    public NetworkSettings h() {
        return this.f31087a;
    }

    public String i() {
        return this.f31087a.getSubProviderId();
    }

    public boolean j() {
        return this.f31090d;
    }

    public boolean k() {
        return this.f31091e;
    }
}
