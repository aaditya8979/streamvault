package com.ironsource;

import com.ironsource.C3978d4;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C4308w implements Cif<JSONObject>, InterfaceC4043gf<C4274u> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Map<String, H0> f34296a = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f34297b;

    /* JADX INFO: renamed from: com.ironsource.w$a */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f34298a;

        static {
            int[] iArr = new int[EnumC4025ff.values().length];
            try {
                iArr[EnumC4025ff.LoadRequest.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC4025ff.LoadSuccess.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC4025ff.ShowSuccess.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC4025ff.ShowFailed.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC4025ff.Destroyed.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f34298a = iArr;
        }
    }

    private final void b(C4274u c4274u) {
        int i10;
        int i11 = a.f34298a[c4274u.f().ordinal()];
        if (i11 == 2) {
            this.f34297b++;
        } else if ((i11 == 3 || i11 == 4 || i11 == 5) && (i10 = this.f34297b) > 0) {
            this.f34297b = i10 - 1;
        }
    }

    public final int a() {
        return this.f34297b;
    }

    @Override // com.ironsource.InterfaceC4043gf
    public void a(@NotNull C4274u c4274u) {
        tn.p.k(c4274u, "record");
        String strC = c4274u.c();
        Map<String, H0> map = this.f34296a;
        H0 h02 = map.get(strC);
        if (h02 == null) {
            h02 = new H0();
            map.put(strC, h02);
        }
        h02.a(c4274u.a(new C4291v()));
        b(c4274u);
    }

    @Override // com.ironsource.InterfaceC4053h7
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject a(@NotNull EnumC4061hf enumC4061hf) throws JSONException {
        tn.p.k(enumC4061hf, C3978d4.a.f31224t);
        JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
        for (Map.Entry<String, H0> entry : this.f34296a.entrySet()) {
            String key = entry.getKey();
            JSONObject jSONObjectA = entry.getValue().a(enumC4061hf);
            if (jSONObjectA.length() > 0) {
                jSONObjectJsonObjectInit.put(key, jSONObjectA);
            }
        }
        return jSONObjectJsonObjectInit;
    }

    public final boolean b() {
        return !this.f34296a.isEmpty();
    }
}
