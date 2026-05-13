package sg.bigo.ads.common.u.b;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.G5;
import java.io.UnsupportedEncodingException;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.common.u.a;
import sg.bigo.ads.common.u.f;
import sg.bigo.ads.common.utils.k;

/* JADX INFO: loaded from: classes12.dex */
public class b<T extends sg.bigo.ads.common.u.a> extends c<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f82423a = f.a("text/plain;charset=utf-8");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public JSONObject f82424b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f82425c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public f f82426d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f82427e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f82428f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f82429g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f82430h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f82431i;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f82432p;

    public b(int i10, @NonNull T t10, Context context) {
        super(i10, t10, true, context);
        this.f82431i = -1;
    }

    @Override // sg.bigo.ads.common.u.b.c
    @NonNull
    public final String a() {
        return "POST";
    }

    public final void a(Map<String, Object> map) {
        if (this.f82424b == null || k.a(map)) {
            return;
        }
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            try {
                this.f82424b.putOpt(entry.getKey(), entry.getValue());
            } catch (JSONException unused) {
            }
        }
        this.f82425c = null;
    }

    @Override // sg.bigo.ads.common.u.b.c
    @Nullable
    public final f b() {
        f fVar = this.f82426d;
        return fVar != null ? fVar : f82423a;
    }

    @Override // sg.bigo.ads.common.u.b.c
    @Nullable
    public final byte[] c() {
        JSONObject jSONObject;
        if (this.f82425c == null && (jSONObject = this.f82424b) != null) {
            String string = jSONObject.toString();
            this.f82432p = string;
            try {
                if (this.f82427e) {
                    String strA = sg.bigo.ads.common.j.a.a(string, "FEFFFFFFFFFAFFFDCBFFFFFFFFFFFF4F");
                    if (TextUtils.isEmpty(strA)) {
                        this.f82428f = false;
                    } else {
                        this.f82428f = true;
                        this.f82432p = strA;
                        a("enc", "1");
                    }
                }
            } catch (Exception unused) {
                this.f82428f = false;
            }
            try {
                this.f82425c = this.f82432p.getBytes(G5.N);
            } catch (UnsupportedEncodingException unused2) {
            }
        }
        return this.f82425c;
    }

    @Override // sg.bigo.ads.common.u.b.c
    @Nullable
    public final String d() {
        return e() >= 0 ? this.f82432p : "content is null.";
    }

    @Override // sg.bigo.ads.common.u.b.c
    public final int e() {
        int i10 = this.f82431i;
        if (i10 > 0) {
            return i10;
        }
        byte[] bArrC = c();
        return bArrC != null ? bArrC.length : super.e();
    }

    @Override // sg.bigo.ads.common.u.b.c
    public final boolean f() {
        return this.f82428f;
    }
}
