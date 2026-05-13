package com.iab.omid.library.unity3d.walking;

import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.unity3d.walking.async.b;
import com.iab.omid.library.unity3d.walking.async.d;
import com.iab.omid.library.unity3d.walking.async.e;
import com.iab.omid.library.unity3d.walking.async.f;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class b implements b.InterfaceC0358b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private JSONObject f24921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.unity3d.walking.async.c f24922b;

    public b(com.iab.omid.library.unity3d.walking.async.c cVar) {
        this.f24922b = cVar;
    }

    @Override // com.iab.omid.library.unity3d.walking.async.b.InterfaceC0358b
    @VisibleForTesting
    public JSONObject a() {
        return this.f24921a;
    }

    @Override // com.iab.omid.library.unity3d.walking.async.b.InterfaceC0358b
    @VisibleForTesting
    public void a(JSONObject jSONObject) {
        this.f24921a = jSONObject;
    }

    public void a(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f24922b.b(new e(this, hashSet, jSONObject, j10));
    }

    public void b() {
        this.f24922b.b(new d(this));
    }

    public void b(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f24922b.b(new f(this, hashSet, jSONObject, j10));
    }
}
