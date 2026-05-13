package com.iab.omid.library.applovin.walking.async;

import com.iab.omid.library.applovin.walking.async.b;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashSet<String> f23852c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final JSONObject f23853d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f23854e;

    public a(b.InterfaceC0326b interfaceC0326b, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(interfaceC0326b);
        this.f23852c = new HashSet<>(hashSet);
        this.f23853d = jSONObject;
        this.f23854e = j10;
    }
}
