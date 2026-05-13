package com.bytedance.sdk.component.vt.ouw;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public abstract class cf implements Cloneable {
    public TimeUnit fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public long f12800le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public TimeUnit f12801lh;
    public List<pno> ouw;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public TimeUnit f12802ra;
    public long vt;
    public long yu;

    public static final class ouw {
        public TimeUnit fkw;

        /* JADX INFO: renamed from: le, reason: collision with root package name */
        public long f12803le;

        /* JADX INFO: renamed from: lh, reason: collision with root package name */
        public TimeUnit f12804lh;
        public final List<pno> ouw;

        /* JADX INFO: renamed from: ra, reason: collision with root package name */
        public TimeUnit f12805ra;
        public long vt;
        public long yu;

        public ouw() {
            this.ouw = new ArrayList();
            this.vt = 10000L;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.f12804lh = timeUnit;
            this.yu = 10000L;
            this.fkw = timeUnit;
            this.f12803le = 10000L;
            this.f12805ra = timeUnit;
        }

        public ouw(byte b10) {
            this.ouw = new ArrayList();
            this.vt = 10000L;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.f12804lh = timeUnit;
            this.yu = 10000L;
            this.fkw = timeUnit;
            this.f12803le = 10000L;
            this.f12805ra = timeUnit;
        }

        public ouw(cf cfVar) {
            this.ouw = new ArrayList();
            this.vt = 10000L;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.f12804lh = timeUnit;
            this.yu = 10000L;
            this.fkw = timeUnit;
            this.f12803le = 10000L;
            this.f12805ra = timeUnit;
            this.vt = cfVar.vt;
            this.f12804lh = cfVar.f12801lh;
            this.yu = cfVar.yu;
            this.fkw = cfVar.fkw;
            this.f12803le = cfVar.f12800le;
            this.f12805ra = cfVar.f12802ra;
        }

        public final ouw lh(long j10, TimeUnit timeUnit) {
            this.f12803le = j10;
            this.f12805ra = timeUnit;
            return this;
        }

        public final ouw ouw(long j10, TimeUnit timeUnit) {
            this.vt = j10;
            this.f12804lh = timeUnit;
            return this;
        }

        public final ouw vt(long j10, TimeUnit timeUnit) {
            this.yu = j10;
            this.fkw = timeUnit;
            return this;
        }
    }

    public cf(ouw ouwVar) {
        this.vt = ouwVar.vt;
        this.yu = ouwVar.yu;
        this.f12800le = ouwVar.f12803le;
        List<pno> list = ouwVar.ouw;
        this.f12801lh = ouwVar.f12804lh;
        this.fkw = ouwVar.fkw;
        this.f12802ra = ouwVar.f12805ra;
        this.ouw = list;
    }

    public abstract vt ouw(ryl rylVar);

    public abstract yu ouw();

    public final ouw vt() {
        return new ouw(this);
    }
}
