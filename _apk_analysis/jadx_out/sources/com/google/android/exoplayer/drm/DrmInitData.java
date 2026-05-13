package com.google.android.exoplayer.drm;

import a6.k0;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import e4.k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes10.dex */
public final class DrmInitData implements Comparator<SchemeData>, Parcelable {
    public static final Parcelable.Creator<DrmInitData> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SchemeData[] f20125b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f20126c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final String f20127d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f20128e;

    public static final class SchemeData implements Parcelable {
        public static final Parcelable.Creator<SchemeData> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f20129b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final UUID f20130c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public final String f20131d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f20132e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        public final byte[] f20133f;

        public class a implements Parcelable.Creator<SchemeData> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SchemeData createFromParcel(Parcel parcel) {
                return new SchemeData(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SchemeData[] newArray(int i10) {
                return new SchemeData[i10];
            }
        }

        public SchemeData(Parcel parcel) {
            this.f20130c = new UUID(parcel.readLong(), parcel.readLong());
            this.f20131d = parcel.readString();
            this.f20132e = (String) k0.i(parcel.readString());
            this.f20133f = parcel.createByteArray();
        }

        public SchemeData(UUID uuid, @Nullable String str, String str2, @Nullable byte[] bArr) {
            this.f20130c = (UUID) a6.a.e(uuid);
            this.f20131d = str;
            this.f20132e = (String) a6.a.e(str2);
            this.f20133f = bArr;
        }

        public SchemeData(UUID uuid, String str, @Nullable byte[] bArr) {
            this(uuid, null, str, bArr);
        }

        public boolean c(SchemeData schemeData) {
            return e() && !schemeData.e() && f(schemeData.f20130c);
        }

        public SchemeData d(@Nullable byte[] bArr) {
            return new SchemeData(this.f20130c, this.f20131d, this.f20132e, bArr);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean e() {
            return this.f20133f != null;
        }

        public boolean equals(@Nullable Object obj) {
            if (!(obj instanceof SchemeData)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            SchemeData schemeData = (SchemeData) obj;
            return k0.c(this.f20131d, schemeData.f20131d) && k0.c(this.f20132e, schemeData.f20132e) && k0.c(this.f20130c, schemeData.f20130c) && Arrays.equals(this.f20133f, schemeData.f20133f);
        }

        public boolean f(UUID uuid) {
            return k.f60167a.equals(this.f20130c) || uuid.equals(this.f20130c);
        }

        public int hashCode() {
            if (this.f20129b == 0) {
                int iHashCode = this.f20130c.hashCode() * 31;
                String str = this.f20131d;
                this.f20129b = ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f20132e.hashCode()) * 31) + Arrays.hashCode(this.f20133f);
            }
            return this.f20129b;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeLong(this.f20130c.getMostSignificantBits());
            parcel.writeLong(this.f20130c.getLeastSignificantBits());
            parcel.writeString(this.f20131d);
            parcel.writeString(this.f20132e);
            parcel.writeByteArray(this.f20133f);
        }
    }

    public class a implements Parcelable.Creator<DrmInitData> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DrmInitData createFromParcel(Parcel parcel) {
            return new DrmInitData(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public DrmInitData[] newArray(int i10) {
            return new DrmInitData[i10];
        }
    }

    public DrmInitData(Parcel parcel) {
        this.f20127d = parcel.readString();
        SchemeData[] schemeDataArr = (SchemeData[]) k0.i((SchemeData[]) parcel.createTypedArray(SchemeData.CREATOR));
        this.f20125b = schemeDataArr;
        this.f20128e = schemeDataArr.length;
    }

    public DrmInitData(@Nullable String str, List<SchemeData> list) {
        this(str, false, (SchemeData[]) list.toArray(new SchemeData[0]));
    }

    public DrmInitData(@Nullable String str, boolean z10, SchemeData... schemeDataArr) {
        this.f20127d = str;
        schemeDataArr = z10 ? (SchemeData[]) schemeDataArr.clone() : schemeDataArr;
        this.f20125b = schemeDataArr;
        this.f20128e = schemeDataArr.length;
        Arrays.sort(schemeDataArr, this);
    }

    public DrmInitData(@Nullable String str, SchemeData... schemeDataArr) {
        this(str, true, schemeDataArr);
    }

    public DrmInitData(List<SchemeData> list) {
        this(null, false, (SchemeData[]) list.toArray(new SchemeData[0]));
    }

    public DrmInitData(SchemeData... schemeDataArr) {
        this((String) null, schemeDataArr);
    }

    public static boolean c(ArrayList<SchemeData> arrayList, int i10, UUID uuid) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (arrayList.get(i11).f20130c.equals(uuid)) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    public static DrmInitData e(@Nullable DrmInitData drmInitData, @Nullable DrmInitData drmInitData2) {
        String str;
        ArrayList arrayList = new ArrayList();
        if (drmInitData != null) {
            str = drmInitData.f20127d;
            for (SchemeData schemeData : drmInitData.f20125b) {
                if (schemeData.e()) {
                    arrayList.add(schemeData);
                }
            }
        } else {
            str = null;
        }
        if (drmInitData2 != null) {
            if (str == null) {
                str = drmInitData2.f20127d;
            }
            int size = arrayList.size();
            for (SchemeData schemeData2 : drmInitData2.f20125b) {
                if (schemeData2.e() && !c(arrayList, size, schemeData2.f20130c)) {
                    arrayList.add(schemeData2);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new DrmInitData(str, arrayList);
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compare(SchemeData schemeData, SchemeData schemeData2) {
        UUID uuid = k.f60167a;
        return uuid.equals(schemeData.f20130c) ? uuid.equals(schemeData2.f20130c) ? 0 : 1 : schemeData.f20130c.compareTo(schemeData2.f20130c);
    }

    public DrmInitData d(@Nullable String str) {
        return k0.c(this.f20127d, str) ? this : new DrmInitData(str, false, this.f20125b);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DrmInitData.class != obj.getClass()) {
            return false;
        }
        DrmInitData drmInitData = (DrmInitData) obj;
        return k0.c(this.f20127d, drmInitData.f20127d) && Arrays.equals(this.f20125b, drmInitData.f20125b);
    }

    public SchemeData f(int i10) {
        return this.f20125b[i10];
    }

    public DrmInitData g(DrmInitData drmInitData) {
        String str;
        String str2 = this.f20127d;
        a6.a.f(str2 == null || (str = drmInitData.f20127d) == null || TextUtils.equals(str2, str));
        String str3 = this.f20127d;
        if (str3 == null) {
            str3 = drmInitData.f20127d;
        }
        return new DrmInitData(str3, (SchemeData[]) k0.p0(this.f20125b, drmInitData.f20125b));
    }

    public int hashCode() {
        if (this.f20126c == 0) {
            String str = this.f20127d;
            this.f20126c = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f20125b);
        }
        return this.f20126c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f20127d);
        parcel.writeTypedArray(this.f20125b, 0);
    }
}
