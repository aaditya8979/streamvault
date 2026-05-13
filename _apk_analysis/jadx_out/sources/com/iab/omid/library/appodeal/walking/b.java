package com.iab.omid.library.appodeal.walking;

import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.appodeal.walking.async.b;
import com.iab.omid.library.appodeal.walking.async.d;
import com.iab.omid.library.appodeal.walking.async.e;
import com.iab.omid.library.appodeal.walking.async.f;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class b implements b.InterfaceC0330b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private JSONObject f23996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.appodeal.walking.async.c f23997b;

    public b(com.iab.omid.library.appodeal.walking.async.c cVar) {
        this.f23997b = cVar;
    }

    @Override // com.iab.omid.library.appodeal.walking.async.b.InterfaceC0330b
    @VisibleForTesting
    public JSONObject a() {
        return this.f23996a;
    }

    @Override // com.iab.omid.library.appodeal.walking.async.b.InterfaceC0330b
    @VisibleForTesting
    public void a(JSONObject jSONObject) {
        this.f23996a = jSONObject;
    }

    public void a(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f23997b.b(new e(this, hashSet, jSONObject, j10));
    }

    public void b() {
        this.f23997b.b(new d(this));
    }

    public void b(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f23997b.b(new f(this, hashSet, jSONObject, j10));
    }
}
