package vr;

import org.fourthline.cling.model.message.b;
import org.fourthline.cling.model.message.c;
import org.fourthline.cling.transport.RouterException;

/* JADX INFO: compiled from: SendingSync.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class g<IN extends org.fourthline.cling.model.message.b, OUT extends org.fourthline.cling.model.message.c> extends f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final IN f86163d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public OUT f86164e;

    public g(br.b bVar, IN in2) {
        super(bVar);
        this.f86163d = in2;
    }

    @Override // vr.f
    public final void a() throws RouterException {
        this.f86164e = (OUT) c();
    }

    public abstract OUT c() throws RouterException;

    public IN d() {
        return this.f86163d;
    }

    public OUT f() {
        return this.f86164e;
    }

    @Override // vr.f
    public String toString() {
        return "(" + getClass().getSimpleName() + ")";
    }
}
