package sq;

import org.eclipse.jetty.util.Utf8Appendable;

/* JADX INFO: compiled from: Utf8StringBuilder.java */
/* JADX INFO: loaded from: classes9.dex */
public class s extends Utf8Appendable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final StringBuilder f84562g;

    public s() {
        super(new StringBuilder());
        this.f84562g = (StringBuilder) this.f76817a;
    }

    public s(int i10) {
        super(new StringBuilder(i10));
        this.f84562g = (StringBuilder) this.f76817a;
    }

    @Override // org.eclipse.jetty.util.Utf8Appendable
    public void f() {
        super.f();
        this.f84562g.setLength(0);
    }

    public StringBuilder h() {
        d();
        return this.f84562g;
    }

    public int i() {
        return this.f84562g.length();
    }

    public String toString() {
        d();
        return this.f84562g.toString();
    }
}
