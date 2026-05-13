package com.mbridge.msdk.tracker;

import java.io.Serializable;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: compiled from: Event.java */
/* JADX INFO: loaded from: classes9.dex */
public class e implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f40907a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private JSONObject f40910d;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private h f40915i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f40908b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f40909c = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f40913g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f40914h = 604800000;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f40916j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f40917k = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f40912f = System.currentTimeMillis();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f40911e = UUID.randomUUID().toString();

    public e(String str) {
        this.f40907a = str;
    }

    public void a(int i10) {
        this.f40909c = i10;
    }

    public void a(long j10) {
        this.f40913g = j10;
    }

    public void a(h hVar) {
        this.f40915i = hVar;
    }

    public void a(String str) {
        this.f40911e = str;
    }

    public void a(JSONObject jSONObject) {
        this.f40910d = jSONObject;
    }

    public void a(boolean z10) {
        this.f40917k = z10;
    }

    public void b(int i10) {
        this.f40908b = i10;
    }

    public void b(long j10) {
        this.f40914h = j10;
    }

    public void c(long j10) {
        this.f40912f = j10;
    }

    public long d() {
        return this.f40913g;
    }

    public String g() {
        return this.f40907a;
    }

    public int h() {
        return this.f40909c;
    }

    public JSONObject i() {
        JSONObject jSONObject = this.f40910d;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObject2 = new JSONObject();
        this.f40910d = jSONObject2;
        return jSONObject2;
    }

    public h j() {
        return this.f40915i;
    }

    public long k() {
        return this.f40914h;
    }

    public long l() {
        return this.f40912f;
    }

    public int m() {
        return this.f40908b;
    }

    public String n() {
        return this.f40911e;
    }

    public boolean o() {
        return this.f40917k;
    }

    public boolean p() {
        return this.f40916j;
    }
}
