package com.iab.omid.library.ironsrc.walking.async;

import com.iab.omid.library.ironsrc.walking.async.b;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public abstract class a extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashSet<String> f24649c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final JSONObject f24650d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f24651e;

    public a(b.InterfaceC0350b interfaceC0350b, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(interfaceC0350b);
        this.f24649c = new HashSet<>(hashSet);
        this.f24650d = jSONObject;
        this.f24651e = j10;
    }
}
