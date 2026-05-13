package y5;

import a6.b0;
import a6.g;
import a6.k0;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.RequestConfiguration;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import y5.c;

/* JADX INFO: compiled from: DefaultBandwidthMeter.java */
/* JADX INFO: loaded from: classes11.dex */
public final class k implements y5.c, q {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Map<String, int[]> f87290p = i();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final long[] f87291q = {5800000, 3500000, 1900000, 1000000, 520000};

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final long[] f87292r = {204000, 154000, 139000, 122000, 102000};

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final long[] f87293s = {2200000, 1150000, 810000, 640000, 450000};

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final long[] f87294t = {4900000, 2300000, 1500000, 970000, 540000};

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Nullable
    public static k f87295u;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final Context f87296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SparseArray<Long> f87297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a6.g<c.a> f87298c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b0 f87299d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a6.c f87300e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f87301f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f87302g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f87303h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f87304i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f87305j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f87306k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f87307l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f87308m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f87309n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f87310o;

    /* JADX INFO: compiled from: DefaultBandwidthMeter.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public final Context f87311a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public SparseArray<Long> f87312b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f87313c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public a6.c f87314d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f87315e;

        public b(Context context) {
            this.f87311a = context == null ? null : context.getApplicationContext();
            this.f87312b = c(k0.F(context));
            this.f87313c = 2000;
            this.f87314d = a6.c.f3524a;
            this.f87315e = true;
        }

        public static int[] b(String str) {
            int[] iArr = k.f87290p.get(str);
            return iArr == null ? new int[]{2, 2, 2, 2} : iArr;
        }

        public static SparseArray<Long> c(String str) {
            int[] iArrB = b(str);
            SparseArray<Long> sparseArray = new SparseArray<>(6);
            sparseArray.append(0, 1000000L);
            long[] jArr = k.f87291q;
            sparseArray.append(2, Long.valueOf(jArr[iArrB[0]]));
            sparseArray.append(3, Long.valueOf(k.f87292r[iArrB[1]]));
            sparseArray.append(4, Long.valueOf(k.f87293s[iArrB[2]]));
            long[] jArr2 = k.f87294t;
            sparseArray.append(5, Long.valueOf(jArr2[iArrB[3]]));
            sparseArray.append(7, Long.valueOf(jArr[iArrB[0]]));
            sparseArray.append(9, Long.valueOf(jArr2[iArrB[3]]));
            return sparseArray;
        }

        public k a() {
            return new k(this.f87311a, this.f87312b, this.f87313c, this.f87314d, this.f87315e);
        }
    }

    /* JADX INFO: compiled from: DefaultBandwidthMeter.java */
    public static class c extends BroadcastReceiver {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static c f87316c;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Handler f87317a = new Handler(Looper.getMainLooper());

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList<WeakReference<k>> f87318b = new ArrayList<>();

        public static synchronized c b(Context context) {
            if (f87316c == null) {
                f87316c = new c();
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                context.registerReceiver(f87316c, intentFilter);
            }
            return f87316c;
        }

        public synchronized void d(final k kVar) {
            e();
            this.f87318b.add(new WeakReference<>(kVar));
            this.f87317a.post(new Runnable() { // from class: y5.l
                @Override // java.lang.Runnable
                public final void run() {
                    this.f87319b.c(kVar);
                }
            });
        }

        public final void e() {
            for (int size = this.f87318b.size() - 1; size >= 0; size--) {
                if (this.f87318b.get(size).get() == null) {
                    this.f87318b.remove(size);
                }
            }
        }

        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final void c(k kVar) {
            kVar.n();
        }

        @Override // android.content.BroadcastReceiver
        public synchronized void onReceive(Context context, Intent intent) {
            if (isInitialStickyBroadcast()) {
                return;
            }
            e();
            for (int i10 = 0; i10 < this.f87318b.size(); i10++) {
                k kVar = this.f87318b.get(i10).get();
                if (kVar != null) {
                    c(kVar);
                }
            }
        }
    }

