package com.mbridge.msdk.tracker;

import android.util.Log;

/* JADX INFO: compiled from: TrackConfig.java */
/* JADX INFO: loaded from: classes9.dex */
public class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f41146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f41147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f41148c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f41149d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f41150e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f41151f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p f41152g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final d f41153h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final w f41154i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final f f41155j;

    /* JADX INFO: compiled from: TrackConfig.java */
    public static final class b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private p f41159d;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private d f41163h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private w f41164i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private f f41165j;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f41156a = 50;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f41157b = 15000;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f41158c = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f41160e = 2;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f41161f = 50;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f41162g = 604800000;

        public b a(int i10) {
            if (i10 < 0) {
                this.f41162g = 604800000;
            } else {
                this.f41162g = i10;
            }
            return this;
        }

        public b a(int i10, p pVar) {
            this.f41158c = i10;
            this.f41159d = pVar;
            return this;
        }

        public b a(d dVar) {
            this.f41163h = dVar;
            return this;
        }

        public b a(f fVar) {
            this.f41165j = fVar;
            return this;
        }

        public b a(w wVar) {
            this.f41164i = wVar;
            return this;
        }

        public x a() {
            if (y.b(this.f41163h) && com.mbridge.msdk.tracker.a.f40902a) {
                Log.e("TrackManager", "decorate can not be null");
            }
            if (y.b(this.f41164i) && com.mbridge.msdk.tracker.a.f40902a) {
                Log.e("TrackManager", "responseHandler can not be null");
            }
            if ((y.b(this.f41159d) || y.b(this.f41159d.b())) && com.mbridge.msdk.tracker.a.f40902a) {
                Log.e("TrackManager", "networkStackConfig or stack can not be null");
            }
            return new x(this);
        }

        public b b(int i10) {
            if (i10 <= 0) {
                this.f41156a = 50;
            } else {
                this.f41156a = i10;
            }
            return this;
        }

        public b c(int i10) {
            if (i10 < 0) {
                this.f41157b = 15000;
            } else {
                this.f41157b = i10;
            }
            return this;
        }

        public b d(int i10) {
            if (i10 < 0) {
                this.f41161f = 50;
            } else {
                this.f41161f = i10;
            }
            return this;
        }

        public b e(int i10) {
            if (i10 <= 0) {
                this.f41160e = 2;
            } else {
                this.f41160e = i10;
            }
            return this;
        }
    }

    private x(b bVar) {
        this.f41146a = bVar.f41156a;
        this.f41147b = bVar.f41157b;
        this.f41148c = bVar.f41158c;
        this.f41149d = bVar.f41160e;
        this.f41150e = bVar.f41161f;
        this.f41151f = bVar.f41162g;
        this.f41152g = bVar.f41159d;
        this.f41153h = bVar.f41163h;
        this.f41154i = bVar.f41164i;
        this.f41155j = bVar.f41165j;
    }
}
