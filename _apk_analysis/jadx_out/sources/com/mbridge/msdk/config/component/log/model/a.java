package com.mbridge.msdk.config.component.log.model;

import java.util.Map;

/* JADX INFO: compiled from: LogSenderModel.java */
/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f36218a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f36219b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f36220c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f36221d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f36222e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f36223f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f36224g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Map<String, Object> f36225h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Map<String, Object> f36226i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Map<String, Object> f36227j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f36228k;

    public int a() {
        return this.f36218a;
    }

    public void a(Map<String, Object> map) {
        if (map != null) {
            if (map.containsKey("size")) {
                this.f36218a = ((Integer) map.get("size")).intValue();
            }
            if (map.containsKey("timeout")) {
                this.f36219b = ((Integer) map.get("timeout")).intValue();
            }
            if (map.containsKey("report_on_network_changed")) {
                this.f36220c = ((Integer) map.get("report_on_network_changed")).intValue();
            }
            if (map.containsKey("report_on_succeed")) {
                this.f36221d = ((Integer) map.get("report_on_succeed")).intValue();
            }
            if (map.containsKey("retry")) {
                this.f36222e = ((Integer) map.get("retry")).intValue();
            }
            if (map.containsKey("max_count")) {
                this.f36223f = ((Integer) map.get("max_count")).intValue();
            }
            if (map.containsKey("ttl")) {
                this.f36224g = ((Integer) map.get("ttl")).intValue();
            }
            if (map.containsKey("http_config")) {
                this.f36225h = (Map) map.get("http_config");
            }
            if (map.containsKey("tcp_config")) {
                this.f36226i = (Map) map.get("tcp_config");
            }
            if (map.containsKey("shared_info")) {
                this.f36227j = (Map) map.get("shared_info");
            }
            this.f36228k = map.containsKey("trigger_report") ? ((Integer) map.get("trigger_report")).intValue() : 0;
        }
    }

    public int b() {
        return this.f36219b;
    }

    public String c() {
        Map<String, Object> map = this.f36225h;
        return (map == null || !map.containsKey("url")) ? "" : (String) this.f36225h.get("url");
    }

    public int d() {
        return this.f36223f;
    }

    public int e() {
        return this.f36228k;
    }

    public int f() {
        Map<String, Object> map = this.f36225h;
        return (map == null || map.isEmpty()) ? 1 : 0;
    }

    public int g() {
        return this.f36222e;
    }

    public Map<String, Object> h() {
        return this.f36227j;
    }

    public String i() {
        Map<String, Object> map = this.f36226i;
        return (map == null || !map.containsKey("host")) ? "" : (String) this.f36226i.get("host");
    }

    public int j() {
        Map<String, Object> map = this.f36226i;
        if (map == null || !map.containsKey("port")) {
            return 0;
        }
        return ((Integer) this.f36226i.get("port")).intValue();
    }

    public int k() {
        return this.f36224g;
    }
}
