package com.iab.omid.library.bytedance2.walking.async;

import com.iab.omid.library.bytedance2.walking.async.b;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashSet<String> f24237c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final JSONObject f24238d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f24239e;

    public a(b.InterfaceC0337b interfaceC0337b, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(interfaceC0337b);
        this.f24237c = new HashSet<>(hashSet);
        this.f24238d = jSONObject;
        this.f24239e = j10;
    }
}
