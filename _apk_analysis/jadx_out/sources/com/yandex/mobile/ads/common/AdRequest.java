package com.yandex.mobile.ads.common;

import android.location.Location;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;

/* JADX INFO: loaded from: classes8.dex */
public final class AdRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f59115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f59116b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Location f59117c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f59118d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f59119e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map f59120f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f59121g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AdTheme f59122h;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f59123a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f59124b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Location f59125c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f59126d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private List f59127e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Map f59128f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f59129g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private AdTheme f59130h;

        @NotNull
        public final AdRequest build() {
            return new AdRequest(this.f59123a, this.f59124b, this.f59125c, this.f59126d, this.f59127e, this.f59128f, this.f59129g, this.f59130h, null);
        }

        @NotNull
        public final Builder setBiddingData(@Nullable String str) {
            this.f59129g = str;
            return this;
        }

        @NotNull
        public final Builder setParameters(@Nullable Map<String, String> map) {
            this.f59128f = map;
            return this;
        }
    }

    public /* synthetic */ AdRequest(String str, String str2, Location location, String str3, List list, Map map, String str4, AdTheme adTheme, i iVar) {
        this(str, str2, str3, str4, list, location, map, adTheme);
    }

    private AdRequest(String str, String str2, String str3, String str4, List list, Location location, Map map, AdTheme adTheme) {
        this.f59115a = str;
        this.f59116b = str2;
        this.f59117c = location;
        this.f59118d = str3;
        this.f59119e = list;
        this.f59120f = map;
        this.f59121g = str4;
        this.f59122h = adTheme;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !p.f(AdRequest.class, obj.getClass())) {
            return false;
        }
        AdRequest adRequest = (AdRequest) obj;
        if (p.f(this.f59115a, adRequest.f59115a) && p.f(this.f59116b, adRequest.f59116b) && p.f(this.f59118d, adRequest.f59118d) && p.f(this.f59119e, adRequest.f59119e) && p.f(this.f59117c, adRequest.f59117c) && p.f(this.f59120f, adRequest.f59120f)) {
            return p.f(this.f59121g, adRequest.f59121g) && this.f59122h == adRequest.f59122h;
        }
        return false;
    }

    @Nullable
    public final String getAge() {
        return this.f59115a;
    }

    @Nullable
    public final String getBiddingData() {
        return this.f59121g;
    }

    @Nullable
    public final String getContextQuery() {
        return this.f59118d;
    }

    @Nullable
    public final List<String> getContextTags() {
        return this.f59119e;
    }

    @Nullable
    public final String getGender() {
        return this.f59116b;
    }

    @Nullable
    public final Location getLocation() {
        return this.f59117c;
    }

    @Nullable
    public final Map<String, String> getParameters() {
        return this.f59120f;
    }

    @Nullable
    public final AdTheme getPreferredTheme() {
        return this.f59122h;
    }

    public int hashCode() {
        String str = this.f59115a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f59116b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f59118d;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        List list = this.f59119e;
        int iHashCode4 = (iHashCode3 + (list != null ? list.hashCode() : 0)) * 31;
        Location location = this.f59117c;
        int iHashCode5 = (iHashCode4 + (location != null ? location.hashCode() : 0)) * 31;
        Map map = this.f59120f;
        int iHashCode6 = (iHashCode5 + (map != null ? map.hashCode() : 0)) * 31;
        String str4 = this.f59121g;
        int iHashCode7 = (iHashCode6 + (str4 != null ? str4.hashCode() : 0)) * 31;
        AdTheme adTheme = this.f59122h;
        return iHashCode7 + (adTheme != null ? adTheme.hashCode() : 0);
    }
}
