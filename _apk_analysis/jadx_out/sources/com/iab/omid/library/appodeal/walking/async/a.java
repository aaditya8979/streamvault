package com.iab.omid.library.appodeal.walking.async;

import com.iab.omid.library.appodeal.walking.async.b;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashSet<String> f23987c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final JSONObject f23988d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f23989e;

    public a(b.InterfaceC0330b interfaceC0330b, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(interfaceC0330b);
        this.f23987c = new HashSet<>(hashSet);
        this.f23988d = jSONObject;
        this.f23989e = j10;
    }
}
