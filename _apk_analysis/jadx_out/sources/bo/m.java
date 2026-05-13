package bo;

import bo.l;
import bo.m;
import java.util.Iterator;
import java.util.List;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Regex.kt */
/* JADX INFO: loaded from: classes.dex */
public final class m implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Matcher f5699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final CharSequence f5700b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final k f5701c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public List<String> f5702d;

    /* JADX INFO: compiled from: Regex.kt */
    public static final class a extends cn.d<String> {
        public a() {
        }

        @Override // cn.b, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof String) {
                return contains((String) obj);
            }
            return false;
        }

        public /* bridge */ boolean contains(String str) {
            return super.contains((Object) str);
        }

        @Override // cn.d, java.util.List
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public String get(int i10) {
            String strGroup = m.this.e().group(i10);
            return strGroup == null ? "" : strGroup;
        }

        public /* bridge */ int g(String str) {
            return super.indexOf(str);
        }

        @Override // cn.d, cn.b
        public int getSize() {
            return m.this.e().groupCount() + 1;
        }

        public /* bridge */ int h(String str) {
            return super.lastIndexOf(str);
        }

        @Override // cn.d, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof String) {
                return g((String) obj);
            }
            return -1;
        }

        @Override // cn.d, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof String) {
                return h((String) obj);
            }
            return -1;
        }
    }

    /* JADX INFO: compiled from: Regex.kt */
    public static final class b extends cn.b<j> implements k {
        public b() {
        }

        public static final j j(b bVar, int i10) {
            return bVar.h(i10);
        }

        @Override // cn.b, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj == null ? true : obj instanceof j) {
                return g((j) obj);
            }
            return false;
        }

        public /* bridge */ boolean g(j jVar) {
            return super.contains(jVar);
        }

        @Override // cn.b
        public int getSize() {
            return m.this.e().groupCount() + 1;
        }

        public j h(int i10) {
            zn.i iVarI = p.i(m.this.e(), i10);
            if (iVarI.getStart().intValue() < 0) {
                return null;
            }
            String strGroup = m.this.e().group(i10);
            tn.p.j(strGroup, "group(...)");
            return new j(strGroup, iVarI);
        }

        @Override // cn.b, java.util.Collection
        public boolean isEmpty() {
            return false;
        }

        @Override // cn.b, java.util.Collection, java.lang.Iterable, java.util.List
        public Iterator<j> iterator() {
            return SequencesKt___SequencesKt.K(cn.f0.g0(cn.w.n(this)), new sn.l() { // from class: bo.n
                @Override // sn.l
                public final Object invoke(Object obj) {
                    return m.b.j(this.f5705b, ((Integer) obj).intValue());
                }
            }).iterator();
        }
    }

    public m(@NotNull Matcher matcher, @NotNull CharSequence charSequence) {
        tn.p.k(matcher, "matcher");
        tn.p.k(charSequence, "input");
        this.f5699a = matcher;
        this.f5700b = charSequence;
        this.f5701c = new b();
    }

    @Override // bo.l
    @NotNull
    public l.b a() {
        return l.a.a(this);
    }

    @Override // bo.l
    @NotNull
    public List<String> b() {
        if (this.f5702d == null) {
            this.f5702d = new a();
        }
        List<String> list = this.f5702d;
        tn.p.h(list);
        return list;
    }

    @Override // bo.l
    @NotNull
    public zn.i c() {
        return p.h(e());
    }

    public final MatchResult e() {
        return this.f5699a;
    }

    @Override // bo.l
    @NotNull
    public String getValue() {
        String strGroup = e().group();
        tn.p.j(strGroup, "group(...)");
        return strGroup;
    }

    @Override // bo.l
    @Nullable
    public l next() {
        int iEnd = e().end() + (e().end() == e().start() ? 1 : 0);
        if (iEnd > this.f5700b.length()) {
            return null;
        }
        Matcher matcher = this.f5699a.pattern().matcher(this.f5700b);
        tn.p.j(matcher, "matcher(...)");
        return p.f(matcher, iEnd, this.f5700b);
    }
}
