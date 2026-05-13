package yads;

import androidx.core.internal.view.SupportMenu;
import androidx.core.view.InputDeviceCompat;
import com.explorestack.protobuf.openrtb.LossReason;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ht extends pt {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f90534h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f90535i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f90536j;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public List f90540n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public List f90541o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f90542p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f90543q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f90544r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f90545s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public byte f90546t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public byte f90547u;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f90549w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f90550x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int[] f90531y = {11, 1, 3, 12, 14, 5, 7, 9};

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int[] f90532z = {0, 4, 8, 12, 16, 20, 24, 28};
    public static final int[] A = {-1, -16711936, -16776961, -16711681, SupportMenu.CATEGORY_MASK, InputDeviceCompat.SOURCE_ANY, -65281};
    public static final int[] B = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};
    public static final int[] C = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, Sdk.SDKError.Reason.PRIVACY_ICON_FALLBACK_ERROR_VALUE, 234, 238, 244, 251};
    public static final int[] D = {193, 201, LossReason.LOSS_REASON_CREATIVE_FILTERED_ANIMATION_TOO_LONG_VALUE, Sdk.SDKError.Reason.MRAID_JS_DOES_NOT_EXIST_VALUE, Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE, 249, Sdk.SDKError.Reason.MRAID_JS_COPY_FAILED_VALUE, 171, 187};
    public static final int[] E = {195, 227, 205, 204, 236, 210, 242, Sdk.SDKError.Reason.INVALID_ADUNIT_BID_PAYLOAD_VALUE, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, Sdk.SDKError.Reason.INVALID_GZIP_BID_PAYLOAD_VALUE, 246, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE, 165, 164, 9474, 197, 229, Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE, 248, 9484, 9488, 9492, 9496};
    public static final boolean[] F = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final jb2 f90533g = new jb2();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f90538l = new ArrayList();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public gt f90539m = new gt(0, 4);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f90548v = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f90537k = 16000000;

    public ht(String str, int i10) {
        this.f90534h = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
        if (i10 == 1) {
            this.f90536j = 0;
            this.f90535i = 0;
        } else if (i10 == 2) {
            this.f90536j = 1;
            this.f90535i = 0;
        } else if (i10 == 3) {
            this.f90536j = 0;
            this.f90535i = 1;
        } else if (i10 != 4) {
            ih1.d("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
            this.f90536j = 0;
            this.f90535i = 0;
        } else {
            this.f90536j = 1;
            this.f90535i = 1;
        }
        a(0);
        h();
        this.f90549w = true;
        this.f90550x = -9223372036854775807L;
    }

    public final void a(int i10) {
        int i11 = this.f90542p;
        if (i11 == i10) {
            return;
        }
        this.f90542p = i10;
        if (i10 == 3) {
            for (int i12 = 0; i12 < this.f90538l.size(); i12++) {
                ((gt) this.f90538l.get(i12)).f90109g = i10;
            }
            return;
        }
        h();
        if (i11 == 3 || i10 == 1 || i10 == 0) {
            this.f90540n = Collections.emptyList();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:200:0x0090 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0089 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b1 A[FALL_THROUGH] */
    @Override // yads.pt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(yads.nt r14) {
        /*
            Method dump skipped, instruction units count: 786
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.ht.a(yads.nt):void");
    }

    @Override // yads.pt
    public final qt c() {
        List list = this.f90540n;
        this.f90541o = list;
        list.getClass();
        return new qt(list);
    }

    @Override // yads.pt, yads.oa0
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final x43 a() {
        x43 x43VarE;
        x43 x43VarA = super.a();
        if (x43VarA != null) {
            return x43VarA;
        }
        long j10 = this.f90537k;
        if (j10 == -9223372036854775807L) {
            return null;
        }
        long j11 = this.f90550x;
        if (j11 == -9223372036854775807L || this.f93767e - j11 < j10 || (x43VarE = e()) == null) {
            return null;
        }
        this.f90540n = Collections.emptyList();
        this.f90550x = -9223372036854775807L;
        qt qtVarC = c();
        long j12 = this.f93767e;
        x43VarE.f95584c = j12;
        x43VarE.f96631d = qtVarC;
        x43VarE.f96632e = j12;
        return x43VarE;
    }

    @Override // yads.pt
    public final boolean f() {
        return this.f90540n != this.f90541o;
    }

    @Override // yads.pt, yads.oa0
    public final void flush() {
        super.flush();
        this.f90540n = null;
        this.f90541o = null;
        a(0);
        this.f90543q = 4;
        this.f90539m.f90110h = 4;
        h();
        this.f90544r = false;
        this.f90545s = false;
        this.f90546t = (byte) 0;
        this.f90547u = (byte) 0;
        this.f90548v = 0;
        this.f90549w = true;
        this.f90550x = -9223372036854775807L;
    }

    public final ArrayList g() {
        int size = this.f90538l.size();
        ArrayList arrayList = new ArrayList(size);
        int iMin = 2;
        for (int i10 = 0; i10 < size; i10++) {
            o20 o20VarA = ((gt) this.f90538l.get(i10)).a(Integer.MIN_VALUE);
            arrayList.add(o20VarA);
            if (o20VarA != null) {
                iMin = Math.min(iMin, o20VarA.f93093j);
            }
        }
        ArrayList arrayList2 = new ArrayList(size);
        for (int i11 = 0; i11 < size; i11++) {
            o20 o20VarA2 = (o20) arrayList.get(i11);
            if (o20VarA2 != null) {
                if (o20VarA2.f93093j != iMin) {
                    o20VarA2 = ((gt) this.f90538l.get(i11)).a(iMin);
                    o20VarA2.getClass();
                }
                arrayList2.add(o20VarA2);
            }
        }
        return arrayList2;
    }

    public final void h() {
        this.f90539m.b(this.f90542p);
        this.f90538l.clear();
        this.f90538l.add(this.f90539m);
    }

    @Override // yads.pt, yads.oa0
    public final void release() {
    }
}
