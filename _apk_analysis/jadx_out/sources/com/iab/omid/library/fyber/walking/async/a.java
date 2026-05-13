package com.iab.omid.library.fyber.walking.async;

import com.iab.omid.library.fyber.walking.async.b;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public abstract class a extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashSet<String> f24373c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final JSONObject f24374d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f24375e;

    public a(b.InterfaceC0341b interfaceC0341b, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(interfaceC0341b);
        this.f24373c = new HashSet<>(hashSet);
        this.f24374d = jSONObject;
        this.f24375e = j10;
    }
}
