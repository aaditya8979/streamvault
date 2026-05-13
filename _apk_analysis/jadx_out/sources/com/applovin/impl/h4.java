package com.applovin.impl;

import android.view.View;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;

/* JADX INFO: loaded from: classes9.dex */
public class h4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f8416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final FriendlyObstructionPurpose f8417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f8418c;

    public h4(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        this.f8416a = view;
        this.f8417b = friendlyObstructionPurpose;
        this.f8418c = str;
    }

    public String a() {
        return this.f8418c;
    }

    public FriendlyObstructionPurpose b() {
        return this.f8417b;
    }

    public View c() {
        return this.f8416a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        h4 h4Var = (h4) obj;
        View view = this.f8416a;
        if (view == null ? h4Var.f8416a != null : !view.equals(h4Var.f8416a)) {
            return false;
        }
        if (this.f8417b != h4Var.f8417b) {
            return false;
        }
        String str = this.f8418c;
        String str2 = h4Var.f8418c;
        return str != null ? str.equals(str2) : str2 == null;
    }

    public int hashCode() {
        View view = this.f8416a;
        int iHashCode = (view != null ? view.hashCode() : 0) * 31;
        FriendlyObstructionPurpose friendlyObstructionPurpose = this.f8417b;
        int iHashCode2 = (iHashCode + (friendlyObstructionPurpose != null ? friendlyObstructionPurpose.hashCode() : 0)) * 31;
        String str = this.f8418c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }
}
