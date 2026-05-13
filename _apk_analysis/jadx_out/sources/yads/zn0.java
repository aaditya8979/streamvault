package yads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import com.ironsource.C3978d4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;
import yads.ce2;
import yads.co0;
import yads.dw0;
import yads.me2;
import yads.zn0;

/* JADX INFO: loaded from: classes3.dex */
public final class zn0 extends qo implements sn0 {
    public int A;
    public int B;
    public boolean C;
    public int D;
    public sy2 E;
    public le2 F;
    public jm1 G;
    public AudioTrack H;
    public Object I;
    public Surface J;
    public SurfaceHolder K;
    public i23 L;
    public boolean M;
    public TextureView N;
    public final int O;
    public int P;
    public int Q;
    public final int R;
    public final pk S;
    public float T;
    public boolean U;
    public final boolean V;
    public boolean W;
    public ig0 X;
    public jm1 Y;
    public ce2 Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public int f97698a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t73 f97699b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public long f97700b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final le2 f97701c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final vy f97702d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final oe2 f97703e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ro[] f97704f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final s73 f97705g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i53 f97706h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final go0 f97707i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final pf1 f97708j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final CopyOnWriteArraySet f97709k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p63 f97710l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayList f97711m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f97712n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final se f97713o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Looper f97714p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final im f97715q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final f53 f97716r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final wn0 f97717s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final xn0 f97718t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final sk f97719u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final yk f97720v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final c43 f97721w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final fn3 f97722x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final uo3 f97723y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final long f97724z;

    static {
        ho0.a("goog.exo.exoplayer");
    }

