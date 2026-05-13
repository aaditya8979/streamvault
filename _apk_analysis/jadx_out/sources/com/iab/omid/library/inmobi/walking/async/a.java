package com.iab.omid.library.inmobi.walking.async;

import com.iab.omid.library.inmobi.walking.async.b;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public abstract class a extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashSet<String> f24514c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final JSONObject f24515d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f24516e;

    public a(b.InterfaceC0346b interfaceC0346b, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(interfaceC0346b);
        this.f24514c = new HashSet<>(hashSet);
        this.f24515d = jSONObject;
        this.f24516e = j10;
    }
}
