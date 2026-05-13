package com.iab.omid.library.ironsrc.walking;

import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.ironsrc.walking.async.b;
import com.iab.omid.library.ironsrc.walking.async.d;
import com.iab.omid.library.ironsrc.walking.async.e;
import com.iab.omid.library.ironsrc.walking.async.f;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class b implements b.InterfaceC0350b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private JSONObject f24658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.ironsrc.walking.async.c f24659b;

    public b(com.iab.omid.library.ironsrc.walking.async.c cVar) {
        this.f24659b = cVar;
    }

    @Override // com.iab.omid.library.ironsrc.walking.async.b.InterfaceC0350b
    @VisibleForTesting
    public JSONObject a() {
        return this.f24658a;
    }

    @Override // com.iab.omid.library.ironsrc.walking.async.b.InterfaceC0350b
    @VisibleForTesting
    public void a(JSONObject jSONObject) {
        this.f24658a = jSONObject;
    }

    public void a(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f24659b.b(new e(this, hashSet, jSONObject, j10));
    }

    public void b() {
        this.f24659b.b(new d(this));
    }

    public void b(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f24659b.b(new f(this, hashSet, jSONObject, j10));
    }
}
