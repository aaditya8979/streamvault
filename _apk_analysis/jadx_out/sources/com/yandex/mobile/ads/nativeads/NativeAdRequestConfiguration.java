package com.yandex.mobile.ads.nativeads;

import android.location.Location;
import com.yandex.mobile.ads.common.AdTheme;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;

/* JADX INFO: loaded from: classes8.dex */
public final class NativeAdRequestConfiguration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f59194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f59195b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f59196c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f59197d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f59198e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Location f59199f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map f59200g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f59201h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AdTheme f59202i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f59203j;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f59204a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f59205b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f59206c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Location f59207d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f59208e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private List f59209f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Map f59210g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private String f59211h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private AdTheme f59212i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f59213j = true;

        public Builder(@NotNull String str) {
            this.f59204a = str;
        }

        @NotNull
        public final NativeAdRequestConfiguration build() {
            return new NativeAdRequestConfiguration(this.f59204a, this.f59205b, this.f59206c, this.f59208e, this.f59209f, this.f59207d, this.f59210g, this.f59211h, this.f59212i, this.f59213j, null);
        }

        @NotNull
        public final Builder setBiddingData(@NotNull String str) {
            this.f59211h = str;
            return this;
        }

        @NotNull
        public final Builder setParameters(@NotNull Map<String, String> map) {
            this.f59210g = map;
            return this;
        }

        @NotNull
        public final Builder setShouldLoadImagesAutomatically(boolean z10) {
            this.f59213j = z10;
            return this;
        }
    }

    private NativeAdRequestConfiguration(String str, String str2, String str3, String str4, List list, Location location, Map map, String str5, AdTheme adTheme, boolean z10) {
        this.f59194a = str;
        this.f59195b = str2;
        this.f59196c = str3;
        this.f59197d = str4;
        this.f59198e = list;
        this.f59199f = location;
        this.f59200g = map;
        this.f59201h = str5;
        this.f59202i = adTheme;
        this.f59203j = z10;
    }

    public /* synthetic */ NativeAdRequestConfiguration(String str, String str2, String str3, String str4, List list, Location location, Map map, String str5, AdTheme adTheme, boolean z10, i iVar) {
        this(str, str2, str3, str4, list, location, map, str5, adTheme, z10);
    }

    @NotNull
    public final String getAdUnitId() {
        return this.f59194a;
    }

    @Nullable
    public final String getAge() {
        return this.f59195b;
    }

    @Nullable
    public final String getBiddingData() {
        return this.f59201h;
    }

    @Nullable
    public final String getContextQuery() {
        return this.f59197d;
    }

    @Nullable
    public final List<String> getContextTags() {
        return this.f59198e;
    }

    @Nullable
    public final String getGender() {
        return this.f59196c;
    }

    @Nullable
    public final Location getLocation() {
        return this.f59199f;
    }

    @Nullable
    public final Map<String, String> getParameters() {
        return this.f59200g;
    }

    @Nullable
    public final AdTheme getPreferredTheme() {
        return this.f59202i;
    }

    public final boolean getShouldLoadImagesAutomatically() {
        return this.f59203j;
    }
}
