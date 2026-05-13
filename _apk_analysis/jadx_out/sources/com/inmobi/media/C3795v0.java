package com.inmobi.media;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.widget.ActivityChooserModel;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.inmobi.media.v0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3795v0 implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<C3795v0> CREATOR = new C3770u0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f28301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f28302b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Map f28303c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f28304d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f28305e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f28306f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f28307g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f28308h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f28309i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f28310j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f28311k;

    public C3795v0(long j10, String str, String str2, String str3) {
        this.f28308h = "";
        this.f28309i = ActivityChooserModel.ATTRIBUTE_ACTIVITY;
        this.f28301a = j10;
        this.f28305e = str2;
        this.f28302b = str;
        this.f28306f = str3;
    }

    public C3795v0(Parcel parcel) {
        this.f28308h = "";
        String str = ActivityChooserModel.ATTRIBUTE_ACTIVITY;
        this.f28309i = ActivityChooserModel.ATTRIBUTE_ACTIVITY;
        this.f28301a = parcel.readLong();
        String string = parcel.readString();
        if (string != null && !tn.p.f(string, ActivityChooserModel.ATTRIBUTE_ACTIVITY) && tn.p.f(string, "others")) {
            str = "others";
        }
        this.f28309i = str;
        this.f28305e = parcel.readString();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3795v0)) {
            return false;
        }
        C3795v0 c3795v0 = (C3795v0) obj;
        return this.f28301a == c3795v0.f28301a && tn.p.f(this.f28309i, c3795v0.f28309i) && tn.p.f(this.f28302b, c3795v0.f28302b) && tn.p.f(this.f28305e, c3795v0.f28305e);
    }

    public final int hashCode() {
        long j10 = this.f28301a;
        int i10 = ((int) (j10 ^ (j10 >>> 32))) * 31;
        String str = this.f28305e;
        return this.f28309i.hashCode() + ((i10 + (str != null ? str.hashCode() : 0)) * 30);
    }

    public final String toString() {
        return String.valueOf(this.f28301a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        tn.p.k(parcel, "dest");
        parcel.writeLong(this.f28301a);
        parcel.writeString(this.f28309i);
        parcel.writeString(this.f28305e);
    }
}
