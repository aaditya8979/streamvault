package com.google.android.exoplayer2;

import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.f;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.p;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import s7.m0;

/* JADX INFO: compiled from: MediaItem.java */
/* JADX INFO: loaded from: classes5.dex */
public final class p implements com.google.android.exoplayer2.f {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final p f22030j = new c().a();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final f.a<p> f22031k = new f.a() { // from class: d6.c1
        @Override // com.google.android.exoplayer2.f.a
        public final com.google.android.exoplayer2.f fromBundle(Bundle bundle) {
            return com.google.android.exoplayer2.p.c(bundle);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f22032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final h f22033c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    @Deprecated
    public final i f22034d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g f22035e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final q f22036f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d f22037g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Deprecated
    public final e f22038h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final j f22039i;

    /* JADX INFO: compiled from: MediaItem.java */
    public static final class b {
    }

    /* JADX INFO: compiled from: MediaItem.java */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public String f22040a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public Uri f22041b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public String f22042c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public d.a f22043d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public f.a f22044e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public List<StreamKey> f22045f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Nullable
        public String f22046g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public ImmutableList<l> f22047h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @Nullable
        public Object f22048i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @Nullable
        public q f22049j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public g.a f22050k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public j f22051l;

        public c() {
            this.f22043d = new d.a();
            this.f22044e = new f.a();
            this.f22045f = Collections.emptyList();
            this.f22047h = ImmutableList.of();
            this.f22050k = new g.a();
            this.f22051l = j.f22104e;
        }

        public c(p pVar) {
            this();
            this.f22043d = pVar.f22037g.b();
            this.f22040a = pVar.f22032b;
            this.f22049j = pVar.f22036f;
            this.f22050k = pVar.f22035e.b();
            this.f22051l = pVar.f22039i;
            h hVar = pVar.f22033c;
            if (hVar != null) {
                this.f22046g = hVar.f22100e;
                this.f22042c = hVar.f22097b;
                this.f22041b = hVar.f22096a;
                this.f22045f = hVar.f22099d;
                this.f22047h = hVar.f22101f;
                this.f22048i = hVar.f22103h;
                f fVar = hVar.f22098c;
                this.f22044e = fVar != null ? fVar.b() : new f.a();
            }
        }

        public p a() {
            i iVar;
            s7.a.g(this.f22044e.f22077b == null || this.f22044e.f22076a != null);
            Uri uri = this.f22041b;
            if (uri != null) {
                iVar = new i(uri, this.f22042c, this.f22044e.f22076a != null ? this.f22044e.i() : null, null, this.f22045f, this.f22046g, this.f22047h, this.f22048i);
            } else {
                iVar = null;
            }
            String str = this.f22040a;
            if (str == null) {
                str = "";
            }
            String str2 = str;
            e eVarG = this.f22043d.g();
            g gVarF = this.f22050k.f();
            q qVar = this.f22049j;
            if (qVar == null) {
                qVar = q.H;
            }
            return new p(str2, eVarG, iVar, gVarF, qVar, this.f22051l);
        }

        public c b(@Nullable String str) {
            this.f22046g = str;
            return this;
        }

        public c c(g gVar) {
            this.f22050k = gVar.b();
            return this;
        }

        public c d(String str) {
            this.f22040a = (String) s7.a.e(str);
            return this;
        }

        public c e(List<l> list) {
            this.f22047h = ImmutableList.copyOf((Collection) list);
            return this;
        }

        public c f(@Nullable Object obj) {
            this.f22048i = obj;
            return this;
        }

        public c g(@Nullable Uri uri) {
            this.f22041b = uri;
            return this;
        }

        public c h(@Nullable String str) {
            return g(str == null ? null : Uri.parse(str));
        }
    }

