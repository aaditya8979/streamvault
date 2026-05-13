package com.google.android.exoplayer2.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.mp4.SlowMotionData;
import com.google.common.collect.m1;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import s7.m0;
import y7.i;

/* JADX INFO: loaded from: classes6.dex */
public final class SlowMotionData implements Metadata.Entry {
    public static final Parcelable.Creator<SlowMotionData> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<Segment> f21958b;

    public static final class Segment implements Parcelable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f21960b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f21961c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f21962d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final Comparator<Segment> f21959e = new Comparator() { // from class: a7.a
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return SlowMotionData.Segment.c((SlowMotionData.Segment) obj, (SlowMotionData.Segment) obj2);
            }
        };
        public static final Parcelable.Creator<Segment> CREATOR = new a();

        public class a implements Parcelable.Creator<Segment> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Segment createFromParcel(Parcel parcel) {
                return new Segment(parcel.readLong(), parcel.readLong(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Segment[] newArray(int i10) {
                return new Segment[i10];
            }
        }

        public Segment(long j10, long j11, int i10) {
            s7.a.a(j10 < j11);
            this.f21960b = j10;
            this.f21961c = j11;
            this.f21962d = i10;
        }

        public static /* synthetic */ int c(Segment segment, Segment segment2) {
            return m1.k().e(segment.f21960b, segment2.f21960b).e(segment.f21961c, segment2.f21961c).d(segment.f21962d, segment2.f21962d).j();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || Segment.class != obj.getClass()) {
                return false;
            }
            Segment segment = (Segment) obj;
            return this.f21960b == segment.f21960b && this.f21961c == segment.f21961c && this.f21962d == segment.f21962d;
        }

        public int hashCode() {
            return i.b(Long.valueOf(this.f21960b), Long.valueOf(this.f21961c), Integer.valueOf(this.f21962d));
        }

        public String toString() {
            return m0.z("Segment: startTimeMs=%d, endTimeMs=%d, speedDivisor=%d", Long.valueOf(this.f21960b), Long.valueOf(this.f21961c), Integer.valueOf(this.f21962d));
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeLong(this.f21960b);
            parcel.writeLong(this.f21961c);
            parcel.writeInt(this.f21962d);
        }
    }

    public class a implements Parcelable.Creator<SlowMotionData> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SlowMotionData createFromParcel(Parcel parcel) {
            ArrayList arrayList = new ArrayList();
            parcel.readList(arrayList, Segment.class.getClassLoader());
            return new SlowMotionData(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public SlowMotionData[] newArray(int i10) {
            return new SlowMotionData[i10];
        }
    }

    public SlowMotionData(List<Segment> list) {
        this.f21958b = list;
        s7.a.a(!b(list));
    }

    public static boolean b(List<Segment> list) {
        if (list.isEmpty()) {
            return false;
        }
        long j10 = list.get(0).f21961c;
        for (int i10 = 1; i10 < list.size(); i10++) {
            if (list.get(i10).f21960b < j10) {
                return true;
            }
            j10 = list.get(i10).f21961c;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SlowMotionData.class != obj.getClass()) {
            return false;
        }
        return this.f21958b.equals(((SlowMotionData) obj).f21958b);
    }

    public int hashCode() {
        return this.f21958b.hashCode();
    }

    public String toString() {
        return "SlowMotion: segments=" + this.f21958b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeList(this.f21958b);
    }
}
