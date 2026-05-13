package io.bidmachine.utils.version;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Objects;

/* JADX INFO: loaded from: classes11.dex */
public class Version implements Comparable<Version> {
    private final int major;
    private final int minor;
    private final int patch;

    public Version(int i10, int i11, int i12) {
        this.major = i10;
        this.minor = i11;
        this.patch = i12;
    }

    @Nullable
    public static Version parseVersion(@NonNull String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            String[] strArrSplit = str.split("\\.");
            if (strArrSplit.length == 0) {
                return null;
            }
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            while (i10 < strArrSplit.length) {
                if (i10 == 0) {
                    i11 = Integer.parseInt(strArrSplit[0]);
                } else if (i10 != 1) {
                    i13 = i10 != 2 ? (i13 * 100) + Integer.parseInt(strArrSplit[i10]) : Integer.parseInt(strArrSplit[2]);
                } else {
                    i12 = Integer.parseInt(strArrSplit[1]);
                }
                i10++;
            }
            return new Version(i11, i12, i13);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // java.lang.Comparable
    public int compareTo(Version version) {
        int iCompare = Integer.compare(this.major, version.major);
        if (iCompare != 0) {
            return iCompare;
        }
        int iCompare2 = Integer.compare(this.minor, version.minor);
        return iCompare2 != 0 ? iCompare2 : Integer.compare(this.patch, version.patch);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Version version = (Version) obj;
        return this.major == version.major && this.minor == version.minor && this.patch == version.patch;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.major), Integer.valueOf(this.minor), Integer.valueOf(this.patch));
    }

    public boolean isAfter(@NonNull Version version) {
        return compareTo(version) > 0;
    }

    public boolean isAfterOrEquals(@NonNull Version version) {
        return compareTo(version) >= 0;
    }

    public boolean isBefore(@NonNull Version version) {
        return compareTo(version) < 0;
    }

    public boolean isBeforeOrEquals(@NonNull Version version) {
        return compareTo(version) <= 0;
    }

    @NonNull
    public String toString() {
        return this.major + "." + this.minor + "." + this.patch;
    }
}
