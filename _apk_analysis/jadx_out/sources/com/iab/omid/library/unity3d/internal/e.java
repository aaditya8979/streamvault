package com.iab.omid.library.unity3d.internal;

import android.view.View;
import androidx.annotation.Nullable;
import com.iab.omid.library.unity3d.adsession.FriendlyObstructionPurpose;

/* JADX INFO: loaded from: classes8.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.iab.omid.library.unity3d.weakreference.a f24842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f24843b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final FriendlyObstructionPurpose f24844c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f24845d;

    public e(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        this.f24842a = new com.iab.omid.library.unity3d.weakreference.a(view);
        this.f24843b = view.getClass().getCanonicalName();
        this.f24844c = friendlyObstructionPurpose;
        this.f24845d = str;
    }

    public String a() {
        return this.f24845d;
    }

    public FriendlyObstructionPurpose b() {
        return this.f24844c;
    }

    public com.iab.omid.library.unity3d.weakreference.a c() {
        return this.f24842a;
    }

    public String d() {
        return this.f24843b;
    }
}
