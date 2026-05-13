package y7;

import com.google.common.base.AbstractIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: Splitter.java */
/* JADX INFO: loaded from: classes11.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y7.b f87351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f87352b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f87353c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f87354d;

    /* JADX INFO: compiled from: Splitter.java */
    public class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ y7.b f87355a;

        /* JADX INFO: renamed from: y7.n$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: Splitter.java */
        public class C1108a extends b {
            public C1108a(n nVar, CharSequence charSequence) {
                super(nVar, charSequence);
            }

            @Override // y7.n.b
            public int e(int i10) {
                return i10 + 1;
            }

            @Override // y7.n.b
            public int f(int i10) {
                return a.this.f87355a.c(this.f87357d, i10);
            }
        }

        public a(y7.b bVar) {
            this.f87355a = bVar;
        }

        @Override // y7.n.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public b a(n nVar, CharSequence charSequence) {
            return new C1108a(nVar, charSequence);
        }
    }

    /* JADX INFO: compiled from: Splitter.java */
    public static abstract class b extends AbstractIterator<String> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final CharSequence f87357d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final y7.b f87358e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f87359f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f87360g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f87361h;

        public b(n nVar, CharSequence charSequence) {
            this.f87358e = nVar.f87351a;
            this.f87359f = nVar.f87352b;
            this.f87361h = nVar.f87354d;
            this.f87357d = charSequence;
        }

        @Override // com.google.common.base.AbstractIterator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public String a() {
            int iF;
            int i10 = this.f87360g;
            while (true) {
                int i11 = this.f87360g;
                if (i11 == -1) {
                    return b();
                }
                iF = f(i11);
                if (iF == -1) {
                    iF = this.f87357d.length();
                    this.f87360g = -1;
                } else {
                    this.f87360g = e(iF);
                }
                int i12 = this.f87360g;
                if (i12 == i10) {
                    int i13 = i12 + 1;
                    this.f87360g = i13;
                    if (i13 > this.f87357d.length()) {
                        this.f87360g = -1;
                    }
                } else {
                    while (i10 < iF && this.f87358e.e(this.f87357d.charAt(i10))) {
                        i10++;
                    }
                    while (iF > i10 && this.f87358e.e(this.f87357d.charAt(iF - 1))) {
                        iF--;
                    }
                    if (!this.f87359f || i10 != iF) {
                        break;
                    }
                    i10 = this.f87360g;
                }
            }
            int i14 = this.f87361h;
            if (i14 == 1) {
                iF = this.f87357d.length();
                this.f87360g = -1;
                while (iF > i10 && this.f87358e.e(this.f87357d.charAt(iF - 1))) {
                    iF--;
                }
            } else {
                this.f87361h = i14 - 1;
            }
            return this.f87357d.subSequence(i10, iF).toString();
        }

        public abstract int e(int i10);

        public abstract int f(int i10);
    }

    /* JADX INFO: compiled from: Splitter.java */
    public interface c {
        Iterator<String> a(n nVar, CharSequence charSequence);
    }

    public n(c cVar) {
        this(cVar, false, y7.b.f(), Integer.MAX_VALUE);
    }

    public n(c cVar, boolean z10, y7.b bVar, int i10) {
        this.f87353c = cVar;
        this.f87352b = z10;
        this.f87351a = bVar;
        this.f87354d = i10;
    }

    public static n d(char c10) {
        return e(y7.b.d(c10));
    }

    public static n e(y7.b bVar) {
        l.m(bVar);
        return new n(new a(bVar));
    }

    public List<String> f(CharSequence charSequence) {
        l.m(charSequence);
        Iterator<String> itG = g(charSequence);
        ArrayList arrayList = new ArrayList();
        while (itG.hasNext()) {
            arrayList.add(itG.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public final Iterator<String> g(CharSequence charSequence) {
        return this.f87353c.a(this, charSequence);
    }
}
