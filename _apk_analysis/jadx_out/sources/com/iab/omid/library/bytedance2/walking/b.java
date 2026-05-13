package com.iab.omid.library.bytedance2.walking;

import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.bytedance2.walking.async.b;
import com.iab.omid.library.bytedance2.walking.async.d;
import com.iab.omid.library.bytedance2.walking.async.e;
import com.iab.omid.library.bytedance2.walking.async.f;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class b implements b.InterfaceC0337b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private JSONObject f24246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.bytedance2.walking.async.c f24247b;

    public b(com.iab.omid.library.bytedance2.walking.async.c cVar) {
        this.f24247b = cVar;
    }

    @Override // com.iab.omid.library.bytedance2.walking.async.b.InterfaceC0337b
    @VisibleForTesting
    public JSONObject a() {
        return this.f24246a;
    }

    @Override // com.iab.omid.library.bytedance2.walking.async.b.InterfaceC0337b
    @VisibleForTesting
    public void a(JSONObject jSONObject) {
        this.f24246a = jSONObject;
    }

    public void a(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f24247b.b(new e(this, hashSet, jSONObject, j10));
    }

    public void b() {
        this.f24247b.b(new d(this));
    }

    public void b(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f24247b.b(new f(this, hashSet, jSONObject, j10));
    }
}
