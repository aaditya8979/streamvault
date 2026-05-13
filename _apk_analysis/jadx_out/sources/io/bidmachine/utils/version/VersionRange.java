package io.bidmachine.utils.version;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.ironsource.C3978d4;
import java.util.Objects;

/* JADX INFO: loaded from: classes11.dex */
public class VersionRange {

    @Nullable
    private final Version from;
    private final boolean isInclusiveFrom;
    private final boolean isInclusiveTo;

    /* JADX INFO: renamed from: to, reason: collision with root package name */
    @Nullable
    private final Version f71005to;

    public VersionRange(@Nullable Version version, @Nullable Version version2, boolean z10, boolean z11) {
        this.from = version;
        this.f71005to = version2;
        this.isInclusiveFrom = z10;
        this.isInclusiveTo = z11;
    }

    @VisibleForTesting
    public static boolean isAfter(@NonNull Version version, @NonNull Version version2, boolean z10) {
        return (z10 && version2.isAfterOrEquals(version)) || (!z10 && version2.isAfter(version));
    }

    @VisibleForTesting
    public static boolean isBefore(@NonNull Version version, @NonNull Version version2, boolean z10) {
        return (z10 && version2.isBeforeOrEquals(version)) || (!z10 && version2.isBefore(version));
    }

    @Nullable
    public static VersionRange parseVersionRange(@NonNull String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            boolean zStartsWith = str.startsWith(C3978d4.j.f31383d);
            boolean zStartsWith2 = str.startsWith("(");
            if (zStartsWith || zStartsWith2) {
                str = str.substring(1);
            } else {
                zStartsWith = true;
            }
            boolean zEndsWith = str.endsWith(C3978d4.j.f31385e);
            boolean zEndsWith2 = str.endsWith(")");
            if (zEndsWith || zEndsWith2) {
                str = str.substring(0, str.length() - 1);
            } else {
                zEndsWith = true;
            }
            String[] strArrSplit = str.split("-");
            if (strArrSplit.length >= 2) {
                return new VersionRange(Version.parseVersion(strArrSplit[0]), Version.parseVersion(strArrSplit[1]), zStartsWith, zEndsWith);
            }
            Version version = Version.parseVersion(str);
            if (version != null) {
                return new VersionRange(version, version, zStartsWith, zEndsWith);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public boolean contains(@NonNull Version version) {
        Version version2;
        Version version3 = this.from;
        if (version3 != null && this.f71005to != null && isAfter(version3, version, this.isInclusiveFrom) && isBefore(this.f71005to, version, this.isInclusiveTo)) {
            return true;
        }
        Version version4 = this.from;
        if (version4 != null && this.f71005to == null && isAfter(version4, version, this.isInclusiveFrom)) {
            return true;
        }
        if (this.from == null && (version2 = this.f71005to) != null && isBefore(version2, version, this.isInclusiveTo)) {
            return true;
        }
        return this.from == null && this.f71005to == null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VersionRange versionRange = (VersionRange) obj;
        return this.isInclusiveFrom == versionRange.isInclusiveFrom && this.isInclusiveTo == versionRange.isInclusiveTo && Objects.equals(this.from, versionRange.from) && Objects.equals(this.f71005to, versionRange.f71005to);
    }
}