    public zn0(rn0 rn0Var) throws Throwable {
        final zn0 zn0Var = this;
        vy vyVar = new vy();
        zn0Var.f97702d = vyVar;
        try {
            ih1.c("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [ExoPlayerLib/2.18.1] [" + ib3.f90741e + C3978d4.j.f31385e);
            Context applicationContext = rn0Var.f94504a.getApplicationContext();
            se seVar = (se) rn0Var.f94511h.apply(rn0Var.f94505b);
            zn0Var.f97713o = seVar;
            pk pkVar = rn0Var.f94513j;
            zn0Var.S = pkVar;
            int i10 = rn0Var.f94514k;
            zn0Var.O = i10;
            zn0Var.U = false;
            zn0Var.f97724z = rn0Var.f94519p;
            wn0 wn0Var = new wn0(zn0Var);
            zn0Var.f97717s = wn0Var;
            xn0 xn0Var = new xn0();
            zn0Var.f97718t = xn0Var;
            Handler handler = new Handler(rn0Var.f94512i);
            ro[] roVarArrA = ((pe0) rn0Var.f94506c.get()).a(handler, wn0Var, wn0Var, wn0Var, wn0Var);
            zn0Var.f97704f = roVarArrA;
            ni.b(roVarArrA.length > 0);
            s73 s73Var = (s73) rn0Var.f94508e.get();
            zn0Var.f97705g = s73Var;
            im imVar = (im) rn0Var.f94510g.get();
            zn0Var.f97715q = imVar;
            zn0Var.f97712n = rn0Var.f94515l;
            ww2 ww2Var = rn0Var.f94516m;
            Looper looper = rn0Var.f94512i;
            zn0Var.f97714p = looper;
            f53 f53Var = rn0Var.f94505b;
            zn0Var.f97716r = f53Var;
            zn0Var.f97703e = zn0Var;
            zn0Var.f97708j = new pf1(looper, f53Var, new nf1() { // from class: bt.ed
                @Override // yads.nf1
                public final void a(Object obj, dw0 dw0Var) {
                    this.f6024a.a((me2) obj, dw0Var);
                }
            });
            zn0Var.f97709k = new CopyOnWriteArraySet();
            zn0Var.f97711m = new ArrayList();
            zn0Var.E = new sy2();
            t73 t73Var = new t73(new mn2[roVarArrA.length], new op0[roVarArrA.length], o83.f93153c, null);
            zn0Var.f97699b = t73Var;
            zn0Var.f97710l = new p63();
            ke2 ke2VarA = new ke2().a(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 22, 23, 24, 25, 26, 27, 28);
            s73Var.getClass();
            le2 le2VarA = ke2VarA.a(true, 29).a();
            zn0Var.f97701c = le2VarA;
            zn0Var.F = new ke2().a(le2VarA).a(4).a(10).a();
            zn0Var.f97706h = f53Var.a(looper, null);
            do0 do0Var = new do0() { // from class: bt.pd
                @Override // yads.do0
                public final void a(co0 co0Var) {
                    this.f6229a.b(co0Var);
                }
            };
            zn0Var.Z = ce2.a(t73Var);
            ((kb0) seVar).a(zn0Var, looper);
            int i11 = ib3.f90737a;
            ye2 ye2Var = i11 < 31 ? new ye2() : vn0.a(applicationContext, zn0Var, rn0Var.f94520q);
            try {
                zn0Var = this;
                zn0Var.f97707i = new go0(roVarArrA, s73Var, t73Var, (sf1) rn0Var.f94509f.get(), imVar, 0, seVar, ww2Var, rn0Var.f94517n, rn0Var.f94518o, looper, f53Var, do0Var, ye2Var);
                zn0Var.T = 1.0f;
                jm1 jm1Var = jm1.H;
                zn0Var.G = jm1Var;
                zn0Var.Y = jm1Var;
                zn0Var.f97698a0 = -1;
                if (i11 < 21) {
                    zn0Var.R = k();
                } else {
                    zn0Var.R = ib3.a(applicationContext);
                }
                int i12 = q20.f93867b;
                zn0Var.V = true;
                zn0Var.a(seVar);
                ((dc0) imVar).a(new Handler(looper), seVar);
                zn0Var.a(wn0Var);
                sk skVar = new sk(rn0Var.f94504a, handler, wn0Var);
                zn0Var.f97719u = skVar;
                skVar.a();
                yk ykVar = new yk(rn0Var.f94504a, handler, wn0Var);
                zn0Var.f97720v = ykVar;
                ykVar.b();
                c43 c43Var = new c43(rn0Var.f94504a, handler, wn0Var);
                zn0Var.f97721w = c43Var;
                c43Var.a(ib3.c(pkVar.f93615d));
                fn3 fn3Var = new fn3(rn0Var.f94504a);
                zn0Var.f97722x = fn3Var;
                fn3Var.a();
                uo3 uo3Var = new uo3(rn0Var.f94504a);
                zn0Var.f97723y = uo3Var;
                uo3Var.a();
                zn0Var.X = a(c43Var);
                int i13 = oj3.f93237f;
                s73Var.a(pkVar);
                zn0Var.a(1, 10, Integer.valueOf(zn0Var.R));
                zn0Var.a(2, 10, Integer.valueOf(zn0Var.R));
                zn0Var.a(1, 3, pkVar);
                zn0Var.a(2, 4, Integer.valueOf(i10));
                zn0Var.a(2, 5, (Object) 0);
                zn0Var.a(1, 9, Boolean.valueOf(zn0Var.U));
                zn0Var.a(2, 7, xn0Var);
                zn0Var.a(6, 8, xn0Var);
                vyVar.d();
            } catch (Throwable th2) {
                th = th2;
                zn0Var = this;
                zn0Var.f97702d.d();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static ig0 a(c43 c43Var) {
        return new ig0(0, c43Var.a(), c43Var.f88342d.getStreamMaxVolume(c43Var.f88345g));
    }

    public static /* synthetic */ void a(int i10, ne2 ne2Var, ne2 ne2Var2, me2 me2Var) {
        me2Var.getClass();
        me2Var.a(ne2Var, ne2Var2, i10);
    }

    public static /* synthetic */ void a(ce2 ce2Var, int i10, me2 me2Var) {
        s63 s63Var = ce2Var.f88430a;
        me2Var.a(i10);
    }

    public static long b(ce2 ce2Var) {
        r63 r63Var = new r63();
        p63 p63Var = new p63();
        ce2Var.f88430a.a(ce2Var.f88431b.f94492a, p63Var);
        long j10 = ce2Var.f88432c;
        return j10 == -9223372036854775807L ? ce2Var.f88430a.a(p63Var.f93449d, r63Var, 0L).f94311n : p63Var.f93451f + j10;
    }

    public static void b(me2 me2Var) {
        me2Var.a(new pn0(2, new lp0(1), 1003, 0));
    }

    public static /* synthetic */ void d(ce2 ce2Var, me2 me2Var) {
        boolean z10 = ce2Var.f88436g;
        me2Var.getClass();
        me2Var.onIsLoadingChanged(ce2Var.f88436g);
    }

    public static void h(ce2 ce2Var, me2 me2Var) {
        me2Var.onIsPlayingChanged(ce2Var.f88434e == 3 && ce2Var.f88441l && ce2Var.f88442m == 0);
    }

    public final long a(ce2 ce2Var) {
        if (ce2Var.f88430a.c()) {
            return ib3.a(this.f97700b0);
        }
        if (ce2Var.f88431b.a()) {
            return ce2Var.f88447r;
        }
        s63 s63Var = ce2Var.f88430a;
        ym1 ym1Var = ce2Var.f88431b;
        long j10 = ce2Var.f88447r;
        s63Var.a(ym1Var.f94492a, this.f97710l);
        return j10 + this.f97710l.f93451f;
    }

    public final Pair a(xf2 xf2Var, int i10, long j10) {
        if (xf2Var.c()) {
            this.f97698a0 = i10;
            if (j10 == -9223372036854775807L) {
                j10 = 0;
            }
            this.f97700b0 = j10;
            return null;
        }
        if (i10 == -1 || i10 >= xf2Var.f96757f) {
            i10 = xf2Var.a(false);
            j10 = ib3.b(xf2Var.a(i10, this.f94091a, 0L).f94311n);
        }
        return xf2Var.a(this.f94091a, this.f97710l, i10, ib3.a(j10));
    }

    public final bf2 a(af2 af2Var) {
        int i10 = i();
        go0 go0Var = this.f97707i;
        s63 s63Var = this.Z.f88430a;
        if (i10 == -1) {
            i10 = 0;
        }
        return new bf2(go0Var, af2Var, s63Var, i10, this.f97716r, go0Var.f90063k);
    }

    public final ce2 a(ce2 ce2Var, xf2 xf2Var, Pair pair) {
        ym1 ym1Var;
        t73 t73Var;
        List list;
        ce2 ce2VarA;
        if (!xf2Var.c() && pair == null) {
            throw new IllegalArgumentException();
        }
        s63 s63Var = ce2Var.f88430a;
        ce2 ce2VarA2 = ce2Var.a(xf2Var);
        if (xf2Var.c()) {
            ym1 ym1Var2 = ce2.f88429s;
            long jA = ib3.a(this.f97700b0);
            ce2 ce2VarA3 = ce2VarA2.a(ym1Var2, jA, jA, jA, 0L, i73.f90693e, this.f97699b, sm2.f94878f).a(ym1Var2);
            ce2VarA3.f88445p = ce2VarA3.f88447r;
            return ce2VarA3;
        }
        Object obj = ce2VarA2.f88431b.f94492a;
        int i10 = ib3.f90737a;
        boolean z10 = !obj.equals(pair.first);
        ym1 ym1Var3 = z10 ? new ym1(pair.first) : ce2VarA2.f88431b;
        long jLongValue = ((Long) pair.second).longValue();
        long jA2 = ib3.a(b());
        if (!s63Var.c()) {
            jA2 -= s63Var.a(obj, this.f97710l).f93451f;
        }
        if (z10 || jLongValue < jA2) {
            if (!(!ym1Var3.a())) {
                throw new IllegalStateException();
            }
            i73 i73Var = z10 ? i73.f90693e : ce2VarA2.f88437h;
            if (z10) {
                ym1Var = ym1Var3;
                t73Var = this.f97699b;
            } else {
                ym1Var = ym1Var3;
                t73Var = ce2VarA2.f88438i;
            }
            t73 t73Var2 = t73Var;
            if (z10) {
                m51 m51Var = p51.f93439c;
                list = sm2.f94878f;
            } else {
                list = ce2VarA2.f88439j;
            }
            ce2 ce2VarA4 = ce2VarA2.a(ym1Var, jLongValue, jLongValue, jLongValue, 0L, i73Var, t73Var2, list).a(ym1Var);
            ce2VarA4.f88445p = jLongValue;
            return ce2VarA4;
        }
        if (jLongValue == jA2) {
            int iA = xf2Var.a(ce2VarA2.f88440k.f94492a);
            if (iA != -1 && xf2Var.a(iA, this.f97710l, false).f93449d == xf2Var.a(ym1Var3.f94492a, this.f97710l).f93449d) {
                return ce2VarA2;
            }
            xf2Var.a(ym1Var3.f94492a, this.f97710l);
            long jA3 = ym1Var3.a() ? this.f97710l.a(ym1Var3.f94493b, ym1Var3.f94494c) : this.f97710l.f93450e;
            ce2VarA = ce2VarA2.a(ym1Var3, ce2VarA2.f88447r, ce2VarA2.f88447r, ce2VarA2.f88433d, jA3 - ce2VarA2.f88447r, ce2VarA2.f88437h, ce2VarA2.f88438i, ce2VarA2.f88439j).a(ym1Var3);
            ce2VarA.f88445p = jA3;
        } else {
            if (!(!ym1Var3.a())) {
                throw new IllegalStateException();
            }
            long jMax = Math.max(0L, ce2VarA2.f88446q - (jLongValue - jA2));
            long j10 = ce2VarA2.f88445p;
            if (ce2VarA2.f88440k.equals(ce2VarA2.f88431b)) {
                j10 = jLongValue + jMax;
            }
            ce2VarA = ce2VarA2.a(ym1Var3, jLongValue, jLongValue, jLongValue, jMax, ce2VarA2.f88437h, ce2VarA2.f88438i, ce2VarA2.f88439j);
            ce2VarA.f88445p = j10;
        }
        return ce2VarA;
    }

    public final jm1 a() {
        r();
        s63 s63Var = this.Z.f88430a;
        if (s63Var.c()) {
            return this.Y;
        }
        fm1 fm1Var = s63Var.a(e(), this.f94091a, 0L).f94301d;
        jm1 jm1Var = this.Y;
        jm1Var.getClass();
        im1 im1Var = new im1(jm1Var);
        jm1 jm1Var2 = fm1Var.f89627e;
        if (jm1Var2 != null) {
            CharSequence charSequence = jm1Var2.f91284b;
            if (charSequence != null) {
                im1Var.f90879a = charSequence;
            }
            CharSequence charSequence2 = jm1Var2.f91285c;
            if (charSequence2 != null) {
                im1Var.f90880b = charSequence2;
            }
            CharSequence charSequence3 = jm1Var2.f91286d;
            if (charSequence3 != null) {
                im1Var.f90881c = charSequence3;
            }
            CharSequence charSequence4 = jm1Var2.f91287e;
            if (charSequence4 != null) {
                im1Var.f90882d = charSequence4;
            }
            CharSequence charSequence5 = jm1Var2.f91288f;
            if (charSequence5 != null) {
                im1Var.f90883e = charSequence5;
            }
            CharSequence charSequence6 = jm1Var2.f91289g;
            if (charSequence6 != null) {
                im1Var.f90884f = charSequence6;
            }
            CharSequence charSequence7 = jm1Var2.f91290h;
            if (charSequence7 != null) {
                im1Var.f90885g = charSequence7;
            }
            ql2 ql2Var = jm1Var2.f91291i;
            if (ql2Var != null) {
                im1Var.f90886h = ql2Var;
            }
            ql2 ql2Var2 = jm1Var2.f91292j;
            if (ql2Var2 != null) {
                im1Var.f90887i = ql2Var2;
            }
            byte[] bArr = jm1Var2.f91293k;
            if (bArr != null) {
                Integer num = jm1Var2.f91294l;
                im1Var.f90888j = (byte[]) bArr.clone();
                im1Var.f90889k = num;
            }
            Uri uri = jm1Var2.f91295m;
            if (uri != null) {
                im1Var.f90890l = uri;
            }
            Integer num2 = jm1Var2.f91296n;
            if (num2 != null) {
                im1Var.f90891m = num2;
            }
            Integer num3 = jm1Var2.f91297o;
            if (num3 != null) {
                im1Var.f90892n = num3;
            }
            Integer num4 = jm1Var2.f91298p;
            if (num4 != null) {
                im1Var.f90893o = num4;
            }
            Boolean bool = jm1Var2.f91299q;
            if (bool != null) {
                im1Var.f90894p = bool;
            }
            Integer num5 = jm1Var2.f91300r;
            if (num5 != null) {
                im1Var.f90895q = num5;
            }
            Integer num6 = jm1Var2.f91301s;
            if (num6 != null) {
                im1Var.f90895q = num6;
            }
            Integer num7 = jm1Var2.f91302t;
            if (num7 != null) {
                im1Var.f90896r = num7;
            }
            Integer num8 = jm1Var2.f91303u;
            if (num8 != null) {
                im1Var.f90897s = num8;
            }
            Integer num9 = jm1Var2.f91304v;
            if (num9 != null) {
                im1Var.f90898t = num9;
            }
            Integer num10 = jm1Var2.f91305w;
            if (num10 != null) {
                im1Var.f90899u = num10;
            }
            Integer num11 = jm1Var2.f91306x;
            if (num11 != null) {
                im1Var.f90900v = num11;
            }
            CharSequence charSequence8 = jm1Var2.f91307y;
            if (charSequence8 != null) {
                im1Var.f90901w = charSequence8;
            }
            CharSequence charSequence9 = jm1Var2.f91308z;
            if (charSequence9 != null) {
                im1Var.f90902x = charSequence9;
            }
            CharSequence charSequence10 = jm1Var2.A;
            if (charSequence10 != null) {
                im1Var.f90903y = charSequence10;
            }
            Integer num12 = jm1Var2.B;
            if (num12 != null) {
                im1Var.f90904z = num12;
            }
            Integer num13 = jm1Var2.C;
            if (num13 != null) {
                im1Var.A = num13;
            }
            CharSequence charSequence11 = jm1Var2.D;
            if (charSequence11 != null) {
                im1Var.B = charSequence11;
            }
            CharSequence charSequence12 = jm1Var2.E;
            if (charSequence12 != null) {
                im1Var.C = charSequence12;
            }
            CharSequence charSequence13 = jm1Var2.F;
            if (charSequence13 != null) {
                im1Var.D = charSequence13;
            }
            Bundle bundle = jm1Var2.G;
            if (bundle != null) {
                im1Var.E = bundle;
            }
        }
        return new jm1(im1Var);
    }

    public final void a(float f10) {
        r();
        int i10 = ib3.f90737a;
        final float fMax = Math.max(0.0f, Math.min(f10, 1.0f));
        if (this.T == fMax) {
            return;
        }
        this.T = fMax;
        a(1, 2, Float.valueOf(this.f97720v.f97199g * fMax));
        pf1 pf1Var = this.f97708j;
        pf1Var.a(22, new mf1() { // from class: bt.nd
            @Override // yads.mf1
            public final void invoke(Object obj) {
                ((me2) obj).onVolumeChanged(fMax);
            }
        });
        pf1Var.a();
    }

    public final void a(final int i10, final int i11) {
        if (i10 == this.P && i11 == this.Q) {
            return;
        }
        this.P = i10;
        this.Q = i11;
        pf1 pf1Var = this.f97708j;
        pf1Var.a(24, new mf1() { // from class: bt.ld
            @Override // yads.mf1
            public final void invoke(Object obj) {
                ((me2) obj).onSurfaceSizeChanged(i10, i11);
            }
        });
        pf1Var.a();
    }

    public final void a(int i10, int i11, Object obj) {
        for (ro roVar : this.f97704f) {
            if (roVar.f94535b == i10) {
                bf2 bf2VarA = a(roVar);
                boolean z10 = !bf2VarA.f87989g;
                if (!z10) {
                    throw new IllegalStateException();
                }
                bf2VarA.f87986d = i11;
                if (!z10) {
                    throw new IllegalStateException();
                }
                bf2VarA.f87987e = obj;
                bf2VarA.a();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(int i10, int i11, boolean z10) {
        int i12 = 0;
        int i13 = (!z10 || i10 == -1) ? 0 : 1;
        if (i13 != 0 && i10 != 1) {
            i12 = 1;
        }
        ce2 ce2Var = this.Z;
        if (ce2Var.f88441l == i13 && ce2Var.f88442m == i12) {
            return;
        }
        this.A++;
        ce2 ce2Var2 = new ce2(ce2Var.f88430a, ce2Var.f88431b, ce2Var.f88432c, ce2Var.f88433d, ce2Var.f88434e, ce2Var.f88435f, ce2Var.f88436g, ce2Var.f88437h, ce2Var.f88438i, ce2Var.f88439j, ce2Var.f88440k, i13, i12, ce2Var.f88443n, ce2Var.f88445p, ce2Var.f88446q, ce2Var.f88447r, ce2Var.f88444o);
        i53 i53Var = this.f97707i.f90061i;
        i53Var.getClass();
        h53 h53VarA = i53.a();
        h53VarA.f90254a = i53Var.f90680a.obtainMessage(1, i13, i12);
        h53VarA.b();
        a(ce2Var2, 0, i11, false, 5, -9223372036854775807L);
    }

    public final void a(SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        a(surface);
        this.J = surface;
    }

    public final void a(Surface surface) {
        ArrayList arrayList = new ArrayList();
        ro[] roVarArr = this.f97704f;
        int length = roVarArr.length;
        int i10 = 0;
        while (true) {
            boolean z10 = true;
            if (i10 >= length) {
                Object obj = this.I;
                if (obj == null || obj == surface) {
                    z10 = false;
                } else {
                    try {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((bf2) it.next()).a(this.f97724z);
                        }
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    } catch (TimeoutException unused2) {
                    }
                    z10 = false;
                    Object obj2 = this.I;
                    Surface surface2 = this.J;
                    if (obj2 == surface2) {
                        surface2.release();
                        this.J = null;
                    }
                }
                this.I = surface;
                if (z10) {
                    a(new pn0(2, new lp0(3), 1003, 0));
                    return;
                }
                return;
            }
            ro roVar = roVarArr[i10];
            if (roVar.f94535b == 2) {
                bf2 bf2VarA = a(roVar);
                boolean z11 = !bf2VarA.f87989g;
                if (!z11) {
                    throw new IllegalStateException();
                }
                bf2VarA.f87986d = 1;
                if (!z11) {
                    throw new IllegalStateException();
                }
                bf2VarA.f87987e = surface;
                arrayList.add(bf2VarA.a());
            }
            i10++;
        }
    }

    public final void a(TextureView textureView) {
        r();
        if (textureView == null) {
            r();
            o();
            a((Surface) null);
            a(0, 0);
            return;
        }
        o();
        this.N = textureView;
        if (textureView.getSurfaceTextureListener() != null) {
            ih1.d("ExoPlayerImpl", "Replacing existing SurfaceTextureListener.");
        }
        textureView.setSurfaceTextureListener(this.f97717s);
        SurfaceTexture surfaceTexture = textureView.isAvailable() ? textureView.getSurfaceTexture() : null;
        if (surfaceTexture == null) {
            a((Surface) null);
            a(0, 0);
        } else {
            Surface surface = new Surface(surfaceTexture);
            a(surface);
            this.J = surface;
            a(textureView.getWidth(), textureView.getHeight());
        }
    }

    public final void a(final ce2 ce2Var, final int i10, final int i11, boolean z10, final int i12, long j10) {
        Pair pair;
        int i13;
        final fm1 fm1Var;
        boolean z11;
        boolean z12;
        boolean z13;
        Object obj;
        int i14;
        fm1 fm1Var2;
        Object obj2;
        int i15;
        long j11;
        long j12;
        long jB;
        long jB2;
        Object obj3;
        fm1 fm1Var3;
        Object obj4;
        int iA;
        ce2 ce2Var2 = this.Z;
        this.Z = ce2Var;
        boolean z14 = !ce2Var2.f88430a.equals(ce2Var.f88430a);
        s63 s63Var = ce2Var2.f88430a;
        s63 s63Var2 = ce2Var.f88430a;
        if (s63Var2.c() && s63Var.c()) {
            pair = new Pair(Boolean.FALSE, -1);
        } else if (s63Var2.c() != s63Var.c()) {
            pair = new Pair(Boolean.TRUE, 3);
        } else if (s63Var.a(s63Var.a(ce2Var2.f88431b.f94492a, this.f97710l).f93449d, this.f94091a, 0L).f94299b.equals(s63Var2.a(s63Var2.a(ce2Var.f88431b.f94492a, this.f97710l).f93449d, this.f94091a, 0L).f94299b)) {
            pair = (z10 && i12 == 0 && ce2Var2.f88431b.f94495d < ce2Var.f88431b.f94495d) ? new Pair(Boolean.TRUE, 0) : new Pair(Boolean.FALSE, -1);
        } else {
            if (z10 && i12 == 0) {
                i13 = 1;
            } else if (z10 && i12 == 1) {
                i13 = 2;
            } else {
                if (!z14) {
                    throw new IllegalStateException();
                }
                i13 = 3;
            }
            pair = new Pair(Boolean.TRUE, Integer.valueOf(i13));
        }
        boolean zBooleanValue = ((Boolean) pair.first).booleanValue();
        final int iIntValue = ((Integer) pair.second).intValue();
        jm1 jm1VarA = this.G;
        if (zBooleanValue) {
            fm1Var = !ce2Var.f88430a.c() ? ce2Var.f88430a.a(ce2Var.f88430a.a(ce2Var.f88431b.f94492a, this.f97710l).f93449d, this.f94091a, 0L).f94301d : null;
            this.Y = jm1.H;
        } else {
            fm1Var = null;
        }
        if (zBooleanValue || !ce2Var2.f88439j.equals(ce2Var.f88439j)) {
            jm1 jm1Var = this.Y;
            jm1Var.getClass();
            im1 im1Var = new im1(jm1Var);
            List list = ce2Var.f88439j;
            for (int i16 = 0; i16 < list.size(); i16++) {
                ts1 ts1Var = (ts1) list.get(i16);
                int i17 = 0;
                while (true) {
                    ss1[] ss1VarArr = ts1Var.f95344b;
                    if (i17 < ss1VarArr.length) {
                        ss1VarArr[i17].a(im1Var);
                        i17++;
                    }
                }
            }
            this.Y = new jm1(im1Var);
            jm1VarA = a();
        }
        boolean z15 = !jm1VarA.equals(this.G);
        this.G = jm1VarA;
        boolean z16 = ce2Var2.f88441l != ce2Var.f88441l;
        boolean z17 = ce2Var2.f88434e != ce2Var.f88434e;
        if (z17 || z16) {
            q();
        }
        boolean z18 = ce2Var2.f88436g != ce2Var.f88436g;
        if (!ce2Var2.f88430a.equals(ce2Var.f88430a)) {
            this.f97708j.a(0, new mf1() { // from class: bt.rd
                @Override // yads.mf1
                public final void invoke(Object obj5) {
                    zn0.a(ce2Var, i10, (me2) obj5);
                }
            });
        }
        if (z10) {
            p63 p63Var = new p63();
            if (ce2Var2.f88430a.c()) {
                z11 = z17;
                z12 = z18;
                obj = null;
                i14 = -1;
                fm1Var2 = null;
                obj2 = null;
                i15 = -1;
            } else {
                Object obj5 = ce2Var2.f88431b.f94492a;
                ce2Var2.f88430a.a(obj5, p63Var);
                int i18 = p63Var.f93449d;
                int iA2 = ce2Var2.f88430a.a(obj5);
                z11 = z17;
                z12 = z18;
                obj2 = obj5;
                obj = ce2Var2.f88430a.a(i18, this.f94091a, 0L).f94299b;
                fm1Var2 = this.f94091a.f94301d;
                i14 = i18;
                i15 = iA2;
            }
            if (i12 == 0) {
                if (ce2Var2.f88431b.a()) {
                    ym1 ym1Var = ce2Var2.f88431b;
                    jB = p63Var.a(ym1Var.f94493b, ym1Var.f94494c);
                    jB2 = b(ce2Var2);
                } else if (ce2Var2.f88431b.f94496e != -1) {
                    jB = b(this.Z);
                    jB2 = jB;
                } else {
                    j11 = p63Var.f93451f;
                    j12 = p63Var.f93450e;
                    jB = j11 + j12;
                    jB2 = jB;
                }
            } else if (ce2Var2.f88431b.a()) {
                jB = ce2Var2.f88447r;
                jB2 = b(ce2Var2);
            } else {
                j11 = p63Var.f93451f;
                j12 = ce2Var2.f88447r;
                jB = j11 + j12;
                jB2 = jB;
            }
            long jB3 = ib3.b(jB);
            long jB4 = ib3.b(jB2);
            ym1 ym1Var2 = ce2Var2.f88431b;
            final ne2 ne2Var = new ne2(obj, i14, fm1Var2, obj2, i15, jB3, jB4, ym1Var2.f94493b, ym1Var2.f94494c);
            int iE = e();
            if (this.Z.f88430a.c()) {
                obj3 = null;
                fm1Var3 = null;
                obj4 = null;
                iA = -1;
            } else {
                ce2 ce2Var3 = this.Z;
                Object obj6 = ce2Var3.f88431b.f94492a;
                ce2Var3.f88430a.a(obj6, this.f97710l);
                iA = this.Z.f88430a.a(obj6);
                obj3 = this.Z.f88430a.a(iE, this.f94091a, 0L).f94299b;
                fm1Var3 = this.f94091a.f94301d;
                obj4 = obj6;
            }
            long jB5 = ib3.b(j10);
            long jB6 = this.Z.f88431b.a() ? ib3.b(b(this.Z)) : jB5;
            ym1 ym1Var3 = this.Z.f88431b;
            final ne2 ne2Var2 = new ne2(obj3, iE, fm1Var3, obj4, iA, jB5, jB6, ym1Var3.f94493b, ym1Var3.f94494c);
            this.f97708j.a(11, new mf1() { // from class: bt.wd
                @Override // yads.mf1
                public final void invoke(Object obj7) {
                    zn0.a(i12, ne2Var, ne2Var2, (me2) obj7);
                }
            });
        } else {
            z11 = z17;
            z12 = z18;
        }
        if (zBooleanValue) {
            pf1 pf1Var = this.f97708j;
            mf1 mf1Var = new mf1() { // from class: bt.xd
                @Override // yads.mf1
                public final void invoke(Object obj7) {
                    ((me2) obj7).a(fm1Var, iIntValue);
                }
            };
            z13 = true;
            pf1Var.a(1, mf1Var);
        } else {
            z13 = true;
        }
        if (ce2Var2.f88435f != ce2Var.f88435f) {
            this.f97708j.a(10, new mf1() { // from class: bt.yd
                @Override // yads.mf1
                public final void invoke(Object obj7) {
                    ((me2) obj7).b(ce2Var.f88435f);
                }
            });
            if (ce2Var.f88435f != null) {
                this.f97708j.a(10, new mf1() { // from class: bt.fd
                    @Override // yads.mf1
                    public final void invoke(Object obj7) {
                        ((me2) obj7).a(ce2Var.f88435f);
                    }
                });
            }
        }
        t73 t73Var = ce2Var2.f88438i;
        t73 t73Var2 = ce2Var.f88438i;
        if (t73Var != t73Var2) {
            s73 s73Var = this.f97705g;
            Object obj7 = t73Var2.f95092e;
            ((mi1) s73Var).getClass();
            this.f97708j.a(2, new mf1() { // from class: bt.gd
                @Override // yads.mf1
                public final void invoke(Object obj8) {
                    ((me2) obj8).a(ce2Var.f88438i.f95091d);
                }
            });
        }
        if (z15) {
            final jm1 jm1Var2 = this.G;
            this.f97708j.a(14, new mf1() { // from class: bt.hd
                @Override // yads.mf1
                public final void invoke(Object obj8) {
                    ((me2) obj8).a(jm1Var2);
                }
            });
        }
        if (z12) {
            this.f97708j.a(3, new mf1() { // from class: bt.id
                @Override // yads.mf1
                public final void invoke(Object obj8) {
                    zn0.d(ce2Var, (me2) obj8);
                }
            });
        }
        if (z11 || z16) {
            this.f97708j.a(-1, new mf1() { // from class: bt.jd
                @Override // yads.mf1
                public final void invoke(Object obj8) {
                    ce2 ce2Var4 = ce2Var;
                    ((me2) obj8).onPlayerStateChanged(ce2Var4.f88441l, ce2Var4.f88434e);
                }
            });
        }
        if (z11) {
            this.f97708j.a(4, new mf1() { // from class: bt.kd
                @Override // yads.mf1
                public final void invoke(Object obj8) {
                    ((me2) obj8).onPlaybackStateChanged(ce2Var.f88434e);
                }
            });
        }
        if (z16) {
            this.f97708j.a(5, new mf1() { // from class: bt.sd
                @Override // yads.mf1
                public final void invoke(Object obj8) {
                    me2 me2Var = (me2) obj8;
                    me2Var.onPlayWhenReadyChanged(ce2Var.f88441l, i11);
                }
            });
        }
        if (ce2Var2.f88442m != ce2Var.f88442m) {
            this.f97708j.a(6, new mf1() { // from class: bt.td
                @Override // yads.mf1
                public final void invoke(Object obj8) {
                    ((me2) obj8).onPlaybackSuppressionReasonChanged(ce2Var.f88442m);
                }
            });
        }
        if (((ce2Var2.f88434e == 3 && ce2Var2.f88441l && ce2Var2.f88442m == 0) ? z13 : false) != ((ce2Var.f88434e == 3 && ce2Var.f88441l && ce2Var.f88442m == 0) ? z13 : false)) {
            this.f97708j.a(7, new mf1() { // from class: bt.ud
                @Override // yads.mf1
                public final void invoke(Object obj8) {
                    zn0.h(ce2Var, (me2) obj8);
                }
            });
        }
        if (!ce2Var2.f88443n.equals(ce2Var.f88443n)) {
            this.f97708j.a(12, new mf1() { // from class: bt.vd
                @Override // yads.mf1
                public final void invoke(Object obj8) {
                    ((me2) obj8).a(ce2Var.f88443n);
                }
            });
        }
        p();
        this.f97708j.a();
        if (ce2Var2.f88444o != ce2Var.f88444o) {
            Iterator it = this.f97709k.iterator();
            while (it.hasNext()) {
                ((wn0) ((qn0) it.next())).f96456a.q();
            }
        }
    }

    public final void a(co0 co0Var) {
        boolean z10;
        int i10 = this.A - co0Var.f88524c;
        this.A = i10;
        boolean z11 = true;
        if (co0Var.f88525d) {
            this.B = co0Var.f88526e;
            this.C = true;
        }
        if (co0Var.f88527f) {
            this.D = co0Var.f88528g;
        }
        if (i10 == 0) {
            s63 s63Var = co0Var.f88523b.f88430a;
            if (!this.Z.f88430a.c() && s63Var.c()) {
                this.f97698a0 = -1;
                this.f97700b0 = 0L;
            }
            if (!s63Var.c()) {
                List listAsList = Arrays.asList(((xf2) s63Var).f96761j);
                if (listAsList.size() != this.f97711m.size()) {
                    throw new IllegalStateException();
                }
                for (int i11 = 0; i11 < listAsList.size(); i11++) {
                    ((yn0) this.f97711m.get(i11)).f97247b = (s63) listAsList.get(i11);
                }
            }
            long j10 = -9223372036854775807L;
            if (this.C) {
                if (co0Var.f88523b.f88431b.equals(this.Z.f88431b) && co0Var.f88523b.f88433d == this.Z.f88447r) {
                    z11 = false;
                }
                if (z11) {
                    if (s63Var.c() || co0Var.f88523b.f88431b.a()) {
                        j10 = co0Var.f88523b.f88433d;
                    } else {
                        ce2 ce2Var = co0Var.f88523b;
                        ym1 ym1Var = ce2Var.f88431b;
                        long j11 = ce2Var.f88433d;
                        s63Var.a(ym1Var.f94492a, this.f97710l);
                        j10 = j11 + this.f97710l.f93451f;
                    }
                }
                z10 = z11;
            } else {
                z10 = false;
            }
            this.C = false;
            a(co0Var.f88523b, 1, this.D, z10, this.B, j10);
        }
    }

    public final void a(me2 me2Var) {
        me2Var.getClass();
        pf1 pf1Var = this.f97708j;
        if (pf1Var.f93581g) {
            return;
        }
        pf1Var.f93578d.add(new of1(me2Var));
    }

    public final /* synthetic */ void a(me2 me2Var, dw0 dw0Var) {
        me2Var.getClass();
    }

    public final void a(mo moVar) {
        r();
        List listSingletonList = Collections.singletonList(moVar);
        r();
        r();
        i();
        r();
        a(this.Z);
        int i10 = ib3.f90737a;
        this.A++;
        if (!this.f97711m.isEmpty()) {
            b(this.f97711m.size());
        }
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < listSingletonList.size(); i11++) {
            gn1 gn1Var = new gn1((mo) listSingletonList.get(i11), this.f97712n);
            arrayList.add(gn1Var);
            this.f97711m.add(i11, new yn0(gn1Var.f90041a.f96111o, gn1Var.f90042b));
        }
        this.E = this.E.a(arrayList.size());
        xf2 xf2Var = new xf2(this.f97711m, this.E);
        if (!xf2Var.c() && -1 >= xf2Var.f96757f) {
            throw new f31();
        }
        int iA = xf2Var.a(false);
        ce2 ce2VarA = a(this.Z, xf2Var, a(xf2Var, iA, -9223372036854775807L));
        int i12 = ce2VarA.f88434e;
        if (iA != -1 && i12 != 1) {
            i12 = (xf2Var.c() || iA >= xf2Var.f96757f) ? 4 : 2;
        }
        ce2 ce2VarA2 = ce2VarA.a(i12);
        this.f97707i.f90061i.a(17, new bo0(iA, ib3.a(-9223372036854775807L), this.E, arrayList)).b();
        a(ce2VarA2, 0, 1, (this.Z.f88431b.f94492a.equals(ce2VarA2.f88431b.f94492a) || this.Z.f88430a.c()) ? false : true, 4, a(ce2VarA2));
    }

    public final void a(pn0 pn0Var) {
        ce2 ce2Var = this.Z;
        ce2 ce2VarA = ce2Var.a(ce2Var.f88431b);
        ce2VarA.f88445p = ce2VarA.f88447r;
        ce2VarA.f88446q = 0L;
        ce2 ce2VarA2 = ce2VarA.a(1);
        if (pn0Var != null) {
            ce2VarA2 = ce2VarA2.a(pn0Var);
        }
        ce2 ce2Var2 = ce2VarA2;
        this.A++;
        i53 i53Var = this.f97707i.f90061i;
        i53Var.getClass();
        h53 h53VarA = i53.a();
        h53VarA.f90254a = i53Var.f90680a.obtainMessage(6);
        h53VarA.b();
        a(ce2Var2, 0, 1, ce2Var2.f88430a.c() && !this.Z.f88430a.c(), 4, a(ce2Var2));
    }

    public final void a(wn0 wn0Var) {
        this.f97709k.add(wn0Var);
    }

    public final void a(boolean z10) {
        r();
        yk ykVar = this.f97720v;
        r();
        int iA = ykVar.a(z10, this.Z.f88434e);
        int i10 = 1;
        if (z10 && iA != 1) {
            i10 = 2;
        }
        a(iA, i10, z10);
    }

    public final long b() {
        r();
        r();
        if (!this.Z.f88431b.a()) {
            r();
            return ib3.b(a(this.Z));
        }
        ce2 ce2Var = this.Z;
        ce2Var.f88430a.a(ce2Var.f88431b.f94492a, this.f97710l);
        ce2 ce2Var2 = this.Z;
        return ce2Var2.f88432c == -9223372036854775807L ? ib3.b(ce2Var2.f88430a.a(e(), this.f94091a, 0L).f94311n) : ib3.b(this.f97710l.f93451f) + ib3.b(this.Z.f88432c);
    }

    public final void b(int i10) {
        for (int i11 = i10 - 1; i11 >= 0; i11--) {
            this.f97711m.remove(i11);
        }
        sy2 sy2Var = this.E;
        int[] iArr = new int[sy2Var.f95015b.length - i10];
        int i12 = 0;
        int i13 = 0;
        while (true) {
            int[] iArr2 = sy2Var.f95015b;
            if (i12 >= iArr2.length) {
                this.E = new sy2(iArr, new Random(sy2Var.f95014a.nextLong()));
                return;
            }
            int i14 = iArr2[i12];
            if (i14 < 0 || i14 >= i10) {
                int i15 = i12 - i13;
                if (i14 >= 0) {
                    i14 -= i10;
                }
                iArr[i15] = i14;
            } else {
                i13++;
            }
            i12++;
        }
    }

    public final void b(final co0 co0Var) {
        i53 i53Var = this.f97706h;
        i53Var.f90680a.post(new Runnable() { // from class: bt.od
            @Override // java.lang.Runnable
            public final void run() {
                this.f6207b.a(co0Var);
            }
        });
    }

    public final int c() {
        r();
        r();
        if (this.Z.f88431b.a()) {
            return this.Z.f88431b.f94493b;
        }
        return -1;
    }

    public final /* synthetic */ void c(me2 me2Var) {
        me2Var.a(this.F);
    }

    public final int d() {
        r();
        r();
        if (this.Z.f88431b.a()) {
            return this.Z.f88431b.f94494c;
        }
        return -1;
    }

    public final void d(me2 me2Var) {
        me2Var.getClass();
        pf1 pf1Var = this.f97708j;
        for (of1 of1Var : pf1Var.f93578d) {
            if (of1Var.f93207a.equals(me2Var)) {
                nf1 nf1Var = pf1Var.f93577c;
                of1Var.f93210d = true;
                if (of1Var.f93209c) {
                    nf1Var.a(of1Var.f93207a, of1Var.f93208b.a());
                }
                pf1Var.f93578d.remove(of1Var);
            }
        }
    }

    public final int e() {
        r();
        int i10 = i();
        if (i10 == -1) {
            return 0;
        }
        return i10;
    }

    public final int f() {
        r();
        if (this.Z.f88430a.c()) {
            return 0;
        }
        ce2 ce2Var = this.Z;
        return ce2Var.f88430a.a(ce2Var.f88431b.f94492a);
    }

    public final long g() {
        r();
        return ib3.b(a(this.Z));
    }

    public final s63 h() {
        r();
        return this.Z.f88430a;
    }

    public final int i() {
        if (this.Z.f88430a.c()) {
            return this.f97698a0;
        }
        ce2 ce2Var = this.Z;
        return ce2Var.f88430a.a(ce2Var.f88431b.f94492a, this.f97710l).f93449d;
    }

    public final long j() {
        r();
        r();
        if (this.Z.f88431b.a()) {
            ce2 ce2Var = this.Z;
            ym1 ym1Var = ce2Var.f88431b;
            ce2Var.f88430a.a(ym1Var.f94492a, this.f97710l);
            return ib3.b(this.f97710l.a(ym1Var.f94493b, ym1Var.f94494c));
        }
        r();
        s63 s63Var = this.Z.f88430a;
        if (s63Var.c()) {
            return -9223372036854775807L;
        }
        return ib3.b(s63Var.a(e(), this.f94091a, 0L).f94312o);
    }

    public final int k() {
        AudioTrack audioTrack = this.H;
        if (audioTrack != null && audioTrack.getAudioSessionId() != 0) {
            this.H.release();
            this.H = null;
        }
        if (this.H == null) {
            this.H = new AudioTrack(3, 4000, 4, 2, 2, 0, 0);
        }
        return this.H.getAudioSessionId();
    }

    public final boolean l() {
        r();
        return this.Z.f88431b.a();
    }

    public final void m() {
        r();
        r();
        boolean z10 = this.Z.f88441l;
        int iA = this.f97720v.a(z10, 2);
        a(iA, (!z10 || iA == 1) ? 1 : 2, z10);
        ce2 ce2Var = this.Z;
        if (ce2Var.f88434e != 1) {
            return;
        }
        ce2 ce2VarA = ce2Var.a((pn0) null);
        ce2 ce2VarA2 = ce2VarA.a(ce2VarA.f88430a.c() ? 4 : 2);
        this.A++;
        i53 i53Var = this.f97707i.f90061i;
        i53Var.getClass();
        h53 h53VarA = i53.a();
        h53VarA.f90254a = i53Var.f90680a.obtainMessage(0);
        h53VarA.b();
        a(ce2VarA2, 1, 1, false, 5, -9223372036854775807L);
    }

    public final void n() {
        String str;
        AudioTrack audioTrack;
        StringBuilder sb2 = new StringBuilder("Release ");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" [ExoPlayerLib/2.18.1] [");
        sb2.append(ib3.f90741e);
        sb2.append("] [");
        synchronized (ho0.class) {
            str = ho0.f90473b;
        }
        sb2.append(str);
        sb2.append(C3978d4.j.f31385e);
        ih1.c("ExoPlayerImpl", sb2.toString());
        r();
        if (ib3.f90737a < 21 && (audioTrack = this.H) != null) {
            audioTrack.release();
            this.H = null;
        }
        this.f97719u.a();
        this.f97721w.b();
        fn3 fn3Var = this.f97722x;
        fn3Var.f89646b = false;
        fn3Var.b();
        uo3 uo3Var = this.f97723y;
        uo3Var.f95736b = false;
        uo3Var.b();
        yk ykVar = this.f97720v;
        ykVar.f97195c = null;
        ykVar.a();
        if (!this.f97707i.h()) {
            pf1 pf1Var = this.f97708j;
            pf1Var.a(10, new mf1() { // from class: bt.md
                @Override // yads.mf1
                public final void invoke(Object obj) {
                    zn0.b((me2) obj);
                }
            });
            pf1Var.a();
        }
        pf1 pf1Var2 = this.f97708j;
        for (of1 of1Var : pf1Var2.f93578d) {
            nf1 nf1Var = pf1Var2.f93577c;
            of1Var.f93210d = true;
            if (of1Var.f93209c) {
                nf1Var.a(of1Var.f93207a, of1Var.f93208b.a());
            }
        }
        pf1Var2.f93578d.clear();
        pf1Var2.f93581g = true;
        this.f97706h.f90680a.removeCallbacksAndMessages(null);
        im imVar = this.f97715q;
        se seVar = this.f97713o;
        gm gmVar = ((dc0) imVar).f88800b;
        for (fm fmVar : gmVar.f90034a) {
            if (fmVar.f89620b == seVar) {
                fmVar.f89621c = true;
                gmVar.f90034a.remove(fmVar);
            }
        }
        ce2 ce2VarA = this.Z.a(1);
        this.Z = ce2VarA;
        ce2 ce2VarA2 = ce2VarA.a(ce2VarA.f88431b);
        this.Z = ce2VarA2;
        ce2VarA2.f88445p = ce2VarA2.f88447r;
        this.Z.f88446q = 0L;
        ((kb0) this.f97713o).c();
        this.f97705g.a();
        o();
        Surface surface = this.J;
        if (surface != null) {
            surface.release();
            this.J = null;
        }
        int i10 = q20.f93867b;
    }

    public final void o() {
        if (this.L != null) {
            bf2 bf2VarA = a(this.f97718t);
            boolean z10 = !bf2VarA.f87989g;
            if (!z10) {
                throw new IllegalStateException();
            }
            bf2VarA.f87986d = 10000;
            if (!z10) {
                throw new IllegalStateException();
            }
            bf2VarA.f87987e = null;
            bf2VarA.a();
            this.L.f90645a.remove(this.f97717s);
            this.L = null;
        }
        TextureView textureView = this.N;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != this.f97717s) {
                ih1.d("ExoPlayerImpl", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.N.setSurfaceTextureListener(null);
            }
            this.N = null;
        }
        SurfaceHolder surfaceHolder = this.K;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.f97717s);
            this.K = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p() {
        /*
            Method dump skipped, instruction units count: 369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.zn0.p():void");
    }

    public final void q() {
        r();
        int i10 = this.Z.f88434e;
        if (i10 != 1) {
            if (i10 == 2 || i10 == 3) {
                r();
                boolean z10 = this.Z.f88444o;
                fn3 fn3Var = this.f97722x;
                r();
                fn3Var.f89646b = this.Z.f88441l && !z10;
                fn3Var.b();
                uo3 uo3Var = this.f97723y;
                r();
                uo3Var.f95736b = this.Z.f88441l;
                uo3Var.b();
                return;
            }
            if (i10 != 4) {
                throw new IllegalStateException();
            }
        }
        fn3 fn3Var2 = this.f97722x;
        fn3Var2.f89646b = false;
        fn3Var2.b();
        uo3 uo3Var2 = this.f97723y;
        uo3Var2.f95736b = false;
        uo3Var2.b();
    }

    public final void r() {
        this.f97702d.b();
        if (Thread.currentThread() != this.f97714p.getThread()) {
            String name = Thread.currentThread().getName();
            String name2 = this.f97714p.getThread().getName();
            int i10 = ib3.f90737a;
            Locale locale = Locale.US;
            String str = "Player is accessed on the wrong thread.\nCurrent thread: '" + name + "'\nExpected thread: '" + name2 + "'\nSee https://exoplayer.dev/issues/player-accessed-on-wrong-thread";
            if (this.V) {
                throw new IllegalStateException(str);
            }
            ih1.d("ExoPlayerImpl", ih1.a(str, this.W ? null : new IllegalStateException()));
            this.W = true;
        }
    }
}
