package com.applovin.impl;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class n0 extends i5 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f9295g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.applovin.impl.sdk.network.a f9296h;

    public class a extends l6 {
        public a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar, boolean z10) {
            super(aVar, kVar, z10);
        }

        @Override // com.applovin.impl.l6, com.applovin.impl.q0.e
        public void a(String str, int i10, String str2, JSONObject jSONObject) {
            this.f8505a.t().a(n0.this.f9295g, n0.this.f9296h.f(), i10, jSONObject, str2, false);
        }

        @Override // com.applovin.impl.l6, com.applovin.impl.q0.e
        public void a(String str, JSONObject jSONObject, int i10) {
            this.f8505a.t().a(n0.this.f9295g, n0.this.f9296h.f(), i10, jSONObject, null, true);
        }
    }

    public n0(String str, com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar) {
        super("CommunicatorRequestTask", kVar, str);
        this.f9295g = str;
        this.f9296h = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f8505a.q0().a(new a(this.f9296h, this.f8505a, d()));
    }
}
