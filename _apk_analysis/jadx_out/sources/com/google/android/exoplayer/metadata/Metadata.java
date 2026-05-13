package com.google.android.exoplayer.metadata;

import a6.k0;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.exoplayer.Format;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class Metadata implements Parcelable {
    public static final Parcelable.Creator<Metadata> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Entry[] f20217b;

    public interface Entry extends Parcelable {
        @Nullable
        default byte[] getWrappedMetadataBytes() {
            return null;
        }

        @Nullable
        default Format getWrappedMetadataFormat() {
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

    public Metadata(Parcel parcel) {
        this.f20217b = new Entry[parcel.readInt()];
        int i10 = 0;
        while (true) {
            Entry[] entryArr = this.f20217b;
            if (i10 >= entryArr.length) {
                return;
            }
            entryArr[i10] = (Entry) parcel.readParcelable(Entry.class.getClassLoader());
            i10++;
        }
    }

    public Metadata(List<? extends Entry> list) {
        Entry[] entryArr = new Entry[list.size()];
        this.f20217b = entryArr;
        list.toArray(entryArr);
    }

    public Metadata(Entry... entryArr) {
        this.f20217b = entryArr;
    }

    public Metadata b(Entry... entryArr) {
        return entryArr.length == 0 ? this : new Metadata((Entry[]) k0.p0(this.f20217b, entryArr));
    }

    public Metadata c(@Nullable Metadata metadata) {
        return metadata == null ? this : b(metadata.f20217b);
    }

    public Entry d(int i10) {
        return this.f20217b[i10];
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int e() {
        return this.f20217b.length;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Metadata.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f20217b, ((Metadata) obj).f20217b);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f20217b);
    }

    public String toString() {
        return "entries=" + Arrays.toString(this.f20217b);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f20217b.length);
        for (Entry entry : this.f20217b) {
            parcel.writeParcelable(entry, 0);
        }
    }
}
