package o8;

import java.util.List;

/* JADX INFO: compiled from: DecoderResult.java */
/* JADX INFO: loaded from: classes7.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f76291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f76292b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f76293c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<byte[]> f76294d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f76295e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Integer f76296f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Integer f76297g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f76298h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f76299i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f76300j;

    public d(byte[] bArr, String str, List<byte[]> list, String str2) {
        this(bArr, str, list, str2, -1, -1);
    }

    public d(byte[] bArr, String str, List<byte[]> list, String str2, int i10, int i11) {
        this.f76291a = bArr;
        this.f76292b = bArr == null ? 0 : bArr.length * 8;
        this.f76293c = str;
        this.f76294d = list;
        this.f76295e = str2;
        this.f76299i = i11;
        this.f76300j = i10;
    }

    public List<byte[]> a() {
        return this.f76294d;
    }

    public String b() {
        return this.f76295e;
    }

    public int c() {
        return this.f76292b;
    }

    public Object d() {
        return this.f76298h;
    }

    public byte[] e() {
        return this.f76291a;
    }

    public int f() {
        return this.f76299i;
    }

    public int g() {
        return this.f76300j;
    }

    public String h() {
        return this.f76293c;
    }

    public boolean i() {
        return this.f76299i >= 0 && this.f76300j >= 0;
    }

    public void j(Integer num) {
        this.f76297g = num;
    }

    public void k(Integer num) {
        this.f76296f = num;
    }

    public void l(int i10) {
        this.f76292b = i10;
    }

    public void m(Object obj) {
        this.f76298h = obj;
    }
}
