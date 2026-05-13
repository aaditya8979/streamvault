package com.iab.omid.library.inmobi.internal;

import android.view.View;
import androidx.annotation.Nullable;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;

/* JADX INFO: loaded from: classes8.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.iab.omid.library.inmobi.weakreference.a f24436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f24437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final FriendlyObstructionPurpose f24438c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f24439d;

    public e(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        this.f24436a = new com.iab.omid.library.inmobi.weakreference.a(view);
        this.f24437b = view.getClass().getCanonicalName();
        this.f24438c = friendlyObstructionPurpose;
        this.f24439d = str;
    }

    public String a() {
        return this.f24439d;
    }

    public FriendlyObstructionPurpose b() {
        return this.f24438c;
    }

    public com.iab.omid.library.inmobi.weakreference.a c() {
        return this.f24436a;
    }

    public String d() {
        return this.f24437b;
    }
}
