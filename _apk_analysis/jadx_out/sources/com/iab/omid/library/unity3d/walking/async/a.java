package com.iab.omid.library.unity3d.walking.async;

import com.iab.omid.library.unity3d.walking.async.b;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public abstract class a extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashSet<String> f24912c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final JSONObject f24913d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f24914e;

    public a(b.InterfaceC0358b interfaceC0358b, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(interfaceC0358b);
        this.f24912c = new HashSet<>(hashSet);
        this.f24913d = jSONObject;
        this.f24914e = j10;
    }
}