    @Deprecated
    public k() {
        this(null, new SparseArray(), 2000, a6.c.f3524a, false);
    }

    public k(@Nullable Context context, SparseArray<Long> sparseArray, int i10, a6.c cVar, boolean z10) {
        this.f87296a = context == null ? null : context.getApplicationContext();
        this.f87297b = sparseArray;
        this.f87298c = new a6.g<>();
        this.f87299d = new b0(i10);
        this.f87300e = cVar;
        int iQ = context == null ? 0 : k0.Q(context);
        this.f87304i = iQ;
        this.f87307l = j(iQ);
        if (context == null || !z10) {
            return;
        }
        c.b(context).d(this);
    }

    public static Map<String, int[]> i() {
        HashMap map = new HashMap();
        map.put("AD", new int[]{0, 2, 0, 0});
        map.put("AE", new int[]{2, 4, 4, 4});
        map.put("AF", new int[]{4, 4, 3, 3});
        map.put("AG", new int[]{4, 2, 2, 3});
        map.put("AI", new int[]{0, 3, 2, 4});
        map.put("AL", new int[]{1, 2, 0, 1});
        map.put("AM", new int[]{2, 2, 1, 2});
        map.put("AO", new int[]{3, 4, 3, 1});
        map.put("AQ", new int[]{4, 2, 2, 2});
        map.put("AR", new int[]{2, 3, 1, 2});
        map.put("AS", new int[]{2, 2, 4, 2});
        map.put("AT", new int[]{0, 3, 0, 0});
        map.put("AU", new int[]{0, 2, 0, 1});
        map.put("AW", new int[]{1, 1, 2, 4});
        map.put("AX", new int[]{0, 1, 0, 0});
        map.put("AZ", new int[]{3, 3, 3, 3});
        map.put("BA", new int[]{1, 1, 0, 1});
        map.put("BB", new int[]{0, 3, 0, 0});
        map.put("BD", new int[]{2, 0, 4, 3});
        map.put("BE", new int[]{0, 1, 2, 3});
        map.put("BF", new int[]{4, 4, 4, 1});
        map.put("BG", new int[]{0, 1, 0, 0});
        map.put("BH", new int[]{1, 0, 3, 4});
        map.put("BI", new int[]{4, 4, 4, 4});
        map.put("BJ", new int[]{4, 4, 3, 4});
        map.put("BL", new int[]{1, 0, 4, 3});
        map.put("BM", new int[]{0, 1, 0, 0});
        map.put("BN", new int[]{4, 0, 2, 4});
        map.put("BO", new int[]{1, 3, 3, 3});
        map.put("BQ", new int[]{1, 0, 1, 0});
        map.put("BR", new int[]{2, 4, 3, 1});
        map.put("BS", new int[]{3, 1, 1, 3});
        map.put("BT", new int[]{3, 0, 3, 1});
        map.put("BW", new int[]{3, 4, 3, 3});
        map.put("BY", new int[]{0, 1, 1, 1});
        map.put("BZ", new int[]{1, 3, 2, 1});
        map.put("CA", new int[]{0, 3, 2, 2});
        map.put("CD", new int[]{3, 4, 2, 2});
        map.put("CF", new int[]{4, 3, 2, 2});
        map.put("CG", new int[]{3, 4, 1, 1});
        map.put("CH", new int[]{0, 0, 0, 0});
        map.put("CI", new int[]{3, 4, 3, 3});
        map.put("CK", new int[]{2, 0, 1, 0});
        map.put("CL", new int[]{1, 2, 2, 3});
        map.put("CM", new int[]{3, 4, 3, 2});
        map.put("CN", new int[]{1, 0, 1, 1});
        map.put("CO", new int[]{2, 3, 3, 2});
        map.put("CR", new int[]{2, 2, 4, 4});
        map.put("CU", new int[]{4, 4, 2, 1});
        map.put("CV", new int[]{2, 3, 3, 2});
        map.put("CW", new int[]{1, 1, 0, 0});
        map.put("CY", new int[]{1, 1, 0, 0});
        map.put("CZ", new int[]{0, 1, 0, 0});
        map.put("DE", new int[]{0, 1, 2, 3});
        map.put("DJ", new int[]{4, 2, 4, 4});
        map.put("DK", new int[]{0, 0, 1, 0});
        map.put("DM", new int[]{1, 1, 0, 2});
        map.put("DO", new int[]{3, 3, 4, 4});
        map.put("DZ", new int[]{3, 3, 4, 4});
        map.put("EC", new int[]{2, 3, 4, 2});
        map.put("EE", new int[]{0, 0, 0, 0});
        map.put("EG", new int[]{3, 4, 2, 1});
        map.put("EH", new int[]{2, 0, 3, 1});
        map.put("ER", new int[]{4, 2, 4, 4});
        map.put("ES", new int[]{0, 1, 1, 1});
        map.put("ET", new int[]{4, 4, 4, 1});
        map.put("FI", new int[]{0, 0, 1, 0});
        map.put("FJ", new int[]{3, 0, 4, 4});
        map.put("FK", new int[]{2, 2, 2, 1});
        map.put("FM", new int[]{3, 2, 4, 1});
        map.put("FO", new int[]{1, 1, 0, 0});
        map.put("FR", new int[]{1, 1, 1, 1});
        map.put("GA", new int[]{3, 2, 2, 2});
        map.put("GB", new int[]{0, 1, 1, 1});
        map.put("GD", new int[]{1, 1, 3, 1});
        map.put("GE", new int[]{1, 0, 1, 4});
        map.put("GF", new int[]{2, 0, 1, 3});
        map.put("GG", new int[]{1, 0, 0, 0});
        map.put("GH", new int[]{3, 3, 3, 3});
        map.put("GI", new int[]{4, 4, 0, 0});
        map.put("GL", new int[]{2, 1, 1, 2});
        map.put("GM", new int[]{4, 3, 2, 4});
        map.put("GN", new int[]{3, 4, 4, 2});
        map.put("GP", new int[]{2, 1, 3, 4});
        map.put("GQ", new int[]{4, 4, 4, 0});
        map.put("GR", new int[]{1, 1, 0, 1});
        map.put("GT", new int[]{3, 2, 2, 2});
        map.put("GU", new int[]{1, 0, 2, 2});
        map.put("GW", new int[]{3, 4, 4, 3});
        map.put("GY", new int[]{3, 2, 1, 1});
        map.put("HK", new int[]{0, 2, 3, 4});
        map.put("HN", new int[]{3, 1, 3, 3});
        map.put("HR", new int[]{1, 1, 0, 1});
        map.put("HT", new int[]{4, 4, 4, 4});
        map.put("HU", new int[]{0, 1, 0, 0});
        map.put("ID", new int[]{2, 2, 2, 3});
        map.put("IE", new int[]{1, 0, 1, 1});
        map.put("IL", new int[]{1, 0, 2, 3});
        map.put("IM", new int[]{0, 0, 0, 1});
        map.put("IN", new int[]{2, 2, 4, 3});
        map.put("IO", new int[]{4, 4, 2, 3});
        map.put("IQ", new int[]{3, 3, 4, 2});
        map.put("IR", new int[]{3, 0, 2, 1});
        map.put(IronSourceConstants.INTERSTITIAL_EVENT_TYPE, new int[]{0, 1, 0, 0});
        map.put("IT", new int[]{1, 1, 1, 2});
        map.put("JE", new int[]{1, 0, 0, 1});
        map.put("JM", new int[]{3, 3, 3, 4});
        map.put("JO", new int[]{1, 2, 1, 1});
        map.put("JP", new int[]{0, 2, 0, 0});
        map.put("KE", new int[]{3, 4, 3, 3});
        map.put("KG", new int[]{2, 0, 2, 2});
        map.put("KH", new int[]{1, 0, 4, 3});
        map.put("KI", new int[]{4, 4, 4, 0});
        map.put("KM", new int[]{4, 3, 2, 4});
        map.put("KN", new int[]{1, 0, 2, 4});
        map.put("KP", new int[]{4, 2, 0, 2});
        map.put("KR", new int[]{0, 1, 0, 1});
        map.put("KW", new int[]{2, 3, 1, 2});
        map.put("KY", new int[]{3, 1, 2, 3});
        map.put("KZ", new int[]{1, 2, 2, 2});
        map.put("LA", new int[]{2, 2, 1, 1});
        map.put("LB", new int[]{3, 2, 0, 0});
        map.put("LC", new int[]{1, 1, 0, 0});
        map.put("LI", new int[]{0, 0, 1, 1});
        map.put("LK", new int[]{2, 0, 2, 3});
        map.put("LR", new int[]{3, 4, 4, 2});
        map.put("LS", new int[]{3, 3, 2, 2});
        map.put("LT", new int[]{0, 0, 0, 0});
        map.put("LU", new int[]{0, 0, 0, 0});
        map.put("LV", new int[]{0, 0, 0, 0});
        map.put("LY", new int[]{3, 3, 4, 3});
        map.put(RequestConfiguration.MAX_AD_CONTENT_RATING_MA, new int[]{3, 2, 3, 2});
        map.put("MC", new int[]{0, 4, 0, 0});
        map.put("MD", new int[]{1, 1, 0, 0});
        map.put("ME", new int[]{1, 3, 1, 2});
        map.put("MF", new int[]{2, 3, 1, 1});
        map.put("MG", new int[]{3, 4, 2, 3});
        map.put("MH", new int[]{4, 0, 2, 4});
        map.put("MK", new int[]{1, 0, 0, 0});
        map.put("ML", new int[]{4, 4, 2, 0});
        map.put("MM", new int[]{3, 3, 2, 2});
        map.put("MN", new int[]{2, 3, 1, 1});
        map.put("MO", new int[]{0, 0, 4, 4});
        map.put("MP", new int[]{0, 2, 1, 2});
        map.put("MQ", new int[]{2, 1, 1, 3});
        map.put("MR", new int[]{4, 2, 4, 4});
        map.put("MS", new int[]{1, 4, 3, 4});
        map.put("MT", new int[]{0, 0, 0, 0});
        map.put("MU", new int[]{2, 2, 4, 4});
        map.put("MV", new int[]{4, 3, 2, 4});
        map.put("MW", new int[]{3, 1, 1, 1});
        map.put("MX", new int[]{2, 4, 3, 3});
        map.put("MY", new int[]{2, 1, 3, 3});
        map.put("MZ", new int[]{3, 3, 3, 3});
        map.put("NA", new int[]{4, 3, 3, 3});
        map.put("NC", new int[]{2, 0, 4, 4});
        map.put("NE", new int[]{4, 4, 4, 4});
        map.put("NF", new int[]{1, 2, 2, 0});
        map.put("NG", new int[]{3, 3, 2, 2});
        map.put("NI", new int[]{3, 2, 4, 3});
        map.put("NL", new int[]{0, 2, 3, 2});
        map.put("NO", new int[]{0, 2, 1, 0});
        map.put("NP", new int[]{2, 2, 2, 2});
        map.put("NR", new int[]{4, 0, 3, 2});
        map.put("NZ", new int[]{0, 0, 1, 2});
        map.put("OM", new int[]{2, 3, 0, 2});
        map.put("PA", new int[]{1, 3, 3, 3});
        map.put("PE", new int[]{2, 4, 4, 4});
        map.put("PF", new int[]{2, 1, 1, 1});
        map.put(RequestConfiguration.MAX_AD_CONTENT_RATING_PG, new int[]{4, 3, 3, 2});
        map.put("PH", new int[]{3, 0, 3, 4});
        map.put("PK", new int[]{3, 2, 3, 2});
        map.put("PL", new int[]{1, 0, 1, 2});
        map.put("PM", new int[]{0, 2, 2, 0});
        map.put("PR", new int[]{2, 2, 2, 2});
        map.put("PS", new int[]{3, 3, 1, 4});
        map.put("PT", new int[]{1, 1, 0, 0});
        map.put("PW", new int[]{1, 1, 3, 0});
        map.put("PY", new int[]{2, 0, 3, 3});
        map.put("QA", new int[]{2, 3, 1, 1});
        map.put("RE", new int[]{1, 0, 2, 2});
        map.put("RO", new int[]{0, 1, 1, 2});
        map.put("RS", new int[]{1, 2, 0, 0});
        map.put("RU", new int[]{0, 1, 0, 1});
        map.put("RW", new int[]{4, 4, 4, 4});
        map.put("SA", new int[]{2, 2, 2, 1});
        map.put("SB", new int[]{4, 4, 4, 1});
        map.put("SC", new int[]{4, 2, 0, 1});
        map.put("SD", new int[]{4, 4, 4, 4});
        map.put("SE", new int[]{0, 1, 0, 0});
        map.put("SG", new int[]{1, 0, 3, 3});
        map.put("SH", new int[]{4, 2, 2, 2});
        map.put("SI", new int[]{0, 1, 0, 0});
        map.put("SJ", new int[]{2, 2, 2, 4});
        map.put("SK", new int[]{0, 1, 0, 0});
        map.put("SL", new int[]{4, 3, 3, 1});
        map.put("SM", new int[]{0, 0, 1, 2});
        map.put("SN", new int[]{4, 4, 4, 3});
        map.put("SO", new int[]{3, 4, 3, 4});
        map.put("SR", new int[]{2, 2, 2, 1});
        map.put("SS", new int[]{4, 4, 4, 4});
        map.put("ST", new int[]{2, 3, 1, 2});
        map.put("SV", new int[]{2, 2, 4, 4});
        map.put("SX", new int[]{2, 4, 1, 0});
        map.put("SY", new int[]{4, 3, 1, 1});
        map.put("SZ", new int[]{4, 4, 3, 4});
        map.put("TC", new int[]{1, 2, 1, 0});
        map.put("TD", new int[]{4, 4, 4, 3});
        map.put("TG", new int[]{3, 2, 1, 0});
        map.put("TH", new int[]{1, 3, 3, 3});
        map.put("TJ", new int[]{4, 4, 4, 4});
        map.put("TL", new int[]{4, 2, 4, 4});
        map.put("TM", new int[]{4, 2, 2, 2});
        map.put("TN", new int[]{2, 1, 1, 1});
        map.put("TO", new int[]{4, 3, 4, 4});
        map.put("TR", new int[]{1, 2, 1, 1});
        map.put("TT", new int[]{1, 3, 2, 4});
        map.put("TV", new int[]{4, 2, 3, 4});
        map.put("TW", new int[]{0, 0, 0, 0});
        map.put("TZ", new int[]{3, 4, 3, 3});
        map.put("UA", new int[]{0, 3, 1, 1});
        map.put("UG", new int[]{3, 2, 2, 3});
        map.put("US", new int[]{0, 1, 2, 2});
        map.put("UY", new int[]{2, 1, 2, 2});
        map.put("UZ", new int[]{2, 2, 3, 2});
        map.put("VA", new int[]{0, 2, 2, 2});
        map.put("VC", new int[]{2, 3, 0, 2});
        map.put("VE", new int[]{4, 4, 4, 4});
        map.put("VG", new int[]{3, 1, 2, 4});
        map.put("VI", new int[]{1, 4, 4, 3});
        map.put("VN", new int[]{0, 1, 3, 4});
        map.put("VU", new int[]{4, 0, 3, 3});
        map.put("WS", new int[]{3, 2, 4, 3});
        map.put("XK", new int[]{1, 2, 1, 0});
        map.put("YE", new int[]{4, 4, 4, 3});
        map.put("YT", new int[]{2, 2, 2, 3});
        map.put("ZA", new int[]{2, 3, 2, 2});
        map.put("ZM", new int[]{3, 2, 3, 3});
        map.put("ZW", new int[]{3, 3, 2, 3});
        return Collections.unmodifiableMap(map);
    }

