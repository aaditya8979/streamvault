package com.iab.omid.library.bigosg.walking.a;

import com.iab.omid.library.bigosg.walking.a.b;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashSet<String> f24108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JSONObject f24109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f24110c;

    public a(b.InterfaceC0333b interfaceC0333b, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(interfaceC0333b);
        this.f24108a = new HashSet<>(hashSet);
        this.f24109b = jSONObject;
        this.f24110c = j10;
    }
}
