package com.google.android.exoplayer2.drm;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;
import s7.m0;

/* JADX INFO: loaded from: classes6.dex */
public final class DrmInitData implements Comparator<SchemeData>, Parcelable {
    public static final Parcelable.Creator<DrmInitData> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SchemeData[] f21509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f21510c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final String f21511d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f21512e;

    public static final class SchemeData implements Parcelable {
        public static final Parcelable.Creator<SchemeData> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f21513b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final UUID f21514c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public final String f21515d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f21516e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        public final byte[] f21517f;

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
            this.f21514c = new UUID(parcel.readLong(), parcel.readLong());
            this.f21515d = parcel.readString();
            this.f21516e = (String) m0.j(parcel.readString());
            this.f21517f = parcel.createByteArray();
        }

        public SchemeData(UUID uuid, @Nullable String str, String str2, @Nullable byte[] bArr) {
            this.f21514c = (UUID) s7.a.e(uuid);
            this.f21515d = str;
            this.f21516e = (String) s7.a.e(str2);
            this.f21517f = bArr;
        }

        public SchemeData(UUID uuid, String str, @Nullable byte[] bArr) {
            this(uuid, null, str, bArr);
        }

        @CheckResult
        public SchemeData b(@Nullable byte[] bArr) {
            return new SchemeData(this.f21514c, this.f21515d, this.f21516e, bArr);
        }

        public boolean c(UUID uuid) {
            return d6.c.f59581a.equals(this.f21514c) || uuid.equals(this.f21514c);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object obj) {
            if (!(obj instanceof SchemeData)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            SchemeData schemeData = (SchemeData) obj;
            return m0.c(this.f21515d, schemeData.f21515d) && m0.c(this.f21516e, schemeData.f21516e) && m0.c(this.f21514c, schemeData.f21514c) && Arrays.equals(this.f21517f, schemeData.f21517f);
        }

        public int hashCode() {
            if (this.f21513b == 0) {
                int iHashCode = this.f21514c.hashCode() * 31;
                String str = this.f21515d;
                this.f21513b = ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f21516e.hashCode()) * 31) + Arrays.hashCode(this.f21517f);
            }
            return this.f21513b;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeLong(this.f21514c.getMostSignificantBits());
            parcel.writeLong(this.f21514c.getLeastSignificantBits());
            parcel.writeString(this.f21515d);
            parcel.writeString(this.f21516e);
            parcel.writeByteArray(this.f21517f);
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
        this.f21511d = parcel.readString();
        SchemeData[] schemeDataArr = (SchemeData[]) m0.j((SchemeData[]) parcel.createTypedArray(SchemeData.CREATOR));
        this.f21509b = schemeDataArr;
        this.f21512e = schemeDataArr.length;
    }

    public DrmInitData(@Nullable String str, boolean z10, SchemeData... schemeDataArr) {
        this.f21511d = str;
        schemeDataArr = z10 ? (SchemeData[]) schemeDataArr.clone() : schemeDataArr;
        this.f21509b = schemeDataArr;
        this.f21512e = schemeDataArr.length;
        Arrays.sort(schemeDataArr, this);
    }

    public DrmInitData(@Nullable String str, SchemeData... schemeDataArr) {
        this(str, true, schemeDataArr);
    }

    public DrmInitData(List<SchemeData> list) {
        this(null, false, (SchemeData[]) list.toArray(new SchemeData[0]));
    }

    public DrmInitData(SchemeData... schemeDataArr) {
        this(null, schemeDataArr);
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compare(SchemeData schemeData, SchemeData schemeData2) {
        UUID uuid = d6.c.f59581a;
        return uuid.equals(schemeData.f21514c) ? uuid.equals(schemeData2.f21514c) ? 0 : 1 : schemeData.f21514c.compareTo(schemeData2.f21514c);
    }

    @CheckResult
    public DrmInitData c(@Nullable String str) {
        return m0.c(this.f21511d, str) ? this : new DrmInitData(str, false, this.f21509b);
    }

    public SchemeData d(int i10) {
        return this.f21509b[i10];
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
        return m0.c(this.f21511d, drmInitData.f21511d) && Arrays.equals(this.f21509b, drmInitData.f21509b);
    }

    public int hashCode() {
        if (this.f21510c == 0) {
            String str = this.f21511d;
            this.f21510c = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f21509b);
        }
        return this.f21510c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f21511d);
        parcel.writeTypedArray(this.f21509b, 0);
    }
}
