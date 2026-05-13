package com.iab.omid.library.fyber.walking;

import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.fyber.walking.async.b;
import com.iab.omid.library.fyber.walking.async.d;
import com.iab.omid.library.fyber.walking.async.e;
import com.iab.omid.library.fyber.walking.async.f;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class b implements b.InterfaceC0341b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private JSONObject f24382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.fyber.walking.async.c f24383b;

    public b(com.iab.omid.library.fyber.walking.async.c cVar) {
        this.f24383b = cVar;
    }

    @Override // com.iab.omid.library.fyber.walking.async.b.InterfaceC0341b
    @VisibleForTesting
    public JSONObject a() {
        return this.f24382a;
    }

    @Override // com.iab.omid.library.fyber.walking.async.b.InterfaceC0341b
    @VisibleForTesting
    public void a(JSONObject jSONObject) {
        this.f24382a = jSONObject;
    }

    public void a(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f24383b.b(new e(this, hashSet, jSONObject, j10));
    }

    public void b() {
        this.f24383b.b(new d(this));
    }

    public void b(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f24383b.b(new f(this, hashSet, jSONObject, j10));
    }
}
