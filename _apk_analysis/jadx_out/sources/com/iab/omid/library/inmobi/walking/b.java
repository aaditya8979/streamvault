package com.iab.omid.library.inmobi.walking;

import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.inmobi.walking.async.b;
import com.iab.omid.library.inmobi.walking.async.d;
import com.iab.omid.library.inmobi.walking.async.e;
import com.iab.omid.library.inmobi.walking.async.f;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class b implements b.InterfaceC0346b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private JSONObject f24523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.inmobi.walking.async.c f24524b;

    public b(com.iab.omid.library.inmobi.walking.async.c cVar) {
        this.f24524b = cVar;
    }

    @Override // com.iab.omid.library.inmobi.walking.async.b.InterfaceC0346b
    @VisibleForTesting
    public JSONObject a() {
        return this.f24523a;
    }

    @Override // com.iab.omid.library.inmobi.walking.async.b.InterfaceC0346b
    @VisibleForTesting
    public void a(JSONObject jSONObject) {
        this.f24523a = jSONObject;
    }

    public void a(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f24524b.b(new e(this, hashSet, jSONObject, j10));
    }

    public void b() {
        this.f24524b.b(new d(this));
    }

    public void b(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f24524b.b(new f(this, hashSet, jSONObject, j10));
    }
}
