package com.inmobi.unifiedId;

import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: loaded from: classes9.dex */
public final class InMobiUserDataModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InMobiUserDataTypes f28678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InMobiUserDataTypes f28679b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f28680c;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public InMobiUserDataTypes f28681a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public InMobiUserDataTypes f28682b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public HashMap f28683c;

        @NotNull
        public final InMobiUserDataModel build() {
            return new InMobiUserDataModel(this.f28681a, this.f28682b, this.f28683c);
        }

        @NotNull
        public final Builder emailId(@Nullable InMobiUserDataTypes inMobiUserDataTypes) {
            this.f28682b = inMobiUserDataTypes;
            return this;
        }

        @NotNull
        public final Builder extras(@Nullable HashMap<String, String> map) {
            this.f28683c = map;
            return this;
        }

        @NotNull
        public final Builder phoneNumber(@Nullable InMobiUserDataTypes inMobiUserDataTypes) {
            this.f28681a = inMobiUserDataTypes;
            return this;
        }
    }

    public InMobiUserDataModel(@Nullable InMobiUserDataTypes inMobiUserDataTypes, @Nullable InMobiUserDataTypes inMobiUserDataTypes2, @Nullable HashMap<String, String> map) {
        this.f28678a = inMobiUserDataTypes;
        this.f28679b = inMobiUserDataTypes2;
        this.f28680c = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InMobiUserDataModel copy$default(InMobiUserDataModel inMobiUserDataModel, InMobiUserDataTypes inMobiUserDataTypes, InMobiUserDataTypes inMobiUserDataTypes2, HashMap map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            inMobiUserDataTypes = inMobiUserDataModel.f28678a;
        }
        if ((i10 & 2) != 0) {
            inMobiUserDataTypes2 = inMobiUserDataModel.f28679b;
        }
        if ((i10 & 4) != 0) {
            map = inMobiUserDataModel.f28680c;
        }
        return inMobiUserDataModel.copy(inMobiUserDataTypes, inMobiUserDataTypes2, map);
    }

    @Nullable
    public final InMobiUserDataTypes component1() {
        return this.f28678a;
    }

    @Nullable
    public final InMobiUserDataTypes component2() {
        return this.f28679b;
    }

    @Nullable
    public final HashMap<String, String> component3() {
        return this.f28680c;
    }

    @NotNull
    public final InMobiUserDataModel copy(@Nullable InMobiUserDataTypes inMobiUserDataTypes, @Nullable InMobiUserDataTypes inMobiUserDataTypes2, @Nullable HashMap<String, String> map) {
        return new InMobiUserDataModel(inMobiUserDataTypes, inMobiUserDataTypes2, map);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InMobiUserDataModel)) {
            return false;
        }
        InMobiUserDataModel inMobiUserDataModel = (InMobiUserDataModel) obj;
        return p.f(this.f28678a, inMobiUserDataModel.f28678a) && p.f(this.f28679b, inMobiUserDataModel.f28679b) && p.f(this.f28680c, inMobiUserDataModel.f28680c);
    }

    @Nullable
    public final InMobiUserDataTypes getEmailId() {
        return this.f28679b;
    }

    @Nullable
    public final HashMap<String, String> getExtras() {
        return this.f28680c;
    }

    @Nullable
    public final InMobiUserDataTypes getPhoneNumber() {
        return this.f28678a;
    }

    public int hashCode() {
        InMobiUserDataTypes inMobiUserDataTypes = this.f28678a;
        int iHashCode = (inMobiUserDataTypes == null ? 0 : inMobiUserDataTypes.hashCode()) * 31;
        InMobiUserDataTypes inMobiUserDataTypes2 = this.f28679b;
        int iHashCode2 = (iHashCode + (inMobiUserDataTypes2 == null ? 0 : inMobiUserDataTypes2.hashCode())) * 31;
        HashMap map = this.f28680c;
        return iHashCode2 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "InMobiUserDataModel(phoneNumber=" + this.f28678a + ", emailId=" + this.f28679b + ", extras=" + this.f28680c + ")";
    }
}
