package com.google.android.exoplayer2;

import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.f;
import com.google.android.exoplayer2.metadata.Metadata;
import java.util.Arrays;
import java.util.List;
import s7.m0;

/* JADX INFO: compiled from: MediaMetadata.java */
/* JADX INFO: loaded from: classes10.dex */
public final class q implements f {
    public static final q H = new b().F();
    public static final f.a<q> I = new f.a() { // from class: d6.g1
        @Override // com.google.android.exoplayer2.f.a
        public final com.google.android.exoplayer2.f fromBundle(Bundle bundle) {
            return com.google.android.exoplayer2.q.c(bundle);
        }
    };

    @Nullable
    public final CharSequence A;

    @Nullable
    public final Integer B;

    @Nullable
    public final Integer C;

    @Nullable
    public final CharSequence D;

    @Nullable
    public final CharSequence E;

    @Nullable
    public final CharSequence F;

    @Nullable
    public final Bundle G;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final CharSequence f22126b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final CharSequence f22127c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final CharSequence f22128d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final CharSequence f22129e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final CharSequence f22130f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public final CharSequence f22131g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public final CharSequence f22132h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public final x f22133i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public final x f22134j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public final byte[] f22135k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public final Integer f22136l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public final Uri f22137m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public final Integer f22138n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public final Integer f22139o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public final Integer f22140p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public final Boolean f22141q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    @Deprecated
    public final Integer f22142r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public final Integer f22143s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public final Integer f22144t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Nullable
    public final Integer f22145u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    public final Integer f22146v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @Nullable
    public final Integer f22147w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @Nullable
    public final Integer f22148x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @Nullable
    public final CharSequence f22149y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @Nullable
    public final CharSequence f22150z;

    /* JADX INFO: compiled from: MediaMetadata.java */
    public static final class b {

        @Nullable
        public Integer A;

        @Nullable
        public CharSequence B;

        @Nullable
        public CharSequence C;

        @Nullable
        public CharSequence D;

        @Nullable
        public Bundle E;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public CharSequence f22151a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public CharSequence f22152b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public CharSequence f22153c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public CharSequence f22154d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public CharSequence f22155e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        public CharSequence f22156f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Nullable
        public CharSequence f22157g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @Nullable
        public x f22158h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @Nullable
        public x f22159i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @Nullable
        public byte[] f22160j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @Nullable
        public Integer f22161k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        @Nullable
        public Uri f22162l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        @Nullable
        public Integer f22163m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        @Nullable
        public Integer f22164n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        @Nullable
        public Integer f22165o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        @Nullable
        public Boolean f22166p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        @Nullable
        public Integer f22167q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        @Nullable
        public Integer f22168r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        @Nullable
        public Integer f22169s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        @Nullable
        public Integer f22170t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        @Nullable
        public Integer f22171u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        @Nullable
        public Integer f22172v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        @Nullable
        public CharSequence f22173w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        @Nullable
        public CharSequence f22174x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        @Nullable
        public CharSequence f22175y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        @Nullable
        public Integer f22176z;

        public b() {
        }

        public b(q qVar) {
            this.f22151a = qVar.f22126b;
            this.f22152b = qVar.f22127c;
            this.f22153c = qVar.f22128d;
            this.f22154d = qVar.f22129e;
            this.f22155e = qVar.f22130f;
            this.f22156f = qVar.f22131g;
            this.f22157g = qVar.f22132h;
            this.f22158h = qVar.f22133i;
            this.f22159i = qVar.f22134j;
            this.f22160j = qVar.f22135k;
            this.f22161k = qVar.f22136l;
            this.f22162l = qVar.f22137m;
            this.f22163m = qVar.f22138n;
            this.f22164n = qVar.f22139o;
            this.f22165o = qVar.f22140p;
            this.f22166p = qVar.f22141q;
            this.f22167q = qVar.f22143s;
            this.f22168r = qVar.f22144t;
            this.f22169s = qVar.f22145u;
            this.f22170t = qVar.f22146v;
            this.f22171u = qVar.f22147w;
            this.f22172v = qVar.f22148x;
            this.f22173w = qVar.f22149y;
            this.f22174x = qVar.f22150z;
            this.f22175y = qVar.A;
            this.f22176z = qVar.B;
            this.A = qVar.C;
            this.B = qVar.D;
            this.C = qVar.E;
            this.D = qVar.F;
            this.E = qVar.G;
        }

