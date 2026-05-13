package com.inmobi.unifiedId;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: loaded from: classes6.dex */
public final class InMobiUserDataTypes {

    @Nullable
    private final String md5;

    @Nullable
    private final String sha1;

    @Nullable
    private final String sha256;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f28684a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f28685b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f28686c;

        @NotNull
        public final InMobiUserDataTypes build() {
            return new InMobiUserDataTypes(this.f28684a, this.f28685b, this.f28686c);
        }

        @NotNull
        public final Builder md5(@Nullable String str) {
            this.f28684a = str;
            return this;
        }

        @NotNull
        public final Builder sha1(@Nullable String str) {
            this.f28685b = str;
            return this;
        }

        @NotNull
        public final Builder sha256(@Nullable String str) {
            this.f28686c = str;
            return this;
        }
    }

    public InMobiUserDataTypes(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.md5 = str;
        this.sha1 = str2;
        this.sha256 = str3;
    }

    public static /* synthetic */ InMobiUserDataTypes copy$default(InMobiUserDataTypes inMobiUserDataTypes, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = inMobiUserDataTypes.md5;
        }
        if ((i10 & 2) != 0) {
            str2 = inMobiUserDataTypes.sha1;
        }
        if ((i10 & 4) != 0) {
            str3 = inMobiUserDataTypes.sha256;
        }
        return inMobiUserDataTypes.copy(str, str2, str3);
    }

    @Nullable
    public final String component1() {
        return this.md5;
    }

    @Nullable
    public final String component2() {
        return this.sha1;
    }

    @Nullable
    public final String component3() {
        return this.sha256;
    }

    @NotNull
    public final InMobiUserDataTypes copy(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        return new InMobiUserDataTypes(str, str2, str3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InMobiUserDataTypes)) {
            return false;
        }
        InMobiUserDataTypes inMobiUserDataTypes = (InMobiUserDataTypes) obj;
        return p.f(this.md5, inMobiUserDataTypes.md5) && p.f(this.sha1, inMobiUserDataTypes.sha1) && p.f(this.sha256, inMobiUserDataTypes.sha256);
    }

    @Nullable
    public final String getMd5() {
        return this.md5;
    }

    @Nullable
    public final String getSha1() {
        return this.sha1;
    }

    @Nullable
    public final String getSha256() {
        return this.sha256;
    }

    public int hashCode() {
        String str = this.md5;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.sha1;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.sha256;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "InMobiUserDataTypes(md5=" + this.md5 + ", sha1=" + this.sha1 + ", sha256=" + this.sha256 + ")";
    }
}