    public static synchronized k k(Context context) {
        if (f87295u == null) {
            f87295u = new b(context).a();
        }
        return f87295u;
    }

    @Override // y5.q
    public synchronized void a(com.google.android.exoplayer.upstream.a aVar, h hVar, boolean z10, int i10) {
        if (z10) {
            this.f87303h += (long) i10;
        }
    }

    @Override // y5.c
    public void b(c.a aVar) {
        this.f87298c.c(aVar);
    }

    @Override // y5.q
    public void c(com.google.android.exoplayer.upstream.a aVar, h hVar, boolean z10) {
    }

    @Override // y5.q
    public synchronized void d(com.google.android.exoplayer.upstream.a aVar, h hVar, boolean z10) {
        if (z10) {
            a6.a.f(this.f87301f > 0);
            long jElapsedRealtime = this.f87300e.elapsedRealtime();
            int i10 = (int) (jElapsedRealtime - this.f87302g);
            this.f87305j += (long) i10;
            long j10 = this.f87306k;
            long j11 = this.f87303h;
            this.f87306k = j10 + j11;
            if (i10 > 0) {
                this.f87299d.c((int) Math.sqrt(j11), (j11 * 8000.0f) / i10);
                if (this.f87305j >= 2000 || this.f87306k >= PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED) {
                    this.f87307l = (long) this.f87299d.f(0.5f);
                }
                m(i10, this.f87303h, this.f87307l);
                this.f87302g = jElapsedRealtime;
                this.f87303h = 0L;
            }
            this.f87301f--;
        }
    }

