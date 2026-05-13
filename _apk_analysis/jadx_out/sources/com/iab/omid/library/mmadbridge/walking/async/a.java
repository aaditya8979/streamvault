package com.iab.omid.library.mmadbridge.walking.async;

import com.iab.omid.library.mmadbridge.walking.async.b;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public abstract class a extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashSet<String> f24784c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final JSONObject f24785d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f24786e;

    public a(b.InterfaceC0354b interfaceC0354b, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(interfaceC0354b);
        this.f24784c = new HashSet<>(hashSet);
        this.f24785d = jSONObject;
        this.f24786e = j10;
    }
}
