package qr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;
import org.fourthline.cling.model.types.Datatype;

/* JADX INFO: compiled from: StateVariableTypeDetails.java */
/* JADX INFO: loaded from: classes3.dex */
public class p {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Logger f78484e = Logger.getLogger(p.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Datatype f78485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f78486b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String[] f78487c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n f78488d;

    public p(Datatype datatype) {
        this(datatype, null, null, null);
    }

    public p(Datatype datatype, String str, String[] strArr, n nVar) {
        this.f78485a = datatype;
        this.f78486b = str;
        this.f78487c = strArr;
        this.f78488d = nVar;
    }

    public boolean a(String str, String[] strArr) {
        if (str == null || strArr == null) {
            return true;
        }
        for (String str2 : strArr) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public n b() {
        return this.f78488d;
    }

    public String[] c() {
        if (a(this.f78486b, this.f78487c)) {
            return this.f78487c;
        }
        ArrayList arrayList = new ArrayList(Arrays.asList(this.f78487c));
        arrayList.add(e());
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public Datatype d() {
        return this.f78485a;
    }

    public String e() {
        return this.f78486b;
    }

    public List<ir.k> f() {
        ArrayList arrayList = new ArrayList();
        if (d() == null) {
            arrayList.add(new ir.k(getClass(), "datatype", "Service state variable has no datatype"));
        }
        if (c() != null) {
            if (b() != null) {
                arrayList.add(new ir.k(getClass(), "allowedValues", "Allowed value list of state variable can not also be restricted with allowed value range"));
            }
            if (!Datatype.Builtin.STRING.equals(d().b())) {
                arrayList.add(new ir.k(getClass(), "allowedValues", "Allowed value list of state variable only available for string datatype, not: " + d()));
            }
            for (String str : c()) {
                if (str.length() > 31) {
                    f78484e.warning("UPnP specification violation, allowed value string must be less than 32 chars: " + str);
                }
            }
            if (!a(this.f78486b, this.f78487c)) {
                f78484e.warning("UPnP specification violation, allowed string values don't contain default value: " + this.f78486b);
            }
        }
        if (b() != null) {
            arrayList.addAll(b().e());
        }
        return arrayList;
    }
}
