package com.iab.omid.library.mmadbridge.walking;

import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.mmadbridge.walking.async.b;
import com.iab.omid.library.mmadbridge.walking.async.d;
import com.iab.omid.library.mmadbridge.walking.async.e;
import com.iab.omid.library.mmadbridge.walking.async.f;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class b implements b.InterfaceC0354b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private JSONObject f24793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.mmadbridge.walking.async.c f24794b;

    public b(com.iab.omid.library.mmadbridge.walking.async.c cVar) {
        this.f24794b = cVar;
    }

    @Override // com.iab.omid.library.mmadbridge.walking.async.b.InterfaceC0354b
    @VisibleForTesting
    public JSONObject a() {
        return this.f24793a;
    }

    @Override // com.iab.omid.library.mmadbridge.walking.async.b.InterfaceC0354b
    @VisibleForTesting
    public void a(JSONObject jSONObject) {
        this.f24793a = jSONObject;
    }

    public void a(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f24794b.b(new e(this, hashSet, jSONObject, j10));
    }

    public void b() {
        this.f24794b.b(new d(this));
    }

    public void b(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f24794b.b(new f(this, hashSet, jSONObject, j10));
    }
}
