package com.iab.omid.library.mmadbridge.internal;

import android.view.View;
import androidx.annotation.Nullable;
import com.iab.omid.library.mmadbridge.adsession.FriendlyObstructionPurpose;

/* JADX INFO: loaded from: classes2.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.iab.omid.library.mmadbridge.weakreference.a f24706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f24707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final FriendlyObstructionPurpose f24708c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f24709d;

    public e(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        this.f24706a = new com.iab.omid.library.mmadbridge.weakreference.a(view);
        this.f24707b = view.getClass().getCanonicalName();
        this.f24708c = friendlyObstructionPurpose;
        this.f24709d = str;
    }

    public String a() {
        return this.f24709d;
    }

    public FriendlyObstructionPurpose b() {
        return this.f24708c;
    }

    public com.iab.omid.library.mmadbridge.weakreference.a c() {
        return this.f24706a;
    }

    public String d() {
        return this.f24707b;
    }
}
