package com.iab.omid.library.vungle.walking;

import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.vungle.walking.async.b;
import com.iab.omid.library.vungle.walking.async.d;
import com.iab.omid.library.vungle.walking.async.e;
import com.iab.omid.library.vungle.walking.async.f;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class b implements b.InterfaceC0363b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private JSONObject f25062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.vungle.walking.async.c f25063b;

    public b(com.iab.omid.library.vungle.walking.async.c cVar) {
        this.f25063b = cVar;
    }

    @Override // com.iab.omid.library.vungle.walking.async.b.InterfaceC0363b
    @VisibleForTesting
    public JSONObject a() {
        return this.f25062a;
    }

    @Override // com.iab.omid.library.vungle.walking.async.b.InterfaceC0363b
    @VisibleForTesting
    public void a(JSONObject jSONObject) {
        this.f25062a = jSONObject;
    }

    public void a(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f25063b.b(new e(this, hashSet, jSONObject, j10));
    }

    public void b() {
        this.f25063b.b(new d(this));
    }

    public void b(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f25063b.b(new f(this, hashSet, jSONObject, j10));
    }
}
