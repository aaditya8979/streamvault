package com.iab.omid.library.fyber.internal;

import android.view.View;
import androidx.annotation.Nullable;
import com.iab.omid.library.fyber.adsession.FriendlyObstructionPurpose;

/* JADX INFO: loaded from: classes2.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.iab.omid.library.fyber.weakreference.a f24295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f24296b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final FriendlyObstructionPurpose f24297c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f24298d;

    public e(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        this.f24295a = new com.iab.omid.library.fyber.weakreference.a(view);
        this.f24296b = view.getClass().getCanonicalName();
        this.f24297c = friendlyObstructionPurpose;
        this.f24298d = str;
    }

    public String a() {
        return this.f24298d;
    }

    public FriendlyObstructionPurpose b() {
        return this.f24297c;
    }

    public com.iab.omid.library.fyber.weakreference.a c() {
        return this.f24295a;
    }

    public String d() {
        return this.f24296b;
    }
}
