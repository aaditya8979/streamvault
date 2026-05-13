package com.google.android.exoplayer2.metadata;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import b8.f;
import com.google.android.exoplayer2.m;
import com.google.android.exoplayer2.q;
import java.util.Arrays;
import java.util.List;
import s7.m0;

/* JADX INFO: loaded from: classes3.dex */
public final class Metadata implements Parcelable {
    public static final Parcelable.Creator<Metadata> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Entry[] f21869b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f21870c;

    public interface Entry extends Parcelable {
        default void a(q.b bVar) {
        }

        @Nullable
        default byte[] getWrappedMetadataBytes() {
            return null;
        }

        @Nullable
        default m getWrappedMetadataFormat() {
            return null;
        }
    }

    public class a implements Parcelable.Creator<Metadata> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Metadata createFromParcel(Parcel parcel) {
            return new Metadata(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Metadata[] newArray(int i10) {
            return new Metadata[i10];
        }
    }

    public Metadata(long j10, List<? extends Entry> list) {
        this(j10, (Entry[]) list.toArray(new Entry[0]));
    }

    public Metadata(long j10, Entry... entryArr) {
        this.f21870c = j10;
        this.f21869b = entryArr;
    }

    public Metadata(Parcel parcel) {
        this.f21869b = new Entry[parcel.readInt()];
        int i10 = 0;
        while (true) {
            Entry[] entryArr = this.f21869b;
            if (i10 >= entryArr.length) {
                this.f21870c = parcel.readLong();
                return;
            } else {
                entryArr[i10] = (Entry) parcel.readParcelable(Entry.class.getClassLoader());
                i10++;
            }
        }
    }

    public Metadata(List<? extends Entry> list) {
        this((Entry[]) list.toArray(new Entry[0]));
    }

    public Metadata(Entry... entryArr) {
        this(-9223372036854775807L, entryArr);
    }

    public Metadata b(Entry... entryArr) {
        return entryArr.length == 0 ? this : new Metadata(this.f21870c, (Entry[]) m0.z0(this.f21869b, entryArr));
    }

    public Metadata c(@Nullable Metadata metadata) {
        return metadata == null ? this : b(metadata.f21869b);
    }

    public Metadata d(long j10) {
        return this.f21870c == j10 ? this : new Metadata(j10, this.f21869b);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Entry e(int i10) {
        return this.f21869b[i10];
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Metadata.class != obj.getClass()) {
            return false;
        }
        Metadata metadata = (Metadata) obj;
        return Arrays.equals(this.f21869b, metadata.f21869b) && this.f21870c == metadata.f21870c;
    }

    public int f() {
        return this.f21869b.length;
    }

    public int hashCode() {
        return (Arrays.hashCode(this.f21869b) * 31) + f.b(this.f21870c);
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("entries=");
        sb2.append(Arrays.toString(this.f21869b));
        if (this.f21870c == -9223372036854775807L) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + this.f21870c;
        }
        sb2.append(str);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f21869b.length);
        for (Entry entry : this.f21869b) {
            parcel.writeParcelable(entry, 0);
        }
        parcel.writeLong(this.f21870c);
    }
}
