package com.moloco.sdk.publisher.bidrequest;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import so.k;
import tn.i;
import tn.p;
import vo.d;
import wo.c2;
import wo.l0;
import wo.r2;
import wo.w2;

/* JADX INFO: loaded from: classes7.dex */
@StabilityInferred(parameters = 1)
@k
public final class Geo {
    public static final int $stable = 0;

    @NotNull
    public static final Companion Companion = new Companion(null);

    @Nullable
    private final String city;

    @Nullable
    private final String country;

    @Nullable
    private final Float latitude;

    @Nullable
    private final Float longitude;

    @Nullable
    private final String region;

    @Nullable
    private final String zipCode;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        @NotNull
        public final KSerializer<Geo> serializer() {
            return Geo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ Geo(int i10, String str, String str2, String str3, String str4, Float f10, Float f11, r2 r2Var) {
        if (63 != (i10 & 63)) {
            c2.a(i10, 63, Geo$$serializer.INSTANCE.getDescriptor());
        }
        this.city = str;
        this.country = str2;
        this.region = str3;
        this.zipCode = str4;
        this.latitude = f10;
        this.longitude = f11;
    }

    public Geo(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Float f10, @Nullable Float f11) {
        this.city = str;
        this.country = str2;
        this.region = str3;
        this.zipCode = str4;
        this.latitude = f10;
        this.longitude = f11;
    }

    public static /* synthetic */ Geo copy$default(Geo geo, String str, String str2, String str3, String str4, Float f10, Float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = geo.city;
        }
        if ((i10 & 2) != 0) {
            str2 = geo.country;
        }
        String str5 = str2;
        if ((i10 & 4) != 0) {
            str3 = geo.region;
        }
        String str6 = str3;
        if ((i10 & 8) != 0) {
            str4 = geo.zipCode;
        }
        String str7 = str4;
        if ((i10 & 16) != 0) {
            f10 = geo.latitude;
        }
        Float f12 = f10;
        if ((i10 & 32) != 0) {
            f11 = geo.longitude;
        }
        return geo.copy(str, str5, str6, str7, f12, f11);
    }

    public static final /* synthetic */ void write$Self$moloco_sdk_release(Geo geo, d dVar, SerialDescriptor serialDescriptor) {
        w2 w2Var = w2.f86635a;
        dVar.f(serialDescriptor, 0, w2Var, geo.city);
        dVar.f(serialDescriptor, 1, w2Var, geo.country);
        dVar.f(serialDescriptor, 2, w2Var, geo.region);
        dVar.f(serialDescriptor, 3, w2Var, geo.zipCode);
        l0 l0Var = l0.f86565a;
        dVar.f(serialDescriptor, 4, l0Var, geo.latitude);
        dVar.f(serialDescriptor, 5, l0Var, geo.longitude);
    }

    @Nullable
    public final String component1() {
        return this.city;
    }

    @Nullable
    public final String component2() {
        return this.country;
    }

    @Nullable
    public final String component3() {
        return this.region;
    }

    @Nullable
    public final String component4() {
        return this.zipCode;
    }

    @Nullable
    public final Float component5() {
        return this.latitude;
    }

    @Nullable
    public final Float component6() {
        return this.longitude;
    }

    @NotNull
    public final Geo copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Float f10, @Nullable Float f11) {
        return new Geo(str, str2, str3, str4, f10, f11);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Geo)) {
            return false;
        }
        Geo geo = (Geo) obj;
        return p.f(this.city, geo.city) && p.f(this.country, geo.country) && p.f(this.region, geo.region) && p.f(this.zipCode, geo.zipCode) && p.f(this.latitude, geo.latitude) && p.f(this.longitude, geo.longitude);
    }

    @Nullable
    public final String getCity() {
        return this.city;
    }

    @Nullable
    public final String getCountry() {
        return this.country;
    }

    @Nullable
    public final Float getLatitude() {
        return this.latitude;
    }

    @Nullable
    public final Float getLongitude() {
        return this.longitude;
    }

    @Nullable
    public final String getRegion() {
        return this.region;
    }

    @Nullable
    public final String getZipCode() {
        return this.zipCode;
    }

    public int hashCode() {
        String str = this.city;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.country;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.region;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.zipCode;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Float f10 = this.latitude;
        int iHashCode5 = (iHashCode4 + (f10 == null ? 0 : f10.hashCode())) * 31;
        Float f11 = this.longitude;
        return iHashCode5 + (f11 != null ? f11.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "Geo(city=" + this.city + ", country=" + this.country + ", region=" + this.region + ", zipCode=" + this.zipCode + ", latitude=" + this.latitude + ", longitude=" + this.longitude + ')';
    }
}
