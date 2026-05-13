package sg.bigo.ads.controller.b;

import android.os.Parcel;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import org.json.JSONObject;
import sg.bigo.ads.common.n;
import sg.bigo.ads.common.utils.q;

/* JADX INFO: loaded from: classes2.dex */
public final class c implements sg.bigo.ads.api.a.d {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int[][] f83009n = {new int[]{1, 2}, new int[]{3, 4}};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f83017h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f83010a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f83011b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f83012c = "";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f83013d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f83014e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f83015f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f83016g = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final a f83018i = new a(3);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final a f83019j = new a(4);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public final a f83020k = new a(12);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public final a f83021l = new a(1);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NonNull
    public final a f83022m = new a(20);

    public class a implements sg.bigo.ads.common.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f83023a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f83024b = 20;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f83025c = 5;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f83027e;

        public a(int i10) {
            this.f83027e = i10;
        }

        @Override // sg.bigo.ads.common.f
        public final void a(@NonNull Parcel parcel) {
            parcel.writeInt(this.f83023a);
            parcel.writeInt(this.f83024b);
            parcel.writeInt(this.f83027e);
            parcel.writeInt(this.f83025c);
        }

        public final void a(JSONObject jSONObject) {
            String str;
            int i10 = this.f83027e;
            if (i10 == 1) {
                this.f83023a = jSONObject.optInt("nat_load_fail_fill", 0);
                this.f83025c = jSONObject.optInt("nat_time_for_check_process", 5);
                str = "nat_min_video_loading_pro";
            } else if (i10 == 12) {
                this.f83023a = jSONObject.optInt("spl_load_fail_fill", 0);
                this.f83025c = jSONObject.optInt("spl_time_for_check_process", 5);
                str = "spl_min_video_loading_pro";
            } else if (i10 == 20) {
                this.f83023a = jSONObject.optInt("pop_load_fail_fill", 0);
                this.f83025c = jSONObject.optInt("pop_time_for_check_process", 5);
                this.f83024b = jSONObject.optInt("pop_min_video_loading_pro", 20);
                return;
            } else if (i10 == 3) {
                this.f83023a = jSONObject.optInt("int_load_fail_fill", 0);
                this.f83025c = jSONObject.optInt("int_time_for_check_process", 5);
                str = "int_min_video_loading_pro";
            } else {
                if (i10 != 4) {
                    return;
                }
                this.f83023a = jSONObject.optInt("rew_load_fail_fill", 0);
                this.f83025c = jSONObject.optInt("rew_time_for_check_process", 5);
                str = "rew_min_video_loading_pro";
            }
            this.f83024b = jSONObject.optInt(str, 20);
        }

        @Override // sg.bigo.ads.common.f
        public final void b(@NonNull Parcel parcel) {
            this.f83023a = parcel.readInt();
            this.f83024b = parcel.readInt();
            this.f83027e = parcel.readInt();
            this.f83025c = parcel.readInt();
        }
    }

    @Override // sg.bigo.ads.api.a.d
    public final int a() {
        return this.f83010a;
    }

    @Override // sg.bigo.ads.api.a.d
    public final int a(int i10) {
        if (i10 == 1) {
            return this.f83016g;
        }
        if (i10 == 12) {
            return this.f83015f;
        }
        if (i10 == 20) {
            return this.f83017h;
        }
        if (i10 == 3) {
            return this.f83013d;
        }
        if (i10 != 4) {
            return 0;
        }
        return this.f83014e;
    }

    @Override // sg.bigo.ads.common.f
    public final void a(@NonNull Parcel parcel) {
        parcel.writeInt(this.f83010a);
        parcel.writeString(this.f83011b);
        parcel.writeString(this.f83012c);
        parcel.writeInt(this.f83013d);
        parcel.writeInt(this.f83014e);
        parcel.writeInt(this.f83015f);
        parcel.writeInt(this.f83016g);
        n.a(parcel, this.f83018i);
        n.a(parcel, this.f83019j);
        n.a(parcel, this.f83020k);
        n.a(parcel, this.f83021l);
        parcel.writeInt(this.f83017h);
        n.a(parcel, this.f83022m);
    }

    @Override // sg.bigo.ads.api.a.d
    public final boolean a(String str, int i10) {
        int i11 = !q.a((CharSequence) this.f83011b) ? 1 : 0;
        int i12 = !q.a((CharSequence) this.f83012c) ? 1 : 0;
        if (a(i10) > 0) {
            int i13 = f83009n[i11][i12];
            if (i13 != 1) {
                if (i13 != 2) {
                    return i13 == 3 && q.a(this.f83011b.split(StringUtils.COMMA), str);
                }
                if (!q.a(this.f83012c.split(StringUtils.COMMA), str)) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // sg.bigo.ads.api.a.d
    public final int b(int i10) {
        a aVar;
        if (i10 == 1) {
            aVar = this.f83021l;
        } else if (i10 == 12) {
            aVar = this.f83020k;
        } else if (i10 == 20) {
            aVar = this.f83022m;
        } else if (i10 == 3) {
            aVar = this.f83018i;
        } else {
            if (i10 != 4) {
                return 5;
            }
            aVar = this.f83019j;
        }
        return aVar.f83025c;
    }

    @Override // sg.bigo.ads.common.f
    public final void b(@NonNull Parcel parcel) {
        this.f83010a = parcel.readInt();
        this.f83011b = parcel.readString();
        this.f83012c = parcel.readString();
        this.f83013d = parcel.readInt();
        this.f83014e = parcel.readInt();
        this.f83015f = parcel.readInt();
        this.f83016g = parcel.readInt();
        n.b(parcel, this.f83018i);
        n.b(parcel, this.f83019j);
        n.b(parcel, this.f83020k);
        n.b(parcel, this.f83021l);
        this.f83017h = parcel.readInt();
        n.b(parcel, this.f83022m);
    }

    @Override // sg.bigo.ads.api.a.d
    public final boolean c(int i10) {
        return i10 != 1 ? i10 != 12 ? i10 != 20 ? i10 != 3 ? i10 == 4 && this.f83019j.f83023a == 1 : this.f83018i.f83023a == 1 : this.f83022m.f83023a == 1 : this.f83020k.f83023a == 1 : this.f83021l.f83023a == 1;
    }

    @Override // sg.bigo.ads.api.a.d
    public final int d(int i10) {
        a aVar;
        if (i10 == 1) {
            aVar = this.f83021l;
        } else if (i10 == 12) {
            aVar = this.f83020k;
        } else if (i10 == 20) {
            aVar = this.f83022m;
        } else if (i10 == 3) {
            aVar = this.f83018i;
        } else {
            if (i10 != 4) {
                return 20;
            }
            aVar = this.f83019j;
        }
        return aVar.f83024b;
    }
}
