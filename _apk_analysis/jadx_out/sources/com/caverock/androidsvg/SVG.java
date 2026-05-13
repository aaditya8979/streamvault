package com.caverock.androidsvg;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import android.graphics.RectF;
import androidx.core.view.ViewCompat;
import com.caverock.androidsvg.CSSParser;
import com.ironsource.C3978d4;
import com.ironsource.Z7;
import com.mbridge.msdk.MBridgeConstans;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class SVG {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static boolean f14664g = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d0 f14665a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f14666b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f14667c = "";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f14668d = 96.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CSSParser.n f14669e = new CSSParser.n();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Map<String, j0> f14670f = new HashMap();

    public enum GradientSpread {
        pad,
        reflect,
        repeat
    }

    public static class Style implements Cloneable {
        public String A;
        public Boolean B;
        public Boolean C;
        public m0 D;
        public Float E;
        public String F;
        public FillRule G;
        public String H;
        public m0 I;
        public Float J;
        public m0 K;
        public Float L;
        public VectorEffect M;
        public RenderQuality N;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f14672b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public m0 f14673c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public FillRule f14674d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Float f14675e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public m0 f14676f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Float f14677g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public o f14678h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public LineCap f14679i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public LineJoin f14680j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Float f14681k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public o[] f14682l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public o f14683m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public Float f14684n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public f f14685o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public List<String> f14686p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public o f14687q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Integer f14688r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public FontStyle f14689s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public TextDecoration f14690t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public TextDirection f14691u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public TextAnchor f14692v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Boolean f14693w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public c f14694x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public String f14695y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public String f14696z;

        public enum FillRule {
            NonZero,
            EvenOdd
        }

        public enum FontStyle {
            Normal,
            Italic,
            Oblique
        }

        public enum LineCap {
            Butt,
            Round,
            Square
        }

        public enum LineJoin {
            Miter,
            Round,
            Bevel
        }

        public enum RenderQuality {
            auto,
            optimizeQuality,
            optimizeSpeed
        }

        public enum TextAnchor {
            Start,
            Middle,
            End
        }

        public enum TextDecoration {
            None,
            Underline,
            Overline,
            LineThrough,
            Blink
        }

        public enum TextDirection {
            LTR,
            RTL
        }

        public enum VectorEffect {
            None,
            NonScalingStroke
        }

        public static Style a() {
            Style style = new Style();
            style.f14672b = -1L;
            f fVar = f.f14744c;
            style.f14673c = fVar;
            FillRule fillRule = FillRule.NonZero;
            style.f14674d = fillRule;
            Float fValueOf = Float.valueOf(1.0f);
            style.f14675e = fValueOf;
            style.f14676f = null;
            style.f14677g = fValueOf;
            style.f14678h = new o(1.0f);
            style.f14679i = LineCap.Butt;
            style.f14680j = LineJoin.Miter;
            style.f14681k = Float.valueOf(4.0f);
            style.f14682l = null;
            style.f14683m = new o(0.0f);
            style.f14684n = fValueOf;
            style.f14685o = fVar;
            style.f14686p = null;
            style.f14687q = new o(12.0f, Unit.pt);
            style.f14688r = 400;
            style.f14689s = FontStyle.Normal;
            style.f14690t = TextDecoration.None;
            style.f14691u = TextDirection.LTR;
            style.f14692v = TextAnchor.Start;
            Boolean bool = Boolean.TRUE;
            style.f14693w = bool;
            style.f14694x = null;
            style.f14695y = null;
            style.f14696z = null;
            style.A = null;
            style.B = bool;
            style.C = bool;
            style.D = fVar;
            style.E = fValueOf;
            style.F = null;
            style.G = fillRule;
            style.H = null;
            style.I = null;
            style.J = fValueOf;
            style.K = null;
            style.L = fValueOf;
            style.M = VectorEffect.None;
            style.N = RenderQuality.auto;
            return style;
        }

        public void b(boolean z10) {
            Boolean bool = Boolean.TRUE;
            this.B = bool;
            if (!z10) {
                bool = Boolean.FALSE;
            }
            this.f14693w = bool;
            this.f14694x = null;
            this.F = null;
            this.f14684n = Float.valueOf(1.0f);
            this.D = f.f14744c;
            this.E = Float.valueOf(1.0f);
            this.H = null;
            this.I = null;
            this.J = Float.valueOf(1.0f);
            this.K = null;
            this.L = Float.valueOf(1.0f);
            this.M = VectorEffect.None;
        }

        public Object clone() throws CloneNotSupportedException {
            Style style = (Style) super.clone();
            o[] oVarArr = this.f14682l;
            if (oVarArr != null) {
                style.f14682l = (o[]) oVarArr.clone();
            }
            return style;
        }
    }

    public enum Unit {
        px,
        em,
        ex,
        in,
        cm,
        mm,
        pt,
        pc,
        percent
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14712a;

        static {
            int[] iArr = new int[Unit.values().length];
            f14712a = iArr;
            try {
                iArr[Unit.px.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14712a[Unit.em.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14712a[Unit.ex.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14712a[Unit.in.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f14712a[Unit.cm.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f14712a[Unit.mm.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f14712a[Unit.pt.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f14712a[Unit.pc.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f14712a[Unit.percent.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public static class a0 extends k {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public o f14713o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public o f14714p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public o f14715q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public o f14716r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public o f14717s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public o f14718t;

        @Override // com.caverock.androidsvg.SVG.l0
        public String n() {
            return "rect";
        }
    }

    public static class a1 extends l0 implements v0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f14719c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public z0 f14720d;

        public a1(String str) {
            this.f14719c = str;
        }

        @Override // com.caverock.androidsvg.SVG.v0
        public z0 c() {
            return this.f14720d;
        }

        public String toString() {
            return "TextChild: '" + this.f14719c + "'";
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f14721a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f14722b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f14723c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f14724d;

        public b(float f10, float f11, float f12, float f13) {
            this.f14721a = f10;
            this.f14722b = f11;
            this.f14723c = f12;
            this.f14724d = f13;
        }

        public b(b bVar) {
            this.f14721a = bVar.f14721a;
            this.f14722b = bVar.f14722b;
            this.f14723c = bVar.f14723c;
            this.f14724d = bVar.f14724d;
        }

        public static b a(float f10, float f11, float f12, float f13) {
            return new b(f10, f11, f12 - f10, f13 - f11);
        }

        public float b() {
            return this.f14721a + this.f14723c;
        }

        public float c() {
            return this.f14722b + this.f14724d;
        }

        public RectF d() {
            return new RectF(this.f14721a, this.f14722b, b(), c());
        }

        public void e(b bVar) {
            float f10 = bVar.f14721a;
            if (f10 < this.f14721a) {
                this.f14721a = f10;
            }
            float f11 = bVar.f14722b;
            if (f11 < this.f14722b) {
                this.f14722b = f11;
            }
            if (bVar.b() > b()) {
                this.f14723c = bVar.b() - this.f14721a;
            }
            if (bVar.c() > c()) {
                this.f14724d = bVar.c() - this.f14722b;
            }
        }

        public String toString() {
            return C3978d4.j.f31383d + this.f14721a + Z7.f30794r + this.f14722b + Z7.f30794r + this.f14723c + Z7.f30794r + this.f14724d + C3978d4.j.f31385e;
        }
    }

    public static class b0 extends j0 implements h0 {
        @Override // com.caverock.androidsvg.SVG.h0
        public List<l0> k() {
            return Collections.emptyList();
        }

        @Override // com.caverock.androidsvg.SVG.h0
        public void l(l0 l0Var) {
        }

        @Override // com.caverock.androidsvg.SVG.l0
        public String n() {
            return "solidColor";
        }
    }

    public static class b1 extends l {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public String f14725p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public o f14726q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public o f14727r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public o f14728s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public o f14729t;

        @Override // com.caverock.androidsvg.SVG.l, com.caverock.androidsvg.SVG.l0
        public String n() {
            return "use";
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public o f14730a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public o f14731b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public o f14732c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public o f14733d;

        public c(o oVar, o oVar2, o oVar3, o oVar4) {
            this.f14730a = oVar;
            this.f14731b = oVar2;
            this.f14732c = oVar3;
            this.f14733d = oVar4;
        }
    }

    public static class c0 extends j0 implements h0 {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Float f14734h;

        @Override // com.caverock.androidsvg.SVG.h0
        public List<l0> k() {
            return Collections.emptyList();
        }

        @Override // com.caverock.androidsvg.SVG.h0
        public void l(l0 l0Var) {
        }

        @Override // com.caverock.androidsvg.SVG.l0
        public String n() {
            return "stop";
        }
    }

    public static class c1 extends p0 implements s {
        @Override // com.caverock.androidsvg.SVG.l0
        public String n() {
            return MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW;
        }
    }

    public static class d extends k {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public o f14735o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public o f14736p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public o f14737q;

        @Override // com.caverock.androidsvg.SVG.l0
        public String n() {
            return "circle";
        }
    }

    public static class d0 extends p0 {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public o f14738q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public o f14739r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public o f14740s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public o f14741t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public String f14742u;

        @Override // com.caverock.androidsvg.SVG.l0
        public String n() {
            return "svg";
        }
    }

    public static class e extends l implements s {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public Boolean f14743p;

        @Override // com.caverock.androidsvg.SVG.l, com.caverock.androidsvg.SVG.l0
        public String n() {
            return "clipPath";
        }
    }

    public interface e0 {
        String a();

        void b(Set<String> set);

        void d(Set<String> set);

        Set<String> e();

        Set<String> f();

        void g(Set<String> set);

        Set<String> getRequiredFeatures();

        void h(Set<String> set);

        void i(String str);

        Set<String> m();
    }

    public static class f extends m0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final f f14744c = new f(ViewCompat.MEASURED_STATE_MASK);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final f f14745d = new f(0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f14746b;

        public f(int i10) {
            this.f14746b = i10;
        }

        public String toString() {
            return String.format("#%08x", Integer.valueOf(this.f14746b));
        }
    }

    public static abstract class f0 extends i0 implements h0, e0 {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public List<l0> f14747i = new ArrayList();

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Set<String> f14748j = null;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public String f14749k = null;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Set<String> f14750l = null;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public Set<String> f14751m = null;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public Set<String> f14752n = null;

        @Override // com.caverock.androidsvg.SVG.e0
        public String a() {
            return this.f14749k;
        }

        @Override // com.caverock.androidsvg.SVG.e0
        public void b(Set<String> set) {
            this.f14752n = set;
        }

        @Override // com.caverock.androidsvg.SVG.e0
        public void d(Set<String> set) {
            this.f14750l = set;
        }

        @Override // com.caverock.androidsvg.SVG.e0
        public Set<String> e() {
            return this.f14751m;
        }

        @Override // com.caverock.androidsvg.SVG.e0
        public Set<String> f() {
            return null;
        }

        @Override // com.caverock.androidsvg.SVG.e0
        public void g(Set<String> set) {
            this.f14748j = set;
        }

        @Override // com.caverock.androidsvg.SVG.e0
        public Set<String> getRequiredFeatures() {
            return this.f14748j;
        }

        @Override // com.caverock.androidsvg.SVG.e0
        public void h(Set<String> set) {
            this.f14751m = set;
        }

        @Override // com.caverock.androidsvg.SVG.e0
        public void i(String str) {
            this.f14749k = str;
        }

        @Override // com.caverock.androidsvg.SVG.h0
        public List<l0> k() {
            return this.f14747i;
        }

        @Override // com.caverock.androidsvg.SVG.h0
        public void l(l0 l0Var) throws SVGParseException {
            this.f14747i.add(l0Var);
        }

        @Override // com.caverock.androidsvg.SVG.e0
        public Set<String> m() {
            return this.f14752n;
        }
    }

    public static class g extends m0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static g f14753b = new g();

        public static g a() {
            return f14753b;
        }
    }

    public static abstract class g0 extends i0 implements e0 {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public Set<String> f14754i = null;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public String f14755j = null;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Set<String> f14756k = null;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Set<String> f14757l = null;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public Set<String> f14758m = null;

        @Override // com.caverock.androidsvg.SVG.e0
        public String a() {
            return this.f14755j;
        }

        @Override // com.caverock.androidsvg.SVG.e0
        public void b(Set<String> set) {
            this.f14758m = set;
        }

        @Override // com.caverock.androidsvg.SVG.e0
        public void d(Set<String> set) {
            this.f14756k = set;
        }

        @Override // com.caverock.androidsvg.SVG.e0
        public Set<String> e() {
            return this.f14757l;
        }

        @Override // com.caverock.androidsvg.SVG.e0
        public Set<String> f() {
            return this.f14756k;
        }

        @Override // com.caverock.androidsvg.SVG.e0
        public void g(Set<String> set) {
            this.f14754i = set;
        }

        @Override // com.caverock.androidsvg.SVG.e0
        public Set<String> getRequiredFeatures() {
            return this.f14754i;
        }

        @Override // com.caverock.androidsvg.SVG.e0
        public void h(Set<String> set) {
            this.f14757l = set;
        }

        @Override // com.caverock.androidsvg.SVG.e0
        public void i(String str) {
            this.f14755j = str;
        }

        @Override // com.caverock.androidsvg.SVG.e0
        public Set<String> m() {
            return this.f14758m;
        }
    }

    public static class h extends l implements s {
        @Override // com.caverock.androidsvg.SVG.l, com.caverock.androidsvg.SVG.l0
        public String n() {
            return "defs";
        }
    }

    public interface h0 {
        List<l0> k();

        void l(l0 l0Var) throws SVGParseException;
    }

    public static class i extends k {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public o f14759o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public o f14760p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public o f14761q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public o f14762r;

        @Override // com.caverock.androidsvg.SVG.l0
        public String n() {
            return "ellipse";
        }
    }

    public static abstract class i0 extends j0 {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public b f14763h = null;
    }

    public static abstract class j extends j0 implements h0 {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public List<l0> f14764h = new ArrayList();

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public Boolean f14765i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Matrix f14766j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public GradientSpread f14767k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public String f14768l;

        @Override // com.caverock.androidsvg.SVG.h0
        public List<l0> k() {
            return this.f14764h;
        }

        @Override // com.caverock.androidsvg.SVG.h0
        public void l(l0 l0Var) throws SVGParseException {
            if (l0Var instanceof c0) {
                this.f14764h.add(l0Var);
                return;
            }
            throw new SVGParseException("Gradient elements cannot contain " + l0Var + " elements.");
        }
    }

    public static abstract class j0 extends l0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f14769c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Boolean f14770d = null;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Style f14771e = null;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Style f14772f = null;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public List<String> f14773g = null;

        public String toString() {
            return n();
        }
    }

    public static abstract class k extends g0 implements m {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public Matrix f14774n;

        @Override // com.caverock.androidsvg.SVG.m
        public void j(Matrix matrix) {
            this.f14774n = matrix;
        }
    }

    public static class k0 extends j {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public o f14775m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public o f14776n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public o f14777o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public o f14778p;

        @Override // com.caverock.androidsvg.SVG.l0
        public String n() {
            return "linearGradient";
        }
    }

    public static class l extends f0 implements m {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public Matrix f14779o;

        @Override // com.caverock.androidsvg.SVG.m
        public void j(Matrix matrix) {
            this.f14779o = matrix;
        }

        @Override // com.caverock.androidsvg.SVG.l0
        public String n() {
            return "group";
        }
    }

    public static class l0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public SVG f14780a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public h0 f14781b;

        public String n() {
            return "";
        }
    }

    public interface m {
        void j(Matrix matrix);
    }

    public static abstract class m0 implements Cloneable {
    }

    public static class n extends n0 implements m {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public String f14782p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public o f14783q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public o f14784r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public o f14785s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public o f14786t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Matrix f14787u;

        @Override // com.caverock.androidsvg.SVG.m
        public void j(Matrix matrix) {
            this.f14787u = matrix;
        }

        @Override // com.caverock.androidsvg.SVG.l0
        public String n() {
            return "image";
        }
    }

    public static abstract class n0 extends f0 {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public PreserveAspectRatio f14788o = null;
    }

    public static class o implements Cloneable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f14789b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Unit f14790c;

        public o(float f10) {
            this.f14789b = f10;
            this.f14790c = Unit.px;
        }

        public o(float f10, Unit unit) {
            this.f14789b = f10;
            this.f14790c = unit;
        }

        public float a() {
            return this.f14789b;
        }

        public float b(float f10) {
            int i10 = a.f14712a[this.f14790c.ordinal()];
            if (i10 == 1) {
                return this.f14789b;
            }
            switch (i10) {
                case 4:
                    return this.f14789b * f10;
                case 5:
                    return (this.f14789b * f10) / 2.54f;
                case 6:
                    return (this.f14789b * f10) / 25.4f;
                case 7:
                    return (this.f14789b * f10) / 72.0f;
                case 8:
                    return (this.f14789b * f10) / 6.0f;
                default:
                    return this.f14789b;
            }
        }

        public float c(com.caverock.androidsvg.b bVar) {
            if (this.f14790c != Unit.percent) {
                return e(bVar);
            }
            b bVarS = bVar.S();
            if (bVarS == null) {
                return this.f14789b;
            }
            float f10 = bVarS.f14723c;
            if (f10 == bVarS.f14724d) {
                return (this.f14789b * f10) / 100.0f;
            }
            return (this.f14789b * ((float) (Math.sqrt((f10 * f10) + (r6 * r6)) / 1.414213562373095d))) / 100.0f;
        }

        public float d(com.caverock.androidsvg.b bVar, float f10) {
            return this.f14790c == Unit.percent ? (this.f14789b * f10) / 100.0f : e(bVar);
        }

        public float e(com.caverock.androidsvg.b bVar) {
            switch (a.f14712a[this.f14790c.ordinal()]) {
                case 9:
                    b bVarS = bVar.S();
                    if (bVarS != null) {
                    }
                    break;
            }
            return this.f14789b;
        }

        public float f(com.caverock.androidsvg.b bVar) {
            if (this.f14790c != Unit.percent) {
                return e(bVar);
            }
            b bVarS = bVar.S();
            return bVarS == null ? this.f14789b : (this.f14789b * bVarS.f14724d) / 100.0f;
        }

        public boolean g() {
            return this.f14789b < 0.0f;
        }

        public boolean i() {
            return this.f14789b == 0.0f;
        }

        public String toString() {
            return String.valueOf(this.f14789b) + this.f14790c;
        }
    }

    public static class o0 extends j {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public o f14791m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public o f14792n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public o f14793o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public o f14794p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public o f14795q;

        @Override // com.caverock.androidsvg.SVG.l0
        public String n() {
            return "radialGradient";
        }
    }

    public static class p extends k {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public o f14796o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public o f14797p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public o f14798q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public o f14799r;

        @Override // com.caverock.androidsvg.SVG.l0
        public String n() {
            return "line";
        }
    }

    public static abstract class p0 extends n0 {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public b f14800p;
    }

    public static class q extends p0 implements s {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public boolean f14801q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public o f14802r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public o f14803s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public o f14804t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public o f14805u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Float f14806v;

        @Override // com.caverock.androidsvg.SVG.l0
        public String n() {
            return "marker";
        }
    }

    public static class q0 extends l {
        @Override // com.caverock.androidsvg.SVG.l, com.caverock.androidsvg.SVG.l0
        public String n() {
            return "switch";
        }
    }

    public static class r extends f0 implements s {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public Boolean f14807o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public Boolean f14808p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public o f14809q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public o f14810r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public o f14811s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public o f14812t;

        @Override // com.caverock.androidsvg.SVG.l0
        public String n() {
            return "mask";
        }
    }

    public static class r0 extends p0 implements s {
        @Override // com.caverock.androidsvg.SVG.l0
        public String n() {
            return "symbol";
        }
    }

    public interface s {
    }

    public static class s0 extends w0 implements v0 {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public String f14813o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public z0 f14814p;

        @Override // com.caverock.androidsvg.SVG.v0
        public z0 c() {
            return this.f14814p;
        }

        @Override // com.caverock.androidsvg.SVG.l0
        public String n() {
            return "tref";
        }

        public void o(z0 z0Var) {
            this.f14814p = z0Var;
        }
    }

    public static class t extends m0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f14815b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public m0 f14816c;

        public t(String str, m0 m0Var) {
            this.f14815b = str;
            this.f14816c = m0Var;
        }

        public String toString() {
            return this.f14815b + Z7.f30794r + this.f14816c;
        }
    }

    public static class t0 extends y0 implements v0 {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public z0 f14817s;

        @Override // com.caverock.androidsvg.SVG.v0
        public z0 c() {
            return this.f14817s;
        }

        @Override // com.caverock.androidsvg.SVG.l0
        public String n() {
            return "tspan";
        }

        public void o(z0 z0Var) {
            this.f14817s = z0Var;
        }
    }

    public static class u extends k {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public v f14818o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public Float f14819p;

        @Override // com.caverock.androidsvg.SVG.l0
        public String n() {
            return "path";
        }
    }

    public static class u0 extends y0 implements z0, m {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public Matrix f14820s;

        @Override // com.caverock.androidsvg.SVG.m
        public void j(Matrix matrix) {
            this.f14820s = matrix;
        }

        @Override // com.caverock.androidsvg.SVG.l0
        public String n() {
            return "text";
        }
    }

    public static class v implements w {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f14822b = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f14824d = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public byte[] f14821a = new byte[8];

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float[] f14823c = new float[16];

        @Override // com.caverock.androidsvg.SVG.w
        public void a(float f10, float f11, float f12, float f13) {
            c((byte) 3);
            d(4);
            float[] fArr = this.f14823c;
            int i10 = this.f14824d;
            int i11 = i10 + 1;
            fArr[i10] = f10;
            int i12 = i11 + 1;
            fArr[i11] = f11;
            int i13 = i12 + 1;
            fArr[i12] = f12;
            this.f14824d = i13 + 1;
            fArr[i13] = f13;
        }

        @Override // com.caverock.androidsvg.SVG.w
        public void b(float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14) {
            c((byte) ((z10 ? 2 : 0) | 4 | (z11 ? 1 : 0)));
            d(5);
            float[] fArr = this.f14823c;
            int i10 = this.f14824d;
            int i11 = i10 + 1;
            fArr[i10] = f10;
            int i12 = i11 + 1;
            fArr[i11] = f11;
            int i13 = i12 + 1;
            fArr[i12] = f12;
            int i14 = i13 + 1;
            fArr[i13] = f13;
            this.f14824d = i14 + 1;
            fArr[i14] = f14;
        }

        public final void c(byte b10) {
            int i10 = this.f14822b;
            byte[] bArr = this.f14821a;
            if (i10 == bArr.length) {
                byte[] bArr2 = new byte[bArr.length * 2];
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                this.f14821a = bArr2;
            }
            byte[] bArr3 = this.f14821a;
            int i11 = this.f14822b;
            this.f14822b = i11 + 1;
            bArr3[i11] = b10;
        }

        @Override // com.caverock.androidsvg.SVG.w
        public void close() {
            c((byte) 8);
        }

        @Override // com.caverock.androidsvg.SVG.w
        public void cubicTo(float f10, float f11, float f12, float f13, float f14, float f15) {
            c((byte) 2);
            d(6);
            float[] fArr = this.f14823c;
            int i10 = this.f14824d;
            int i11 = i10 + 1;
            fArr[i10] = f10;
            int i12 = i11 + 1;
            fArr[i11] = f11;
            int i13 = i12 + 1;
            fArr[i12] = f12;
            int i14 = i13 + 1;
            fArr[i13] = f13;
            int i15 = i14 + 1;
            fArr[i14] = f14;
            this.f14824d = i15 + 1;
            fArr[i15] = f15;
        }

        public final void d(int i10) {
            float[] fArr = this.f14823c;
            if (fArr.length < this.f14824d + i10) {
                float[] fArr2 = new float[fArr.length * 2];
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                this.f14823c = fArr2;
            }
        }

        public void e(w wVar) {
            int i10;
            int i11 = 0;
            for (int i12 = 0; i12 < this.f14822b; i12++) {
                byte b10 = this.f14821a[i12];
                if (b10 == 0) {
                    float[] fArr = this.f14823c;
                    int i13 = i11 + 1;
                    i10 = i13 + 1;
                    wVar.moveTo(fArr[i11], fArr[i13]);
                } else if (b10 != 1) {
                    if (b10 == 2) {
                        float[] fArr2 = this.f14823c;
                        int i14 = i11 + 1;
                        float f10 = fArr2[i11];
                        int i15 = i14 + 1;
                        float f11 = fArr2[i14];
                        int i16 = i15 + 1;
                        float f12 = fArr2[i15];
                        int i17 = i16 + 1;
                        float f13 = fArr2[i16];
                        int i18 = i17 + 1;
                        float f14 = fArr2[i17];
                        i11 = i18 + 1;
                        wVar.cubicTo(f10, f11, f12, f13, f14, fArr2[i18]);
                    } else if (b10 == 3) {
                        float[] fArr3 = this.f14823c;
                        int i19 = i11 + 1;
                        int i20 = i19 + 1;
                        int i21 = i20 + 1;
                        wVar.a(fArr3[i11], fArr3[i19], fArr3[i20], fArr3[i21]);
                        i11 = i21 + 1;
                    } else if (b10 != 8) {
                        boolean z10 = (b10 & 2) != 0;
                        boolean z11 = (b10 & 1) != 0;
                        float[] fArr4 = this.f14823c;
                        int i22 = i11 + 1;
                        float f15 = fArr4[i11];
                        int i23 = i22 + 1;
                        float f16 = fArr4[i22];
                        int i24 = i23 + 1;
                        float f17 = fArr4[i23];
                        int i25 = i24 + 1;
                        wVar.b(f15, f16, f17, z10, z11, fArr4[i24], fArr4[i25]);
                        i11 = i25 + 1;
                    } else {
                        wVar.close();
                    }
                } else {
                    float[] fArr5 = this.f14823c;
                    int i26 = i11 + 1;
                    i10 = i26 + 1;
                    wVar.lineTo(fArr5[i11], fArr5[i26]);
                }
                i11 = i10;
            }
        }

        public boolean f() {
            return this.f14822b == 0;
        }

        @Override // com.caverock.androidsvg.SVG.w
        public void lineTo(float f10, float f11) {
            c((byte) 1);
            d(2);
            float[] fArr = this.f14823c;
            int i10 = this.f14824d;
            int i11 = i10 + 1;
            fArr[i10] = f10;
            this.f14824d = i11 + 1;
            fArr[i11] = f11;
        }

        @Override // com.caverock.androidsvg.SVG.w
        public void moveTo(float f10, float f11) {
            c((byte) 0);
            d(2);
            float[] fArr = this.f14823c;
            int i10 = this.f14824d;
            int i11 = i10 + 1;
            fArr[i10] = f10;
            this.f14824d = i11 + 1;
            fArr[i11] = f11;
        }
    }

    public interface v0 {
        z0 c();
    }

    public interface w {
        void a(float f10, float f11, float f12, float f13);

        void b(float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14);

        void close();

        void cubicTo(float f10, float f11, float f12, float f13, float f14, float f15);

        void lineTo(float f10, float f11);

        void moveTo(float f10, float f11);
    }

    public static abstract class w0 extends f0 {
        @Override // com.caverock.androidsvg.SVG.f0, com.caverock.androidsvg.SVG.h0
        public void l(l0 l0Var) throws SVGParseException {
            if (l0Var instanceof v0) {
                this.f14747i.add(l0Var);
                return;
            }
            throw new SVGParseException("Text content elements cannot contain " + l0Var + " elements.");
        }
    }

    public static class x extends p0 implements s {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public Boolean f14825q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Boolean f14826r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public Matrix f14827s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public o f14828t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public o f14829u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public o f14830v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public o f14831w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public String f14832x;

        @Override // com.caverock.androidsvg.SVG.l0
        public String n() {
            return "pattern";
        }
    }

    public static class x0 extends w0 implements v0 {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public String f14833o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public o f14834p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public z0 f14835q;

        @Override // com.caverock.androidsvg.SVG.v0
        public z0 c() {
            return this.f14835q;
        }

        @Override // com.caverock.androidsvg.SVG.l0
        public String n() {
            return "textPath";
        }

        public void o(z0 z0Var) {
            this.f14835q = z0Var;
        }
    }

    public static class y extends k {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public float[] f14836o;

        @Override // com.caverock.androidsvg.SVG.l0
        public String n() {
            return "polyline";
        }
    }

    public static abstract class y0 extends w0 {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public List<o> f14837o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public List<o> f14838p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public List<o> f14839q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public List<o> f14840r;
    }

    public static class z extends y {
        @Override // com.caverock.androidsvg.SVG.y, com.caverock.androidsvg.SVG.l0
        public String n() {
            return "polygon";
        }
    }

    public interface z0 {
    }

    public static y0.c k() {
        return null;
    }

    public static SVG l(InputStream inputStream) throws SVGParseException {
        return new SVGParser().z(inputStream, f14664g);
    }

    public static SVG m(Context context, int i10) throws SVGParseException {
        return n(context.getResources(), i10);
    }

    public static SVG n(Resources resources, int i10) throws SVGParseException {
        SVGParser sVGParser = new SVGParser();
        InputStream inputStreamOpenRawResource = resources.openRawResource(i10);
        try {
            return sVGParser.z(inputStreamOpenRawResource, f14664g);
        } finally {
            try {
                inputStreamOpenRawResource.close();
            } catch (IOException unused) {
            }
        }
    }

    public static SVG o(String str) throws SVGParseException {
        return new SVGParser().z(new ByteArrayInputStream(str.getBytes()), f14664g);
    }

    public void a(CSSParser.n nVar) {
        this.f14669e.b(nVar);
    }

    public void b() {
        this.f14669e.e(CSSParser.Source.RenderOptions);
    }

    public final String c(String str) {
        if (str.startsWith("\"") && str.endsWith("\"")) {
            str = str.substring(1, str.length() - 1).replace("\\\"", "\"");
        } else if (str.startsWith("'") && str.endsWith("'")) {
            str = str.substring(1, str.length() - 1).replace("\\'", "'");
        }
        return str.replace("\\\n", "").replace("\\A", "\n");
    }

    public List<CSSParser.l> d() {
        return this.f14669e.c();
    }

    public final b e(float f10) {
        Unit unit;
        Unit unit2;
        Unit unit3;
        Unit unit4;
        float fB;
        Unit unit5;
        d0 d0Var = this.f14665a;
        o oVar = d0Var.f14740s;
        o oVar2 = d0Var.f14741t;
        if (oVar == null || oVar.i() || (unit = oVar.f14790c) == (unit2 = Unit.percent) || unit == (unit3 = Unit.em) || unit == (unit4 = Unit.ex)) {
            return new b(-1.0f, -1.0f, -1.0f, -1.0f);
        }
        float fB2 = oVar.b(f10);
        if (oVar2 == null) {
            b bVar = this.f14665a.f14800p;
            fB = bVar != null ? (bVar.f14724d * fB2) / bVar.f14723c : fB2;
        } else {
            if (oVar2.i() || (unit5 = oVar2.f14790c) == unit2 || unit5 == unit3 || unit5 == unit4) {
                return new b(-1.0f, -1.0f, -1.0f, -1.0f);
            }
            fB = oVar2.b(f10);
        }
        return new b(0.0f, 0.0f, fB2, fB);
    }

    public float f() {
        if (this.f14665a != null) {
            return e(this.f14668d).f14724d;
        }
        throw new IllegalArgumentException("SVG document is empty");
    }

    public RectF g() {
        d0 d0Var = this.f14665a;
        if (d0Var == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        b bVar = d0Var.f14800p;
        if (bVar == null) {
            return null;
        }
        return bVar.d();
    }

    public float h() {
        if (this.f14665a != null) {
            return e(this.f14668d).f14723c;
        }
        throw new IllegalArgumentException("SVG document is empty");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final j0 i(h0 h0Var, String str) {
        j0 j0VarI;
        j0 j0Var = (j0) h0Var;
        if (str.equals(j0Var.f14769c)) {
            return j0Var;
        }
        for (Object obj : h0Var.k()) {
            if (obj instanceof j0) {
                j0 j0Var2 = (j0) obj;
                if (str.equals(j0Var2.f14769c)) {
                    return j0Var2;
                }
                if ((obj instanceof h0) && (j0VarI = i((h0) obj, str)) != null) {
                    return j0VarI;
                }
            }
        }
        return null;
    }

    public j0 j(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        if (str.equals(this.f14665a.f14769c)) {
            return this.f14665a;
        }
        if (this.f14670f.containsKey(str)) {
            return this.f14670f.get(str);
        }
        j0 j0VarI = i(this.f14665a, str);
        this.f14670f.put(str, j0VarI);
        return j0VarI;
    }

    public d0 p() {
        return this.f14665a;
    }

    public boolean q() {
        return !this.f14669e.d();
    }

    public Picture r() {
        return t(null);
    }

    public Picture s(int i10, int i11, com.caverock.androidsvg.a aVar) {
        Picture picture = new Picture();
        Canvas canvasBeginRecording = picture.beginRecording(i10, i11);
        if (aVar == null || aVar.f14889f == null) {
            aVar = aVar == null ? new com.caverock.androidsvg.a() : new com.caverock.androidsvg.a(aVar);
            aVar.h(0.0f, 0.0f, i10, i11);
        }
        new com.caverock.androidsvg.b(canvasBeginRecording, this.f14668d).G0(this, aVar);
        picture.endRecording();
        return picture;
    }

    public Picture t(com.caverock.androidsvg.a aVar) {
        o oVar;
        b bVar = (aVar == null || !aVar.f()) ? this.f14665a.f14800p : aVar.f14887d;
        if (aVar != null && aVar.g()) {
            return s((int) Math.ceil(aVar.f14889f.b()), (int) Math.ceil(aVar.f14889f.c()), aVar);
        }
        d0 d0Var = this.f14665a;
        o oVar2 = d0Var.f14740s;
        if (oVar2 != null) {
            Unit unit = oVar2.f14790c;
            Unit unit2 = Unit.percent;
            if (unit != unit2 && (oVar = d0Var.f14741t) != null && oVar.f14790c != unit2) {
                return s((int) Math.ceil(oVar2.b(this.f14668d)), (int) Math.ceil(this.f14665a.f14741t.b(this.f14668d)), aVar);
            }
        }
        if (oVar2 != null && bVar != null) {
            return s((int) Math.ceil(oVar2.b(this.f14668d)), (int) Math.ceil((bVar.f14724d * r1) / bVar.f14723c), aVar);
        }
        o oVar3 = d0Var.f14741t;
        if (oVar3 == null || bVar == null) {
            return s(512, 512, aVar);
        }
        return s((int) Math.ceil((bVar.f14723c * r1) / bVar.f14724d), (int) Math.ceil(oVar3.b(this.f14668d)), aVar);
    }

    public l0 u(String str) {
        if (str == null) {
            return null;
        }
        String strC = c(str);
        if (strC.length() <= 1 || !strC.startsWith("#")) {
            return null;
        }
        return j(strC.substring(1));
    }

    public void v(String str) {
        this.f14667c = str;
    }

    public void w(float f10, float f11, float f12, float f13) {
        d0 d0Var = this.f14665a;
        if (d0Var == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        d0Var.f14800p = new b(f10, f11, f12, f13);
    }

    public void x(d0 d0Var) {
        this.f14665a = d0Var;
    }

    public void y(String str) {
        this.f14666b = str;
    }
}