    /* JADX INFO: compiled from: MediaItem.java */
    public static class d implements com.google.android.exoplayer2.f {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final d f22052g = new a().f();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final f.a<e> f22053h = new f.a() { // from class: d6.d1
            @Override // com.google.android.exoplayer2.f.a
            public final com.google.android.exoplayer2.f fromBundle(Bundle bundle) {
                return p.d.d(bundle);
            }
        };

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @IntRange(from = 0)
        public final long f22054b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f22055c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f22056d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f22057e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f22058f;

        /* JADX INFO: compiled from: MediaItem.java */
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public long f22059a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public long f22060b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public boolean f22061c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public boolean f22062d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public boolean f22063e;

            public a() {
                this.f22060b = Long.MIN_VALUE;
            }

            public a(d dVar) {
                this.f22059a = dVar.f22054b;
                this.f22060b = dVar.f22055c;
                this.f22061c = dVar.f22056d;
                this.f22062d = dVar.f22057e;
                this.f22063e = dVar.f22058f;
            }

            public d f() {
                return g();
            }

            @Deprecated
            public e g() {
                return new e(this);
            }

            public a h(long j10) {
                s7.a.a(j10 == Long.MIN_VALUE || j10 >= 0);
                this.f22060b = j10;
                return this;
            }

            public a i(boolean z10) {
                this.f22062d = z10;
                return this;
            }

            public a j(boolean z10) {
                this.f22061c = z10;
                return this;
            }

            public a k(@IntRange(from = 0) long j10) {
                s7.a.a(j10 >= 0);
                this.f22059a = j10;
                return this;
            }

            public a l(boolean z10) {
                this.f22063e = z10;
                return this;
            }
        }

        public d(a aVar) {
            this.f22054b = aVar.f22059a;
            this.f22055c = aVar.f22060b;
            this.f22056d = aVar.f22061c;
            this.f22057e = aVar.f22062d;
            this.f22058f = aVar.f22063e;
        }

        public static String c(int i10) {
            return Integer.toString(i10, 36);
        }

        public static /* synthetic */ e d(Bundle bundle) {
            return new a().k(bundle.getLong(c(0), 0L)).h(bundle.getLong(c(1), Long.MIN_VALUE)).j(bundle.getBoolean(c(2), false)).i(bundle.getBoolean(c(3), false)).l(bundle.getBoolean(c(4), false)).g();
        }

        public a b() {
            return new a();
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f22054b == dVar.f22054b && this.f22055c == dVar.f22055c && this.f22056d == dVar.f22056d && this.f22057e == dVar.f22057e && this.f22058f == dVar.f22058f;
        }

        public int hashCode() {
            long j10 = this.f22054b;
            int i10 = ((int) (j10 ^ (j10 >>> 32))) * 31;
            long j11 = this.f22055c;
            return ((((((i10 + ((int) ((j11 >>> 32) ^ j11))) * 31) + (this.f22056d ? 1 : 0)) * 31) + (this.f22057e ? 1 : 0)) * 31) + (this.f22058f ? 1 : 0);
        }

