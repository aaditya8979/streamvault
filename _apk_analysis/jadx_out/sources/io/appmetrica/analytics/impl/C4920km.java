package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.km, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C4920km {
    public final Map A;
    public final C9 B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f67146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f67147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f67148c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f67149d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f67150e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f67151f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f67152g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f67153h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Map f67154i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f67155j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f67156k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f67157l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final C4953m4 f67158m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f67159n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f67160o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f67161p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f67162q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Hm f67163r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final C5262ye f67164s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final RetryPolicyConfig f67165t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final long f67166u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final long f67167v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f67168w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final C4746e3 f67169x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final C4976n2 f67170y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Dm f67171z;

    public C4920km(C4894jm c4894jm) {
        this.f67146a = c4894jm.f67045a;
        List list = c4894jm.f67046b;
        this.f67147b = list == null ? null : CollectionUtils.unmodifiableListCopy(list);
        this.f67148c = c4894jm.f67047c;
        this.f67149d = c4894jm.f67048d;
        this.f67150e = c4894jm.f67049e;
        List list2 = c4894jm.f67050f;
        this.f67151f = list2 == null ? null : CollectionUtils.unmodifiableListCopy(list2);
        List list3 = c4894jm.f67051g;
        this.f67152g = list3 == null ? null : CollectionUtils.unmodifiableListCopy(list3);
        List list4 = c4894jm.f67052h;
        this.f67153h = list4 == null ? null : CollectionUtils.unmodifiableListCopy(list4);
        Map map = c4894jm.f67053i;
        this.f67154i = map != null ? CollectionUtils.unmodifiableMapCopy(map) : null;
        this.f67155j = c4894jm.f67054j;
        this.f67156k = c4894jm.f67055k;
        this.f67158m = c4894jm.f67057m;
        this.f67164s = c4894jm.f67058n;
        this.f67159n = c4894jm.f67059o;
        this.f67160o = c4894jm.f67060p;
        this.f67157l = c4894jm.f67056l;
        this.f67161p = c4894jm.f67061q;
        this.f67162q = c4894jm.f67062r;
        this.f67163r = c4894jm.f67063s;
        this.f67166u = c4894jm.f67064t;
        this.f67167v = c4894jm.f67065u;
        this.f67168w = c4894jm.f67066v;
        RetryPolicyConfig retryPolicyConfig = c4894jm.f67067w;
        if (retryPolicyConfig == null) {
            C5245xm c5245xm = new C5245xm();
            this.f67165t = new RetryPolicyConfig(c5245xm.f67983w, c5245xm.f67984x);
        } else {
            this.f67165t = retryPolicyConfig;
        }
        this.f67169x = c4894jm.f67068x;
        this.f67170y = c4894jm.f67069y;
        this.f67171z = c4894jm.f67070z == null ? new Dm(J7.f65433b.f67864a) : c4894jm.f67070z;
        this.A = c4894jm.A == null ? Collections.emptyMap() : c4894jm.A;
        this.B = c4894jm.B;
    }

    public final C4894jm a(C4953m4 c4953m4) {
        C4894jm c4894jm = new C4894jm(c4953m4);
        c4894jm.f67045a = this.f67146a;
        c4894jm.f67050f = this.f67151f;
        c4894jm.f67051g = this.f67152g;
        c4894jm.f67054j = this.f67155j;
        c4894jm.f67046b = this.f67147b;
        c4894jm.f67047c = this.f67148c;
        c4894jm.f67048d = this.f67149d;
        c4894jm.f67049e = this.f67150e;
        c4894jm.f67052h = this.f67153h;
        c4894jm.f67053i = this.f67154i;
        c4894jm.f67055k = this.f67156k;
        c4894jm.f67056l = this.f67157l;
        c4894jm.f67061q = this.f67161p;
        c4894jm.f67059o = this.f67159n;
        c4894jm.f67060p = this.f67160o;
        c4894jm.f67062r = this.f67162q;
        c4894jm.f67058n = this.f67164s;
        c4894jm.f67064t = this.f67166u;
        c4894jm.f67065u = this.f67167v;
        c4894jm.f67063s = this.f67163r;
        c4894jm.f67066v = this.f67168w;
        c4894jm.f67067w = this.f67165t;
        c4894jm.f67068x = this.f67169x;
        c4894jm.f67069y = this.f67170y;
        c4894jm.f67070z = this.f67171z;
        c4894jm.A = this.A;
        c4894jm.B = this.B;
        return c4894jm;
    }

    public final String toString() {
        return "StartupStateModel{uuid='" + this.f67146a + "', reportUrls=" + this.f67147b + ", getAdUrl='" + this.f67148c + "', reportAdUrl='" + this.f67149d + "', certificateUrl='" + this.f67150e + "', hostUrlsFromStartup=" + this.f67151f + ", hostUrlsFromClient=" + this.f67152g + ", diagnosticUrls=" + this.f67153h + ", customSdkHosts=" + this.f67154i + ", encodedClidsFromResponse='" + this.f67155j + "', lastClientClidsForStartupRequest='" + this.f67156k + "', lastChosenForRequestClids='" + this.f67157l + "', collectingFlags=" + this.f67158m + ", obtainTime=" + this.f67159n + ", hadFirstStartup=" + this.f67160o + ", startupDidNotOverrideClids=" + this.f67161p + ", countryInit='" + this.f67162q + "', statSending=" + this.f67163r + ", permissionsCollectingConfig=" + this.f67164s + ", retryPolicyConfig=" + this.f67165t + ", obtainServerTime=" + this.f67166u + ", firstStartupServerTime=" + this.f67167v + ", outdated=" + this.f67168w + ", cacheControl=" + this.f67169x + ", attributionConfig=" + this.f67170y + ", startupUpdateConfig=" + this.f67171z + ", modulesRemoteConfigs=" + this.A + ", externalAttributionConfig=" + this.B + '}';
    }
}
