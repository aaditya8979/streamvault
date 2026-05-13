package com.mbridge.msdk.foundation.controller.authoritycontroller;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.e;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.out.OnCompletionListener;
import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.setting.h;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: BaseSDKAuthorityController.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static boolean f37381h = true;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static boolean f37382i = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AuthorityInfoBean f37384b;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private e f37389g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList<String> f37383a = new ArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f37385c = 3;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f37386d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f37387e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f37388f = "";

    /* JADX INFO: compiled from: BaseSDKAuthorityController.java */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f37390a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ OnCompletionListener f37391b;

        public a(Context context, OnCompletionListener onCompletionListener) {
            this.f37390a = context;
            this.f37391b = onCompletionListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.a(this.f37390a);
            this.f37391b.onCompletion();
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.controller.authoritycontroller.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: BaseSDKAuthorityController.java */
    public class C0438b implements e.a {
        public C0438b() {
        }

        @Override // com.mbridge.msdk.foundation.controller.e.a
        public void a() {
            b.this.k();
        }
    }

    public b() {
        h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context) {
        try {
            if (this.f37389g == null) {
                e eVar = new e(context);
                this.f37389g = eVar;
                eVar.a(new C0438b());
            }
            k();
        } catch (Throwable th2) {
            q0.b("SDKAuthorityController", th2.getMessage());
        }
    }

    public static void a(boolean z10) {
        f37381h = z10;
    }

    private void b(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f37388f = str;
    }

    public static void b(boolean z10) {
        f37382i = z10;
    }

    private void d(int i10) {
        this.f37385c = i10 != 1 ? 2 : 1;
    }

    public static boolean i() {
        return f37381h;
    }

    public static boolean j() {
        return f37382i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void k() {
        boolean zC = this.f37389g.c();
        b(this.f37389g.b());
        d(zC ? 1 : 2);
        this.f37384b.authDeviceIdStatus(zC ? 1 : 0);
    }

    public abstract int a(g gVar, String str);

    public int a(String str) {
        AuthorityInfoBean authorityInfoBean;
        try {
            if (TextUtils.isEmpty(str) || (authorityInfoBean = this.f37384b) == null) {
                return 0;
            }
            return authorityInfoBean.getStatusByKey(str);
        } catch (Exception e10) {
            q0.b("SDKAuthorityController", e10.getMessage());
            return 0;
        }
    }

    public AuthorityInfoBean a() {
        AuthorityInfoBean authorityInfoBean = this.f37384b;
        if (authorityInfoBean != null) {
            return authorityInfoBean;
        }
        AuthorityInfoBean authorityInfoBean2 = new AuthorityInfoBean();
        authorityInfoBean2.a(1);
        return authorityInfoBean2;
    }

    public void a(int i10) {
        this.f37385c = i10 != 1 ? 2 : 1;
        if (this.f37384b != null) {
            d(i10);
        }
    }

    public void a(Context context, OnCompletionListener onCompletionListener) {
        if (onCompletionListener != null) {
            com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new a(context, onCompletionListener));
        } else {
            a(context);
        }
    }

    public void a(String str, int i10) {
        if (TextUtils.isEmpty(str) || this.f37384b == null) {
            return;
        }
        str.hashCode();
        switch (str) {
            case "authority_serial_id":
                this.f37384b.authSerialIdStatus(i10);
                break;
            case "authority_all_info":
                this.f37384b.a(i10);
                break;
            case "authority_device_id":
                this.f37384b.authDeviceIdStatus(i10);
                break;
            case "authority_general_data":
                this.f37384b.authGenDataStatus(i10);
                break;
            case "authority_other":
                this.f37384b.authOtherDataStatus(i10);
                break;
        }
    }

    public void b(int i10) {
        this.f37386d = i10;
    }

    public boolean b() {
        int i10 = this.f37385c;
        return i10 == 1 || i10 == 3;
    }

    public int c() {
        return this.f37386d;
    }

    public void c(int i10) {
        this.f37387e = i10;
    }

    public int d() {
        return this.f37387e;
    }

    public int e() {
        return this.f37385c;
    }

    public String f() {
        return this.f37388f;
    }

    public String g() {
        JSONArray jSONArray = new JSONArray();
        g gVarC = h.b().c();
        for (int i10 = 0; i10 < this.f37383a.size(); i10++) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("keyname", String.valueOf(this.f37383a.get(i10)));
                jSONObject.put("client_status", a(this.f37383a.get(i10)));
                jSONObject.put("server_status", a(gVarC, this.f37383a.get(i10)));
                jSONArray.put(jSONObject);
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
        }
        return jSONArray.toString();
    }

    public void h() {
        AuthorityInfoBean authorityInfoBean = new AuthorityInfoBean();
        this.f37384b = authorityInfoBean;
        try {
            authorityInfoBean.authGenDataStatus(1);
            this.f37384b.authDeviceIdStatus(1);
            this.f37384b.authSerialIdStatus(1);
            this.f37384b.authOtherDataStatus(1);
            this.f37383a.add(MBridgeConstans.AUTHORITY_GENERAL_DATA);
            this.f37383a.add(MBridgeConstans.AUTHORITY_DEVICE_ID);
            this.f37383a.add(MBridgeConstans.AUTHORITY_SERIAL_ID);
            this.f37383a.add(MBridgeConstans.AUTHORITY_OTHER);
        } catch (Exception e10) {
            q0.b("SDKAuthorityController", e10.getMessage());
        }
    }
}
