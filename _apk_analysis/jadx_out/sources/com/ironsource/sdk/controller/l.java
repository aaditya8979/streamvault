package com.ironsource.sdk.controller;

import android.app.Activity;
import android.content.Context;
import com.ironsource.C4266t8;
import com.ironsource.InterfaceC4313w4;
import com.ironsource.InterfaceC4330x4;
import com.ironsource.InterfaceC4347y4;
import com.ironsource.Nb;
import com.ironsource.Y4;
import com.ironsource.sdk.controller.f;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public interface l {

    public interface a {
        void a(@NotNull f.a aVar);
    }

    public interface b {
        void a(@NotNull Nb nb2);
    }

    void a();

    void a(Activity activity);

    void a(Context context);

    void a(Y4 y42);

    void a(Y4 y42, Map<String, String> map, InterfaceC4313w4 interfaceC4313w4);

    void a(Y4 y42, Map<String, String> map, InterfaceC4330x4 interfaceC4330x4);

    void a(f.c cVar, @Nullable a aVar);

    void a(String str, InterfaceC4330x4 interfaceC4330x4);

    void a(String str, String str2, Y4 y42, InterfaceC4313w4 interfaceC4313w4);

    void a(String str, String str2, Y4 y42, InterfaceC4330x4 interfaceC4330x4);

    void a(String str, String str2, Y4 y42, InterfaceC4347y4 interfaceC4347y4);

    void a(JSONObject jSONObject);

    void a(JSONObject jSONObject, InterfaceC4313w4 interfaceC4313w4);

    void a(JSONObject jSONObject, InterfaceC4330x4 interfaceC4330x4);

    void a(JSONObject jSONObject, InterfaceC4347y4 interfaceC4347y4);

    boolean a(String str);

    void b();

    void b(Context context);

    void b(Y4 y42);

    void b(Y4 y42, Map<String, String> map, InterfaceC4330x4 interfaceC4330x4);

    void b(JSONObject jSONObject);

    void e();

    @Deprecated
    void f();

    void g();

    C4266t8.c h();
}
