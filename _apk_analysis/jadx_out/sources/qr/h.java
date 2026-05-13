package qr;

import java.net.URI;

/* JADX INFO: compiled from: ModelDetails.java */
/* JADX INFO: loaded from: classes3.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f78456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f78457b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f78458c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public URI f78459d;

    public h() {
    }

    public h(String str, String str2, String str3, String str4) throws IllegalArgumentException {
        this.f78456a = str;
        this.f78457b = str2;
        this.f78458c = str3;
        this.f78459d = URI.create(str4);
    }

    public h(String str, String str2, String str3, URI uri) {
        this.f78456a = str;
        this.f78457b = str2;
        this.f78458c = str3;
        this.f78459d = uri;
    }

    public String a() {
        return this.f78457b;
    }

    public String b() {
        return this.f78456a;
    }

    public String c() {
        return this.f78458c;
    }

    public URI d() {
        return this.f78459d;
    }
}
