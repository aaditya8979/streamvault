package com.inmobi.media;

import android.app.Activity;
import androidx.appcompat.widget.ActivityChooserModel;

/* JADX INFO: loaded from: classes9.dex */
public final class Ra extends Sa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f26241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f26242b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f26243c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f26244d;

    public Ra(Activity activity, String str, String str2, boolean z10) {
        tn.p.k(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        tn.p.k(str, "finalUrl");
        tn.p.k(str2, "callerId");
        this.f26241a = activity;
        this.f26242b = str;
        this.f26243c = str2;
        this.f26244d = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ra)) {
            return false;
        }
        Ra ra2 = (Ra) obj;
        return tn.p.f(this.f26241a, ra2.f26241a) && tn.p.f(this.f26242b, ra2.f26242b) && tn.p.f(this.f26243c, ra2.f26243c) && this.f26244d == ra2.f26244d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f26244d) + ((this.f26243c.hashCode() + ((this.f26242b.hashCode() + (this.f26241a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Valid(activity=" + this.f26241a + ", finalUrl=" + this.f26242b + ", callerId=" + this.f26243c + ", overlay=" + this.f26244d + ")";
    }
}
