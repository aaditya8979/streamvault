package gl;

import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import gl.k;
import io.ktor.http.BadContentTypeFormatException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ContentTypes.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class f extends k {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final b f62497f = new b(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final f f62498g = new f("*", "*", null, 4, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f62499d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final String f62500e;

    /* JADX INFO: compiled from: ContentTypes.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f62501a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final f f62502b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public static final f f62503c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public static final f f62504d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public static final f f62505e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public static final f f62506f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        public static final f f62507g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @NotNull
        public static final f f62508h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @NotNull
        public static final f f62509i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @NotNull
        public static final f f62510j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @NotNull
        public static final f f62511k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        @NotNull
        public static final f f62512l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        @NotNull
        public static final f f62513m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        @NotNull
        public static final f f62514n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        @NotNull
        public static final f f62515o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        @NotNull
        public static final f f62516p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        @NotNull
        public static final f f62517q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        @NotNull
        public static final f f62518r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        @NotNull
        public static final f f62519s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        @NotNull
        public static final f f62520t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        @NotNull
        public static final f f62521u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        @NotNull
        public static final f f62522v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        @NotNull
        public static final f f62523w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        @NotNull
        public static final f f62524x;

        static {
            List list = null;
            int i10 = 4;
            tn.i iVar = null;
            f62502b = new f("application", "*", list, i10, iVar);
            List list2 = null;
            int i11 = 4;
            tn.i iVar2 = null;
            f62503c = new f("application", "atom+xml", list2, i11, iVar2);
            f62504d = new f("application", "cbor", list, i10, iVar);
            f62505e = new f("application", "json", list2, i11, iVar2);
            f62506f = new f("application", "hal+json", list, i10, iVar);
            f62507g = new f("application", "javascript", list2, i11, iVar2);
            f62508h = new f("application", "octet-stream", list, i10, iVar);
            f62509i = new f("application", "rss+xml", list2, i11, iVar2);
            f62510j = new f("application", "soap+xml", list, i10, iVar);
            f62511k = new f("application", "xml", list2, i11, iVar2);
            f62512l = new f("application", "xml-dtd", list, i10, iVar);
            f62513m = new f("application", "yaml", list2, i11, iVar2);
            f62514n = new f("application", "zip", list, i10, iVar);
            f62515o = new f("application", "gzip", list2, i11, iVar2);
            f62516p = new f("application", "x-www-form-urlencoded", list, i10, iVar);
            f62517q = new f("application", "pdf", list2, i11, iVar2);
            f62518r = new f("application", "vnd.openxmlformats-officedocument.spreadsheetml.sheet", list, i10, iVar);
            f62519s = new f("application", "vnd.openxmlformats-officedocument.wordprocessingml.document", list2, i11, iVar2);
            f62520t = new f("application", "vnd.openxmlformats-officedocument.presentationml.presentation", list, i10, iVar);
            f62521u = new f("application", "protobuf", list2, i11, iVar2);
            f62522v = new f("application", "wasm", list, i10, iVar);
            f62523w = new f("application", "problem+json", list2, i11, iVar2);
            f62524x = new f("application", "problem+xml", list, i10, iVar);
        }

        @NotNull
        public final f a() {
            return f62508h;
        }

        @NotNull
        public final f b() {
            return f62521u;
        }
    }

    /* JADX INFO: compiled from: ContentTypes.kt */
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(tn.i iVar) {
            this();
        }

        @NotNull
        public final f a() {
            return f.f62498g;
        }

        @NotNull
        public final f b(@NotNull String str) throws BadContentTypeFormatException {
            tn.p.k(str, "value");
            if (bo.d0.u0(str)) {
                return a();
            }
            k.a aVar = k.f62553c;
            i iVar = (i) cn.f0.F0(r.d(str));
            String strB = iVar.b();
            List<j> listA = iVar.a();
            int iQ0 = bo.d0.q0(strB, '/', 0, false, 6, null);
            if (iQ0 == -1) {
                if (tn.p.f(bo.d0.s1(strB).toString(), "*")) {
                    return f.f62497f.a();
                }
                throw new BadContentTypeFormatException(str);
            }
            String strSubstring = strB.substring(0, iQ0);
            tn.p.j(strSubstring, "substring(...)");
            String string = bo.d0.s1(strSubstring).toString();
            if (string.length() == 0) {
                throw new BadContentTypeFormatException(str);
            }
            String strSubstring2 = strB.substring(iQ0 + 1);
            tn.p.j(strSubstring2, "substring(...)");
            String string2 = bo.d0.s1(strSubstring2).toString();
            if (bo.d0.b0(string, ' ', false, 2, null) || bo.d0.b0(string2, ' ', false, 2, null)) {
                throw new BadContentTypeFormatException(str);
            }
            if ((string2.length() == 0) || bo.d0.b0(string2, '/', false, 2, null)) {
                throw new BadContentTypeFormatException(str);
            }
            return new f(string, string2, listA);
        }
    }

    /* JADX INFO: compiled from: ContentTypes.kt */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final c f62525a = new c();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final f f62526b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public static final f f62527c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public static final f f62528d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public static final f f62529e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public static final f f62530f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        public static final f f62531g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @NotNull
        public static final f f62532h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @NotNull
        public static final f f62533i;

        static {
            List list = null;
            int i10 = 4;
            tn.i iVar = null;
            f62526b = new f("multipart", "*", list, i10, iVar);
            List list2 = null;
            int i11 = 4;
            tn.i iVar2 = null;
            f62527c = new f("multipart", "mixed", list2, i11, iVar2);
            f62528d = new f("multipart", "alternative", list, i10, iVar);
            f62529e = new f("multipart", "related", list2, i11, iVar2);
            f62530f = new f("multipart", "form-data", list, i10, iVar);
            f62531g = new f("multipart", "signed", list2, i11, iVar2);
            f62532h = new f("multipart", "encrypted", list, i10, iVar);
            f62533i = new f("multipart", "byteranges", list2, i11, iVar2);
        }

        public final boolean a(@NotNull CharSequence charSequence) {
            tn.p.k(charSequence, "contentType");
            return bo.d0.X0(charSequence, "multipart/", true);
        }

        @NotNull
        public final f b() {
            return f62530f;
        }
    }

    /* JADX INFO: compiled from: ContentTypes.kt */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final d f62534a = new d();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final f f62535b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public static final f f62536c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public static final f f62537d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public static final f f62538e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public static final f f62539f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        public static final f f62540g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @NotNull
        public static final f f62541h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @NotNull
        public static final f f62542i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @NotNull
        public static final f f62543j;

        static {
            List list = null;
            int i10 = 4;
            tn.i iVar = null;
            f62535b = new f("text", "*", list, i10, iVar);
            List list2 = null;
            int i11 = 4;
            tn.i iVar2 = null;
            f62536c = new f("text", "plain", list2, i11, iVar2);
            f62537d = new f("text", "css", list, i10, iVar);
            f62538e = new f("text", "csv", list2, i11, iVar2);
            f62539f = new f("text", CreativeInfo.f52467al, list, i10, iVar);
            f62540g = new f("text", "javascript", list2, i11, iVar2);
            f62541h = new f("text", "vcard", list, i10, iVar);
            f62542i = new f("text", "xml", list2, i11, iVar2);
            f62543j = new f("text", "event-stream", list, i10, iVar);
        }

        @NotNull
        public final f a() {
            return f62536c;
        }
    }

    public f(String str, String str2, String str3, List<j> list) {
        super(str3, list);
        this.f62499d = str;
        this.f62500e = str2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f(@NotNull String str, @NotNull String str2, @NotNull List<j> list) {
        this(str, str2, str + '/' + str2, list);
        tn.p.k(str, "contentType");
        tn.p.k(str2, "contentSubtype");
        tn.p.k(list, "parameters");
    }

    public /* synthetic */ f(String str, String str2, List list, int i10, tn.i iVar) {
        this(str, str2, (i10 & 4) != 0 ? cn.w.m() : list);
    }

    @NotNull
    public final String e() {
        return this.f62499d;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (bo.a0.J(this.f62499d, fVar.f62499d, true) && bo.a0.J(this.f62500e, fVar.f62500e, true) && tn.p.f(b(), fVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final boolean f(String str, String str2) {
        int size = b().size();
        if (size == 0) {
            return false;
        }
        if (size != 1) {
            List<j> listB = b();
            if ((listB instanceof Collection) && listB.isEmpty()) {
                return false;
            }
            for (j jVar : listB) {
                if (bo.a0.J(jVar.c(), str, true) && bo.a0.J(jVar.d(), str2, true)) {
                }
            }
            return false;
        }
        j jVar2 = b().get(0);
        if (!bo.a0.J(jVar2.c(), str, true) || !bo.a0.J(jVar2.d(), str2, true)) {
            return false;
        }
        return true;
    }

    public final boolean g(@NotNull f fVar) {
        boolean zJ;
        tn.p.k(fVar, "pattern");
        if (!tn.p.f(fVar.f62499d, "*") && !bo.a0.J(fVar.f62499d, this.f62499d, true)) {
            return false;
        }
        if (!tn.p.f(fVar.f62500e, "*") && !bo.a0.J(fVar.f62500e, this.f62500e, true)) {
            return false;
        }
        for (j jVar : fVar.b()) {
            String strA = jVar.a();
            String strB = jVar.b();
            if (tn.p.f(strA, "*")) {
                if (!tn.p.f(strB, "*")) {
                    List<j> listB = b();
                    if (!(listB instanceof Collection) || !listB.isEmpty()) {
                        Iterator<T> it = listB.iterator();
                        while (it.hasNext()) {
                            if (bo.a0.J(((j) it.next()).d(), strB, true)) {
                            }
                        }
                    }
                    zJ = false;
                }
                zJ = true;
                break;
            }
            String strC = c(strA);
            if (!tn.p.f(strB, "*")) {
                zJ = bo.a0.J(strC, strB, true);
            } else {
                if (strC != null) {
                    zJ = true;
                    break;
                    break;
                }
                zJ = false;
            }
            if (!zJ) {
                return false;
            }
        }
        return true;
    }

    @NotNull
    public final f h(@NotNull String str, @NotNull String str2) {
        tn.p.k(str, "name");
        tn.p.k(str2, "value");
        return f(str, str2) ? this : new f(this.f62499d, this.f62500e, a(), cn.f0.P0(b(), new j(str, str2)));
    }

    public int hashCode() {
        String str = this.f62499d;
        Locale locale = Locale.ROOT;
        String lowerCase = str.toLowerCase(locale);
        tn.p.j(lowerCase, "toLowerCase(...)");
        int iHashCode = lowerCase.hashCode();
        String lowerCase2 = this.f62500e.toLowerCase(locale);
        tn.p.j(lowerCase2, "toLowerCase(...)");
        return iHashCode + (iHashCode * 31) + lowerCase2.hashCode() + (b().hashCode() * 31);
    }
}
