package com.iab.omid.library.bytedance2.internal;

import android.view.View;
import androidx.annotation.Nullable;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;

/* JADX INFO: loaded from: classes12.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.iab.omid.library.bytedance2.weakreference.a f24165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f24166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final FriendlyObstructionPurpose f24167c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f24168d;

    public e(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        this.f24165a = new com.iab.omid.library.bytedance2.weakreference.a(view);
        this.f24166b = view.getClass().getCanonicalName();
        this.f24167c = friendlyObstructionPurpose;
        this.f24168d = str;
    }

    public String a() {
        return this.f24168d;
    }

    public FriendlyObstructionPurpose b() {
        return this.f24167c;
    }

    public com.iab.omid.library.bytedance2.weakreference.a c() {
        return this.f24165a;
    }

    public String d() {
        return this.f24166b;
    }
}
