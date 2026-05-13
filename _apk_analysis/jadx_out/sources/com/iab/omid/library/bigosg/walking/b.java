package com.iab.omid.library.bigosg.walking;

import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.bigosg.walking.a.b;
import com.iab.omid.library.bigosg.walking.a.d;
import com.iab.omid.library.bigosg.walking.a.e;
import com.iab.omid.library.bigosg.walking.a.f;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class b implements b.InterfaceC0333b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private JSONObject f24117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.bigosg.walking.a.c f24118b;

    public b(com.iab.omid.library.bigosg.walking.a.c cVar) {
        this.f24118b = cVar;
    }

    public void a() {
        this.f24118b.b(new d(this));
    }

    @Override // com.iab.omid.library.bigosg.walking.a.b.InterfaceC0333b
    @VisibleForTesting
    public void a(JSONObject jSONObject) {
        this.f24117a = jSONObject;
    }

    public void a(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f24118b.b(new f(this, hashSet, jSONObject, j10));
    }

    @Override // com.iab.omid.library.bigosg.walking.a.b.InterfaceC0333b
    @VisibleForTesting
    public JSONObject b() {
        return this.f24117a;
    }

    public void b(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f24118b.b(new e(this, hashSet, jSONObject, j10));
    }
}
