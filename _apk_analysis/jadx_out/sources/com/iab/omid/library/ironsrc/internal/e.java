package com.iab.omid.library.ironsrc.internal;

import android.view.View;
import androidx.annotation.Nullable;
import com.iab.omid.library.ironsrc.adsession.FriendlyObstructionPurpose;

/* JADX INFO: loaded from: classes7.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.iab.omid.library.ironsrc.weakreference.a f24571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f24572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final FriendlyObstructionPurpose f24573c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f24574d;

    public e(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        this.f24571a = new com.iab.omid.library.ironsrc.weakreference.a(view);
        this.f24572b = view.getClass().getCanonicalName();
        this.f24573c = friendlyObstructionPurpose;
        this.f24574d = str;
    }

    public String a() {
        return this.f24574d;
    }

    public FriendlyObstructionPurpose b() {
        return this.f24573c;
    }

    public com.iab.omid.library.ironsrc.weakreference.a c() {
        return this.f24571a;
    }

    public String d() {
        return this.f24572b;
    }
}
