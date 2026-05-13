package com.ironsource;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronLog;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.a1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
@Deprecated
public class C3921a1 implements Parcelable {
    public static final Parcelable.Creator<C3921a1> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f30862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f30863b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f30864c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f30865d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f30866e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ArrayList<String> f30867f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ArrayList<String> f30868g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ArrayList<String> f30869h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ArrayList<String> f30870i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f30871j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f30872k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Map<String, String> f30873l;

    /* JADX INFO: renamed from: com.ironsource.a1$a */
    public class a implements Parcelable.Creator<C3921a1> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C3921a1 createFromParcel(Parcel parcel) {
            return new C3921a1(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C3921a1[] newArray(int i10) {
            return new C3921a1[i10];
        }
    }

    public C3921a1() {
        i();
    }

    private C3921a1(Parcel parcel) {
        i();
        try {
            this.f30865d = parcel.readByte() != 0;
            this.f30866e = parcel.readInt();
            this.f30862a = parcel.readString();
            this.f30863b = parcel.readString();
            this.f30864c = parcel.readString();
            this.f30871j = parcel.readString();
            this.f30872k = parcel.readString();
            this.f30873l = a(parcel.readString());
        } catch (Throwable th2) {
            C4228r4.d().a(th2);
            i();
        }
    }

    private Map<String, String> a(String str) {
        HashMap map = new HashMap();
        try {
            JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit(str);
            Iterator<String> itKeys = jSONObjectJsonObjectInit.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObjectJsonObjectInit.getString(next));
            }
        } catch (JSONException e10) {
            C4228r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        } catch (Throwable th2) {
            C4228r4.d().a(th2);
            IronLog.INTERNAL.error(th2.toString());
        }
        return map;
    }

    private void i() {
        this.f30865d = false;
        this.f30866e = -1;
        this.f30867f = new ArrayList<>();
        this.f30868g = new ArrayList<>();
        this.f30869h = new ArrayList<>();
        this.f30870i = new ArrayList<>();
        this.f30872k = "";
        this.f30871j = "";
        this.f30873l = new HashMap();
    }

    public void a() {
        this.f30866e = -1;
    }

    public void a(int i10) {
        this.f30866e = i10;
    }

    public void a(String str, boolean z10) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (!z10) {
            this.f30868g.remove(str);
        } else if (this.f30868g.indexOf(str) == -1) {
            this.f30868g.add(str);
        }
    }

    public void a(Map<String, String> map) {
        this.f30873l = map;
    }

    public void a(boolean z10) {
        this.f30865d = z10;
    }

    public String b() {
        return this.f30864c;
    }

    public void b(String str, boolean z10) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (!z10) {
            this.f30870i.remove(str);
        } else if (this.f30870i.indexOf(str) == -1) {
            this.f30870i.add(str);
        }
    }

    public boolean b(String str) {
        return !TextUtils.isEmpty(str) && this.f30868g.indexOf(str) > -1;
    }

    public int c() {
        return this.f30866e;
    }

    public void c(String str, boolean z10) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (!z10) {
            this.f30867f.remove(str);
        } else if (this.f30867f.indexOf(str) == -1) {
            this.f30867f.add(str);
        }
    }

    public boolean c(String str) {
        return !TextUtils.isEmpty(str) && this.f30870i.indexOf(str) > -1;
    }

    public String d() {
        return this.f30871j;
    }

    public void d(String str, boolean z10) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (!z10) {
            this.f30869h.remove(str);
        } else if (this.f30869h.indexOf(str) == -1) {
            this.f30869h.add(str);
        }
    }

    public boolean d(String str) {
        return !TextUtils.isEmpty(str) && this.f30867f.indexOf(str) > -1;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Map<String, String> e() {
        return this.f30873l;
    }

    public boolean e(String str) {
        return !TextUtils.isEmpty(str) && this.f30869h.indexOf(str) > -1;
    }

    public String f() {
        return this.f30872k;
    }

    public void f(String str) {
        this.f30864c = str;
    }

    public String g() {
        return this.f30862a;
    }

    public void g(String str) {
        this.f30871j = str;
    }

    public String h() {
        return this.f30863b;
    }

    public void h(String str) {
        this.f30872k = str;
    }

    public void i(String str) {
        this.f30862a = str;
    }

    public void j(String str) {
        this.f30863b = str;
    }

    public boolean j() {
        return this.f30865d;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        try {
            sb2.append("shouldRestore:");
            sb2.append(this.f30865d);
            sb2.append(", ");
            sb2.append("displayedProduct:");
            sb2.append(this.f30866e);
            sb2.append(", ");
            sb2.append("ISReportInit:");
            sb2.append(this.f30867f);
            sb2.append(", ");
            sb2.append("ISInitSuccess:");
            sb2.append(this.f30868g);
            sb2.append(", ");
            sb2.append("ISAppKey");
            sb2.append(this.f30871j);
            sb2.append(", ");
            sb2.append("ISUserId");
            sb2.append(this.f30872k);
            sb2.append(", ");
            sb2.append("ISExtraParams");
            sb2.append(this.f30873l);
            sb2.append(", ");
        } catch (Throwable th2) {
            C4228r4.d().a(th2);
        }
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        try {
            parcel.writeByte(this.f30865d ? (byte) 1 : (byte) 0);
            parcel.writeInt(this.f30866e);
            parcel.writeString(this.f30862a);
            parcel.writeString(this.f30863b);
            parcel.writeString(this.f30864c);
            parcel.writeString(this.f30871j);
            parcel.writeString(this.f30872k);
            parcel.writeString(new JSONObject(this.f30873l).toString());
        } catch (Throwable th2) {
            C4228r4.d().a(th2);
        }
    }
}
