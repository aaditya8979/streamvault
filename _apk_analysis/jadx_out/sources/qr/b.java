package qr;

import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/* JADX INFO: compiled from: DeviceDetails.java */
/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Logger f78427k = Logger.getLogger(b.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final URL f78428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f78429b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f78430c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h f78431d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f78432e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f78433f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final URI f78434g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ur.h[] f78435h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ur.g f78436i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ur.g f78437j;

    public b(String str, g gVar, h hVar) {
        this(null, str, gVar, hVar, null, null, null);
    }

    public b(URL url, String str, g gVar, h hVar, String str2, String str3, URI uri) {
        this(url, str, gVar, hVar, str2, str3, uri, null, null);
    }

    public b(URL url, String str, g gVar, h hVar, String str2, String str3, URI uri, ur.h[] hVarArr, ur.g gVar2) {
        this(url, str, gVar, hVar, str2, str3, uri, hVarArr, gVar2, null);
    }

    public b(URL url, String str, g gVar, h hVar, String str2, String str3, URI uri, ur.h[] hVarArr, ur.g gVar2, ur.g gVar3) {
        this.f78428a = url;
        this.f78429b = str;
        this.f78430c = gVar == null ? new g() : gVar;
        this.f78431d = hVar == null ? new h() : hVar;
        this.f78432e = str2;
        this.f78433f = str3;
        this.f78434g = uri;
        this.f78435h = hVarArr == null ? new ur.h[0] : hVarArr;
        this.f78436i = gVar2;
        this.f78437j = gVar3;
    }

    public URL a() {
        return this.f78428a;
    }

    public ur.g b() {
        return this.f78436i;
    }

    public ur.h[] c() {
        return this.f78435h;
    }

    public String d() {
        return this.f78429b;
    }

    public g e() {
        return this.f78430c;
    }

    public h f() {
        return this.f78431d;
    }

    public URI g() {
        return this.f78434g;
    }

    public ur.g h() {
        return this.f78437j;
    }

    public String i() {
        return this.f78432e;
    }

    public String j() {
        return this.f78433f;
    }

    public List<ir.k> k() {
        ArrayList arrayList = new ArrayList();
        if (j() != null) {
            if (j().length() != 12) {
                f78427k.fine("UPnP specification violation, UPC must be 12 digits: " + j());
            } else {
                try {
                    Long.parseLong(j());
                } catch (NumberFormatException unused) {
                    f78427k.fine("UPnP specification violation, UPC must be 12 digits all-numeric: " + j());
                }
            }
        }
        return arrayList;
    }
}
