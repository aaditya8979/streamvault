package com.bytedance.sdk.component.ouw;

/* JADX INFO: loaded from: classes.dex */
public abstract class lh<P, R> extends com.bytedance.sdk.component.ouw.vt<P, R> {
    private fkw fkw;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private boolean f12746lh = true;
    private ouw yu;

    public interface ouw {
        void ouw(Object obj);

        void ouw(Throwable th2);
    }

    public interface vt {
        lh ouw();
    }

    private boolean yu() {
        if (this.f12746lh) {
            return true;
        }
        pno.ouw(new IllegalStateException("Jsb async call already finished: " + super.ouw() + ", hashcode: " + hashCode()));
        return false;
    }

    public final void lh() {
        this.f12746lh = false;
        this.fkw = null;
    }

    @Override // com.bytedance.sdk.component.ouw.vt
    public final /* bridge */ /* synthetic */ String ouw() {
        return super.ouw();
    }

    public abstract void ouw(P p10) throws Exception;

    public final void ouw(P p10, fkw fkwVar, ouw ouwVar) throws Exception {
        this.fkw = fkwVar;
        this.yu = ouwVar;
        ouw(p10);
    }

    public final void vt() {
        if (yu()) {
            this.yu.ouw((Throwable) null);
            lh();
        }
    }

    public final void vt(R r10) {
        if (yu()) {
            this.yu.ouw(r10);
            lh();
        }
    }
}
