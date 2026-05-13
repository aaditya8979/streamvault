package com.ironsource;

import android.text.TextUtils;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.ArrayList;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.ag, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C3936ag {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private NetworkSettings f30994b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ArrayList<String> f30993a = new ArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private JSONObject f30995c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f30996d = true;

    public static C3936ag a() {
        return new C3936ag();
    }

    public void a(NetworkSettings networkSettings) {
        this.f30994b = networkSettings;
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f30993a.add(str);
    }

    public void a(JSONObject jSONObject) {
        this.f30995c = jSONObject;
    }

    public void a(boolean z10) {
        this.f30996d = z10;
    }

    public JSONObject b() {
        return this.f30995c;
    }

    @Nullable
    public NetworkSettings c() {
        return this.f30994b;
    }

    public ArrayList<String> d() {
        return this.f30993a;
    }

    public boolean e() {
        return this.f30996d;
    }
}
