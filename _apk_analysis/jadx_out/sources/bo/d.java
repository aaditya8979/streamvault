package bo;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Strings.kt */
/* JADX INFO: loaded from: classes.dex */
public final class d implements ao.i<zn.i> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CharSequence f5649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5650b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5651c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final sn.p<CharSequence, Integer, Pair<Integer, Integer>> f5652d;

    /* JADX INFO: compiled from: Strings.kt */
    public static final class a implements Iterator<zn.i>, un.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f5653b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f5654c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f5655d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public zn.i f5656e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f5657f;

        public a() {
            int iN = zn.n.n(d.this.f5650b, 0, d.this.f5649a.length());
            this.f5654c = iN;
            this.f5655d = iN;
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void a() {
            /*
                r6 = this;
                int r0 = r6.f5655d
                r1 = 0
                if (r0 >= 0) goto Lc
                r6.f5653b = r1
                r0 = 0
                r6.f5656e = r0
                goto L9e
            Lc:
                bo.d r0 = bo.d.this
                int r0 = bo.d.e(r0)
                r2 = -1
                r3 = 1
                if (r0 <= 0) goto L23
                int r0 = r6.f5657f
                int r0 = r0 + r3
                r6.f5657f = r0
                bo.d r4 = bo.d.this
                int r4 = bo.d.e(r4)
                if (r0 >= r4) goto L31
            L23:
                int r0 = r6.f5655d
                bo.d r4 = bo.d.this
                java.lang.CharSequence r4 = bo.d.d(r4)
                int r4 = r4.length()
                if (r0 <= r4) goto L47
            L31:
                zn.i r0 = new zn.i
                int r1 = r6.f5654c
                bo.d r4 = bo.d.this
                java.lang.CharSequence r4 = bo.d.d(r4)
                int r4 = bo.d0.l0(r4)
                r0.<init>(r1, r4)
                r6.f5656e = r0
                r6.f5655d = r2
                goto L9c
            L47:
                bo.d r0 = bo.d.this
                sn.p r0 = bo.d.c(r0)
                bo.d r4 = bo.d.this
                java.lang.CharSequence r4 = bo.d.d(r4)
                int r5 = r6.f5655d
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                java.lang.Object r0 = r0.mo2invoke(r4, r5)
                kotlin.Pair r0 = (kotlin.Pair) r0
                if (r0 != 0) goto L77
                zn.i r0 = new zn.i
                int r1 = r6.f5654c
                bo.d r4 = bo.d.this
                java.lang.CharSequence r4 = bo.d.d(r4)
                int r4 = bo.d0.l0(r4)
                r0.<init>(r1, r4)
                r6.f5656e = r0
                r6.f5655d = r2
                goto L9c
            L77:
                java.lang.Object r2 = r0.component1()
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                java.lang.Object r0 = r0.component2()
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                int r4 = r6.f5654c
                zn.i r4 = zn.n.v(r4, r2)
                r6.f5656e = r4
                int r2 = r2 + r0
                r6.f5654c = r2
                if (r0 != 0) goto L99
                r1 = r3
            L99:
                int r2 = r2 + r1
                r6.f5655d = r2
            L9c:
                r6.f5653b = r3
            L9e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: bo.d.a.a():void");
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public zn.i next() {
            if (this.f5653b == -1) {
                a();
            }
            if (this.f5653b == 0) {
                throw new NoSuchElementException();
            }
            zn.i iVar = this.f5656e;
            tn.p.i(iVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
            this.f5656e = null;
            this.f5653b = -1;
            return iVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f5653b == -1) {
                a();
            }
            return this.f5653b == 1;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(@NotNull CharSequence charSequence, int i10, int i11, @NotNull sn.p<? super CharSequence, ? super Integer, Pair<Integer, Integer>> pVar) {
        tn.p.k(charSequence, "input");
        tn.p.k(pVar, "getNextMatch");
        this.f5649a = charSequence;
        this.f5650b = i10;
        this.f5651c = i11;
        this.f5652d = pVar;
    }

    @Override // ao.i
    @NotNull
    public Iterator<zn.i> iterator() {
        return new a();
    }
}