    @Override // y5.c
    public void e(Handler handler, c.a aVar) {
        this.f87298c.a(handler, aVar);
    }

    @Override // y5.q
    public synchronized void f(com.google.android.exoplayer.upstream.a aVar, h hVar, boolean z10) {
        if (z10) {
            if (this.f87301f == 0) {
                this.f87302g = this.f87300e.elapsedRealtime();
            }
            this.f87301f++;
        }
    }

    @Override // y5.c
    public synchronized long getBitrateEstimate() {
        return this.f87307l;
    }

    @Override // y5.c
    @Nullable
    public q getTransferListener() {
        return this;
    }

    public final long j(int i10) {
        Long l10 = this.f87297b.get(i10);
        if (l10 == null) {
            l10 = this.f87297b.get(0);
        }
        if (l10 == null) {
            l10 = 1000000L;
        }
        return l10.longValue();
    }

    public final void m(final int i10, final long j10, final long j11) {
        if (i10 == 0 && j10 == 0 && j11 == this.f87308m) {
            return;
        }
        this.f87308m = j11;
        this.f87298c.b(new g.a() { // from class: y5.j
            @Override // a6.g.a
            public final void a(Object obj) {
                ((c.a) obj).onBandwidthSample(i10, j10, j11);
            }
        });
    }

    public final synchronized void n() {
        int iQ;
        if (this.f87309n) {
            iQ = this.f87310o;
        } else {
            Context context = this.f87296a;
            iQ = context == null ? 0 : k0.Q(context);
        }
        if (this.f87304i == iQ) {
            return;
        }
        this.f87304i = iQ;
        if (iQ != 1 && iQ != 0 && iQ != 8) {
            this.f87307l = j(iQ);
            long jElapsedRealtime = this.f87300e.elapsedRealtime();
            m(this.f87301f > 0 ? (int) (jElapsedRealtime - this.f87302g) : 0, this.f87303h, this.f87307l);
            this.f87302g = jElapsedRealtime;
            this.f87303h = 0L;
            this.f87306k = 0L;
            this.f87305j = 0L;
            this.f87299d.i();
        }
    }
}
