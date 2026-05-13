package es;

import java.util.ArrayList;
import java.util.List;
import org.fourthline.cling.support.model.WriteStatus;

/* JADX INFO: compiled from: DIDLObject.java */
/* JADX INFO: loaded from: classes6.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f61327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f61328b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f61329c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f61330d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f61331e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public WriteStatus f61332f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public C0757a f61333g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public List<e> f61334h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public List<Object> f61335i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public List<Object> f61336j;

    /* JADX INFO: renamed from: es.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: DIDLObject.java */
    public static class C0757a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f61337a;

        public C0757a(String str) {
            this.f61337a = str;
        }

        public String a() {
            return this.f61337a;
        }
    }

    public a() {
        this.f61331e = true;
        this.f61334h = new ArrayList();
        this.f61335i = new ArrayList();
        this.f61336j = new ArrayList();
    }

    public a(String str, String str2, String str3, String str4, boolean z10, WriteStatus writeStatus, C0757a c0757a, List<e> list, List<Object> list2, List<Object> list3) {
        this.f61331e = true;
        this.f61334h = new ArrayList();
        this.f61335i = new ArrayList();
        new ArrayList();
        this.f61327a = str;
        this.f61328b = str2;
        this.f61329c = str3;
        this.f61330d = str4;
        this.f61331e = z10;
        this.f61332f = writeStatus;
        this.f61333g = c0757a;
        this.f61334h = list;
        this.f61335i = list2;
        this.f61336j = list3;
    }

    public C0757a a() {
        return this.f61333g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.f61327a.equals(((a) obj).f61327a);
    }

    public List<e> getResources() {
        return this.f61334h;
    }

    public int hashCode() {
        return this.f61327a.hashCode();
    }
}
