package tf;

import android.graphics.Bitmap;
import android.net.Uri;

/* JADX INFO: compiled from: CropParameters.java */
/* JADX INFO: loaded from: classes10.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f85247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f85248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Bitmap.CompressFormat f85249c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f85250d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f85251e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f85252f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public b f85253g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Uri f85254h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Uri f85255i;

    public a(int i10, int i11, Bitmap.CompressFormat compressFormat, int i12, String str, String str2, b bVar) {
        this.f85247a = i10;
        this.f85248b = i11;
        this.f85249c = compressFormat;
        this.f85250d = i12;
        this.f85251e = str;
        this.f85252f = str2;
        this.f85253g = bVar;
    }

    public Bitmap.CompressFormat a() {
        return this.f85249c;
    }

    public int b() {
        return this.f85250d;
    }

    public Uri c() {
        return this.f85254h;
    }

    public Uri d() {
        return this.f85255i;
    }

    public b e() {
        return this.f85253g;
    }

    public String f() {
        return this.f85251e;
    }

    public String g() {
        return this.f85252f;
    }

    public int h() {
        return this.f85247a;
    }

    public int i() {
        return this.f85248b;
    }

    public void j(Uri uri) {
        this.f85254h = uri;
    }

    public void k(Uri uri) {
        this.f85255i = uri;
    }
}