        public q F() {
            return new q(this);
        }

        public b G(byte[] bArr, int i10) {
            if (this.f22160j == null || m0.c(Integer.valueOf(i10), 3) || !m0.c(this.f22161k, 3)) {
                this.f22160j = (byte[]) bArr.clone();
                this.f22161k = Integer.valueOf(i10);
            }
            return this;
        }

        public b H(@Nullable q qVar) {
            if (qVar == null) {
                return this;
            }
            CharSequence charSequence = qVar.f22126b;
            if (charSequence != null) {
                i0(charSequence);
            }
            CharSequence charSequence2 = qVar.f22127c;
            if (charSequence2 != null) {
                M(charSequence2);
            }
            CharSequence charSequence3 = qVar.f22128d;
            if (charSequence3 != null) {
                L(charSequence3);
            }
            CharSequence charSequence4 = qVar.f22129e;
            if (charSequence4 != null) {
                K(charSequence4);
            }
            CharSequence charSequence5 = qVar.f22130f;
            if (charSequence5 != null) {
                U(charSequence5);
            }
            CharSequence charSequence6 = qVar.f22131g;
            if (charSequence6 != null) {
                h0(charSequence6);
            }
            CharSequence charSequence7 = qVar.f22132h;
            if (charSequence7 != null) {
                S(charSequence7);
            }
            x xVar = qVar.f22133i;
            if (xVar != null) {
                m0(xVar);
            }
            x xVar2 = qVar.f22134j;
            if (xVar2 != null) {
                Z(xVar2);
            }
            byte[] bArr = qVar.f22135k;
            if (bArr != null) {
                N(bArr, qVar.f22136l);
            }
            Uri uri = qVar.f22137m;
            if (uri != null) {
                O(uri);
            }
            Integer num = qVar.f22138n;
            if (num != null) {
                l0(num);
            }
            Integer num2 = qVar.f22139o;
            if (num2 != null) {
                k0(num2);
            }
            Integer num3 = qVar.f22140p;
            if (num3 != null) {
                W(num3);
            }
            Boolean bool = qVar.f22141q;
            if (bool != null) {
                Y(bool);
            }
            Integer num4 = qVar.f22142r;
            if (num4 != null) {
                c0(num4);
            }
            Integer num5 = qVar.f22143s;
            if (num5 != null) {
                c0(num5);
            }
            Integer num6 = qVar.f22144t;
            if (num6 != null) {
                b0(num6);
            }
            Integer num7 = qVar.f22145u;
            if (num7 != null) {
                a0(num7);
            }
            Integer num8 = qVar.f22146v;
            if (num8 != null) {
                f0(num8);
            }
            Integer num9 = qVar.f22147w;
            if (num9 != null) {
                e0(num9);
            }
            Integer num10 = qVar.f22148x;
            if (num10 != null) {
                d0(num10);
            }
            CharSequence charSequence8 = qVar.f22149y;
            if (charSequence8 != null) {
                n0(charSequence8);
            }
            CharSequence charSequence9 = qVar.f22150z;
            if (charSequence9 != null) {
                Q(charSequence9);
            }
            CharSequence charSequence10 = qVar.A;
            if (charSequence10 != null) {
                R(charSequence10);
            }
            Integer num11 = qVar.B;
            if (num11 != null) {
                T(num11);
            }
            Integer num12 = qVar.C;
            if (num12 != null) {
                j0(num12);
            }
            CharSequence charSequence11 = qVar.D;
            if (charSequence11 != null) {
                X(charSequence11);
            }
            CharSequence charSequence12 = qVar.E;
            if (charSequence12 != null) {
                P(charSequence12);
            }
            CharSequence charSequence13 = qVar.F;
            if (charSequence13 != null) {
                g0(charSequence13);
            }
            Bundle bundle = qVar.G;
            if (bundle != null) {
                V(bundle);
            }
            return this;
        }

        public b I(Metadata metadata) {
            for (int i10 = 0; i10 < metadata.f(); i10++) {
                metadata.e(i10).a(this);
            }
            return this;
        }

