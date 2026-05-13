package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.coreapi.internal.event.CounterReportApi;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionState;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class Q5 implements CounterReportApi, Parcelable {
    public static final Parcelable.Creator<Q5> CREATOR = new P5();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public String f65788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public String f65789b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f65790c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f65791d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f65792e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Pair f65793f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f65794g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f65795h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f65796i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f65797j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public EnumC4753ea f65798k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public EnumC4983n9 f65799l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Bundle f65800m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Boolean f65801n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Integer f65802o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Map f65803p;

    public Q5() {
        this("", 0);
    }

    public Q5(@Nullable String str, int i10) {
        this("", str, i10);
    }

    public Q5(@Nullable String str, @Nullable String str2, int i10) {
        this(str, str2, i10, new SystemTimeProvider());
    }

    @VisibleForTesting
    public Q5(@Nullable String str, @Nullable String str2, int i10, @NonNull SystemTimeProvider systemTimeProvider) {
        this.f65798k = EnumC4753ea.UNKNOWN;
        this.f65803p = new HashMap();
        this.f65788a = str2;
        this.f65791d = i10;
        this.f65789b = str;
        this.f65796i = systemTimeProvider.elapsedRealtime();
        this.f65797j = systemTimeProvider.currentTimeMillis();
    }

    public static Pair a(Bundle bundle) {
        if (bundle.containsKey("CounterReport.AppEnvironmentDiffKey") && bundle.containsKey("CounterReport.AppEnvironmentDiffValue")) {
            return new Pair(bundle.getString("CounterReport.AppEnvironmentDiffKey"), bundle.getString("CounterReport.AppEnvironmentDiffValue"));
        }
        return null;
    }

    @NonNull
    public static Q5 a() {
        Q5 q52 = new Q5("", 0);
        EnumC4703cb enumC4703cb = EnumC4703cb.EVENT_TYPE_UNDEFINED;
        q52.f65791d = 16384;
        return q52;
    }

    @NonNull
    public static Q5 a(@NonNull Q5 q52) {
        return a(q52, EnumC4703cb.EVENT_TYPE_ALIVE);
    }

    @NonNull
    public static Q5 a(@NonNull Q5 q52, @NonNull N9 n92) {
        Q5 q5A = a(q52, EnumC4703cb.EVENT_TYPE_START);
        q5A.setValueBytes(MessageNano.toByteArray(new C5058q9().fromModel(new C5033p9((String) n92.f65633b.a()))));
        q5A.f65797j = q52.f65797j;
        q5A.f65796i = q52.f65796i;
        return q5A;
    }

    public static Q5 a(Q5 q52, EnumC4703cb enumC4703cb) {
        Q5 q5D = d(q52);
        q5D.f65791d = enumC4703cb.f66524a;
        return q5D;
    }

    @NonNull
    public static Q5 a(@NonNull Q5 q52, @Nullable String str) {
        Q5 q5D = d(q52);
        EnumC4703cb enumC4703cb = EnumC4703cb.EVENT_TYPE_UNDEFINED;
        q5D.f65791d = 12289;
        q5D.setValue(str);
        return q5D;
    }

    @NonNull
    public static Q5 a(@NonNull Q5 q52, @NonNull Collection<PermissionState> collection, @Nullable C5250y2 c5250y2, @NonNull C4720d2 c4720d2, @NonNull List<String> list) {
        String string;
        String str;
        Q5 q5D = d(q52);
        try {
            JSONArray jSONArray = new JSONArray();
            for (PermissionState permissionState : collection) {
                jSONArray.put(new JSONObject().put("name", permissionState.name).put("granted", permissionState.granted));
            }
            JSONObject jSONObject = new JSONObject();
            if (c5250y2 != null) {
                jSONObject.put("background_restricted", c5250y2.f68003b);
                EnumC5225x2 enumC5225x2 = c5250y2.f68002a;
                c4720d2.getClass();
                if (enumC5225x2 != null) {
                    int iOrdinal = enumC5225x2.ordinal();
                    if (iOrdinal == 0) {
                        str = "EXEMPTED";
                    } else if (iOrdinal == 1) {
                        str = "ACTIVE";
                    } else if (iOrdinal == 2) {
                        str = "WORKING_SET";
                    } else if (iOrdinal == 3) {
                        str = "FREQUENT";
                    } else if (iOrdinal == 4) {
                        str = "RARE";
                    } else if (iOrdinal == 5) {
                        str = "RESTRICTED";
                    }
                    jSONObject.put("app_standby_bucket", str);
                }
                str = null;
                jSONObject.put("app_standby_bucket", str);
            }
            string = new JSONObject().put("permissions", jSONArray).put("background_restrictions", jSONObject).put("available_providers", new JSONArray((Collection) list)).toString();
        } catch (Throwable unused) {
            string = "";
        }
        EnumC4703cb enumC4703cb = EnumC4703cb.EVENT_TYPE_UNDEFINED;
        q5D.f65791d = 12288;
        q5D.setValue(string);
        return q5D;
    }

    @NonNull
    public static Q5 a(@NonNull String str) {
        Q5 q52 = new Q5("", 0);
        EnumC4703cb enumC4703cb = EnumC4703cb.EVENT_TYPE_UNDEFINED;
        q52.f65791d = 12320;
        q52.f65789b = str;
        q52.f65799l = EnumC4983n9.JS;
        return q52;
    }

    @NonNull
    public static Q5 b(@Nullable Bundle bundle) {
        if (bundle != null) {
            try {
                Q5 q52 = (Q5) bundle.getParcelable("CounterReport.Object");
                if (q52 != null) {
                    return q52;
                }
            } catch (Throwable unused) {
                return new Q5("", 0);
            }
        }
        return new Q5("", 0);
    }

    @NonNull
    public static Q5 b(@NonNull Q5 q52) {
        return a(q52, EnumC4703cb.EVENT_TYPE_FIRST_ACTIVATION);
    }

    @NonNull
    public static Q5 c(@NonNull Q5 q52) {
        return a(q52, EnumC4703cb.EVENT_TYPE_INIT);
    }

    @NonNull
    public static Q5 d(@NonNull Q5 q52) {
        Q5 q53 = new Q5("", 0);
        q53.f65797j = q52.f65797j;
        q53.f65796i = q52.f65796i;
        q53.f65793f = q52.f65793f;
        q53.f65790c = q52.f65790c;
        q53.f65800m = q52.f65800m;
        q53.f65803p = q52.f65803p;
        q53.f65795h = q52.f65795h;
        return q53;
    }

    @NonNull
    public static Q5 e(@NonNull Q5 q52) {
        return a(q52, EnumC4703cb.EVENT_TYPE_APP_UPDATE);
    }

    public final void a(long j10) {
        this.f65796i = j10;
    }

    public final void a(@NonNull EnumC4753ea enumC4753ea) {
        this.f65798k = enumC4753ea;
    }

    public final void a(@Nullable EnumC4983n9 enumC4983n9) {
        this.f65799l = enumC4983n9;
    }

    public final void a(@Nullable Boolean bool) {
        this.f65801n = bool;
    }

    public final void a(@Nullable Integer num) {
        this.f65802o = num;
    }

    public final void a(String str, String str2) {
        if (this.f65793f == null) {
            this.f65793f = new Pair(str, str2);
        }
    }

    @Nullable
    public final Pair<String, String> b() {
        return this.f65793f;
    }

    public final void b(long j10) {
        this.f65797j = j10;
    }

    public final void b(@Nullable String str) {
        this.f65790c = str;
    }

    @Nullable
    public final Boolean c() {
        return this.f65801n;
    }

    public final void c(@Nullable Bundle bundle) {
        this.f65800m = bundle;
    }

    public void c(@Nullable String str) {
        this.f65795h = str;
    }

    public final long d() {
        return this.f65796i;
    }

    @NonNull
    public final Bundle d(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putParcelable("CounterReport.Object", this);
        return bundle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final long e() {
        return this.f65797j;
    }

    @Nullable
    public final String f() {
        return this.f65790c;
    }

    @NonNull
    public final EnumC4753ea g() {
        return this.f65798k;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final int getBytesTruncated() {
        return this.f65794g;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final int getCustomType() {
        return this.f65792e;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    @NonNull
    public final Map<String, byte[]> getExtras() {
        return this.f65803p;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    @Nullable
    public final String getName() {
        return this.f65788a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final int getType() {
        return this.f65791d;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    @Nullable
    public final String getValue() {
        return this.f65789b;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    @Nullable
    public final byte[] getValueBytes() {
        String str = this.f65789b;
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    @Nullable
    public final Integer h() {
        return this.f65802o;
    }

    @Nullable
    public final Bundle i() {
        return this.f65800m;
    }

    @Nullable
    public final String j() {
        return this.f65795h;
    }

    @Nullable
    public final EnumC4983n9 k() {
        return this.f65799l;
    }

    public final boolean l() {
        return this.f65788a == null;
    }

    public final boolean m() {
        EnumC4703cb enumC4703cb = EnumC4703cb.EVENT_TYPE_UNDEFINED;
        return -1 == this.f65791d;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setBytesTruncated(int i10) {
        this.f65794g = i10;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setCustomType(int i10) {
        this.f65792e = i10;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setExtras(@NonNull Map<String, byte[]> map) {
        this.f65803p = map;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public void setName(@Nullable String str) {
        this.f65788a = str;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setType(int i10) {
        this.f65791d = i10;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public void setValue(@Nullable String str) {
        this.f65789b = str;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public void setValueBytes(@Nullable byte[] bArr) {
        this.f65789b = bArr == null ? null : new String(Base64.encode(bArr, 0));
    }

    @NonNull
    public final String toString() {
        Locale locale = Locale.US;
        Object[] objArr = new Object[3];
        objArr[0] = this.f65788a;
        objArr[1] = EnumC4703cb.a(this.f65791d).f66525b;
        String strSubstring = this.f65789b;
        if (strSubstring == null) {
            strSubstring = null;
        } else if (strSubstring.length() > 500) {
            strSubstring = strSubstring.substring(0, 500);
        }
        objArr[2] = strSubstring;
        return String.format(locale, "[event: %s, type: %s, value: %s]", objArr);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        Bundle bundle = new Bundle();
        bundle.putString("CounterReport.Event", this.f65788a);
        bundle.putString("CounterReport.Value", this.f65789b);
        bundle.putInt("CounterReport.Type", this.f65791d);
        bundle.putInt("CounterReport.CustomType", this.f65792e);
        bundle.putInt("CounterReport.TRUNCATED", this.f65794g);
        bundle.putString("CounterReport.ProfileID", this.f65795h);
        bundle.putInt("CounterReport.UniquenessStatus", this.f65798k.f66681a);
        Bundle bundle2 = this.f65800m;
        if (bundle2 != null) {
            bundle.putParcelable("CounterReport.Payload", bundle2);
        }
        String str = this.f65790c;
        if (str != null) {
            bundle.putString("CounterReport.Environment", str);
        }
        Pair pair = this.f65793f;
        if (pair != null) {
            bundle.putString("CounterReport.AppEnvironmentDiffKey", (String) pair.first);
            bundle.putString("CounterReport.AppEnvironmentDiffValue", (String) pair.second);
        }
        bundle.putLong("CounterReport.CreationElapsedRealtime", this.f65796i);
        bundle.putLong("CounterReport.CreationTimestamp", this.f65797j);
        EnumC4983n9 enumC4983n9 = this.f65799l;
        if (enumC4983n9 != null) {
            bundle.putInt("CounterReport.Source", enumC4983n9.f67355a);
        }
        Boolean bool = this.f65801n;
        if (bool != null) {
            bundle.putBoolean("CounterReport.AttributionIdChanged", bool.booleanValue());
        }
        Integer num = this.f65802o;
        if (num != null) {
            bundle.putInt("CounterReport.OpenId", num.intValue());
        }
        bundle.putBundle("CounterReport.Extras", CollectionUtils.mapToBundle(this.f65803p));
        parcel.writeBundle(bundle);
    }
}
