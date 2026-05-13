package vr;

import java.util.logging.Logger;
import org.fourthline.cling.model.message.b;
import org.fourthline.cling.model.message.c;
import org.fourthline.cling.transport.RouterException;

/* JADX INFO: compiled from: ReceivingSync.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class d<IN extends org.fourthline.cling.model.message.b, OUT extends org.fourthline.cling.model.message.c> extends c<IN> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Logger f86153g = Logger.getLogger(br.b.class.getName());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final rr.c f86154e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public OUT f86155f;

    public d(br.b bVar, IN in2) {
        super(bVar, in2);
        this.f86154e = new rr.c(in2);
    }

    @Override // vr.c
    public final void a() throws RouterException {
        OUT out = (OUT) f();
        this.f86155f = out;
        if (out == null || h().d().size() <= 0) {
            return;
        }
        f86153g.fine("Setting extra headers on response message: " + h().d().size());
        this.f86155f.j().putAll(h().d());
    }

    public abstract OUT f() throws RouterException;

    public OUT g() {
        return this.f86155f;
    }

    public rr.c h() {
        return this.f86154e;
    }

    public void i(Throwable th2) {
    }

    public void j(org.fourthline.cling.model.message.c cVar) {
    }

    @Override // vr.c
    public String toString() {
        return "(" + getClass().getSimpleName() + ")";
    }
}
