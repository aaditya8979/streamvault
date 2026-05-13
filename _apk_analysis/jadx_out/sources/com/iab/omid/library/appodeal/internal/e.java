package com.iab.omid.library.appodeal.internal;

import android.view.View;
import androidx.annotation.Nullable;
import com.iab.omid.library.appodeal.adsession.FriendlyObstructionPurpose;

/* JADX INFO: loaded from: classes10.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.iab.omid.library.appodeal.weakreference.a f23909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f23910b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final FriendlyObstructionPurpose f23911c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f23912d;

    public e(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        this.f23909a = new com.iab.omid.library.appodeal.weakreference.a(view);
        this.f23910b = view.getClass().getCanonicalName();
        this.f23911c = friendlyObstructionPurpose;
        this.f23912d = str;
    }

    public String a() {
        return this.f23912d;
    }

    public FriendlyObstructionPurpose b() {
        return this.f23911c;
    }

    public com.iab.omid.library.appodeal.weakreference.a c() {
        return this.f23909a;
    }

    public String d() {
        return this.f23910b;
    }
}
