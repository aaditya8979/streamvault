package com.mbridge.msdk.thrid.okhttp;

import androidx.browser.trusted.sharing.ShareTarget;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: FormBody.java */
/* JADX INFO: loaded from: classes9.dex */
public final class p extends z {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final u f40702c = u.a(ShareTarget.ENCODING_TYPE_URL_ENCODED);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<String> f40703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<String> f40704b;

    /* JADX INFO: compiled from: FormBody.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<String> f40705a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List<String> f40706b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Charset f40707c;

        public a() {
            this(null);
        }

        public a(Charset charset) {
            this.f40705a = new ArrayList();
            this.f40706b = new ArrayList();
            this.f40707c = charset;
        }

        public a a(String str, String str2) {
            if (str == null) {
                throw new NullPointerException("name == null");
            }
            if (str2 == null) {
                throw new NullPointerException("value == null");
            }
            this.f40705a.add(s.a(str, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, true, this.f40707c));
            this.f40706b.add(s.a(str2, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, true, this.f40707c));
            return this;
        }

        public p a() {
            return new p(this.f40705a, this.f40706b);
        }
    }

    public p(List<String> list, List<String> list2) {
        this.f40703a = com.mbridge.msdk.thrid.okhttp.internal.c.a(list);
        this.f40704b = com.mbridge.msdk.thrid.okhttp.internal.c.a(list2);
    }

    private long a(com.mbridge.msdk.thrid.okio.d dVar, boolean z10) {
        com.mbridge.msdk.thrid.okio.c cVar = z10 ? new com.mbridge.msdk.thrid.okio.c() : dVar.a();
        int size = this.f40703a.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (i10 > 0) {
                cVar.writeByte(38);
            }
            cVar.a(this.f40703a.get(i10));
            cVar.writeByte(61);
            cVar.a(this.f40704b.get(i10));
        }
        if (!z10) {
            return 0L;
        }
        long size2 = cVar.size();
        cVar.k();
        return size2;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.z
    public long a() {
        return a((com.mbridge.msdk.thrid.okio.d) null, true);
    }

    @Override // com.mbridge.msdk.thrid.okhttp.z
    public void a(com.mbridge.msdk.thrid.okio.d dVar) throws IOException {
        a(dVar, false);
    }

    @Override // com.mbridge.msdk.thrid.okhttp.z
    public u b() {
        return f40702c;
    }
}
