package sq;

import org.eclipse.jetty.util.Utf8Appendable;

/* JADX INFO: compiled from: Utf8StringBuffer.java */
/* JADX INFO: loaded from: classes9.dex */
public class r extends Utf8Appendable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final StringBuffer f84561g;

    public r(int i10) {
        super(new StringBuffer(i10));
        this.f84561g = (StringBuffer) this.f76817a;
    }

    public StringBuffer h() {
        d();
        return this.f84561g;
    }

    public String toString() {
        d();
        return this.f84561g.toString();
    }
}
