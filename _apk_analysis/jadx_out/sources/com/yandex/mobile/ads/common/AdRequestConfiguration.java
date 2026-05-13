package com.yandex.mobile.ads.common;

import android.location.Location;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;
import yads.k4;

/* JADX INFO: loaded from: classes3.dex */
public final class AdRequestConfiguration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f59131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f59132b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f59133c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f59134d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f59135e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Location f59136f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map f59137g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f59138h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AdTheme f59139i;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f59140a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f59141b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f59142c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Location f59143d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f59144e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private List f59145f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Map f59146g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private String f59147h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private AdTheme f59148i;

        public Builder(@NotNull String str) {
            this.f59140a = str;
        }

        @NotNull
        public final AdRequestConfiguration build() {
            return new AdRequestConfiguration(this.f59140a, this.f59141b, this.f59142c, this.f59144e, this.f59145f, this.f59143d, this.f59146g, this.f59147h, this.f59148i, null);
        }

        @NotNull
        public final Builder setBiddingData(@Nullable String str) {
            this.f59147h = str;
            return this;
        }

        @NotNull
        public final Builder setParameters(@Nullable Map<String, String> map) {
            this.f59146g = map;
            return this;
        }
    }

    private AdRequestConfiguration(String str, String str2, String str3, String str4, List list, Location location, Map map, String str5, AdTheme adTheme) {
        this.f59131a = str;
        this.f59132b = str2;
        this.f59133c = str3;
        this.f59134d = str4;
        this.f59135e = list;
        this.f59136f = location;
        this.f59137g = map;
        this.f59138h = str5;
        this.f59139i = adTheme;
    }

    public /* synthetic */ AdRequestConfiguration(String str, String str2, String str3, String str4, List list, Location location, Map map, String str5, AdTheme adTheme, i iVar) {
        this(str, str2, str3, str4, list, location, map, str5, adTheme);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !p.f(AdRequestConfiguration.class, obj.getClass())) {
            return false;
        }
        AdRequestConfiguration adRequestConfiguration = (AdRequestConfiguration) obj;
        if (p.f(this.f59131a, adRequestConfiguration.f59131a) && p.f(this.f59132b, adRequestConfiguration.f59132b) && p.f(this.f59133c, adRequestConfiguration.f59133c) && p.f(this.f59134d, adRequestConfiguration.f59134d) && p.f(this.f59135e, adRequestConfiguration.f59135e) && p.f(this.f59136f, adRequestConfiguration.f59136f) && p.f(this.f59137g, adRequestConfiguration.f59137g)) {
            return p.f(this.f59138h, adRequestConfiguration.f59138h) && this.f59139i == adRequestConfiguration.f59139i;
        }
        return false;
    }

    @NotNull
    public final String getAdUnitId() {
        return this.f59131a;
    }

    @Nullable
    public final String getAge() {
        return this.f59132b;
    }

    @Nullable
    public final String getBiddingData() {
        return this.f59138h;
    }

    @Nullable
    public final String getContextQuery() {
        return this.f59134d;
    }

    @Nullable
    public final List<String> getContextTags() {
        return this.f59135e;
    }

    @Nullable
    public final String getGender() {
        return this.f59133c;
    }

    @Nullable
    public final Location getLocation() {
        return this.f59136f;
    }

    @Nullable
    public final Map<String, String> getParameters() {
        return this.f59137g;
    }

    @Nullable
    public final AdTheme getPreferredTheme() {
        return this.f59139i;
    }

    public int hashCode() {
        String str = this.f59132b;
        int iA = k4.a(this.f59131a, (str != null ? str.hashCode() : 0) * 31, 31);
        String str2 = this.f59133c;
        int iHashCode = (iA + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f59134d;
        int iHashCode2 = (iHashCode + (str3 != null ? str3.hashCode() : 0)) * 31;
        List list = this.f59135e;
        int iHashCode3 = (iHashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        Location location = this.f59136f;
        int iHashCode4 = (iHashCode3 + (location != null ? location.hashCode() : 0)) * 31;
        Map map = this.f59137g;
        int iHashCode5 = (iHashCode4 + (map != null ? map.hashCode() : 0)) * 31;
        String str4 = this.f59138h;
        int iHashCode6 = (iHashCode5 + (str4 != null ? str4.hashCode() : 0)) * 31;
        AdTheme adTheme = this.f59139i;
        return iHashCode6 + (adTheme != null ? adTheme.hashCode() : 0);
    }
}