        public b J(List<Metadata> list) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                Metadata metadata = list.get(i10);
                for (int i11 = 0; i11 < metadata.f(); i11++) {
                    metadata.e(i11).a(this);
                }
            }
            return this;
        }

        public b K(@Nullable CharSequence charSequence) {
            this.f22154d = charSequence;
            return this;
        }

        public b L(@Nullable CharSequence charSequence) {
            this.f22153c = charSequence;
            return this;
        }

        public b M(@Nullable CharSequence charSequence) {
            this.f22152b = charSequence;
            return this;
        }

        public b N(@Nullable byte[] bArr, @Nullable Integer num) {
            this.f22160j = bArr == null ? null : (byte[]) bArr.clone();
            this.f22161k = num;
            return this;
        }

        public b O(@Nullable Uri uri) {
            this.f22162l = uri;
            return this;
        }

        public b P(@Nullable CharSequence charSequence) {
            this.C = charSequence;
            return this;
        }

        public b Q(@Nullable CharSequence charSequence) {
            this.f22174x = charSequence;
            return this;
        }

        public b R(@Nullable CharSequence charSequence) {
            this.f22175y = charSequence;
            return this;
        }

        public b S(@Nullable CharSequence charSequence) {
            this.f22157g = charSequence;
            return this;
        }

        public b T(@Nullable Integer num) {
            this.f22176z = num;
            return this;
        }

        public b U(@Nullable CharSequence charSequence) {
            this.f22155e = charSequence;
            return this;
        }

        public b V(@Nullable Bundle bundle) {
            this.E = bundle;
            return this;
        }

        public b W(@Nullable Integer num) {
            this.f22165o = num;
            return this;
        }

        public b X(@Nullable CharSequence charSequence) {
            this.B = charSequence;
            return this;
        }

        public b Y(@Nullable Boolean bool) {
            this.f22166p = bool;
            return this;
        }

        public b Z(@Nullable x xVar) {
            this.f22159i = xVar;
            return this;
        }

        public b a0(@IntRange(from = 1, to = 31) @Nullable Integer num) {
            this.f22169s = num;
            return this;
        }

        public b b0(@IntRange(from = 1, to = 12) @Nullable Integer num) {
            this.f22168r = num;
            return this;
        }

        public b c0(@Nullable Integer num) {
            this.f22167q = num;
            return this;
        }

        public b d0(@IntRange(from = 1, to = 31) @Nullable Integer num) {
            this.f22172v = num;
            return this;
        }

        public b e0(@IntRange(from = 1, to = 12) @Nullable Integer num) {
            this.f22171u = num;
            return this;
        }

        public b f0(@Nullable Integer num) {
            this.f22170t = num;
            return this;
        }

        public b g0(@Nullable CharSequence charSequence) {
            this.D = charSequence;
            return this;
        }

        public b h0(@Nullable CharSequence charSequence) {
            this.f22156f = charSequence;
            return this;
        }

        public b i0(@Nullable CharSequence charSequence) {
            this.f22151a = charSequence;
            return this;
        }

        public b j0(@Nullable Integer num) {
            this.A = num;
            return this;
        }

        public b k0(@Nullable Integer num) {
            this.f22164n = num;
            return this;
        }

        public b l0(@Nullable Integer num) {
            this.f22163m = num;
            return this;
        }

        public b m0(@Nullable x xVar) {
            this.f22158h = xVar;
            return this;
        }

        public b n0(@Nullable CharSequence charSequence) {
            this.f22173w = charSequence;
            return this;
        }
    }

    public q(b bVar) {
        this.f22126b = bVar.f22151a;
        this.f22127c = bVar.f22152b;
        this.f22128d = bVar.f22153c;
        this.f22129e = bVar.f22154d;
        this.f22130f = bVar.f22155e;
        this.f22131g = bVar.f22156f;
        this.f22132h = bVar.f22157g;
        this.f22133i = bVar.f22158h;
        this.f22134j = bVar.f22159i;
        this.f22135k = bVar.f22160j;
        this.f22136l = bVar.f22161k;
        this.f22137m = bVar.f22162l;
        this.f22138n = bVar.f22163m;
        this.f22139o = bVar.f22164n;
        this.f22140p = bVar.f22165o;
        this.f22141q = bVar.f22166p;
        this.f22142r = bVar.f22167q;
        this.f22143s = bVar.f22167q;
        this.f22144t = bVar.f22168r;
        this.f22145u = bVar.f22169s;
        this.f22146v = bVar.f22170t;
        this.f22147w = bVar.f22171u;
        this.f22148x = bVar.f22172v;
        this.f22149y = bVar.f22173w;
        this.f22150z = bVar.f22174x;
        this.A = bVar.f22175y;
        this.B = bVar.f22176z;
        this.C = bVar.A;
        this.D = bVar.B;
        this.E = bVar.C;
        this.F = bVar.D;
        this.G = bVar.E;
    }

    public static q c(Bundle bundle) {
        Bundle bundle2;
        Bundle bundle3;
        b bVar = new b();
        bVar.i0(bundle.getCharSequence(d(0))).M(bundle.getCharSequence(d(1))).L(bundle.getCharSequence(d(2))).K(bundle.getCharSequence(d(3))).U(bundle.getCharSequence(d(4))).h0(bundle.getCharSequence(d(5))).S(bundle.getCharSequence(d(6))).N(bundle.getByteArray(d(10)), bundle.containsKey(d(29)) ? Integer.valueOf(bundle.getInt(d(29))) : null).O((Uri) bundle.getParcelable(d(11))).n0(bundle.getCharSequence(d(22))).Q(bundle.getCharSequence(d(23))).R(bundle.getCharSequence(d(24))).X(bundle.getCharSequence(d(27))).P(bundle.getCharSequence(d(28))).g0(bundle.getCharSequence(d(30))).V(bundle.getBundle(d(1000)));
        if (bundle.containsKey(d(8)) && (bundle3 = bundle.getBundle(d(8))) != null) {
            bVar.m0((x) x.f23012b.fromBundle(bundle3));
        }
        if (bundle.containsKey(d(9)) && (bundle2 = bundle.getBundle(d(9))) != null) {
            bVar.Z((x) x.f23012b.fromBundle(bundle2));
        }
        if (bundle.containsKey(d(12))) {
            bVar.l0(Integer.valueOf(bundle.getInt(d(12))));
        }
        if (bundle.containsKey(d(13))) {
            bVar.k0(Integer.valueOf(bundle.getInt(d(13))));
        }
        if (bundle.containsKey(d(14))) {
            bVar.W(Integer.valueOf(bundle.getInt(d(14))));
        }
        if (bundle.containsKey(d(15))) {
            bVar.Y(Boolean.valueOf(bundle.getBoolean(d(15))));
        }
        if (bundle.containsKey(d(16))) {
            bVar.c0(Integer.valueOf(bundle.getInt(d(16))));
        }
        if (bundle.containsKey(d(17))) {
            bVar.b0(Integer.valueOf(bundle.getInt(d(17))));
        }
        if (bundle.containsKey(d(18))) {
            bVar.a0(Integer.valueOf(bundle.getInt(d(18))));
        }
        if (bundle.containsKey(d(19))) {
            bVar.f0(Integer.valueOf(bundle.getInt(d(19))));
        }
        if (bundle.containsKey(d(20))) {
            bVar.e0(Integer.valueOf(bundle.getInt(d(20))));
        }
        if (bundle.containsKey(d(21))) {
            bVar.d0(Integer.valueOf(bundle.getInt(d(21))));
        }
        if (bundle.containsKey(d(25))) {
            bVar.T(Integer.valueOf(bundle.getInt(d(25))));
        }
        if (bundle.containsKey(d(26))) {
            bVar.j0(Integer.valueOf(bundle.getInt(d(26))));
        }
        return bVar.F();
    }

    public static String d(int i10) {
        return Integer.toString(i10, 36);
    }

    public b b() {
        return new b();
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass()) {
            return false;
        }
        q qVar = (q) obj;
        return m0.c(this.f22126b, qVar.f22126b) && m0.c(this.f22127c, qVar.f22127c) && m0.c(this.f22128d, qVar.f22128d) && m0.c(this.f22129e, qVar.f22129e) && m0.c(this.f22130f, qVar.f22130f) && m0.c(this.f22131g, qVar.f22131g) && m0.c(this.f22132h, qVar.f22132h) && m0.c(this.f22133i, qVar.f22133i) && m0.c(this.f22134j, qVar.f22134j) && Arrays.equals(this.f22135k, qVar.f22135k) && m0.c(this.f22136l, qVar.f22136l) && m0.c(this.f22137m, qVar.f22137m) && m0.c(this.f22138n, qVar.f22138n) && m0.c(this.f22139o, qVar.f22139o) && m0.c(this.f22140p, qVar.f22140p) && m0.c(this.f22141q, qVar.f22141q) && m0.c(this.f22143s, qVar.f22143s) && m0.c(this.f22144t, qVar.f22144t) && m0.c(this.f22145u, qVar.f22145u) && m0.c(this.f22146v, qVar.f22146v) && m0.c(this.f22147w, qVar.f22147w) && m0.c(this.f22148x, qVar.f22148x) && m0.c(this.f22149y, qVar.f22149y) && m0.c(this.f22150z, qVar.f22150z) && m0.c(this.A, qVar.A) && m0.c(this.B, qVar.B) && m0.c(this.C, qVar.C) && m0.c(this.D, qVar.D) && m0.c(this.E, qVar.E) && m0.c(this.F, qVar.F);
    }

    public int hashCode() {
        return y7.i.b(this.f22126b, this.f22127c, this.f22128d, this.f22129e, this.f22130f, this.f22131g, this.f22132h, this.f22133i, this.f22134j, Integer.valueOf(Arrays.hashCode(this.f22135k)), this.f22136l, this.f22137m, this.f22138n, this.f22139o, this.f22140p, this.f22141q, this.f22143s, this.f22144t, this.f22145u, this.f22146v, this.f22147w, this.f22148x, this.f22149y, this.f22150z, this.A, this.B, this.C, this.D, this.E, this.F);
    }

    @Override // com.google.android.exoplayer2.f
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putCharSequence(d(0), this.f22126b);
        bundle.putCharSequence(d(1), this.f22127c);
        bundle.putCharSequence(d(2), this.f22128d);
        bundle.putCharSequence(d(3), this.f22129e);
        bundle.putCharSequence(d(4), this.f22130f);
        bundle.putCharSequence(d(5), this.f22131g);
        bundle.putCharSequence(d(6), this.f22132h);
        bundle.putByteArray(d(10), this.f22135k);
        bundle.putParcelable(d(11), this.f22137m);
        bundle.putCharSequence(d(22), this.f22149y);
        bundle.putCharSequence(d(23), this.f22150z);
        bundle.putCharSequence(d(24), this.A);
        bundle.putCharSequence(d(27), this.D);
        bundle.putCharSequence(d(28), this.E);
        bundle.putCharSequence(d(30), this.F);
        if (this.f22133i != null) {
            bundle.putBundle(d(8), this.f22133i.toBundle());
        }
        if (this.f22134j != null) {
            bundle.putBundle(d(9), this.f22134j.toBundle());
        }
        if (this.f22138n != null) {
            bundle.putInt(d(12), this.f22138n.intValue());
        }
        if (this.f22139o != null) {
            bundle.putInt(d(13), this.f22139o.intValue());
        }
        if (this.f22140p != null) {
            bundle.putInt(d(14), this.f22140p.intValue());
        }
        if (this.f22141q != null) {
            bundle.putBoolean(d(15), this.f22141q.booleanValue());
        }
        if (this.f22143s != null) {
            bundle.putInt(d(16), this.f22143s.intValue());
        }
        if (this.f22144t != null) {
            bundle.putInt(d(17), this.f22144t.intValue());
        }
        if (this.f22145u != null) {
            bundle.putInt(d(18), this.f22145u.intValue());
        }
        if (this.f22146v != null) {
            bundle.putInt(d(19), this.f22146v.intValue());
        }
        if (this.f22147w != null) {
            bundle.putInt(d(20), this.f22147w.intValue());
        }
        if (this.f22148x != null) {
            bundle.putInt(d(21), this.f22148x.intValue());
        }
        if (this.B != null) {
            bundle.putInt(d(25), this.B.intValue());
        }
        if (this.C != null) {
            bundle.putInt(d(26), this.C.intValue());
        }
        if (this.f22136l != null) {
            bundle.putInt(d(29), this.f22136l.intValue());
        }
        if (this.G != null) {
            bundle.putBundle(d(1000), this.G);
        }
        return bundle;
    }
}
