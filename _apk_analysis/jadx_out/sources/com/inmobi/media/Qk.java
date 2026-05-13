package com.inmobi.media;

import androidx.core.graphics.drawable.IconCompat;
import com.inmobi.unifiedId.InMobiUserDataModel;
import com.inmobi.unifiedId.InMobiUserDataTypes;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final class Qk extends AbstractC3829w9 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ak f26202b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f26203c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f26204d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f26205e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f26206f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Qk(String str, Ak ak2, String str2, int i10, int i11, int i12) {
        super(str);
        tn.p.k(str, "url");
        tn.p.k(ak2, "uidMap");
        this.f26202b = ak2;
        this.f26203c = str2;
        this.f26204d = i10;
        this.f26205e = i11;
        this.f26206f = i12;
    }

    public final Le a() {
        String string;
        InMobiUserDataTypes emailId;
        InMobiUserDataTypes phoneNumber;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Objects.toString(C3274a7.f26760a);
        String str = (String) Tg.a().get("u-age");
        if (str != null) {
        }
        String string2 = Ok.b().toString();
        tn.p.j(string2, "toString(...)");
        linkedHashMap.put("ufids", string2);
        C3746t1 c3746t1 = AbstractC3915zk.f28663a;
        Boolean bool = c3746t1 != null ? c3746t1.f28163c : null;
        if (bool == null || (string = bool.toString()) == null) {
            string = "true";
        }
        linkedHashMap.put(com.ironsource.Q6.f30262s, string);
        linkedHashMap.put("mk-version", Ki.a());
        String str2 = A1.f25129a;
        if (str2 != null) {
        }
        linkedHashMap.put(com.ironsource.Q6.f30218d0, Ji.c());
        linkedHashMap.put("ts", String.valueOf(System.currentTimeMillis()));
        String str3 = this.f26203c;
        if (str3 != null) {
        }
        InMobiUserDataModel inMobiUserDataModel = C3274a7.f26761b;
        if (inMobiUserDataModel == null || (emailId = inMobiUserDataModel.getEmailId()) == null || (emailId.getMd5() == null && emailId.getSha1() == null && emailId.getSha256() == null)) {
            emailId = null;
        }
        if (emailId != null) {
            tn.p.k(emailId, IconCompat.EXTRA_OBJ);
        }
        InMobiUserDataModel inMobiUserDataModel2 = C3274a7.f26761b;
        if (inMobiUserDataModel2 == null || (phoneNumber = inMobiUserDataModel2.getPhoneNumber()) == null || (phoneNumber.getMd5() == null && phoneNumber.getSha1() == null && phoneNumber.getSha256() == null)) {
            phoneNumber = null;
        }
        if (phoneNumber != null) {
            tn.p.k(phoneNumber, IconCompat.EXTRA_OBJ);
        }
        InMobiUserDataModel inMobiUserDataModel3 = C3274a7.f26761b;
        HashMap<String, String> extras = inMobiUserDataModel3 != null ? inMobiUserDataModel3.getExtras() : null;
        if (extras != null) {
            linkedHashMap.putAll(extras);
        }
        linkedHashMap.putAll(this.f26202b.a());
        tn.p.k(linkedHashMap, "<this>");
        linkedHashMap.putAll(A1.f25133e);
        linkedHashMap.putAll(C3850x5.f28483a.a(false));
        linkedHashMap.putAll(AbstractC3903z8.a());
        tn.p.k(linkedHashMap, "<this>");
        JSONObject jSONObjectB = W6.b();
        if (jSONObjectB != null) {
            String string3 = jSONObjectB.toString();
            tn.p.j(string3, "toString(...)");
            linkedHashMap.put("consentObject", string3);
        }
        String str4 = this.f28424a;
        Y6 y62 = new Y6(linkedHashMap);
        int i10 = this.f26204d;
        int i11 = this.f26205e;
        zn.i iVar = Se.f26314a;
        Ai ai2 = new Ai(i10, i11 * 1000, 0);
        long j10 = this.f26206f * 1000;
        return new Le(str4, null, new C3666pk(j10, j10, j10), y62, ai2, 32);
    }
}
