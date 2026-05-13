package com.android.cast.dlna.dmr;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: RenderControl.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class CastAction implements Parcelable {

    @NotNull
    public static final a CREATOR = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public String f7002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public String f7003c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public String f7004d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public String f7005e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public String f7006f;

    /* JADX INFO: compiled from: RenderControl.kt */
    public static final class a implements Parcelable.Creator<CastAction> {
        public a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public CastAction createFromParcel(@NotNull Parcel parcel) {
            p.k(parcel, "parcel");
            return new CastAction(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public CastAction[] newArray(int i10) {
            return new CastAction[i10];
        }
    }

    public CastAction() {
        this(null, null, null, null, null, 31, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CastAction(@NotNull Parcel parcel) {
        this(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), null, 16, null);
        p.k(parcel, "parcel");
    }

    public CastAction(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        this.f7002b = str;
        this.f7003c = str2;
        this.f7004d = str3;
        this.f7005e = str4;
        this.f7006f = str5;
    }

    public /* synthetic */ CastAction(String str, String str2, String str3, String str4, String str5, int i10, i iVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4, (i10 & 16) != 0 ? null : str5);
    }

    @Nullable
    public final String c() {
        return this.f7006f;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i10) {
        p.k(parcel, "parcel");
        parcel.writeString(this.f7002b);
        parcel.writeString(this.f7003c);
        parcel.writeString(this.f7004d);
        parcel.writeString(this.f7005e);
    }
}