        @Override // com.google.android.exoplayer2.f
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putLong(c(0), this.f22054b);
            bundle.putLong(c(1), this.f22055c);
            bundle.putBoolean(c(2), this.f22056d);
            bundle.putBoolean(c(3), this.f22057e);
            bundle.putBoolean(c(4), this.f22058f);
            return bundle;
        }
    }

    /* JADX INFO: compiled from: MediaItem.java */
    @Deprecated
    public static final class e extends d {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final e f22064i = new d.a().g();

        public e(d.a aVar) {
            super(aVar);
        }
    }

    /* JADX INFO: compiled from: MediaItem.java */
    public static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UUID f22065a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Deprecated
        public final UUID f22066b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public final Uri f22067c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Deprecated
        public final ImmutableMap<String, String> f22068d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final ImmutableMap<String, String> f22069e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f22070f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f22071g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f22072h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @Deprecated
        public final ImmutableList<Integer> f22073i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final ImmutableList<Integer> f22074j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @Nullable
        public final byte[] f22075k;

        /* JADX INFO: compiled from: MediaItem.java */
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @Nullable
            public UUID f22076a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @Nullable
            public Uri f22077b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public ImmutableMap<String, String> f22078c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public boolean f22079d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public boolean f22080e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public boolean f22081f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public ImmutableList<Integer> f22082g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            @Nullable
            public byte[] f22083h;

            @Deprecated
            public a() {
                this.f22078c = ImmutableMap.of();
                this.f22082g = ImmutableList.of();
            }

            public a(f fVar) {
                this.f22076a = fVar.f22065a;
                this.f22077b = fVar.f22067c;
                this.f22078c = fVar.f22069e;
                this.f22079d = fVar.f22070f;
                this.f22080e = fVar.f22071g;
                this.f22081f = fVar.f22072h;
                this.f22082g = fVar.f22074j;
                this.f22083h = fVar.f22075k;
            }

            public f i() {
                return new f(this);
            }
        }

        public f(a aVar) {
            s7.a.g((aVar.f22081f && aVar.f22077b == null) ? false : true);
            UUID uuid = (UUID) s7.a.e(aVar.f22076a);
            this.f22065a = uuid;
            this.f22066b = uuid;
            this.f22067c = aVar.f22077b;
            this.f22068d = aVar.f22078c;
            this.f22069e = aVar.f22078c;
            this.f22070f = aVar.f22079d;
            this.f22072h = aVar.f22081f;
            this.f22071g = aVar.f22080e;
            this.f22073i = aVar.f22082g;
            this.f22074j = aVar.f22082g;
            this.f22075k = aVar.f22083h != null ? Arrays.copyOf(aVar.f22083h, aVar.f22083h.length) : null;
        }

        public a b() {
            return new a();
        }

        @Nullable
        public byte[] c() {
            byte[] bArr = this.f22075k;
            if (bArr != null) {
                return Arrays.copyOf(bArr, bArr.length);
            }
            return null;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.f22065a.equals(fVar.f22065a) && m0.c(this.f22067c, fVar.f22067c) && m0.c(this.f22069e, fVar.f22069e) && this.f22070f == fVar.f22070f && this.f22072h == fVar.f22072h && this.f22071g == fVar.f22071g && this.f22074j.equals(fVar.f22074j) && Arrays.equals(this.f22075k, fVar.f22075k);
        }

        public int hashCode() {
            int iHashCode = this.f22065a.hashCode() * 31;
            Uri uri = this.f22067c;
            return ((((((((((((iHashCode + (uri != null ? uri.hashCode() : 0)) * 31) + this.f22069e.hashCode()) * 31) + (this.f22070f ? 1 : 0)) * 31) + (this.f22072h ? 1 : 0)) * 31) + (this.f22071g ? 1 : 0)) * 31) + this.f22074j.hashCode()) * 31) + Arrays.hashCode(this.f22075k);
        }
    }

    /* JADX INFO: compiled from: MediaItem.java */
    public static final class g implements com.google.android.exoplayer2.f {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final g f22084g = new a().f();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final f.a<g> f22085h = new f.a() { // from class: d6.e1
            @Override // com.google.android.exoplayer2.f.a
            public final com.google.android.exoplayer2.f fromBundle(Bundle bundle) {
                return p.g.d(bundle);
            }
        };

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f22086b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f22087c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f22088d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final float f22089e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final float f22090f;

        /* JADX INFO: compiled from: MediaItem.java */
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public long f22091a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public long f22092b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public long f22093c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public float f22094d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public float f22095e;

            public a() {
                this.f22091a = -9223372036854775807L;
                this.f22092b = -9223372036854775807L;
                this.f22093c = -9223372036854775807L;
                this.f22094d = -3.4028235E38f;
                this.f22095e = -3.4028235E38f;
            }

            public a(g gVar) {
                this.f22091a = gVar.f22086b;
                this.f22092b = gVar.f22087c;
                this.f22093c = gVar.f22088d;
                this.f22094d = gVar.f22089e;
                this.f22095e = gVar.f22090f;
            }

            public g f() {
                return new g(this);
            }

            public a g(long j10) {
                this.f22093c = j10;
                return this;
            }

            public a h(float f10) {
                this.f22095e = f10;
                return this;
            }

            public a i(long j10) {
                this.f22092b = j10;
                return this;
            }

            public a j(float f10) {
                this.f22094d = f10;
                return this;
            }

            public a k(long j10) {
                this.f22091a = j10;
                return this;
            }
        }

        @Deprecated
        public g(long j10, long j11, long j12, float f10, float f11) {
            this.f22086b = j10;
            this.f22087c = j11;
            this.f22088d = j12;
            this.f22089e = f10;
            this.f22090f = f11;
        }

        public g(a aVar) {
            this(aVar.f22091a, aVar.f22092b, aVar.f22093c, aVar.f22094d, aVar.f22095e);
        }

        public static String c(int i10) {
            return Integer.toString(i10, 36);
        }

        public static /* synthetic */ g d(Bundle bundle) {
            return new g(bundle.getLong(c(0), -9223372036854775807L), bundle.getLong(c(1), -9223372036854775807L), bundle.getLong(c(2), -9223372036854775807L), bundle.getFloat(c(3), -3.4028235E38f), bundle.getFloat(c(4), -3.4028235E38f));
        }

        public a b() {
            return new a();
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return this.f22086b == gVar.f22086b && this.f22087c == gVar.f22087c && this.f22088d == gVar.f22088d && this.f22089e == gVar.f22089e && this.f22090f == gVar.f22090f;
        }

        public int hashCode() {
            long j10 = this.f22086b;
            long j11 = this.f22087c;
            int i10 = ((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31;
            long j12 = this.f22088d;
            int i11 = (i10 + ((int) ((j12 >>> 32) ^ j12))) * 31;
            float f10 = this.f22089e;
            int iFloatToIntBits = (i11 + (f10 != 0.0f ? Float.floatToIntBits(f10) : 0)) * 31;
            float f11 = this.f22090f;
            return iFloatToIntBits + (f11 != 0.0f ? Float.floatToIntBits(f11) : 0);
        }

        @Override // com.google.android.exoplayer2.f
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putLong(c(0), this.f22086b);
            bundle.putLong(c(1), this.f22087c);
            bundle.putLong(c(2), this.f22088d);
            bundle.putFloat(c(3), this.f22089e);
            bundle.putFloat(c(4), this.f22090f);
            return bundle;
        }
    }

    /* JADX INFO: compiled from: MediaItem.java */
    public static class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f22096a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final String f22097b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public final f f22098c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final List<StreamKey> f22099d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public final String f22100e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final ImmutableList<l> f22101f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Deprecated
        public final List<k> f22102g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @Nullable
        public final Object f22103h;

        public h(Uri uri, @Nullable String str, @Nullable f fVar, @Nullable b bVar, List<StreamKey> list, @Nullable String str2, ImmutableList<l> immutableList, @Nullable Object obj) {
            this.f22096a = uri;
            this.f22097b = str;
            this.f22098c = fVar;
            this.f22099d = list;
            this.f22100e = str2;
            this.f22101f = immutableList;
            ImmutableList.a aVarBuilder = ImmutableList.builder();
            for (int i10 = 0; i10 < immutableList.size(); i10++) {
                aVarBuilder.a(immutableList.get(i10).a().i());
            }
            this.f22102g = aVarBuilder.m();
            this.f22103h = obj;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return this.f22096a.equals(hVar.f22096a) && m0.c(this.f22097b, hVar.f22097b) && m0.c(this.f22098c, hVar.f22098c) && m0.c(null, null) && this.f22099d.equals(hVar.f22099d) && m0.c(this.f22100e, hVar.f22100e) && this.f22101f.equals(hVar.f22101f) && m0.c(this.f22103h, hVar.f22103h);
        }

        public int hashCode() {
            int iHashCode = this.f22096a.hashCode() * 31;
            String str = this.f22097b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            f fVar = this.f22098c;
            int iHashCode3 = (((((iHashCode2 + (fVar == null ? 0 : fVar.hashCode())) * 31) + 0) * 31) + this.f22099d.hashCode()) * 31;
            String str2 = this.f22100e;
            int iHashCode4 = (((iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f22101f.hashCode()) * 31;
            Object obj = this.f22103h;
            return iHashCode4 + (obj != null ? obj.hashCode() : 0);
        }
    }

    /* JADX INFO: compiled from: MediaItem.java */
    @Deprecated
    public static final class i extends h {
        public i(Uri uri, @Nullable String str, @Nullable f fVar, @Nullable b bVar, List<StreamKey> list, @Nullable String str2, ImmutableList<l> immutableList, @Nullable Object obj) {
            super(uri, str, fVar, bVar, list, str2, immutableList, obj);
        }
    }

    /* JADX INFO: compiled from: MediaItem.java */
    public static final class j implements com.google.android.exoplayer2.f {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final j f22104e = new a().d();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final f.a<j> f22105f = new f.a() { // from class: d6.f1
            @Override // com.google.android.exoplayer2.f.a
            public final com.google.android.exoplayer2.f fromBundle(Bundle bundle) {
                return p.j.c(bundle);
            }
        };

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final Uri f22106b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public final String f22107c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public final Bundle f22108d;

        /* JADX INFO: compiled from: MediaItem.java */
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @Nullable
            public Uri f22109a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @Nullable
            public String f22110b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @Nullable
            public Bundle f22111c;

            public j d() {
                return new j(this);
            }

            public a e(@Nullable Bundle bundle) {
                this.f22111c = bundle;
                return this;
            }

            public a f(@Nullable Uri uri) {
                this.f22109a = uri;
                return this;
            }

            public a g(@Nullable String str) {
                this.f22110b = str;
                return this;
            }
        }

        public j(a aVar) {
            this.f22106b = aVar.f22109a;
            this.f22107c = aVar.f22110b;
            this.f22108d = aVar.f22111c;
        }

        public static String b(int i10) {
            return Integer.toString(i10, 36);
        }

        public static /* synthetic */ j c(Bundle bundle) {
            return new a().f((Uri) bundle.getParcelable(b(0))).g(bundle.getString(b(1))).e(bundle.getBundle(b(2))).d();
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return m0.c(this.f22106b, jVar.f22106b) && m0.c(this.f22107c, jVar.f22107c);
        }

        public int hashCode() {
            Uri uri = this.f22106b;
            int iHashCode = (uri == null ? 0 : uri.hashCode()) * 31;
            String str = this.f22107c;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        @Override // com.google.android.exoplayer2.f
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            if (this.f22106b != null) {
                bundle.putParcelable(b(0), this.f22106b);
            }
            if (this.f22107c != null) {
                bundle.putString(b(1), this.f22107c);
            }
            if (this.f22108d != null) {
                bundle.putBundle(b(2), this.f22108d);
            }
            return bundle;
        }
    }

    /* JADX INFO: compiled from: MediaItem.java */
    @Deprecated
    public static final class k extends l {
        public k(l.a aVar) {
            super(aVar);
        }
    }

    /* JADX INFO: compiled from: MediaItem.java */
    public static class l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f22112a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final String f22113b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public final String f22114c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f22115d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f22116e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        public final String f22117f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Nullable
        public final String f22118g;

        /* JADX INFO: compiled from: MediaItem.java */
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public Uri f22119a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @Nullable
            public String f22120b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @Nullable
            public String f22121c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int f22122d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public int f22123e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            @Nullable
            public String f22124f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            @Nullable
            public String f22125g;

            public a(l lVar) {
                this.f22119a = lVar.f22112a;
                this.f22120b = lVar.f22113b;
                this.f22121c = lVar.f22114c;
                this.f22122d = lVar.f22115d;
                this.f22123e = lVar.f22116e;
                this.f22124f = lVar.f22117f;
                this.f22125g = lVar.f22118g;
            }

            public final k i() {
                return new k(this);
            }
        }

        public l(a aVar) {
            this.f22112a = aVar.f22119a;
            this.f22113b = aVar.f22120b;
            this.f22114c = aVar.f22121c;
            this.f22115d = aVar.f22122d;
            this.f22116e = aVar.f22123e;
            this.f22117f = aVar.f22124f;
            this.f22118g = aVar.f22125g;
        }

        public a a() {
            return new a();
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return this.f22112a.equals(lVar.f22112a) && m0.c(this.f22113b, lVar.f22113b) && m0.c(this.f22114c, lVar.f22114c) && this.f22115d == lVar.f22115d && this.f22116e == lVar.f22116e && m0.c(this.f22117f, lVar.f22117f) && m0.c(this.f22118g, lVar.f22118g);
        }

        public int hashCode() {
            int iHashCode = this.f22112a.hashCode() * 31;
            String str = this.f22113b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f22114c;
            int iHashCode3 = (((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f22115d) * 31) + this.f22116e) * 31;
            String str3 = this.f22117f;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f22118g;
            return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
        }
    }

    public p(String str, e eVar, @Nullable i iVar, g gVar, q qVar, j jVar) {
        this.f22032b = str;
        this.f22033c = iVar;
        this.f22034d = iVar;
        this.f22035e = gVar;
        this.f22036f = qVar;
        this.f22037g = eVar;
        this.f22038h = eVar;
        this.f22039i = jVar;
    }

    public static p c(Bundle bundle) {
        String str = (String) s7.a.e(bundle.getString(e(0), ""));
        Bundle bundle2 = bundle.getBundle(e(1));
        g gVar = bundle2 == null ? g.f22084g : (g) g.f22085h.fromBundle(bundle2);
        Bundle bundle3 = bundle.getBundle(e(2));
        q qVar = bundle3 == null ? q.H : (q) q.I.fromBundle(bundle3);
        Bundle bundle4 = bundle.getBundle(e(3));
        e eVar = bundle4 == null ? e.f22064i : (e) d.f22053h.fromBundle(bundle4);
        Bundle bundle5 = bundle.getBundle(e(4));
        return new p(str, eVar, null, gVar, qVar, bundle5 == null ? j.f22104e : (j) j.f22105f.fromBundle(bundle5));
    }

    public static p d(String str) {
        return new c().h(str).a();
    }

    public static String e(int i10) {
        return Integer.toString(i10, 36);
    }

    public c b() {
        return new c();
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return m0.c(this.f22032b, pVar.f22032b) && this.f22037g.equals(pVar.f22037g) && m0.c(this.f22033c, pVar.f22033c) && m0.c(this.f22035e, pVar.f22035e) && m0.c(this.f22036f, pVar.f22036f) && m0.c(this.f22039i, pVar.f22039i);
    }

    public int hashCode() {
        int iHashCode = this.f22032b.hashCode() * 31;
        h hVar = this.f22033c;
        return ((((((((iHashCode + (hVar != null ? hVar.hashCode() : 0)) * 31) + this.f22035e.hashCode()) * 31) + this.f22037g.hashCode()) * 31) + this.f22036f.hashCode()) * 31) + this.f22039i.hashCode();
    }

    @Override // com.google.android.exoplayer2.f
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putString(e(0), this.f22032b);
        bundle.putBundle(e(1), this.f22035e.toBundle());
        bundle.putBundle(e(2), this.f22036f.toBundle());
        bundle.putBundle(e(3), this.f22037g.toBundle());
        bundle.putBundle(e(4), this.f22039i.toBundle());
        return bundle;
    }
}
