package com.google.android.exoplayer.trackselection;

import a6.k0;
import android.annotation.TargetApi;
import android.content.Context;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.accessibility.CaptioningManager;
import androidx.annotation.Nullable;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class TrackSelectionParameters implements Parcelable {
    public static final Parcelable.Creator<TrackSelectionParameters> CREATOR;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final TrackSelectionParameters f20831g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Deprecated
    public static final TrackSelectionParameters f20832h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f20833b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final String f20834c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f20835d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f20836e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f20837f;

    public class a implements Parcelable.Creator<TrackSelectionParameters> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public TrackSelectionParameters createFromParcel(Parcel parcel) {
            return new TrackSelectionParameters(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public TrackSelectionParameters[] newArray(int i10) {
            return new TrackSelectionParameters[i10];
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public String f20838a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public String f20839b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f20840c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f20841d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f20842e;

        @Deprecated
        public b() {
            this.f20838a = null;
            this.f20839b = null;
            this.f20840c = 0;
            this.f20841d = false;
            this.f20842e = 0;
        }

        public b(Context context) {
            this();
            d(context);
        }

        public b(TrackSelectionParameters trackSelectionParameters) {
            this.f20838a = trackSelectionParameters.f20833b;
            this.f20839b = trackSelectionParameters.f20834c;
            this.f20840c = trackSelectionParameters.f20835d;
            this.f20841d = trackSelectionParameters.f20836e;
            this.f20842e = trackSelectionParameters.f20837f;
        }

        public TrackSelectionParameters a() {
            return new TrackSelectionParameters(this.f20838a, this.f20839b, this.f20840c, this.f20841d, this.f20842e);
        }

        public b b(@Nullable String str) {
            this.f20838a = str;
            return this;
        }

        public b c(@Nullable String str) {
            this.f20839b = str;
            return this;
        }

        public b d(Context context) {
            if (k0.f3574a >= 19) {
                e(context);
            }
            return this;
        }

        @TargetApi(19)
        public final void e(Context context) {
            CaptioningManager captioningManager;
            if ((k0.f3574a >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled()) {
                this.f20840c = 1088;
                Locale locale = captioningManager.getLocale();
                if (locale != null) {
                    this.f20839b = k0.L(locale);
                }
            }
        }
    }

    static {
        TrackSelectionParameters trackSelectionParametersA = new b().a();
        f20831g = trackSelectionParametersA;
        f20832h = trackSelectionParametersA;
        CREATOR = new a();
    }

    public TrackSelectionParameters(Parcel parcel) {
        this.f20833b = parcel.readString();
        this.f20834c = parcel.readString();
        this.f20835d = parcel.readInt();
        this.f20836e = k0.u0(parcel);
        this.f20837f = parcel.readInt();
    }

    public TrackSelectionParameters(@Nullable String str, @Nullable String str2, int i10, boolean z10, int i11) {
        this.f20833b = k0.n0(str);
        this.f20834c = k0.n0(str2);
        this.f20835d = i10;
        this.f20836e = z10;
        this.f20837f = i11;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TrackSelectionParameters trackSelectionParameters = (TrackSelectionParameters) obj;
        return TextUtils.equals(this.f20833b, trackSelectionParameters.f20833b) && TextUtils.equals(this.f20834c, trackSelectionParameters.f20834c) && this.f20835d == trackSelectionParameters.f20835d && this.f20836e == trackSelectionParameters.f20836e && this.f20837f == trackSelectionParameters.f20837f;
    }

    public int hashCode() {
        String str = this.f20833b;
        int iHashCode = ((str == null ? 0 : str.hashCode()) + 31) * 31;
        String str2 = this.f20834c;
        return ((((((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f20835d) * 31) + (this.f20836e ? 1 : 0)) * 31) + this.f20837f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f20833b);
        parcel.writeString(this.f20834c);
        parcel.writeInt(this.f20835d);
        k0.O0(parcel, this.f20836e);
        parcel.writeInt(this.f20837f);
    }
}
