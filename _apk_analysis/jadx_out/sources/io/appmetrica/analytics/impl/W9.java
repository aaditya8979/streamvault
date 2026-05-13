package io.appmetrica.analytics.impl;

import android.os.Parcel;
import android.os.Parcelable;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class W9 implements Parcelable {

    @NotNull
    public static final V9 CREATOR = new V9();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f66095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IdentifierStatus f66096b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f66097c;

    public W9() {
        this(null, IdentifierStatus.UNKNOWN, null);
    }

    public W9(Boolean bool, IdentifierStatus identifierStatus, String str) {
        this.f66095a = bool;
        this.f66096b = identifierStatus;
        this.f66097c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof W9)) {
            return false;
        }
        W9 w92 = (W9) obj;
        return tn.p.f(this.f66095a, w92.f66095a) && this.f66096b == w92.f66096b && tn.p.f(this.f66097c, w92.f66097c);
    }

    public final int hashCode() {
        Boolean bool = this.f66095a;
        int iHashCode = (this.f66096b.hashCode() + ((bool == null ? 0 : bool.hashCode()) * 31)) * 31;
        String str = this.f66097c;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "FeaturesInternal(sslPinning=" + this.f66095a + ", status=" + this.f66096b + ", errorExplanation=" + this.f66097c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeValue(this.f66095a);
        parcel.writeString(this.f66096b.getValue());
        parcel.writeString(this.f66097c);
    }
}
