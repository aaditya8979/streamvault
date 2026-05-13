package com.iab.omid.library.vungle.walking.async;

import com.iab.omid.library.vungle.walking.async.b;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public abstract class a extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashSet<String> f25053c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final JSONObject f25054d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f25055e;

    public a(b.InterfaceC0363b interfaceC0363b, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(interfaceC0363b);
        this.f25053c = new HashSet<>(hashSet);
        this.f25054d = jSONObject;
        this.f25055e = j10;
    }
}
