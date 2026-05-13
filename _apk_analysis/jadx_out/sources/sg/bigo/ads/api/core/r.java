package sg.bigo.ads.api.core;

import android.os.Parcel;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class r implements sg.bigo.ads.api.a.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f81907a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f81908b = 5000;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f81909c = 21600000;

    @Override // sg.bigo.ads.common.f
    public final void a(@NonNull Parcel parcel) {
        parcel.writeString(this.f81907a + StringUtils.COMMA + this.f81908b + StringUtils.COMMA + this.f81909c);
    }

    @Override // sg.bigo.ads.api.a.n
    public final void a(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f81907a = jSONObject.optInt("duration_on", 0);
            this.f81908b = jSONObject.optLong("duration_valid_interval", 5000L);
            this.f81909c = jSONObject.optLong("suspend_limit", 21600000L);
        }
    }

    @Override // sg.bigo.ads.api.a.n
    public final boolean a() {
        return this.f81907a == 1;
    }

    @Override // sg.bigo.ads.api.a.n
    public final long b() {
        return this.f81908b;
    }

    @Override // sg.bigo.ads.common.f
    public final void b(@NonNull Parcel parcel) {
        if (parcel.dataAvail() > 0) {
            String string = parcel.readString();
            if (TextUtils.isEmpty(string)) {
                return;
            }
            String[] strArrSplit = string.split(StringUtils.COMMA);
            if (strArrSplit.length >= 3) {
                this.f81907a = sg.bigo.ads.common.utils.q.a(strArrSplit[0], 0);
                this.f81908b = sg.bigo.ads.common.utils.q.a(strArrSplit[1], 5000L);
                this.f81909c = sg.bigo.ads.common.utils.q.a(strArrSplit[2], 21600000L);
            }
        }
    }

    @Override // sg.bigo.ads.api.a.n
    public final long c() {
        return this.f81909c;
    }
}
