package com.bytedance.sdk.component.ouw;

/* JADX INFO: loaded from: classes6.dex */
public final class jg {
    public final String fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public final String f12735le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public final String f12736lh;
    public final int ouw;
    public final String pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public final String f12737ra;
    public final String vt;
    public final String yu;

    public static final class ouw {
        public String fkw;

        /* JADX INFO: renamed from: le, reason: collision with root package name */
        public String f12738le;

        /* JADX INFO: renamed from: lh, reason: collision with root package name */
        public String f12739lh;
        public String ouw;

        /* JADX INFO: renamed from: ra, reason: collision with root package name */
        public String f12740ra;
        public String vt;
        public String yu;

        private ouw() {
        }

        public /* synthetic */ ouw(byte b10) {
            this();
        }
    }

    private jg(ouw ouwVar) {
        this.vt = ouwVar.ouw;
        this.f12736lh = ouwVar.vt;
        this.yu = ouwVar.f12739lh;
        this.fkw = ouwVar.yu;
        this.f12735le = ouwVar.fkw;
        this.f12737ra = ouwVar.f12738le;
        this.ouw = 1;
        this.pno = ouwVar.f12740ra;
    }

    public /* synthetic */ jg(ouw ouwVar, byte b10) {
        this(ouwVar);
    }

    public jg(String str) {
        this.vt = null;
        this.f12736lh = null;
        this.yu = null;
        this.fkw = null;
        this.f12735le = str;
        this.f12737ra = null;
        this.ouw = -1;
        this.pno = null;
    }

    public final String toString() {
        return "methodName: " + this.yu + ", params: " + this.fkw + ", callbackId: " + this.f12735le + ", type: " + this.f12736lh + ", version: " + this.vt + ", ";
    }
}
