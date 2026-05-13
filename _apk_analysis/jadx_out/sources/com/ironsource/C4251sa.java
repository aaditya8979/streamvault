package com.ironsource;

import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.sa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C4251sa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private InterfaceC4218qa f33523a;

    public C4251sa(InterfaceC4218qa interfaceC4218qa) {
        this.f33523a = interfaceC4218qa;
    }

    public void a(C4234ra c4234ra, JSONObject jSONObject) {
        this.f33523a.a(false, c4234ra.a(), jSONObject);
    }

    public void b(C4234ra c4234ra, JSONObject jSONObject) {
        this.f33523a.a(true, c4234ra.d(), jSONObject);
    }
}
