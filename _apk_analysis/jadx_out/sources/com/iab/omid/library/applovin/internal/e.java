package com.iab.omid.library.applovin.internal;

import android.view.View;
import androidx.annotation.Nullable;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;

/* JADX INFO: loaded from: classes2.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.iab.omid.library.applovin.weakreference.a f23774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f23775b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final FriendlyObstructionPurpose f23776c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f23777d;

    public e(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        this.f23774a = new com.iab.omid.library.applovin.weakreference.a(view);
        this.f23775b = view.getClass().getCanonicalName();
        this.f23776c = friendlyObstructionPurpose;
        this.f23777d = str;
    }

    public String a() {
        return this.f23777d;
    }

    public FriendlyObstructionPurpose b() {
        return this.f23776c;
    }

    public com.iab.omid.library.applovin.weakreference.a c() {
        return this.f23774a;
    }

    public String d() {
        return this.f23775b;
    }
}
