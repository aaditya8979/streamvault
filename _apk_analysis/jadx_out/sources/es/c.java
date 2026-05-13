package es;

import org.fourthline.cling.support.model.RecordMediumWriteStatus;
import org.fourthline.cling.support.model.StorageMedium;

/* JADX INFO: compiled from: MediaInfo.java */
/* JADX INFO: loaded from: classes6.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f61341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f61342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f61343c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f61344d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public org.fourthline.cling.model.types.b f61345e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f61346f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public StorageMedium f61347g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public StorageMedium f61348h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public RecordMediumWriteStatus f61349i;

    public c() {
        this.f61341a = "";
        this.f61342b = "";
        this.f61343c = "NOT_IMPLEMENTED";
        this.f61344d = "NOT_IMPLEMENTED";
        this.f61345e = new org.fourthline.cling.model.types.b(0L);
        this.f61346f = "00:00:00";
        this.f61347g = StorageMedium.NONE;
        this.f61348h = StorageMedium.NOT_IMPLEMENTED;
        this.f61349i = RecordMediumWriteStatus.NOT_IMPLEMENTED;
    }

    public c(String str, String str2) {
        this.f61341a = "";
        this.f61342b = "";
        this.f61343c = "NOT_IMPLEMENTED";
        this.f61344d = "NOT_IMPLEMENTED";
        this.f61345e = new org.fourthline.cling.model.types.b(0L);
        this.f61346f = "00:00:00";
        this.f61347g = StorageMedium.NONE;
        this.f61348h = StorageMedium.NOT_IMPLEMENTED;
        this.f61349i = RecordMediumWriteStatus.NOT_IMPLEMENTED;
        this.f61341a = str;
        this.f61342b = str2;
    }

    public String a() {
        return this.f61341a;
    }

    public String b() {
        return this.f61342b;
    }

    public String c() {
        return this.f61346f;
    }

    public String d() {
        return this.f61343c;
    }

    public String e() {
        return this.f61344d;
    }

    public org.fourthline.cling.model.types.b f() {
        return this.f61345e;
    }

    public StorageMedium g() {
        return this.f61348h;
    }

    public RecordMediumWriteStatus h() {
        return this.f61349i;
    }
}
