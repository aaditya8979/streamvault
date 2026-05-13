package com.iab.omid.library.bigosg.b;

import android.view.View;
import androidx.annotation.Nullable;
import com.iab.omid.library.bigosg.adsession.FriendlyObstructionPurpose;

/* JADX INFO: loaded from: classes3.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.iab.omid.library.bigosg.e.a f24039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f24040b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final FriendlyObstructionPurpose f24041c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f24042d;

    public c(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        this.f24039a = new com.iab.omid.library.bigosg.e.a(view);
        this.f24040b = view.getClass().getCanonicalName();
        this.f24041c = friendlyObstructionPurpose;
        this.f24042d = str;
    }

    public com.iab.omid.library.bigosg.e.a a() {
        return this.f24039a;
    }

    public String b() {
        return this.f24040b;
    }

    public FriendlyObstructionPurpose c() {
        return this.f24041c;
    }

    public String d() {
        return this.f24042d;
    }
}
