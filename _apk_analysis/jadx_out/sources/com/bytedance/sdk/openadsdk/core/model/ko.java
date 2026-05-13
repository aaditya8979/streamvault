package com.bytedance.sdk.openadsdk.core.model;

import android.util.SparseArray;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.core.lh.lh;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class ko implements com.bytedance.sdk.component.adexpress.lh {
    public JSONObject bly;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    public final boolean f13668cf;
    public final long fkw;

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    public boolean f13669jg;

    /* JADX INFO: renamed from: ko, reason: collision with root package name */
    public int f13670ko;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public final long f13671le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public final float f13672lh;
    public JSONObject mwh;
    public final float ouw;
    public int pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public final String f13673ra;
    public int ryl;
    public SparseArray<lh.ouw> tlj;
    public final float vt;
    public final float yu;

    public static class ouw {
        public int bly;

        /* JADX INFO: renamed from: cf, reason: collision with root package name */
        public int f13674cf;
        public float fkw;

        /* JADX INFO: renamed from: ko, reason: collision with root package name */
        public boolean f13676ko;

        /* JADX INFO: renamed from: le, reason: collision with root package name */
        public float f13677le;

        /* JADX INFO: renamed from: lh, reason: collision with root package name */
        public float f13678lh;
        public long ouw;
        public String pno;

        /* JADX INFO: renamed from: ra, reason: collision with root package name */
        public int f13679ra;
        public JSONObject ryl;
        public JSONObject tlj;
        public long vt;
        public float yu;
        public boolean mwh = false;

        /* JADX INFO: renamed from: jg, reason: collision with root package name */
        public SparseArray<lh.ouw> f13675jg = new SparseArray<>();

        public final ouw ouw(SparseArray<lh.ouw> sparseArray) {
            this.f13675jg = sparseArray;
            return this;
        }

        public final ko ouw() {
            return new ko(this, (byte) 0);
        }
    }

    private ko(@NonNull ouw ouwVar) {
        this.f13669jg = false;
        this.ouw = ouwVar.f13677le;
        this.vt = ouwVar.fkw;
        this.f13672lh = ouwVar.yu;
        this.yu = ouwVar.f13678lh;
        this.fkw = ouwVar.vt;
        this.f13671le = ouwVar.ouw;
        this.f13673ra = ouwVar.pno;
        this.tlj = ouwVar.f13675jg;
        this.f13668cf = ouwVar.f13676ko;
        this.pno = ouwVar.bly;
        this.bly = ouwVar.tlj;
        this.ryl = ouwVar.f13674cf;
        this.mwh = ouwVar.ryl;
        this.f13669jg = ouwVar.mwh;
        this.f13670ko = ouwVar.f13679ra;
    }

    public /* synthetic */ ko(ouw ouwVar, byte b10) {
        this(ouwVar);
    }
}
