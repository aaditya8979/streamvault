package com.iab.omid.library.vungle.internal;

import android.view.View;
import androidx.annotation.Nullable;
import com.iab.omid.library.vungle.adsession.FriendlyObstructionPurpose;

/* JADX INFO: loaded from: classes9.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.iab.omid.library.vungle.weakreference.a f24975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f24976b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final FriendlyObstructionPurpose f24977c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f24978d;

    public e(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        this.f24975a = new com.iab.omid.library.vungle.weakreference.a(view);
        this.f24976b = view.getClass().getCanonicalName();
        this.f24977c = friendlyObstructionPurpose;
        this.f24978d = str;
    }

    public String a() {
        return this.f24978d;
    }

    public FriendlyObstructionPurpose b() {
        return this.f24977c;
    }

    public com.iab.omid.library.vungle.weakreference.a c() {
        return this.f24975a;
    }

    public String d() {
        return this.f24976b;
    }
}
